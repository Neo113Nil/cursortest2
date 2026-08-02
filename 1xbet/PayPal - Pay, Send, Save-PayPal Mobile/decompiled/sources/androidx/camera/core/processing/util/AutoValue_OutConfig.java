package androidx.camera.core.processing.util;

/* loaded from: classes6.dex */
final class AutoValue_OutConfig extends androidx.camera.core.processing.util.OutConfig {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final android.util.Size getHighSpeedVideoFpsRangesFor;
    private final android.graphics.Rect getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoSizesFor;
    private final java.util.UUID getInputSizeshNQ4ISI;
    private final boolean getOutputMinFrameDuration;

    AutoValue_OutConfig(java.util.UUID uuid, int i, int i2, android.graphics.Rect rect, android.util.Size size, int i3, boolean z, boolean z2) {
        if (uuid == null) {
            throw new java.lang.NullPointerException("Null getUuid");
        }
        this.getInputSizeshNQ4ISI = uuid;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null getCropRect");
        }
        this.getHighSpeedVideoSizes = rect;
        if (size == null) {
            throw new java.lang.NullPointerException("Null getSize");
        }
        this.getHighSpeedVideoFpsRangesFor = size;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.getOutputMinFrameDuration = z;
        this.getHighSpeedVideoSizesFor = z2;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    final java.util.UUID Camera2StreamConfigurationMap() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int getTargets() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int getFormat() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final android.graphics.Rect getCropRect() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final android.util.Size getSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int getRotationDegrees() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean isMirroring() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean shouldRespectInputCropRect() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutConfig{getUuid=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", getTargets=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getFormat=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getCropRect=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getSize=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getRotationDegrees=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", isMirroring=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", shouldRespectInputCropRect=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.util.OutConfig)) {
            return false;
        }
        androidx.camera.core.processing.util.OutConfig outConfig = (androidx.camera.core.processing.util.OutConfig) obj;
        return this.getInputSizeshNQ4ISI.equals(outConfig.Camera2StreamConfigurationMap()) && this.getHighSpeedVideoFpsRanges == outConfig.getTargets() && this.Camera2StreamConfigurationMap == outConfig.getFormat() && this.getHighSpeedVideoSizes.equals(outConfig.getCropRect()) && this.getHighSpeedVideoFpsRangesFor.equals(outConfig.getSize()) && this.getHighResolutionOutputSizeshNQ4ISI == outConfig.getRotationDegrees() && this.getOutputMinFrameDuration == outConfig.isMirroring() && this.getHighSpeedVideoSizesFor == outConfig.shouldRespectInputCropRect();
    }

    public final int hashCode() {
        int hashCode = this.getInputSizeshNQ4ISI.hashCode();
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        int hashCode2 = this.getHighSpeedVideoSizes.hashCode();
        int hashCode3 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i3) * 1000003) ^ (this.getOutputMinFrameDuration ? 1231 : 1237)) * 1000003) ^ (this.getHighSpeedVideoSizesFor ? 1231 : 1237);
    }
}
