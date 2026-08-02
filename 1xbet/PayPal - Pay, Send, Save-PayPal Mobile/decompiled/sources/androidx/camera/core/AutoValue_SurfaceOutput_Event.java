package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_SurfaceOutput_Event extends androidx.camera.core.SurfaceOutput.Event {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.SurfaceOutput getHighSpeedVideoFpsRangesFor;

    AutoValue_SurfaceOutput_Event(int i, androidx.camera.core.SurfaceOutput surfaceOutput) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (surfaceOutput == null) {
            throw new java.lang.NullPointerException("Null surfaceOutput");
        }
        this.getHighSpeedVideoFpsRangesFor = surfaceOutput;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public final int getEventCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public final androidx.camera.core.SurfaceOutput getSurfaceOutput() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Event{eventCode=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", surfaceOutput=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceOutput.Event)) {
            return false;
        }
        androidx.camera.core.SurfaceOutput.Event event = (androidx.camera.core.SurfaceOutput.Event) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == event.getEventCode() && this.getHighSpeedVideoFpsRangesFor.equals(event.getSurfaceOutput());
    }

    public final int hashCode() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
