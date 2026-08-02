package s0;

import A0.C0040k0;
import A0.C0064w;
import G4.l;
import W0.q;
import b0.o;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import h0.C1988b;
import kotlin.jvm.internal.w;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import z0.A0;
import z0.AbstractC2749f;

/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2358g extends o implements A0, InterfaceC2352a {

    /* renamed from: A, reason: collision with root package name */
    public C2358g f19171A;

    /* renamed from: B, reason: collision with root package name */
    public final String f19172B = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC2352a f19173y;

    /* renamed from: z, reason: collision with root package name */
    public C2355d f19174z;

    public C2358g(InterfaceC2352a interfaceC2352a, C2355d c2355d) {
        this.f19173y = interfaceC2352a;
        this.f19174z = c2355d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // s0.InterfaceC2352a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(long j5, long j6, a4.c cVar) {
        C2356e c2356e;
        int i;
        long j7;
        long j8;
        long j9;
        boolean z3;
        C2358g c2358g;
        long j10;
        long j11;
        if (cVar instanceof C2356e) {
            c2356e = (C2356e) cVar;
            int i5 = c2356e.f19166o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2356e.f19166o = i5 - Integer.MIN_VALUE;
                C2356e c2356e2 = c2356e;
                Object obj = c2356e2.f19164m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2356e2.f19166o;
                if (i != 0) {
                    l.N(obj);
                    InterfaceC2352a interfaceC2352a = this.f19173y;
                    c2356e2.f19162k = j5;
                    c2356e2.f19163l = j6;
                    c2356e2.f19166o = 1;
                    obj = interfaceC2352a.G(j5, j6, c2356e2);
                    if (obj != enumC0510a) {
                        j7 = j5;
                        j8 = j6;
                    }
                    return enumC0510a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = c2356e2.f19162k;
                    l.N(obj);
                    j10 = ((q) obj).f6024a;
                    j9 = j11;
                    return new q(q.e(j9, j10));
                }
                j8 = c2356e2.f19163l;
                j7 = c2356e2.f19162k;
                l.N(obj);
                j9 = ((q) obj).f6024a;
                z3 = this.f7175x;
                if (z3) {
                    c2358g = this.f19171A;
                } else {
                    c2358g = null;
                    if (z3 && z3) {
                        c2358g = (C2358g) AbstractC2749f.k(this);
                    }
                }
                if (c2358g != null) {
                    j10 = 0;
                    return new q(q.e(j9, j10));
                }
                long e3 = q.e(j7, j9);
                long d5 = q.d(j8, j9);
                c2356e2.f19162k = j9;
                c2356e2.f19166o = 2;
                obj = c2358g.G(e3, d5, c2356e2);
                if (obj != enumC0510a) {
                    j11 = j9;
                    j10 = ((q) obj).f6024a;
                    j9 = j11;
                    return new q(q.e(j9, j10));
                }
                return enumC0510a;
            }
        }
        c2356e = new C2356e(this, (AbstractC0542c) cVar);
        C2356e c2356e22 = c2356e;
        Object obj2 = c2356e22.f19164m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2356e22.f19166o;
        if (i != 0) {
        }
        j9 = ((q) obj2).f6024a;
        z3 = this.f7175x;
        if (z3) {
        }
        if (c2358g != null) {
        }
    }

    @Override // s0.InterfaceC2352a
    public final long I(int i, long j5, long j6) {
        long I5 = this.f19173y.I(i, j5, j6);
        boolean z3 = this.f7175x;
        C2358g c2358g = null;
        if (z3 && z3) {
            c2358g = (C2358g) AbstractC2749f.k(this);
        }
        C2358g c2358g2 = c2358g;
        return C1988b.h(I5, c2358g2 != null ? c2358g2.I(i, C1988b.h(j5, I5), C1988b.g(j6, I5)) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // s0.InterfaceC2352a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(long j5, a4.c cVar) {
        C2357f c2357f;
        int i;
        long j6;
        long j7;
        if (cVar instanceof C2357f) {
            c2357f = (C2357f) cVar;
            int i5 = c2357f.f19170n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2357f.f19170n = i5 - Integer.MIN_VALUE;
                Object obj = c2357f.f19168l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2357f.f19170n;
                if (i != 0) {
                    l.N(obj);
                    boolean z3 = this.f7175x;
                    C2358g c2358g = null;
                    if (z3 && z3) {
                        c2358g = (C2358g) AbstractC2749f.k(this);
                    }
                    if (c2358g != null) {
                        c2357f.f19167k = j5;
                        c2357f.f19170n = 1;
                        obj = c2358g.L(j5, c2357f);
                    } else {
                        j6 = 0;
                        long j8 = j6;
                        long j9 = j5;
                        j7 = j8;
                        InterfaceC2352a interfaceC2352a = this.f19173y;
                        long d5 = q.d(j9, j7);
                        c2357f.f19167k = j7;
                        c2357f.f19170n = 2;
                        obj = interfaceC2352a.L(d5, c2357f);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j7 = c2357f.f19167k;
                        l.N(obj);
                        return new q(q.e(j7, ((q) obj).f6024a));
                    }
                    j5 = c2357f.f19167k;
                    l.N(obj);
                }
                j6 = ((q) obj).f6024a;
                long j82 = j6;
                long j92 = j5;
                j7 = j82;
                InterfaceC2352a interfaceC2352a2 = this.f19173y;
                long d52 = q.d(j92, j7);
                c2357f.f19167k = j7;
                c2357f.f19170n = 2;
                obj = interfaceC2352a2.L(d52, c2357f);
            }
        }
        c2357f = new C2357f(this, (AbstractC0542c) cVar);
        Object obj2 = c2357f.f19168l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2357f.f19170n;
        if (i != 0) {
        }
        j6 = ((q) obj2).f6024a;
        long j822 = j6;
        long j922 = j5;
        j7 = j822;
        InterfaceC2352a interfaceC2352a22 = this.f19173y;
        long d522 = q.d(j922, j7);
        c2357f.f19167k = j7;
        c2357f.f19170n = 2;
        obj2 = interfaceC2352a22.L(d522, c2357f);
    }

    @Override // s0.InterfaceC2352a
    public final long c0(int i, long j5) {
        boolean z3 = this.f7175x;
        C2358g c2358g = null;
        if (z3 && z3) {
            c2358g = (C2358g) AbstractC2749f.k(this);
        }
        long c02 = c2358g != null ? c2358g.c0(i, j5) : 0L;
        return C1988b.h(c02, this.f19173y.c0(i, C1988b.g(j5, c02)));
    }

    @Override // z0.A0
    public final Object o() {
        return this.f19172B;
    }

    @Override // b0.o
    public final void o0() {
        C2355d c2355d = this.f19174z;
        c2355d.f19158a = this;
        c2355d.f19159b = null;
        this.f19171A = null;
        c2355d.f19160c = new C0040k0(24, this);
        c2355d.f19161d = k0();
    }

    @Override // b0.o
    public final void q0() {
        w wVar = new w();
        AbstractC2749f.y(this, new C0064w(wVar, 3));
        C2358g c2358g = (C2358g) ((A0) wVar.f17624k);
        this.f19171A = c2358g;
        C2355d c2355d = this.f19174z;
        c2355d.f19159b = c2358g;
        if (c2355d.f19158a == this) {
            c2355d.f19158a = null;
        }
    }

    public final InterfaceC2280u y0() {
        C2358g c2358g = this.f7175x ? (C2358g) AbstractC2749f.k(this) : null;
        InterfaceC2280u y02 = c2358g != null ? c2358g.y0() : null;
        if (y02 != null && AbstractC2282w.o(y02)) {
            return y02;
        }
        InterfaceC2280u interfaceC2280u = this.f19174z.f19161d;
        if (interfaceC2280u != null) {
            return interfaceC2280u;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
