package io.sentry.android.core;

import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.protocol.SdkVersion;

/* loaded from: classes2.dex */
public final class SentryAndroidOptions extends SentryOptions {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private BeforeCaptureCallback beforeScreenshotCaptureCallback;
    private BeforeCaptureCallback beforeViewHierarchyCaptureCallback;
    private SentryFrameMetricsCollector frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private IDebugImagesLoader debugImagesLoader = NoOpDebugImagesLoader.getInstance();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;
    private NdkHandlerStrategy ndkHandlerStrategy = NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;

    public interface BeforeCaptureCallback {
        boolean execute(SentryEvent sentryEvent, Hint hint, boolean z4);
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.17.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private SdkVersion createSdkVersion() {
        SdkVersion updateSdkVersion = SdkVersion.updateSdkVersion(getSdkVersion(), BuildConfig.SENTRY_ANDROID_SDK_NAME, "8.17.0");
        updateSdkVersion.addPackage("maven:io.sentry:sentry-android-core", "8.17.0");
        return updateSdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z4) {
        this.enableActivityLifecycleBreadcrumbs = z4;
        this.enableAppComponentBreadcrumbs = z4;
        this.enableSystemEventBreadcrumbs = z4;
        this.enableAppLifecycleBreadcrumbs = z4;
        this.enableNetworkEventBreadcrumbs = z4;
        setEnableUserInteractionBreadcrumbs(z4);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public BeforeCaptureCallback getBeforeScreenshotCaptureCallback() {
        return this.beforeScreenshotCaptureCallback;
    }

    public BeforeCaptureCallback getBeforeViewHierarchyCaptureCallback() {
        return this.beforeViewHierarchyCaptureCallback;
    }

    public IDebugImagesLoader getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public SentryFrameMetricsCollector getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z4) {
        this.anrEnabled = z4;
    }

    public void setAnrReportInDebug(boolean z4) {
        this.anrReportInDebug = z4;
    }

    public void setAnrTimeoutIntervalMillis(long j) {
        this.anrTimeoutIntervalMillis = j;
    }

    public void setAttachAnrThreadDump(boolean z4) {
        this.attachAnrThreadDump = z4;
    }

    public void setAttachScreenshot(boolean z4) {
        this.attachScreenshot = z4;
    }

    public void setAttachViewHierarchy(boolean z4) {
        this.attachViewHierarchy = z4;
    }

    public void setBeforeScreenshotCaptureCallback(BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeScreenshotCaptureCallback = beforeCaptureCallback;
    }

    public void setBeforeViewHierarchyCaptureCallback(BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeViewHierarchyCaptureCallback = beforeCaptureCallback;
    }

    public void setCollectAdditionalContext(boolean z4) {
        this.collectAdditionalContext = z4;
    }

    public void setDebugImagesLoader(IDebugImagesLoader iDebugImagesLoader) {
        if (iDebugImagesLoader == null) {
            iDebugImagesLoader = NoOpDebugImagesLoader.getInstance();
        }
        this.debugImagesLoader = iDebugImagesLoader;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z4) {
        this.enableActivityLifecycleBreadcrumbs = z4;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z4) {
        this.enableActivityLifecycleTracingAutoFinish = z4;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z4) {
        this.enableAppComponentBreadcrumbs = z4;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z4) {
        this.enableAppLifecycleBreadcrumbs = z4;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z4) {
        this.enableAutoActivityLifecycleTracing = z4;
    }

    public void setEnableAutoTraceIdGeneration(boolean z4) {
        this.enableAutoTraceIdGeneration = z4;
    }

    public void setEnableFramesTracking(boolean z4) {
        this.enableFramesTracking = z4;
    }

    public void setEnableNdk(boolean z4) {
        this.enableNdk = z4;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z4) {
        this.enableNetworkEventBreadcrumbs = z4;
    }

    public void setEnablePerformanceV2(boolean z4) {
        this.enablePerformanceV2 = z4;
    }

    public void setEnableRootCheck(boolean z4) {
        this.enableRootCheck = z4;
    }

    public void setEnableScopeSync(boolean z4) {
        this.enableScopeSync = z4;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z4) {
        this.enableSystemEventBreadcrumbs = z4;
    }

    public void setFrameMetricsCollector(SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this.frameMetricsCollector = sentryFrameMetricsCollector;
    }

    public void setNativeHandlerStrategy(NdkHandlerStrategy ndkHandlerStrategy) {
        this.ndkHandlerStrategy = ndkHandlerStrategy;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z4) {
        this.reportHistoricalAnrs = z4;
    }

    public void setStartupCrashFlushTimeoutMillis(long j) {
        this.startupCrashFlushTimeoutMillis = j;
    }
}
