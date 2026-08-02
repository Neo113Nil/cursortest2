package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_OutputSurface extends androidx.camera.core.impl.OutputSurface {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final android.view.Surface getHighSpeedVideoFpsRanges;
    private final android.util.Size getHighSpeedVideoSizes;

    AutoValue_OutputSurface(android.view.Surface surface, android.util.Size size, int i) {
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.getHighSpeedVideoFpsRanges = surface;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.getHighSpeedVideoSizes = size;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final android.view.Surface getSurface() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final android.util.Size getSize() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final int getImageFormat() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputSurface{surface=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", size=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", imageFormat=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.OutputSurface)) {
            return false;
        }
        androidx.camera.core.impl.OutputSurface outputSurface = (androidx.camera.core.impl.OutputSurface) obj;
        return this.getHighSpeedVideoFpsRanges.equals(outputSurface.getSurface()) && this.getHighSpeedVideoSizes.equals(outputSurface.getSize()) && this.getHighResolutionOutputSizeshNQ4ISI == outputSurface.getImageFormat();
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoFpsRanges.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoSizes.hashCode()) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
