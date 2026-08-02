package androidx.camera.view;

/* loaded from: classes6.dex */
abstract class PreviewViewImplementation {
    boolean Camera2StreamConfigurationMap = false;
    android.util.Size getHighResolutionOutputSizeshNQ4ISI;
    android.widget.FrameLayout getHighSpeedVideoFpsRanges;
    final androidx.camera.view.PreviewTransformation getHighSpeedVideoFpsRangesFor;

    interface OnSurfaceNotInUseListener {
        void onSurfaceNotInUse();
    }

    abstract void Camera2StreamConfigurationMap();

    abstract void Camera2StreamConfigurationMap(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener);

    abstract android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI();

    void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor, androidx.camera.view.PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
    }

    abstract void getHighSpeedVideoFpsRanges();

    abstract android.view.View getHighSpeedVideoFpsRangesFor();

    abstract void getHighSpeedVideoSizes();

    abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOutputFormats();

    PreviewViewImplementation(android.widget.FrameLayout frameLayout, androidx.camera.view.PreviewTransformation previewTransformation) {
        this.getHighSpeedVideoFpsRanges = frameLayout;
        this.getHighSpeedVideoFpsRangesFor = previewTransformation;
    }

    final void getHighSpeedVideoSizesFor() {
        android.view.View highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor == null || !this.Camera2StreamConfigurationMap) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(new android.util.Size(this.getHighSpeedVideoFpsRanges.getWidth(), this.getHighSpeedVideoFpsRanges.getHeight()), this.getHighSpeedVideoFpsRanges.getLayoutDirection(), highSpeedVideoFpsRangesFor);
    }

    final void getInputSizeshNQ4ISI() {
        this.Camera2StreamConfigurationMap = true;
        getHighSpeedVideoSizesFor();
    }
}
