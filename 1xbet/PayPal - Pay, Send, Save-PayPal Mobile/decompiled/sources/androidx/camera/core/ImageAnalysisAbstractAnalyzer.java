package androidx.camera.core;

/* loaded from: classes6.dex */
abstract class ImageAnalysisAbstractAnalyzer implements androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener {
    volatile boolean Camera2StreamConfigurationMap;
    private java.util.concurrent.Executor accessartificialFrame;
    java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI;
    java.nio.ByteBuffer getHighSpeedVideoSizes;
    volatile boolean getHighSpeedVideoSizesFor;
    androidx.camera.core.SafeCloseImageReaderProxy getInputFormats;
    volatile int getOutputFormats;
    java.nio.ByteBuffer getOutputMinFrameDuration;
    java.nio.ByteBuffer getOutputSizes;
    java.nio.ByteBuffer getOutputStallDuration;
    java.nio.ByteBuffer getOutputStallDurationlomOqCM;
    private androidx.camera.core.ImageAnalysis.Analyzer getValidOutputFormatsForInputhNQ4ISI;
    private volatile int isOutputSupportedFor;
    private android.media.ImageWriter isOutputSupportedForhNQ4ISI;
    volatile int getInputSizeshNQ4ISI = 1;
    private android.graphics.Rect getOutputSizeshNQ4ISI = new android.graphics.Rect();
    private android.graphics.Rect unwrapAs = new android.graphics.Rect();
    private android.graphics.Matrix getOutputMinFrameDurationlomOqCM = new android.graphics.Matrix();
    private android.graphics.Matrix toString = new android.graphics.Matrix();
    final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    protected boolean getHighSpeedVideoFpsRangesFor = true;

    abstract void getHighResolutionOutputSizeshNQ4ISI();

    abstract androidx.camera.core.ImageProxy getHighSpeedVideoFpsRanges(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy);

    abstract void getHighSpeedVideoFpsRanges(androidx.camera.core.ImageProxy imageProxy);

