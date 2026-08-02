package M;

import A0.I0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import P.e1;
import androidx.compose.material3.MinimumInteractiveModifier;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import v.C2526v;
import y.C2654j;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0.p f3423l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.J f3424m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f3425n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f3426o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2526v f3427p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2654j f3428q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f3429r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f3430s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f3431t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X.d f3432u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b0.p pVar, i0.J j5, long j6, float f, C2526v c2526v, C2654j c2654j, boolean z3, InterfaceC2015a interfaceC2015a, float f5, X.d dVar) {
        super(2);
        this.f3423l = pVar;
        this.f3424m = j5;
        this.f3425n = j6;
        this.f3426o = f;
        this.f3427p = c2526v;
        this.f3428q = c2654j;
        this.f3429r = z3;
        this.f3430s = interfaceC2015a;
        this.f3431t = f5;
        this.f3432u = dVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            e1 e1Var = H.f3157a;
            b0.p c5 = androidx.compose.foundation.a.c(p0.c(this.f3423l.c(MinimumInteractiveModifier.f6903k), this.f3424m, p0.d(this.f3425n, this.f3426o, c0315s), this.f3427p, ((W0.c) c0315s.j(I0.f287h)).y(this.f3431t)), this.f3428q, h0.a(0.0f, c0315s, 0, 7), this.f3429r, null, this.f3430s, 24);
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
            this.f3432u.invoke(c0315s, 0);
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}
