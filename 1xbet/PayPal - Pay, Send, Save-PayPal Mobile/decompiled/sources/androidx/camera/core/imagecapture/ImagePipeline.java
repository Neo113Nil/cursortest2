package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class ImagePipeline {
    private static int getHighResolutionOutputSizeshNQ4ISI;
    static final androidx.camera.core.internal.compat.workaround.ExifRotationAvailability getHighSpeedVideoSizes = new androidx.camera.core.internal.compat.workaround.ExifRotationAvailability();
    final androidx.camera.core.imagecapture.CaptureNode.In Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.CaptureConfig getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.imagecapture.CaptureNode getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.impl.ImageCaptureConfig getHighSpeedVideoSizesFor;
    private final androidx.camera.core.imagecapture.ProcessingNode getInputSizeshNQ4ISI;

    public ImagePipeline(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig, android.util.Size size, android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        this(imageCaptureConfig, size, cameraCharacteristics, null, false, null);
    }

    public ImagePipeline(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig, android.util.Size size, android.hardware.camera2.CameraCharacteristics cameraCharacteristics, androidx.camera.core.CameraEffect cameraEffect, boolean z) {
        this(imageCaptureConfig, size, cameraCharacteristics, cameraEffect, z, null);
    }

    public ImagePipeline(androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig, android.util.Size size, android.hardware.camera2.CameraCharacteristics cameraCharacteristics, androidx.camera.core.CameraEffect cameraEffect, boolean z, androidx.camera.core.imagecapture.PostviewSettings postviewSettings) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighSpeedVideoSizesFor = imageCaptureConfig;
        this.getHighSpeedVideoFpsRanges = androidx.camera.core.impl.CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        androidx.camera.core.imagecapture.CaptureNode captureNode = new androidx.camera.core.imagecapture.CaptureNode();
        this.getHighSpeedVideoFpsRangesFor = captureNode;
        androidx.camera.core.imagecapture.ProcessingNode processingNode = new androidx.camera.core.imagecapture.ProcessingNode((java.util.concurrent.Executor) java.util.Objects.requireNonNull(imageCaptureConfig.getIoExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor())), cameraCharacteristics, cameraEffect != null ? new androidx.camera.core.processing.InternalImageProcessor(cameraEffect) : null);
        this.getInputSizeshNQ4ISI = processingNode;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 256;
        if (imageCaptureConfig.getSecondaryInputFormat() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            java.lang.Integer num = (java.lang.Integer) imageCaptureConfig.retrieveOption(androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num != null) {
                i = num.intValue();
            } else {
                java.lang.Integer num2 = (java.lang.Integer) imageCaptureConfig.retrieveOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, null);
                if (num2 != null && num2.intValue() == 4101) {
                    i = 4101;
                } else if (num2 != null && num2.intValue() == 32) {
                    i = 32;
                }
            }
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        androidx.camera.core.imagecapture.CaptureNode.In highResolutionOutputSizeshNQ4ISI = androidx.camera.core.imagecapture.CaptureNode.In.getHighResolutionOutputSizeshNQ4ISI(size, imageCaptureConfig.getInputFormat(), arrayList, z, imageCaptureConfig.getImageReaderProxyProvider(), postviewSettings);
        this.Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
        processingNode.transform(captureNode.transform(highResolutionOutputSizeshNQ4ISI));
    }

    public androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder(android.util.Size size) {
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(this.getHighSpeedVideoSizesFor, size);
        createFrom.addNonRepeatingSurface((androidx.camera.core.impl.DeferrableSurface) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges));
        if (this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap().size() > 1 && this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap != null) {
            createFrom.addNonRepeatingSurface(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap);
        }
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes != null) {
            createFrom.setPostviewSurface(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes);
        }
        return createFrom;
    }

    public void close() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighSpeedVideoFpsRangesFor.release();
        this.getInputSizeshNQ4ISI.release();
    }

    public int getCapacity() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.CaptureNode captureNode = this.getHighSpeedVideoFpsRangesFor;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(captureNode.getOutputMinFrameDuration != null, "The ImageReader is not initialized.");
        return captureNode.getOutputMinFrameDuration.getCapacity();
    }

    public void setOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.CaptureNode captureNode = this.getHighSpeedVideoFpsRangesFor;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(captureNode.getOutputMinFrameDuration != null, "The ImageReader is not initialized.");
        captureNode.getOutputMinFrameDuration.setOnImageCloseListener(onImageCloseListener);
    }

    public androidx.core.util.Pair<androidx.camera.core.imagecapture.CameraRequest, androidx.camera.core.imagecapture.ProcessingRequest> createRequests(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback, com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture) {
        int jpegQuality;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.impl.CaptureBundle captureBundle = (androidx.camera.core.impl.CaptureBundle) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizesFor.getCaptureBundle(androidx.camera.core.CaptureBundles.singleDefaultCaptureBundle()));
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = i + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int hashCode = captureBundle.hashCode();
        for (androidx.camera.core.impl.CaptureStage captureStage : (java.util.List) java.util.Objects.requireNonNull(captureBundle.getCaptureStages())) {
            androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
            builder.setTemplateType(this.getHighSpeedVideoFpsRanges.getTemplateType());
            builder.addImplementationOptions(this.getHighSpeedVideoFpsRanges.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(takePictureRequest.getHighResolutionOutputSizeshNQ4ISI());
            builder.addSurface((androidx.camera.core.impl.DeferrableSurface) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges));
            if (this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap().size() > 1 && this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap != null) {
                builder.addSurface(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap);
            }
            boolean z = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes != null;
            if (z) {
                builder.addSurface((androidx.camera.core.impl.DeferrableSurface) java.util.Objects.requireNonNull(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes));
            }
            builder.setPostviewEnabled(z);
            if (androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges()) || androidx.camera.core.internal.utils.ImageUtil.isRawFormats(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges())) {
                if (getHighSpeedVideoSizes.isRotationOptionSupported()) {
                    builder.addImplementationOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION, java.lang.Integer.valueOf(takePictureRequest.getRotationDegrees()));
                }
                androidx.camera.core.impl.Config.Option<java.lang.Integer> option = androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY;
                boolean z2 = takePictureRequest.getOnDiskCallback() != null;
                boolean hasCropping = androidx.camera.core.impl.utils.TransformUtils.hasCropping(takePictureRequest.getCropRect(), this.Camera2StreamConfigurationMap.getOutputFormats());
                if (z2 && hasCropping) {
                    jpegQuality = takePictureRequest.Camera2StreamConfigurationMap() == 0 ? 100 : 95;
                } else {
                    jpegQuality = takePictureRequest.getJpegQuality();
                }
                builder.addImplementationOption(option, java.lang.Integer.valueOf(jpegQuality));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            builder.addTag(java.lang.String.valueOf(hashCode), java.lang.Integer.valueOf(captureStage.getId()));
            builder.setId(i);
            builder.addCameraCaptureCallback(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI);
            if (this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap().size() > 1 && this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor != null) {
                builder.addCameraCaptureCallback(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor);
            }
            arrayList.add(builder.build());
        }
        return new androidx.core.util.Pair<>(new androidx.camera.core.imagecapture.CameraRequest(arrayList, takePictureCallback), new androidx.camera.core.imagecapture.ProcessingRequest(captureBundle, takePictureRequest, takePictureCallback, listenableFuture, i));
    }

    public androidx.camera.core.imagecapture.PostviewSettings getPostviewSettings() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
    }

    public boolean expectsMetadata() {
        return ((androidx.camera.core.SafeCloseImageReaderProxy) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration)).getImageReaderProxy() instanceof androidx.camera.core.MetadataImageReader;
    }
}
