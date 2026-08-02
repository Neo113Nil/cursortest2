package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: my */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0487my extends FilterInputStream {

    /* JADX INFO: renamed from: l */
    public static final byte[] f5183l = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: m */
    public static final int f5184m = 31;

    /* JADX INFO: renamed from: j */
    public final byte f5185j;

    /* JADX INFO: renamed from: k */
    public int f5186k;

    public C0487my(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            C0270h1.m2190f(j11.m2773h("Cannot add invalid orientation: ", i));
            throw null;
        }
        this.f5185j = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f5186k;
        int i5 = f5184m;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f5185j;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f5183l, this.f5186k - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f5186k += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f5186k = (int) (((long) this.f5186k) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f5186k;
        if (i3 < 2 || i3 > (i2 = f5184m)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f5185j;
        } else {
            i = f5183l[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f5186k++;
        }
        return i;
    }
}
