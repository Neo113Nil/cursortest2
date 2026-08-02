package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_OutputResults extends androidx.camera.video.OutputResults {
    private final android.net.Uri getHighSpeedVideoSizes;

    AutoValue_OutputResults(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null outputUri");
        }
        this.getHighSpeedVideoSizes = uri;
    }

    @Override // androidx.camera.video.OutputResults
    public final android.net.Uri getOutputUri() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputResults{outputUri=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof androidx.camera.video.OutputResults) {
            return this.getHighSpeedVideoSizes.equals(((androidx.camera.video.OutputResults) obj).getOutputUri());
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() ^ 1000003;
    }
}
