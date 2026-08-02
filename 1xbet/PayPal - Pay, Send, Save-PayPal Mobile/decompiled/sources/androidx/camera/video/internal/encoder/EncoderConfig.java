package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public interface EncoderConfig {
    public static final int CODEC_PROFILE_NONE = -1;

    androidx.camera.core.impl.Timebase getInputTimebase();

    java.lang.String getMimeType();

    int getProfile();

    android.media.MediaFormat toMediaFormat() throws androidx.camera.video.internal.encoder.InvalidConfigException;
}
