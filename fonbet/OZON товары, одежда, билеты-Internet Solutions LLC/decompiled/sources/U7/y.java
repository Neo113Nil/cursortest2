package U7;

import T7.U;
import T7.X;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.E;
import f8.G;
import f8.O;
import f8.Q;
import f8.S;
import f8.T;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<X, G> f27428a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<G> f27429b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<U, F> f27430c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f27431d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27432a;

        static {
            int[] iArr = new int[O.values().length];
            f27432a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27432a[O.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f27428a = com.google.crypto.tink.internal.z.a(new Pk0.g(2), X.class);
        f27429b = com.google.crypto.tink.internal.x.a(new Pk0.h(4), c11);
        f27430c = AbstractC5889h.a(new Pk0.i(3), U.class);
        f27431d = AbstractC5887f.a(new G.g(), c11);
    }

    public static X a(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            S I11 = S.I(g10.c().K(), C5910p.b());
            if (I11.G() == 0) {
                return X.b(g(g10.c().I()), I11.F().G());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e11);
        }
    }

    public static G b(X x11) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        S.b H11 = S.H();
        T.b H12 = T.H();
        H12.i(x11.c());
        H11.i(H12.b());
        L11.k(H11.b().toByteString());
        L11.i(f(x11.d()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static U c(F f7, S7.r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            Q K11 = Q.K(f7.g(), C5910p.b());
            if (K11.I() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (K11.G().size() == 32) {
                return U.g(X.b(g(f7.e()), K11.H().G()), C7307b.a(K11.G().n(), rVar), f7.b());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static F d(U u11, S7.r rVar) {
        Q.b J11 = Q.J();
        byte[] d11 = u11.h().d(rVar);
        J11.i(AbstractC5903i.e(0, d11.length, d11));
        T.b H11 = T.H();
        H11.i(u11.i().c());
        J11.j(H11.b());
        return F.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", J11.b().toByteString(), E.c.SYMMETRIC, f(u11.i().d()), u11.c());
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f27428a);
        a11.h(f27429b);
        a11.g(f27430c);
        a11.f(f27431d);
    }

    private static O f(X.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, X.a.f26778b)) {
            return O.TINK;
        }
        if (Objects.equals(aVar, X.a.f26779c)) {
            return O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static X.a g(O o11) throws GeneralSecurityException {
        int i11 = a.f27432a[o11.ordinal()];
        if (i11 == 1) {
            return X.a.f26778b;
        }
        if (i11 == 2) {
            return X.a.f26779c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
