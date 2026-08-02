package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_QualityRatioToResolutionsTable_QualityRatio extends androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.video.Quality getHighSpeedVideoFpsRanges;

    AutoValue_QualityRatioToResolutionsTable_QualityRatio(androidx.camera.video.Quality quality, int i) {
        if (quality == null) {
            throw new java.lang.NullPointerException("Null quality");
        }
        this.getHighSpeedVideoFpsRanges = quality;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    final androidx.camera.video.Quality getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio
    final int getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QualityRatio{quality=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", aspectRatio=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio)) {
            return false;
        }
        androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio qualityRatio = (androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio) obj;
        return this.getHighSpeedVideoFpsRanges.equals(qualityRatio.getHighResolutionOutputSizeshNQ4ISI()) && this.getHighResolutionOutputSizeshNQ4ISI == qualityRatio.getHighSpeedVideoFpsRangesFor();
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRanges.hashCode() ^ 1000003) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
