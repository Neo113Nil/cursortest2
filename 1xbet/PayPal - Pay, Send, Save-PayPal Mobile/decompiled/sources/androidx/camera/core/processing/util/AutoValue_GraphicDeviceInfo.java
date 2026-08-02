package androidx.camera.core.processing.util;

/* loaded from: classes6.dex */
final class AutoValue_GraphicDeviceInfo extends androidx.camera.core.processing.util.GraphicDeviceInfo {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    /* synthetic */ AutoValue_GraphicDeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte b) {
        this(str, str2, str3, str4);
    }

    private AutoValue_GraphicDeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.Camera2StreamConfigurationMap = str4;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final java.lang.String getGlVersion() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final java.lang.String getEglVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final java.lang.String getGlExtensions() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public final java.lang.String getEglExtensions() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", eglVersion=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", glExtensions=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", eglExtensions=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.util.GraphicDeviceInfo)) {
            return false;
        }
        androidx.camera.core.processing.util.GraphicDeviceInfo graphicDeviceInfo = (androidx.camera.core.processing.util.GraphicDeviceInfo) obj;
        return this.getHighSpeedVideoSizes.equals(graphicDeviceInfo.getGlVersion()) && this.getHighSpeedVideoFpsRanges.equals(graphicDeviceInfo.getEglVersion()) && this.getHighSpeedVideoFpsRangesFor.equals(graphicDeviceInfo.getGlExtensions()) && this.Camera2StreamConfigurationMap.equals(graphicDeviceInfo.getEglExtensions());
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges.hashCode()) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode()) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode();
    }

    static final class Builder extends androidx.camera.core.processing.util.GraphicDeviceInfo.Builder {
        private java.lang.String Camera2StreamConfigurationMap;
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        Builder() {
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null glVersion");
            }
            this.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null eglVersion");
            }
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlExtensions(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null glExtensions");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglExtensions(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null eglExtensions");
            }
            this.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public final androidx.camera.core.processing.util.GraphicDeviceInfo build() {
            java.lang.String str;
            if (this.getHighSpeedVideoFpsRanges != null) {
                str = "";
            } else {
                str = " glVersion";
            }
            if (this.Camera2StreamConfigurationMap == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" eglVersion");
                str = sb.toString();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" glExtensions");
                str = sb2.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" eglExtensions");
                str = sb3.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }
    }
}
