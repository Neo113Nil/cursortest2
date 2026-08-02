package com.datadog.android.profiling;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J=\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0000¢\u0006\u0004\b\u0013\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Lcom/datadog/android/profiling/Profiling;", "", "<init>", "()V", "Lcom/datadog/android/profiling/ProfilingConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "enable", "(Lcom/datadog/android/profiling/ProfilingConfiguration;Lcom/datadog/android/api/SdkCore;)V", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "context", "Lcom/datadog/android/profiling/internal/ProfilingStartReason;", "startReason", "", "", "additionalAttributes", "start$dd_sdk_android_profiling_release", "(Landroid/content/Context;Lcom/datadog/android/profiling/internal/ProfilingStartReason;Ljava/util/Map;Lcom/datadog/android/api/SdkCore;)V", "", "sdkInstanceNames", "(Landroid/content/Context;Lcom/datadog/android/profiling/internal/ProfilingStartReason;Ljava/util/Map;Ljava/util/Set;)V", "stop$dd_sdk_android_profiling_release", "(Lcom/datadog/android/api/SdkCore;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProfilerInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProfilerInitialized$dd_sdk_android_profiling_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/datadog/android/profiling/internal/Profiler;", "profiler", "Lcom/datadog/android/profiling/internal/Profiler;", "getProfiler$dd_sdk_android_profiling_release", "()Lcom/datadog/android/profiling/internal/Profiler;", "setProfiler$dd_sdk_android_profiling_release", "(Lcom/datadog/android/profiling/internal/Profiler;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Profiling {
    public static final com.datadog.android.profiling.Profiling INSTANCE = new com.datadog.android.profiling.Profiling();
    private static volatile com.datadog.android.profiling.internal.Profiler profiler = new com.datadog.android.profiling.internal.NoOpProfiler();
    private static final java.util.concurrent.atomic.AtomicBoolean isProfilerInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);

    private Profiling() {
    }

    public final com.datadog.android.profiling.internal.Profiler getProfiler$dd_sdk_android_profiling_release() {
        return profiler;
    }

    public final void setProfiler$dd_sdk_android_profiling_release(com.datadog.android.profiling.internal.Profiler profiler2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profiler2, "");
        profiler = profiler2;
    }

    public final java.util.concurrent.atomic.AtomicBoolean isProfilerInitialized$dd_sdk_android_profiling_release() {
        return isProfilerInitialized;
    }

    public static /* synthetic */ void enable$default(com.datadog.android.profiling.ProfilingConfiguration profilingConfiguration, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            profilingConfiguration = com.datadog.android.profiling.ProfilingConfiguration.INSTANCE.getDEFAULT();
        }
        if ((i & 2) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        enable(profilingConfiguration, sdkCore);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(com.datadog.android.profiling.ProfilingConfiguration configuration, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = (com.datadog.android.api.feature.FeatureSdkCore) sdkCore;
        getHighSpeedVideoFpsRangesFor();
        featureSdkCore.registerFeature(new com.datadog.android.profiling.internal.ProfilingFeature(featureSdkCore, configuration, profiler));
    }

    public final void start$dd_sdk_android_profiling_release(android.content.Context context, com.datadog.android.profiling.internal.ProfilingStartReason startReason, java.util.Map<java.lang.String, java.lang.String> additionalAttributes, java.util.Set<java.lang.String> sdkInstanceNames) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceNames, "");
        getHighSpeedVideoFpsRangesFor();
        profiler.start(context, startReason, additionalAttributes, sdkInstanceNames);
        com.datadog.android.profiling.internal.ProfilingStorage.removeProfilingFlag$dd_sdk_android_profiling_release(context, sdkInstanceNames);
    }

    public static /* synthetic */ void start$dd_sdk_android_profiling_release$default(com.datadog.android.profiling.Profiling profiling, android.content.Context context, com.datadog.android.profiling.internal.ProfilingStartReason profilingStartReason, java.util.Map map, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        profiling.start$dd_sdk_android_profiling_release(context, profilingStartReason, (java.util.Map<java.lang.String, java.lang.String>) map, sdkCore);
    }

    public final void start$dd_sdk_android_profiling_release(android.content.Context context, com.datadog.android.profiling.internal.ProfilingStartReason startReason, java.util.Map<java.lang.String, java.lang.String> additionalAttributes, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        start$dd_sdk_android_profiling_release(context, startReason, additionalAttributes, kotlin.collections.SetsKt.setOf(sdkCore.getName()));
    }

    public static /* synthetic */ void stop$dd_sdk_android_profiling_release$default(com.datadog.android.profiling.Profiling profiling, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        profiling.stop$dd_sdk_android_profiling_release(sdkCore);
    }

    public final void stop$dd_sdk_android_profiling_release(com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        profiler.stop(sdkCore.getName());
    }

    private static void getHighSpeedVideoFpsRangesFor() {
        if (isProfilerInitialized.getAndSet(true)) {
            return;
        }
        com.datadog.android.internal.time.DefaultTimeProvider defaultTimeProvider = new com.datadog.android.internal.time.DefaultTimeProvider();
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        profiler = new com.datadog.android.profiling.internal.perfetto.PerfettoProfiler(defaultTimeProvider, newSingleThreadExecutor);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(com.datadog.android.profiling.ProfilingConfiguration profilingConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilingConfiguration, "");
        enable$default(profilingConfiguration, null, 2, null);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        enable$default(null, null, 3, null);
    }
}
