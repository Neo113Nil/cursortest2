package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_Quality_ConstantQuality extends androidx.camera.video.Quality.ConstantQuality {
    private final int Camera2StreamConfigurationMap;
    private final java.util.List<android.util.Size> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    AutoValue_Quality_ConstantQuality(int i, int i2, java.lang.String str, java.util.List<android.util.Size> list) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = i2;
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null typicalSizes");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    final int Camera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    final int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final java.util.List<android.util.Size> getTypicalSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConstantQuality{value=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", highSpeedValue=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", name=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", typicalSizes=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.Quality.ConstantQuality)) {
            return false;
        }
        androidx.camera.video.Quality.ConstantQuality constantQuality = (androidx.camera.video.Quality.ConstantQuality) obj;
        return this.Camera2StreamConfigurationMap == constantQuality.Camera2StreamConfigurationMap() && this.getHighSpeedVideoSizes == constantQuality.getHighResolutionOutputSizeshNQ4ISI() && this.getHighSpeedVideoFpsRangesFor.equals(constantQuality.getName()) && this.getHighResolutionOutputSizeshNQ4ISI.equals(constantQuality.getTypicalSizes());
    }

    public final int hashCode() {
        int i = this.Camera2StreamConfigurationMap;
        return ((((((i ^ 1000003) * 1000003) ^ this.getHighSpeedVideoSizes) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode()) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
