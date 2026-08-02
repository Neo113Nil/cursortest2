package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransaction;
import io.sentry.ITransactionProfiler;
import io.sentry.PerformanceCollectionData;
import io.sentry.ProfilingTraceData;
import io.sentry.ProfilingTransactionData;
import io.sentry.ScopesAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidProfiler;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class AndroidTransactionProfiler implements ITransactionProfiler {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private ProfilingTransactionData currentProfilingTransactionData;
    private final ISentryExecutorService executorService;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private boolean isInitialized;
    private final boolean isProfilingEnabled;
    private final AutoClosableReentrantLock lock;
    private final ILogger logger;
    private long profileStartCpuMillis;
    private long profileStartNanos;
    private Date profileStartTimestamp;
    private AndroidProfiler profiler;
    private final String profilingTracesDirPath;
    private final int profilingTracesHz;
    private int transactionsCounter;

    public AndroidTransactionProfiler(Context context, SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void init() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        if (!this.isProfilingEnabled) {
            this.logger.log(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.profilingTracesDirPath;
        if (str == null) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i7 = this.profilingTracesHz;
        if (i7 <= 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i7));
        } else {
            this.profiler = new AndroidProfiler(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz, this.frameMetricsCollector, this.executorService, this.logger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$onTransactionFinish$0() {
        return CpuInfoUtils.getInstance().readMaxFrequencies();
    }

    private boolean onFirstStart() {
        AndroidProfiler.ProfileStartData start;
        AndroidProfiler androidProfiler = this.profiler;
        if (androidProfiler == null || (start = androidProfiler.start()) == null) {
            return false;
        }
        this.profileStartNanos = start.startNanos;
        this.profileStartCpuMillis = start.startCpuMillis;
        this.profileStartTimestamp = start.startTimestamp;
        return true;
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(ITransaction iTransaction) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (this.transactionsCounter > 0 && this.currentProfilingTransactionData == null) {
                this.currentProfilingTransactionData = new ProfilingTransactionData(iTransaction, Long.valueOf(this.profileStartNanos), Long.valueOf(this.profileStartCpuMillis));
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public void close() {
        ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
        if (profilingTransactionData != null) {
            onTransactionFinish(profilingTransactionData.getName(), this.currentProfilingTransactionData.getId(), this.currentProfilingTransactionData.getTraceId(), true, null, ScopesAdapter.getInstance().getOptions());
        } else {
            int i7 = this.transactionsCounter;
            if (i7 != 0) {
                this.transactionsCounter = i7 - 1;
            }
        }
        AndroidProfiler androidProfiler = this.profiler;
        if (androidProfiler != null) {
            androidProfiler.close();
        }
    }

    public int getTransactionsCounter() {
        return this.transactionsCounter;
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return this.transactionsCounter != 0;
    }

    @Override // io.sentry.ITransactionProfiler
    public ProfilingTraceData onTransactionFinish(ITransaction iTransaction, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            ProfilingTraceData onTransactionFinish = onTransactionFinish(iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), false, list, sentryOptions);
            if (acquire != null) {
                acquire.close();
            }
            return onTransactionFinish;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (this.buildInfoProvider.getSdkInfoVersion() < 22) {
                if (acquire != null) {
                    acquire.close();
                    return;
                }
                return;
            }
            init();
            int i7 = this.transactionsCounter + 1;
            this.transactionsCounter = i7;
            if (i7 == 1 && onFirstStart()) {
                this.logger.log(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.transactionsCounter--;
                this.logger.log(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public AndroidTransactionProfiler(Context context, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector, ILogger iLogger, String str, boolean z4, int i7, ISentryExecutorService iSentryExecutorService) {
        this.isInitialized = false;
        this.transactionsCounter = 0;
        this.profiler = null;
        this.lock = new AutoClosableReentrantLock();
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required");
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.profilingTracesDirPath = str;
        this.isProfilingEnabled = z4;
        this.profilingTracesHz = i7;
        this.executorService = (ISentryExecutorService) Objects.requireNonNull(iSentryExecutorService, "The ISentryExecutorService is required.");
        this.profileStartTimestamp = DateUtils.getCurrentDateTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ProfilingTraceData onTransactionFinish(String str, String str2, String str3, boolean z4, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        String str4;
        String str5;
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (this.profiler == null) {
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            if (this.buildInfoProvider.getSdkInfoVersion() < 22) {
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
            if (profilingTransactionData != null && profilingTransactionData.getId().equals(str2)) {
                int i7 = this.transactionsCounter;
                if (i7 > 0) {
                    this.transactionsCounter = i7 - 1;
                }
                this.logger.log(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.transactionsCounter != 0) {
                    ProfilingTransactionData profilingTransactionData2 = this.currentProfilingTransactionData;
                    if (profilingTransactionData2 != null) {
                        profilingTransactionData2.notifyFinish(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.profileStartNanos), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.profileStartCpuMillis));
                    }
                    if (acquire != null) {
                        acquire.close();
                    }
                    return null;
                }
                AndroidProfiler.ProfileEndData endAndCollect = this.profiler.endAndCollect(false, list);
                if (endAndCollect == null) {
                    if (acquire != null) {
                        acquire.close();
                    }
                    return null;
                }
                long j = endAndCollect.endNanos - this.profileStartNanos;
                ArrayList arrayList = new ArrayList(1);
                ProfilingTransactionData profilingTransactionData3 = this.currentProfilingTransactionData;
                if (profilingTransactionData3 != null) {
                    arrayList.add(profilingTransactionData3);
                }
                this.currentProfilingTransactionData = null;
                this.transactionsCounter = 0;
                Long totalMemory = sentryOptions instanceof SentryAndroidOptions ? DeviceInfoUtil.getInstance(this.context, (SentryAndroidOptions) sentryOptions).getTotalMemory() : null;
                if (totalMemory == null) {
                    str4 = "0";
                } else {
                    str4 = Long.toString(totalMemory.longValue());
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ProfilingTransactionData) it.next()).notifyFinish(Long.valueOf(endAndCollect.endNanos), Long.valueOf(this.profileStartNanos), Long.valueOf(endAndCollect.endCpuMillis), Long.valueOf(this.profileStartCpuMillis));
                }
                File file = endAndCollect.traceFile;
                Date date = this.profileStartTimestamp;
                String l7 = Long.toString(j);
                int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
                String str6 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                k kVar = new k();
                String manufacturer = this.buildInfoProvider.getManufacturer();
                String model = this.buildInfoProvider.getModel();
                String versionRelease = this.buildInfoProvider.getVersionRelease();
                Boolean isEmulator = this.buildInfoProvider.isEmulator();
                String proguardUuid = sentryOptions.getProguardUuid();
                String release = sentryOptions.getRelease();
                String environment = sentryOptions.getEnvironment();
                if (!endAndCollect.didTimeout && !z4) {
                    str5 = ProfilingTraceData.TRUNCATION_REASON_NORMAL;
                    ProfilingTraceData profilingTraceData = new ProfilingTraceData(file, date, arrayList, str, str2, str3, l7, sdkInfoVersion, str6, kVar, manufacturer, model, versionRelease, isEmulator, str4, proguardUuid, release, environment, str5, endAndCollect.measurementsMap);
                    if (acquire != null) {
                        acquire.close();
                    }
                    return profilingTraceData;
                }
                str5 = ProfilingTraceData.TRUNCATION_REASON_TIMEOUT;
                ProfilingTraceData profilingTraceData2 = new ProfilingTraceData(file, date, arrayList, str, str2, str3, l7, sdkInfoVersion, str6, kVar, manufacturer, model, versionRelease, isEmulator, str4, proguardUuid, release, environment, str5, endAndCollect.measurementsMap);
                if (acquire != null) {
                }
                return profilingTraceData2;
            }
            this.logger.log(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (acquire != null) {
                acquire.close();
            }
            return null;
        } catch (Throwable th) {
            if (acquire == null) {
                throw th;
            }
            try {
                acquire.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
