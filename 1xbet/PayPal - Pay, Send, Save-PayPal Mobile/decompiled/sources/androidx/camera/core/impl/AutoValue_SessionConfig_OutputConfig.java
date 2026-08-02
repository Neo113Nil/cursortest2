package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_SessionConfig_OutputConfig extends androidx.camera.core.impl.SessionConfig.OutputConfig {
    private final androidx.camera.core.impl.DeferrableSurface Camera2StreamConfigurationMap;
    private final androidx.camera.core.DynamicRange getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.util.List<androidx.camera.core.impl.DeferrableSurface> getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;

    /* synthetic */ AutoValue_SessionConfig_OutputConfig(androidx.camera.core.impl.DeferrableSurface deferrableSurface, java.util.List list, java.lang.String str, int i, int i2, androidx.camera.core.DynamicRange dynamicRange, byte b) {
        this(deferrableSurface, list, str, i, i2, dynamicRange);
    }

    private AutoValue_SessionConfig_OutputConfig(androidx.camera.core.impl.DeferrableSurface deferrableSurface, java.util.List<androidx.camera.core.impl.DeferrableSurface> list, java.lang.String str, int i, int i2, androidx.camera.core.DynamicRange dynamicRange) {
        this.Camera2StreamConfigurationMap = deferrableSurface;
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final androidx.camera.core.impl.DeferrableSurface getSurface() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final java.util.List<androidx.camera.core.impl.DeferrableSurface> getSharedSurfaces() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final java.lang.String getPhysicalCameraId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final int getMirrorMode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final int getSurfaceGroupId() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final androidx.camera.core.DynamicRange getDynamicRange() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputConfig{surface=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", sharedSurfaces=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", physicalCameraId=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", mirrorMode=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", surfaceGroupId=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", dynamicRange=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.SessionConfig.OutputConfig)) {
            return false;
        }
        androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig = (androidx.camera.core.impl.SessionConfig.OutputConfig) obj;
        if (!this.Camera2StreamConfigurationMap.equals(outputConfig.getSurface()) || !this.getHighSpeedVideoSizes.equals(outputConfig.getSharedSurfaces())) {
            return false;
        }
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str == null) {
            if (outputConfig.getPhysicalCameraId() != null) {
                return false;
            }
        } else if (!str.equals(outputConfig.getPhysicalCameraId())) {
            return false;
        }
        return this.getHighSpeedVideoFpsRanges == outputConfig.getMirrorMode() && this.getHighSpeedVideoSizesFor == outputConfig.getSurfaceGroupId() && this.getHighResolutionOutputSizeshNQ4ISI.equals(outputConfig.getDynamicRange());
    }

    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode2 = this.getHighSpeedVideoSizes.hashCode();
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.getHighSpeedVideoFpsRanges) * 1000003) ^ this.getHighSpeedVideoSizesFor) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    static final class Builder extends androidx.camera.core.impl.SessionConfig.OutputConfig.Builder {
        private java.lang.Integer Camera2StreamConfigurationMap;
        private java.util.List<androidx.camera.core.impl.DeferrableSurface> getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;
        private androidx.camera.core.DynamicRange getHighSpeedVideoFpsRangesFor;
        private androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoSizes;
        private java.lang.Integer getOutputMinFrameDuration;

        Builder() {
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new java.lang.NullPointerException("Null surface");
            }
            this.getHighSpeedVideoSizes = deferrableSurface;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSharedSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null sharedSurfaces");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setPhysicalCameraId(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setMirrorMode(int i) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i) {
            this.getOutputMinFrameDuration = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new java.lang.NullPointerException("Null dynamicRange");
            }
            this.getHighSpeedVideoFpsRangesFor = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final androidx.camera.core.impl.SessionConfig.OutputConfig build() {
            java.lang.String str;
            if (this.getHighSpeedVideoSizes != null) {
                str = "";
            } else {
                str = " surface";
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" sharedSurfaces");
                str = sb.toString();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" mirrorMode");
                str = sb2.toString();
            }
            if (this.getOutputMinFrameDuration == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" surfaceGroupId");
                str = sb3.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" dynamicRange");
                str = sb4.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.intValue(), this.getOutputMinFrameDuration.intValue(), this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }
    }
}
