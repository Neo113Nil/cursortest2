package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_SurfaceRequest_Result extends androidx.camera.core.SurfaceRequest.Result {
    private final android.view.Surface getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    AutoValue_SurfaceRequest_Result(int i, android.view.Surface surface) {
        this.getHighSpeedVideoFpsRangesFor = i;
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = surface;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public final int getResultCode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public final android.view.Surface getSurface() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Result{resultCode=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", surface=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceRequest.Result)) {
            return false;
        }
        androidx.camera.core.SurfaceRequest.Result result = (androidx.camera.core.SurfaceRequest.Result) obj;
        return this.getHighSpeedVideoFpsRangesFor == result.getResultCode() && this.getHighResolutionOutputSizeshNQ4ISI.equals(result.getSurface());
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRangesFor ^ 1000003) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
