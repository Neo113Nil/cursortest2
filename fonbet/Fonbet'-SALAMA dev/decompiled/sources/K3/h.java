package K3;

import A1.AbstractC0021h;
import V3.B;
import V3.C;
import V3.C0466h;
import V3.C0467i;
import V3.C0468j;
import V3.C0470l;
import V3.C0471m;
import V3.C0472n;
import V3.C0473o;
import V3.C0474p;
import V3.C0476s;
import V3.C0477t;
import V3.C0478u;
import V3.C0479v;
import V3.C0481x;
import V3.C0482y;
import V3.C0483z;
import V3.D;
import V3.F;
import V3.J;
import V3.O;
import V3.Q;
import V3.S;
import V3.T;
import V3.U;
import V3.V;
import V3.X;
import V3.m0;
import V3.p0;
import V3.u0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class h extends Q3.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Class cls, f[] fVarArr, int i7) {
        super(cls, fVarArr);
        this.f3910d = i7;
    }

    public static Q3.c s(int i7, int i8) {
        C0476s C3 = C0477t.C();
        C3.e();
        C0477t.z((C0477t) C3.f11827b, i7);
        C0478u B7 = C0479v.B();
        B7.e();
        C0479v.y((C0479v) B7.f11827b);
        C0479v c0479v = (C0479v) B7.b();
        C3.e();
        C0477t.y((C0477t) C3.f11827b, c0479v);
        return new Q3.c((C0477t) C3.b(), i8);
    }

    public static Q3.c t(int i7, int i8, int i9) {
        O o7 = O.SHA256;
        C0471m D7 = C0472n.D();
        C0473o B7 = C0474p.B();
        B7.e();
        C0474p.y((C0474p) B7.f11827b);
        C0474p c0474p = (C0474p) B7.b();
        D7.e();
        C0472n.y((C0472n) D7.f11827b, c0474p);
        D7.e();
        C0472n.z((C0472n) D7.f11827b, i7);
        C0472n c0472n = (C0472n) D7.b();
        S D8 = T.D();
        U D9 = V.D();
        D9.e();
        V.y((V) D9.f11827b, o7);
        D9.e();
        V.z((V) D9.f11827b, i8);
        V v6 = (V) D9.b();
        D8.e();
        T.y((T) D8.f11827b, v6);
        D8.e();
        T.z((T) D8.f11827b, 32);
        T t7 = (T) D8.b();
        C0467i C3 = C0468j.C();
        C3.e();
        C0468j.y((C0468j) C3.f11827b, c0472n);
        C3.e();
        C0468j.z((C0468j) C3.f11827b, t7);
        return new Q3.c((C0468j) C3.b(), i9);
    }

    public static Q3.c u(int i7, int i8) {
        C0482y A7 = C0483z.A();
        A7.e();
        C0483z.y((C0483z) A7.f11827b, i7);
        return new Q3.c((C0483z) A7.b(), i8);
    }

    public static Q3.c v(int i7, int i8) {
        C A7 = D.A();
        A7.e();
        D.y((D) A7.f11827b, i7);
        return new Q3.c((D) A7.b(), i8);
    }

    @Override // Q3.d
    public int k() {
        switch (this.f3910d) {
            case 0:
                return 2;
            case 1:
            default:
                return super.k();
            case 2:
                return 2;
        }
    }

    @Override // Q3.d
    public final String l() {
        switch (this.f3910d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // Q3.d
    public final AbstractC0021h n() {
        switch (this.f3910d) {
            case 0:
                return new g(this);
            case 1:
                return new g(this, (byte) 0);
            case 2:
                return new g(this, (char) 0);
            case 3:
                return new g(this, 0);
            case 4:
                return new g(this, (short) 0);
            case 5:
                return new g(this, (byte) 0, false);
            case 6:
                return new g(this, (byte) 0, (byte) 0);
            case 7:
                return new g(this, (byte) 0, (char) 0);
            default:
                return new g(this, (byte) 0, 0);
        }
    }

    @Override // Q3.d
    public final X o() {
        switch (this.f3910d) {
        }
        return X.SYMMETRIC;
    }

    @Override // Q3.d
    public final AbstractC0865a p(AbstractC0873i abstractC0873i) {
        switch (this.f3910d) {
            case 0:
                return C0466h.F(abstractC0873i, C0879o.a());
            case 1:
                return V3.r.F(abstractC0873i, C0879o.a());
            case 2:
                return C0481x.D(abstractC0873i, C0879o.a());
            case 3:
                return B.D(abstractC0873i, C0879o.a());
            case 4:
                return J.D(abstractC0873i, C0879o.a());
            case 5:
                return m0.D(abstractC0873i, C0879o.a());
            case 6:
                return p0.D(abstractC0873i, C0879o.a());
            case 7:
                return u0.D(abstractC0873i, C0879o.a());
            default:
                return F.D(abstractC0873i, C0879o.a());
        }
    }

    @Override // Q3.d
    public final void r(AbstractC0865a abstractC0865a) {
        switch (this.f3910d) {
            case 0:
                C0466h c0466h = (C0466h) abstractC0865a;
                W3.o.c(c0466h.D());
                f[] fVarArr = {new f(W3.k.class, 1)};
                HashMap hashMap = new HashMap();
                for (int i7 = 0; i7 < 1; i7++) {
                    f fVar = fVarArr[i7];
                    boolean containsKey = hashMap.containsKey(fVar.f3906a);
                    Class cls = fVar.f3906a;
                    if (containsKey) {
                        throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls));
                    }
                    hashMap.put(cls, fVar);
                }
                Class cls2 = fVarArr[0].f3906a;
                Collections.unmodifiableMap(hashMap);
                C0470l B7 = c0466h.B();
                W3.o.c(B7.E());
                W3.o.a(B7.C().size());
                C0474p D7 = B7.D();
                if (D7.A() < 12 || D7.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(J3.j.class, 11)};
                HashMap hashMap2 = new HashMap();
                f fVar2 = fVarArr2[0];
                boolean containsKey2 = hashMap2.containsKey(fVar2.f3906a);
                Class cls3 = fVar2.f3906a;
                if (containsKey2) {
                    throw new IllegalArgumentException(e1.k.h(new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive "), cls3));
                }
                hashMap2.put(cls3, fVar2);
                Class cls4 = fVarArr2[0].f3906a;
                Collections.unmodifiableMap(hashMap2);
                Q C3 = c0466h.C();
                W3.o.c(C3.E());
                if (C3.C().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                R3.c.u(C3.D());
                return;
            case 1:
                V3.r rVar = (V3.r) abstractC0865a;
                W3.o.c(rVar.D());
                W3.o.a(rVar.B().size());
                if (rVar.C().A() != 12 && rVar.C().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                C0481x c0481x = (C0481x) abstractC0865a;
                W3.o.c(c0481x.B());
                W3.o.a(c0481x.A().size());
                return;
            case 3:
                B b7 = (B) abstractC0865a;
                W3.o.c(b7.B());
                W3.o.a(b7.A().size());
                return;
            case 4:
                J j = (J) abstractC0865a;
                W3.o.c(j.B());
                if (j.A().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 5:
                W3.o.c(((m0) abstractC0865a).B());
                return;
            case 6:
                W3.o.c(((p0) abstractC0865a).B());
                return;
            case 7:
                u0 u0Var = (u0) abstractC0865a;
                W3.o.c(u0Var.B());
                if (u0Var.A().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                F f7 = (F) abstractC0865a;
                W3.o.c(f7.B());
                if (f7.A().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + f7.A().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
