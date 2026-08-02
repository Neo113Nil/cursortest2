package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b01 extends InputStream implements zg0 {

    /* JADX INFO: renamed from: j */
    public AbstractC0527o0 f666j;

    @Override // java.io.InputStream
    public final int available() {
        return this.f666j.mo830q();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f666j.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f666j.mo824e();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f666j.mo3609i();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        AbstractC0527o0 abstractC0527o0 = this.f666j;
        if (abstractC0527o0.mo830q() == 0) {
            return -1;
        }
        int iMin = Math.min(abstractC0527o0.mo830q(), i2);
        abstractC0527o0.mo828o(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f666j.mo831r();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        AbstractC0527o0 abstractC0527o0 = this.f666j;
        int iMin = (int) Math.min(abstractC0527o0.mo830q(), j);
        abstractC0527o0.mo832s(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC0527o0 abstractC0527o0 = this.f666j;
        if (abstractC0527o0.mo830q() == 0) {
            return -1;
        }
        return abstractC0527o0.mo829p();
    }
}
