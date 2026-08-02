package v;

import a3.AbstractC0467k;
import h0.C1989c;
import h0.C1990d;
import h0.C1991e;
import i0.C1994A;
import i0.C1995B;
import i0.C2003h;
import k0.C2022b;
import k0.C2027g;
import z0.AbstractC2749f;
import z0.C2733I;
import z0.InterfaceC2757n;

/* renamed from: v.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2520o extends b0.o implements InterfaceC2757n, z0.i0 {

    /* renamed from: A, reason: collision with root package name */
    public float f20276A;

    /* renamed from: B, reason: collision with root package name */
    public i0.J f20277B;

    /* renamed from: C, reason: collision with root package name */
    public long f20278C;

    /* renamed from: D, reason: collision with root package name */
    public W0.m f20279D;

    /* renamed from: E, reason: collision with root package name */
    public i0.D f20280E;

    /* renamed from: F, reason: collision with root package name */
    public i0.J f20281F;

    /* renamed from: y, reason: collision with root package name */
    public long f20282y;

    /* renamed from: z, reason: collision with root package name */
    public i0.F f20283z;

    @Override // z0.i0
    public final void E() {
        this.f20278C = 9205357640488583168L;
        this.f20279D = null;
        this.f20280E = null;
        this.f20281F = null;
        AbstractC2749f.m(this);
    }

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        C2003h c2003h;
        if (this.f20277B == i0.F.f17222a) {
            if (!i0.p.c(this.f20282y, i0.p.f17293g)) {
                AbstractC0467k.m(c2733i, this.f20282y, 0L, 126);
            }
            i0.F f = this.f20283z;
            if (f != null) {
                AbstractC0467k.l(c2733i, f, 0L, 0L, this.f20276A, null, 118);
            }
        } else {
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            C2022b c2022b = c2733i.f21647k;
            if (C1991e.a(c2022b.f17540l.A(), this.f20278C) && c2733i.getLayoutDirection() == this.f20279D && kotlin.jvm.internal.l.a(this.f20281F, this.f20277B)) {
                i0.D d5 = this.f20280E;
                kotlin.jvm.internal.l.c(d5);
                wVar.f17624k = d5;
            } else {
                AbstractC2749f.s(this, new A.n(wVar, this, c2733i, 4));
            }
            this.f20280E = (i0.D) wVar.f17624k;
            this.f20278C = c2022b.f17540l.A();
            this.f20279D = c2733i.getLayoutDirection();
            this.f20281F = this.f20277B;
            Object obj = wVar.f17624k;
            kotlin.jvm.internal.l.c(obj);
            i0.D d6 = (i0.D) obj;
            if (!i0.p.c(this.f20282y, i0.p.f17293g)) {
                i0.F.j(c2733i, d6, this.f20282y);
            }
            i0.F f5 = this.f20283z;
            if (f5 != null) {
                float f6 = this.f20276A;
                C2027g c2027g = C2027g.f17547b;
                if (d6 instanceof C1995B) {
                    C1989c c1989c = ((C1995B) d6).f17219a;
                    c2733i.e(f5, (4294967295L & Float.floatToRawIntBits(c1989c.f17194b)) | (Float.floatToRawIntBits(c1989c.f17193a) << 32), i0.F.p(c1989c), f6, c2027g);
                } else {
                    if (d6 instanceof i0.C) {
                        i0.C c5 = (i0.C) d6;
                        c2003h = c5.f17221b;
                        if (c2003h == null) {
                            C1990d c1990d = c5.f17220a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (c1990d.f17203h >> 32));
                            long floatToRawIntBits = (Float.floatToRawIntBits(c1990d.f17197a) << 32) | (Float.floatToRawIntBits(c1990d.f17198b) & 4294967295L);
                            float b3 = c1990d.b();
                            float a5 = c1990d.a();
                            c2733i.f(f5, floatToRawIntBits, (Float.floatToRawIntBits(b3) << 32) | (Float.floatToRawIntBits(a5) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f6, c2027g);
                        }
                    } else {
                        if (!(d6 instanceof C1994A)) {
                            throw new D2.e();
                        }
                        c2003h = ((C1994A) d6).f17218a;
                    }
                    c2733i.M(c2003h, f5, f6, c2027g, 3);
                }
            }
        }
        c2733i.a();
    }
}
