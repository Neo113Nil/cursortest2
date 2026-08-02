package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.DateUtils;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.IpAddressUtils;
import io.sentry.NoOpLogger;
import io.sentry.SentryAttributeType;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.App;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class DefaultAndroidEventProcessor implements EventProcessor {
    private final BuildInfoProvider buildInfoProvider;
    final Context context;
    private final LazyEvaluator<String> deviceFamily = new LazyEvaluator<>(new a(1));
    private final Future<DeviceInfoUtil> deviceInfoUtil;
    private final SentryAndroidOptions options;

    public DefaultAndroidEventProcessor(Context context, BuildInfoProvider buildInfoProvider, SentryAndroidOptions sentryAndroidOptions) {
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required.");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.deviceInfoUtil = newSingleThreadExecutor.submit(new o(this, sentryAndroidOptions, 0));
        newSingleThreadExecutor.shutdown();
    }

    private static void fixExceptionOrder(SentryEvent sentryEvent) {
        SentryStackTrace stacktrace;
        List<SentryStackFrame> frames;
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions == null || exceptions.size() <= 1) {
            return;
        }
        SentryException sentryException = exceptions.get(exceptions.size() - 1);
        if (!"java.lang".equals(sentryException.getModule()) || (stacktrace = sentryException.getStacktrace()) == null || (frames = stacktrace.getFrames()) == null) {
            return;
        }
        Iterator<SentryStackFrame> it = frames.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().getModule())) {
                Collections.reverse(exceptions);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0() {
        return ContextUtils.getFamily(NoOpLogger.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DeviceInfoUtil lambda$new$1(SentryAndroidOptions sentryAndroidOptions) {
        return DeviceInfoUtil.getInstance(this.context, sentryAndroidOptions);
    }

    private void mergeOS(SentryBaseEvent sentryBaseEvent) {
        String str;
        OperatingSystem operatingSystem = sentryBaseEvent.getContexts().getOperatingSystem();
        try {
            sentryBaseEvent.getContexts().setOperatingSystem(this.deviceInfoUtil.get().getOperatingSystem());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
        }
        if (operatingSystem != null) {
            String name = operatingSystem.getName();
            if (name == null || name.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + name.trim().toLowerCase(Locale.ROOT);
            }
            sentryBaseEvent.getContexts().put(str, operatingSystem);
        }
    }

    private void mergeUser(SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            user = new User();
            sentryBaseEvent.setUser(user);
        }
        if (user.getId() == null) {
            user.setId(Installation.id(this.context));
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    private void processNonCachedEvent(SentryBaseEvent sentryBaseEvent, Hint hint) {
        App app = sentryBaseEvent.getContexts().getApp();
        if (app == null) {
            app = new App();
        }
        setAppExtras(app, hint);
        setPackageInfo(sentryBaseEvent, app);
        sentryBaseEvent.getContexts().setApp(app);
    }

    private void setAppExtras(App app, Hint hint) {
        Boolean isInBackground;
        app.setAppName(ContextUtils.getApplicationName(this.context));
        TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options);
        if (appStartTimeSpanWithFallback.hasStarted()) {
            app.setAppStartTime(DateUtils.toUtilDate(appStartTimeSpanWithFallback.getStartTimestamp()));
        }
        if (HintUtils.isFromHybridSdk(hint) || app.getInForeground() != null || (isInBackground = AppState.getInstance().isInBackground()) == null) {
            return;
        }
        app.setInForeground(Boolean.valueOf(!isInBackground.booleanValue()));
    }

    private void setCommons(SentryBaseEvent sentryBaseEvent, boolean z4, boolean z7) {
        mergeUser(sentryBaseEvent);
        setDevice(sentryBaseEvent, z4, z7);
        setSideLoadedInfo(sentryBaseEvent);
    }

    private void setDevice(SentryBaseEvent sentryBaseEvent, boolean z4, boolean z7) {
        if (sentryBaseEvent.getContexts().getDevice() == null) {
            try {
                sentryBaseEvent.getContexts().setDevice(this.deviceInfoUtil.get().collectDeviceInformation(z4, z7));
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
            }
            mergeOS(sentryBaseEvent);
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent, String str) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(str);
        }
    }

    private void setOs(SentryLogEvent sentryLogEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryLogEvent.setAttribute("os.name", new SentryLogEventAttributeValue(sentryAttributeType, "Android"));
            sentryLogEvent.setAttribute("os.version", new SentryLogEventAttributeValue(sentryAttributeType, Build.VERSION.RELEASE));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
        }
    }

    private void setPackageInfo(SentryBaseEvent sentryBaseEvent, App app) {
        DeviceInfoUtil deviceInfoUtil;
        PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, 4096, this.options.getLogger(), this.buildInfoProvider);
        if (packageInfo != null) {
            setDist(sentryBaseEvent, ContextUtils.getVersionCode(packageInfo, this.buildInfoProvider));
            try {
                deviceInfoUtil = this.deviceInfoUtil.get();
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
                deviceInfoUtil = null;
            }
            ContextUtils.setAppPackageInfo(packageInfo, this.buildInfoProvider, deviceInfoUtil, app);
        }
    }

    private void setSideLoadedInfo(SentryBaseEvent sentryBaseEvent) {
        try {
            ContextUtils.SideLoadedInfo sideLoadedInfo = this.deviceInfoUtil.get().getSideLoadedInfo();
            if (sideLoadedInfo != null) {
                for (Map.Entry<String, String> entry : sideLoadedInfo.asTags().entrySet()) {
                    sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void setThreads(SentryEvent sentryEvent, Hint hint) {
        if (sentryEvent.getThreads() != null) {
            boolean isFromHybridSdk = HintUtils.isFromHybridSdk(hint);
            for (SentryThread sentryThread : sentryEvent.getThreads()) {
                boolean isMainThread = AndroidThreadChecker.getInstance().isMainThread(sentryThread);
                if (sentryThread.isCurrent() == null) {
                    sentryThread.setCurrent(Boolean.valueOf(isMainThread));
                }
                if (!isFromHybridSdk && sentryThread.isMain() == null) {
                    sentryThread.setMain(Boolean.valueOf(isMainThread));
                }
            }
        }
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    public User getDefaultUser(Context context) {
        User user = new User();
        user.setId(Installation.id(context));
        return user;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 8000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryEvent, hint);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryEvent, hint);
            setThreads(sentryEvent, hint);
        }
        setCommons(sentryEvent, true, shouldApplyScopeData);
        fixExceptionOrder(sentryEvent);
        return sentryEvent;
    }

    private void setDevice(SentryLogEvent sentryLogEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryLogEvent.setAttribute("device.brand", new SentryLogEventAttributeValue(sentryAttributeType, Build.BRAND));
            sentryLogEvent.setAttribute("device.model", new SentryLogEventAttributeValue(sentryAttributeType, Build.MODEL));
            sentryLogEvent.setAttribute("device.family", new SentryLogEventAttributeValue(sentryAttributeType, this.deviceFamily.getValue()));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
        }
    }

    @Override // io.sentry.EventProcessor
    public SentryLogEvent process(SentryLogEvent sentryLogEvent) {
        setDevice(sentryLogEvent);
        setOs(sentryLogEvent);
        return sentryLogEvent;
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryTransaction, hint);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryTransaction, hint);
        }
        setCommons(sentryTransaction, false, shouldApplyScopeData);
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    public SentryReplayEvent process(SentryReplayEvent sentryReplayEvent, Hint hint) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryReplayEvent, hint);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryReplayEvent, hint);
        }
        setCommons(sentryReplayEvent, false, shouldApplyScopeData);
        return sentryReplayEvent;
    }
}
