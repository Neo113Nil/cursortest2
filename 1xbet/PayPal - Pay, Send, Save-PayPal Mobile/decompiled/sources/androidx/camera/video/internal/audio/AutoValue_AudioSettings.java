package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
final class AutoValue_AudioSettings extends androidx.camera.video.internal.audio.AudioSettings {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    /* synthetic */ AutoValue_AudioSettings(int i, int i2, int i3, int i4, int i5, byte b) {
        this(i, i2, i3, i4, i5);
    }

    private AutoValue_AudioSettings(int i, int i2, int i3, int i4, int i5) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighSpeedVideoFpsRangesFor = i4;
        this.getHighSpeedVideoSizes = i5;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int getAudioSource() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int getCaptureSampleRate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int getEncodeSampleRate() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int getChannelCount() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int getAudioFormat() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioSettings{audioSource=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", captureSampleRate=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", encodeSampleRate=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", channelCount=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", audioFormat=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.internal.audio.AudioSettings)) {
            return false;
        }
        androidx.camera.video.internal.audio.AudioSettings audioSettings = (androidx.camera.video.internal.audio.AudioSettings) obj;
        return this.getHighSpeedVideoFpsRanges == audioSettings.getAudioSource() && this.getHighResolutionOutputSizeshNQ4ISI == audioSettings.getCaptureSampleRate() && this.Camera2StreamConfigurationMap == audioSettings.getEncodeSampleRate() && this.getHighSpeedVideoFpsRangesFor == audioSettings.getChannelCount() && this.getHighSpeedVideoSizes == audioSettings.getAudioFormat();
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.Camera2StreamConfigurationMap) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor) * 1000003) ^ this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final androidx.camera.video.internal.audio.AudioSettings.Builder toBuilder() {
        return new androidx.camera.video.internal.audio.AutoValue_AudioSettings.Builder(this, (byte) 0);
    }

    static final class Builder extends androidx.camera.video.internal.audio.AudioSettings.Builder {
        private java.lang.Integer Camera2StreamConfigurationMap;
        private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.Integer getHighSpeedVideoFpsRanges;
        private java.lang.Integer getHighSpeedVideoFpsRangesFor;
        private java.lang.Integer getHighSpeedVideoSizes;

        /* synthetic */ Builder(androidx.camera.video.internal.audio.AudioSettings audioSettings, byte b) {
            this(audioSettings);
        }

        Builder() {
        }

        private Builder(androidx.camera.video.internal.audio.AudioSettings audioSettings) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(audioSettings.getAudioSource());
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(audioSettings.getCaptureSampleRate());
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(audioSettings.getEncodeSampleRate());
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(audioSettings.getChannelCount());
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(audioSettings.getAudioFormat());
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final androidx.camera.video.internal.audio.AudioSettings.Builder setAudioSource(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final androidx.camera.video.internal.audio.AudioSettings.Builder setCaptureSampleRate(int i) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final androidx.camera.video.internal.audio.AudioSettings.Builder setEncodeSampleRate(int i) {
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final androidx.camera.video.internal.audio.AudioSettings.Builder setChannelCount(int i) {
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final androidx.camera.video.internal.audio.AudioSettings.Builder setAudioFormat(int i) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        final androidx.camera.video.internal.audio.AudioSettings getHighSpeedVideoFpsRangesFor() {
            java.lang.String str;
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                str = "";
            } else {
                str = " audioSource";
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" captureSampleRate");
                str = sb.toString();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" encodeSampleRate");
                str = sb2.toString();
            }
            if (this.getHighSpeedVideoSizes == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" channelCount");
                str = sb3.toString();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" audioFormat");
                str = sb4.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.video.internal.audio.AutoValue_AudioSettings(this.getHighResolutionOutputSizeshNQ4ISI.intValue(), this.getHighSpeedVideoFpsRangesFor.intValue(), this.getHighSpeedVideoFpsRanges.intValue(), this.getHighSpeedVideoSizes.intValue(), this.Camera2StreamConfigurationMap.intValue(), (byte) 0);
        }
    }
}
