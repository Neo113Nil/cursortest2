package T7;

import J0.C3349u1;
import T7.O;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.E;
import f8.G;
import f8.M;
import f8.N;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<O, com.google.crypto.tink.internal.G> f26755a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<com.google.crypto.tink.internal.G> f26756b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<N, com.google.crypto.tink.internal.F> f26757c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<com.google.crypto.tink.internal.F> f26758d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26759a;

        static {
            int[] iArr = new int[f8.O.values().length];
            f26759a = iArr;
            try {
                iArr[f8.O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26759a[f8.O.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C7306a c11 = com.google.crypto.tink.internal.M.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f26755a = com.google.crypto.tink.internal.z.a(new P(0), O.class);
        f26756b = com.google.crypto.tink.internal.x.a(new Q(0), c11);
        f26757c = AbstractC5889h.a(new C3349u1(1), N.class);
        f26758d = AbstractC5887f.a(new Cm.e(2), c11);
    }

    public static O a(com.google.crypto.tink.internal.G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            return e(f8.N.K(g10.c().K(), C5910p.b()), g10.c().I());
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e11);
        }
    }

    public static com.google.crypto.tink.internal.F b(N n11) {
        M.b H11 = f8.M.H();
        H11.i(g(n11.h()));
        return com.google.crypto.tink.internal.F.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", H11.b().toByteString(), E.c.REMOTE, h(n11.h().d()), n11.c());
    }

    public static com.google.crypto.tink.internal.G c(O o11) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        L11.k(g(o11).toByteString());
        L11.i(h(o11.d()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static N d(com.google.crypto.tink.internal.F f7) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            f8.M I11 = f8.M.I(f7.g(), C5910p.b());
            if (I11.G() == 0) {
                return N.g(e(I11.F(), f7.e()), f7.b());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + I11);
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e11);
        }
    }

    private static O e(f8.N n11, f8.O o11) throws GeneralSecurityException {
        O.b bVar;
        O.c cVar;
        G.b L11 = f8.G.L();
        L11.j(n11.H().J());
        L11.k(n11.H().K());
        L11.i(f8.O.RAW);
        S7.q a11 = S7.t.a(L11.b().f());
        if (a11 instanceof r) {
            bVar = O.b.f26743b;
        } else if (a11 instanceof C4043z) {
            bVar = O.b.f26745d;
        } else if (a11 instanceof c0) {
            bVar = O.b.f26744c;
        } else if (a11 instanceof C4027i) {
            bVar = O.b.f26746e;
        } else if (a11 instanceof C4032n) {
            bVar = O.b.f26747f;
        } else {
            if (!(a11 instanceof C4039v)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + a11);
            }
            bVar = O.b.f26748g;
        }
        O.a aVar = new O.a();
        int i11 = a.f26759a[o11.ordinal()];
        if (i11 == 1) {
            cVar = O.c.f26750b;
        } else {
            if (i11 != 2) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
            }
            cVar = O.c.f26751c;
        }
        aVar.e(cVar);
        aVar.d(n11.I());
        aVar.b((AbstractC4021c) a11);
        aVar.c(bVar);
        return aVar.a();
    }

    public static void f() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f26755a);
        a11.h(f26756b);
        a11.g(f26757c);
        a11.f(f26758d);
    }

    private static f8.N g(O o11) throws GeneralSecurityException {
        try {
            f8.G N11 = f8.G.N(S7.t.b(o11.b()), C5910p.b());
            N.b J11 = f8.N.J();
            J11.j(o11.c());
            J11.i(N11);
            return J11.b();
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e11);
        }
    }

    private static f8.O h(O.c cVar) throws GeneralSecurityException {
        if (O.c.f26750b.equals(cVar)) {
            return f8.O.TINK;
        }
        if (O.c.f26751c.equals(cVar)) {
            return f8.O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }
}
