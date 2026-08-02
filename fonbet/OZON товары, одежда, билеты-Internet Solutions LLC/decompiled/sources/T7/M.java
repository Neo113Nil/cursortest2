package T7;

import T7.H;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.E;
import f8.G;
import f8.K;
import f8.L;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<H, com.google.crypto.tink.internal.G> f26727a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<com.google.crypto.tink.internal.G> f26728b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<G, com.google.crypto.tink.internal.F> f26729c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<com.google.crypto.tink.internal.F> f26730d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26731a;

        static {
            int[] iArr = new int[f8.O.values().length];
            f26731a = iArr;
            try {
                iArr[f8.O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26731a[f8.O.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C7306a c11 = com.google.crypto.tink.internal.M.c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f26727a = com.google.crypto.tink.internal.z.a(new I(), H.class);
        f26728b = com.google.crypto.tink.internal.x.a(new J(), c11);
        f26729c = AbstractC5889h.a(new K(), G.class);
        f26730d = AbstractC5887f.a(new L(), c11);
    }

    public static com.google.crypto.tink.internal.G a(H h11) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        L.b H11 = f8.L.H();
        H11.i(h11.c());
        L11.k(H11.b().toByteString());
        L11.i(f(h11.d()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static H b(com.google.crypto.tink.internal.G g10) {
        if (g10.c().J().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return H.b(f8.L.I(g10.c().K(), C5910p.b()).G(), g(g10.c().I()));
            } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e11);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + g10.c().J());
    }

    public static com.google.crypto.tink.internal.F c(G g10) {
        K.b H11 = f8.K.H();
        L.b H12 = f8.L.H();
        H12.i(g10.h().c());
        H11.i(H12.b());
        return com.google.crypto.tink.internal.F.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", H11.b().toByteString(), E.c.REMOTE, f(g10.h().d()), g10.c());
    }

    public static G d(com.google.crypto.tink.internal.F f7) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            f8.K I11 = f8.K.I(f7.g(), C5910p.b());
            if (I11.G() == 0) {
                return G.g(H.b(I11.F().G(), g(f7.e())), f7.b());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + I11);
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e11);
        }
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f26727a);
        a11.h(f26728b);
        a11.g(f26729c);
        a11.f(f26730d);
    }

    private static f8.O f(H.a aVar) throws GeneralSecurityException {
        if (H.a.f26724b.equals(aVar)) {
            return f8.O.TINK;
        }
        if (H.a.f26725c.equals(aVar)) {
            return f8.O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static H.a g(f8.O o11) throws GeneralSecurityException {
        int i11 = a.f26731a[o11.ordinal()];
        if (i11 == 1) {
            return H.a.f26724b;
        }
        if (i11 == 2) {
            return H.a.f26725c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
