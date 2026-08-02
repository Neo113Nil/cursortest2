package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_DeviceProperties extends androidx.camera.core.impl.DeviceProperties {
    private final int getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    AutoValue_DeviceProperties(java.lang.String str, java.lang.String str2, int i) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null manufacturer");
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null model");
        }
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public final java.lang.String manufacturer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public final java.lang.String model() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public final int sdkVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceProperties{manufacturer=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", model=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", sdkVersion=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.DeviceProperties)) {
            return false;
        }
        androidx.camera.core.impl.DeviceProperties deviceProperties = (androidx.camera.core.impl.DeviceProperties) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(deviceProperties.manufacturer()) && this.getHighSpeedVideoSizes.equals(deviceProperties.model()) && this.getHighSpeedVideoFpsRanges == deviceProperties.sdkVersion();
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoFpsRangesFor.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoSizes.hashCode()) * 1000003) ^ this.getHighSpeedVideoFpsRanges;
    }
}
