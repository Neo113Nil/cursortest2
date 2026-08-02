package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public interface Encoder {
    public static final long NO_TIMESTAMP = -1;

    public interface ByteBufferInput extends androidx.camera.video.internal.encoder.Encoder.EncoderInput, androidx.camera.video.internal.BufferProvider<androidx.camera.video.internal.encoder.InputBuffer> {
    }

    public interface EncoderInput {
    }

    public interface SurfaceInput extends androidx.camera.video.internal.encoder.Encoder.EncoderInput {
        android.view.Surface getSurface();
    }

    int getConfiguredBitrate();

    androidx.camera.video.internal.encoder.EncoderInfo getEncoderInfo();

    androidx.camera.video.internal.encoder.Encoder.EncoderInput getInput();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getReleasedFuture();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(androidx.camera.video.internal.encoder.EncoderCallback encoderCallback, java.util.concurrent.Executor executor);

    void start();

    void stop();

    void stop(long j);
}
