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
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends AbstractC0021h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3908b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q3.d f3909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, boolean z4) {
        super(n0.class);
        this.f3909c = hVar;
    }

    @Override // A1.AbstractC0021h
    public final AbstractC0865a b(AbstractC0865a abstractC0865a) {
        switch (this.f3908b) {
            case 0:
                C0468j c0468j = (C0468j) abstractC0865a;
                f[] fVarArr = {new f(W3.k.class, 1)};
                HashMap hashMap = new HashMap();
                for (f fVar : fVarArr) {
                    boolean containsKey = hashMap.containsKey(fVar.f3906a);
                    Class cls = fVar.f3906a;
                    if (containsKey) {
                        throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls));
                    }
                    hashMap.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f3906a;
                }
                Collections.unmodifiableMap(hashMap);
                C0472n A7 = c0468j.A();
                C0469k F7 = C0470l.F();
                C0474p C3 = A7.C();
                F7.e();
                C0470l.z((C0470l) F7.f11827b, C3);
                byte[] a2 = W3.n.a(A7.B());
                C0872h t7 = AbstractC0873i.t(a2, 0, a2.length);
                F7.e();
                C0470l.A((C0470l) F7.f11827b, t7);
                F7.e();
                C0470l.y((C0470l) F7.f11827b);
                C0470l c0470l = (C0470l) F7.b();
                f[] fVarArr2 = {new f(J3.j.class, 11)};
                HashMap hashMap2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f3906a);
                    Class cls3 = fVar2.f3906a;
                    if (containsKey2) {
                        throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls3));
                    }
                    hashMap2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f3906a;
                }
                Collections.unmodifiableMap(hashMap2);
                T B7 = c0468j.B();
                P F8 = Q.F();
                F8.e();
                Q.y((Q) F8.f11827b);
                V C7 = B7.C();
                F8.e();
                Q.z((Q) F8.f11827b, C7);
                byte[] a4 = W3.n.a(B7.B());
                C0872h t8 = AbstractC0873i.t(a4, 0, a4.length);
                F8.e();
                Q.A((Q) F8.f11827b, t8);
                Q q7 = (Q) F8.b();
                C0465g E7 = C0466h.E();
                E7.e();
                C0466h.z((C0466h) E7.f11827b, c0470l);
                E7.e();
                C0466h.A((C0466h) E7.f11827b, q7);
                ((h) this.f3909c).getClass();
                E7.e();
                C0466h.y((C0466h) E7.f11827b);
                return (C0466h) E7.b();
            case 1:
                C0477t c0477t = (C0477t) abstractC0865a;
                C0475q E8 = V3.r.E();
                byte[] a7 = W3.n.a(c0477t.A());
                C0872h t9 = AbstractC0873i.t(a7, 0, a7.length);
                E8.e();
                V3.r.A((V3.r) E8.f11827b, t9);
                C0479v B8 = c0477t.B();
                E8.e();
                V3.r.z((V3.r) E8.f11827b, B8);
                ((h) this.f3909c).getClass();
                E8.e();
                V3.r.y((V3.r) E8.f11827b);
                return (V3.r) E8.b();
            case 2:
                C0480w C8 = C0481x.C();
                byte[] a8 = W3.n.a(((C0483z) abstractC0865a).z());
                C0872h t10 = AbstractC0873i.t(a8, 0, a8.length);
                C8.e();
                C0481x.z((C0481x) C8.f11827b, t10);
                ((h) this.f3909c).getClass();
                C8.e();
                C0481x.y((C0481x) C8.f11827b);
                return (C0481x) C8.b();
            case 3:
                A C9 = B.C();
                byte[] a9 = W3.n.a(((D) abstractC0865a).z());
                C0872h t11 = AbstractC0873i.t(a9, 0, a9.length);
                C9.e();
                B.z((B) C9.f11827b, t11);
                ((h) this.f3909c).getClass();
                C9.e();
                B.y((B) C9.f11827b);
                return (B) C9.b();
            case 4:
                I C10 = J.C();
                ((h) this.f3909c).getClass();
                C10.e();
                J.y((J) C10.f11827b);
                byte[] a10 = W3.n.a(32);
                C0872h t12 = AbstractC0873i.t(a10, 0, a10.length);
                C10.e();
                J.z((J) C10.f11827b, t12);
                return (J) C10.b();
            case 5:
                l0 C11 = m0.C();
                C11.e();
                m0.z((m0) C11.f11827b, (n0) abstractC0865a);
                ((h) this.f3909c).getClass();
                C11.e();
                m0.y((m0) C11.f11827b);
                return (m0) C11.b();
            case 6:
                o0 C12 = p0.C();
                C12.e();
                p0.z((p0) C12.f11827b, (q0) abstractC0865a);
                ((h) this.f3909c).getClass();
                C12.e();
                p0.y((p0) C12.f11827b);
                return (p0) C12.b();
            case 7:
                t0 C13 = u0.C();
                ((h) this.f3909c).getClass();
                C13.e();
                u0.y((u0) C13.f11827b);
                byte[] a11 = W3.n.a(32);
                C0872h t13 = AbstractC0873i.t(a11, 0, a11.length);
                C13.e();
                u0.z((u0) C13.f11827b, t13);
                return (u0) C13.b();
            case 8:
                E C14 = F.C();
                byte[] a12 = W3.n.a(((H) abstractC0865a).z());
                C0872h t14 = AbstractC0873i.t(a12, 0, a12.length);
                C14.e();
                F.z((F) C14.f11827b, t14);
                ((h) this.f3909c).getClass();
                C14.e();
                F.y((F) C14.f11827b);
                return (F) C14.b();
            default:
                T t15 = (T) abstractC0865a;
                P F9 = Q.F();
                ((R3.c) this.f3909c).getClass();
                F9.e();
                Q.y((Q) F9.f11827b);
                V C15 = t15.C();
                F9.e();
                Q.z((Q) F9.f11827b, C15);
                byte[] a13 = W3.n.a(t15.B());
                C0872h t16 = AbstractC0873i.t(a13, 0, a13.length);
                F9.e();
                Q.A((Q) F9.f11827b, t16);
                return (Q) F9.b();
        }
    }

    @Override // A1.AbstractC0021h
    public Map l() {
        switch (this.f3908b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", h.t(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", h.t(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", h.t(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", h.t(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_EAX", h.s(16, 1));
                hashMap2.put("AES128_EAX_RAW", h.s(16, 3));
                hashMap2.put("AES256_EAX", h.s(32, 1));
                hashMap2.put("AES256_EAX_RAW", h.s(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 2:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("AES128_GCM", h.u(16, 1));
                hashMap3.put("AES128_GCM_RAW", h.u(16, 3));
                hashMap3.put("AES256_GCM", h.u(32, 1));
                hashMap3.put("AES256_GCM_RAW", h.u(32, 3));
                return Collections.unmodifiableMap(hashMap3);
            case 3:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("AES128_GCM_SIV", h.v(16, 1));
                hashMap4.put("AES128_GCM_SIV_RAW", h.v(16, 3));
                hashMap4.put("AES256_GCM_SIV", h.v(32, 1));
                hashMap4.put("AES256_GCM_SIV_RAW", h.v(32, 3));
                return Collections.unmodifiableMap(hashMap4);
            case 4:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new Q3.c(L.y(), 1));
                hashMap5.put("CHACHA20_POLY1305_RAW", new Q3.c(L.y(), 3));
                return Collections.unmodifiableMap(hashMap5);
            case 5:
            case 6:
            default:
                return super.l();
            case 7:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new Q3.c(v0.y(), 1));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new Q3.c(v0.y(), 3));
                return Collections.unmodifiableMap(hashMap6);
            case 8:
                HashMap hashMap7 = new HashMap();
                G A7 = H.A();
                A7.e();
                H.y((H) A7.f11827b);
                hashMap7.put("AES256_SIV", new Q3.c((H) A7.b(), 1));
                G A8 = H.A();
                A8.e();
                H.y((H) A8.f11827b);
                hashMap7.put("AES256_SIV_RAW", new Q3.c((H) A8.b(), 3));
                return Collections.unmodifiableMap(hashMap7);
            case 9:
                HashMap hashMap8 = new HashMap();
                O o7 = O.SHA256;
                hashMap8.put("HMAC_SHA256_128BITTAG", R3.c.s(32, 16, o7, 1));
                hashMap8.put("HMAC_SHA256_128BITTAG_RAW", R3.c.s(32, 16, o7, 3));
                hashMap8.put("HMAC_SHA256_256BITTAG", R3.c.s(32, 32, o7, 1));
                hashMap8.put("HMAC_SHA256_256BITTAG_RAW", R3.c.s(32, 32, o7, 3));
                O o8 = O.SHA512;
                hashMap8.put("HMAC_SHA512_128BITTAG", R3.c.s(64, 16, o8, 1));
                hashMap8.put("HMAC_SHA512_128BITTAG_RAW", R3.c.s(64, 16, o8, 3));
                hashMap8.put("HMAC_SHA512_256BITTAG", R3.c.s(64, 32, o8, 1));
                hashMap8.put("HMAC_SHA512_256BITTAG_RAW", R3.c.s(64, 32, o8, 3));
                hashMap8.put("HMAC_SHA512_512BITTAG", R3.c.s(64, 64, o8, 1));
                hashMap8.put("HMAC_SHA512_512BITTAG_RAW", R3.c.s(64, 64, o8, 3));
                return Collections.unmodifiableMap(hashMap8);
        }
    }

    @Override // A1.AbstractC0021h
    public final AbstractC0865a m(AbstractC0873i abstractC0873i) {
        switch (this.f3908b) {
            case 0:
                return C0468j.D(abstractC0873i, C0879o.a());
            case 1:
                return C0477t.D(abstractC0873i, C0879o.a());
            case 2:
                return C0483z.B(abstractC0873i, C0879o.a());
            case 3:
                return D.B(abstractC0873i, C0879o.a());
            case 4:
                return L.z(abstractC0873i, C0879o.a());
            case 5:
                return n0.A(abstractC0873i, C0879o.a());
            case 6:
                return q0.C(abstractC0873i, C0879o.a());
            case 7:
                return v0.z(abstractC0873i, C0879o.a());
            case 8:
                return H.B(abstractC0873i, C0879o.a());
            default:
                return T.E(abstractC0873i, C0879o.a());
        }
    }

    @Override // A1.AbstractC0021h
    public final void p(AbstractC0865a abstractC0865a) {
        switch (this.f3908b) {
            case 0:
                C0468j c0468j = (C0468j) abstractC0865a;
                f[] fVarArr = {new f(W3.k.class, 1)};
                HashMap hashMap = new HashMap();
                for (f fVar : fVarArr) {
                    boolean containsKey = hashMap.containsKey(fVar.f3906a);
                    Class cls = fVar.f3906a;
                    if (containsKey) {
                        throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls));
                    }
                    hashMap.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f3906a;
                }
                Collections.unmodifiableMap(hashMap);
                C0472n A7 = c0468j.A();
                W3.o.a(A7.B());
                C0474p C3 = A7.C();
                if (C3.A() < 12 || C3.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(J3.j.class, 11)};
                HashMap hashMap2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f3906a);
                    Class cls3 = fVar2.f3906a;
                    if (containsKey2) {
                        throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls3));
                    }
                    hashMap2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f3906a;
                }
                Collections.unmodifiableMap(hashMap2);
                T B7 = c0468j.B();
                if (B7.B() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                R3.c.u(B7.C());
                W3.o.a(c0468j.A().B());
                return;
            case 1:
                C0477t c0477t = (C0477t) abstractC0865a;
                W3.o.a(c0477t.A());
                if (c0477t.B().A() != 12 && c0477t.B().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                W3.o.a(((C0483z) abstractC0865a).z());
                return;
            case 3:
                W3.o.a(((D) abstractC0865a).z());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                q0 q0Var = (q0) abstractC0865a;
                if (q0Var.A().isEmpty() || !q0Var.B()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 7:
                return;
            case 8:
                H h6 = (H) abstractC0865a;
                if (h6.z() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h6.z() + ". Valid keys must have 64 bytes.");
            default:
                T t7 = (T) abstractC0865a;
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
