package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public interface EncoderFactory {
    androidx.camera.video.internal.encoder.Encoder createEncoder(java.util.concurrent.Executor executor, androidx.camera.video.internal.encoder.EncoderConfig encoderConfig, int i) throws androidx.camera.video.internal.encoder.InvalidConfigException;
}
