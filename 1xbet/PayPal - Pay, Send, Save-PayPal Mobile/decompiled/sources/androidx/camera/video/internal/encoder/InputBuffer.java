package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public interface InputBuffer {
    boolean cancel();

    java.nio.ByteBuffer getByteBuffer();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getTerminationFuture();

    void setEndOfStream(boolean z);

    void setPresentationTimeUs(long j);

    boolean submit();
}
