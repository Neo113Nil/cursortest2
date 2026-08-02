package androidx.camera.video.impl;

/* loaded from: classes6.dex */
public final class VideoCaptureConfig<T extends androidx.camera.video.VideoOutput> implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.video.VideoCapture<T>>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.ThreadConfig {
    private final androidx.camera.core.impl.OptionsBundle getHighSpeedVideoFpsRanges;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.video.VideoOutput> OPTION_VIDEO_OUTPUT = androidx.camera.core.impl.Config.Option.create("camerax.video.VideoCapture.videoOutput", androidx.camera.video.VideoOutput.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder> OPTION_VIDEO_ENCODER_INFO_FINDER = androidx.camera.core.impl.Config.Option.create("camerax.video.VideoCapture.videoEncoderInfoFinder", androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_FORCE_ENABLE_SURFACE_PROCESSING = androidx.camera.core.impl.Config.Option.create("camerax.video.VideoCapture.forceEnableSurfaceProcessing", java.lang.Boolean.class);

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return 34;
    }

    public VideoCaptureConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        androidx.core.util.Preconditions.checkArgument(optionsBundle.containsOption(OPTION_VIDEO_OUTPUT));
        this.getHighSpeedVideoFpsRanges = optionsBundle;
    }

    public final T getVideoOutput() {
        return (T) java.util.Objects.requireNonNull((androidx.camera.video.VideoOutput) retrieveOption(OPTION_VIDEO_OUTPUT));
    }

    public final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder getVideoEncoderInfoFinder() {
        return (androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder) java.util.Objects.requireNonNull((androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder) retrieveOption(OPTION_VIDEO_ENCODER_INFO_FINDER));
    }

    public final boolean isSurfaceProcessingForceEnabled() {
        return ((java.lang.Boolean) java.util.Objects.requireNonNull((java.lang.Boolean) retrieveOption(OPTION_FORCE_ENABLE_SURFACE_PROCESSING, java.lang.Boolean.FALSE))).booleanValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* renamed from: getConfig */
    public final androidx.camera.core.impl.Config getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
