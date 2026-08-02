package androidx.camera.core.processing.concurrent;

/* loaded from: classes6.dex */
final class AutoValue_DualSurfaceProcessorNode_In extends androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In {
    private final java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.processing.SurfaceEdge getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.processing.SurfaceEdge getHighSpeedVideoSizes;

    AutoValue_DualSurfaceProcessorNode_In(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceEdge surfaceEdge2, java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> list) {
        if (surfaceEdge == null) {
            throw new java.lang.NullPointerException("Null primarySurfaceEdge");
        }
        this.getHighSpeedVideoFpsRanges = surfaceEdge;
        if (surfaceEdge2 == null) {
            throw new java.lang.NullPointerException("Null secondarySurfaceEdge");
        }
        this.getHighSpeedVideoSizes = surfaceEdge2;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outConfigs");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public final androidx.camera.core.processing.SurfaceEdge getPrimarySurfaceEdge() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public final androidx.camera.core.processing.SurfaceEdge getSecondarySurfaceEdge() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public final java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> getOutConfigs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", outConfigs=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In)) {
            return false;
        }
        androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In in = (androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In) obj;
        return this.getHighSpeedVideoFpsRanges.equals(in.getPrimarySurfaceEdge()) && this.getHighSpeedVideoSizes.equals(in.getSecondarySurfaceEdge()) && this.getHighResolutionOutputSizeshNQ4ISI.equals(in.getOutConfigs());
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoFpsRanges.hashCode() ^ 1000003) * 1000003) ^ this.getHighSpeedVideoSizes.hashCode()) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
