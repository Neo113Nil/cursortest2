package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010 \u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010*\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010/"}, d2 = {"Landroidx/camera/camera2/impl/MeteringRepeating;", "Landroidx/camera/core/UseCase;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/MeteringRepeating$MeteringRepeatingConfig;", "config", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "displayInfoManager", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/MeteringRepeating$MeteringRepeatingConfig;Landroidx/camera/camera2/impl/DisplayInfoManager;)V", "", "applyDefaultConfig", "Landroidx/camera/core/impl/UseCaseConfigFactory;", "factory", "getDefaultConfig", "(ZLandroidx/camera/core/impl/UseCaseConfigFactory;)Landroidx/camera/camera2/impl/MeteringRepeating$MeteringRepeatingConfig;", "Landroidx/camera/core/impl/Config;", "Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "getUseCaseConfigBuilder", "(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "Landroidx/camera/core/impl/StreamSpec;", "primaryStreamSpec", "secondaryStreamSpec", "onSuggestedStreamSpecUpdated", "(Landroidx/camera/core/impl/StreamSpec;Landroidx/camera/core/impl/StreamSpec;)Landroidx/camera/core/impl/StreamSpec;", "", "onUnbind", "()V", "setupSession", "Landroid/util/Size;", "p0", "Landroidx/camera/core/impl/SessionConfig$Builder;", "getHighSpeedVideoFpsRanges", "(Landroid/util/Size;)Landroidx/camera/core/impl/SessionConfig$Builder;", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "getOutputMinFrameDuration", "Landroid/util/Size;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "Landroidx/camera/core/impl/SessionConfig$CloseableErrorListener;", "Landroidx/camera/core/impl/SessionConfig$CloseableErrorListener;", "Landroidx/camera/core/impl/DeferrableSurface;", "Landroidx/camera/core/impl/DeferrableSurface;", "getHighSpeedVideoSizesFor", "MeteringRepeatingConfig", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MeteringRepeating extends androidx.camera.core.UseCase {
    private final androidx.camera.camera2.impl.DisplayInfoManager Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraProperties getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final android.util.Size getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeteringRepeating(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.MeteringRepeating.MeteringRepeatingConfig meteringRepeatingConfig, androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager) {
        super(meteringRepeatingConfig);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meteringRepeatingConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayInfoManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cameraProperties;
        this.Camera2StreamConfigurationMap = displayInfoManager;
        this.getHighSpeedVideoSizes = androidx.camera.camera2.impl.MeteringRepeatingKt.getProperPreviewSize(cameraProperties, displayInfoManager);
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.camera2.impl.MeteringRepeating.MeteringRepeatingConfig getDefaultConfig(boolean applyDefaultConfig, androidx.camera.core.impl.UseCaseConfigFactory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return new androidx.camera.camera2.impl.MeteringRepeating.Builder(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.camera2.impl.MeteringRepeating.Builder getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return new androidx.camera.camera2.impl.MeteringRepeating.Builder(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec primaryStreamSpec, androidx.camera.core.impl.StreamSpec secondaryStreamSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryStreamSpec, "");
        updateSessionConfig(kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes).build()));
        androidx.camera.core.impl.StreamSpec build = primaryStreamSpec.toBuilder().setResolution(this.getHighSpeedVideoSizes).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.getHighSpeedVideoFpsRangesFor;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.getHighSpeedVideoSizesFor;
            if (deferrableSurface != null) {
                deferrableSurface.close();
            }
            this.getHighSpeedVideoSizesFor = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void setupSession() {
        android.util.Size size;
        size = androidx.camera.camera2.impl.MeteringRepeatingKt.getHighSpeedVideoSizes;
        updateSuggestedStreamSpec(androidx.camera.core.impl.StreamSpec.builder(size).build(), null);
    }

    private final androidx.camera.core.impl.SessionConfig.Builder getHighSpeedVideoFpsRanges(final android.util.Size p0) {
        androidx.camera.core.impl.ImmediateSurface immediateSurface;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
            surfaceTexture.setDefaultBufferSize(p0.getWidth(), p0.getHeight());
            final android.view.Surface surface = new android.view.Surface(surfaceTexture);
            androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.getHighSpeedVideoSizesFor;
            if (deferrableSurface != null) {
                deferrableSurface.close();
            }
            androidx.camera.core.impl.ImmediateSurface immediateSurface2 = new androidx.camera.core.impl.ImmediateSurface(surface, p0, getImageFormat());
            immediateSurface = immediateSurface2;
            this.getHighSpeedVideoSizesFor = immediateSurface;
            immediateSurface2.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.MeteringRepeating$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.impl.MeteringRepeating.$r8$lambda$Q7CbjLDnricLd1mJRiIT8an2ZhA(surface, surfaceTexture);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.getHighSpeedVideoFpsRangesFor;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.camera2.impl.MeteringRepeating$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.camera2.impl.MeteringRepeating.$r8$lambda$BPlB8isfuWKFvMqTcjDrqYh8Ecw(androidx.camera.camera2.impl.MeteringRepeating.this, p0, sessionConfig, sessionError);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = closeableErrorListener2;
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(new androidx.camera.camera2.impl.MeteringRepeating.MeteringRepeatingConfig(), p0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createFrom, "");
        createFrom.setTemplateType(1);
        createFrom.addSurface(immediateSurface);
        createFrom.setErrorListener(closeableErrorListener2);
        return createFrom;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u00070\t¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/impl/MeteringRepeating$MeteringRepeatingConfig;", "Landroidx/camera/core/impl/UseCaseConfig;", "Landroidx/camera/camera2/impl/MeteringRepeating;", "Landroidx/camera/core/impl/ImageInputConfig;", "<init>", "()V", "Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;", "getCaptureType", "()Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;", "Landroidx/camera/core/impl/MutableOptionsBundle;", "getConfig", "()Landroidx/camera/core/impl/MutableOptionsBundle;", "", "getInputFormat", "()I", "Lorg/jspecify/annotations/NonNull;", "Camera2StreamConfigurationMap", "Landroidx/camera/core/impl/MutableOptionsBundle;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MeteringRepeatingConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.camera2.impl.MeteringRepeating>, androidx.camera.core.impl.ImageInputConfig {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.camera.core.impl.MutableOptionsBundle getHighSpeedVideoFpsRangesFor;

        @Override // androidx.camera.core.impl.ImageInputConfig
        public final int getInputFormat() {
            return 34;
        }

        public MeteringRepeatingConfig() {
            androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultSessionOptionsUnpacker.INSTANCE);
            create.insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, "MeteringRepeating");
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            this.getHighSpeedVideoFpsRangesFor = create;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final androidx.camera.core.impl.UseCaseConfigFactory.CaptureType getCaptureType() {
            return androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        /* renamed from: getConfig, reason: from getter */
        public final androidx.camera.core.impl.MutableOptionsBundle getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010 \u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010="}, d2 = {"Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "Landroidx/camera/core/impl/UseCaseConfig$Builder;", "Landroidx/camera/camera2/impl/MeteringRepeating;", "Landroidx/camera/camera2/impl/MeteringRepeating$MeteringRepeatingConfig;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "displayInfoManager", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/DisplayInfoManager;)V", "Landroidx/camera/core/impl/MutableOptionsBundle;", "getMutableConfig", "()Landroidx/camera/core/impl/MutableOptionsBundle;", "getUseCaseConfig", "()Landroidx/camera/camera2/impl/MeteringRepeating$MeteringRepeatingConfig;", "Ljava/lang/Class;", "targetClass", "setTargetClass", "(Ljava/lang/Class;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "", "targetName", "setTargetName", "(Ljava/lang/String;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "setDefaultSessionConfig", "(Landroidx/camera/core/impl/SessionConfig;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfig", "setDefaultCaptureConfig", "(Landroidx/camera/core/impl/CaptureConfig;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "Landroidx/camera/core/impl/SessionConfig$OptionUnpacker;", "optionUnpacker", "setSessionOptionUnpacker", "(Landroidx/camera/core/impl/SessionConfig$OptionUnpacker;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "Landroidx/camera/core/impl/CaptureConfig$OptionUnpacker;", "setCaptureOptionUnpacker", "(Landroidx/camera/core/impl/CaptureConfig$OptionUnpacker;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "", "priority", "setSurfaceOccupancyPriority", "(I)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "", "disabled", "setZslDisabled", "(Z)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "setHighResolutionDisabled", "Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;", "captureType", "setCaptureType", "(Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "Landroidx/camera/core/impl/StreamUseCase;", "streamUseCase", "setStreamUseCase", "(Landroidx/camera/core/impl/StreamUseCase;)Landroidx/camera/camera2/impl/MeteringRepeating$Builder;", "build", "()Landroidx/camera/camera2/impl/MeteringRepeating;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/DisplayInfoManager;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.camera2.impl.MeteringRepeating, androidx.camera.camera2.impl.MeteringRepeating.MeteringRepeatingConfig, androidx.camera.camera2.impl.MeteringRepeating.Builder> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.camera.camera2.impl.CameraProperties getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.camera.camera2.impl.DisplayInfoManager getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setHighResolutionDisabled(boolean disabled) {
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setSurfaceOccupancyPriority(int priority) {
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setZslDisabled(boolean disabled) {
            return this;
        }

        public Builder(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayInfoManager, "");
            this.getHighSpeedVideoFpsRangesFor = cameraProperties;
            this.getHighResolutionOutputSizeshNQ4ISI = displayInfoManager;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
            return setTargetClass((java.lang.Class<androidx.camera.camera2.impl.MeteringRepeating>) cls);
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.impl.MutableOptionsBundle getMutableConfig() {
            androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            return create;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.MeteringRepeatingConfig getUseCaseConfig() {
            return new androidx.camera.camera2.impl.MeteringRepeating.MeteringRepeatingConfig();
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.camera2.impl.MeteringRepeating build() {
            return new androidx.camera.camera2.impl.MeteringRepeating(this.getHighSpeedVideoFpsRangesFor, getUseCaseConfig(), this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setTargetName(java.lang.String targetName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetName, "");
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setTargetClass(java.lang.Class<androidx.camera.camera2.impl.MeteringRepeating> targetClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetClass, "");
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setStreamUseCase(androidx.camera.core.impl.StreamUseCase streamUseCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamUseCase, "");
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionUnpacker, "");
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureConfig, "");
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureType, "");
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.camera2.impl.MeteringRepeating.Builder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionUnpacker, "");
            return this;
        }
    }

    public static /* synthetic */ void $r8$lambda$BPlB8isfuWKFvMqTcjDrqYh8Ecw(androidx.camera.camera2.impl.MeteringRepeating meteringRepeating, android.util.Size size, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionError, "");
        meteringRepeating.updateSessionConfig(kotlin.collections.CollectionsKt.listOf(meteringRepeating.getHighSpeedVideoFpsRanges(size).build()));
        meteringRepeating.notifyReset();
    }

    public static /* synthetic */ void $r8$lambda$Q7CbjLDnricLd1mJRiIT8an2ZhA(android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }
}
