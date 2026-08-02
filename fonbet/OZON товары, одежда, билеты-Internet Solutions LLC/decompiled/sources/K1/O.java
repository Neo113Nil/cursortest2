package K1;

import V1.l;
import k1.C7460f;
import k1.C7461g;
import k1.C7465k;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.H0;
import l1.InterfaceC7802U;
import n1.AbstractC8413f;
import n1.C8415h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O {
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(@NotNull InterfaceC7802U interfaceC7802U, @NotNull K k11) {
        ?? r42;
        Throwable th2;
        InterfaceC7802U interfaceC7802U2;
        InterfaceC7802U interfaceC7802U3;
        float alpha;
        boolean z11 = k11.h() && k11.k().f() != 3;
        if (z11) {
            r42 = 4294967295;
            C7460f a11 = C7461g.a(0L, C7465k.a((int) (k11.A() >> 32), (int) (k11.A() & 4294967295L)));
            interfaceC7802U.save();
            interfaceC7802U.r(a11);
        }
        D u11 = k11.k().i().u();
        V1.i r11 = u11.r();
        if (r11 == null) {
            r11 = V1.i.f27915b;
        }
        V1.i iVar = r11;
        H0 q11 = u11.q();
        if (q11 == null) {
            q11 = H0.f72222d;
        }
        H0 h02 = q11;
        AbstractC8413f g10 = u11.g();
        if (g10 == null) {
            g10 = C8415h.f76287a;
        }
        AbstractC8413f abstractC8413f = g10;
        try {
            AbstractC7799Q e11 = u11.e();
            l.b bVar = l.b.f27920a;
            try {
                if (e11 != null) {
                    if (u11.s() != bVar) {
                        try {
                            alpha = u11.s().getAlpha();
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC7802U2 = interfaceC7802U;
                            if (z11) {
                            }
                        }
                    } else {
                        alpha = 1.0f;
                    }
                    interfaceC7802U3 = interfaceC7802U;
                    C3433m.D(k11.v(), interfaceC7802U3, e11, alpha, h02, iVar, abstractC8413f);
                } else {
                    interfaceC7802U3 = interfaceC7802U;
                    k11.v().C(interfaceC7802U3, u11.s() != bVar ? u11.s().a() : C7807Z.f72248b, h02, iVar, abstractC8413f);
                }
                if (z11) {
                    interfaceC7802U3.p();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                interfaceC7802U2 = r42;
                if (z11) {
                    throw th2;
                }
                interfaceC7802U2.p();
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            r42 = interfaceC7802U;
        }
    }
}
