package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
class CaptureNode implements androidx.camera.core.processing.Node<androidx.camera.core.imagecapture.CaptureNode.In, androidx.camera.core.imagecapture.ProcessingNode.In> {
    androidx.camera.core.SafeCloseImageReaderProxy Camera2StreamConfigurationMap;
    androidx.camera.core.imagecapture.ProcessingNode.In getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.imagecapture.ProcessingRequest getHighSpeedVideoFpsRanges = null;
    androidx.camera.core.imagecapture.NoMetadataImageReader getHighSpeedVideoFpsRangesFor = null;
    androidx.camera.core.imagecapture.CaptureNode.In getHighSpeedVideoSizes;
    androidx.camera.core.SafeCloseImageReaderProxy getHighSpeedVideoSizesFor;
    androidx.camera.core.SafeCloseImageReaderProxy getOutputMinFrameDuration;

    CaptureNode() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.camera.core.impl.CameraCaptureCallback] */
    /* JADX WARN: Type inference failed for: r6v20, types: [androidx.camera.core.impl.CameraCaptureCallback] */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.camera.core.MetadataImageReader] */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.camera.core.MetadataImageReader] */
    @Override // androidx.camera.core.processing.Node
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final androidx.camera.core.imagecapture.ProcessingNode.In transform(androidx.camera.core.imagecapture.CaptureNode.In in) {
        androidx.camera.core.impl.ImageReaderProxy createIsolatedReader;
        androidx.camera.core.imagecapture.NoMetadataImageReader noMetadataImageReader;
        androidx.core.util.Consumer<androidx.camera.core.imagecapture.ProcessingRequest> consumer;
        androidx.camera.core.MetadataImageReader metadataImageReader;
        androidx.camera.core.impl.ImageReaderProxy createIsolatedReader2;
        androidx.camera.core.imagecapture.NoMetadataImageReader noMetadataImageReader2;
        androidx.core.util.Preconditions.checkState(this.getHighSpeedVideoSizes == null && this.getOutputMinFrameDuration == null, "CaptureNode does not support recreation yet.");
        this.getHighSpeedVideoSizes = in;
        android.util.Size outputFormats = in.getOutputFormats();
        int highSpeedVideoFpsRanges = in.getHighSpeedVideoFpsRanges();
        boolean outputMinFrameDuration = in.getOutputMinFrameDuration();
        androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1 anonymousClass1 = new androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1();
        boolean z = in.Camera2StreamConfigurationMap().size() > 1;
        androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = null;
        if (!outputMinFrameDuration && in.getHighResolutionOutputSizeshNQ4ISI() == null) {
            if (z) {
                ?? metadataImageReader2 = new androidx.camera.core.MetadataImageReader(outputFormats.getWidth(), outputFormats.getHeight(), 256, 4);
                ?? createComboCallback = androidx.camera.core.impl.CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader2.getCameraCaptureCallback());
                metadataImageReader = new androidx.camera.core.MetadataImageReader(outputFormats.getWidth(), outputFormats.getHeight(), 32, 4);
                cameraCaptureCallback = androidx.camera.core.impl.CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader.getCameraCaptureCallback());
                anonymousClass1 = createComboCallback;
                noMetadataImageReader2 = metadataImageReader2;
            } else {
                ?? metadataImageReader3 = new androidx.camera.core.MetadataImageReader(outputFormats.getWidth(), outputFormats.getHeight(), highSpeedVideoFpsRanges, 4);
                anonymousClass1 = androidx.camera.core.impl.CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader3.getCameraCaptureCallback());
                metadataImageReader = null;
                noMetadataImageReader2 = metadataImageReader3;
            }
            consumer = new androidx.core.util.Consumer() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoSizes((androidx.camera.core.imagecapture.ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        } else {
            androidx.camera.core.ImageReaderProxyProvider highResolutionOutputSizeshNQ4ISI = in.getHighResolutionOutputSizeshNQ4ISI();
            int width = outputFormats.getWidth();
            int height = outputFormats.getHeight();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                createIsolatedReader = highResolutionOutputSizeshNQ4ISI.newInstance(width, height, highSpeedVideoFpsRanges, 4, 0L);
            } else {
                createIsolatedReader = androidx.camera.core.ImageReaderProxys.createIsolatedReader(width, height, highSpeedVideoFpsRanges, 4);
            }
            androidx.camera.core.imagecapture.NoMetadataImageReader noMetadataImageReader3 = new androidx.camera.core.imagecapture.NoMetadataImageReader(createIsolatedReader);
            this.getHighSpeedVideoFpsRangesFor = noMetadataImageReader3;
            noMetadataImageReader = noMetadataImageReader3;
            consumer = new androidx.core.util.Consumer() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.camera.core.imagecapture.CaptureNode captureNode = androidx.camera.core.imagecapture.CaptureNode.this;
                    androidx.camera.core.imagecapture.ProcessingRequest processingRequest = (androidx.camera.core.imagecapture.ProcessingRequest) obj;
                    captureNode.getHighSpeedVideoSizes(processingRequest);
                    androidx.camera.core.imagecapture.NoMetadataImageReader noMetadataImageReader4 = captureNode.getHighSpeedVideoFpsRangesFor;
                    androidx.core.util.Preconditions.checkState(noMetadataImageReader4.Camera2StreamConfigurationMap == null, "Pending request should be null");
                    noMetadataImageReader4.Camera2StreamConfigurationMap = processingRequest;
                }
            };
            metadataImageReader = null;
        }
        in.getHighResolutionOutputSizeshNQ4ISI = anonymousClass1;
        if (z && cameraCaptureCallback != null) {
            in.getHighSpeedVideoFpsRangesFor = cameraCaptureCallback;
        }
        android.view.Surface surface = (android.view.Surface) java.util.Objects.requireNonNull(noMetadataImageReader.getSurface());
        androidx.core.util.Preconditions.checkState(in.getHighSpeedVideoFpsRanges == null, "The surface is already set.");
        in.getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.ImmediateSurface(surface, in.getOutputFormats(), in.getHighSpeedVideoFpsRanges());
        this.getOutputMinFrameDuration = new androidx.camera.core.SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda4
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                androidx.camera.core.imagecapture.ProcessingRequest processingRequest;
                androidx.camera.core.imagecapture.ProcessingRequest processingRequest2;
                androidx.camera.core.imagecapture.CaptureNode captureNode = androidx.camera.core.imagecapture.CaptureNode.this;
                try {
                    androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
                    androidx.camera.core.imagecapture.ProcessingRequest processingRequest3 = captureNode.getHighSpeedVideoFpsRanges;
                    sb.append(processingRequest3 == null ? null : java.lang.Integer.valueOf(processingRequest3.getRequestId()));
                    sb.append(", image.isNull = ");
                    boolean z2 = false;
                    sb.append(acquireLatestImage == null);
                    androidx.camera.core.Logger.d("CaptureNode", sb.toString());
                    if (acquireLatestImage == null) {
                        androidx.camera.core.imagecapture.ProcessingRequest processingRequest4 = captureNode.getHighSpeedVideoFpsRanges;
                        if (processingRequest4 != null) {
                            captureNode.getHighSpeedVideoSizes(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.getHighSpeedVideoFpsRanges(processingRequest4.getRequestId(), new androidx.camera.core.ImageCaptureException(2, "Failed to acquire latest image", null)));
                            return;
                        }
                        return;
                    }
                    androidx.camera.core.impl.utils.Threads.checkMainThread();
                    if (captureNode.getHighSpeedVideoFpsRanges == null) {
                        androidx.camera.core.Logger.w("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: ".concat(java.lang.String.valueOf(acquireLatestImage)));
                        acquireLatestImage.close();
                        return;
                    }
                    androidx.camera.core.impl.TagBundle tagBundle = acquireLatestImage.getImageInfo().getTagBundle();
                    if (((java.lang.Integer) tagBundle.getTag(captureNode.getHighSpeedVideoFpsRanges.getOutputStallDuration)) == null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Discarding ImageProxy which was acquired for another request, mCurrentRequest id = ");
                        sb2.append(captureNode.getHighSpeedVideoFpsRanges.getRequestId());
                        sb2.append(", ImageProxy tagBundle keys = ");
                        sb2.append(tagBundle.listKeys());
                        androidx.camera.core.Logger.w("CaptureNode", sb2.toString());
                        acquireLatestImage.close();
                        return;
                    }
                    androidx.camera.core.impl.utils.Threads.checkMainThread();
                    ((androidx.camera.core.imagecapture.ProcessingNode.In) java.util.Objects.requireNonNull(captureNode.getHighResolutionOutputSizeshNQ4ISI)).getHighResolutionOutputSizeshNQ4ISI().accept(androidx.camera.core.imagecapture.ProcessingNode.InputPacket.getHighResolutionOutputSizeshNQ4ISI(captureNode.getHighSpeedVideoFpsRanges, acquireLatestImage));
                    androidx.camera.core.imagecapture.ProcessingRequest processingRequest5 = captureNode.getHighSpeedVideoFpsRanges;
                    androidx.camera.core.imagecapture.CaptureNode.In in2 = captureNode.getHighSpeedVideoSizes;
                    if (in2 != null && in2.Camera2StreamConfigurationMap().size() > 1) {
                        z2 = true;
                    }
                    if (z2 && (processingRequest2 = captureNode.getHighSpeedVideoFpsRanges) != null) {
                        processingRequest2.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(acquireLatestImage.getFormat());
                    }
                    if (!z2 || ((processingRequest = captureNode.getHighSpeedVideoFpsRanges) != null && processingRequest.getOutputStallDurationlomOqCM.getOutputMinFrameDuration())) {
                        captureNode.getHighSpeedVideoFpsRanges = null;
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("onImageCaptured: request ID = ");
                    sb3.append(processingRequest5.getInputSizeshNQ4ISI);
                    androidx.camera.core.Logger.i("ProcessingRequest", sb3.toString());
                    if (processingRequest5.getHighSpeedVideoFpsRangesFor != -1 && processingRequest5.getHighSpeedVideoFpsRangesFor != 100) {
                        processingRequest5.getHighSpeedVideoFpsRangesFor = 100;
                        processingRequest5.getHighSpeedVideoSizes.onCaptureProcessProgressed(100);
                    }
                    processingRequest5.getHighSpeedVideoSizes.onImageCaptured();
                } catch (java.lang.IllegalStateException e) {
                    androidx.camera.core.imagecapture.ProcessingRequest processingRequest6 = captureNode.getHighSpeedVideoFpsRanges;
                    if (processingRequest6 != null) {
                        captureNode.getHighSpeedVideoSizes(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.getHighSpeedVideoFpsRanges(processingRequest6.getRequestId(), new androidx.camera.core.ImageCaptureException(2, "Failed to acquire latest image", e)));
                    }
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        androidx.camera.core.imagecapture.PostviewSettings highSpeedVideoSizes = in.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            androidx.camera.core.ImageReaderProxyProvider highResolutionOutputSizeshNQ4ISI2 = in.getHighResolutionOutputSizeshNQ4ISI();
            int width2 = highSpeedVideoSizes.getResolution().getWidth();
            int height2 = highSpeedVideoSizes.getResolution().getHeight();
            int inputFormat = highSpeedVideoSizes.getInputFormat();
            if (highResolutionOutputSizeshNQ4ISI2 != null) {
                createIsolatedReader2 = highResolutionOutputSizeshNQ4ISI2.newInstance(width2, height2, inputFormat, 4, 0L);
            } else {
                createIsolatedReader2 = androidx.camera.core.ImageReaderProxys.createIsolatedReader(width2, height2, inputFormat, 4);
            }
            createIsolatedReader2.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda2
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                    androidx.camera.core.imagecapture.CaptureNode captureNode = androidx.camera.core.imagecapture.CaptureNode.this;
                    try {
                        androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
                        if (acquireLatestImage != null) {
                            if (captureNode.getHighSpeedVideoFpsRanges != null) {
                                ((androidx.camera.core.imagecapture.ProcessingNode.In) java.util.Objects.requireNonNull(captureNode.getHighResolutionOutputSizeshNQ4ISI)).Camera2StreamConfigurationMap().accept(androidx.camera.core.imagecapture.ProcessingNode.InputPacket.getHighResolutionOutputSizeshNQ4ISI(captureNode.getHighSpeedVideoFpsRanges, acquireLatestImage));
                            } else {
                                androidx.camera.core.Logger.w("CaptureNode", "Postview image is closed due to request completed or aborted");
                                acquireLatestImage.close();
                            }
                        }
                    } catch (java.lang.IllegalStateException e) {
                        androidx.camera.core.Logger.e("CaptureNode", "Failed to acquire latest image of postview", e);
                    }
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
            this.Camera2StreamConfigurationMap = new androidx.camera.core.SafeCloseImageReaderProxy(createIsolatedReader2);
            in.getHighSpeedVideoSizes = new androidx.camera.core.impl.ImmediateSurface(createIsolatedReader2.getSurface(), highSpeedVideoSizes.getResolution(), highSpeedVideoSizes.getInputFormat());
        }
        if (z && metadataImageReader != null) {
            android.view.Surface surface2 = metadataImageReader.getSurface();
            androidx.core.util.Preconditions.checkState(in.Camera2StreamConfigurationMap == null, "The secondary surface is already set.");
            in.Camera2StreamConfigurationMap = new androidx.camera.core.impl.ImmediateSurface(surface2, in.getOutputFormats(), in.getHighSpeedVideoFpsRanges());
            this.getHighSpeedVideoSizesFor = new androidx.camera.core.SafeCloseImageReaderProxy(metadataImageReader);
            metadataImageReader.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda4
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                    androidx.camera.core.imagecapture.ProcessingRequest processingRequest;
                    androidx.camera.core.imagecapture.ProcessingRequest processingRequest2;
                    androidx.camera.core.imagecapture.CaptureNode captureNode = androidx.camera.core.imagecapture.CaptureNode.this;
                    try {
                        androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
                        androidx.camera.core.imagecapture.ProcessingRequest processingRequest3 = captureNode.getHighSpeedVideoFpsRanges;
                        sb.append(processingRequest3 == null ? null : java.lang.Integer.valueOf(processingRequest3.getRequestId()));
                        sb.append(", image.isNull = ");
                        boolean z2 = false;
                        sb.append(acquireLatestImage == null);
                        androidx.camera.core.Logger.d("CaptureNode", sb.toString());
                        if (acquireLatestImage == null) {
                            androidx.camera.core.imagecapture.ProcessingRequest processingRequest4 = captureNode.getHighSpeedVideoFpsRanges;
                            if (processingRequest4 != null) {
                                captureNode.getHighSpeedVideoSizes(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.getHighSpeedVideoFpsRanges(processingRequest4.getRequestId(), new androidx.camera.core.ImageCaptureException(2, "Failed to acquire latest image", null)));
                                return;
                            }
                            return;
                        }
                        androidx.camera.core.impl.utils.Threads.checkMainThread();
                        if (captureNode.getHighSpeedVideoFpsRanges == null) {
                            androidx.camera.core.Logger.w("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: ".concat(java.lang.String.valueOf(acquireLatestImage)));
                            acquireLatestImage.close();
                            return;
                        }
                        androidx.camera.core.impl.TagBundle tagBundle = acquireLatestImage.getImageInfo().getTagBundle();
                        if (((java.lang.Integer) tagBundle.getTag(captureNode.getHighSpeedVideoFpsRanges.getOutputStallDuration)) == null) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Discarding ImageProxy which was acquired for another request, mCurrentRequest id = ");
                            sb2.append(captureNode.getHighSpeedVideoFpsRanges.getRequestId());
                            sb2.append(", ImageProxy tagBundle keys = ");
                            sb2.append(tagBundle.listKeys());
                            androidx.camera.core.Logger.w("CaptureNode", sb2.toString());
                            acquireLatestImage.close();
                            return;
                        }
                        androidx.camera.core.impl.utils.Threads.checkMainThread();
                        ((androidx.camera.core.imagecapture.ProcessingNode.In) java.util.Objects.requireNonNull(captureNode.getHighResolutionOutputSizeshNQ4ISI)).getHighResolutionOutputSizeshNQ4ISI().accept(androidx.camera.core.imagecapture.ProcessingNode.InputPacket.getHighResolutionOutputSizeshNQ4ISI(captureNode.getHighSpeedVideoFpsRanges, acquireLatestImage));
                        androidx.camera.core.imagecapture.ProcessingRequest processingRequest5 = captureNode.getHighSpeedVideoFpsRanges;
                        androidx.camera.core.imagecapture.CaptureNode.In in2 = captureNode.getHighSpeedVideoSizes;
                        if (in2 != null && in2.Camera2StreamConfigurationMap().size() > 1) {
                            z2 = true;
                        }
                        if (z2 && (processingRequest2 = captureNode.getHighSpeedVideoFpsRanges) != null) {
                            processingRequest2.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(acquireLatestImage.getFormat());
                        }
                        if (!z2 || ((processingRequest = captureNode.getHighSpeedVideoFpsRanges) != null && processingRequest.getOutputStallDurationlomOqCM.getOutputMinFrameDuration())) {
                            captureNode.getHighSpeedVideoFpsRanges = null;
                        }
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("onImageCaptured: request ID = ");
                        sb3.append(processingRequest5.getInputSizeshNQ4ISI);
                        androidx.camera.core.Logger.i("ProcessingRequest", sb3.toString());
                        if (processingRequest5.getHighSpeedVideoFpsRangesFor != -1 && processingRequest5.getHighSpeedVideoFpsRangesFor != 100) {
                            processingRequest5.getHighSpeedVideoFpsRangesFor = 100;
                            processingRequest5.getHighSpeedVideoSizes.onCaptureProcessProgressed(100);
                        }
                        processingRequest5.getHighSpeedVideoSizes.onImageCaptured();
                    } catch (java.lang.IllegalStateException e) {
                        androidx.camera.core.imagecapture.ProcessingRequest processingRequest6 = captureNode.getHighSpeedVideoFpsRanges;
                        if (processingRequest6 != null) {
                            captureNode.getHighSpeedVideoSizes(androidx.camera.core.imagecapture.TakePictureManager.CaptureError.getHighSpeedVideoFpsRanges(processingRequest6.getRequestId(), new androidx.camera.core.ImageCaptureException(2, "Failed to acquire latest image", e)));
                        }
                    }
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        }
        in.getInputSizeshNQ4ISI().setListener(consumer);
        in.getHighSpeedVideoFpsRangesFor().setListener(new androidx.core.util.Consumer() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda3
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoSizes((androidx.camera.core.imagecapture.TakePictureManager.CaptureError) obj);
            }
        });
        androidx.camera.core.imagecapture.ProcessingNode.In highResolutionOutputSizeshNQ4ISI3 = androidx.camera.core.imagecapture.ProcessingNode.In.getHighResolutionOutputSizeshNQ4ISI(in.getHighSpeedVideoFpsRanges(), in.Camera2StreamConfigurationMap());
        this.getHighResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI3;
        return highResolutionOutputSizeshNQ4ISI3;
    }

    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    class AnonymousClass1 extends androidx.camera.core.impl.CameraCaptureCallback {
        AnonymousClass1() {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1 anonymousClass1 = androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1.this;
                    if (androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRanges != null) {
                        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRanges;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("onCaptureStarted: request ID = ");
                        sb.append(processingRequest.getInputSizeshNQ4ISI);
                        androidx.camera.core.Logger.d("ProcessingRequest", sb.toString());
                        processingRequest.getHighSpeedVideoSizes.onCaptureStarted();
                    }
                }
            });
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i, final int i2) {
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1 anonymousClass1 = androidx.camera.core.imagecapture.CaptureNode.AnonymousClass1.this;
                    int i3 = i2;
                    if (androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRanges != null) {
                        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRanges;
                        if (processingRequest.getHighSpeedVideoFpsRangesFor != i3) {
                            processingRequest.getHighSpeedVideoFpsRangesFor = i3;
                            processingRequest.getHighSpeedVideoSizes.onCaptureProcessProgressed(i3);
                        }
                    }
                }
            });
        }
    }

    final void getHighSpeedVideoSizes(final androidx.camera.core.imagecapture.ProcessingRequest processingRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(processingRequest.getOutputSizes.size() == 1, "only one capture stage is supported.");
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(this.getOutputMinFrameDuration != null, "The ImageReader is not initialized.");
        androidx.core.util.Preconditions.checkState(this.getOutputMinFrameDuration.getCapacity() > 0, "Too many acquire images. Close image to be able to process next.");
        this.getHighSpeedVideoFpsRanges = processingRequest;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(processingRequest.getHighSpeedVideoFpsRanges, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* bridge */ /* synthetic */ void onSuccess(java.lang.Void r1) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.camera.core.impl.utils.Threads.checkMainThread();
                if (processingRequest == androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRanges) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("request aborted, id=");
                    sb.append(androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRanges.getRequestId());
                    androidx.camera.core.Logger.w("CaptureNode", sb.toString());
                    if (androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRangesFor != null) {
                        androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = null;
                    }
                    androidx.camera.core.imagecapture.CaptureNode.this.getHighSpeedVideoFpsRanges = null;
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    final void getHighSpeedVideoSizes(androidx.camera.core.imagecapture.TakePictureManager.CaptureError captureError) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = this.getHighSpeedVideoFpsRanges;
        if (processingRequest == null || processingRequest.getRequestId() != captureError.getHighSpeedVideoFpsRanges()) {
            return;
        }
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest2 = this.getHighSpeedVideoFpsRanges;
        androidx.camera.core.ImageCaptureException highResolutionOutputSizeshNQ4ISI = captureError.getHighResolutionOutputSizeshNQ4ISI();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onCaptureFailure: request ID = ");
        sb.append(processingRequest2.getInputSizeshNQ4ISI);
        androidx.camera.core.Logger.w("ProcessingRequest", sb.toString(), highResolutionOutputSizeshNQ4ISI);
        processingRequest2.getHighSpeedVideoSizes.onCaptureFailure(highResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.CaptureNode.In in = (androidx.camera.core.imagecapture.CaptureNode.In) java.util.Objects.requireNonNull(this.getHighSpeedVideoSizes);
        final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = (androidx.camera.core.SafeCloseImageReaderProxy) java.util.Objects.requireNonNull(this.getOutputMinFrameDuration);
        final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = this.getHighSpeedVideoSizesFor;
        final androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy3 = this.Camera2StreamConfigurationMap;
        ((androidx.camera.core.impl.DeferrableSurface) java.util.Objects.requireNonNull(in.getHighSpeedVideoFpsRanges)).close();
        ((androidx.camera.core.impl.DeferrableSurface) java.util.Objects.requireNonNull(in.getHighSpeedVideoFpsRanges)).getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.SafeCloseImageReaderProxy.this.safeClose();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        if (in.getHighSpeedVideoSizes != null) {
            in.getHighSpeedVideoSizes.close();
            in.getHighSpeedVideoSizes.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.CaptureNode.getHighSpeedVideoSizes(androidx.camera.core.SafeCloseImageReaderProxy.this);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        }
        if (in.Camera2StreamConfigurationMap().size() <= 1 || in.Camera2StreamConfigurationMap == null) {
            return;
        }
        in.Camera2StreamConfigurationMap.close();
        in.Camera2StreamConfigurationMap.getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.CaptureNode.Camera2StreamConfigurationMap(androidx.camera.core.SafeCloseImageReaderProxy.this);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    static abstract class In {
        androidx.camera.core.impl.DeferrableSurface Camera2StreamConfigurationMap;
        androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoFpsRanges;
        androidx.camera.core.impl.CameraCaptureCallback getHighSpeedVideoFpsRangesFor;
        androidx.camera.core.impl.CameraCaptureCallback getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };
        androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoSizes = null;

        abstract java.util.List<java.lang.Integer> Camera2StreamConfigurationMap();

        abstract androidx.camera.core.ImageReaderProxyProvider getHighResolutionOutputSizeshNQ4ISI();

        abstract int getHighSpeedVideoFpsRanges();

        abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.TakePictureManager.CaptureError> getHighSpeedVideoFpsRangesFor();

        abstract androidx.camera.core.imagecapture.PostviewSettings getHighSpeedVideoSizes();

        abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getInputSizeshNQ4ISI();

        abstract android.util.Size getOutputFormats();

        abstract boolean getOutputMinFrameDuration();

        In() {
        }

        static androidx.camera.core.imagecapture.CaptureNode.In getHighResolutionOutputSizeshNQ4ISI(android.util.Size size, int i, java.util.List<java.lang.Integer> list, boolean z, androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider, androidx.camera.core.imagecapture.PostviewSettings postviewSettings) {
            return new androidx.camera.core.imagecapture.AutoValue_CaptureNode_In(size, i, list, z, imageReaderProxyProvider, postviewSettings, new androidx.camera.core.processing.Edge(), new androidx.camera.core.processing.Edge());
        }
    }
}
