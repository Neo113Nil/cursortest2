package M;

import P.C0315s;
import P.e1;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f3382a = new e1(C0250v.f3560u);

    public static final i0.J a(int i, C0315s c0315s) {
        k0 k0Var = (k0) c0315s.j(f3382a);
        switch (AbstractC2462i.b(i)) {
            case 0:
                return k0Var.f3376e;
            case 1:
                return b(k0Var.f3376e);
            case 2:
                return k0Var.f3372a;
            case 3:
                return b(k0Var.f3372a);
            case 4:
                return D.e.f920a;
            case 5:
                return k0Var.f3375d;
            case 6:
                D.d dVar = k0Var.f3375d;
                float f = (float) 0.0d;
                return D.d.b(dVar, new D.b(f), null, new D.b(f), 6);
            case 7:
                return b(k0Var.f3375d);
            case 8:
                return k0Var.f3374c;
            case 9:
                return i0.F.f17222a;
            case 10:
                return k0Var.f3373b;
            default:
                throw new D2.e();
        }
    }

    public static final D.d b(D.d dVar) {
        float f = (float) 0.0d;
        return D.d.b(dVar, null, new D.b(f), new D.b(f), 3);
    }
}
