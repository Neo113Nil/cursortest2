package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_StateObservable_ErrorWrapper extends androidx.camera.core.impl.StateObservable.ErrorWrapper {
    private final java.lang.Throwable getHighSpeedVideoSizes;

    AutoValue_StateObservable_ErrorWrapper(java.lang.Throwable th) {
        if (th == null) {
            throw new java.lang.NullPointerException("Null error");
        }
        this.getHighSpeedVideoSizes = th;
    }

    @Override // androidx.camera.core.impl.StateObservable.ErrorWrapper
    public final java.lang.Throwable getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorWrapper{error=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper) {
            return this.getHighSpeedVideoSizes.equals(((androidx.camera.core.impl.StateObservable.ErrorWrapper) obj).getHighSpeedVideoFpsRanges());
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() ^ 1000003;
    }
}
