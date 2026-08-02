package androidx.camera.core.processing.concurrent;

/* loaded from: classes6.dex */
final class AutoValue_DualOutConfig extends androidx.camera.core.processing.concurrent.DualOutConfig {
    private final androidx.camera.core.processing.util.OutConfig getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.processing.util.OutConfig getHighSpeedVideoFpsRangesFor;

    AutoValue_DualOutConfig(androidx.camera.core.processing.util.OutConfig outConfig, androidx.camera.core.processing.util.OutConfig outConfig2) {
        if (outConfig == null) {
            throw new java.lang.NullPointerException("Null primaryOutConfig");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = outConfig;
        if (outConfig2 == null) {
            throw new java.lang.NullPointerException("Null secondaryOutConfig");
        }
        this.getHighSpeedVideoFpsRangesFor = outConfig2;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final androidx.camera.core.processing.util.OutConfig getPrimaryOutConfig() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final androidx.camera.core.processing.util.OutConfig getSecondaryOutConfig() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DualOutConfig{primaryOutConfig=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", secondaryOutConfig=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.concurrent.DualOutConfig)) {
            return false;
        }
        androidx.camera.core.processing.concurrent.DualOutConfig dualOutConfig = (androidx.camera.core.processing.concurrent.DualOutConfig) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(dualOutConfig.getPrimaryOutConfig()) && this.getHighSpeedVideoFpsRangesFor.equals(dualOutConfig.getSecondaryOutConfig());
    }

    public final int hashCode() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
