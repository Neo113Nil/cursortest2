package androidx.camera.core.processing;

/* loaded from: classes6.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot {
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoSizes;

    AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i, int i2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        if (completer == null) {
            throw new java.lang.NullPointerException("Null completer");
        }
        this.getHighSpeedVideoSizes = completer;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    final int Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    final int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PendingSnapshot{jpegQuality=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", rotationDegrees=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", completer=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot)) {
            return false;
        }
        androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot = (androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot) obj;
        return this.getHighSpeedVideoFpsRanges == pendingSnapshot.Camera2StreamConfigurationMap() && this.getHighSpeedVideoFpsRangesFor == pendingSnapshot.getHighResolutionOutputSizeshNQ4ISI() && this.getHighSpeedVideoSizes.equals(pendingSnapshot.getHighSpeedVideoFpsRangesFor());
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoFpsRanges ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor) * 1000003) ^ this.getHighSpeedVideoSizes.hashCode();
    }
}
