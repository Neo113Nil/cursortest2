package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_EncoderProfilesProxy_VideoProfileProxy extends androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final int getOutputMinFrameDuration;

    AutoValue_EncoderProfilesProxy_VideoProfileProxy(int i, java.lang.String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.getHighSpeedVideoFpsRanges = i;
        if (str == null) {
            throw new java.lang.NullPointerException("Null mediaType");
        }
        this.getInputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.getOutputMinFrameDuration = i4;
        this.getOutputFormats = i5;
        this.getHighSpeedVideoSizesFor = i6;
        this.Camera2StreamConfigurationMap = i7;
        this.getHighSpeedVideoSizes = i8;
        this.getInputFormats = i9;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getCodec() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final java.lang.String getMediaType() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getBitrate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getFrameRate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getWidth() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getHeight() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getProfile() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getBitDepth() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getChromaSubsampling() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int getHdrFormat() {
        return this.getInputFormats;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", mediaType=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", bitrate=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", frameRate=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", width=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", height=");
        sb.append(this.getOutputFormats);
        sb.append(", profile=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", bitDepth=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", chromaSubsampling=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", hdrFormat=");
        sb.append(this.getInputFormats);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy)) {
            return false;
        }
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) obj;
        return this.getHighSpeedVideoFpsRanges == videoProfileProxy.getCodec() && this.getInputSizeshNQ4ISI.equals(videoProfileProxy.getMediaType()) && this.getHighSpeedVideoFpsRangesFor == videoProfileProxy.getBitrate() && this.getHighResolutionOutputSizeshNQ4ISI == videoProfileProxy.getFrameRate() && this.getOutputMinFrameDuration == videoProfileProxy.getWidth() && this.getOutputFormats == videoProfileProxy.getHeight() && this.getHighSpeedVideoSizesFor == videoProfileProxy.getProfile() && this.Camera2StreamConfigurationMap == videoProfileProxy.getBitDepth() && this.getHighSpeedVideoSizes == videoProfileProxy.getChromaSubsampling() && this.getInputFormats == videoProfileProxy.getHdrFormat();
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoFpsRanges;
        int hashCode = this.getInputSizeshNQ4ISI.hashCode();
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = this.getOutputMinFrameDuration;
        int i5 = this.getOutputFormats;
        int i6 = this.getHighSpeedVideoSizesFor;
        return ((((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ this.Camera2StreamConfigurationMap) * 1000003) ^ this.getHighSpeedVideoSizes) * 1000003) ^ this.getInputFormats;
    }
}
