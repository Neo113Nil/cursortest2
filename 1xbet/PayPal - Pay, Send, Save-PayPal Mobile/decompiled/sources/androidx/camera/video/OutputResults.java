package androidx.camera.video;

/* loaded from: classes6.dex */
public abstract class OutputResults {
    public abstract android.net.Uri getOutputUri();

    static androidx.camera.video.OutputResults getHighResolutionOutputSizeshNQ4ISI(android.net.Uri uri) {
        androidx.core.util.Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new androidx.camera.video.AutoValue_OutputResults(uri);
    }
}
