package E;

import A0.InterfaceC0044l1;
import K0.AbstractC0205j;
import K0.C0203h;
import P.AbstractC0329z;
import P.C0305m0;
import P.C0326x0;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public C0102h0 f1088a;

    /* renamed from: b, reason: collision with root package name */
    public final C0326x0 f1089b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0044l1 f1090c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.g f1091d;

    /* renamed from: e, reason: collision with root package name */
    public P0.C f1092e;
    public final C0305m0 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0305m0 f1093g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2637x f1094h;
    public final C0305m0 i;

    /* renamed from: j, reason: collision with root package name */
    public C0203h f1095j;

    /* renamed from: k, reason: collision with root package name */
    public final C0305m0 f1096k;

    /* renamed from: l, reason: collision with root package name */
    public final C0305m0 f1097l;

    /* renamed from: m, reason: collision with root package name */
    public final C0305m0 f1098m;

    /* renamed from: n, reason: collision with root package name */
    public final C0305m0 f1099n;

    /* renamed from: o, reason: collision with root package name */
    public final C0305m0 f1100o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1101p;

    /* renamed from: q, reason: collision with root package name */
    public final C0305m0 f1102q;

    /* renamed from: r, reason: collision with root package name */
    public final v3.e f1103r;

    /* renamed from: s, reason: collision with root package name */
    public i4.c f1104s;

    /* renamed from: t, reason: collision with root package name */
    public final C0116v f1105t;

    /* renamed from: u, reason: collision with root package name */
    public final C0116v f1106u;

    /* renamed from: v, reason: collision with root package name */
    public final J2.b f1107v;

    /* renamed from: w, reason: collision with root package name */
    public long f1108w;

    /* renamed from: x, reason: collision with root package name */
    public final C0305m0 f1109x;

    /* renamed from: y, reason: collision with root package name */
    public final C0305m0 f1110y;

    public Z(C0102h0 c0102h0, C0326x0 c0326x0, InterfaceC0044l1 interfaceC0044l1) {
        this.f1088a = c0102h0;
        this.f1089b = c0326x0;
        this.f1090c = interfaceC0044l1;
        v3.g gVar = new v3.g(9, false);
        C0203h c0203h = AbstractC0205j.f2833a;
        long j5 = K0.N.f2801b;
        P0.w wVar = new P0.w(c0203h, j5, (K0.N) null);
        gVar.f20439l = wVar;
        gVar.f20440m = new P0.h(c0203h, wVar.f4680b);
        this.f1091d = gVar;
        Boolean bool = Boolean.FALSE;
        this.f = AbstractC0329z.t(bool);
        this.f1093g = AbstractC0329z.t(new W0.f(0));
        this.i = AbstractC0329z.t(null);
        this.f1096k = AbstractC0329z.t(O.f1064k);
        this.f1097l = AbstractC0329z.t(bool);
        this.f1098m = AbstractC0329z.t(bool);
        this.f1099n = AbstractC0329z.t(bool);
        this.f1100o = AbstractC0329z.t(bool);
        this.f1101p = true;
        this.f1102q = AbstractC0329z.t(Boolean.TRUE);
        this.f1103r = new v3.e(interfaceC0044l1);
        this.f1104s = C0099g.f1147p;
        this.f1105t = new C0116v(this, 5);
        this.f1106u = new C0116v(this, 4);
        this.f1107v = i0.F.g();
        this.f1108w = i0.p.f17293g;
        this.f1109x = AbstractC0329z.t(new K0.N(j5));
        this.f1110y = AbstractC0329z.t(new K0.N(j5));
    }

    public final O a() {
        return (O) this.f1096k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final InterfaceC2637x c() {
        InterfaceC2637x interfaceC2637x = this.f1094h;
        if (interfaceC2637x == null || !interfaceC2637x.F()) {
            return null;
        }
        return interfaceC2637x;
    }

    public final F0 d() {
        return (F0) this.i.getValue();
    }

    public final void e(long j5) {
        this.f1110y.setValue(new K0.N(j5));
    }

    public final void f(long j5) {
        this.f1109x.setValue(new K0.N(j5));
    }
}
