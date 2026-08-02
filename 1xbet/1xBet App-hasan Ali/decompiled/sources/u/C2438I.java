package u;

import A0.C0009a;
import P.AbstractC0329z;
import P.C0302l;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;

/* renamed from: u.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2438I {

    /* renamed from: a, reason: collision with root package name */
    public final R.e f19679a = new R.e(new C2435F[16]);

    /* renamed from: b, reason: collision with root package name */
    public final C0305m0 f19680b = AbstractC0329z.t(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public long f19681c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final C0305m0 f19682d = AbstractC0329z.t(Boolean.TRUE);

    public final void a(int i, C0315s c0315s) {
        c0315s.Z(-318043801);
        if ((((c0315s.h(this) ? 4 : 2) | i) & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            Object M5 = c0315s.M();
            P.Z z3 = C0302l.f4480a;
            if (M5 == z3) {
                M5 = AbstractC0329z.t(null);
                c0315s.i0(M5);
            }
            InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M5;
            if (((Boolean) this.f19682d.getValue()).booleanValue() || ((Boolean) this.f19680b.getValue()).booleanValue()) {
                c0315s.X(1719915818);
                boolean h3 = c0315s.h(this);
                Object M6 = c0315s.M();
                if (h3 || M6 == z3) {
                    M6 = new C2437H(interfaceC0289e0, this, null);
                    c0315s.i0(M6);
                }
                AbstractC0329z.e(c0315s, (i4.e) M6, this);
                c0315s.q(false);
            } else {
                c0315s.X(1721436120);
                c0315s.q(false);
            }
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i, 11, this);
        }
    }
}
