package androidx.camera.extensions.internal;

/* loaded from: classes6.dex */
public class ImageAnalysisConfigProvider implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageAnalysisConfig> {
    private final androidx.camera.extensions.internal.VendorExtender getHighSpeedVideoFpsRanges;

    public ImageAnalysisConfigProvider(androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.getHighSpeedVideoFpsRanges = vendorExtender;
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public androidx.camera.core.impl.ImageAnalysisConfig getConfig() {
        androidx.camera.core.ImageAnalysis.Builder builder = new androidx.camera.core.ImageAnalysis.Builder();
        android.util.Size[] supportedYuvAnalysisResolutions = this.getHighSpeedVideoFpsRanges.getSupportedYuvAnalysisResolutions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0) {
            arrayList.add(new android.util.Pair<>(35, supportedYuvAnalysisResolutions));
        }
        builder.setSupportedResolutions((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) arrayList);
        return builder.getUseCaseConfig();
    }
}
