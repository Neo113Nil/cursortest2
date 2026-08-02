package androidx.camera.core.internal;

/* loaded from: classes6.dex */
final class AutoValue_ImmutableZoomState extends androidx.camera.core.internal.ImmutableZoomState {
    private final float Camera2StreamConfigurationMap;
    private final float getHighSpeedVideoFpsRanges;
    private final float getHighSpeedVideoFpsRangesFor;
    private final float getHighSpeedVideoSizes;

    AutoValue_ImmutableZoomState(float f, float f2, float f3, float f4) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoSizes = f2;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getHighSpeedVideoFpsRanges = f4;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public final float getZoomRatio() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public final float getMaxZoomRatio() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public final float getMinZoomRatio() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public final float getLinearZoom() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", maxZoomRatio=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", minZoomRatio=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", linearZoom=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.internal.ImmutableZoomState)) {
            return false;
        }
        androidx.camera.core.internal.ImmutableZoomState immutableZoomState = (androidx.camera.core.internal.ImmutableZoomState) obj;
        return java.lang.Float.floatToIntBits(this.Camera2StreamConfigurationMap) == java.lang.Float.floatToIntBits(immutableZoomState.getZoomRatio()) && java.lang.Float.floatToIntBits(this.getHighSpeedVideoSizes) == java.lang.Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && java.lang.Float.floatToIntBits(this.getHighSpeedVideoFpsRangesFor) == java.lang.Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && java.lang.Float.floatToIntBits(this.getHighSpeedVideoFpsRanges) == java.lang.Float.floatToIntBits(immutableZoomState.getLinearZoom());
    }

    public final int hashCode() {
        int floatToIntBits = java.lang.Float.floatToIntBits(this.Camera2StreamConfigurationMap);
        return ((((((floatToIntBits ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.getHighSpeedVideoSizes)) * 1000003) ^ java.lang.Float.floatToIntBits(this.getHighSpeedVideoFpsRangesFor)) * 1000003) ^ java.lang.Float.floatToIntBits(this.getHighSpeedVideoFpsRanges);
    }
}
