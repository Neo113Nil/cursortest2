package R3;

import M.G;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import n.AbstractC2107A;
import o0.C2201e;
import x0.O;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class h implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5209k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2201e f5210l;

    public /* synthetic */ h(C2201e c2201e, int i) {
        this.f5209k = i;
        this.f5210l = c2201e;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5209k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    b0.h hVar = b0.c.f7141o;
                    b0.m mVar = b0.m.f7161k;
                    O e3 = AbstractC2710l.e(hVar, false);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    b0.p c5 = b0.a.c(c0315s, mVar);
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
                    AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
                    G.a(this.f5210l, null, androidx.compose.foundation.layout.c.f(mVar, 20), V3.a.f5975d, c0315s, 3504, 0);
                    c0315s.q(true);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    G.a(this.f5210l, null, androidx.compose.foundation.layout.c.f(b0.m.f7161k, 14), 0L, c0315s2, 432, 8);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
