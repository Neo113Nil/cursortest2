package androidx.camera.video.internal.workaround;

/* loaded from: classes6.dex */
public class QualityResolutionModifiedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final androidx.camera.core.impl.Quirks getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.EncoderProfilesProvider getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoSizes = new java.util.HashMap();

    public QualityResolutionModifiedEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.core.impl.Quirks quirks) {
        this.getHighSpeedVideoFpsRanges = encoderProfilesProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return this.getHighSpeedVideoFpsRanges.hasProfile(i) && getHighSpeedVideoSizes(i) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i) {
        return getHighSpeedVideoSizes(i);
    }

    private androidx.camera.core.impl.EncoderProfilesProxy getHighSpeedVideoSizes(int i) {
        android.util.Size size;
        if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        }
        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = null;
        if (this.getHighSpeedVideoFpsRanges.hasProfile(i)) {
            androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy2 = (androidx.camera.core.impl.EncoderProfilesProxy) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRanges.getAll(i));
            java.util.Iterator it = this.getHighResolutionOutputSizeshNQ4ISI.getAll(androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    size = null;
                    break;
                }
                androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) it.next();
                if (stretchedVideoResolutionQuirk != null) {
                    size = stretchedVideoResolutionQuirk.getAlternativeResolution(i);
                    break;
                }
            }
            if (size != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxy2.getVideoProfiles()) {
                    arrayList.add(androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), videoProfileProxy.getBitrate(), videoProfileProxy.getFrameRate(), size.getWidth(), size.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat()));
                }
                if (!arrayList.isEmpty()) {
                    encoderProfilesProxy2 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy2.getDefaultDurationSeconds(), encoderProfilesProxy2.getRecommendedFileFormat(), encoderProfilesProxy2.getAudioProfiles(), arrayList);
                }
            }
            encoderProfilesProxy = encoderProfilesProxy2;
        }
        this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i), encoderProfilesProxy);
        return encoderProfilesProxy;
    }
}
