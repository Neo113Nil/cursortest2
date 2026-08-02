package U7;

import Am.C2438a;
import C.C2702w;
import T7.C4028j;
import T7.C4032n;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.C6456l;
import f8.C6457m;
import f8.C6458n;
import f8.E;
import f8.G;
import f8.O;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4032n, G> f27376a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<G> f27377b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<C4028j, F> f27378c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f27379d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27380a;

        static {
            int[] iArr = new int[O.values().length];
            f27380a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27380a[O.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27380a[O.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27380a[O.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f27376a = com.google.crypto.tink.internal.z.a(new C2702w(), C4032n.class);
        f27377b = com.google.crypto.tink.internal.x.a(new c(), c11);
        f27378c = AbstractC5889h.a(new C2438a(), C4028j.class);
        f27379d = AbstractC5887f.a(new d(), c11);
    }

    public static C4032n a(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            C6457m J11 = C6457m.J(g10.c().K(), C5910p.b());
            C4032n.a b11 = C4032n.b();
            b11.c(J11.G());
            b11.b(J11.H().G());
            b11.d();
            b11.e(h(g10.c().I()));
            return b11.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e11);
        }
    }

    public static F b(C4028j c4028j, S7.r rVar) {
        C6456l.b J11 = C6456l.J();
        J11.j(e(c4028j.i()));
        byte[] d11 = c4028j.h().d(rVar);
        J11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.AesEaxKey", J11.b().toByteString(), E.c.SYMMETRIC, g(c4028j.i().f()), c4028j.c());
    }

    public static C4028j c(F f7, S7.r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            C6456l K11 = C6456l.K(f7.g(), C5910p.b());
            if (K11.I() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C4032n.a b11 = C4032n.b();
            b11.c(K11.G().size());
            b11.b(K11.H().G());
            b11.d();
            b11.e(h(f7.e()));
            C4032n a11 = b11.a();
            C4028j.a g10 = C4028j.g();
            g10.d(a11);
            g10.c(C7307b.a(K11.G().n(), rVar));
            g10.b(f7.b());
            return g10.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static G d(C4032n c4032n) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesEaxKey");
        C6457m.b I11 = C6457m.I();
        I11.j(e(c4032n));
        I11.i(c4032n.d());
        L11.k(I11.b().toByteString());
        L11.i(g(c4032n.f()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    private static C6458n e(C4032n c4032n) throws GeneralSecurityException {
        if (c4032n.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c4032n.e())));
        }
        C6458n.b H11 = C6458n.H();
        H11.i(c4032n.c());
        return H11.b();
    }

    public static void f() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f27376a);
        a11.h(f27377b);
        a11.g(f27378c);
        a11.f(f27379d);
    }

    private static O g(C4032n.b bVar) throws GeneralSecurityException {
        if (C4032n.b.f26855b.equals(bVar)) {
            return O.TINK;
        }
        if (C4032n.b.f26856c.equals(bVar)) {
            return O.CRUNCHY;
        }
        if (C4032n.b.f26857d.equals(bVar)) {
            return O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + bVar);
    }

    private static C4032n.b h(O o11) throws GeneralSecurityException {
        int i11 = a.f27380a[o11.ordinal()];
        if (i11 == 1) {
            return C4032n.b.f26855b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4032n.b.f26856c;
        }
        if (i11 == 4) {
            return C4032n.b.f26857d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
