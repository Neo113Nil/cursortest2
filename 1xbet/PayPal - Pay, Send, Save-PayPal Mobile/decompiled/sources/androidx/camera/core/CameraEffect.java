package androidx.camera.core;

/* loaded from: classes6.dex */
public abstract class CameraEffect {
    public static final int IMAGE_CAPTURE = 4;
    public static final int OUTPUT_OPTION_ONE_FOR_ALL_TARGETS = 0;
    public static final int OUTPUT_OPTION_ONE_FOR_EACH_TARGET = 1;
    public static final int PREVIEW = 1;
    public static final int TRANSFORMATION_ARBITRARY = 0;
    public static final int TRANSFORMATION_CAMERA_AND_SURFACE_ROTATION = 1;
    public static final int TRANSFORMATION_PASSTHROUGH = 2;
    public static final int VIDEO_CAPTURE = 2;
    private static final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges = java.util.Arrays.asList(1, 2, 3, 7);
    private final androidx.camera.core.ImageProcessor Camera2StreamConfigurationMap;
    private final androidx.core.util.Consumer<java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final androidx.camera.core.SurfaceProcessor getInputFormats;
    private final int getOutputFormats;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Formats {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface OutputOptions {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Targets {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Transformations {
    }

    protected CameraEffect(int i, java.util.concurrent.Executor executor, androidx.camera.core.ImageProcessor imageProcessor, androidx.core.util.Consumer<java.lang.Throwable> consumer) {
        androidx.core.util.Preconditions.checkArgument(i == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.getOutputFormats = i;
        this.getHighSpeedVideoSizesFor = 0;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = executor;
        this.getInputFormats = null;
        this.Camera2StreamConfigurationMap = imageProcessor;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
    }

    protected CameraEffect(int i, int i2, java.util.concurrent.Executor executor, androidx.camera.core.SurfaceProcessor surfaceProcessor, androidx.core.util.Consumer<java.lang.Throwable> consumer) {
        this(i, 0, i2, executor, surfaceProcessor, consumer);
    }

    protected CameraEffect(int i, int i2, int i3, java.util.concurrent.Executor executor, androidx.camera.core.SurfaceProcessor surfaceProcessor, androidx.core.util.Consumer<java.lang.Throwable> consumer) {
        androidx.camera.core.processing.TargetUtils.checkSupportedTargets(getHighSpeedVideoFpsRanges, i);
        this.getOutputFormats = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoSizesFor = i3;
        this.getHighSpeedVideoFpsRangesFor = executor;
        this.getInputFormats = surfaceProcessor;
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
    }

    protected CameraEffect(int i, java.util.concurrent.Executor executor, androidx.camera.core.SurfaceProcessor surfaceProcessor, androidx.core.util.Consumer<java.lang.Throwable> consumer) {
        this(i, 0, 0, executor, surfaceProcessor, consumer);
    }

    public int getTargets() {
        return this.getOutputFormats;
    }

    public int getTransformation() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int getOutputOption() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.core.util.Consumer<java.lang.Throwable> getErrorListener() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public androidx.camera.core.SurfaceProcessor getSurfaceProcessor() {
        return this.getInputFormats;
    }

    public androidx.camera.core.ImageProcessor getImageProcessor() {
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.camera.core.processing.SurfaceProcessorInternal createSurfaceProcessorInternal() {
        return new androidx.camera.core.processing.SurfaceProcessorWithExecutor(this);
    }
}
