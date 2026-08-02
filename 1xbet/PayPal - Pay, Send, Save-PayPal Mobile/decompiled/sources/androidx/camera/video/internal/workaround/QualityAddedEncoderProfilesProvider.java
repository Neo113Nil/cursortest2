package androidx.camera.video.internal.workaround;

/* loaded from: classes6.dex */
public class QualityAddedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final androidx.camera.core.impl.EncoderProfilesProvider Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoFpsRanges;

    public QualityAddedEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.core.impl.Quirks quirks, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
        this.Camera2StreamConfigurationMap = encoderProfilesProvider;
        java.util.List all = quirks.getAll(androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.class);
        if (all.isEmpty()) {
            return;
        }
        androidx.core.util.Preconditions.checkState(all.size() == 1);
        java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> extraEncoderProfiles = ((androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk) all.get(0)).getExtraEncoderProfiles(cameraInfoInternal, encoderProfilesProvider, finder);
        if (extraEncoderProfiles != null) {
            this.getHighSpeedVideoFpsRanges = new java.util.HashMap(extraEncoderProfiles);
        }
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return Camera2StreamConfigurationMap(i) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i) {
        return Camera2StreamConfigurationMap(i);
    }

    private androidx.camera.core.impl.EncoderProfilesProxy Camera2StreamConfigurationMap(int i) {
        java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> map = this.getHighSpeedVideoFpsRanges;
        if (map != null && map.containsKey(java.lang.Integer.valueOf(i))) {
            return this.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(i));
        }
        return this.Camera2StreamConfigurationMap.getAll(i);
    }
}
