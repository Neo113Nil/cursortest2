package androidx.camera.core;

/* loaded from: classes.dex */
public final class Preview extends androidx.camera.core.UseCase {
    public static final androidx.camera.core.Preview.Defaults DEFAULT_CONFIG = new androidx.camera.core.Preview.Defaults();
    private static final java.util.concurrent.Executor getHighSpeedVideoFpsRanges = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener Camera2StreamConfigurationMap;
    androidx.camera.core.processing.SurfaceEdge getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.impl.SessionConfig.Builder getHighSpeedVideoFpsRangesFor;
    androidx.camera.core.SurfaceRequest getHighSpeedVideoSizes;
    private androidx.camera.core.impl.DeferrableSurface getInputFormats;
    private java.util.concurrent.Executor getInputSizeshNQ4ISI;
    private androidx.camera.core.Preview.SurfaceProvider getOutputFormats;
    private androidx.camera.core.processing.SurfaceProcessorNode getOutputMinFrameDuration;

    public interface SurfaceProvider {
        void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest);
    }

    Preview(androidx.camera.core.impl.PreviewConfig previewConfig) {
        super(previewConfig);
        this.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRanges;
    }

    private void getHighSpeedVideoSizes() {
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.Camera2StreamConfigurationMap;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.Camera2StreamConfigurationMap = null;
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.getInputFormats;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.getInputFormats = null;
        }
        androidx.camera.core.processing.SurfaceProcessorNode surfaceProcessorNode = this.getOutputMinFrameDuration;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.getOutputMinFrameDuration = null;
        }
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.getHighResolutionOutputSizeshNQ4ISI;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        androidx.camera.core.SurfaceRequest surfaceRequest = this.getHighSpeedVideoSizes;
        if (surfaceRequest != null) {
            surfaceRequest.clearTransformationInfoListener();
        }
        this.getHighSpeedVideoSizes = null;
    }

    final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI() {
        if (getCamera() == null) {
            return;
        }
        getHighSpeedVideoFpsRanges((androidx.camera.core.impl.PreviewConfig) getCurrentConfig(), getAttachedStreamSpec());
        notifyReset();
    }

    public final void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            Camera2StreamConfigurationMap();
        }
    }

    private void Camera2StreamConfigurationMap() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        surfaceEdge.updateTransformation(getRelativeRotation(camera, isMirroringRequired(camera)), getAppTargetRotation());
    }

    public final void setSurfaceProvider(java.util.concurrent.Executor executor, androidx.camera.core.Preview.SurfaceProvider surfaceProvider) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (surfaceProvider == null) {
            this.getOutputFormats = null;
            notifyInactive();
            return;
        }
        this.getOutputFormats = surfaceProvider;
        this.getInputSizeshNQ4ISI = executor;
        if (getAttachedSurfaceResolution() != null) {
            getHighSpeedVideoFpsRanges((androidx.camera.core.impl.PreviewConfig) getCurrentConfig(), getAttachedStreamSpec());
            notifyReset();
        }
        notifyActive();
    }

    public final androidx.camera.core.Preview.SurfaceProvider getSurfaceProvider() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputFormats;
    }

    public final void setSurfaceProvider(androidx.camera.core.Preview.SurfaceProvider surfaceProvider) {
        setSurfaceProvider(getHighSpeedVideoFpsRanges, surfaceProvider);
    }

    public final int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public final androidx.camera.core.ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public final androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
        return ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Preview:");
        sb.append(getName());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.Preview.Defaults defaults = DEFAULT_CONFIG;
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return androidx.camera.core.Preview.Builder.getHighSpeedVideoSizes(config);
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        getHighSpeedVideoSizes();
    }

    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onSuggestedStreamSpecUpdated: primaryStreamSpec = ");
        sb.append(streamSpec);
        sb.append(", secondaryStreamSpec ");
        sb.append(streamSpec2);
        androidx.camera.core.Logger.d("Preview", sb.toString());
        getHighSpeedVideoFpsRanges((androidx.camera.core.impl.PreviewConfig) getCurrentConfig(), streamSpec);
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        this.getHighSpeedVideoFpsRangesFor.addImplementationOptions(config);
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighSpeedVideoFpsRangesFor.build()});
        updateSessionConfig(m);
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    public final void setViewPortCropRect(android.graphics.Rect rect) {
        super.setViewPortCropRect(rect);
        Camera2StreamConfigurationMap();
    }

    public final androidx.camera.core.processing.SurfaceEdge getCameraEdge() {
        return (androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.camera.core.UseCase
    public final java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final android.util.Range<java.lang.Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }

    public final androidx.camera.core.DynamicRange getDynamicRange() {
        return getCurrentConfig().hasDynamicRange() ? getCurrentConfig().getDynamicRange() : androidx.camera.core.Preview.Defaults.getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.camera.core.PreviewCapabilities getPreviewCapabilities(androidx.camera.core.CameraInfo cameraInfo) {
        return androidx.camera.core.impl.capability.PreviewCapabilitiesImpl.from(cameraInfo);
    }

    public final boolean isPreviewStabilizationEnabled() {
        return getCurrentConfig().getPreviewStabilizationMode() == 2;
    }

    /* loaded from: classes6.dex */
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.PreviewConfig> {
        private static final androidx.camera.core.resolutionselector.ResolutionSelector getHighResolutionOutputSizeshNQ4ISI;
        private static final androidx.camera.core.impl.PreviewConfig getHighSpeedVideoFpsRanges;
        private static final androidx.camera.core.DynamicRange getHighSpeedVideoFpsRangesFor;

        static {
            androidx.camera.core.resolutionselector.ResolutionSelector build = new androidx.camera.core.resolutionselector.ResolutionSelector.Builder().setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            getHighResolutionOutputSizeshNQ4ISI = build;
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.UNSPECIFIED;
            getHighSpeedVideoFpsRangesFor = dynamicRange;
            getHighSpeedVideoFpsRanges = new androidx.camera.core.Preview.Builder().setSurfaceOccupancyPriority(2).setTargetAspectRatio(0).setResolutionSelector(build).setHighResolutionDisabled(true).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public final androidx.camera.core.impl.PreviewConfig getConfig() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public static final class Builder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.Preview, androidx.camera.core.impl.PreviewConfig, androidx.camera.core.Preview.Builder>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.Preview.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.Preview.Builder>, androidx.camera.core.internal.ThreadConfig.Builder<androidx.camera.core.Preview.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle getHighResolutionOutputSizeshNQ4ISI;

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setCustomOrderedResolutions(java.util.List list) {
            return setCustomOrderedResolutions((java.util.List<android.util.Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.core.Preview.Builder setSupportedResolutions(java.util.List list) {
            return setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
            return setTargetClass((java.lang.Class<androidx.camera.core.Preview>) cls);
        }

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.getHighResolutionOutputSizeshNQ4ISI = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.Preview.class)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid target class configuration for ");
                sb.append(this);
                sb.append(": ");
                sb.append(cls);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW);
            setTargetClass(androidx.camera.core.Preview.class);
            if (((java.lang.Integer) mutableOptionsBundle.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE, -1)).intValue() == -1) {
                mutableOptionsBundle.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE, 2);
            }
        }

        static androidx.camera.core.Preview.Builder getHighSpeedVideoSizes(androidx.camera.core.impl.Config config) {
            return new androidx.camera.core.Preview.Builder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
        }

        public static androidx.camera.core.Preview.Builder fromConfig(androidx.camera.core.impl.PreviewConfig previewConfig) {
            return new androidx.camera.core.Preview.Builder(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) previewConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.impl.PreviewConfig getUseCaseConfig() {
            return new androidx.camera.core.impl.PreviewConfig(androidx.camera.core.impl.OptionsBundle.from(this.getHighResolutionOutputSizeshNQ4ISI));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.Preview build() {
            androidx.camera.core.impl.PreviewConfig useCaseConfig = getUseCaseConfig();
            androidx.camera.core.impl.ImageOutputConfig.validateConfig(useCaseConfig);
            return new androidx.camera.core.Preview(useCaseConfig);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.Preview.Builder setTargetClass(java.lang.Class<androidx.camera.core.Preview> cls) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.impl.PreviewConfig.OPTION_TARGET_NAME, null) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls.getCanonicalName());
                sb.append("-");
                sb.append(java.util.UUID.randomUUID());
                setTargetName(sb.toString());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.Preview.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public final androidx.camera.core.Preview.Builder setTargetAspectRatio(int i) {
            if (i == -1) {
                i = 0;
            }
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_TARGET_ASPECT_RATIO, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.Preview.Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i));
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_APP_TARGET_ROTATION, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.Preview.Builder setMirrorMode(int i) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MIRROR_MODE, java.lang.Integer.valueOf(i));
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public final androidx.camera.core.Preview.Builder setTargetResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.Preview.Builder setDefaultResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.Preview.Builder setMaxResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.Preview.Builder setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.Preview.Builder setCustomOrderedResolutions(java.util.List<android.util.Size> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.Preview.Builder setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public final androidx.camera.core.Preview.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public final androidx.camera.core.Preview.Builder setBackgroundExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        public final androidx.camera.core.Preview.Builder setTargetFrameRate(android.util.Range<java.lang.Integer> range) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }

        public final androidx.camera.core.Preview.Builder setPreviewStabilizationEnabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, java.lang.Integer.valueOf(z ? 2 : 1));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.PreviewConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setZslDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setHighResolutionDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.Preview.Builder setStreamUseCase(androidx.camera.core.impl.StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }
    }

    private void getHighSpeedVideoFpsRanges(androidx.camera.core.impl.PreviewConfig previewConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        android.graphics.Rect rect;
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        final androidx.camera.core.impl.CameraInternal cameraInternal = (androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera());
        getHighSpeedVideoSizes();
        androidx.core.util.Preconditions.checkState(this.getHighResolutionOutputSizeshNQ4ISI == null);
        android.graphics.Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        boolean hasTransform = cameraInternal.getHasTransform();
        android.util.Size resolution = streamSpec.getResolution();
        if (getViewPortCropRect() != null) {
            rect = getViewPortCropRect();
        } else {
            rect = resolution != null ? new android.graphics.Rect(0, 0, resolution.getWidth(), resolution.getHeight()) : null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.processing.SurfaceEdge(1, 34, streamSpec, sensorToBufferTransformMatrix, hasTransform, (android.graphics.Rect) java.util.Objects.requireNonNull(rect), getRelativeRotation(cameraInternal, isMirroringRequired(cameraInternal)), getAppTargetRotation(), cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal));
        androidx.camera.core.CameraEffect effect = getEffect();
        if (effect != null) {
            this.getOutputMinFrameDuration = new androidx.camera.core.processing.SurfaceProcessorNode(cameraInternal, effect.createSurfaceProcessorInternal(), "Preview");
            this.getHighResolutionOutputSizeshNQ4ISI.addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Preview.this.notifyReset();
                }
            });
            androidx.camera.core.processing.util.OutConfig of = androidx.camera.core.processing.util.OutConfig.of(this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.camera.core.processing.SurfaceEdge surfaceEdge = (androidx.camera.core.processing.SurfaceEdge) java.util.Objects.requireNonNull(this.getOutputMinFrameDuration.transform(androidx.camera.core.processing.SurfaceProcessorNode.In.of(this.getHighResolutionOutputSizeshNQ4ISI, java.util.Collections.singletonList(of))).get(of));
            surfaceEdge.addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Preview preview = androidx.camera.core.Preview.this;
                    androidx.camera.core.impl.CameraInternal cameraInternal2 = cameraInternal;
                    androidx.camera.core.processing.SurfaceEdge surfaceEdge2 = preview.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.camera.core.impl.utils.Threads.checkMainThread();
                    if (cameraInternal2 == preview.getCamera()) {
                        surfaceEdge2.invalidate();
                    }
                }
            });
            this.getHighSpeedVideoSizes = surfaceEdge.createSurfaceRequest(cameraInternal);
            this.getInputFormats = this.getHighResolutionOutputSizeshNQ4ISI.getDeferrableSurface();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Preview.this.notifyReset();
                }
            });
            androidx.camera.core.SurfaceRequest createSurfaceRequest = this.getHighResolutionOutputSizeshNQ4ISI.createSurfaceRequest(cameraInternal);
            this.getHighSpeedVideoSizes = createSurfaceRequest;
            this.getInputFormats = createSurfaceRequest.getDeferrableSurface();
        }
        if (this.getOutputFormats != null) {
            Camera2StreamConfigurationMap();
            final androidx.camera.core.Preview.SurfaceProvider surfaceProvider = (androidx.camera.core.Preview.SurfaceProvider) androidx.core.util.Preconditions.checkNotNull(this.getOutputFormats);
            final androidx.camera.core.SurfaceRequest surfaceRequest = (androidx.camera.core.SurfaceRequest) androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoSizes);
            this.getInputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.Preview.SurfaceProvider.this.onSurfaceRequested(surfaceRequest);
                }
            });
        }
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(previewConfig, streamSpec.getResolution());
        createFrom.setSessionType(streamSpec.getSessionType());
        applyExpectedFrameRateRange(createFrom, streamSpec);
        createFrom.setPreviewStabilization(previewConfig.getPreviewStabilizationMode());
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        if (this.getOutputFormats != null) {
            createFrom.addSurface(this.getInputFormats, streamSpec.getDynamicRange(), getPhysicalCameraId(), getMirrorModeInternal());
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.Camera2StreamConfigurationMap;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.Preview$$ExternalSyntheticLambda3
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.core.Preview.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        });
        this.Camera2StreamConfigurationMap = closeableErrorListener2;
        createFrom.setErrorListener(closeableErrorListener2);
        this.getHighSpeedVideoFpsRangesFor = createFrom;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{createFrom.build()});
        updateSessionConfig(m);
    }
}
