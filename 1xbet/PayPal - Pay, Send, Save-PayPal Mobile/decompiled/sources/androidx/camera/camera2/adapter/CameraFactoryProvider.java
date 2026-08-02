package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJC\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/camera/camera2/adapter/CameraFactoryProvider;", "Landroidx/camera/core/impl/CameraFactory$Provider;", "Landroidx/camera/camera2/pipe/CameraPipe;", "sharedCameraPipe", "Landroid/content/Context;", "sharedAppContext", "Landroidx/camera/core/impl/CameraThreadConfig;", "sharedThreadConfig", "<init>", "(Landroidx/camera/camera2/pipe/CameraPipe;Landroid/content/Context;Landroidx/camera/core/impl/CameraThreadConfig;)V", "context", "threadConfig", "Landroidx/camera/core/CameraSelector;", "availableCamerasLimiter", "", "cameraOpenRetryMaxTimeoutInMs", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "streamSpecsCalculator", "Landroidx/camera/core/impl/CameraFactory;", "newInstance", "(Landroid/content/Context;Landroidx/camera/core/impl/CameraThreadConfig;Landroidx/camera/core/CameraSelector;JLandroidx/camera/core/CameraXConfig;Landroidx/camera/core/internal/StreamSpecsCalculator;)Landroidx/camera/core/impl/CameraFactory;", "p0", "p1", "Landroidx/camera/camera2/pipe/core/DurationNs;", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroid/content/Context;Landroidx/camera/core/impl/CameraThreadConfig;Landroidx/camera/camera2/pipe/core/DurationNs;)Landroidx/camera/camera2/pipe/CameraPipe;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/CameraPipe;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Landroidx/camera/core/impl/CameraThreadConfig;", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraFactoryProvider implements androidx.camera.core.impl.CameraFactory.Provider {
    private final androidx.camera.core.impl.CameraThreadConfig Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraPipe getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository getHighSpeedVideoFpsRanges;
    private final android.content.Context getHighSpeedVideoSizes;

    public CameraFactoryProvider(androidx.camera.camera2.pipe.CameraPipe cameraPipe, android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig) {
        this.getHighSpeedVideoFpsRangesFor = cameraPipe;
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = cameraThreadConfig;
        this.getHighSpeedVideoFpsRanges = new androidx.camera.camera2.impl.CameraInteropStateCallbackRepository();
    }

    public /* synthetic */ CameraFactoryProvider(androidx.camera.camera2.pipe.CameraPipe cameraPipe, android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cameraPipe, (i & 2) != 0 ? null : context, (i & 4) != 0 ? null : cameraThreadConfig);
    }

    @Override // androidx.camera.core.impl.CameraFactory.Provider
    public final androidx.camera.core.impl.CameraFactory newInstance(final android.content.Context context, final androidx.camera.core.impl.CameraThreadConfig threadConfig, androidx.camera.core.CameraSelector availableCamerasLimiter, long cameraOpenRetryMaxTimeoutInMs, androidx.camera.core.CameraXConfig cameraXConfig, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) {
        androidx.camera.core.CameraXConfig cameraXConfig2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
        final androidx.camera.camera2.pipe.core.DurationNs m870boximpl = cameraOpenRetryMaxTimeoutInMs == -1 ? null : androidx.camera.camera2.pipe.core.DurationNs.m870boximpl(androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(cameraOpenRetryMaxTimeoutInMs));
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.adapter.CameraFactoryProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.adapter.CameraFactoryProvider.$r8$lambda$ZlHettYjxZNyriDnsgQO8y2N0Rk(androidx.camera.camera2.adapter.CameraFactoryProvider.this, context, threadConfig, m870boximpl);
            }
        });
        android.content.Context context2 = this.getHighSpeedVideoSizes;
        android.content.Context context3 = context2 != null ? context2 : context;
        androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig = this.Camera2StreamConfigurationMap;
        androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig2 = cameraThreadConfig != null ? cameraThreadConfig : threadConfig;
        androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository = this.getHighSpeedVideoFpsRanges;
        if (cameraXConfig == null) {
            androidx.camera.core.CameraXConfig build = new androidx.camera.core.CameraXConfig.Builder().build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            cameraXConfig2 = build;
        } else {
            cameraXConfig2 = cameraXConfig;
        }
        return new androidx.camera.camera2.adapter.CameraFactoryAdapter(lazy, context3, cameraThreadConfig2, cameraInteropStateCallbackRepository, availableCamerasLimiter, streamSpecsCalculator, cameraXConfig2);
    }

    private final androidx.camera.camera2.pipe.CameraPipe getHighSpeedVideoFpsRangesFor(android.content.Context p0, androidx.camera.core.impl.CameraThreadConfig p1, androidx.camera.camera2.pipe.core.DurationNs p2) {
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        try {
            android.os.Trace.beginSection("Create CameraPipe");
            androidx.camera.camera2.pipe.core.SystemTimeSource systemTimeSource = new androidx.camera.camera2.pipe.core.SystemTimeSource();
            androidx.camera.camera2.pipe.core.Timestamps timestamps = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
            long mo885nowvQl9yQU = systemTimeSource.mo885nowvQl9yQU();
            android.content.Context persistentApplicationContext = androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(p0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(persistentApplicationContext, "");
            androidx.camera.camera2.pipe.CameraPipe CameraPipe = androidx.camera.camera2.pipe.CameraPipeKt.CameraPipe(new androidx.camera.camera2.pipe.CameraPipe.Config(persistentApplicationContext, new androidx.camera.camera2.pipe.CameraPipe.ThreadConfig(null, null, null, androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(p1.getCameraExecutor()), null, null, null, 119, null), null, null, new androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig(this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI(), this.getHighSpeedVideoFpsRanges.getSessionStateCallback(), p2, null), null, null, null, 236, null));
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                androidx.camera.camera2.pipe.core.Timestamps timestamps2 = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
                androidx.camera.camera2.pipe.core.Timestamps timestamps3 = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format(null, "%.3f ms", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(systemTimeSource.mo885nowvQl9yQU() - mo885nowvQl9yQU) / 1000000.0d)}, 1)), "");
            }
            return CameraPipe;
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.CameraPipe $r8$lambda$ZlHettYjxZNyriDnsgQO8y2N0Rk(androidx.camera.camera2.adapter.CameraFactoryProvider cameraFactoryProvider, android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, androidx.camera.camera2.pipe.core.DurationNs durationNs) {
        if (cameraFactoryProvider.getHighSpeedVideoFpsRangesFor != null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                java.util.Objects.toString(cameraFactoryProvider.getHighSpeedVideoFpsRangesFor);
            }
            return cameraFactoryProvider.getHighSpeedVideoFpsRangesFor;
        }
        return cameraFactoryProvider.getHighSpeedVideoFpsRangesFor(context, cameraThreadConfig, durationNs);
    }

    public CameraFactoryProvider() {
        this(null, null, null, 7, null);
    }
}
