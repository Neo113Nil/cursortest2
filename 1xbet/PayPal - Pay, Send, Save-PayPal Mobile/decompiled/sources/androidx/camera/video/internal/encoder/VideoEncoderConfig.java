package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public abstract class VideoEncoderConfig implements androidx.camera.video.internal.encoder.EncoderConfig {
    public abstract int getBitrate();

    public abstract int getCaptureFrameRate();

    public abstract int getColorFormat();

    public abstract androidx.camera.video.internal.encoder.VideoEncoderDataSpace getDataSpace();

    public abstract int getEncodeFrameRate();

    public abstract int getIFrameInterval();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract androidx.camera.core.impl.Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract java.lang.String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    public abstract android.util.Size getResolution();

    public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder toBuilder();

    VideoEncoderConfig() {
    }

    public static androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder builder() {
        return new androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig.Builder().setProfile(-1).setIFrameInterval(1).setColorFormat(2130708361).setDataSpace(androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public android.media.MediaFormat toMediaFormat() {
        android.util.Size resolution = getResolution();
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(getMimeType(), resolution.getWidth(), resolution.getHeight());
        createVideoFormat.setInteger("color-format", getColorFormat());
        createVideoFormat.setInteger("bitrate", getBitrate());
        createVideoFormat.setInteger("frame-rate", getEncodeFrameRate());
        if (isSlowMotion()) {
            createVideoFormat.setInteger("capture-rate", getCaptureFrameRate());
            createVideoFormat.setInteger("operating-rate", getCaptureFrameRate());
            createVideoFormat.setInteger("priority", 0);
        }
        createVideoFormat.setInteger("i-frame-interval", getIFrameInterval());
        if (getProfile() != -1) {
            createVideoFormat.setInteger("profile", getProfile());
        }
        androidx.camera.video.internal.encoder.VideoEncoderDataSpace dataSpace = getDataSpace();
        if (dataSpace.getStandard() != 0) {
            createVideoFormat.setInteger("color-standard", dataSpace.getStandard());
        }
        if (dataSpace.getTransfer() != 0) {
            createVideoFormat.setInteger("color-transfer", dataSpace.getTransfer());
        }
        if (dataSpace.getRange() != 0) {
            createVideoFormat.setInteger("color-range", dataSpace.getRange());
        }
        return createVideoFormat;
    }

    public boolean isSlowMotion() {
        return getCaptureFrameRate() > getEncodeFrameRate();
    }

    public static abstract class Builder {
        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig build();

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setBitrate(int i);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setCaptureFrameRate(int i);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setColorFormat(int i);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setDataSpace(androidx.camera.video.internal.encoder.VideoEncoderDataSpace videoEncoderDataSpace);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setEncodeFrameRate(int i);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setIFrameInterval(int i);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setInputTimebase(androidx.camera.core.impl.Timebase timebase);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setMimeType(java.lang.String str);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setProfile(int i);

        public abstract androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder setResolution(android.util.Size size);

        Builder() {
        }
    }
}
