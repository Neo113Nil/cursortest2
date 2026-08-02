package androidx.camera.core.processing;

/* loaded from: classes6.dex */
final class AutoValue_SurfaceProcessorNode_In extends androidx.camera.core.processing.SurfaceProcessorNode.In {
    private final androidx.camera.core.processing.SurfaceEdge getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<androidx.camera.core.processing.util.OutConfig> getHighSpeedVideoFpsRangesFor;

    AutoValue_SurfaceProcessorNode_In(androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.List<androidx.camera.core.processing.util.OutConfig> list) {
        if (surfaceEdge == null) {
            throw new java.lang.NullPointerException("Null surfaceEdge");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = surfaceEdge;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outConfigs");
        }
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    public final androidx.camera.core.processing.SurfaceEdge getSurfaceEdge() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    public final java.util.List<androidx.camera.core.processing.util.OutConfig> getOutConfigs() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{surfaceEdge=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", outConfigs=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.SurfaceProcessorNode.In)) {
            return false;
        }
        androidx.camera.core.processing.SurfaceProcessorNode.In in = (androidx.camera.core.processing.SurfaceProcessorNode.In) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(in.getSurfaceEdge()) && this.getHighSpeedVideoFpsRangesFor.equals(in.getOutConfigs());
    }

    public final int hashCode() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
