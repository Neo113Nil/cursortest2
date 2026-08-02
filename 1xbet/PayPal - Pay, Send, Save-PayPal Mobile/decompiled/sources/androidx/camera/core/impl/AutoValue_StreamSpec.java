package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_StreamSpec extends androidx.camera.core.impl.StreamSpec {
    private final android.util.Range<java.lang.Integer> Camera2StreamConfigurationMap;
    private final android.util.Size getHighResolutionOutputSizeshNQ4ISI;
    private final android.util.Size getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.DynamicRange getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.impl.Config getHighSpeedVideoSizes;
    private final boolean getInputSizeshNQ4ISI;
    private final int getOutputMinFrameDuration;

    /* synthetic */ AutoValue_StreamSpec(android.util.Size size, android.util.Size size2, androidx.camera.core.DynamicRange dynamicRange, int i, android.util.Range range, androidx.camera.core.impl.Config config, boolean z, byte b) {
        this(size, size2, dynamicRange, i, range, config, z);
    }

    private AutoValue_StreamSpec(android.util.Size size, android.util.Size size2, androidx.camera.core.DynamicRange dynamicRange, int i, android.util.Range<java.lang.Integer> range, androidx.camera.core.impl.Config config, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = size;
        this.getHighSpeedVideoFpsRanges = size2;
        this.getHighSpeedVideoFpsRangesFor = dynamicRange;
        this.getOutputMinFrameDuration = i;
        this.Camera2StreamConfigurationMap = range;
        this.getHighSpeedVideoSizes = config;
        this.getInputSizeshNQ4ISI = z;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final android.util.Size getResolution() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final android.util.Size getOriginalConfiguredResolution() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final androidx.camera.core.DynamicRange getDynamicRange() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final int getSessionType() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final androidx.camera.core.impl.Config getImplementationOptions() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final boolean getZslDisabled() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamSpec{resolution=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", dynamicRange=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", sessionType=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", implementationOptions=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", zslDisabled=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.StreamSpec)) {
            return false;
        }
        androidx.camera.core.impl.StreamSpec streamSpec = (androidx.camera.core.impl.StreamSpec) obj;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.equals(streamSpec.getResolution()) || !this.getHighSpeedVideoFpsRanges.equals(streamSpec.getOriginalConfiguredResolution()) || !this.getHighSpeedVideoFpsRangesFor.equals(streamSpec.getDynamicRange()) || this.getOutputMinFrameDuration != streamSpec.getSessionType() || !this.Camera2StreamConfigurationMap.equals(streamSpec.getExpectedFrameRateRange())) {
            return false;
        }
        androidx.camera.core.impl.Config config = this.getHighSpeedVideoSizes;
        if (config == null) {
            if (streamSpec.getImplementationOptions() != null) {
                return false;
            }
        } else if (!config.equals(streamSpec.getImplementationOptions())) {
            return false;
        }
        return this.getInputSizeshNQ4ISI == streamSpec.getZslDisabled();
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode3 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int i = this.getOutputMinFrameDuration;
        int hashCode4 = this.Camera2StreamConfigurationMap.hashCode();
        androidx.camera.core.impl.Config config = this.getHighSpeedVideoSizes;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ hashCode4) * 1000003) ^ (config == null ? 0 : config.hashCode())) * 1000003) ^ (this.getInputSizeshNQ4ISI ? 1231 : 1237);
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final androidx.camera.core.impl.StreamSpec.Builder toBuilder() {
        return new androidx.camera.core.impl.AutoValue_StreamSpec.Builder(this, (byte) 0);
    }

    static final class Builder extends androidx.camera.core.impl.StreamSpec.Builder {
        private android.util.Range<java.lang.Integer> Camera2StreamConfigurationMap;
        private androidx.camera.core.DynamicRange getHighResolutionOutputSizeshNQ4ISI;
        private android.util.Size getHighSpeedVideoFpsRanges;
        private androidx.camera.core.impl.Config getHighSpeedVideoFpsRangesFor;
        private android.util.Size getHighSpeedVideoSizes;
        private java.lang.Integer getHighSpeedVideoSizesFor;
        private java.lang.Boolean getOutputMinFrameDuration;

        /* synthetic */ Builder(androidx.camera.core.impl.StreamSpec streamSpec, byte b) {
            this(streamSpec);
        }

        Builder() {
        }

        private Builder(androidx.camera.core.impl.StreamSpec streamSpec) {
            this.getHighSpeedVideoSizes = streamSpec.getResolution();
            this.getHighSpeedVideoFpsRanges = streamSpec.getOriginalConfiguredResolution();
            this.getHighResolutionOutputSizeshNQ4ISI = streamSpec.getDynamicRange();
            this.getHighSpeedVideoSizesFor = java.lang.Integer.valueOf(streamSpec.getSessionType());
            this.Camera2StreamConfigurationMap = streamSpec.getExpectedFrameRateRange();
            this.getHighSpeedVideoFpsRangesFor = streamSpec.getImplementationOptions();
            this.getOutputMinFrameDuration = java.lang.Boolean.valueOf(streamSpec.getZslDisabled());
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec.Builder setResolution(android.util.Size size) {
            if (size == null) {
                throw new java.lang.NullPointerException("Null resolution");
            }
            this.getHighSpeedVideoSizes = size;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec.Builder setOriginalConfiguredResolution(android.util.Size size) {
            if (size == null) {
                throw new java.lang.NullPointerException("Null originalConfiguredResolution");
            }
            this.getHighSpeedVideoFpsRanges = size;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new java.lang.NullPointerException("Null dynamicRange");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec.Builder setSessionType(int i) {
            this.getHighSpeedVideoSizesFor = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec.Builder setExpectedFrameRateRange(android.util.Range<java.lang.Integer> range) {
            if (range == null) {
                throw new java.lang.NullPointerException("Null expectedFrameRateRange");
            }
            this.Camera2StreamConfigurationMap = range;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec.Builder setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.getHighSpeedVideoFpsRangesFor = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec.Builder setZslDisabled(boolean z) {
            this.getOutputMinFrameDuration = java.lang.Boolean.valueOf(z);
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final androidx.camera.core.impl.StreamSpec build() {
            java.lang.String str;
            if (this.getHighSpeedVideoSizes != null) {
                str = "";
            } else {
                str = " resolution";
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" originalConfiguredResolution");
                str = sb.toString();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" dynamicRange");
                str = sb2.toString();
            }
            if (this.getHighSpeedVideoSizesFor == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" sessionType");
                str = sb3.toString();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" expectedFrameRateRange");
                str = sb4.toString();
            }
            if (this.getOutputMinFrameDuration == null) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(str);
                sb5.append(" zslDisabled");
                str = sb5.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.core.impl.AutoValue_StreamSpec(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor.intValue(), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration.booleanValue(), (byte) 0);
        }
    }
}
