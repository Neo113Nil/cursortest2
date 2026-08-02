package androidx.camera.video.internal;

/* loaded from: classes6.dex */
final class AutoValue_VideoValidatedEncoderProfilesProxy extends androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy {
    private final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy Camera2StreamConfigurationMap;
    private final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getOutputMinFrameDuration;

    AutoValue_VideoValidatedEncoderProfilesProxy(int i, int i2, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> list, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> list2, androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        if (list == null) {
            throw new java.lang.NullPointerException("Null audioProfiles");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        if (list2 == null) {
            throw new java.lang.NullPointerException("Null videoProfiles");
        }
        this.getOutputMinFrameDuration = list2;
        this.getHighSpeedVideoFpsRanges = audioProfileProxy;
        if (videoProfileProxy == null) {
            throw new java.lang.NullPointerException("Null defaultVideoProfile");
        }
        this.Camera2StreamConfigurationMap = videoProfileProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", recommendedFileFormat=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", audioProfiles=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", videoProfiles=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", defaultAudioProfile=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", defaultVideoProfile=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy)) {
            return false;
        }
        androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) obj;
        if (this.getHighSpeedVideoSizes != videoValidatedEncoderProfilesProxy.getDefaultDurationSeconds() || this.getHighSpeedVideoFpsRangesFor != videoValidatedEncoderProfilesProxy.getRecommendedFileFormat() || !this.getHighResolutionOutputSizeshNQ4ISI.equals(videoValidatedEncoderProfilesProxy.getAudioProfiles()) || !this.getOutputMinFrameDuration.equals(videoValidatedEncoderProfilesProxy.getVideoProfiles())) {
            return false;
        }
        androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.getHighSpeedVideoFpsRanges;
        if (audioProfileProxy == null) {
            if (videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() != null) {
                return false;
            }
        } else if (!audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.getDefaultAudioProfile())) {
            return false;
        }
        return this.Camera2StreamConfigurationMap.equals(videoValidatedEncoderProfilesProxy.getDefaultVideoProfile());
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode2 = this.getOutputMinFrameDuration.hashCode();
        androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.getHighSpeedVideoFpsRanges;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode();
    }
}
