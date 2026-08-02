package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public abstract class AudioEncoderConfig implements androidx.camera.video.internal.encoder.EncoderConfig {
    public abstract int getBitrate();

    public abstract int getCaptureSampleRate();

    public abstract int getChannelCount();

    public abstract int getEncodeSampleRate();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract androidx.camera.core.impl.Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract java.lang.String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    AudioEncoderConfig() {
    }

    public static androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder builder() {
        return new androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig.Builder().setProfile(-1);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public android.media.MediaFormat toMediaFormat() {
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat(getMimeType(), getEncodeSampleRate(), getChannelCount());
        createAudioFormat.setInteger("bitrate", getBitrate());
        if (getProfile() != -1) {
            if (getMimeType().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", getProfile());
                return createAudioFormat;
            }
            createAudioFormat.setInteger("profile", getProfile());
        }
        return createAudioFormat;
    }

    public static abstract class Builder {
        abstract androidx.camera.video.internal.encoder.AudioEncoderConfig getHighResolutionOutputSizeshNQ4ISI();

        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setBitrate(int i);

        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setCaptureSampleRate(int i);

        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setChannelCount(int i);

        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setEncodeSampleRate(int i);

        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setInputTimebase(androidx.camera.core.impl.Timebase timebase);

        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setMimeType(java.lang.String str);

        public abstract androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder setProfile(int i);

        Builder() {
        }

        public androidx.camera.video.internal.encoder.AudioEncoderConfig build() {
            androidx.camera.video.internal.encoder.AudioEncoderConfig highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (java.util.Objects.equals(highResolutionOutputSizeshNQ4ISI.getMimeType(), "audio/mp4a-latm") && highResolutionOutputSizeshNQ4ISI.getProfile() == -1) {
                throw new java.lang.IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return highResolutionOutputSizeshNQ4ISI;
        }
    }
}
