package F1;

import A1.V;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import u2.InterfaceC1633j;

/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1633j f2532b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2533c;

    /* renamed from: d, reason: collision with root package name */
    public long f2534d;

    /* renamed from: f, reason: collision with root package name */
    public int f2536f;

    /* renamed from: x, reason: collision with root package name */
    public int f2537x;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f2535e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2531a = new byte[4096];

    static {
        V.a("goog.exo.extractor");
    }

    public h(InterfaceC1633j interfaceC1633j, long j, long j3) {
        this.f2532b = interfaceC1633j;
        this.f2534d = j;
        this.f2533c = j3;
    }

    @Override // F1.l
    public final boolean a(byte[] bArr, int i7, int i8, boolean z4) {
        int min;
        int i9 = this.f2537x;
        if (i9 == 0) {
            min = 0;
        } else {
            min = Math.min(i9, i8);
            System.arraycopy(this.f2535e, 0, bArr, i7, min);
            i(min);
        }
        int i10 = min;
        while (i10 < i8 && i10 != -1) {
            i10 = g(bArr, i7, i8, i10, z4);
        }
        if (i10 != -1) {
            this.f2534d += i10;
        }
        return i10 != -1;
    }

    public final boolean b(int i7, boolean z4) {
        e(i7);
        int i8 = this.f2537x - this.f2536f;
        while (i8 < i7) {
            i8 = g(this.f2535e, this.f2536f, i7, i8, z4);
            if (i8 == -1) {
                return false;
            }
            this.f2537x = this.f2536f + i8;
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
        return this.f2534d + this.f2536f;
    }

    public final void e(int i7) {
        int i8 = this.f2536f + i7;
        byte[] bArr = this.f2535e;
        if (i8 > bArr.length) {
            this.f2535e = Arrays.copyOf(this.f2535e, v2.t.j(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    public final int f(byte[] bArr, int i7, int i8) {
        int min;
        e(i8);
        int i9 = this.f2537x;
        int i10 = this.f2536f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = g(this.f2535e, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f2537x += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.f2535e, this.f2536f, bArr, i7, min);
        this.f2536f += min;
        return min;
    }

    public final int g(byte[] bArr, int i7, int i8, int i9, boolean z4) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f2532b.read(bArr, i7 + i9, i8 - i9);
        if (read != -1) {
            return i9 + read;
        }
        if (i9 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F1.l
    public final void h(int i7) {
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
        int min = Math.min(this.f2537x, i7);
        i(min);
        int i8 = min;
        while (i8 < i7 && i8 != -1) {
            byte[] bArr = this.f2531a;
            i8 = g(bArr, -i8, Math.min(i7, bArr.length + i8), i8, false);
        }
        if (i8 != -1) {
            this.f2534d += i8;
        }
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = this.f2537x;
        int i10 = 0;
        if (i9 != 0) {
            int min = Math.min(i9, i8);
            System.arraycopy(this.f2535e, 0, bArr, i7, min);
            i(min);
            i10 = min;
        }
        if (i10 == 0) {
            i10 = g(bArr, i7, i8, 0, true);
        }
        if (i10 != -1) {
            this.f2534d += i10;
        }
        return i10;
    }

    @Override // F1.l
    public final void readFully(byte[] bArr, int i7, int i8) {
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
