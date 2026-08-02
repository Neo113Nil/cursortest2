package androidx.camera.core;

/* loaded from: classes6.dex */
final class ImageAnalysisNonBlockingAnalyzer extends androidx.camera.core.ImageAnalysisAbstractAnalyzer {
    final java.util.concurrent.Executor getOutputMinFrameDurationlomOqCM;
    androidx.camera.core.ImageProxy getOutputSizeshNQ4ISI;
    private final java.lang.Object getValidOutputFormatsForInputhNQ4ISI = new java.lang.Object();
    private androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy unwrapAs;

    ImageAnalysisNonBlockingAnalyzer(java.util.concurrent.Executor executor) {
        this.getOutputMinFrameDurationlomOqCM = executor;
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    final androidx.camera.core.ImageProxy getHighSpeedVideoFpsRanges(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    final void getHighSpeedVideoFpsRanges(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.getValidOutputFormatsForInputhNQ4ISI) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                imageProxy.close();
                return;
            }
            if (this.unwrapAs == null) {
                final androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy cacheAnalyzingImageProxy = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy(imageProxy, this);
                this.unwrapAs = cacheAnalyzingImageProxy;
                androidx.camera.core.impl.utils.futures.Futures.addCallback(Camera2StreamConfigurationMap(cacheAnalyzingImageProxy), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Void r1) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(java.lang.Throwable th) {
                        cacheAnalyzingImageProxy.close();
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            } else {
                if (imageProxy.getImageInfo().getTimestamp() <= this.unwrapAs.getImageInfo().getTimestamp()) {
                    imageProxy.close();
                } else {
                    androidx.camera.core.ImageProxy imageProxy2 = this.getOutputSizeshNQ4ISI;
                    if (imageProxy2 != null) {
                        imageProxy2.close();
                    }
                    this.getOutputSizeshNQ4ISI = imageProxy;
                }
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    final void getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.getValidOutputFormatsForInputhNQ4ISI) {
            androidx.camera.core.ImageProxy imageProxy = this.getOutputSizeshNQ4ISI;
            if (imageProxy != null) {
                imageProxy.close();
                this.getOutputSizeshNQ4ISI = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void getHighSpeedVideoSizes() {
        synchronized (this.getValidOutputFormatsForInputhNQ4ISI) {
            this.unwrapAs = null;
            androidx.camera.core.ImageProxy imageProxy = this.getOutputSizeshNQ4ISI;
            if (imageProxy != null) {
                this.getOutputSizeshNQ4ISI = null;
                getHighSpeedVideoFpsRanges(imageProxy);
            }
        }
    }

    static class CacheAnalyzingImageProxy extends androidx.camera.core.ForwardingImageProxy {
        final java.lang.ref.WeakReference<androidx.camera.core.ImageAnalysisNonBlockingAnalyzer> getHighSpeedVideoFpsRangesFor;

        CacheAnalyzingImageProxy(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
            super(imageProxy);
            this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(imageAnalysisNonBlockingAnalyzer);
            addOnImageCloseListener(new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
                public final void onImageClose(androidx.camera.core.ImageProxy imageProxy2) {
                    final androidx.camera.core.ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer2 = androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy.this.getHighSpeedVideoFpsRangesFor.get();
                    if (imageAnalysisNonBlockingAnalyzer2 != null) {
                        imageAnalysisNonBlockingAnalyzer2.getOutputMinFrameDurationlomOqCM.execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.this.getHighSpeedVideoSizes();
                            }
                        });
                    }
                }
            });
        }
    }
}
