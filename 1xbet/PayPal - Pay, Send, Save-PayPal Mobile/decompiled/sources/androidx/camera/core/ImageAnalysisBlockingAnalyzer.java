package androidx.camera.core;

/* loaded from: classes6.dex */
final class ImageAnalysisBlockingAnalyzer extends androidx.camera.core.ImageAnalysisAbstractAnalyzer {
    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    final void getHighResolutionOutputSizeshNQ4ISI() {
    }

    ImageAnalysisBlockingAnalyzer() {
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    final androidx.camera.core.ImageProxy getHighSpeedVideoFpsRanges(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    final void getHighSpeedVideoFpsRanges(final androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.futures.Futures.addCallback(Camera2StreamConfigurationMap(imageProxy), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.ImageAnalysisBlockingAnalyzer.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* bridge */ /* synthetic */ void onSuccess(java.lang.Void r1) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                imageProxy.close();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }
}
