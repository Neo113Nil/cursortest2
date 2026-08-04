package K3;

import V3.B;
import V3.C0460b;
import V3.C0466h;
import V3.C0470l;
import V3.C0481x;
import V3.F;
import V3.J;
import V3.O;
import V3.Q;
import V3.m0;
import V3.p0;
import V3.u0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3907b;

    public f(Class cls, int i7) {
        this.f3907b = i7;
        this.f3906a = cls;
    }

    public final Object a(AbstractC0821a abstractC0821a) throws GeneralSecurityException {
        switch (this.f3907b) {
            case 0:
                C0466h c0466h = (C0466h) abstractC0821a;
                f[] fVarArr = {new f(W3.k.class, 1)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    boolean zContainsKey = map.containsKey(fVar.f3906a);
                    Class cls = fVar.f3906a;
                    if (zContainsKey) {
                        throw new IllegalArgumentException(p031e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f3906a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                C0470l c0470lB = c0466h.B();
                f fVar2 = (f) mapUnmodifiableMap.get(W3.k.class);
                if (fVar2 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + W3.k.class.getCanonicalName() + " not supported.");
                }
                W3.k kVar = (W3.k) fVar2.a(c0470lB);
                f[] fVarArr2 = {new f(J3.j.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar3 : fVarArr2) {
                    boolean zContainsKey2 = map2.containsKey(fVar3.f3906a);
                    Class cls3 = fVar3.f3906a;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException(p031e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls3));
                    }
                    map2.put(cls3, fVar3);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f3906a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                Q qC = c0466h.C();
                f fVar4 = (f) mapUnmodifiableMap2.get(J3.j.class);
                if (fVar4 != null) {
                    return new W3.g(kVar, (J3.j) fVar4.a(qC), c0466h.C().D().C());
                }
                throw new IllegalArgumentException("Requested primitive class " + J3.j.class.getCanonicalName() + " not supported.");
            case 1:
                C0470l c0470l = (C0470l) abstractC0821a;
                return new W3.a(c0470l.C().z(), c0470l.D().A());
            case 2:
                V3.r rVar = (V3.r) abstractC0821a;
                return new W3.b(rVar.B().z(), rVar.C().A());
            case 3:
                return new W3.c(((C0481x) abstractC0821a).A().z(), 0);
            case 4:
                return new M3.a(((B) abstractC0821a).A().z());
            case 5:
                return new W3.c(((J) abstractC0821a).A().z(), 1);
            case 6:
                String strZ = ((m0) abstractC0821a).A().z();
                return J3.i.a(strZ).c(strZ);
            case 7:
                p0 p0Var = (p0) abstractC0821a;
                String strA = p0Var.A().A();
                return new v(p0Var.A().z(), J3.i.a(strA).c(strA));
            case 8:
                return new W3.c(((u0) abstractC0821a).A().z(), 2);
            case 9:
                return new W3.d(((F) abstractC0821a).A().z());
            case 10:
                C0460b c0460b = (C0460b) abstractC0821a;
                return new W3.m(new C1050x1(c0460b.B().z()), c0460b.C().A());
            default:
                Q q7 = (Q) abstractC0821a;
                O oB = q7.D().B();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q7.C().z(), "HMAC");
                int iC = q7.D().C();
                int iOrdinal = oB.ordinal();
                if (iOrdinal == 1) {
                    return new W3.m(new p151v2.n("HMACSHA1", secretKeySpec), iC);
                }
                if (iOrdinal == 2) {
                    return new W3.m(new p151v2.n("HMACSHA384", secretKeySpec), iC);
                }
                if (iOrdinal == 3) {
                    return new W3.m(new p151v2.n("HMACSHA256", secretKeySpec), iC);
                }
                if (iOrdinal == 4) {
                    return new W3.m(new p151v2.n("HMACSHA512", secretKeySpec), iC);
                }
                if (iOrdinal == 5) {
                    return new W3.m(new p151v2.n("HMACSHA224", secretKeySpec), iC);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
