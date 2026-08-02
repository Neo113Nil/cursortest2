package com.datadog.android.error.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u0006*\u00020\u00170\u00178\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/error/internal/CrashReportsFeature;", "Lcom/datadog/android/api/feature/Feature;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Landroid/content/Context;", "appContext", "", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "originalUncaughtExceptionHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "getOriginalUncaughtExceptionHandler$dd_sdk_android_core_release", "()Ljava/lang/Thread$UncaughtExceptionHandler;", "setOriginalUncaughtExceptionHandler$dd_sdk_android_core_release", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CrashReportsFeature implements com.datadog.android.api.feature.Feature {
    public static final java.lang.String CRASH_FEATURE_NAME = "crash";
    private final com.datadog.android.api.feature.FeatureSdkCore Camera2StreamConfigurationMap;
    private final java.util.concurrent.atomic.AtomicBoolean initialized;
    private final java.lang.String name;
    private java.lang.Thread.UncaughtExceptionHandler originalUncaughtExceptionHandler;

    public CrashReportsFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.Camera2StreamConfigurationMap = featureSdkCore;
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.originalUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        this.name = "crash";
    }

    /* renamed from: getInitialized$dd_sdk_android_core_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* renamed from: getOriginalUncaughtExceptionHandler$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.Thread.UncaughtExceptionHandler getOriginalUncaughtExceptionHandler() {
        return this.originalUncaughtExceptionHandler;
    }

    public final void setOriginalUncaughtExceptionHandler$dd_sdk_android_core_release(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.originalUncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        this.originalUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        new com.datadog.android.error.internal.DatadogExceptionHandler(this.Camera2StreamConfigurationMap, appContext).register();
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this.originalUncaughtExceptionHandler);
        this.initialized.set(false);
    }
}
