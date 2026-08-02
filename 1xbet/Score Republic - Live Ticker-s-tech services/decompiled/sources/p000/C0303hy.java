package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: hy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0303hy extends C0154dy {
    public C0303hy(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1880j.mark(Integer.MAX_VALUE);
        } else {
            C0270h1.m2190f("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2349e(long j) throws IOException {
        int i = this.f1882l;
        if (i > j) {
            this.f1882l = 0;
            this.f1880j.reset();
        } else {
            j -= (long) i;
        }
        m1325a((int) j);
    }

    public C0303hy(byte[] bArr) {
        super(bArr);
        this.f1880j.mark(Integer.MAX_VALUE);
    }
}
