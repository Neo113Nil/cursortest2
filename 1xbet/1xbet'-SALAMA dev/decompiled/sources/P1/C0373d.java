package P1;

import A1.C0045t0;
import C0.J;
import C1.C0095a;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: P1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373d implements F1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0374e f5162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f5163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0095a f5164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F1.x f5165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F1.m f5166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5169i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
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
    public final boolean a(F1.l lVar) throws EOFException, InterruptedIOException {
        F1.h hVar = (F1.h) lVar;
        int iB = b(hVar);
        int i7 = iB;
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
        } while (i7 - iB < 8192);
        return false;
    }

    public final int b(F1.h hVar) throws EOFException, InterruptedIOException {
        int i7 = 0;
        while (true) {
            C0095a c0095a = this.f5164d;
            hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
            c0095a.D(0);
            if (c0095a.v() != 4801587) {
                break;
            }
            c0095a.E(3);
            int iS = c0095a.s();
            i7 += iS + 10;
            hVar.b(iS, false);
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

    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // F1.k
    public final int f(F1.l lVar, E4.y yVar) throws C0045t0, EOFException, InterruptedIOException {
        boolean z4;
        p151v2.a.i(this.f5166f);
        long j = ((F1.h) lVar).f2533c;
        int i7 = this.f5161a;
        int i8 = i7 & 2;
        int i9 = 0;
        boolean z7 = true;
        if (i8 != 0 || ((i7 & 1) != 0 && j != -1)) {
            F1.x xVar = this.f5165e;
            C0095a c0095a = this.f5164d;
            if (!this.j) {
                this.f5169i = -1;
                F1.h hVar = (F1.h) lVar;
                hVar.f2536f = 0;
                long j3 = 0;
                if (hVar.f2534d == 0) {
                    b(hVar);
                }
                int i10 = 0;
                while (true) {
                    try {
                        F1.h hVar2 = (F1.h) lVar;
                        if (!hVar2.c((byte[]) c0095a.f1465c, i9, 2, z7)) {
                            break;
                        }
                        c0095a.D(i9);
                        if (((c0095a.y() & 65526) == 65520 ? z7 : i9) == 0) {
                            i10 = i9;
                            break;
                        }
                        if (!hVar2.c((byte[]) c0095a.f1465c, i9, 4, z7)) {
                            break;
                        }
                        xVar.o(14);
                        int i11 = xVar.i(13);
                        if (i11 <= 6) {
                            this.j = z7;
                            throw C0045t0.a(null, "Malformed ADTS stream");
                        }
                        j3 += (long) i11;
                        i10++;
                        if (i10 == 1000 || !hVar2.b(i11 - 6, true)) {
                            break;
                            break;
                        }
                        z7 = true;
                        i9 = 0;
                    } catch (EOFException unused) {
                    }
                }
                hVar.f2536f = 0;
                if (i10 > 0) {
                    this.f5169i = (int) (j3 / ((long) i10));
                } else {
                    this.f5169i = -1;
                }
                this.j = true;
            }
        }
        C0095a c0095a2 = this.f5163c;
        int i12 = ((F1.h) lVar).read((byte[]) c0095a2.f1465c, 0, 2048);
        boolean z8 = i12 == -1;
        boolean z9 = this.f5171l;
        C0374e c0374e = this.f5162b;
        if (z9) {
            z4 = true;
        } else {
            boolean z10 = (i7 & 1) != 0 && this.f5169i > 0;
            if (z10 && c0374e.f5188q == -9223372036854775807L && !z8) {
                z4 = true;
            } else {
                if (z10) {
                    long j7 = c0374e.f5188q;
                    if (j7 != -9223372036854775807L) {
                        F1.m mVar = this.f5166f;
                        boolean z11 = i8 != 0;
                        int i13 = this.f5169i;
                        mVar.m(new F1.g(j, this.f5168h, (int) ((((long) i13) * 8000000) / j7), i13, z11));
                    } else {
                        this.f5166f.m(new F1.n(-9223372036854775807L));
                    }
                } else {
                    this.f5166f.m(new F1.n(-9223372036854775807L));
                }
                z4 = true;
                this.f5171l = true;
            }
        }
        if (z8) {
            return -1;
        }
        c0095a2.D(0);
        c0095a2.C(i12);
        if (!this.f5170k) {
            c0374e.e(4, this.f5167g);
            this.f5170k = z4;
        }
        c0374e.a(c0095a2);
        return 0;
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
