package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcoil3/decode/ByteBufferMetadata;", "Lcoil3/decode/ImageSource$Metadata;", "Ljava/nio/ByteBuffer;", "byteBuffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "Ljava/nio/ByteBuffer;", "getByteBuffer", "()Ljava/nio/ByteBuffer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteBufferMetadata extends coil3.decode.ImageSource.Metadata {
    private final java.nio.ByteBuffer byteBuffer;

    public ByteBufferMetadata(java.nio.ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public final java.nio.ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }
}
