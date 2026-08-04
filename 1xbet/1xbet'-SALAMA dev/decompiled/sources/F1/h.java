package F1;

import A1.V;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p146u2.InterfaceC0951j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0951j f2532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2534d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2536f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2537x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f2535e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2531a = new byte[4096];

    static {
        V.a("goog.exo.extractor");
    }

    public h(InterfaceC0951j interfaceC0951j, long j, long j3) {
        this.f2532b = interfaceC0951j;
        this.f2534d = j;
        this.f2533c = j3;
    }

    @Override // F1.l
    public final boolean a(byte[] bArr, int i7, int i8, boolean z4) throws EOFException, InterruptedIOException {
        int iMin;
        int i9 = this.f2537x;
        if (i9 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i9, i8);
            System.arraycopy(this.f2535e, 0, bArr, i7, iMin);
            i(iMin);
        }
        int iG = iMin;
        while (iG < i8 && iG != -1) {
            iG = g(bArr, i7, i8, iG, z4);
        }
        if (iG != -1) {
            this.f2534d += (long) iG;
        }
        return iG != -1;
    }

    public final boolean b(int i7, boolean z4) throws EOFException, InterruptedIOException {
        e(i7);
        int iG = this.f2537x - this.f2536f;
        while (iG < i7) {
            iG = g(this.f2535e, this.f2536f, i7, iG, z4);
            if (iG == -1) {
                return false;
            }
            this.f2537x = this.f2536f + iG;
        }
        this.f2536f += i7;
        return true;
    }

    @Override // F1.l
    public final boolean c(byte[] bArr, int i7, int i8, boolean z4) {
        if (!b(i8, z4)) {
            return false;
        }
        System.arraycopy(this.f2535e, this.f2536f - i8, bArr, i7, i8);
        return true;
    }

    @Override // F1.l
    public final long d() {
        return this.f2534d + ((long) this.f2536f);
    }

    public final void e(int i7) {
        int i8 = this.f2536f + i7;
        byte[] bArr = this.f2535e;
        if (i8 > bArr.length) {
            this.f2535e = Arrays.copyOf(this.f2535e, p151v2.t.j(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    public final int f(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        int iMin;
        e(i8);
        int i9 = this.f2537x;
        int i10 = this.f2536f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            iMin = g(this.f2535e, i10, i8, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f2537x += iMin;
        } else {
            iMin = Math.min(i8, i11);
        }
        System.arraycopy(this.f2535e, this.f2536f, bArr, i7, iMin);
        this.f2536f += iMin;
        return iMin;
    }

    public final int g(byte[] bArr, int i7, int i8, int i9, boolean z4) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i10 = this.f2532b.read(bArr, i7 + i9, i8 - i9);
        if (i10 != -1) {
            return i9 + i10;
        }
        if (i9 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F1.l
    public final void h(int i7) throws EOFException, InterruptedIOException {
        b(i7, false);
    }

    public final void i(int i7) {
        int i8 = this.f2537x - i7;
        this.f2537x = i8;
        this.f2536f = 0;
        byte[] bArr = this.f2535e;
        byte[] bArr2 = i8 < bArr.length - 524288 ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f2535e = bArr2;
    }

    @Override // F1.l
    public final long j() {
        return this.f2533c;
    }

    @Override // F1.l
    public final void p() {
        this.f2536f = 0;
    }

    @Override // F1.l
    public final void q(int i7) {
        int iMin = Math.min(this.f2537x, i7);
        i(iMin);
        int iG = iMin;
        while (iG < i7 && iG != -1) {
            byte[] bArr = this.f2531a;
            iG = g(bArr, -iG, Math.min(i7, bArr.length + iG), iG, false);
        }
        if (iG != -1) {
            this.f2534d += (long) iG;
        }
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        int i9 = this.f2537x;
        int iG = 0;
        if (i9 != 0) {
            int iMin = Math.min(i9, i8);
            System.arraycopy(this.f2535e, 0, bArr, i7, iMin);
            i(iMin);
            iG = iMin;
        }
        if (iG == 0) {
            iG = g(bArr, i7, i8, 0, true);
        }
        if (iG != -1) {
            this.f2534d += (long) iG;
        }
        return iG;
    }

    @Override // F1.l
    public final void readFully(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        a(bArr, i7, i8, false);
    }

    @Override // F1.l
    public final void y(byte[] bArr, int i7, int i8) {
        c(bArr, i7, i8, false);
    }

    @Override // F1.l
    public final long z() {
        return this.f2534d;
    }
}
