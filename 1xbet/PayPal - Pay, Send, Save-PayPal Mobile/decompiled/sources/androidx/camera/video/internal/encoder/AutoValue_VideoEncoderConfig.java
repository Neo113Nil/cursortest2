package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
final class AutoValue_VideoEncoderConfig extends androidx.camera.video.internal.encoder.VideoEncoderConfig {
    private final androidx.camera.video.internal.encoder.VideoEncoderDataSpace Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final android.util.Size getHighSpeedVideoSizesFor;
    private final androidx.camera.core.impl.Timebase getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final int getOutputMinFrameDuration;

    /* synthetic */ AutoValue_VideoEncoderConfig(java.lang.String str, int i, androidx.camera.core.impl.Timebase timebase, android.util.Size size, int i2, androidx.camera.video.internal.encoder.VideoEncoderDataSpace videoEncoderDataSpace, int i3, int i4, int i5, int i6, byte b) {
        this(str, i, timebase, size, i2, videoEncoderDataSpace, i3, i4, i5, i6);
    }

    private AutoValue_VideoEncoderConfig(java.lang.String str, int i, androidx.camera.core.impl.Timebase timebase, android.util.Size size, int i2, androidx.camera.video.internal.encoder.VideoEncoderDataSpace videoEncoderDataSpace, int i3, int i4, int i5, int i6) {
        this.getInputSizeshNQ4ISI = str;
        this.getOutputMinFrameDuration = i;
        this.getInputFormats = timebase;
        this.getHighSpeedVideoSizesFor = size;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = videoEncoderDataSpace;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.getOutputFormats = i4;
        this.getHighSpeedVideoFpsRanges = i5;
        this.getHighSpeedVideoSizes = i6;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public final java.lang.String getMimeType() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public final int getProfile() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public final androidx.camera.core.impl.Timebase getInputTimebase() {
        return this.getInputFormats;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final android.util.Size getResolution() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int getColorFormat() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final androidx.camera.video.internal.encoder.VideoEncoderDataSpace getDataSpace() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int getCaptureFrameRate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int getEncodeFrameRate() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int getIFrameInterval() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int getBitrate() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", profile=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", inputTimebase=");
        sb.append(this.getInputFormats);
        sb.append(", resolution=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", colorFormat=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", dataSpace=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", captureFrameRate=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", encodeFrameRate=");
        sb.append(this.getOutputFormats);
        sb.append(", IFrameInterval=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", bitrate=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.internal.encoder.VideoEncoderConfig)) {
            return false;
        }
        androidx.camera.video.internal.encoder.VideoEncoderConfig videoEncoderConfig = (androidx.camera.video.internal.encoder.VideoEncoderConfig) obj;
        return this.getInputSizeshNQ4ISI.equals(videoEncoderConfig.getMimeType()) && this.getOutputMinFrameDuration == videoEncoderConfig.getProfile() && this.getInputFormats.equals(videoEncoderConfig.getInputTimebase()) && this.getHighSpeedVideoSizesFor.equals(videoEncoderConfig.getResolution()) && this.getHighSpeedVideoFpsRangesFor == videoEncoderConfig.getColorFormat() && this.Camera2StreamConfigurationMap.equals(videoEncoderConfig.getDataSpace()) && this.getHighResolutionOutputSizeshNQ4ISI == videoEncoderConfig.getCaptureFrameRate() && this.getOutputFormats == videoEncoderConfig.getEncodeFrameRate() && this.getHighSpeedVideoFpsRanges == videoEncoderConfig.getIFrameInterval() && this.getHighSpeedVideoSizes == videoEncoderConfig.getBitrate();
    }

