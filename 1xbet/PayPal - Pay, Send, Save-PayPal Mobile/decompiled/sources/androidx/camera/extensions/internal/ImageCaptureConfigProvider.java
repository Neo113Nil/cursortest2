package androidx.camera.extensions.internal;

/* loaded from: classes6.dex */
public class ImageCaptureConfigProvider implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageCaptureConfig> {
    private final androidx.camera.extensions.internal.VendorExtender getHighSpeedVideoSizes;

    public ImageCaptureConfigProvider(androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.getHighSpeedVideoSizes = vendorExtender;
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public androidx.camera.core.impl.ImageCaptureConfig getConfig() {
        androidx.camera.core.ImageCapture.Builder builder = new androidx.camera.core.ImageCapture.Builder();
        builder.setSupportedResolutions(this.getHighSpeedVideoSizes.getSupportedCaptureOutputResolutions());
        builder.setHighResolutionDisabled(true);
        return builder.getUseCaseConfig();
    }
}
