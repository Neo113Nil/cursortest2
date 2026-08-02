package androidx.camera.video;

/* loaded from: classes6.dex */
public class RecorderVideoCapabilities implements androidx.camera.video.VideoCapabilities {
    private final boolean Camera2StreamConfigurationMap;
    private final androidx.camera.video.EncoderProfilesResolver getHighResolutionOutputSizeshNQ4ISI;

    RecorderVideoCapabilities(androidx.camera.video.EncoderProfilesResolver encoderProfilesResolver, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        this.getHighResolutionOutputSizeshNQ4ISI = encoderProfilesResolver;
        this.Camera2StreamConfigurationMap = cameraInfoInternal.isVideoStabilizationSupported();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSupportedDynamicRanges();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public java.util.List<androidx.camera.video.Quality> getSupportedQualities(androidx.camera.core.DynamicRange dynamicRange) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSupportedQualities(dynamicRange);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isQualitySupported(androidx.camera.video.Quality quality, androidx.camera.core.DynamicRange dynamicRange) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isQualitySupported(quality, dynamicRange);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isStabilizationSupported() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public android.util.Size getResolution(androidx.camera.video.Quality quality, androidx.camera.core.DynamicRange dynamicRange) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getResolution(quality, dynamicRange);
    }
}
