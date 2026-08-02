package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class ImageProcessorRequest implements androidx.camera.core.ImageProcessor.Request {
    private final androidx.camera.core.ImageProxy getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public ImageProcessorRequest(androidx.camera.core.ImageProxy imageProxy, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = imageProxy;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public androidx.camera.core.ImageProxy getInputImage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
