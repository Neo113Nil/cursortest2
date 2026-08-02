package E;

import A0.C0013b0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import i4.InterfaceC2015a;
import o4.AbstractC2227e;
import w.C2539b;
import x.C2600q;
import x.InterfaceC2591l0;
import y.C2654j;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1392l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1393m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1394n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1395o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(C0107l c0107l, boolean z3, InterfaceC2015a interfaceC2015a) {
        super(3);
        this.f1394n = c0107l;
        this.f1393m = z3;
        this.f1395o = (kotlin.jvm.internal.m) interfaceC2015a;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f1392l) {
            case 0:
                C0315s c0315s = (C0315s) obj2;
                ((Number) obj3).intValue();
                c0315s.X(805428266);
                boolean z3 = c0315s.j(A0.I0.f292n) == W0.m.f6017l;
                B0 b02 = (B0) this.f1394n;
                boolean z5 = ((x.P) b02.f998e.getValue()) == x.P.f20695k || !z3;
                boolean f = c0315s.f(b02);
                Object M5 = c0315s.M();
                Object obj4 = C0302l.f4480a;
                if (f || M5 == obj4) {
                    M5 = new A.B(11, b02);
                    c0315s.i0(M5);
                }
                InterfaceC0289e0 w5 = AbstractC0329z.w((i4.c) M5, c0315s);
                Object M6 = c0315s.M();
                if (M6 == obj4) {
                    Object c2600q = new C2600q(new C0013b0(2, w5));
                    c0315s.i0(c2600q);
                    M6 = c2600q;
                }
                InterfaceC2591l0 interfaceC2591l0 = (InterfaceC2591l0) M6;
                boolean f5 = c0315s.f(interfaceC2591l0) | c0315s.f(b02);
                Object M7 = c0315s.M();
                if (f5 || M7 == obj4) {
                    M7 = new y0(interfaceC2591l0, b02);
                    c0315s.i0(M7);
                }
                b0.p b3 = androidx.compose.foundation.gestures.a.b(b0.m.f7161k, (y0) M7, (x.P) b02.f998e.getValue(), null, this.f1393m && b02.f995b.h() != 0.0f, z5, null, (C2654j) this.f1395o);
                c0315s.q(false);
                return b3;
            default:
                C2539b c2539b = (C2539b) obj;
                C0315s c0315s2 = (C0315s) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0315s2.f(c2539b) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    String str = (String) ((C0107l) this.f1394n).invoke(c0315s2, 0);
                    if (AbstractC2227e.H0(str)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    w.p.b(str, this.f1393m, c2539b, (kotlin.jvm.internal.m) this.f1395o, c0315s2, (intValue << 6) & 896);
                }
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(B0 b02, boolean z3, C2654j c2654j) {
        super(3);
        this.f1394n = b02;
        this.f1393m = z3;
        this.f1395o = c2654j;
    }
}
