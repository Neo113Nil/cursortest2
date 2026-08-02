package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_PostviewSettings extends androidx.camera.core.imagecapture.PostviewSettings {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final android.util.Size getHighSpeedVideoFpsRangesFor;

    AutoValue_PostviewSettings(android.util.Size size, int i) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null resolution");
        }
        this.getHighSpeedVideoFpsRangesFor = size;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.camera.core.imagecapture.PostviewSettings
    public final android.util.Size getResolution() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.imagecapture.PostviewSettings
    public final int getInputFormat() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PostviewSettings{resolution=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", inputFormat=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.PostviewSettings)) {
            return false;
        }
        androidx.camera.core.imagecapture.PostviewSettings postviewSettings = (androidx.camera.core.imagecapture.PostviewSettings) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(postviewSettings.getResolution()) && this.getHighResolutionOutputSizeshNQ4ISI == postviewSettings.getInputFormat();
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRangesFor.hashCode() ^ 1000003) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
