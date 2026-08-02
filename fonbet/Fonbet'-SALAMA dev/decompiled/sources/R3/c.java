package R3;

import A1.AbstractC0021h;
import V3.C0460b;
import V3.C0462d;
import V3.C0464f;
import V3.O;
import V3.Q;
import V3.S;
import V3.T;
import V3.U;
import V3.V;
import V3.X;
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class c extends Q3.d {

    /* renamed from: e, reason: collision with root package name */
    public static final Q3.l f6017e = new Q3.l(a.class, new H5.k(13));

    /* renamed from: f, reason: collision with root package name */
    public static final Q3.l f6018f = new Q3.l(j.class, new H5.k(15));

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6019d = 1;

    public /* synthetic */ c(Class cls, K3.f[] fVarArr) {
        super(cls, fVarArr);
    }

    public static Q3.c s(int i7, int i8, O o7, int i9) {
        S D7 = T.D();
        U D8 = V.D();
        D8.e();
        V.y((V) D8.f11827b, o7);
        D8.e();
        V.z((V) D8.f11827b, i8);
        V v6 = (V) D8.b();
        D7.e();
        T.y((T) D7.f11827b, v6);
        D7.e();
        T.z((T) D7.f11827b, i7);
        return new Q3.c((T) D7.b(), i9);
    }

    public static void t(C0464f c0464f) {
        if (c0464f.A() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c0464f.A() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void u(V v6) {
        if (v6.C() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int ordinal = v6.B().ordinal();
        if (ordinal == 1) {
            if (v6.C() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (ordinal == 2) {
            if (v6.C() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (ordinal == 3) {
            if (v6.C() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 4) {
            if (v6.C() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (ordinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (v6.C() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // Q3.d
    public int k() {
        switch (this.f6019d) {
            case 1:
                return 2;
            default:
                return super.k();
        }
    }

    @Override // Q3.d
    public final String l() {
        switch (this.f6019d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // Q3.d
    public final AbstractC0021h n() {
        switch (this.f6019d) {
            case 0:
                return new b(C0462d.class);
            default:
                return new K3.g(this);
        }
    }

    @Override // Q3.d
    public final X o() {
        switch (this.f6019d) {
        }
        return X.SYMMETRIC;
    }

    @Override // Q3.d
    public final AbstractC0865a p(AbstractC0873i abstractC0873i) {
        switch (this.f6019d) {
            case 0:
                return C0460b.F(abstractC0873i, C0879o.a());
            default:
                return Q.G(abstractC0873i, C0879o.a());
        }
    }

    @Override // Q3.d
    public final void r(AbstractC0865a abstractC0865a) {
        switch (this.f6019d) {
            case 0:
                C0460b c0460b = (C0460b) abstractC0865a;
                W3.o.c(c0460b.D());
                if (c0460b.B().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                t(c0460b.C());
                return;
            default:
                Q q7 = (Q) abstractC0865a;
                W3.o.c(q7.E());
                if (q7.C().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                u(q7.D());
                return;
        }
    }

    public c() {
        super(Q.class, new K3.f(J3.j.class, 11));
    }
}
