package M;

import A0.I0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import n.AbstractC2107A;
import v.C2526v;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0.p f3401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D.d f3402m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f3403n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f3404o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2526v f3405p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f3406q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i4.e f3407r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(b0.p pVar, D.d dVar, long j5, float f, C2526v c2526v, float f5, i4.e eVar) {
        super(2);
        this.f3401l = pVar;
        this.f3402m = dVar;
        this.f3403n = j5;
        this.f3404o = f;
        this.f3405p = c2526v;
        this.f3406q = f5;
        this.f3407r = eVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        b0.p c5;
        C0315s c0315s = (C0315s) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        W3.o oVar = W3.o.f6046a;
        if (intValue == 2 && c0315s.B()) {
            c0315s.S();
            return oVar;
        }
        long d5 = p0.d(this.f3403n, this.f3404o, c0315s);
        float y5 = ((W0.c) c0315s.j(I0.f287h)).y(this.f3406q);
        c5 = H0.k.a(p0.c(this.f3401l, this.f3402m, d5, this.f3405p, y5), false, C0237h.f3342p).c(new SuspendPointerInputElement(oVar, null, new t0.z(new m0(2, null)), 6));
        x0.O e3 = AbstractC2710l.e(b0.c.f7137k, true);
        int p5 = AbstractC0329z.p(c0315s);
        InterfaceC0314r0 l5 = c0315s.l();
        b0.p c6 = b0.a.c(c0315s, c5);
        InterfaceC2753j.f21834j.getClass();
        C2768z c2768z = C2752i.f21830b;
        c0315s.b0();
        if (c0315s.f4530S) {
            c0315s.k(c2768z);
        } else {
            c0315s.l0();
        }
        AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
        AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
        C2751h c2751h = C2752i.f;
        if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
            AbstractC2107A.y(p5, c0315s, p5, c2751h);
        }
        AbstractC0329z.y(c0315s, C2752i.f21831c, c6);
        this.f3407r.invoke(c0315s, 0);
        c0315s.q(true);
        return oVar;
    }
}
