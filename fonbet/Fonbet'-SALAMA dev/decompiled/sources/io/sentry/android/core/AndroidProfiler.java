package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.PerformanceCollectionData;
import io.sentry.SentryLevel;
import io.sentry.SentryNanotimeDate;
import io.sentry.SentryUUID;
import io.sentry.TransactionOptions;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AndroidProfiler {
    private static final int BUFFER_SIZE_BYTES = 3000000;
    private static final int PROFILING_TIMEOUT_MILLIS = 30000;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private String frameMetricsCollectorId;
    private final int intervalUs;
    private final ILogger logger;
    private final ISentryExecutorService timeoutExecutorService;
    private final File traceFilesDir;
    private long profileStartNanos = 0;
    private Future<?> scheduledFinish = null;
    private File traceFile = null;
    private final ArrayDeque<ProfileMeasurementValue> screenFrameRateMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> slowFrameRenderMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> frozenFrameRenderMeasurements = new ArrayDeque<>();
    private final Map<String, ProfileMeasurement> measurementsMap = new HashMap();
    private boolean isRunning = false;
    protected final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    public static class ProfileEndData {
        public final boolean didTimeout;
        public final long endCpuMillis;
        public final long endNanos;
        public final Map<String, ProfileMeasurement> measurementsMap;
        public final File traceFile;

        public ProfileEndData(long j, long j3, boolean z4, File file, Map<String, ProfileMeasurement> map) {
            this.endNanos = j;
            this.traceFile = file;
            this.endCpuMillis = j3;
            this.measurementsMap = map;
            this.didTimeout = z4;
        }
    }

    public static class ProfileStartData {
        public final long startCpuMillis;
        public final long startNanos;
        public final Date startTimestamp;

        public ProfileStartData(long j, long j3, Date date) {
            this.startNanos = j;
            this.startCpuMillis = j3;
            this.startTimestamp = date;
        }
    }

    public AndroidProfiler(String str, int i7, SentryFrameMetricsCollector sentryFrameMetricsCollector, ISentryExecutorService iSentryExecutorService, ILogger iLogger) {
        this.traceFilesDir = new File((String) Objects.requireNonNull(str, "TracesFilesDirPath is required"));
        this.intervalUs = i7;
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.timeoutExecutorService = iSentryExecutorService;
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        endAndCollect(true, null);
    }

    private void putPerformanceCollectionDataInMeasurements(List<PerformanceCollectionData> list) {
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.profileStartNanos) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (PerformanceCollectionData performanceCollectionData : list) {
                        long nanoTimestamp = performanceCollectionData.getNanoTimestamp();
                        long j = nanoTimestamp + elapsedRealtimeNanos;
                        Double cpuUsagePercentage = performanceCollectionData.getCpuUsagePercentage();
                        Long usedHeapMemory = performanceCollectionData.getUsedHeapMemory();
                        Long usedNativeMemory = performanceCollectionData.getUsedNativeMemory();
                        if (cpuUsagePercentage != null) {
                            arrayDeque3.add(new ProfileMeasurementValue(Long.valueOf(j), cpuUsagePercentage, nanoTimestamp));
                        }
                        if (usedHeapMemory != null) {
                            arrayDeque.add(new ProfileMeasurementValue(Long.valueOf(j), usedHeapMemory, nanoTimestamp));
                        }
                        if (usedNativeMemory != null) {
                            arrayDeque2.add(new ProfileMeasurementValue(Long.valueOf(j), usedNativeMemory, nanoTimestamp));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_CPU_USAGE, new ProfileMeasurement(ProfileMeasurement.UNIT_PERCENT, arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_FOOTPRINT, new ProfileMeasurement(ProfileMeasurement.UNIT_BYTES, arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_NATIVE_FOOTPRINT, new ProfileMeasurement(ProfileMeasurement.UNIT_BYTES, arrayDeque2));
        }
    }

    public void close() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            if (this.isRunning) {
                endAndCollect(true, null);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x0023, B:13:0x0031, B:15:0x0044, B:19:0x0055, B:22:0x005f, B:23:0x006d, B:25:0x0075, B:26:0x0083, B:28:0x008b, B:29:0x009b, B:31:0x00a2, B:32:0x00a8, B:42:0x00ba, B:43:0x00bc, B:11:0x0020, B:39:0x0027), top: B:2:0x0006, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x0023, B:13:0x0031, B:15:0x0044, B:19:0x0055, B:22:0x005f, B:23:0x006d, B:25:0x0075, B:26:0x0083, B:28:0x008b, B:29:0x009b, B:31:0x00a2, B:32:0x00a8, B:42:0x00ba, B:43:0x00bc, B:11:0x0020, B:39:0x0027), top: B:2:0x0006, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfileEndData endAndCollect(boolean z4, List<PerformanceCollectionData> list) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!this.isRunning) {
                this.logger.log(SentryLevel.WARNING, "Profiler not running", new Object[0]);
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                    this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    if (this.traceFile != null) {
                    }
                } finally {
                }
            }
            this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime2 = Process.getElapsedCpuTime();
            if (this.traceFile != null) {
                this.logger.log(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            if (!this.slowFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_SLOW_FRAME_RENDERS, new ProfileMeasurement(ProfileMeasurement.UNIT_NANOSECONDS, this.slowFrameRenderMeasurements));
            }
            if (!this.frozenFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_FROZEN_FRAME_RENDERS, new ProfileMeasurement(ProfileMeasurement.UNIT_NANOSECONDS, this.frozenFrameRenderMeasurements));
            }
            if (!this.screenFrameRateMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_SCREEN_FRAME_RATES, new ProfileMeasurement(ProfileMeasurement.UNIT_HZ, this.screenFrameRateMeasurements));
            }
            putPerformanceCollectionDataInMeasurements(list);
            Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            ProfileEndData profileEndData = new ProfileEndData(elapsedRealtimeNanos2, elapsedCpuTime2, z4, this.traceFile, this.measurementsMap);
            if (acquire != null) {
                acquire.close();
            }
            return profileEndData;
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

    public ProfileStartData start() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            int i7 = this.intervalUs;
            if (i7 == 0) {
                this.logger.log(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i7));
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            if (this.isRunning) {
                this.logger.log(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            this.traceFile = new File(this.traceFilesDir, SentryUUID.generateSentryId() + ".trace");
            this.measurementsMap.clear();
            this.screenFrameRateMeasurements.clear();
            this.slowFrameRenderMeasurements.clear();
            this.frozenFrameRenderMeasurements.clear();
            this.frameMetricsCollectorId = this.frameMetricsCollector.startCollection(new SentryFrameMetricsCollector.FrameMetricsCollectorListener() { // from class: io.sentry.android.core.AndroidProfiler.1
                float lastRefreshRate = 0.0f;

                @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
                public void onFrameMetricCollected(long j, long j3, long j7, long j8, boolean z4, boolean z7, float f7) {
                    long nanoTimestamp = new SentryNanotimeDate().nanoTimestamp();
                    long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() + (j3 - System.nanoTime())) - AndroidProfiler.this.profileStartNanos;
                    if (elapsedRealtimeNanos < 0) {
                        return;
                    }
                    if (z7) {
                        AndroidProfiler.this.frozenFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(j7), nanoTimestamp));
                    } else if (z4) {
                        AndroidProfiler.this.slowFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(j7), nanoTimestamp));
                    }
                    if (f7 != this.lastRefreshRate) {
                        this.lastRefreshRate = f7;
                        AndroidProfiler.this.screenFrameRateMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(elapsedRealtimeNanos), Float.valueOf(f7), nanoTimestamp));
                    }
                }
            });
            try {
                ISentryExecutorService iSentryExecutorService = this.timeoutExecutorService;
                if (iSentryExecutorService != null) {
                    this.scheduledFinish = iSentryExecutorService.schedule(new d(this, 2), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION);
                }
            } catch (RejectedExecutionException e7) {
                this.logger.log(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e7);
            }
            this.profileStartNanos = SystemClock.elapsedRealtimeNanos();
            Date currentDateTime = DateUtils.getCurrentDateTime();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.traceFile.getPath(), BUFFER_SIZE_BYTES, this.intervalUs);
                this.isRunning = true;
                ProfileStartData profileStartData = new ProfileStartData(this.profileStartNanos, elapsedCpuTime, currentDateTime);
                if (acquire != null) {
                    acquire.close();
                }
                return profileStartData;
            } catch (Throwable th) {
                endAndCollect(false, null);
                this.logger.log(SentryLevel.ERROR, "Unable to start a profile: ", th);
                this.isRunning = false;
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
