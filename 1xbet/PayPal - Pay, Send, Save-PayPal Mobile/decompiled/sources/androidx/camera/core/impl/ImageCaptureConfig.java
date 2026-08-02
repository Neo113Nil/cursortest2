package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class ImageCaptureConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.ImageCapture>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.IoConfig {
    private final androidx.camera.core.impl.OptionsBundle getHighSpeedVideoFpsRangesFor;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_IMAGE_CAPTURE_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.captureMode", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_FLASH_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.flashMode", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureBundle> OPTION_CAPTURE_BUNDLE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.captureBundle", androidx.camera.core.impl.CaptureBundle.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_BUFFER_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.bufferFormat", java.lang.Integer.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_OUTPUT_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.outputFormat", java.lang.Integer.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_MAX_CAPTURE_STAGES = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.maxCaptureStages", java.lang.Integer.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.imageReaderProxyProvider", androidx.camera.core.ImageReaderProxyProvider.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_USE_SOFTWARE_JPEG_ENCODER = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.useSoftwareJpegEncoder", java.lang.Boolean.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_FLASH_TYPE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.flashType", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_JPEG_COMPRESSION_QUALITY = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.jpegCompressionQuality", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.ImageCapture.ScreenFlash> OPTION_SCREEN_FLASH = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.screenFlash", androidx.camera.core.ImageCapture.ScreenFlash.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.resolutionselector.ResolutionSelector> OPTION_POSTVIEW_RESOLUTION_SELECTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.postviewResolutionSelector", androidx.camera.core.resolutionselector.ResolutionSelector.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_POSTVIEW_ENABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.isPostviewEnabled", java.lang.Boolean.class);

    public ImageCaptureConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.getHighSpeedVideoFpsRangesFor = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* renamed from: getConfig */
    public final androidx.camera.core.impl.Config getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean hasCaptureMode() {
        return containsOption(OPTION_IMAGE_CAPTURE_MODE);
    }

    public final int getCaptureMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_IMAGE_CAPTURE_MODE)).intValue();
    }

    public final int getFlashMode(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_MODE, java.lang.Integer.valueOf(i))).intValue();
    }

    public final int getFlashMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_MODE)).intValue();
    }

    public final androidx.camera.core.impl.CaptureBundle getCaptureBundle(androidx.camera.core.impl.CaptureBundle captureBundle) {
        return (androidx.camera.core.impl.CaptureBundle) retrieveOption(OPTION_CAPTURE_BUNDLE, captureBundle);
    }

    public final androidx.camera.core.impl.CaptureBundle getCaptureBundle() {
        return (androidx.camera.core.impl.CaptureBundle) retrieveOption(OPTION_CAPTURE_BUNDLE);
    }

    public final java.lang.Integer getBufferFormat(java.lang.Integer num) {
        return (java.lang.Integer) retrieveOption(OPTION_BUFFER_FORMAT, num);
    }

    public final java.lang.Integer getBufferFormat() {
        return (java.lang.Integer) retrieveOption(OPTION_BUFFER_FORMAT);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return ((java.lang.Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }

    public final int getMaxCaptureStages(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_MAX_CAPTURE_STAGES, java.lang.Integer.valueOf(i))).intValue();
    }

    public final int getMaxCaptureStages() {
        return ((java.lang.Integer) retrieveOption(OPTION_MAX_CAPTURE_STAGES)).intValue();
    }

    public final androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (androidx.camera.core.ImageReaderProxyProvider) retrieveOption(OPTION_IMAGE_READER_PROXY_PROVIDER, null);
    }

    public final boolean isSoftwareJpegEncoderRequested() {
        return ((java.lang.Boolean) retrieveOption(OPTION_USE_SOFTWARE_JPEG_ENCODER, java.lang.Boolean.FALSE)).booleanValue();
    }

    public final int getFlashType(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_TYPE, java.lang.Integer.valueOf(i))).intValue();
    }

    public final int getFlashType() {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_TYPE)).intValue();
    }

    public final int getJpegQuality(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_JPEG_COMPRESSION_QUALITY, java.lang.Integer.valueOf(i))).intValue();
    }

    public final int getJpegQuality() {
        return ((java.lang.Integer) retrieveOption(OPTION_JPEG_COMPRESSION_QUALITY)).intValue();
    }

    public final androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return (androidx.camera.core.ImageCapture.ScreenFlash) retrieveOption(OPTION_SCREEN_FLASH, null);
    }

    public final androidx.camera.core.resolutionselector.ResolutionSelector getPostviewResolutionSelector() {
        return (androidx.camera.core.resolutionselector.ResolutionSelector) retrieveOption(OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
    }

    public final boolean isPostviewEnabled() {
        return ((java.lang.Boolean) retrieveOption(OPTION_POSTVIEW_ENABLED, java.lang.Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.internal.IoConfig
    public final java.util.concurrent.Executor getIoExecutor(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) retrieveOption(OPTION_IO_EXECUTOR, executor);
    }

    @Override // androidx.camera.core.internal.IoConfig
    public final java.util.concurrent.Executor getIoExecutor() {
        return (java.util.concurrent.Executor) retrieveOption(OPTION_IO_EXECUTOR);
    }
}
