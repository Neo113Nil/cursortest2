package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_EncoderProfilesProxy_AudioProfileProxy extends androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;

    AutoValue_EncoderProfilesProxy_AudioProfileProxy(int i, java.lang.String str, int i2, int i3, int i4, int i5) {
        this.getHighSpeedVideoFpsRanges = i;
        if (str == null) {
            throw new java.lang.NullPointerException("Null mediaType");
        }
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizesFor = i3;
        this.getHighSpeedVideoSizes = i4;
        this.getHighSpeedVideoFpsRangesFor = i5;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int getCodec() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final java.lang.String getMediaType() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int getBitrate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int getSampleRate() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int getChannels() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int getProfile() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", mediaType=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", bitrate=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", sampleRate=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", channels=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", profile=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy)) {
            return false;
        }
        androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy) obj;
        return this.getHighSpeedVideoFpsRanges == audioProfileProxy.getCodec() && this.Camera2StreamConfigurationMap.equals(audioProfileProxy.getMediaType()) && this.getHighResolutionOutputSizeshNQ4ISI == audioProfileProxy.getBitrate() && this.getHighSpeedVideoSizesFor == audioProfileProxy.getSampleRate() && this.getHighSpeedVideoSizes == audioProfileProxy.getChannels() && this.getHighSpeedVideoFpsRangesFor == audioProfileProxy.getProfile();
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoFpsRanges;
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ this.getHighSpeedVideoSizesFor) * 1000003) ^ this.getHighSpeedVideoSizes) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor;
    }
}
