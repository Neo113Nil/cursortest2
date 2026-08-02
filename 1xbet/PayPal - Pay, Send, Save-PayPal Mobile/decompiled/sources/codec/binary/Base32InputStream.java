package codec.binary;

/* loaded from: classes7.dex */
public class Base32InputStream extends codec.binary.BaseNCodecInputStream {
    public Base32InputStream(java.io.InputStream inputStream) {
        this(inputStream, false);
    }

    public Base32InputStream(java.io.InputStream inputStream, boolean z) {
        super(inputStream, new codec.binary.Base32(false), z);
    }

    public Base32InputStream(java.io.InputStream inputStream, boolean z, int i, byte[] bArr) {
        super(inputStream, new codec.binary.Base32(i, bArr), z);
    }
}
