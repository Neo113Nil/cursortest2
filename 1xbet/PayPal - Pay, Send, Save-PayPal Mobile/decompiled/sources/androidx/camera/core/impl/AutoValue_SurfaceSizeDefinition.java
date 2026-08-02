package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_SurfaceSizeDefinition extends androidx.camera.core.impl.SurfaceSizeDefinition {
    private final java.util.Map<java.lang.Integer, android.util.Size> Camera2StreamConfigurationMap;
    private final android.util.Size getHighResolutionOutputSizeshNQ4ISI;
    private final android.util.Size getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.Integer, android.util.Size> getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.Integer, android.util.Size> getHighSpeedVideoSizes;
    private final java.util.Map<java.lang.Integer, android.util.Size> getHighSpeedVideoSizesFor;
    private final java.util.Map<java.lang.Integer, android.util.Size> getInputSizeshNQ4ISI;
    private final java.util.Map<java.lang.Integer, android.util.Size> getOutputFormats;
    private final android.util.Size getOutputMinFrameDuration;

    AutoValue_SurfaceSizeDefinition(android.util.Size size, java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size2, java.util.Map<java.lang.Integer, android.util.Size> map2, android.util.Size size3, java.util.Map<java.lang.Integer, android.util.Size> map3, java.util.Map<java.lang.Integer, android.util.Size> map4, java.util.Map<java.lang.Integer, android.util.Size> map5, java.util.Map<java.lang.Integer, android.util.Size> map6) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null analysisSize");
        }
        this.getHighSpeedVideoFpsRanges = size;
        if (map == null) {
            throw new java.lang.NullPointerException("Null s720pSizeMap");
        }
        this.getHighSpeedVideoSizesFor = map;
        if (size2 == null) {
            throw new java.lang.NullPointerException("Null previewSize");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = size2;
        if (map2 == null) {
            throw new java.lang.NullPointerException("Null s1440pSizeMap");
        }
        this.getOutputFormats = map2;
        if (size3 == null) {
            throw new java.lang.NullPointerException("Null recordSize");
        }
        this.getOutputMinFrameDuration = size3;
        if (map3 == null) {
            throw new java.lang.NullPointerException("Null maximumSizeMap");
        }
        this.getHighSpeedVideoFpsRangesFor = map3;
        if (map4 == null) {
            throw new java.lang.NullPointerException("Null maximum4x3SizeMap");
        }
        this.Camera2StreamConfigurationMap = map4;
        if (map5 == null) {
            throw new java.lang.NullPointerException("Null maximum16x9SizeMap");
        }
        this.getHighSpeedVideoSizes = map5;
        if (map6 == null) {
            throw new java.lang.NullPointerException("Null ultraMaximumSizeMap");
        }
        this.getInputSizeshNQ4ISI = map6;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final android.util.Size getAnalysisSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final java.util.Map<java.lang.Integer, android.util.Size> getS720pSizeMap() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final android.util.Size getPreviewSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final java.util.Map<java.lang.Integer, android.util.Size> getS1440pSizeMap() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final android.util.Size getRecordSize() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final java.util.Map<java.lang.Integer, android.util.Size> getMaximumSizeMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final java.util.Map<java.lang.Integer, android.util.Size> getMaximum4x3SizeMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final java.util.Map<java.lang.Integer, android.util.Size> getMaximum16x9SizeMap() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public final java.util.Map<java.lang.Integer, android.util.Size> getUltraMaximumSizeMap() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceSizeDefinition{analysisSize=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", s720pSizeMap=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", previewSize=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", s1440pSizeMap=");
        sb.append(this.getOutputFormats);
        sb.append(", recordSize=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", maximumSizeMap=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", maximum4x3SizeMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", maximum16x9SizeMap=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", ultraMaximumSizeMap=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.SurfaceSizeDefinition)) {
            return false;
        }
        androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition = (androidx.camera.core.impl.SurfaceSizeDefinition) obj;
        return this.getHighSpeedVideoFpsRanges.equals(surfaceSizeDefinition.getAnalysisSize()) && this.getHighSpeedVideoSizesFor.equals(surfaceSizeDefinition.getS720pSizeMap()) && this.getHighResolutionOutputSizeshNQ4ISI.equals(surfaceSizeDefinition.getPreviewSize()) && this.getOutputFormats.equals(surfaceSizeDefinition.getS1440pSizeMap()) && this.getOutputMinFrameDuration.equals(surfaceSizeDefinition.getRecordSize()) && this.getHighSpeedVideoFpsRangesFor.equals(surfaceSizeDefinition.getMaximumSizeMap()) && this.Camera2StreamConfigurationMap.equals(surfaceSizeDefinition.getMaximum4x3SizeMap()) && this.getHighSpeedVideoSizes.equals(surfaceSizeDefinition.getMaximum16x9SizeMap()) && this.getInputSizeshNQ4ISI.equals(surfaceSizeDefinition.getUltraMaximumSizeMap());
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode2 = this.getHighSpeedVideoSizesFor.hashCode();
        int hashCode3 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode4 = this.getOutputFormats.hashCode();
        int hashCode5 = this.getOutputMinFrameDuration.hashCode();
        int hashCode6 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode()) * 1000003) ^ this.getHighSpeedVideoSizes.hashCode()) * 1000003) ^ this.getInputSizeshNQ4ISI.hashCode();
    }
}
