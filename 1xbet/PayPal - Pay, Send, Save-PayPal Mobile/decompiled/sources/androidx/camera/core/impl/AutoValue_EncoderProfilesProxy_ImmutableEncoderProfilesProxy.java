package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy extends androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy {
    private final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(int i, int i2, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> list, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> list2) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        if (list == null) {
            throw new java.lang.NullPointerException("Null audioProfiles");
        }
        this.getHighSpeedVideoFpsRangesFor = list;
        if (list2 == null) {
            throw new java.lang.NullPointerException("Null videoProfiles");
        }
        this.Camera2StreamConfigurationMap = list2;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", recommendedFileFormat=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", audioProfiles=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", videoProfiles=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy)) {
            return false;
        }
        androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = (androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy) obj;
        return this.getHighSpeedVideoSizes == immutableEncoderProfilesProxy.getDefaultDurationSeconds() && this.getHighResolutionOutputSizeshNQ4ISI == immutableEncoderProfilesProxy.getRecommendedFileFormat() && this.getHighSpeedVideoFpsRangesFor.equals(immutableEncoderProfilesProxy.getAudioProfiles()) && this.Camera2StreamConfigurationMap.equals(immutableEncoderProfilesProxy.getVideoProfiles());
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        return ((((((i ^ 1000003) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode()) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode();
    }
}
