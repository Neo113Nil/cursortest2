package t0;

import A0.C0060u;
import java.util.List;
import r.AbstractC2337o;
import r.C2316B;
import r.C2338p;
import r.O;
import s.AbstractC2351a;
import x0.InterfaceC2637x;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2407d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2637x f19465a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19466b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19467c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19468d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19469e;
    public final C2316B f = new C2316B();

    /* renamed from: g, reason: collision with root package name */
    public final i f19470g = new i();

    /* renamed from: h, reason: collision with root package name */
    public final r.y f19471h;

    public C2407d(InterfaceC2637x interfaceC2637x) {
        this.f19465a = interfaceC2637x;
        r.y yVar = new r.y();
        yVar.f19059a = O.f18957a;
        yVar.f19060b = AbstractC2337o.f19028a;
        yVar.f19061c = AbstractC2351a.f19151c;
        yVar.c(O.d(10));
        this.f19471h = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    public final void a(long j5, List list, boolean z3) {
        long j6;
        long j7;
        int i;
        char c5;
        C2411h c2411h;
        C2411h c2411h2;
        i iVar = this.f19470g;
        r.y yVar = this.f19471h;
        int i5 = 0;
        yVar.f19063e = 0;
        long[] jArr = yVar.f19059a;
        char c6 = 7;
        if (jArr != O.f18957a) {
            X3.l.C0(jArr, -9187201950435737472L);
            long[] jArr2 = yVar.f19059a;
            int i6 = yVar.f19062d;
            int i7 = i6 >> 3;
            j6 = -9187201950435737472L;
            long j8 = 255 << ((i6 & 7) << 3);
            j7 = 255;
            jArr2[i7] = j8 | ((~j8) & jArr2[i7]);
        } else {
            j6 = -9187201950435737472L;
            j7 = 255;
        }
        X3.l.B0(yVar.f19061c, 0, yVar.f19062d);
        yVar.f = O.a(yVar.f19062d) - yVar.f19063e;
        int size = list.size();
        i iVar2 = iVar;
        int i8 = 0;
        boolean z5 = true;
        while (i8 < size) {
            b0.o oVar = (b0.o) list.get(i8);
            if (oVar.f7175x) {
                oVar.f7174w = new C0060u(10, this, oVar);
                if (z5) {
                    R.e eVar = iVar2.f19483a;
                    ?? r15 = eVar.f5106k;
                    int i9 = eVar.f5108m;
                    while (true) {
                        if (i5 >= i9) {
                            c5 = c6;
                            c2411h2 = 0;
                            break;
                        }
                        c2411h2 = r15[i5];
                        c5 = c6;
                        if (kotlin.jvm.internal.l.a(((C2411h) c2411h2).f19477c, oVar)) {
                            break;
                        }
                        i5++;
                        c6 = c5;
                    }
                    c2411h = c2411h2;
                    if (c2411h != null) {
                        c2411h.i = true;
                        c2411h.f19478d.a(j5);
                        Object b3 = yVar.b(j5);
                        Object obj = b3;
                        if (b3 == null) {
                            C2316B c2316b = new C2316B();
                            yVar.d(j5, c2316b);
                            obj = c2316b;
                        }
                        ((C2316B) obj).a(c2411h);
                        iVar2 = c2411h;
                    } else {
                        z5 = false;
                    }
                } else {
                    c5 = c6;
                }
                c2411h = new C2411h(oVar);
                c2411h.f19478d.a(j5);
                Object b5 = yVar.b(j5);
                Object obj2 = b5;
                if (b5 == null) {
                    C2316B c2316b2 = new C2316B();
                    yVar.d(j5, c2316b2);
                    obj2 = c2316b2;
                }
                ((C2316B) obj2).a(c2411h);
                iVar2.f19483a.c(c2411h);
                iVar2 = c2411h;
            } else {
                c5 = c6;
            }
            i8++;
            c6 = c5;
            i5 = 0;
        }
        char c7 = c6;
        if (!z3) {
            return;
        }
        long[] jArr3 = yVar.f19060b;
        Object[] objArr = yVar.f19061c;
        long[] jArr4 = yVar.f19059a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr4[i10];
            if ((((~j9) << c7) & j9 & j6) != j6) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j9 & j7) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j10 = jArr3[i14];
                        C2316B c2316b3 = (C2316B) objArr[i14];
                        R.e eVar2 = iVar.f19483a;
                        i = i11;
                        Object[] objArr2 = eVar2.f5106k;
                        int i15 = eVar2.f5108m;
                        for (int i16 = 0; i16 < i15; i16++) {
                            ((C2411h) objArr2[i16]).f(j10, c2316b3);
                        }
                    } else {
                        i = i11;
                    }
                    j9 >>= i;
                    i13++;
                    i11 = i;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean b(D3.l lVar, boolean z3) {
        i iVar = this.f19470g;
        if (!iVar.a((C2338p) lVar.f962m, this.f19465a, lVar, z3)) {
            return false;
        }
        boolean z5 = true;
        this.f19466b = true;
        R.e eVar = iVar.f19483a;
        Object[] objArr = eVar.f5106k;
        int i = eVar.f5108m;
        boolean z6 = false;
        for (int i5 = 0; i5 < i; i5++) {
            z6 = ((C2411h) objArr[i5]).e(lVar, z3) || z6;
        }
        Object[] objArr2 = eVar.f5106k;
        int i6 = eVar.f5108m;
        boolean z7 = false;
        for (int i7 = 0; i7 < i6; i7++) {
            z7 = ((C2411h) objArr2[i7]).d(lVar) || z7;
        }
        iVar.b(lVar);
        if (!z7 && !z6) {
            z5 = false;
        }
        this.f19466b = false;
        if (this.f19469e) {
            this.f19469e = false;
            C2316B c2316b = this.f;
            int i8 = c2316b.f18905b;
            for (int i9 = 0; i9 < i8; i9++) {
                d((b0.o) c2316b.e(i9));
            }
            c2316b.c();
        }
        if (this.f19467c) {
            this.f19467c = false;
            c();
        }
        if (this.f19468d) {
            this.f19468d = false;
            iVar.f19483a.h();
        }
        return z5;
    }

    public final void c() {
        if (this.f19466b) {
            this.f19467c = true;
            return;
        }
        i iVar = this.f19470g;
        R.e eVar = iVar.f19483a;
        Object[] objArr = eVar.f5106k;
        int i = eVar.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2411h) objArr[i5]).c();
        }
        if (this.f19468d) {
            this.f19468d = true;
        } else {
            iVar.f19483a.h();
        }
    }

    public final void d(b0.o oVar) {
        if (this.f19466b) {
            this.f19469e = true;
            this.f.a(oVar);
            return;
        }
        i iVar = this.f19470g;
        C2316B c2316b = iVar.f19484b;
        c2316b.c();
        c2316b.a(iVar);
        while (c2316b.h()) {
            i iVar2 = (i) c2316b.j(c2316b.f18905b - 1);
            int i = 0;
            while (true) {
                R.e eVar = iVar2.f19483a;
                if (i < eVar.f5108m) {
                    C2411h c2411h = (C2411h) eVar.f5106k[i];
                    if (kotlin.jvm.internal.l.a(c2411h.f19477c, oVar)) {
                        iVar2.f19483a.k(c2411h);
                        c2411h.c();
                    } else {
                        c2316b.a(c2411h);
                        i++;
                    }
                }
            }
        }
    }
}
