package R3;

import M.e0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import androidx.compose.foundation.layout.FillElement;
import n.AbstractC2107A;
import u2.C2488c;
import u2.w;
import x0.O;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class r implements i4.g {

    /* renamed from: k, reason: collision with root package name */
    public static final r f5244k = new r();

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        C0315s c0315s = (C0315s) obj3;
        int intValue = ((Number) obj4).intValue();
        kotlin.jvm.internal.l.f("$this$SubcomposeAsyncImage", (w) obj);
        kotlin.jvm.internal.l.f("it", (C2488c) obj2);
        if ((intValue & 129) == 128 && c0315s.B()) {
            c0315s.S();
        } else {
            b0.m mVar = b0.m.f7161k;
            FillElement fillElement = androidx.compose.foundation.layout.c.f6868c;
            O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, fillElement);
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
            e0.a(2, 0, 3510, V3.a.f5975d, V3.a.f5995z, c0315s, androidx.compose.foundation.layout.c.f(mVar, 18));
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}
