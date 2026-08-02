package S3;

import M.u0;
import P.C0315s;
import k4.AbstractC2036a;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import r3.AbstractC2349a;
import z.AbstractC2701c;
import z.C2687K;

/* loaded from: classes.dex */
public final class e0 implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public static final e0 f5477l = new e0(0);

    /* renamed from: m, reason: collision with root package name */
    public static final e0 f5478m = new e0(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5479k;

    public /* synthetic */ e0(int i) {
        this.f5479k = i;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        W3.o oVar = W3.o.f6046a;
        b0.m mVar = b0.m.f7161k;
        switch (this.f5479k) {
            case 0:
                C0315s c0315s = (C0315s) obj2;
                int intValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$FilledTonalButton", (C2687K) obj);
                if ((intValue & 17) != 16 || !c0315s.B()) {
                    M.G.a(AbstractC2036a.F(), null, androidx.compose.foundation.layout.c.f(mVar, 18), 0L, c0315s, 432, 8);
                    AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.f(mVar, 8));
                    u0.b("Browse All Competitions", null, 0L, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, null, c0315s, 196614, 0, 131038);
                    break;
                } else {
                    c0315s.S();
                    break;
                }
            default:
                C0315s c0315s2 = (C0315s) obj2;
                int intValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Button", (C2687K) obj);
                if ((intValue2 & 17) != 16 || !c0315s2.B()) {
                    C2201e c2201e = AbstractC2349a.f19095c;
                    if (c2201e == null) {
                        C2200d c2200d = new C2200d("Filled.CheckCircle", false);
                        int i = o0.z.f18603a;
                        i0.M m5 = new i0.M(i0.p.f17289b);
                        C2202f c2202f = new C2202f(0);
                        c2202f.m(12.0f, 2.0f);
                        c2202f.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        c2202f.o(4.48f, 10.0f, 10.0f, 10.0f);
                        c2202f.o(10.0f, -4.48f, 10.0f, -10.0f);
                        c2202f.n(17.52f, 2.0f, 12.0f, 2.0f);
                        c2202f.e();
                        c2202f.m(10.0f, 17.0f);
                        c2202f.l(-5.0f, -5.0f);
                        c2202f.l(1.41f, -1.41f);
                        c2202f.k(10.0f, 14.17f);
                        c2202f.l(7.59f, -7.59f);
                        c2202f.k(19.0f, 8.0f);
                        c2202f.l(-9.0f, 9.0f);
                        c2202f.e();
                        C2200d.a(c2200d, c2202f.f18548a, m5);
                        c2201e = c2200d.b();
                        AbstractC2349a.f19095c = c2201e;
                    }
                    M.G.a(c2201e, null, androidx.compose.foundation.layout.c.f(mVar, 18), 0L, c0315s2, 432, 8);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.f(mVar, 8));
                    u0.b("Confirm Selection", null, 0L, 0L, O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, null, c0315s2, 196614, 0, 131038);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
        }
        return oVar;
    }
}
