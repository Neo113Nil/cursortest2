package o;

import java.io.InputStream;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808f extends C0804b {
    public C0808f(byte[] bArr) {
        super(bArr);
        this.f6200a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j2) {
        int i2 = this.f6201b;
        if (i2 > j2) {
            this.f6201b = 0;
            this.f6200a.reset();
        } else {
            j2 -= i2;
        }
        a((int) j2);
    }

    public C0808f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f6200a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
