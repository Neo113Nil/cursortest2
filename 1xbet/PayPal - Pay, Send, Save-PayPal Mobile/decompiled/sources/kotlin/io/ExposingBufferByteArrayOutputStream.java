package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/io/ExposingBufferByteArrayOutputStream;", "Ljava/io/ByteArrayOutputStream;", "", "p0", "<init>", "()V", "", "Camera2StreamConfigurationMap", "()[B"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ExposingBufferByteArrayOutputStream extends java.io.ByteArrayOutputStream {
    public ExposingBufferByteArrayOutputStream() {
        super(8193);
    }

    public final byte[] Camera2StreamConfigurationMap() {
        byte[] bArr = this.buf;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArr, "");
        return bArr;
    }
}
