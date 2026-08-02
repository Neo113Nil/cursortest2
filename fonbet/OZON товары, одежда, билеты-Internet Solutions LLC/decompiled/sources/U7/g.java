package U7;

import J0.C3349u1;
import T7.C4033o;
import T7.P;
import T7.Q;
import T7.r;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.C6462s;
import f8.E;
import f8.G;
import f8.O;
import f8.r;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<T7.r, G> f27383a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<G> f27384b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<C4033o, F> f27385c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f27386d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27387a;

        static {
            int[] iArr = new int[O.values().length];
            f27387a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27387a[O.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27387a[O.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27387a[O.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f27383a = com.google.crypto.tink.internal.z.a(new P(1), T7.r.class);
        f27384b = com.google.crypto.tink.internal.x.a(new Q(1), c11);
        f27385c = AbstractC5889h.a(new C3349u1(2), C4033o.class);
        f27386d = AbstractC5887f.a(new Cm.e(3), c11);
    }

    public static G a(T7.r rVar) {
        h(rVar);
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesGcmKey");
        C6462s.b H11 = C6462s.H();
        H11.i(rVar.d());
        L11.k(H11.b().toByteString());
        L11.i(f(rVar.f()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static T7.r b(com.google.crypto.tink.internal.G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            C6462s I11 = C6462s.I(g10.c().K(), C5910p.b());
            if (I11.G() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            r.a b11 = T7.r.b();
            b11.c(I11.F());
            b11.b();
            b11.d();
            b11.e(g(g10.c().I()));
            return b11.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e11);
        }
    }

    public static F c(C4033o c4033o, S7.r rVar) {
        h(c4033o.i());
        r.b H11 = f8.r.H();
        byte[] d11 = c4033o.h().d(rVar);
        H11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.AesGcmKey", H11.b().toByteString(), E.c.SYMMETRIC, f(c4033o.i().f()), c4033o.c());
    }

    public static C4033o d(F f7, S7.r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            f8.r I11 = f8.r.I(f7.g(), C5910p.b());
            if (I11.G() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            r.a b11 = T7.r.b();
            b11.c(I11.F().size());
            b11.b();
            b11.d();
            b11.e(g(f7.e()));
            T7.r a11 = b11.a();
            C4033o.a g10 = C4033o.g();
            g10.d(a11);
            g10.c(C7307b.a(I11.F().n(), rVar));
            g10.b(f7.b());
            return g10.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f27383a);
        a11.h(f27384b);
        a11.g(f27385c);
        a11.f(f27386d);
    }

    private static O f(r.b bVar) throws GeneralSecurityException {
        if (r.b.f26879b.equals(bVar)) {
            return O.TINK;
        }
        if (r.b.f26880c.equals(bVar)) {
            return O.CRUNCHY;
        }
        if (r.b.f26881d.equals(bVar)) {
            return O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + bVar);
    }

    private static r.b g(O o11) throws GeneralSecurityException {
        int i11 = a.f27387a[o11.ordinal()];
        if (i11 == 1) {
            return r.b.f26879b;
        }
        if (i11 == 2 || i11 == 3) {
            return r.b.f26880c;
        }
        if (i11 == 4) {
            return r.b.f26881d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }

    private static void h(T7.r rVar) throws GeneralSecurityException {
        if (rVar.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(rVar.e())));
        }
        if (rVar.c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(rVar.c())));
        }
    }
}
