package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
final class AutoValue_AudioEncoderConfig extends androidx.camera.video.internal.encoder.AudioEncoderConfig {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.Timebase getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final int getInputSizeshNQ4ISI;

    /* synthetic */ AutoValue_AudioEncoderConfig(java.lang.String str, int i, androidx.camera.core.impl.Timebase timebase, int i2, int i3, int i4, int i5, byte b) {
        this(str, i, timebase, i2, i3, i4, i5);
    }

    private AutoValue_AudioEncoderConfig(java.lang.String str, int i, androidx.camera.core.impl.Timebase timebase, int i2, int i3, int i4, int i5) {
        this.getHighSpeedVideoSizesFor = str;
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = timebase;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizes = i3;
        this.Camera2StreamConfigurationMap = i4;
        this.getHighSpeedVideoFpsRanges = i5;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public final java.lang.String getMimeType() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public final int getProfile() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public final androidx.camera.core.impl.Timebase getInputTimebase() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int getBitrate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int getCaptureSampleRate() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int getEncodeSampleRate() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int getChannelCount() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", profile=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", inputTimebase=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", bitrate=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", captureSampleRate=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", encodeSampleRate=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", channelCount=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.internal.encoder.AudioEncoderConfig)) {
            return false;
        }
        androidx.camera.video.internal.encoder.AudioEncoderConfig audioEncoderConfig = (androidx.camera.video.internal.encoder.AudioEncoderConfig) obj;
        return this.getHighSpeedVideoSizesFor.equals(audioEncoderConfig.getMimeType()) && this.getInputSizeshNQ4ISI == audioEncoderConfig.getProfile() && this.getHighSpeedVideoFpsRangesFor.equals(audioEncoderConfig.getInputTimebase()) && this.getHighResolutionOutputSizeshNQ4ISI == audioEncoderConfig.getBitrate() && this.getHighSpeedVideoSizes == audioEncoderConfig.getCaptureSampleRate() && this.Camera2StreamConfigurationMap == audioEncoderConfig.getEncodeSampleRate() && this.getHighSpeedVideoFpsRanges == audioEncoderConfig.getChannelCount();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizesFor.hashCode();
        int i = this.getInputSizeshNQ4ISI;
        int hashCode2 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ this.getHighSpeedVideoSizes) * 1000003) ^ this.Camera2StreamConfigurationMap) * 1000003) ^ this.getHighSpeedVideoFpsRanges;
    }

    static final class Builder extends androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder {
        private java.lang.Integer Camera2StreamConfigurationMap;
        private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.Integer getHighSpeedVideoFpsRanges;
        private java.lang.Integer getHighSpeedVideoFpsRangesFor;
        private androidx.camera.core.impl.Timebase getHighSpeedVideoSizes;
        private java.lang.String getHighSpeedVideoSizesFor;
        private java.lang.Integer getInputSizeshNQ4ISI;

        Builder() {
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setMimeType(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null mimeType");
            }
            this.getHighSpeedVideoSizesFor = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setProfile(int i) {
            this.getInputSizeshNQ4ISI = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setInputTimebase(androidx.camera.core.impl.Timebase timebase) {
            if (timebase == null) {
                throw new java.lang.NullPointerException("Null inputTimebase");
            }
            this.getHighSpeedVideoSizes = timebase;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setBitrate(int i) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setCaptureSampleRate(int i) {
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setEncodeSampleRate(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setChannelCount(int i) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        final androidx.camera.video.internal.encoder.AudioEncoderConfig getHighResolutionOutputSizeshNQ4ISI() {
            java.lang.String str;
            if (this.getHighSpeedVideoSizesFor != null) {
                str = "";
            } else {
                str = " mimeType";
            }
            if (this.getInputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" profile");
                str = sb.toString();
            }
            if (this.getHighSpeedVideoSizes == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" inputTimebase");
                str = sb2.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" bitrate");
                str = sb3.toString();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" captureSampleRate");
                str = sb4.toString();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(str);
                sb5.append(" encodeSampleRate");
                str = sb5.toString();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" channelCount");
                str = sb6.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig(this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI.intValue(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.intValue(), this.getHighSpeedVideoFpsRanges.intValue(), this.getHighResolutionOutputSizeshNQ4ISI.intValue(), this.Camera2StreamConfigurationMap.intValue(), (byte) 0);
        }
    }
}
