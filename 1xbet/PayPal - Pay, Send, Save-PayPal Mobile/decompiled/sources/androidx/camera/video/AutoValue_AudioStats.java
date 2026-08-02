package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_AudioStats extends androidx.camera.video.AudioStats {
    private final int Camera2StreamConfigurationMap;
    private final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final double getHighSpeedVideoSizes;

    AutoValue_AudioStats(int i, double d, long j, java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = d;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    @Override // androidx.camera.video.AudioStats
    public final int getAudioState() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.AudioStats
    final double getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.AudioStats
    public final long getAudioBytesRecorded() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.AudioStats
    public final java.lang.Throwable getErrorCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioStats{audioState=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", audioAmplitudeInternal=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", audioBytesRecorded=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", errorCause=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.AudioStats)) {
            return false;
        }
        androidx.camera.video.AudioStats audioStats = (androidx.camera.video.AudioStats) obj;
        if (this.Camera2StreamConfigurationMap != audioStats.getAudioState() || java.lang.Double.doubleToLongBits(this.getHighSpeedVideoSizes) != java.lang.Double.doubleToLongBits(audioStats.getHighSpeedVideoSizes()) || this.getHighSpeedVideoFpsRanges != audioStats.getAudioBytesRecorded()) {
            return false;
        }
        java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
        if (th == null) {
            if (audioStats.getErrorCause() != null) {
                return false;
            }
        } else if (!th.equals(audioStats.getErrorCause())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.Camera2StreamConfigurationMap;
        int doubleToLongBits = (int) ((java.lang.Double.doubleToLongBits(this.getHighSpeedVideoSizes) >>> 32) ^ java.lang.Double.doubleToLongBits(this.getHighSpeedVideoSizes));
        long j = this.getHighSpeedVideoFpsRanges;
        int i2 = (int) ((j >>> 32) ^ j);
        java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((((i ^ 1000003) * 1000003) ^ doubleToLongBits) * 1000003) ^ i2) * 1000003) ^ (th == null ? 0 : th.hashCode());
    }
}
