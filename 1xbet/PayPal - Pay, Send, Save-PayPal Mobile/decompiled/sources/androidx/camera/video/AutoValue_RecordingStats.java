package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_RecordingStats extends androidx.camera.video.RecordingStats {
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.video.AudioStats getHighSpeedVideoSizes;

    AutoValue_RecordingStats(long j, long j2, androidx.camera.video.AudioStats audioStats) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        if (audioStats == null) {
            throw new java.lang.NullPointerException("Null audioStats");
        }
        this.getHighSpeedVideoSizes = audioStats;
    }

    @Override // androidx.camera.video.RecordingStats
    public final long getRecordedDurationNanos() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.RecordingStats
    public final long getNumBytesRecorded() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.RecordingStats
    public final androidx.camera.video.AudioStats getAudioStats() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecordingStats{recordedDurationNanos=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", numBytesRecorded=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", audioStats=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.RecordingStats)) {
            return false;
        }
        androidx.camera.video.RecordingStats recordingStats = (androidx.camera.video.RecordingStats) obj;
        return this.getHighSpeedVideoFpsRangesFor == recordingStats.getRecordedDurationNanos() && this.getHighResolutionOutputSizeshNQ4ISI == recordingStats.getNumBytesRecorded() && this.getHighSpeedVideoSizes.equals(recordingStats.getAudioStats());
    }

    public final int hashCode() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.getHighSpeedVideoSizes.hashCode();
    }
}