    public final int hashCode() {
        int hashCode = this.getInputSizeshNQ4ISI.hashCode();
        int i = this.getOutputMinFrameDuration;
        int hashCode2 = this.getInputFormats.hashCode();
        int hashCode3 = this.getHighSpeedVideoSizesFor.hashCode();
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int hashCode4 = this.Camera2StreamConfigurationMap.hashCode();
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i2) * 1000003) ^ hashCode4) * 1000003) ^ i3) * 1000003) ^ this.getOutputFormats) * 1000003) ^ this.getHighSpeedVideoFpsRanges) * 1000003) ^ this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder toBuilder() {
        return new androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig.Builder(this, (byte) 0);
    }

    static final class Builder extends androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder {
        private java.lang.Integer Camera2StreamConfigurationMap;
        private androidx.camera.video.internal.encoder.VideoEncoderDataSpace getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.Integer getHighSpeedVideoFpsRanges;
        private java.lang.Integer getHighSpeedVideoFpsRangesFor;
        private java.lang.Integer getHighSpeedVideoSizes;
        private androidx.camera.core.impl.Timebase getHighSpeedVideoSizesFor;
        private java.lang.String getInputFormats;
        private java.lang.Integer getInputSizeshNQ4ISI;
        private android.util.Size getOutputFormats;
        private java.lang.Integer getOutputMinFrameDuration;

        /* synthetic */ Builder(androidx.camera.video.internal.encoder.VideoEncoderConfig videoEncoderConfig, byte b) {
            this(videoEncoderConfig);
        }

        Builder() {
        }

        private Builder(androidx.camera.video.internal.encoder.VideoEncoderConfig videoEncoderConfig) {
            this.getInputFormats = videoEncoderConfig.getMimeType();
            this.getOutputMinFrameDuration = java.lang.Integer.valueOf(videoEncoderConfig.getProfile());
            this.getHighSpeedVideoSizesFor = videoEncoderConfig.getInputTimebase();
            this.getOutputFormats = videoEncoderConfig.getResolution();
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(videoEncoderConfig.getColorFormat());
            this.getHighResolutionOutputSizeshNQ4ISI = videoEncoderConfig.getDataSpace();
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(videoEncoderConfig.getCaptureFrameRate());
            this.getInputSizeshNQ4ISI = java.lang.Integer.valueOf(videoEncoderConfig.getEncodeFrameRate());
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(videoEncoderConfig.getIFrameInterval());
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(videoEncoderConfig.getBitrate());
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setMimeType(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null mimeType");
            }
            this.getInputFormats = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setProfile(int i) {
            this.getOutputMinFrameDuration = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setInputTimebase(androidx.camera.core.impl.Timebase timebase) {
            if (timebase == null) {
                throw new java.lang.NullPointerException("Null inputTimebase");
            }
            this.getHighSpeedVideoSizesFor = timebase;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setResolution(android.util.Size size) {
            if (size == null) {
                throw new java.lang.NullPointerException("Null resolution");
            }
            this.getOutputFormats = size;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setColorFormat(int i) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setDataSpace(androidx.camera.video.internal.encoder.VideoEncoderDataSpace videoEncoderDataSpace) {
            if (videoEncoderDataSpace == null) {
                throw new java.lang.NullPointerException("Null dataSpace");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = videoEncoderDataSpace;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setCaptureFrameRate(int i) {
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setEncodeFrameRate(int i) {
            this.getInputSizeshNQ4ISI = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setIFrameInterval(int i) {
            this.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setBitrate(int i) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final androidx.camera.video.internal.encoder.VideoEncoderConfig build() {
            java.lang.String str;
            if (this.getInputFormats != null) {
                str = "";
            } else {
                str = " mimeType";
            }
            if (this.getOutputMinFrameDuration == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" profile");
                str = sb.toString();
            }
            if (this.getHighSpeedVideoSizesFor == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" inputTimebase");
                str = sb2.toString();
            }
            if (this.getOutputFormats == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" resolution");
                str = sb3.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" colorFormat");
                str = sb4.toString();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(str);
                sb5.append(" dataSpace");
                str = sb5.toString();
            }
            if (this.getHighSpeedVideoSizes == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" captureFrameRate");
                str = sb6.toString();
            }
            if (this.getInputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str);
                sb7.append(" encodeFrameRate");
                str = sb7.toString();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(str);
                sb8.append(" IFrameInterval");
                str = sb8.toString();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(str);
                sb9.append(" bitrate");
                str = sb9.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig(this.getInputFormats, this.getOutputMinFrameDuration.intValue(), this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor.intValue(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.intValue(), this.getInputSizeshNQ4ISI.intValue(), this.getHighSpeedVideoFpsRanges.intValue(), this.Camera2StreamConfigurationMap.intValue(), (byte) 0);
        }
    }
}
