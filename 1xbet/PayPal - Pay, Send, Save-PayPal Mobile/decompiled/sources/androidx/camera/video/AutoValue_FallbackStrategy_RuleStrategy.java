package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_FallbackStrategy_RuleStrategy extends androidx.camera.video.FallbackStrategy.RuleStrategy {
    private final int Camera2StreamConfigurationMap;
    private final androidx.camera.video.Quality getHighSpeedVideoFpsRanges;

    AutoValue_FallbackStrategy_RuleStrategy(androidx.camera.video.Quality quality, int i) {
        if (quality == null) {
            throw new java.lang.NullPointerException("Null fallbackQuality");
        }
        this.getHighSpeedVideoFpsRanges = quality;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    final androidx.camera.video.Quality getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    final int getHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", fallbackRule=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.FallbackStrategy.RuleStrategy)) {
            return false;
        }
        androidx.camera.video.FallbackStrategy.RuleStrategy ruleStrategy = (androidx.camera.video.FallbackStrategy.RuleStrategy) obj;
        return this.getHighSpeedVideoFpsRanges.equals(ruleStrategy.getHighSpeedVideoFpsRangesFor()) && this.Camera2StreamConfigurationMap == ruleStrategy.getHighSpeedVideoSizes();
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRanges.hashCode() ^ 1000003) * 1000003) ^ this.Camera2StreamConfigurationMap;
    }
}
