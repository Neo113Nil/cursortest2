package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_ImageReaderFormatRecommender_FormatCombo extends androidx.camera.core.ImageReaderFormatRecommender.FormatCombo {
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    final int getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    final int getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FormatCombo{imageCaptureFormat=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", imageAnalysisFormat=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.ImageReaderFormatRecommender.FormatCombo)) {
            return false;
        }
        androidx.camera.core.ImageReaderFormatRecommender.FormatCombo formatCombo = (androidx.camera.core.ImageReaderFormatRecommender.FormatCombo) obj;
        return this.getHighSpeedVideoSizes == formatCombo.getHighSpeedVideoSizes() && this.getHighSpeedVideoFpsRanges == formatCombo.getHighSpeedVideoFpsRanges();
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoSizes ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges;
    }
}
