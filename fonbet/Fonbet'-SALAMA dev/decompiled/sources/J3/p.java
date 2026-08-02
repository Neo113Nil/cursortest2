package J3;

import V3.Z;
import V3.f0;
import V3.g0;
import V3.h0;
import V3.i0;
import V3.j0;
import V3.k0;
import V3.r0;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3860a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static k0 a(g0 g0Var) {
        h0 B7 = k0.B();
        int D7 = g0Var.D();
        B7.e();
        k0.y((k0) B7.f11827b, D7);
        for (f0 f0Var : g0Var.C()) {
            i0 D8 = j0.D();
            String D9 = f0Var.C().D();
            D8.e();
            j0.y((j0) D8.f11827b, D9);
            Z F7 = f0Var.F();
            D8.e();
            j0.A((j0) D8.f11827b, F7);
            r0 E7 = f0Var.E();
            D8.e();
            j0.z((j0) D8.f11827b, E7);
            int D10 = f0Var.D();
            D8.e();
            j0.B((j0) D8.f11827b, D10);
            j0 j0Var = (j0) D8.b();
            B7.e();
            k0.z((k0) B7.f11827b, j0Var);
        }
        return (k0) B7.b();
    }
}
