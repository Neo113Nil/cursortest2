package androidx.camera.video;

/* loaded from: classes6.dex */
public abstract class AudioStats {
    public static final double AUDIO_AMPLITUDE_NONE = 0.0d;
    public static final int AUDIO_STATE_ACTIVE = 0;
    public static final int AUDIO_STATE_DISABLED = 1;
    public static final int AUDIO_STATE_ENCODER_ERROR = 3;
    public static final int AUDIO_STATE_MUTED = 5;
    public static final int AUDIO_STATE_SOURCE_ERROR = 4;
    public static final int AUDIO_STATE_SOURCE_SILENCED = 2;
    private static final java.util.Set<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(2, 3, 4)));

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AudioState {
    }

    public abstract long getAudioBytesRecorded();

    public abstract int getAudioState();

    public abstract java.lang.Throwable getErrorCause();

    abstract double getHighSpeedVideoSizes();

    AudioStats() {
    }

    static androidx.camera.video.AudioStats getHighSpeedVideoFpsRangesFor(int i, java.lang.Throwable th, double d, long j) {
        return new androidx.camera.video.AutoValue_AudioStats(i, d, j, th);
    }

    public boolean hasAudio() {
        return getAudioState() == 0;
    }

    public boolean hasError() {
        return getHighResolutionOutputSizeshNQ4ISI.contains(java.lang.Integer.valueOf(getAudioState()));
    }

    public double getAudioAmplitude() {
        if (getAudioState() == 1) {
            return 0.0d;
        }
        return getHighSpeedVideoSizes();
    }
}
