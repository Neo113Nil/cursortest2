package androidx.camera.video;

/* loaded from: classes6.dex */
public abstract class RecordingStats {
    public abstract androidx.camera.video.AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();

    RecordingStats() {
    }

    static androidx.camera.video.RecordingStats getHighResolutionOutputSizeshNQ4ISI(long j, long j2, androidx.camera.video.AudioStats audioStats) {
        androidx.core.util.Preconditions.checkArgument(j >= 0, "duration must be positive value.");
        androidx.core.util.Preconditions.checkArgument(j2 >= 0, "bytes must be positive value.");
        return new androidx.camera.video.AutoValue_RecordingStats(j, j2, audioStats);
    }
}
