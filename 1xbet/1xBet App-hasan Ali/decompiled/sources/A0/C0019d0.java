package A0;

import G1.C0140k;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import r3.AbstractC2349a;
import u.C2452c0;
import x.C2599p0;
import x.C2604s0;
import z.AbstractC2710l;
import z.C2681E;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: A0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019d0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f484l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f485m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f486n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f487o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0019d0(Object obj, Object obj2, X.d dVar, int i, int i5) {
        super(2);
        this.f484l = i5;
        this.f487o = obj;
        this.f485m = obj2;
        this.f486n = dVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        W3.o oVar = W3.o.f6046a;
        Object obj3 = this.f486n;
        Object obj4 = this.f485m;
        Object obj5 = this.f487o;
        switch (this.f484l) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                int intValue = ((Number) obj2).intValue();
                if (!c0315s.P(intValue & 1, (3 & intValue) != 2)) {
                    c0315s.S();
                    break;
                } else {
                    I0.a((F) obj5, (C0061u0) obj4, (X.d) obj3, c0315s, 0);
                    break;
                }
            case 1:
                ((Number) obj2).intValue();
                I0.a((z0.n0) obj5, (C0061u0) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                E.W.d((b0.p) obj5, (I.O) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(385));
                break;
            case 3:
                ((Number) obj2).intValue();
                AbstractC0444a.c((C0140k) obj5, (Y.d) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(385));
                break;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                AbstractC2282w.p((InterfaceC2280u) obj5, null, new H1.u(floatValue, (C2452c0) obj4, (C0140k) obj3, null), 3);
                break;
            case 5:
                C0315s c0315s2 = (C0315s) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !c0315s2.B()) {
                    b0.p c5 = androidx.compose.ui.layout.a.c(b0.m.f7161k, "Container");
                    N.f fVar = new N.f((InterfaceC0289e0) obj5, InterfaceC0289e0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    float f = M.V.f3256a;
                    b0.p c6 = androidx.compose.ui.draw.a.c(c5, new C0028g0(18, fVar, (C2681E) obj4));
                    x0.O e3 = AbstractC2710l.e(b0.c.f7137k, true);
                    int p5 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l5 = c0315s2.l();
                    b0.p c7 = b0.a.c(c0315s2, c6);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21833e, e3);
                    AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s2, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21831c, c7);
                    ((X.d) obj3).invoke(c0315s2, 0);
                    c0315s2.q(true);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                AbstractC2349a.c((InterfaceC2015a) obj5, (a1.t) obj4, (X.d) obj3, (C0315s) obj, AbstractC0329z.B(385));
                break;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.t tVar = (kotlin.jvm.internal.t) obj5;
                C2604s0 c2604s0 = (C2604s0) obj4;
                long g5 = c2604s0.g(c2604s0.c(floatValue2 - tVar.f17621k));
                C2604s0 c2604s02 = ((C2599p0) obj3).f20847a;
                tVar.f17621k += c2604s0.c(c2604s0.f(C2604s0.a(c2604s02, c2604s02.f20869h, g5, 1)));
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0019d0(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.f484l = i;
        this.f487o = obj;
        this.f485m = obj2;
        this.f486n = obj3;
    }
}
