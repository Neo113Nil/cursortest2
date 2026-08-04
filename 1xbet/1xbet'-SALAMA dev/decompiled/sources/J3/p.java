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

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3860a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static k0 a(g0 g0Var) {
        h0 h0VarB = k0.B();
        int iD = g0Var.D();
        h0VarB.e();
        k0.y((k0) h0VarB.f11827b, iD);
        for (f0 f0Var : g0Var.C()) {
            i0 i0VarD = j0.D();
            String strD = f0Var.C().D();
            i0VarD.e();
            j0.y((j0) i0VarD.f11827b, strD);
            Z zF = f0Var.F();
            i0VarD.e();
            j0.A((j0) i0VarD.f11827b, zF);
            r0 r0VarE = f0Var.E();
            i0VarD.e();
            j0.z((j0) i0VarD.f11827b, r0VarE);
            int iD2 = f0Var.D();
            i0VarD.e();
            j0.B((j0) i0VarD.f11827b, iD2);
            j0 j0Var = (j0) i0VarD.b();
            h0VarB.e();
            k0.z((k0) h0VarB.f11827b, j0Var);
        }
        return (k0) h0VarB.b();
    }
}
