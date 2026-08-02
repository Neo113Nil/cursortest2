package y1;

import java.io.InputStream;

/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2662f extends C2658b {
    public C2662f(byte[] bArr) {
        super(bArr);
        this.f21137k.mark(Integer.MAX_VALUE);
    }

    public final void d(long j5) {
        int i = this.f21138l;
        if (i > j5) {
            this.f21138l = 0;
            this.f21137k.reset();
        } else {
            j5 -= i;
        }
        b((int) j5);
    }

    public C2662f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f21137k.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
