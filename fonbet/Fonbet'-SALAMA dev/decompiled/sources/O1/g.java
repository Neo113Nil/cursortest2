package O1;

import A1.C0045t0;
import C1.C0095a;
import java.io.EOFException;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f4947a;

    /* renamed from: b, reason: collision with root package name */
    public long f4948b;

    /* renamed from: c, reason: collision with root package name */
    public int f4949c;

    /* renamed from: d, reason: collision with root package name */
    public int f4950d;

    /* renamed from: e, reason: collision with root package name */
    public int f4951e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4952f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final C0095a f4953g = new C0095a(255);

    public final boolean a(F1.h hVar, boolean z4) {
        boolean z7;
        boolean z8;
        this.f4947a = 0;
        this.f4948b = 0L;
        this.f4949c = 0;
        this.f4950d = 0;
        this.f4951e = 0;
        C0095a c0095a = this.f4953g;
        c0095a.A(27);
        try {
            z7 = hVar.c((byte[]) c0095a.f1465c, 0, 27, z4);
        } catch (EOFException e7) {
            if (!z4) {
                throw e7;
            }
            z7 = false;
        }
        if (!z7 || c0095a.u() != 1332176723) {
            return false;
        }
        if (c0095a.t() != 0) {
            if (z4) {
                return false;
            }
            throw C0045t0.c("unsupported bit stream revision");
        }
        this.f4947a = c0095a.t();
        this.f4948b = c0095a.j();
        c0095a.k();
        c0095a.k();
        c0095a.k();
        int t7 = c0095a.t();
        this.f4949c = t7;
        this.f4950d = t7 + 27;
        c0095a.A(t7);
        try {
            z8 = hVar.c((byte[]) c0095a.f1465c, 0, this.f4949c, z4);
        } catch (EOFException e8) {
            if (!z4) {
                throw e8;
            }
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        for (int i7 = 0; i7 < this.f4949c; i7++) {
            int t8 = c0095a.t();
            this.f4952f[i7] = t8;
            this.f4951e += t8;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r13 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r12.f2534d >= r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r0 = java.lang.Math.min(r12.f2537x, 1);
        r12.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r0 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        r6 = r12.f2531a;
        r0 = r12.g(r6, 0, java.lang.Math.min(1, r6.length), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r0 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r12.f2534d += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r0 == (-1)) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(F1.h hVar, long j) {
        boolean z4;
        AbstractC1664a.f(hVar.f2534d == hVar.d());
        C0095a c0095a = this.f4953g;
        c0095a.A(4);
        while (true) {
            if (j != -1 && hVar.f2534d + 4 >= j) {
                break;
            }
            try {
                z4 = hVar.c((byte[]) c0095a.f1465c, 0, 4, true);
            } catch (EOFException unused) {
                z4 = false;
            }
            if (!z4) {
                break;
            }
            c0095a.D(0);
            if (c0095a.u() == 1332176723) {
                hVar.f2536f = 0;
                return true;
            }
            hVar.q(1);
        }
    }
}
