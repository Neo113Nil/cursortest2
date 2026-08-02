package P1;

import A1.C0045t0;
import C0.J;
import C1.C0095a;
import java.io.EOFException;
import v2.AbstractC1664a;

/* renamed from: P1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373d implements F1.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f5161a;

    /* renamed from: b, reason: collision with root package name */
    public final C0374e f5162b;

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f5163c;

    /* renamed from: d, reason: collision with root package name */
    public final C0095a f5164d;

    /* renamed from: e, reason: collision with root package name */
    public final F1.x f5165e;

    /* renamed from: f, reason: collision with root package name */
    public F1.m f5166f;

    /* renamed from: g, reason: collision with root package name */
    public long f5167g;

    /* renamed from: h, reason: collision with root package name */
    public long f5168h;

    /* renamed from: i, reason: collision with root package name */
    public int f5169i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5170k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5171l;

    public C0373d(int i7) {
        this.f5161a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f5162b = new C0374e(true, null);
        this.f5163c = new C0095a(2048);
        this.f5169i = -1;
        this.f5168h = -1L;
        C0095a c0095a = new C0095a(10);
        this.f5164d = c0095a;
        byte[] bArr = (byte[]) c0095a.f1465c;
        this.f5165e = new F1.x(bArr, bArr.length);
    }

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        F1.h hVar = (F1.h) lVar;
        int b7 = b(hVar);
        int i7 = b7;
        int i8 = 0;
        int i9 = 0;
        do {
            C0095a c0095a = this.f5164d;
            hVar.c((byte[]) c0095a.f1465c, 0, 2, false);
            c0095a.D(0);
            if ((c0095a.y() & 65526) == 65520) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                hVar.c((byte[]) c0095a.f1465c, 0, 4, false);
                F1.x xVar = this.f5165e;
                xVar.o(14);
                int i10 = xVar.i(13);
                if (i10 <= 6) {
                    i7++;
                    hVar.f2536f = 0;
                    hVar.b(i7, false);
                } else {
                    hVar.b(i10 - 6, false);
                    i9 += i10;
                }
            } else {
                i7++;
                hVar.f2536f = 0;
                hVar.b(i7, false);
            }
            i8 = 0;
            i9 = 0;
        } while (i7 - b7 < 8192);
        return false;
    }

    public final int b(F1.h hVar) {
        int i7 = 0;
        while (true) {
            C0095a c0095a = this.f5164d;
            hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
            c0095a.D(0);
            if (c0095a.v() != 4801587) {
                break;
            }
            c0095a.E(3);
            int s7 = c0095a.s();
            i7 += s7 + 10;
            hVar.b(s7, false);
        }
        hVar.f2536f = 0;
        hVar.b(i7, false);
        if (this.f5168h == -1) {
            this.f5168h = i7;
        }
        return i7;
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.f5166f = mVar;
        this.f5162b.c(mVar, new J(0, 1));
        mVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c7  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(F1.l lVar, E4.y yVar) {
        F1.h hVar;
        long j;
        int i7;
        boolean z4;
        AbstractC1664a.i(this.f5166f);
        long j3 = ((F1.h) lVar).f2533c;
        int i8 = this.f5161a;
        int i9 = i8 & 2;
        int i10 = 0;
        boolean z7 = 1;
        if (i9 != 0 || ((i8 & 1) != 0 && j3 != -1)) {
            F1.x xVar = this.f5165e;
            C0095a c0095a = this.f5164d;
            if (!this.j) {
                this.f5169i = -1;
                hVar = (F1.h) lVar;
                hVar.f2536f = 0;
                j = 0;
                if (hVar.f2534d == 0) {
                    b(hVar);
                }
                i7 = 0;
                while (true) {
                    try {
                        F1.h hVar2 = (F1.h) lVar;
                        if (!hVar2.c((byte[]) c0095a.f1465c, i10, 2, z7)) {
                            break;
                        }
                        c0095a.D(i10);
                        if (((c0095a.y() & 65526) == 65520 ? z7 : i10) == 0) {
                            i7 = i10;
                            break;
                        }
                        if (!hVar2.c((byte[]) c0095a.f1465c, i10, 4, z7)) {
                            break;
                        }
                        xVar.o(14);
                        int i11 = xVar.i(13);
                        if (i11 <= 6) {
                            this.j = z7;
                            throw C0045t0.a(null, "Malformed ADTS stream");
                        }
                        j += i11;
                        i7++;
                        if (i7 != 1000 && hVar2.b(i11 - 6, true)) {
                            z7 = 1;
                            i10 = 0;
                        }
                    } catch (EOFException unused) {
                    }
                }
            }
        }
        C0095a c0095a2 = this.f5163c;
        int read = ((F1.h) lVar).read((byte[]) c0095a2.f1465c, 0, 2048);
        boolean z8 = read != -1;
        boolean z9 = this.f5171l;
        C0374e c0374e = this.f5162b;
        if (!z9) {
            boolean z10 = (i8 & 1) != 0 && this.f5169i > 0;
            if (!z10 || c0374e.f5188q != -9223372036854775807L || z8) {
                if (z10) {
                    long j7 = c0374e.f5188q;
                    if (j7 != -9223372036854775807L) {
                        F1.m mVar = this.f5166f;
                        boolean z11 = i9 != 0;
                        int i12 = this.f5169i;
                        mVar.m(new F1.g(j3, this.f5168h, (int) ((i12 * 8000000) / j7), i12, z11));
                        z4 = true;
                        this.f5171l = true;
                        if (!z8) {
                            return -1;
                        }
                        c0095a2.D(0);
                        c0095a2.C(read);
                        if (!this.f5170k) {
                            c0374e.e(4, this.f5167g);
                            this.f5170k = z4;
                        }
                        c0374e.a(c0095a2);
                        return 0;
                    }
                }
                this.f5166f.m(new F1.n(-9223372036854775807L));
                z4 = true;
                this.f5171l = true;
                if (!z8) {
                }
            }
        }
        z4 = true;
        if (!z8) {
        }
        hVar.f2536f = 0;
        if (i7 > 0) {
            this.f5169i = (int) (j / i7);
        } else {
            this.f5169i = -1;
        }
        this.j = true;
        C0095a c0095a22 = this.f5163c;
        int read2 = ((F1.h) lVar).read((byte[]) c0095a22.f1465c, 0, 2048);
        if (read2 != -1) {
        }
        boolean z92 = this.f5171l;
        C0374e c0374e2 = this.f5162b;
        if (!z92) {
        }
        z4 = true;
        if (!z8) {
        }
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f5170k = false;
        this.f5162b.b();
        this.f5167g = j3;
    }

    @Override // F1.k
    public final void release() {
    }
}
