package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface UseCaseConfig<T extends androidx.camera.core.UseCase> extends androidx.camera.core.internal.TargetConfig<T>, androidx.camera.core.impl.ImageInputConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.defaultSessionConfig", androidx.camera.core.impl.SessionConfig.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.defaultCaptureConfig", androidx.camera.core.impl.CaptureConfig.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", androidx.camera.core.impl.SessionConfig.OptionUnpacker.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.captureConfigUnpacker", androidx.camera.core.impl.CaptureConfig.OptionUnpacker.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_SESSION_TYPE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.sessionType", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<android.util.Range<java.lang.Integer>> OPTION_TARGET_FRAME_RATE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.targetFrameRate", android.util.Range.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_IS_STRICT_FRAME_RATE_REQUIRED = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.isStrictFrameRateRequired", java.lang.Boolean.class);
    public static final androidx.camera.core.impl.Config.Option<java.util.Map<android.util.Size, java.lang.Integer>> OPTION_RESOLUTION_TO_MAX_FRAME_RATES = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.resolutionToMaxFrameRate", java.util.Map.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_ZSL_DISABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.zslDisabled", java.lang.Boolean.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_HIGH_RESOLUTION_DISABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.highResolutionDisabled", java.lang.Boolean.TYPE);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> OPTION_CAPTURE_TYPE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.captureType", androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_PREVIEW_STABILIZATION_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.previewStabilizationMode", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_VIDEO_STABILIZATION_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.videoStabilizationMode", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.isVideoQualitySelectorDefault", java.lang.Boolean.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.imagecapture.TakePictureManager.Provider> OPTION_TAKE_PICTURE_MANAGER_PROVIDER = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.takePictureManagerProvider", androidx.camera.core.imagecapture.TakePictureManager.Provider.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.StreamUseCase> OPTION_STREAM_USE_CASE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.streamUseCase", androidx.camera.core.impl.StreamUseCase.class);

    public interface Builder<T extends androidx.camera.core.UseCase, C extends androidx.camera.core.impl.UseCaseConfig<T>, B> extends androidx.camera.core.internal.TargetConfig.Builder<T, B>, androidx.camera.core.ExtendableBuilder<T> {
        C getUseCaseConfig();

        B setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker);

        B setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType);

        B setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig);

        B setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig);

        B setHighResolutionDisabled(boolean z);

        B setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker);

        B setStreamUseCase(androidx.camera.core.impl.StreamUseCase streamUseCase);

        B setSurfaceOccupancyPriority(int i);

        B setZslDisabled(boolean z);
    }

    default androidx.camera.core.impl.SessionConfig getDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        return (androidx.camera.core.impl.SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    default androidx.camera.core.impl.SessionConfig getDefaultSessionConfig() {
        return (androidx.camera.core.impl.SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG);
    }

    default androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
        return (androidx.camera.core.impl.CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    default androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig() {
        return (androidx.camera.core.impl.CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    default androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
        return (androidx.camera.core.impl.SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    default androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return (androidx.camera.core.impl.SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER);
    }

    default androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
        return (androidx.camera.core.impl.CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    default androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return (androidx.camera.core.impl.CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    default int getSurfaceOccupancyPriority(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i))).intValue();
    }

    default int getSurfaceOccupancyPriority() {
        return ((java.lang.Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    default int getSessionType(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_SESSION_TYPE, java.lang.Integer.valueOf(i))).intValue();
    }

    default int getSessionType() {
        return ((java.lang.Integer) retrieveOption(OPTION_SESSION_TYPE)).intValue();
    }

    default boolean hasTargetFrameRate() {
        return containsOption(OPTION_TARGET_FRAME_RATE);
    }

    default android.util.Range<java.lang.Integer> getTargetFrameRate(android.util.Range<java.lang.Integer> range) {
        return (android.util.Range) retrieveOption(OPTION_TARGET_FRAME_RATE, range);
    }

    default android.util.Range<java.lang.Integer> getTargetFrameRate() {
        return (android.util.Range) retrieveOption(OPTION_TARGET_FRAME_RATE);
    }

    default boolean isStrictFrameRateRequired() {
        return ((java.lang.Boolean) java.util.Objects.requireNonNull((java.lang.Boolean) retrieveOption(OPTION_IS_STRICT_FRAME_RATE_REQUIRED, java.lang.Boolean.FALSE))).booleanValue();
    }

    default int getCustomMaxFrameRate(android.util.Size size) {
        java.util.Map map = (java.util.Map) retrieveOption(OPTION_RESOLUTION_TO_MAX_FRAME_RATES, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        return ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) map.get(size))).intValue();
    }

    default boolean isZslDisabled(boolean z) {
        return ((java.lang.Boolean) retrieveOption(OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z))).booleanValue();
    }

    default boolean isHighResolutionDisabled(boolean z) {
        return ((java.lang.Boolean) retrieveOption(OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z))).booleanValue();
    }

    default androidx.camera.core.impl.UseCaseConfigFactory.CaptureType getCaptureType() {
        return (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType) retrieveOption(OPTION_CAPTURE_TYPE);
    }

    default int getPreviewStabilizationMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_PREVIEW_STABILIZATION_MODE, 0)).intValue();
    }

    default int getVideoStabilizationMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_VIDEO_STABILIZATION_MODE, 0)).intValue();
    }

    default androidx.camera.core.imagecapture.TakePictureManager.Provider getTakePictureManagerProvider() {
        return (androidx.camera.core.imagecapture.TakePictureManager.Provider) java.util.Objects.requireNonNull((androidx.camera.core.imagecapture.TakePictureManager.Provider) retrieveOption(OPTION_TAKE_PICTURE_MANAGER_PROVIDER, new androidx.camera.core.imagecapture.TakePictureManager.Provider() { // from class: androidx.camera.core.impl.UseCaseConfig.1
            @Override // androidx.camera.core.imagecapture.TakePictureManager.Provider
            public androidx.camera.core.imagecapture.TakePictureManager newInstance(androidx.camera.core.imagecapture.ImageCaptureControl imageCaptureControl) {
                return new androidx.camera.core.imagecapture.TakePictureManagerImpl(imageCaptureControl);
            }
        }));
    }

    default androidx.camera.core.impl.StreamUseCase getStreamUseCase() {
        return (androidx.camera.core.impl.StreamUseCase) java.util.Objects.requireNonNull((androidx.camera.core.impl.StreamUseCase) retrieveOption(OPTION_STREAM_USE_CASE, androidx.camera.core.impl.StreamUseCase.DEFAULT));
    }
}
