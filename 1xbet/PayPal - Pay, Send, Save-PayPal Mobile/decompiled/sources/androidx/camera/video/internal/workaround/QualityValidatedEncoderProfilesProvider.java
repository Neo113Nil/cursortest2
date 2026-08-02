package androidx.camera.video.internal.workaround;

/* loaded from: classes6.dex */
public class QualityValidatedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private static final java.util.Map<java.lang.Integer, androidx.camera.video.Quality> getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.CameraInfoInternal Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.EncoderProfilesProvider getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.Quirks getHighSpeedVideoFpsRangesFor;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put(1, androidx.camera.video.Quality.HIGHEST);
        hashMap.put(8, androidx.camera.video.Quality.UHD);
        hashMap.put(6, androidx.camera.video.Quality.FHD);
        hashMap.put(5, androidx.camera.video.Quality.HD);
        hashMap.put(4, androidx.camera.video.Quality.SD);
        hashMap.put(0, androidx.camera.video.Quality.LOWEST);
    }

    public QualityValidatedEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.Quirks quirks) {
        this.getHighResolutionOutputSizeshNQ4ISI = encoderProfilesProvider;
        this.Camera2StreamConfigurationMap = cameraInfoInternal;
        this.getHighSpeedVideoFpsRangesFor = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.hasProfile(i)) {
            return false;
        }
        androidx.camera.video.Quality quality = getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(i));
        if (quality == null) {
            return true;
        }
        for (androidx.camera.video.internal.compat.quirk.VideoQualityQuirk videoQualityQuirk : this.getHighSpeedVideoFpsRangesFor.getAll(androidx.camera.video.internal.compat.quirk.VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.isProblematicVideoQuality(this.Camera2StreamConfigurationMap, quality) && (!(videoQualityQuirk instanceof androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk) || !((androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk) videoQualityQuirk).workaroundBySurfaceProcessing())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i) {
        if (hasProfile(i)) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getAll(i);
        }
        return null;
    }
}
