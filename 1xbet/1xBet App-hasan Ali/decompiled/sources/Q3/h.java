package Q3;

import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import W3.o;
import b0.m;
import b0.p;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final h f5094l = new h(0);

    /* renamed from: m, reason: collision with root package name */
    public static final h f5095m = new h(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5096k;

    public /* synthetic */ h(int i) {
        this.f5096k = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5096k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    p f = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.k(), 20);
                    C2717s a5 = AbstractC2716r.a(AbstractC2706h.f21536c, b0.c.f7148v, c0315s, 6);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    p c5 = b0.a.c(c0315s, f);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
                    AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s.f4530S || !l.a(c0315s.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
                    AbstractC2036a.O(0, c0315s);
                    c0315s.q(true);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    G4.l.v(androidx.compose.foundation.layout.b.f(m.f7161k, 14), c0315s2, 6);
                }
                break;
        }
        return o.f6046a;
    }
}
