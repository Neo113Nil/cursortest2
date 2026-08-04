package K3;

import A1.AbstractC0021h;
import V3.A;
import V3.B;
import V3.C0465g;
import V3.C0466h;
import V3.C0468j;
import V3.C0469k;
import V3.C0470l;
import V3.C0472n;
import V3.C0474p;
import V3.C0475q;
import V3.C0477t;
import V3.C0479v;
import V3.C0480w;
import V3.C0481x;
import V3.C0483z;
import V3.D;
import V3.E;
import V3.F;
import V3.G;
import V3.H;
import V3.I;
import V3.J;
import V3.L;
import V3.O;
import V3.P;
import V3.Q;
import V3.T;
import V3.V;
import V3.l0;
import V3.m0;
import V3.n0;
import V3.o0;
import V3.p0;
import V3.q0;
import V3.t0;
import V3.u0;
import V3.v0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC0021h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3908b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q3.d f3909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, boolean z4) {
        super(n0.class);
        this.f3909c = hVar;
    }

    @Override // A1.AbstractC0021h
    public final AbstractC0821a b(AbstractC0821a abstractC0821a) {
        switch (this.f3908b) {
            case 0:
                C0468j c0468j = (C0468j) abstractC0821a;
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
                Collections.unmodifiableMap(map);
                C0472n c0472nA = c0468j.A();
                C0469k c0469kF = C0470l.F();
                C0474p c0474pC = c0472nA.C();
                c0469kF.e();
                C0470l.z((C0470l) c0469kF.f11827b, c0474pC);
                byte[] bArrA = W3.n.a(c0472nA.B());
                C0828h c0828hT = AbstractC0829i.t(bArrA, 0, bArrA.length);
                c0469kF.e();
                C0470l.A((C0470l) c0469kF.f11827b, c0828hT);
                c0469kF.e();
                C0470l.y((C0470l) c0469kF.f11827b);
                C0470l c0470l = (C0470l) c0469kF.b();
                f[] fVarArr2 = {new f(J3.j.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    boolean zContainsKey2 = map2.containsKey(fVar2.f3906a);
                    Class cls3 = fVar2.f3906a;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException(p031e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls3));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f3906a;
                }
                Collections.unmodifiableMap(map2);
                T tB = c0468j.B();
                P pF = Q.F();
                pF.e();
                Q.y((Q) pF.f11827b);
                V vC = tB.C();
                pF.e();
                Q.z((Q) pF.f11827b, vC);
                byte[] bArrA2 = W3.n.a(tB.B());
                C0828h c0828hT2 = AbstractC0829i.t(bArrA2, 0, bArrA2.length);
                pF.e();
                Q.A((Q) pF.f11827b, c0828hT2);
                Q q7 = (Q) pF.b();
                C0465g c0465gE = C0466h.E();
                c0465gE.e();
                C0466h.z((C0466h) c0465gE.f11827b, c0470l);
                c0465gE.e();
                C0466h.A((C0466h) c0465gE.f11827b, q7);
                ((h) this.f3909c).getClass();
                c0465gE.e();
                C0466h.y((C0466h) c0465gE.f11827b);
                return (C0466h) c0465gE.b();
            case 1:
                C0477t c0477t = (C0477t) abstractC0821a;
                C0475q c0475qE = V3.r.E();
                byte[] bArrA3 = W3.n.a(c0477t.A());
                C0828h c0828hT3 = AbstractC0829i.t(bArrA3, 0, bArrA3.length);
                c0475qE.e();
                V3.r.A((V3.r) c0475qE.f11827b, c0828hT3);
                C0479v c0479vB = c0477t.B();
                c0475qE.e();
                V3.r.z((V3.r) c0475qE.f11827b, c0479vB);
                ((h) this.f3909c).getClass();
                c0475qE.e();
                V3.r.y((V3.r) c0475qE.f11827b);
                return (V3.r) c0475qE.b();
            case 2:
                C0480w c0480wC = C0481x.C();
                byte[] bArrA4 = W3.n.a(((C0483z) abstractC0821a).z());
                C0828h c0828hT4 = AbstractC0829i.t(bArrA4, 0, bArrA4.length);
                c0480wC.e();
                C0481x.z((C0481x) c0480wC.f11827b, c0828hT4);
                ((h) this.f3909c).getClass();
                c0480wC.e();
                C0481x.y((C0481x) c0480wC.f11827b);
                return (C0481x) c0480wC.b();
            case 3:
                A aC = B.C();
                byte[] bArrA5 = W3.n.a(((D) abstractC0821a).z());
                C0828h c0828hT5 = AbstractC0829i.t(bArrA5, 0, bArrA5.length);
                aC.e();
                B.z((B) aC.f11827b, c0828hT5);
                ((h) this.f3909c).getClass();
                aC.e();
                B.y((B) aC.f11827b);
                return (B) aC.b();
            case 4:
                I iC = J.C();
                ((h) this.f3909c).getClass();
                iC.e();
                J.y((J) iC.f11827b);
                byte[] bArrA6 = W3.n.a(32);
                C0828h c0828hT6 = AbstractC0829i.t(bArrA6, 0, bArrA6.length);
                iC.e();
                J.z((J) iC.f11827b, c0828hT6);
                return (J) iC.b();
            case 5:
                l0 l0VarC = m0.C();
                l0VarC.e();
                m0.z((m0) l0VarC.f11827b, (n0) abstractC0821a);
                ((h) this.f3909c).getClass();
                l0VarC.e();
                m0.y((m0) l0VarC.f11827b);
                return (m0) l0VarC.b();
            case 6:
                o0 o0VarC = p0.C();
                o0VarC.e();
                p0.z((p0) o0VarC.f11827b, (q0) abstractC0821a);
                ((h) this.f3909c).getClass();
                o0VarC.e();
                p0.y((p0) o0VarC.f11827b);
                return (p0) o0VarC.b();
            case 7:
                t0 t0VarC = u0.C();
                ((h) this.f3909c).getClass();
                t0VarC.e();
                u0.y((u0) t0VarC.f11827b);
                byte[] bArrA7 = W3.n.a(32);
                C0828h c0828hT7 = AbstractC0829i.t(bArrA7, 0, bArrA7.length);
                t0VarC.e();
                u0.z((u0) t0VarC.f11827b, c0828hT7);
                return (u0) t0VarC.b();
            case 8:
                E eC = F.C();
                byte[] bArrA8 = W3.n.a(((H) abstractC0821a).z());
                C0828h c0828hT8 = AbstractC0829i.t(bArrA8, 0, bArrA8.length);
                eC.e();
                F.z((F) eC.f11827b, c0828hT8);
                ((h) this.f3909c).getClass();
                eC.e();
                F.y((F) eC.f11827b);
                return (F) eC.b();
            default:
                T t7 = (T) abstractC0821a;
                P pF2 = Q.F();
                ((R3.c) this.f3909c).getClass();
                pF2.e();
                Q.y((Q) pF2.f11827b);
                V vC2 = t7.C();
                pF2.e();
                Q.z((Q) pF2.f11827b, vC2);
                byte[] bArrA9 = W3.n.a(t7.B());
                C0828h c0828hT9 = AbstractC0829i.t(bArrA9, 0, bArrA9.length);
                pF2.e();
                Q.A((Q) pF2.f11827b, c0828hT9);
                return (Q) pF2.b();
        }
    }

    @Override // A1.AbstractC0021h
    public Map l() {
        switch (this.f3908b) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_CTR_HMAC_SHA256", h.t(16, 16, 1));
                map.put("AES128_CTR_HMAC_SHA256_RAW", h.t(16, 16, 3));
                map.put("AES256_CTR_HMAC_SHA256", h.t(32, 32, 1));
                map.put("AES256_CTR_HMAC_SHA256_RAW", h.t(32, 32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_EAX", h.s(16, 1));
                map2.put("AES128_EAX_RAW", h.s(16, 3));
                map2.put("AES256_EAX", h.s(32, 1));
                map2.put("AES256_EAX_RAW", h.s(32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_GCM", h.u(16, 1));
                map3.put("AES128_GCM_RAW", h.u(16, 3));
                map3.put("AES256_GCM", h.u(32, 1));
                map3.put("AES256_GCM_RAW", h.u(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM_SIV", h.v(16, 1));
                map4.put("AES128_GCM_SIV_RAW", h.v(16, 3));
                map4.put("AES256_GCM_SIV", h.v(32, 1));
                map4.put("AES256_GCM_SIV_RAW", h.v(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new Q3.c(L.y(), 1));
                map5.put("CHACHA20_POLY1305_RAW", new Q3.c(L.y(), 3));
                return Collections.unmodifiableMap(map5);
            case 5:
            case 6:
            default:
                return super.l();
            case 7:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new Q3.c(v0.y(), 1));
                map6.put("XCHACHA20_POLY1305_RAW", new Q3.c(v0.y(), 3));
                return Collections.unmodifiableMap(map6);
            case 8:
                HashMap map7 = new HashMap();
                G gA = H.A();
                gA.e();
                H.y((H) gA.f11827b);
                map7.put("AES256_SIV", new Q3.c((H) gA.b(), 1));
                G gA2 = H.A();
                gA2.e();
                H.y((H) gA2.f11827b);
                map7.put("AES256_SIV_RAW", new Q3.c((H) gA2.b(), 3));
                return Collections.unmodifiableMap(map7);
            case 9:
                HashMap map8 = new HashMap();
                O o7 = O.SHA256;
                map8.put("HMAC_SHA256_128BITTAG", R3.c.s(32, 16, o7, 1));
                map8.put("HMAC_SHA256_128BITTAG_RAW", R3.c.s(32, 16, o7, 3));
                map8.put("HMAC_SHA256_256BITTAG", R3.c.s(32, 32, o7, 1));
                map8.put("HMAC_SHA256_256BITTAG_RAW", R3.c.s(32, 32, o7, 3));
                O o8 = O.SHA512;
                map8.put("HMAC_SHA512_128BITTAG", R3.c.s(64, 16, o8, 1));
                map8.put("HMAC_SHA512_128BITTAG_RAW", R3.c.s(64, 16, o8, 3));
                map8.put("HMAC_SHA512_256BITTAG", R3.c.s(64, 32, o8, 1));
                map8.put("HMAC_SHA512_256BITTAG_RAW", R3.c.s(64, 32, o8, 3));
                map8.put("HMAC_SHA512_512BITTAG", R3.c.s(64, 64, o8, 1));
                map8.put("HMAC_SHA512_512BITTAG_RAW", R3.c.s(64, 64, o8, 3));
                return Collections.unmodifiableMap(map8);
        }
    }

    @Override // A1.AbstractC0021h
    public final AbstractC0821a m(AbstractC0829i abstractC0829i) {
        switch (this.f3908b) {
            case 0:
                return C0468j.D(abstractC0829i, C0835o.a());
            case 1:
                return C0477t.D(abstractC0829i, C0835o.a());
            case 2:
                return C0483z.B(abstractC0829i, C0835o.a());
            case 3:
                return D.B(abstractC0829i, C0835o.a());
            case 4:
                return L.z(abstractC0829i, C0835o.a());
            case 5:
                return n0.A(abstractC0829i, C0835o.a());
            case 6:
                return q0.C(abstractC0829i, C0835o.a());
            case 7:
                return v0.z(abstractC0829i, C0835o.a());
            case 8:
                return H.B(abstractC0829i, C0835o.a());
            default:
                return T.E(abstractC0829i, C0835o.a());
        }
    }

    @Override // A1.AbstractC0021h
    public final void p(AbstractC0821a abstractC0821a) throws GeneralSecurityException {
        switch (this.f3908b) {
            case 0:
                C0468j c0468j = (C0468j) abstractC0821a;
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
                Collections.unmodifiableMap(map);
                C0472n c0472nA = c0468j.A();
                W3.o.a(c0472nA.B());
                C0474p c0474pC = c0472nA.C();
                if (c0474pC.A() < 12 || c0474pC.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(J3.j.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    boolean zContainsKey2 = map2.containsKey(fVar2.f3906a);
                    Class cls3 = fVar2.f3906a;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException(p031e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls3));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f3906a;
                }
                Collections.unmodifiableMap(map2);
                T tB = c0468j.B();
                if (tB.B() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                R3.c.u(tB.C());
                W3.o.a(c0468j.A().B());
                return;
            case 1:
                C0477t c0477t = (C0477t) abstractC0821a;
                W3.o.a(c0477t.A());
                if (c0477t.B().A() != 12 && c0477t.B().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                W3.o.a(((C0483z) abstractC0821a).z());
                return;
            case 3:
                W3.o.a(((D) abstractC0821a).z());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                q0 q0Var = (q0) abstractC0821a;
                if (q0Var.A().isEmpty() || !q0Var.B()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 7:
                return;
            case 8:
                H h6 = (H) abstractC0821a;
                if (h6.z() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h6.z() + ". Valid keys must have 64 bytes.");
            default:
                T t7 = (T) abstractC0821a;
                if (t7.B() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                R3.c.u(t7.C());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, byte b8) {
        super(q0.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, char c3) {
        super(C0483z.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7) {
        super(C0477t.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i7) {
        super(D.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, short s7) {
        super(L.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, char c3) {
        super(v0.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, int i7) {
        super(H.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(C0468j.class);
        this.f3909c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(R3.c cVar) {
        super(T.class);
        this.f3909c = cVar;
    }
}
