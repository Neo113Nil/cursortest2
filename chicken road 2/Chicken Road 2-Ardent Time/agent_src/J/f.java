package J;

/* loaded from: classes.dex */
public final class f extends J.b {
    public f(byte[] bArr) {
        super(bArr);
        this.f875a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j2) {
        int i2 = this.f876b;
        if (i2 > j2) {
            this.f876b = 0;
            this.f875a.reset();
        } else {
            j2 -= i2;
        }
        a((int) j2);
    }

    public f(java.io.InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f875a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
