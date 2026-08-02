package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
public abstract class AudioSettings {
    public static final java.util.List<java.lang.Integer> COMMON_SAMPLE_RATES = java.util.Collections.unmodifiableList(java.util.Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, java.lang.Integer.valueOf(com.google.android.gms.safetynet.SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES), 11025, java.lang.Integer.valueOf(com.visa.cbp.sdk.facade.data.Constants.ON_ERROR_DAS_VALIDATE_GETKEY), 4800));

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public abstract int getCaptureSampleRate();

    public abstract int getChannelCount();

    public abstract int getEncodeSampleRate();

    public abstract androidx.camera.video.internal.audio.AudioSettings.Builder toBuilder();

    public static androidx.camera.video.internal.audio.AudioSettings.Builder builder() {
        return new androidx.camera.video.internal.audio.AutoValue_AudioSettings.Builder().setAudioSource(-1).setCaptureSampleRate(-1).setEncodeSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    AudioSettings() {
    }

    public int getBytesPerFrame() {
        return androidx.camera.video.internal.audio.AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    public static abstract class Builder {
        abstract androidx.camera.video.internal.audio.AudioSettings getHighSpeedVideoFpsRangesFor();

        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setAudioFormat(int i);

        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setAudioSource(int i);

        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setCaptureSampleRate(int i);

        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setChannelCount(int i);

        public abstract androidx.camera.video.internal.audio.AudioSettings.Builder setEncodeSampleRate(int i);

        public final androidx.camera.video.internal.audio.AudioSettings build() {
            java.lang.String str;
            androidx.camera.video.internal.audio.AudioSettings highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor.getAudioSource() != -1) {
                str = "";
            } else {
                str = " audioSource";
            }
            if (highSpeedVideoFpsRangesFor.getCaptureSampleRate() <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" captureSampleRate");
                str = sb.toString();
            }
            if (highSpeedVideoFpsRangesFor.getEncodeSampleRate() <= 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" encodeSampleRate");
                str = sb2.toString();
            }
            if (highSpeedVideoFpsRangesFor.getChannelCount() <= 0) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" channelCount");
                str = sb3.toString();
            }
            if (highSpeedVideoFpsRangesFor.getAudioFormat() == -1) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" audioFormat");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return highSpeedVideoFpsRangesFor;
            }
            throw new java.lang.IllegalArgumentException("Required settings missing or non-positive:".concat(java.lang.String.valueOf(str)));
        }

        Builder() {
        }
    }
}
