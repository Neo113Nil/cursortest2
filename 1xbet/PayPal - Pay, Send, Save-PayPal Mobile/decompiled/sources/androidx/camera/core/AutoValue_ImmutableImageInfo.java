package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_ImmutableImageInfo extends androidx.camera.core.ImmutableImageInfo {
    private final int Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.Matrix getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.impl.TagBundle getHighSpeedVideoSizes;

    AutoValue_ImmutableImageInfo(androidx.camera.core.impl.TagBundle tagBundle, long j, int i, android.graphics.Matrix matrix, int i2) {
        if (tagBundle == null) {
            throw new java.lang.NullPointerException("Null tagBundle");
        }
        this.getHighSpeedVideoSizes = tagBundle;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = i;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.getHighSpeedVideoFpsRanges = matrix;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public final androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public final android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public final int getFlashState() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", timestamp=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", rotationDegrees=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", flashState=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.ImmutableImageInfo)) {
            return false;
        }
        androidx.camera.core.ImmutableImageInfo immutableImageInfo = (androidx.camera.core.ImmutableImageInfo) obj;
        return this.getHighSpeedVideoSizes.equals(immutableImageInfo.getTagBundle()) && this.getHighResolutionOutputSizeshNQ4ISI == immutableImageInfo.getTimestamp() && this.Camera2StreamConfigurationMap == immutableImageInfo.getRotationDegrees() && this.getHighSpeedVideoFpsRanges.equals(immutableImageInfo.getSensorToBufferTransformMatrix()) && this.getHighSpeedVideoFpsRangesFor == immutableImageInfo.getFlashState();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.Camera2StreamConfigurationMap;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ this.getHighSpeedVideoFpsRanges.hashCode()) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor;
    }
}
