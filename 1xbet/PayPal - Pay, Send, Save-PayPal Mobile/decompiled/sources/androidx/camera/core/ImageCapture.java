package androidx.camera.core;

/* loaded from: classes.dex */
public final class ImageCapture extends androidx.camera.core.UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    public static final int FLASH_MODE_SCREEN = 3;
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    public static final int OUTPUT_FORMAT_JPEG = 0;
    public static final int OUTPUT_FORMAT_JPEG_ULTRA_HDR = 1;
    public static final int OUTPUT_FORMAT_RAW = 2;
    public static final int OUTPUT_FORMAT_RAW_JPEG = 3;
    public static final long SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS = 3;
    private final int Camera2StreamConfigurationMap;
    androidx.camera.core.impl.SessionConfig.Builder getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> getHighSpeedVideoFpsRanges;
    androidx.camera.core.imagecapture.TakePictureManager getHighSpeedVideoSizes;
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener getInputSizeshNQ4ISI;
    private android.util.Rational getOutputFormats;
    private final int getOutputMinFrameDuration;
    private androidx.camera.core.internal.ScreenFlashWrapper getOutputMinFrameDurationlomOqCM;
    private androidx.camera.core.imagecapture.ImagePipeline getOutputSizeshNQ4ISI;
    private final androidx.camera.core.imagecapture.ImageCaptureControl getOutputStallDuration;
    public static final androidx.camera.core.ImageCapture.Defaults DEFAULT_CONFIG = new androidx.camera.core.ImageCapture.Defaults();
    static final androidx.camera.core.internal.compat.workaround.ExifRotationAvailability getHighSpeedVideoFpsRangesFor = new androidx.camera.core.internal.compat.workaround.ExifRotationAvailability();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CaptureMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FlashMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FlashType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ImageCaptureError {
    }

    /* loaded from: classes6.dex */
    public static abstract class OnImageCapturedCallback {
        public void onCaptureProcessProgressed(int i) {
        }

        public void onCaptureStarted() {
        }

        public void onCaptureSuccess(androidx.camera.core.ImageProxy imageProxy) {
        }

        public void onError(androidx.camera.core.ImageCaptureException imageCaptureException) {
        }

        public void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
        }
    }

    /* loaded from: classes6.dex */
    public interface OnImageSavedCallback {
        default void onCaptureProcessProgressed(int i) {
        }

        default void onCaptureStarted() {
        }

        void onError(androidx.camera.core.ImageCaptureException imageCaptureException);

        void onImageSaved(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults);

        default void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap) {
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface OutputFormat {
    }

    /* loaded from: classes6.dex */
    public interface ScreenFlash {
        void apply(long j, androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener);

        void clear();
    }

    /* loaded from: classes6.dex */
    public interface ScreenFlashListener {
        void onCompleted();
    }

    static /* synthetic */ java.lang.Void getHighSpeedVideoFpsRanges() {
        return null;
    }

    @Override // androidx.camera.core.UseCase
    public final boolean isAutoRotationSupported() {
        return true;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        try {
            androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    ImageCapture(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.getInputSizeshNQ4ISI = new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                androidx.camera.core.ImageCapture.getHighSpeedVideoSizes(imageReaderProxy);
            }
        };
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.getInputFormats = -1;
        this.getOutputFormats = null;
        this.getOutputStallDuration = new androidx.camera.core.imagecapture.ImageCaptureControl() { // from class: androidx.camera.core.ImageCapture.1
            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public void lockFlashMode() {
                androidx.camera.core.ImageCapture imageCapture = androidx.camera.core.ImageCapture.this;
                synchronized (imageCapture.getHighSpeedVideoFpsRanges) {
                    if (imageCapture.getHighSpeedVideoFpsRanges.get() != null) {
                        return;
                    }
                    imageCapture.getHighSpeedVideoFpsRanges.set(java.lang.Integer.valueOf(imageCapture.getFlashMode()));
                }
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public void unlockFlashMode() {
                androidx.camera.core.ImageCapture.this.Camera2StreamConfigurationMap();
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
                return androidx.camera.core.ImageCapture.this.getHighSpeedVideoFpsRangesFor(list);
            }
        };
        androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig2 = (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig2.containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            this.Camera2StreamConfigurationMap = imageCaptureConfig2.getCaptureMode();
        } else {
            this.Camera2StreamConfigurationMap = 1;
        }
        this.getOutputMinFrameDuration = imageCaptureConfig2.getFlashType(0);
        this.getOutputMinFrameDurationlomOqCM = androidx.camera.core.internal.ScreenFlashWrapper.from(imageCaptureConfig2.getScreenFlash());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean z, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        androidx.camera.core.ImageCapture.Defaults defaults = DEFAULT_CONFIG;
        androidx.camera.core.impl.Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), getCaptureMode());
        if (z) {
            config = androidx.camera.core.impl.Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config) {
        return androidx.camera.core.ImageCapture.Builder.fromConfig(config);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i) {
        if (list == null) {
            return false;
        }
        java.util.Iterator<android.util.Pair<java.lang.Integer, android.util.Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.Integer) it.next().first).equals(java.lang.Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.UseCase
    public final void onCameraControlReady() {
        androidx.camera.core.Logger.d("ImageCapture", "onCameraControlReady");
        getHighSpeedVideoSizes();
        getCameraControl().setScreenFlash(this.getOutputMinFrameDurationlomOqCM);
    }

    public final int getFlashMode() {
        int i;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            i = this.getInputFormats;
            if (i == -1) {
                i = ((androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return i;
    }

    public final void setFlashMode(int i) {
        androidx.camera.core.impl.CameraInternal camera;
        androidx.camera.core.Logger.d("ImageCapture", "setFlashMode: flashMode = ".concat(java.lang.String.valueOf(i)));
        if (i != 0 && i != 1 && i != 2) {
            if (i == 3) {
                if (this.getOutputMinFrameDurationlomOqCM.getGetHighResolutionOutputSizeshNQ4ISI() == null) {
                    throw new java.lang.IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
                if (getCamera() != null && ((camera = getCamera()) == null || camera.getCameraInfo().getLensFacing() != 0)) {
                    throw new java.lang.IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            } else {
                throw new java.lang.IllegalArgumentException("Invalid flash mode: ".concat(java.lang.String.valueOf(i)));
            }
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getInputFormats = i;
            getHighSpeedVideoSizes();
        }
    }

    public final void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        androidx.camera.core.internal.ScreenFlashWrapper from = androidx.camera.core.internal.ScreenFlashWrapper.from(screenFlash);
        this.getOutputMinFrameDurationlomOqCM = from;
        getCameraControl().setScreenFlash(from);
    }

    public final androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return this.getOutputMinFrameDurationlomOqCM.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public final void setCropAspectRatio(android.util.Rational rational) {
        this.getOutputFormats = rational;
    }

    public final int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public final void setTargetRotation(int i) {
        int targetRotation = getTargetRotation();
        if (!setTargetRotationInternal(i) || this.getOutputFormats == null) {
            return;
        }
        this.getOutputFormats = androidx.camera.core.internal.utils.ImageUtil.getRotatedAspectRatio(java.lang.Math.abs(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i) - androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)), this.getOutputFormats);
    }

    @Override // androidx.camera.core.UseCase
    protected final void onProviderRotationChanged(int i) {
        setTargetRotation(i);
    }

    public final int getCaptureMode() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getJpegQuality() {
        return getHighSpeedVideoFpsRangesFor();
    }

    public final androidx.camera.core.ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.ResolutionInfo getResolutionInfoInternal() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        android.util.Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        android.graphics.Rect viewPortCropRect = getViewPortCropRect();
        android.util.Rational rational = this.getOutputFormats;
        if (viewPortCropRect == null) {
            if (rational != null) {
                viewPortCropRect = androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational);
            } else {
                viewPortCropRect = new android.graphics.Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
            }
        }
        return new androidx.camera.core.ResolutionInfo(attachedSurfaceResolution, (android.graphics.Rect) java.util.Objects.requireNonNull(viewPortCropRect), getRelativeRotation(camera));
    }

    public final androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
        return ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public final int getOutputFormat() {
        return ((java.lang.Integer) androidx.core.util.Preconditions.checkNotNull((java.lang.Integer) getCurrentConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, 0))).intValue();
    }

    public final void takePicture(final java.util.concurrent.Executor executor, final androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.ImageCapture.this.takePicture(executor, onImageCapturedCallback);
                }
            });
        } else {
            Camera2StreamConfigurationMap(executor, onImageCapturedCallback, null, null, null);
        }
    }

    public final void takePicture(final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, final java.util.concurrent.Executor executor, final androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.ImageCapture.this.takePicture(outputFileOptions, executor, onImageSavedCallback);
                }
            });
        } else {
            Camera2StreamConfigurationMap(executor, null, onImageSavedCallback, outputFileOptions, null);
        }
    }

    public final void takePicture(final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions2, final java.util.concurrent.Executor executor, final androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.ImageCapture.this.takePicture(outputFileOptions, outputFileOptions2, executor, onImageSavedCallback);
                }
            });
        } else {
            Camera2StreamConfigurationMap(executor, null, onImageSavedCallback, outputFileOptions, outputFileOptions2);
        }
    }

    public static androidx.camera.core.ImageCaptureCapabilities getImageCaptureCapabilities(androidx.camera.core.CameraInfo cameraInfo) {
        return new androidx.camera.core.ImageCapture.ImageCaptureCapabilitiesImpl(cameraInfo);
    }

    /* loaded from: classes6.dex */
    static class ImageCaptureCapabilitiesImpl implements androidx.camera.core.ImageCaptureCapabilities {
        private final androidx.camera.core.CameraInfo Camera2StreamConfigurationMap;

        ImageCaptureCapabilitiesImpl(androidx.camera.core.CameraInfo cameraInfo) {
            this.Camera2StreamConfigurationMap = cameraInfo;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isPostviewSupported() {
            androidx.camera.core.CameraInfo cameraInfo = this.Camera2StreamConfigurationMap;
            if (cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal) {
                return ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).isPostviewSupported();
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isCaptureProcessProgressSupported() {
            androidx.camera.core.CameraInfo cameraInfo = this.Camera2StreamConfigurationMap;
            if (cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal) {
                return ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).isCaptureProcessProgressSupported();
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public java.util.Set<java.lang.Integer> getSupportedOutputFormats() {
            java.util.HashSet hashSet;
            androidx.camera.core.impl.Config config;
            androidx.camera.core.CameraInfo cameraInfo = this.Camera2StreamConfigurationMap;
            if ((cameraInfo instanceof androidx.camera.core.impl.AdapterCameraInfo) && (config = ((androidx.camera.core.impl.AdapterCameraInfo) cameraInfo).getCameraConfig().getUseCaseConfigFactory().getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, 1)) != null && config.containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS)) {
                hashSet = new java.util.HashSet();
                hashSet.add(0);
                java.util.Iterator it = ((java.util.List) config.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((java.lang.Integer) ((android.util.Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
            } else {
                hashSet = null;
            }
            if (hashSet != null) {
                return hashSet;
            }
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet2.add(0);
            androidx.camera.core.CameraInfo cameraInfo2 = this.Camera2StreamConfigurationMap;
            if ((cameraInfo2 instanceof androidx.camera.core.impl.CameraInfoInternal) && ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo2).getSupportedOutputFormats().contains(4101)) {
                hashSet2.add(1);
            }
            androidx.camera.core.CameraInfo cameraInfo3 = this.Camera2StreamConfigurationMap;
            if (cameraInfo3 instanceof androidx.camera.core.impl.CameraInfoInternal) {
                androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo3;
                if (cameraInfoInternal.getAvailableCapabilities().contains(3) && cameraInfoInternal.getSupportedOutputFormats().contains(32)) {
                    hashSet2.add(2);
                    hashSet2.add(3);
                }
            }
            return hashSet2;
        }
    }

    final void Camera2StreamConfigurationMap() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            java.lang.Integer andSet = this.getHighSpeedVideoFpsRanges.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != getFlashMode()) {
                getHighSpeedVideoSizes();
            }
        }
    }

    private void getHighSpeedVideoSizes() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRanges.get() != null) {
                return;
            }
            getCameraControl().setFlashMode(getFlashMode());
        }
    }

    private int getHighSpeedVideoFpsRangesFor() {
        androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig = (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig.containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY)) {
            return imageCaptureConfig.getJpegQuality();
        }
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            return 100;
        }
        if (i == 1 || i == 2) {
            return 95;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureMode ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" is invalid");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageCapture:");
        sb.append(getName());
        return sb.toString();
    }

    @Override // androidx.camera.core.UseCase
    public final void onBind() {
        androidx.core.util.Preconditions.checkNotNull(getCamera(), "Attached camera cannot be null");
        if (getFlashMode() == 3) {
            androidx.camera.core.impl.CameraInternal camera = getCamera();
            if (camera == null || camera.getCameraInfo().getLensFacing() != 0) {
                throw new java.lang.IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecUpdated(androidx.camera.core.impl.StreamSpec streamSpec, androidx.camera.core.impl.StreamSpec streamSpec2) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onSuggestedStreamSpecUpdated: primaryStreamSpec = ");
        sb.append(streamSpec);
        sb.append(", secondaryStreamSpec ");
        sb.append(streamSpec2);
        androidx.camera.core.Logger.d("ImageCapture", sb.toString());
        androidx.camera.core.impl.SessionConfig.Builder Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getCameraId(), (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig(), streamSpec);
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{Camera2StreamConfigurationMap.build()});
        updateSessionConfig(m);
        notifyActive();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    protected final androidx.camera.core.impl.StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(androidx.camera.core.impl.Config config) {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        this.getHighResolutionOutputSizeshNQ4ISI.addImplementationOptions(config);
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{this.getHighResolutionOutputSizeshNQ4ISI.build()});
        updateSessionConfig(m);
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private androidx.camera.core.impl.SessionConfig.Builder Camera2StreamConfigurationMap(java.lang.String str, androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig, androidx.camera.core.impl.StreamSpec streamSpec) {
        androidx.camera.core.imagecapture.PostviewSettings postviewSettings;
        java.lang.Object cameraCharacteristics;
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics2;
        androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder;
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener;
        androidx.camera.core.imagecapture.PostviewSettings create;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        new java.lang.Object[]{str, streamSpec};
        android.util.Size resolution = streamSpec.getResolution();
        boolean z = !((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera())).getHasTransform();
        if (this.getOutputSizeshNQ4ISI != null) {
            androidx.core.util.Preconditions.checkState(z);
            this.getOutputSizeshNQ4ISI.close();
        }
        java.util.Set<java.lang.Integer> supportedOutputFormats = getImageCaptureCapabilities(getCamera().getCameraInfo()).getSupportedOutputFormats();
        boolean contains = supportedOutputFormats.contains(java.lang.Integer.valueOf(getOutputFormat()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The specified output format (");
        sb.append(getOutputFormat());
        sb.append(") is not supported by current configuration. Supported output formats: ");
        sb.append(supportedOutputFormats);
        androidx.core.util.Preconditions.checkArgument(contains, sb.toString());
        if (isPostviewEnabled()) {
            int inputFormat = imageCaptureConfig.getInputFormat();
            androidx.camera.core.impl.SessionProcessor sessionProcessor = getCamera().getGetOutputFormats().getSessionProcessor(null);
            if (sessionProcessor != null) {
                java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> supportedPostviewSize = sessionProcessor.getSupportedPostviewSize(resolution);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (getHighSpeedVideoSizes(supportedPostviewSize, 35)) {
                    arrayList.add(35);
                }
                if (getHighSpeedVideoSizes(supportedPostviewSize, 256)) {
                    arrayList.add(256);
                }
                if (getHighSpeedVideoSizes(supportedPostviewSize, 4101)) {
                    arrayList.add(4101);
                }
                int select = !arrayList.isEmpty() ? getCamera().getGetOutputFormats().getPostviewFormatSelector().select(inputFormat, arrayList) : 0;
                if (select != 0) {
                    java.util.List<android.util.Size> list = supportedPostviewSize.get(java.lang.Integer.valueOf(select));
                    androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector = (androidx.camera.core.resolutionselector.ResolutionSelector) getCurrentConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
                    if (resolutionSelector != null) {
                        java.util.Collections.sort(list, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
                        androidx.camera.core.impl.CameraInternal camera = getCamera();
                        android.graphics.Rect sensorRect = camera.getCamera2StreamConfigurationMap().getSensorRect();
                        androidx.camera.core.impl.CameraInfoInternal camera2StreamConfigurationMap = camera.getCamera2StreamConfigurationMap();
                        java.util.List<android.util.Size> sortSupportedOutputSizesByResolutionSelector = androidx.camera.core.internal.SupportedOutputSizesSorter.sortSupportedOutputSizesByResolutionSelector(resolutionSelector, list, null, getTargetRotation(), new android.util.Rational(sensorRect.width(), sensorRect.height()), camera2StreamConfigurationMap.getSensorRotationDegrees(), camera2StreamConfigurationMap.getLensFacing());
                        if (sortSupportedOutputSizesByResolutionSelector.isEmpty()) {
                            throw new java.lang.IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                        }
                        create = androidx.camera.core.imagecapture.PostviewSettings.create(sortSupportedOutputSizesByResolutionSelector.get(0), select);
                    } else {
                        create = androidx.camera.core.imagecapture.PostviewSettings.create((android.util.Size) java.util.Collections.max(list, new androidx.camera.core.impl.utils.CompareSizesByArea()), select);
                    }
                    postviewSettings = create;
                }
            }
            create = null;
            postviewSettings = create;
        } else {
            postviewSettings = null;
        }
        if (getCamera() != null) {
            try {
                cameraCharacteristics = getCamera().getCamera2StreamConfigurationMap().getCameraCharacteristics();
            } catch (java.lang.Exception unused) {
            }
            if (cameraCharacteristics instanceof android.hardware.camera2.CameraCharacteristics) {
                cameraCharacteristics2 = (android.hardware.camera2.CameraCharacteristics) cameraCharacteristics;
                this.getOutputSizeshNQ4ISI = new androidx.camera.core.imagecapture.ImagePipeline(imageCaptureConfig, resolution, cameraCharacteristics2, getEffect(), z, postviewSettings);
                if (this.getHighSpeedVideoSizes == null) {
                    this.getHighSpeedVideoSizes = getCurrentConfig().getTakePictureManagerProvider().newInstance(this.getOutputStallDuration);
                }
                this.getHighSpeedVideoSizes.setImagePipeline(this.getOutputSizeshNQ4ISI);
                createSessionConfigBuilder = this.getOutputSizeshNQ4ISI.createSessionConfigBuilder(streamSpec.getResolution());
                createSessionConfigBuilder.setSessionType(streamSpec.getSessionType());
                if (getCaptureMode() == 2 && !streamSpec.getZslDisabled()) {
                    getCameraControl().addZslConfig(createSessionConfigBuilder);
                }
                if (streamSpec.getImplementationOptions() != null) {
                    createSessionConfigBuilder.addImplementationOptions(streamSpec.getImplementationOptions());
                }
                closeableErrorListener = this.getHighSpeedVideoSizesFor;
                if (closeableErrorListener != null) {
                    closeableErrorListener.close();
                }
                androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda0
                    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
                    public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                        androidx.camera.core.ImageCapture.this.getHighResolutionOutputSizeshNQ4ISI();
                    }
                });
                this.getHighSpeedVideoSizesFor = closeableErrorListener2;
                createSessionConfigBuilder.setErrorListener(closeableErrorListener2);
                return createSessionConfigBuilder;
            }
        }
        cameraCharacteristics2 = null;
        this.getOutputSizeshNQ4ISI = new androidx.camera.core.imagecapture.ImagePipeline(imageCaptureConfig, resolution, cameraCharacteristics2, getEffect(), z, postviewSettings);
        if (this.getHighSpeedVideoSizes == null) {
        }
        this.getHighSpeedVideoSizes.setImagePipeline(this.getOutputSizeshNQ4ISI);
        createSessionConfigBuilder = this.getOutputSizeshNQ4ISI.createSessionConfigBuilder(streamSpec.getResolution());
        createSessionConfigBuilder.setSessionType(streamSpec.getSessionType());
        if (getCaptureMode() == 2) {
            getCameraControl().addZslConfig(createSessionConfigBuilder);
        }
        if (streamSpec.getImplementationOptions() != null) {
        }
        closeableErrorListener = this.getHighSpeedVideoSizesFor;
        if (closeableErrorListener != null) {
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener22 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.core.ImageCapture.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        });
        this.getHighSpeedVideoSizesFor = closeableErrorListener22;
        createSessionConfigBuilder.setErrorListener(closeableErrorListener22);
        return createSessionConfigBuilder;
    }

    final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.List<androidx.camera.core.impl.SessionConfig> m;
        if (getCamera() == null) {
            return;
        }
        this.getHighSpeedVideoSizes.pause();
        Camera2StreamConfigurationMap(true);
        androidx.camera.core.impl.SessionConfig.Builder Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getCameraId(), (androidx.camera.core.impl.ImageCaptureConfig) getCurrentConfig(), (androidx.camera.core.impl.StreamSpec) androidx.core.util.Preconditions.checkNotNull(getAttachedStreamSpec()));
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{Camera2StreamConfigurationMap.build()});
        updateSessionConfig(m);
        notifyReset();
        this.getHighSpeedVideoSizes.resume();
    }

    private static boolean getHighSpeedVideoSizes(java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> map, int i) {
        return map.containsKey(java.lang.Integer.valueOf(i)) && !map.get(java.lang.Integer.valueOf(i)).isEmpty();
    }

    private void Camera2StreamConfigurationMap(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions2) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (getFlashMode() == 3 && this.getOutputMinFrameDurationlomOqCM.getGetHighResolutionOutputSizeshNQ4ISI() == null) {
            throw new java.lang.IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
        }
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera != null && isInSession()) {
            boolean z = getCurrentConfig().getSecondaryInputFormat() != 0;
            if (z && outputFileOptions2 == null && onImageSavedCallback != null) {
                throw new java.lang.IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
            }
            if (!z && outputFileOptions2 != null) {
                throw new java.lang.IllegalArgumentException("Non simultaneous capture cannot have two output file options");
            }
            androidx.camera.core.imagecapture.TakePictureManager takePictureManager = (androidx.camera.core.imagecapture.TakePictureManager) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes);
            android.graphics.Rect viewPortCropRect = getViewPortCropRect();
            android.util.Size size = (android.util.Size) java.util.Objects.requireNonNull(getAttachedSurfaceResolution());
            if (viewPortCropRect == null) {
                if (androidx.camera.core.internal.utils.ImageUtil.isAspectRatioValid(this.getOutputFormats)) {
                    int relativeRotation = getRelativeRotation((androidx.camera.core.impl.CameraInternal) java.util.Objects.requireNonNull(getCamera()));
                    android.util.Rational rational = new android.util.Rational(this.getOutputFormats.getDenominator(), this.getOutputFormats.getNumerator());
                    if (!androidx.camera.core.impl.utils.TransformUtils.is90or270(relativeRotation)) {
                        rational = this.getOutputFormats;
                    }
                    viewPortCropRect = (android.graphics.Rect) java.util.Objects.requireNonNull(androidx.camera.core.internal.utils.ImageUtil.computeCropRectFromAspectRatio(size, rational));
                } else {
                    viewPortCropRect = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
                }
            }
            takePictureManager.offerRequest(androidx.camera.core.imagecapture.TakePictureRequest.of(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, outputFileOptions2, viewPortCropRect, getSensorToBufferTransformMatrix(), getRelativeRotation(camera), getHighSpeedVideoFpsRangesFor(), getCaptureMode(), z, this.getHighResolutionOutputSizeshNQ4ISI.getSingleCameraCaptureCallbacks()));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Not bound to a valid Camera [");
        sb.append(this);
        sb.append("]");
        androidx.camera.core.ImageCaptureException imageCaptureException = new androidx.camera.core.ImageCaptureException(4, sb.toString(), null);
        if (onImageCapturedCallback != null) {
            onImageCapturedCallback.onError(imageCaptureException);
        } else {
            if (onImageSavedCallback != null) {
                onImageSavedCallback.onError(imageCaptureException);
                return;
            }
            throw new java.lang.IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
    }

    private void Camera2StreamConfigurationMap(boolean z) {
        androidx.camera.core.imagecapture.TakePictureManager takePictureManager;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.getHighSpeedVideoSizesFor;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.getHighSpeedVideoSizesFor = null;
        }
        androidx.camera.core.imagecapture.ImagePipeline imagePipeline = this.getOutputSizeshNQ4ISI;
        if (imagePipeline != null) {
            imagePipeline.close();
            this.getOutputSizeshNQ4ISI = null;
        }
        if (!z && (takePictureManager = this.getHighSpeedVideoSizes) != null) {
            takePictureManager.abortRequests();
            this.getHighSpeedVideoSizes = null;
        }
        getCameraControl().clearZslConfig();
    }

    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoFpsRangesFor(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return androidx.camera.core.impl.utils.futures.Futures.transform(getCameraControl().submitStillCaptureRequests(list, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration), new androidx.arch.core.util.Function() { // from class: androidx.camera.core.ImageCapture$$ExternalSyntheticLambda4
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.camera.core.ImageCapture.getHighSpeedVideoFpsRanges();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.UseCase
    public final java.util.Set<java.lang.Integer> getSupportedEffectTargets() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final androidx.camera.core.ImageCaptureLatencyEstimate getRealtimeCaptureLatencyEstimate() {
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera == null) {
            return androidx.camera.core.ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY;
        }
        androidx.camera.core.impl.SessionProcessor sessionProcessor = camera.getGetOutputFormats().getSessionProcessor(null);
        android.util.Pair<java.lang.Long, java.lang.Long> realtimeCaptureLatency = sessionProcessor != null ? sessionProcessor.getRealtimeCaptureLatency() : null;
        if (realtimeCaptureLatency == null) {
            return androidx.camera.core.ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY;
        }
        return new androidx.camera.core.ImageCaptureLatencyEstimate(((java.lang.Long) realtimeCaptureLatency.first).longValue(), ((java.lang.Long) realtimeCaptureLatency.second).longValue());
    }

    public final boolean isPostviewEnabled() {
        return ((java.lang.Boolean) getCurrentConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, java.lang.Boolean.FALSE)).booleanValue();
    }

    public final androidx.camera.core.resolutionselector.ResolutionSelector getPostviewResolutionSelector() {
        return (androidx.camera.core.resolutionselector.ResolutionSelector) getCurrentConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
    }

    /* loaded from: classes6.dex */
    public static final class Defaults implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageCaptureConfig> {
        private static final androidx.camera.core.impl.ImageCaptureConfig Camera2StreamConfigurationMap;
        private static final androidx.camera.core.impl.StreamUseCase getHighSpeedVideoFpsRanges;
        private static final androidx.camera.core.resolutionselector.ResolutionSelector getHighSpeedVideoFpsRangesFor;
        private static final androidx.camera.core.DynamicRange getHighSpeedVideoSizes;

        static {
            androidx.camera.core.impl.StreamUseCase streamUseCase = androidx.camera.core.impl.StreamUseCase.STILL_CAPTURE;
            getHighSpeedVideoFpsRanges = streamUseCase;
            androidx.camera.core.resolutionselector.ResolutionSelector build = new androidx.camera.core.resolutionselector.ResolutionSelector.Builder().setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            getHighSpeedVideoFpsRangesFor = build;
            androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
            getHighSpeedVideoSizes = dynamicRange;
            Camera2StreamConfigurationMap = new androidx.camera.core.ImageCapture.Builder().setSurfaceOccupancyPriority(4).setStreamUseCase(streamUseCase).setTargetAspectRatio(0).setResolutionSelector(build).setOutputFormat(0).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public final androidx.camera.core.impl.ImageCaptureConfig getConfig() {
            return Camera2StreamConfigurationMap;
        }
    }

    /* loaded from: classes6.dex */
    public static final class OutputFileOptions {
        private final android.content.ContentValues Camera2StreamConfigurationMap;
        private final java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;
        private final android.content.ContentResolver getHighSpeedVideoFpsRanges;
        private final java.io.File getHighSpeedVideoFpsRangesFor;
        private final androidx.camera.core.ImageCapture.Metadata getHighSpeedVideoSizes;
        private final android.net.Uri getHighSpeedVideoSizesFor;

        OutputFileOptions(java.io.File file, android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues, java.io.OutputStream outputStream, androidx.camera.core.ImageCapture.Metadata metadata) {
            this.getHighSpeedVideoFpsRangesFor = file;
            this.getHighSpeedVideoFpsRanges = contentResolver;
            this.getHighSpeedVideoSizesFor = uri;
            this.Camera2StreamConfigurationMap = contentValues;
            this.getHighResolutionOutputSizeshNQ4ISI = outputStream;
            this.getHighSpeedVideoSizes = metadata == null ? new androidx.camera.core.ImageCapture.Metadata() : metadata;
        }

        public final java.io.File getFile() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final android.content.ContentResolver getContentResolver() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final android.net.Uri getSaveCollection() {
            return this.getHighSpeedVideoSizesFor;
        }

        public final android.content.ContentValues getContentValues() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.io.OutputStream getOutputStream() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.camera.core.ImageCapture.Metadata getMetadata() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputFileOptions{mFile=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", mContentResolver=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", mSaveCollection=");
            sb.append(this.getHighSpeedVideoSizesFor);
            sb.append(", mContentValues=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", mOutputStream=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", mMetadata=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("}");
            return sb.toString();
        }

        public static final class Builder {
            private java.io.File Camera2StreamConfigurationMap;
            private android.content.ContentResolver getHighResolutionOutputSizeshNQ4ISI;
            private androidx.camera.core.ImageCapture.Metadata getHighSpeedVideoFpsRanges;
            private java.io.OutputStream getHighSpeedVideoFpsRangesFor;
            private android.content.ContentValues getHighSpeedVideoSizes;
            private android.net.Uri getInputFormats;

            public Builder(java.io.File file) {
                this.Camera2StreamConfigurationMap = file;
            }

            public Builder(android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues) {
                this.getHighResolutionOutputSizeshNQ4ISI = contentResolver;
                this.getInputFormats = uri;
                this.getHighSpeedVideoSizes = contentValues;
            }

            public Builder(java.io.OutputStream outputStream) {
                this.getHighSpeedVideoFpsRangesFor = outputStream;
            }

            public final androidx.camera.core.ImageCapture.OutputFileOptions.Builder setMetadata(androidx.camera.core.ImageCapture.Metadata metadata) {
                this.getHighSpeedVideoFpsRanges = metadata;
                return this;
            }

            public final androidx.camera.core.ImageCapture.OutputFileOptions build() {
                return new androidx.camera.core.ImageCapture.OutputFileOptions(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class OutputFileResults {
        private final int getHighSpeedVideoFpsRanges;
        private final android.net.Uri getHighSpeedVideoFpsRangesFor;

        public OutputFileResults(android.net.Uri uri) {
            this(uri, 256);
        }

        public OutputFileResults(android.net.Uri uri, int i) {
            this.getHighSpeedVideoFpsRangesFor = uri;
            this.getHighSpeedVideoFpsRanges = i;
        }

        public android.net.Uri getSavedUri() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public int getImageFormat() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Metadata {
        private android.location.Location Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRanges = false;
        private boolean getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;

        public final boolean isReversedHorizontal() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final boolean isReversedHorizontalSet() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final void setReversedHorizontal(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getHighSpeedVideoFpsRanges = true;
        }

        public final boolean isReversedVertical() {
            return this.getHighSpeedVideoSizes;
        }

        public final void setReversedVertical(boolean z) {
            this.getHighSpeedVideoSizes = z;
        }

        public final android.location.Location getLocation() {
            return this.Camera2StreamConfigurationMap;
        }

        public final void setLocation(android.location.Location location) {
            this.Camera2StreamConfigurationMap = location;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata{mIsReversedHorizontal=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", mIsReversedVertical=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", mLocation=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class Builder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.ImageCapture, androidx.camera.core.impl.ImageCaptureConfig, androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.impl.ImageOutputConfig.Builder<androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.internal.IoConfig.Builder<androidx.camera.core.ImageCapture.Builder>, androidx.camera.core.impl.ImageInputConfig.Builder<androidx.camera.core.ImageCapture.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle getHighSpeedVideoFpsRangesFor;

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setCustomOrderedResolutions(java.util.List list) {
            return setCustomOrderedResolutions((java.util.List<android.util.Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.Builder setSupportedResolutions(java.util.List list) {
            return setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
            return setTargetClass((java.lang.Class<androidx.camera.core.ImageCapture>) cls);
        }

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.getHighSpeedVideoFpsRangesFor = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.ImageCapture.class)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid target class configuration for ");
                sb.append(this);
                sb.append(": ");
                sb.append(cls);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
            setTargetClass(androidx.camera.core.ImageCapture.class);
        }

        public static androidx.camera.core.ImageCapture.Builder fromConfig(androidx.camera.core.impl.Config config) {
            return new androidx.camera.core.ImageCapture.Builder(androidx.camera.core.impl.MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.impl.ImageCaptureConfig getUseCaseConfig() {
            return new androidx.camera.core.impl.ImageCaptureConfig(androidx.camera.core.impl.OptionsBundle.from(this.getHighSpeedVideoFpsRangesFor));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.ImageCapture build() {
            java.lang.Integer num = (java.lang.Integer) getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num != null) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, num);
            } else if (androidx.camera.core.ImageCapture.getHighSpeedVideoFpsRangesFor(getMutableConfig())) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 32);
            } else if (androidx.camera.core.ImageCapture.getHighSpeedVideoSizes(getMutableConfig())) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 32);
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, 256);
            } else if (androidx.camera.core.ImageCapture.getHighResolutionOutputSizeshNQ4ISI(getMutableConfig())) {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, androidx.camera.core.DynamicRange.UNSPECIFIED);
            } else {
                getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            }
            androidx.camera.core.impl.ImageCaptureConfig useCaseConfig = getUseCaseConfig();
            androidx.camera.core.impl.ImageOutputConfig.validateConfig(useCaseConfig);
            androidx.camera.core.ImageCapture imageCapture = new androidx.camera.core.ImageCapture(useCaseConfig);
            android.util.Size size = (android.util.Size) getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_TARGET_RESOLUTION, null);
            if (size != null) {
                imageCapture.setCropAspectRatio(new android.util.Rational(size.getWidth(), size.getHeight()));
            }
            androidx.core.util.Preconditions.checkNotNull((java.util.concurrent.Executor) getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IO_EXECUTOR, androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor()), "The IO executor can't be null");
            if (getMutableConfig().containsOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_MODE)) {
                java.lang.Integer num2 = (java.lang.Integer) getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_MODE);
                if (num2 == null || (num2.intValue() != 0 && num2.intValue() != 1 && num2.intValue() != 3 && num2.intValue() != 2)) {
                    throw new java.lang.IllegalArgumentException("The flash mode is not allowed to set: ".concat(java.lang.String.valueOf(num2)));
                }
                if (num2.intValue() == 3 && getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SCREEN_FLASH, null) == null) {
                    throw new java.lang.IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
            }
            return imageCapture;
        }

        public final androidx.camera.core.ImageCapture.Builder setCaptureMode(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setFlashMode(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_MODE, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SCREEN_FLASH, screenFlash);
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setBufferFormat(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setCustomOrderedResolutions(java.util.List<android.util.Size> list) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setTargetClass(java.lang.Class<androidx.camera.core.ImageCapture> cls) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_TARGET_NAME, null) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls.getCanonicalName());
                sb.append("-");
                sb.append(java.util.UUID.randomUUID());
                setTargetName(sb.toString());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public final androidx.camera.core.ImageCapture.Builder setTargetAspectRatio(int i) {
            if (i == -1) {
                i = 0;
            }
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_TARGET_ASPECT_RATIO, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setMirrorMode(int i) {
            throw new java.lang.UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @java.lang.Deprecated
        public final androidx.camera.core.ImageCapture.Builder setTargetResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setDefaultResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setMaxResolution(android.util.Size size) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setPostviewEnabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setPostviewResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setImageReaderProxyProvider(androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setSoftwareJpegEncoderRequested(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, java.lang.Boolean.valueOf(z));
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setFlashType(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_FLASH_TYPE, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setJpegQuality(int i) {
            androidx.core.util.Preconditions.checkArgumentInRange(i, 1, 100, "jpegQuality");
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.IoConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setIoExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        public final androidx.camera.core.ImageCapture.Builder setOutputFormat(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setZslDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setHighResolutionDisabled(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setStreamUseCase(androidx.camera.core.impl.StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public final androidx.camera.core.ImageCapture.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.MutableConfig mutableConfig) {
        return java.util.Objects.equals(mutableConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 2);
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(androidx.camera.core.impl.MutableConfig mutableConfig) {
        return java.util.Objects.equals(mutableConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 3);
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.MutableConfig mutableConfig) {
        return java.util.Objects.equals(mutableConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Type inference failed for: r9v29, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        boolean z;
        java.lang.Integer num;
        java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> featureGroup = getFeatureGroup();
        if (featureGroup != null) {
            int i = 0;
            for (androidx.camera.core.featuregroup.GroupableFeature groupableFeature : featureGroup) {
                if (groupableFeature instanceof androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature) {
                    i = ((androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature) groupableFeature).getImageCaptureOutputFormat();
                }
            }
            builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, java.lang.Integer.valueOf(i));
        }
        boolean contains = cameraInfoInternal.getCameraQuirks().contains(androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (contains) {
            if (java.lang.Boolean.FALSE.equals(builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, bool))) {
                androidx.camera.core.Logger.w("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                androidx.camera.core.Logger.i("ImageCapture", "Requesting software JPEG due to device quirk.");
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, bool);
            }
        }
        androidx.camera.core.impl.MutableConfig mutableConfig = builder.getMutableConfig();
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        androidx.camera.core.impl.Config.Option<java.lang.Boolean> option = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
        if (bool2.equals(mutableConfig.retrieveOption(option, bool3))) {
            if (getCamera() == null || getCamera().getGetOutputFormats().getSessionProcessor(null) == null) {
                z = true;
            } else {
                androidx.camera.core.Logger.w("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            }
            java.lang.Integer num2 = (java.lang.Integer) mutableConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num2 != null && num2.intValue() != 256) {
                androidx.camera.core.Logger.w("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (!z) {
                androidx.camera.core.Logger.w("ImageCapture", "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, bool3);
            }
            num = (java.lang.Integer) builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null) {
                androidx.core.util.Preconditions.checkArgument(getCamera() == null || getCamera().getGetOutputFormats().getSessionProcessor(null) == null || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, java.lang.Integer.valueOf(z ? 35 : num.intValue()));
            } else if (java.util.Objects.equals(builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 2)) {
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 32);
            } else if (java.util.Objects.equals(builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 3)) {
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 32);
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, 256);
            } else if (java.util.Objects.equals(builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 1)) {
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, androidx.camera.core.DynamicRange.UNSPECIFIED);
            } else if (z) {
                builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            } else {
                java.util.List list = (java.util.List) builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
                if (list == null) {
                    builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                } else if (getHighResolutionOutputSizeshNQ4ISI(list, 256)) {
                    builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                } else if (getHighResolutionOutputSizeshNQ4ISI(list, 35)) {
                    builder.getMutableConfig().insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 35);
                }
            }
            return builder.getUseCaseConfig();
        }
        z = false;
        num = (java.lang.Integer) builder.getMutableConfig().retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num == null) {
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStop() {
        this.getOutputMinFrameDurationlomOqCM.completePendingTasks();
        androidx.camera.core.imagecapture.TakePictureManager takePictureManager = this.getHighSpeedVideoSizes;
        if (takePictureManager != null) {
            takePictureManager.abortRequests();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        this.getOutputMinFrameDurationlomOqCM.completePendingTasks();
        androidx.camera.core.imagecapture.TakePictureManager takePictureManager = this.getHighSpeedVideoSizes;
        if (takePictureManager != null) {
            takePictureManager.abortRequests();
        }
        Camera2StreamConfigurationMap(false);
        getCameraControl().setScreenFlash(null);
    }
}
