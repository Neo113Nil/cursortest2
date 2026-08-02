package codec.binary;

/* loaded from: classes7.dex */
public class Base32OutputStream extends codec.binary.BaseNCodecOutputStream {
    public Base32OutputStream(java.io.OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base32OutputStream(java.io.OutputStream outputStream, boolean z) {
        super(outputStream, new codec.binary.Base32(false), z);
    }

    public Base32OutputStream(java.io.OutputStream outputStream, boolean z, int i, byte[] bArr) {
        super(outputStream, new codec.binary.Base32(i, bArr), z);
    }
}
