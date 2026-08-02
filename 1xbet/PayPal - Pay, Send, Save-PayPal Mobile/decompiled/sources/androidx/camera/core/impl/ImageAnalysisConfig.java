package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class ImageAnalysisConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.ImageAnalysis>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.ThreadConfig {
    private final androidx.camera.core.impl.OptionsBundle getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_BACKPRESSURE_STRATEGY = androidx.camera.core.impl.Config.Option.create("camerax.core.imageAnalysis.backpressureStrategy", androidx.camera.core.ImageAnalysis.BackpressureStrategy.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_IMAGE_QUEUE_DEPTH = androidx.camera.core.impl.Config.Option.create("camerax.core.imageAnalysis.imageQueueDepth", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER = androidx.camera.core.impl.Config.Option.create("camerax.core.imageAnalysis.imageReaderProxyProvider", androidx.camera.core.ImageReaderProxyProvider.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_OUTPUT_IMAGE_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageAnalysis.outputImageFormat", androidx.camera.core.ImageAnalysis.OutputImageFormat.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_ONE_PIXEL_SHIFT_ENABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.imageAnalysis.onePixelShiftEnabled", java.lang.Boolean.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_OUTPUT_IMAGE_ROTATION_ENABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.imageAnalysis.outputImageRotationEnabled", java.lang.Boolean.class);

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return 35;
    }

    public ImageAnalysisConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.getHighResolutionOutputSizeshNQ4ISI = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    /* renamed from: getConfig */
    public final androidx.camera.core.impl.Config getGetHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getBackpressureStrategy(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_BACKPRESSURE_STRATEGY, java.lang.Integer.valueOf(i))).intValue();
    }

    public final int getBackpressureStrategy() {
        return ((java.lang.Integer) retrieveOption(OPTION_BACKPRESSURE_STRATEGY)).intValue();
    }

    public final int getImageQueueDepth(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_IMAGE_QUEUE_DEPTH, java.lang.Integer.valueOf(i))).intValue();
    }

    public final int getImageQueueDepth() {
        return ((java.lang.Integer) retrieveOption(OPTION_IMAGE_QUEUE_DEPTH)).intValue();
    }

    public final int getOutputImageFormat(int i) {
        return ((java.lang.Integer) retrieveOption(OPTION_OUTPUT_IMAGE_FORMAT, java.lang.Integer.valueOf(i))).intValue();
    }

    public final java.lang.Boolean getOnePixelShiftEnabled(java.lang.Boolean bool) {
        return (java.lang.Boolean) retrieveOption(OPTION_ONE_PIXEL_SHIFT_ENABLED, bool);
    }

    public final java.lang.Boolean isOutputImageRotationEnabled(java.lang.Boolean bool) {
        return (java.lang.Boolean) retrieveOption(OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, bool);
    }

    public final androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (androidx.camera.core.ImageReaderProxyProvider) retrieveOption(OPTION_IMAGE_READER_PROXY_PROVIDER, null);
    }
}
