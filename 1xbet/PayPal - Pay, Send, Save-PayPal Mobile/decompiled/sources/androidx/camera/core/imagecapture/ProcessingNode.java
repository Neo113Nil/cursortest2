package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class ProcessingNode implements androidx.camera.core.processing.Node<androidx.camera.core.imagecapture.ProcessingNode.In, java.lang.Void> {
    androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, android.graphics.Bitmap> Camera2StreamConfigurationMap;
    androidx.camera.core.imagecapture.DngImage2Disk getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.Executor getHighSpeedVideoSizes;
    final androidx.camera.core.processing.InternalImageProcessor getHighSpeedVideoSizesFor;
    androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> getInputFormats;
    androidx.camera.core.imagecapture.ProcessingNode.In getInputSizeshNQ4ISI;
    androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> getOutputFormats;
    androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> getOutputMinFrameDuration;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Bitmap2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> getOutputMinFrameDurationlomOqCM;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> getOutputSizes;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> getOutputSizeshNQ4ISI;
    private final android.hardware.camera2.CameraCharacteristics getOutputStallDuration;
    androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, androidx.camera.core.ImageProxy> getOutputStallDurationlomOqCM;
    private final androidx.camera.core.impl.Quirks toString;

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }

    ProcessingNode(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCharacteristics cameraCharacteristics, androidx.camera.core.processing.InternalImageProcessor internalImageProcessor) {
        this(executor, cameraCharacteristics, internalImageProcessor, androidx.camera.core.internal.compat.quirk.DeviceQuirks.getAll());
    }

    private ProcessingNode(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCharacteristics cameraCharacteristics, androidx.camera.core.processing.InternalImageProcessor internalImageProcessor, androidx.camera.core.impl.Quirks quirks) {
        if (androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class) != null) {
            this.getHighSpeedVideoSizes = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.getHighSpeedVideoSizes = executor;
        }
        this.getHighSpeedVideoSizesFor = internalImageProcessor;
        this.getOutputStallDuration = cameraCharacteristics;
        this.toString = quirks;
        this.getHighSpeedVideoFpsRangesFor = quirks.contains(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class);
    }

    @Override // androidx.camera.core.processing.Node
    public java.lang.Void transform(androidx.camera.core.imagecapture.ProcessingNode.In in) {
        this.getInputSizeshNQ4ISI = in;
        in.getHighResolutionOutputSizeshNQ4ISI().setListener(new androidx.core.util.Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                final androidx.camera.core.imagecapture.ProcessingNode processingNode = androidx.camera.core.imagecapture.ProcessingNode.this;
                final androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket = (androidx.camera.core.imagecapture.ProcessingNode.InputPacket) obj;
                if (inputPacket.getHighSpeedVideoSizes().getHighSpeedVideoSizes.isAborted()) {
                    inputPacket.getHighSpeedVideoFpsRangesFor().close();
                } else {
                    processingNode.getHighSpeedVideoSizes.execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            final androidx.camera.core.imagecapture.ProcessingNode processingNode2 = androidx.camera.core.imagecapture.ProcessingNode.this;
                            final androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket2 = inputPacket;
                            androidx.camera.core.CameraXTracer.trace("processInputPacket", new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final androidx.camera.core.ImageCapture.OutputFileResults highSpeedVideoSizes;
                                    androidx.camera.core.imagecapture.ProcessingNode processingNode3 = androidx.camera.core.imagecapture.ProcessingNode.this;
                                    androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket3 = inputPacket2;
                                    final androidx.camera.core.imagecapture.ProcessingRequest highSpeedVideoSizes2 = inputPacket3.getHighSpeedVideoSizes();
                                    try {
                                        boolean z = true;
                                        boolean z2 = processingNode3.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges().size() > 1;
                                        androidx.camera.core.imagecapture.ProcessingRequest highSpeedVideoSizes3 = inputPacket3.getHighSpeedVideoSizes();
                                        if (highSpeedVideoSizes3.getOutputFormats == null && highSpeedVideoSizes3.getOutputMinFrameDuration == null) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder("processInMemoryCapture: request ID = ");
                                            sb.append(inputPacket3.getHighSpeedVideoSizes().getRequestId());
                                            androidx.camera.core.Logger.d("ProcessingNode", sb.toString());
                                            androidx.camera.core.imagecapture.ProcessingRequest highSpeedVideoSizes4 = inputPacket3.getHighSpeedVideoSizes();
                                            androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply = processingNode3.getInputFormats.apply(inputPacket3);
                                            java.util.List<java.lang.Integer> highSpeedVideoFpsRanges = processingNode3.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                                            androidx.core.util.Preconditions.checkArgument(!highSpeedVideoFpsRanges.isEmpty());
                                            int intValue = highSpeedVideoFpsRanges.get(0).intValue();
                                            if ((apply.getFormat() == 35 || processingNode3.getHighSpeedVideoFpsRanges != null || processingNode3.getHighSpeedVideoFpsRangesFor) && intValue == 256) {
                                                androidx.camera.core.processing.Packet<byte[]> apply2 = processingNode3.getOutputMinFrameDuration.apply(androidx.camera.core.imagecapture.Image2JpegBytes.In.Camera2StreamConfigurationMap(apply, highSpeedVideoSizes4.Camera2StreamConfigurationMap));
                                                if (processingNode3.getHighSpeedVideoFpsRanges != null) {
                                                    apply2 = processingNode3.Camera2StreamConfigurationMap(apply2, highSpeedVideoSizes4.Camera2StreamConfigurationMap);
                                                }
                                                apply = processingNode3.getOutputFormats.apply(apply2);
                                            }
                                            final androidx.camera.core.ImageProxy apply3 = processingNode3.getOutputStallDurationlomOqCM.apply(apply);
                                            if (highSpeedVideoFpsRanges.size() > 1) {
                                                highSpeedVideoSizes4.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(apply3.getFormat());
                                            }
                                            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda5
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    androidx.camera.core.imagecapture.ProcessingNode.Camera2StreamConfigurationMap(androidx.camera.core.imagecapture.ProcessingRequest.this, apply3);
                                                }
                                            });
                                            return;
                                        }
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("processOnDiskCapture: request ID = ");
                                        sb2.append(inputPacket3.getHighSpeedVideoSizes().getRequestId());
                                        androidx.camera.core.Logger.d("ProcessingNode", sb2.toString());
                                        java.util.List<java.lang.Integer> highSpeedVideoFpsRanges2 = processingNode3.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                                        androidx.core.util.Preconditions.checkArgument(!highSpeedVideoFpsRanges2.isEmpty());
                                        int intValue2 = highSpeedVideoFpsRanges2.get(0).intValue();
                                        androidx.core.util.Preconditions.checkArgument(androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(intValue2) || androidx.camera.core.internal.utils.ImageUtil.isRawFormats(intValue2), java.lang.String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", java.lang.Integer.valueOf(intValue2)));
                                        androidx.camera.core.imagecapture.ProcessingRequest highSpeedVideoSizes5 = inputPacket3.getHighSpeedVideoSizes();
                                        androidx.core.util.Preconditions.checkArgument(highSpeedVideoSizes5.getOutputFormats != null, "OutputFileOptions cannot be empty");
                                        androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply4 = processingNode3.getInputFormats.apply(inputPacket3);
                                        if (highSpeedVideoFpsRanges2.size() > 1) {
                                            if (highSpeedVideoSizes5.getOutputFormats == null || highSpeedVideoSizes5.getOutputMinFrameDuration == null) {
                                                z = false;
                                            }
                                            androidx.core.util.Preconditions.checkArgument(z, "The number of OutputFileOptions for simultaneous capture should be at least two");
                                            if (apply4.getFormat() != 32) {
                                                highSpeedVideoSizes = processingNode3.getHighSpeedVideoSizes(apply4, (androidx.camera.core.ImageCapture.OutputFileOptions) java.util.Objects.requireNonNull(highSpeedVideoSizes5.getOutputMinFrameDuration), highSpeedVideoSizes5.Camera2StreamConfigurationMap);
                                                highSpeedVideoSizes5.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(256);
                                            } else {
                                                highSpeedVideoSizes = processingNode3.Camera2StreamConfigurationMap(apply4, (androidx.camera.core.ImageCapture.OutputFileOptions) java.util.Objects.requireNonNull(highSpeedVideoSizes5.getOutputFormats));
                                                highSpeedVideoSizes5.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(32);
                                            }
                                        } else {
                                            highSpeedVideoSizes = intValue2 != 32 ? processingNode3.getHighSpeedVideoSizes(apply4, (androidx.camera.core.ImageCapture.OutputFileOptions) java.util.Objects.requireNonNull(highSpeedVideoSizes5.getOutputFormats), highSpeedVideoSizes5.Camera2StreamConfigurationMap) : processingNode3.Camera2StreamConfigurationMap(apply4, (androidx.camera.core.ImageCapture.OutputFileOptions) java.util.Objects.requireNonNull(highSpeedVideoSizes5.getOutputFormats));
                                        }
                                        if (z2 && !highSpeedVideoSizes2.getOutputStallDurationlomOqCM.getOutputMinFrameDuration()) {
                                            return;
                                        }
                                        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                androidx.camera.core.imagecapture.ProcessingNode.getHighSpeedVideoFpsRanges(androidx.camera.core.imagecapture.ProcessingRequest.this, highSpeedVideoSizes);
                                            }
                                        });
                                    } catch (androidx.camera.core.ImageCaptureException e) {
                                        androidx.camera.core.imagecapture.ProcessingNode.getHighSpeedVideoFpsRanges(highSpeedVideoSizes2, e);
                                    } catch (java.lang.OutOfMemoryError e2) {
                                        androidx.camera.core.imagecapture.ProcessingNode.getHighSpeedVideoFpsRanges(highSpeedVideoSizes2, new androidx.camera.core.ImageCaptureException(0, "Processing failed due to low memory.", e2));
                                    } catch (java.lang.RuntimeException e3) {
                                        androidx.camera.core.imagecapture.ProcessingNode.getHighSpeedVideoFpsRanges(highSpeedVideoSizes2, new androidx.camera.core.ImageCaptureException(0, "Processing failed.", e3));
                                    }
                                }
                            });
                        }
                    });
                }
            }
        });
        in.Camera2StreamConfigurationMap().setListener(new androidx.core.util.Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                final androidx.camera.core.imagecapture.ProcessingNode processingNode = androidx.camera.core.imagecapture.ProcessingNode.this;
                final androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket = (androidx.camera.core.imagecapture.ProcessingNode.InputPacket) obj;
                if (!inputPacket.getHighSpeedVideoSizes().getHighSpeedVideoSizes.isAborted()) {
                    processingNode.getHighSpeedVideoSizes.execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.imagecapture.ProcessingNode processingNode2 = androidx.camera.core.imagecapture.ProcessingNode.this;
                            androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket2 = inputPacket;
                            final androidx.camera.core.imagecapture.ProcessingRequest highSpeedVideoSizes = inputPacket2.getHighSpeedVideoSizes();
                            try {
                                androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply = processingNode2.getInputFormats.apply(inputPacket2);
                                int format = apply.getFormat();
                                androidx.core.util.Preconditions.checkArgument(format == 35 || format == 256 || format == 4101, java.lang.String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", java.lang.Integer.valueOf(format)));
                                final android.graphics.Bitmap apply2 = processingNode2.Camera2StreamConfigurationMap.apply(apply);
                                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.camera.core.imagecapture.ProcessingNode.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.imagecapture.ProcessingRequest.this, apply2);
                                    }
                                });
                            } catch (java.lang.Exception e) {
                                inputPacket2.getHighSpeedVideoFpsRangesFor().close();
                                androidx.camera.core.Logger.e("ProcessingNode", "process postview input packet failed.", e);
                            }
                        }
                    });
                } else {
                    androidx.camera.core.Logger.w("ProcessingNode", "The postview image is closed due to request aborted");
                    inputPacket.getHighSpeedVideoFpsRangesFor().close();
                }
            }
        });
        this.getInputFormats = new androidx.camera.core.imagecapture.ProcessingInput2Packet();
        this.getOutputMinFrameDuration = new androidx.camera.core.imagecapture.Image2JpegBytes(this.toString);
        this.getOutputSizeshNQ4ISI = new androidx.camera.core.imagecapture.JpegBytes2CroppedBitmap();
        this.getOutputMinFrameDurationlomOqCM = new androidx.camera.core.imagecapture.Bitmap2JpegBytes();
        this.getOutputSizes = new androidx.camera.core.imagecapture.JpegBytes2Disk();
        this.getOutputStallDurationlomOqCM = new androidx.camera.core.imagecapture.JpegImage2Result();
        this.Camera2StreamConfigurationMap = new androidx.camera.core.imagecapture.Image2Bitmap();
        if (in.getHighSpeedVideoFpsRangesFor() == 35 || this.getHighSpeedVideoSizesFor != null || this.getHighSpeedVideoFpsRangesFor) {
            this.getOutputFormats = new androidx.camera.core.imagecapture.JpegBytes2Image();
        }
        androidx.camera.core.processing.InternalImageProcessor internalImageProcessor = this.getHighSpeedVideoSizesFor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRanges = new androidx.camera.core.imagecapture.BitmapEffect(internalImageProcessor);
        return null;
    }

    final androidx.camera.core.ImageCapture.OutputFileResults Camera2StreamConfigurationMap(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) throws androidx.camera.core.ImageCaptureException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            if (this.getOutputStallDuration == null) {
                throw new androidx.camera.core.ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (packet.getCameraCaptureResult().getCaptureResult() == null) {
                throw new androidx.camera.core.ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.imagecapture.DngImage2Disk((android.hardware.camera2.CameraCharacteristics) java.util.Objects.requireNonNull(this.getOutputStallDuration), (android.hardware.camera2.CaptureResult) java.util.Objects.requireNonNull(packet.getCameraCaptureResult().getCaptureResult()));
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.apply(androidx.camera.core.imagecapture.DngImage2Disk.In.getHighSpeedVideoSizes(packet.getData(), packet.getRotationDegrees(), (androidx.camera.core.ImageCapture.OutputFileOptions) java.util.Objects.requireNonNull(outputFileOptions)));
    }

    final androidx.camera.core.ImageCapture.OutputFileResults getHighSpeedVideoSizes(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, int i) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.processing.Packet<byte[]> apply = this.getOutputMinFrameDuration.apply(androidx.camera.core.imagecapture.Image2JpegBytes.In.Camera2StreamConfigurationMap(packet, i));
        if (apply.hasCropping() || this.getHighSpeedVideoFpsRanges != null) {
            apply = Camera2StreamConfigurationMap(apply, i);
        }
        return this.getOutputSizes.apply(androidx.camera.core.imagecapture.JpegBytes2Disk.In.of(apply, (androidx.camera.core.ImageCapture.OutputFileOptions) java.util.Objects.requireNonNull(outputFileOptions)));
    }

    final androidx.camera.core.processing.Packet<byte[]> Camera2StreamConfigurationMap(androidx.camera.core.processing.Packet<byte[]> packet, int i) throws androidx.camera.core.ImageCaptureException {
        androidx.core.util.Preconditions.checkState(androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(packet.getFormat()));
        androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply = this.getOutputSizeshNQ4ISI.apply(packet);
        androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> operation = this.getHighSpeedVideoFpsRanges;
        if (operation != null) {
            apply = operation.apply(apply);
        }
        return this.getOutputMinFrameDurationlomOqCM.apply(androidx.camera.core.imagecapture.Bitmap2JpegBytes.In.of(apply, i));
    }

    static void getHighSpeedVideoFpsRanges(final androidx.camera.core.imagecapture.ProcessingRequest processingRequest, final androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.ProcessingNode.getHighSpeedVideoSizes(androidx.camera.core.imagecapture.ProcessingRequest.this, imageCaptureException);
            }
        });
    }

    static abstract class InputPacket {
        abstract androidx.camera.core.ImageProxy getHighSpeedVideoFpsRangesFor();

        abstract androidx.camera.core.imagecapture.ProcessingRequest getHighSpeedVideoSizes();

        InputPacket() {
        }

        static androidx.camera.core.imagecapture.ProcessingNode.InputPacket getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.ImageProxy imageProxy) {
            return new androidx.camera.core.imagecapture.AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }
    }

    static abstract class In {
        abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> Camera2StreamConfigurationMap();

        abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getHighResolutionOutputSizeshNQ4ISI();

        abstract java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges();

        abstract int getHighSpeedVideoFpsRangesFor();

        In() {
        }

        static androidx.camera.core.imagecapture.ProcessingNode.In getHighResolutionOutputSizeshNQ4ISI(int i, java.util.List<java.lang.Integer> list) {
            return new androidx.camera.core.imagecapture.AutoValue_ProcessingNode_In(new androidx.camera.core.processing.Edge(), new androidx.camera.core.processing.Edge(), i, list);
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.ImageProxy imageProxy) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onFinalResult(ImageProxy): request ID = ");
        sb.append(processingRequest.getInputSizeshNQ4ISI);
        androidx.camera.core.Logger.i("ProcessingRequest", sb.toString());
        processingRequest.getHighSpeedVideoSizes.onFinalResult(imageProxy);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onFinalResult(OutputFileResults): request ID = ");
        sb.append(processingRequest.getInputSizeshNQ4ISI);
        androidx.camera.core.Logger.i("ProcessingRequest", sb.toString());
        processingRequest.getHighSpeedVideoSizes.onFinalResult(outputFileResults);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, android.graphics.Bitmap bitmap) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onPostviewBitmapAvailable: request ID = ");
        sb.append(processingRequest.getInputSizeshNQ4ISI);
        androidx.camera.core.Logger.i("ProcessingRequest", sb.toString());
        processingRequest.getHighSpeedVideoSizes.onPostviewBitmapAvailable(bitmap);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.ImageCaptureException imageCaptureException) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onProcessFailure: request ID = ");
        sb.append(processingRequest.getInputSizeshNQ4ISI);
        androidx.camera.core.Logger.w("ProcessingRequest", sb.toString(), imageCaptureException);
        processingRequest.getHighSpeedVideoSizes.onProcessFailure(imageCaptureException);
    }
}
