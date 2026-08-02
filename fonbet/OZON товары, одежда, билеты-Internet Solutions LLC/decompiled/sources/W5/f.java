package W5;

/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // W5.a
    public final int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // W5.a
    public final int b() {
        return 1;
    }

    @Override // W5.a
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // W5.a
    public final byte[] newArray(int i11) {
        return new byte[i11];
    }
}
