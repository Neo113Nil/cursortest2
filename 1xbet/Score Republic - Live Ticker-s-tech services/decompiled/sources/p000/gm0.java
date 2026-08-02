package p000;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gm0 extends FilterInputStream {

    /* JADX INFO: renamed from: j */
    public int f2804j;

    public gm0(C0708sx c0708sx) {
        super(c0708sx);
        this.f2804j = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final long m2123a(long j) {
        int i = this.f2804j;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f2804j;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* JADX INFO: renamed from: e */
    public final void m2124e(long j) {
        int i = this.f2804j;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f2804j = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f2804j = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m2123a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m2124e(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f2804j = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM2123a = m2123a(j);
        if (jM2123a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM2123a);
        m2124e(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM2123a = (int) m2123a(i2);
        if (iM2123a == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM2123a);
        m2124e(i3);
        return i3;
    }
}
