package E;

import P.C0302l;
import P.C0315s;
import P.d1;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1068l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1069m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K0.O f1070n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(int i, int i5, K0.O o5) {
        super(3);
        this.f1068l = i;
        this.f1069m = i5;
        this.f1070n = o5;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(408240218);
        int i = this.f1068l;
        int i5 = this.f1069m;
        W.s(i, i5);
        b0.m mVar = b0.m.f7161k;
        if (i == 1 && i5 == Integer.MAX_VALUE) {
            c0315s.q(false);
            return mVar;
        }
        W0.c cVar = (W0.c) c0315s.j(A0.I0.f287h);
        O0.d dVar = (O0.d) c0315s.j(A0.I0.f289k);
        W0.m mVar2 = (W0.m) c0315s.j(A0.I0.f292n);
        K0.O o5 = this.f1070n;
        boolean f = c0315s.f(o5) | c0315s.f(mVar2);
        Object M5 = c0315s.M();
        P.Z z3 = C0302l.f4480a;
        if (f || M5 == z3) {
            M5 = K0.F.h(o5, mVar2);
            c0315s.i0(M5);
        }
        K0.O o6 = (K0.O) M5;
        boolean f5 = c0315s.f(dVar) | c0315s.f(o6);
        Object M6 = c0315s.M();
        if (f5 || M6 == z3) {
            K0.G g5 = o6.f2805a;
            O0.o oVar = g5.f;
            O0.l lVar = g5.f2766c;
            if (lVar == null) {
                lVar = O0.l.f4027m;
            }
            O0.j jVar = g5.f2767d;
            int i6 = jVar != null ? jVar.f4024a : 0;
            O0.k kVar = g5.f2768e;
            M6 = ((O0.f) dVar).b(oVar, lVar, i6, kVar != null ? kVar.f4025a : 65535);
            c0315s.i0(M6);
        }
        d1 d1Var = (d1) M6;
        boolean f6 = c0315s.f(d1Var.getValue()) | c0315s.f(cVar) | c0315s.f(dVar) | c0315s.f(o5) | c0315s.f(mVar2);
        Object M7 = c0315s.M();
        if (f6 || M7 == z3) {
            M7 = Integer.valueOf((int) (n0.a(o6, cVar, dVar, n0.f1241a, 1) & 4294967295L));
            c0315s.i0(M7);
        }
        int intValue = ((Number) M7).intValue();
        boolean f7 = c0315s.f(d1Var.getValue()) | c0315s.f(cVar) | c0315s.f(dVar) | c0315s.f(o5) | c0315s.f(mVar2);
        Object M8 = c0315s.M();
        if (f7 || M8 == z3) {
            StringBuilder sb = new StringBuilder();
            String str = n0.f1241a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            M8 = Integer.valueOf((int) (n0.a(o6, cVar, dVar, sb.toString(), 2) & 4294967295L));
            c0315s.i0(M8);
        }
        int intValue2 = ((Number) M8).intValue() - intValue;
        Integer valueOf = i == 1 ? null : Integer.valueOf(((i - 1) * intValue2) + intValue);
        Integer valueOf2 = i5 != Integer.MAX_VALUE ? Integer.valueOf(((i5 - 1) * intValue2) + intValue) : null;
        b0.p d5 = androidx.compose.foundation.layout.c.d(mVar, valueOf != null ? cVar.h0(valueOf.intValue()) : Float.NaN, valueOf2 != null ? cVar.h0(valueOf2.intValue()) : Float.NaN);
        c0315s.q(false);
        return d5;
    }
}
