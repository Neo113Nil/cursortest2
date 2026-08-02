package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: pm */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0586pm extends FilterInputStream {

    /* JADX INFO: renamed from: j */
    public final long f6207j;

    /* JADX INFO: renamed from: k */
    public int f6208k;

    public C0586pm(InputStream inputStream, long j) {
        super(inputStream);
        this.f6207j = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m3969a(int i) throws IOException {
        int i2 = this.f6208k;
        if (i >= 0) {
            this.f6208k = i2 + i;
            return;
        }
        long j = this.f6207j;
        if (j - ((long) i2) <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + this.f6208k);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f6207j - ((long) this.f6208k), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m3969a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        m3969a(i3);
        return i3;
    }
}
