package Q;

import I.C0160m;
import P.C0280a;
import P.C0326x0;
import P.H0;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;
import i4.InterfaceC2015a;
import r.C2322H;

/* loaded from: classes.dex */
public final class r extends I {

    /* renamed from: e, reason: collision with root package name */
    public static final r f4840e;

    /* renamed from: g, reason: collision with root package name */
    public static final r f4841g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4842c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f4839d = new r(1, 2, 0);
    public static final r f = new r(1, 2, 2);

    static {
        int i = 1;
        f4840e = new r(i, i, 1);
        int i5 = 1;
        f4841g = new r(i5, i5, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i5, int i6) {
        super(i, i5);
        this.f4842c = i6;
    }

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        switch (this.f4842c) {
            case 0:
                Object invoke = ((InterfaceC2015a) c0160m.e(0)).invoke();
                C0280a c0280a = (C0280a) c0160m.e(1);
                int d5 = c0160m.d(0);
                c0280a.getClass();
                p02.T(p02.c(c0280a), invoke);
                interfaceC0284c.h(d5, invoke);
                interfaceC0284c.c(invoke);
                break;
            case 1:
                C0280a c0280a2 = (C0280a) c0160m.e(0);
                int d6 = c0160m.d(0);
                interfaceC0284c.o();
                c0280a2.getClass();
                interfaceC0284c.a(d6, p02.C(p02.c(c0280a2)));
                break;
            case 2:
                Object e3 = c0160m.e(0);
                C0280a c0280a3 = (C0280a) c0160m.e(1);
                int d7 = c0160m.d(0);
                if (e3 instanceof H0) {
                    H0 h02 = (H0) e3;
                    ((R.e) c02.f4906e).c(h02);
                    ((C2322H) c02.f4905d).a(h02);
                }
                Object J = p02.J(p02.c(c0280a3), d7, e3);
                if (!(J instanceof H0)) {
                    if (J instanceof C0326x0) {
                        ((C0326x0) J).d();
                        break;
                    }
                } else {
                    c02.d((H0) J);
                    break;
                }
                break;
            default:
                Object e5 = c0160m.e(0);
                int d8 = c0160m.d(0);
                if (e5 instanceof H0) {
                    H0 h03 = (H0) e5;
                    ((R.e) c02.f4906e).c(h03);
                    ((C2322H) c02.f4905d).a(h03);
                }
                Object J4 = p02.J(p02.f4383t, d8, e5);
                if (!(J4 instanceof H0)) {
                    if (J4 instanceof C0326x0) {
                        ((C0326x0) J4).d();
                        break;
                    }
                } else {
                    c02.d((H0) J4);
                    break;
                }
                break;
        }
    }

    @Override // Q.I
    public C0280a b(C0160m c0160m) {
        switch (this.f4842c) {
            case 0:
                return (C0280a) c0160m.e(1);
            case 1:
                return (C0280a) c0160m.e(0);
            default:
                return super.b(c0160m);
        }
    }
}
