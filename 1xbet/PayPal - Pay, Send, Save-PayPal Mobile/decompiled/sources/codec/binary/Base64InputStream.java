package codec.binary;

/* loaded from: classes7.dex */
public class Base64InputStream extends codec.binary.BaseNCodecInputStream {
    public Base64InputStream(java.io.InputStream inputStream) {
        this(inputStream, false);
    }

    public Base64InputStream(java.io.InputStream inputStream, boolean z) {
        super(inputStream, new codec.binary.Base64(false), z);
    }

    public Base64InputStream(java.io.InputStream inputStream, boolean z, int i, byte[] bArr) {
        super(inputStream, new codec.binary.Base64(i, bArr), z);
    }
}
