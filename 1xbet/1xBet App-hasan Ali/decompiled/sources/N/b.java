package N;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import u.AbstractC2478z;
import u.C2451c;
import u.C2473u;
import u.z0;
import y.C2646b;
import y.C2651g;
import y.InterfaceC2653i;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f3665a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f3666b;

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f3667c;

    static {
        C2473u c2473u = new C2473u(0.4f, 0.0f, 0.6f);
        f3665a = new z0(120, 0, AbstractC2478z.f19970a);
        f3666b = new z0(150, 0, c2473u);
        f3667c = new z0(120, 0, c2473u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0017, code lost:
    
        if ((r10 instanceof y.C2648d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        if ((r9 instanceof y.C2648d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C2451c c2451c, float f, InterfaceC2653i interfaceC2653i, InterfaceC2653i interfaceC2653i2, AbstractC0548i abstractC0548i) {
        z0 z0Var;
        z0 z0Var2 = null;
        if (interfaceC2653i2 != null) {
            boolean z3 = interfaceC2653i2 instanceof y.l;
            z0Var = f3665a;
            if (!z3) {
                if (!(interfaceC2653i2 instanceof C2646b)) {
                    if (!(interfaceC2653i2 instanceof C2651g)) {
                    }
                }
            }
            z0Var2 = z0Var;
        } else if (interfaceC2653i != null) {
            boolean z5 = interfaceC2653i instanceof y.l;
            z0Var = f3666b;
            if (!z5 && !(interfaceC2653i instanceof C2646b)) {
                if (interfaceC2653i instanceof C2651g) {
                    z0Var2 = f3667c;
                }
            }
            z0Var2 = z0Var;
        }
        z0 z0Var3 = z0Var2;
        W3.o oVar = W3.o.f6046a;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        if (z0Var3 != null) {
            Object c5 = C2451c.c(c2451c, new W0.f(f), z0Var3, null, abstractC0548i, 12);
            if (c5 == enumC0510a) {
                return c5;
            }
        } else {
            Object e3 = c2451c.e(abstractC0548i, new W0.f(f));
            if (e3 == enumC0510a) {
                return e3;
            }
        }
        return oVar;
    }
}
