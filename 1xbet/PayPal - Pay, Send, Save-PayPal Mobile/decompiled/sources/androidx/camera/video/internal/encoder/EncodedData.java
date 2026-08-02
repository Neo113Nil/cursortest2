package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public interface EncodedData extends java.lang.AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    android.media.MediaCodec.BufferInfo getBufferInfo();

    java.nio.ByteBuffer getByteBuffer();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getClosedFuture();

    long getPresentationTimeUs();

    boolean isKeyFrame();

    long size();
}