    ImageAnalysisAbstractAnalyzer() {
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        try {
            androidx.camera.core.ImageProxy highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(imageReaderProxy);
            if (highSpeedVideoFpsRanges != null) {
                getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
            }
        } catch (java.lang.IllegalStateException e) {
            androidx.camera.core.Logger.e("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> Camera2StreamConfigurationMap(final androidx.camera.core.ImageProxy imageProxy) {
        final java.util.concurrent.Executor executor;
        final androidx.camera.core.ImageAnalysis.Analyzer analyzer;
        boolean z;
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        android.media.ImageWriter imageWriter;
        java.nio.ByteBuffer byteBuffer;
        java.nio.ByteBuffer byteBuffer2;
        java.nio.ByteBuffer byteBuffer3;
        java.nio.ByteBuffer byteBuffer4;
        java.nio.ByteBuffer byteBuffer5;
        java.nio.ByteBuffer byteBuffer6;
        androidx.camera.core.ImageProxy rotateYUVAndConvertToNV21;
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2;
        int i = this.getHighSpeedVideoSizesFor ? this.getOutputFormats : 0;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            executor = this.accessartificialFrame;
            analyzer = this.getValidOutputFormatsForInputhNQ4ISI;
            z = this.getHighSpeedVideoSizesFor && i != this.isOutputSupportedFor;
            if (z && (safeCloseImageReaderProxy2 = this.getInputFormats) != null) {
                safeCloseImageReaderProxy2.safeClose();
                int width = imageProxy.getWidth();
                int height = imageProxy.getHeight();
                int imageFormat = this.getInputFormats.getImageFormat();
                int maxImages = this.getInputFormats.getMaxImages();
                boolean z2 = i == 90 || i == 270;
                int i2 = z2 ? height : width;
                if (!z2) {
                    width = height;
                }
                this.getInputFormats = new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(i2, width, imageFormat, maxImages));
                if (this.getInputSizeshNQ4ISI == 1) {
                    android.media.ImageWriter imageWriter2 = this.isOutputSupportedForhNQ4ISI;
                    if (imageWriter2 != null) {
                        androidx.camera.core.internal.compat.ImageWriterCompat.close(imageWriter2);
                    }
                    this.isOutputSupportedForhNQ4ISI = androidx.camera.core.internal.compat.ImageWriterCompat.newInstance(this.getInputFormats.getSurface(), this.getInputFormats.getMaxImages());
                }
            }
            if (this.getHighSpeedVideoSizesFor || this.getInputSizeshNQ4ISI == 3) {
                if (this.getInputSizeshNQ4ISI == 1 || this.getInputSizeshNQ4ISI == 3) {
                    if (this.getOutputStallDurationlomOqCM == null) {
                        this.getOutputStallDurationlomOqCM = java.nio.ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
                    }
                    this.getOutputStallDurationlomOqCM.position(0);
                    if (this.getOutputStallDuration == null) {
                        this.getOutputStallDuration = java.nio.ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
                    }
                    this.getOutputStallDuration.position(0);
                    if (this.getOutputSizes == null) {
                        this.getOutputSizes = java.nio.ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
                    }
                    this.getOutputSizes.position(0);
                    if (this.getInputSizeshNQ4ISI == 3) {
                        if (this.getHighSpeedVideoSizes == null) {
                            this.getHighSpeedVideoSizes = java.nio.ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
                        }
                        this.getHighSpeedVideoSizes.position(0);
                        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                            this.getHighResolutionOutputSizeshNQ4ISI = java.nio.ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 2);
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.position(0);
                    }
                } else if (this.getInputSizeshNQ4ISI == 2 && this.getOutputMinFrameDuration == null) {
                    this.getOutputMinFrameDuration = java.nio.ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4);
                }
            }
            safeCloseImageReaderProxy = this.getInputFormats;
            imageWriter = this.isOutputSupportedForhNQ4ISI;
            byteBuffer = this.getOutputMinFrameDuration;
            byteBuffer2 = this.getOutputStallDurationlomOqCM;
            byteBuffer3 = this.getOutputStallDuration;
            byteBuffer4 = this.getOutputSizes;
            byteBuffer5 = this.getHighSpeedVideoSizes;
            byteBuffer6 = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (analyzer != null && executor != null && this.getHighSpeedVideoFpsRangesFor) {
            if (safeCloseImageReaderProxy != null) {
                if (this.getInputSizeshNQ4ISI == 2) {
                    rotateYUVAndConvertToNV21 = androidx.camera.core.ImageProcessingUtil.convertYUVToRGB(imageProxy, safeCloseImageReaderProxy, byteBuffer, i, this.Camera2StreamConfigurationMap);
                } else {
                    if (this.getInputSizeshNQ4ISI == 1) {
                        if (this.Camera2StreamConfigurationMap) {
                            androidx.camera.core.ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                        }
                        if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                            rotateYUVAndConvertToNV21 = androidx.camera.core.ImageProcessingUtil.rotateYUV(imageProxy, safeCloseImageReaderProxy, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                        }
                    }
                    rotateYUVAndConvertToNV21 = null;
                }
            } else {
                if (this.getInputSizeshNQ4ISI == 3) {
                    if (this.Camera2StreamConfigurationMap) {
                        androidx.camera.core.ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                    }
                    if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                        rotateYUVAndConvertToNV21 = androidx.camera.core.ImageProcessingUtil.rotateYUVAndConvertToNV21(imageProxy, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    }
                }
                rotateYUVAndConvertToNV21 = null;
            }
            boolean z3 = rotateYUVAndConvertToNV21 == null;
            final androidx.camera.core.ImageProxy imageProxy2 = z3 ? imageProxy : rotateYUVAndConvertToNV21;
            final android.graphics.Rect rect = new android.graphics.Rect();
            final android.graphics.Matrix matrix = new android.graphics.Matrix();
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (z && !z3) {
                    int width2 = imageProxy.getWidth();
                    int height2 = imageProxy.getHeight();
                    int width3 = imageProxy2.getWidth();
                    int height3 = imageProxy2.getHeight();
                    int i3 = this.getOutputFormats;
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    if (i3 > 0) {
                        matrix2.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, width2, height2), androidx.camera.core.impl.utils.TransformUtils.NORMALIZED_RECT, android.graphics.Matrix.ScaleToFit.FILL);
                        matrix2.postRotate(i3);
                        matrix2.postConcat(androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(new android.graphics.RectF(0.0f, 0.0f, width3, height3)));
                    }
                    android.graphics.RectF rectF = new android.graphics.RectF(this.getOutputSizeshNQ4ISI);
                    matrix2.mapRect(rectF);
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    rectF.round(rect2);
                    this.unwrapAs = rect2;
                    this.toString.setConcat(this.getOutputMinFrameDurationlomOqCM, matrix2);
                }
                this.isOutputSupportedFor = i;
                rect.set(this.unwrapAs);
                matrix.set(this.toString);
            }
            return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.ImageAnalysisAbstractAnalyzer$$ExternalSyntheticLambda1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    final androidx.camera.core.ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = androidx.camera.core.ImageAnalysisAbstractAnalyzer.this;
                    java.util.concurrent.Executor executor2 = executor;
                    final androidx.camera.core.ImageProxy imageProxy3 = imageProxy;
                    final android.graphics.Matrix matrix3 = matrix;
                    final androidx.camera.core.ImageProxy imageProxy4 = imageProxy2;
                    final android.graphics.Rect rect3 = rect;
                    final androidx.camera.core.ImageAnalysis.Analyzer analyzer2 = analyzer;
                    executor2.execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysisAbstractAnalyzer$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.ImageAnalysisAbstractAnalyzer.this.Camera2StreamConfigurationMap(imageProxy3, matrix3, imageProxy4, rect3, analyzer2, completer);
                        }
                    });
                    return "analyzeImage";
                }
            });
        }
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.core.os.OperationCanceledException("No analyzer or executor currently set."));
    }

    final /* synthetic */ void Camera2StreamConfigurationMap(androidx.camera.core.ImageProxy imageProxy, android.graphics.Matrix matrix, androidx.camera.core.ImageProxy imageProxy2, android.graphics.Rect rect, androidx.camera.core.ImageAnalysis.Analyzer analyzer, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.core.SettableImageProxy settableImageProxy = new androidx.camera.core.SettableImageProxy(imageProxy2, androidx.camera.core.ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), this.getHighSpeedVideoSizesFor ? 0 : this.getOutputFormats, matrix, imageProxy.getImageInfo().getFlashState()));
            if (!rect.isEmpty()) {
                settableImageProxy.setCropRect(rect);
            }
            analyzer.analyze(settableImageProxy);
            completer.set(null);
            return;
        }
        completer.setException(new androidx.core.os.OperationCanceledException("ImageAnalysis is detached"));
    }

    final void getHighSpeedVideoFpsRangesFor(android.graphics.Rect rect) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getOutputSizeshNQ4ISI = rect;
            this.unwrapAs = new android.graphics.Rect(this.getOutputSizeshNQ4ISI);
        }
    }

    final void getHighSpeedVideoFpsRanges(android.graphics.Matrix matrix) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getOutputMinFrameDurationlomOqCM = matrix;
            this.toString = new android.graphics.Matrix(this.getOutputMinFrameDurationlomOqCM);
        }
    }

    final void getHighSpeedVideoSizes(java.util.concurrent.Executor executor, androidx.camera.core.ImageAnalysis.Analyzer analyzer) {
        if (analyzer == null) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getValidOutputFormatsForInputhNQ4ISI = analyzer;
            this.accessartificialFrame = executor;
        }
    }

    final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoFpsRangesFor = false;
        getHighResolutionOutputSizeshNQ4ISI();
    }
}
