package androidx.camera.extensions.internal;

/* loaded from: classes6.dex */
public class PreviewConfigProvider implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.PreviewConfig> {
    private final androidx.camera.extensions.internal.VendorExtender getHighSpeedVideoFpsRanges;

    public PreviewConfigProvider(androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.getHighSpeedVideoFpsRanges = vendorExtender;
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public androidx.camera.core.impl.PreviewConfig getConfig() {
        androidx.camera.core.Preview.Builder builder = new androidx.camera.core.Preview.Builder();
        builder.setSupportedResolutions(this.getHighSpeedVideoFpsRanges.getSupportedPreviewOutputResolutions());
        builder.setHighResolutionDisabled(true);
        return builder.getUseCaseConfig();
    }
}
