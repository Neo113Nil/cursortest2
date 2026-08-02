package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_ProcessingNode_In extends androidx.camera.core.imagecapture.ProcessingNode.In {
    private final int Camera2StreamConfigurationMap;
    private final java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getHighSpeedVideoFpsRangesFor;

    AutoValue_ProcessingNode_In(androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> edge, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> edge2, int i, java.util.List<java.lang.Integer> list) {
        this.getHighSpeedVideoFpsRangesFor = edge;
        this.getHighSpeedVideoFpsRanges = edge2;
        this.Camera2StreamConfigurationMap = i;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outputFormats");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    final int getHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In{edge=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", postviewEdge=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", inputFormat=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", outputFormats=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.ProcessingNode.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.ProcessingNode.In in = (androidx.camera.core.imagecapture.ProcessingNode.In) obj;
        return this.getHighSpeedVideoFpsRangesFor.equals(in.getHighResolutionOutputSizeshNQ4ISI()) && this.getHighSpeedVideoFpsRanges.equals(in.Camera2StreamConfigurationMap()) && this.Camera2StreamConfigurationMap == in.getHighSpeedVideoFpsRangesFor() && this.getHighResolutionOutputSizeshNQ4ISI.equals(in.getHighSpeedVideoFpsRanges());
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRangesFor.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges.hashCode()) * 1000003) ^ this.Camera2StreamConfigurationMap) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
