package U7;

import N3.C3660k;
import N3.C3661l;
import T7.C4023e;
import T7.C4027i;
import T7.E;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.C;
import f8.C6444B;
import f8.C6448d;
import f8.C6449e;
import f8.C6453i;
import f8.C6454j;
import f8.C6455k;
import f8.D;
import f8.E;
import f8.EnumC6443A;
import f8.G;
import f8.O;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4027i, G> f27370a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<G> f27371b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<C4023e, F> f27372c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f27373d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27374a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f27375b;

        static {
            int[] iArr = new int[EnumC6443A.values().length];
            f27375b = iArr;
            try {
                iArr[EnumC6443A.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27375b[EnumC6443A.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27375b[EnumC6443A.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27375b[EnumC6443A.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27375b[EnumC6443A.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[O.values().length];
            f27374a = iArr2;
            try {
                iArr2[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27374a[O.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27374a[O.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27374a[O.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f27370a = com.google.crypto.tink.internal.z.a(new C3660k(), C4027i.class);
        f27371b = com.google.crypto.tink.internal.x.a(new C3661l(), c11);
        f27372c = AbstractC5889h.a(new C4056a(), C4023e.class);
        f27373d = AbstractC5887f.a(new E(), c11);
    }

    public static C4027i a(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            C6449e J11 = C6449e.J(g10.c().K(), C5910p.b());
            if (J11.H().J() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C4027i.a b11 = C4027i.b();
            b11.b(J11.G().H());
            b11.d(J11.H().H());
            b11.e(J11.G().I().G());
            b11.f(J11.H().I().I());
            b11.c(g(J11.H().I().H()));
            b11.g(i(g10.c().I()));
            return b11.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e11);
        }
    }

    public static G b(C4027i c4027i) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        C6449e.b I11 = C6449e.I();
        C6454j.b J11 = C6454j.J();
        C6455k.b H11 = C6455k.H();
        H11.i(c4027i.f());
        J11.j(H11.b());
        J11.i(c4027i.c());
        I11.i(J11.b());
        C.b K11 = C.K();
        K11.j(e(c4027i));
        K11.i(c4027i.e());
        I11.j(K11.b());
        L11.k(I11.b().toByteString());
        L11.i(h(c4027i.h()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static F c(C4023e c4023e, S7.r rVar) {
        C6448d.b J11 = C6448d.J();
        C6453i.b K11 = C6453i.K();
        C6455k.b H11 = C6455k.H();
        H11.i(c4023e.j().f());
        K11.j(H11.b());
        byte[] d11 = c4023e.h().d(rVar);
        K11.i(AbstractC5903i.e(0, d11.length, d11));
        J11.i(K11.b());
        C6444B.b K12 = C6444B.K();
        K12.j(e(c4023e.j()));
        byte[] d12 = c4023e.i().d(rVar);
        K12.i(AbstractC5903i.e(0, d12.length, d12));
        J11.j(K12.b());
        return F.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", J11.b().toByteString(), E.c.SYMMETRIC, h(c4023e.j().h()), c4023e.c());
    }

    public static C4023e d(F f7, S7.r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            C6448d K11 = C6448d.K(f7.g(), C5910p.b());
            if (K11.I() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (K11.G().J() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (K11.H().J() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            C4027i.a b11 = C4027i.b();
            b11.b(K11.G().H().size());
            b11.d(K11.H().H().size());
            b11.e(K11.G().I().G());
            b11.f(K11.H().I().I());
            b11.c(g(K11.H().I().H()));
            b11.g(i(f7.e()));
            C4027i a11 = b11.a();
            C4023e.a g10 = C4023e.g();
            g10.e(a11);
            g10.b(C7307b.a(K11.G().H().n(), rVar));
            g10.c(C7307b.a(K11.H().H().n(), rVar));
            g10.d(f7.b());
            return g10.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static D e(C4027i c4027i) throws GeneralSecurityException {
        EnumC6443A enumC6443A;
        D.b J11 = D.J();
        J11.j(c4027i.g());
        C4027i.b d11 = c4027i.d();
        if (C4027i.b.f26827b.equals(d11)) {
            enumC6443A = EnumC6443A.SHA1;
        } else if (C4027i.b.f26828c.equals(d11)) {
            enumC6443A = EnumC6443A.SHA224;
        } else if (C4027i.b.f26829d.equals(d11)) {
            enumC6443A = EnumC6443A.SHA256;
        } else if (C4027i.b.f26830e.equals(d11)) {
            enumC6443A = EnumC6443A.SHA384;
        } else {
            if (!C4027i.b.f26831f.equals(d11)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + d11);
            }
            enumC6443A = EnumC6443A.SHA512;
        }
        J11.i(enumC6443A);
        return J11.b();
    }

    public static void f() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f27370a);
        a11.h(f27371b);
        a11.g(f27372c);
        a11.f(f27373d);
    }

    private static C4027i.b g(EnumC6443A enumC6443A) throws GeneralSecurityException {
        int i11 = a.f27375b[enumC6443A.ordinal()];
        if (i11 == 1) {
            return C4027i.b.f26827b;
        }
        if (i11 == 2) {
            return C4027i.b.f26828c;
        }
        if (i11 == 3) {
            return C4027i.b.f26829d;
        }
        if (i11 == 4) {
            return C4027i.b.f26830e;
        }
        if (i11 == 5) {
            return C4027i.b.f26831f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC6443A.getNumber());
    }

    private static O h(C4027i.c cVar) throws GeneralSecurityException {
        if (C4027i.c.f26833b.equals(cVar)) {
            return O.TINK;
        }
        if (C4027i.c.f26834c.equals(cVar)) {
            return O.CRUNCHY;
        }
        if (C4027i.c.f26835d.equals(cVar)) {
            return O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    private static C4027i.c i(O o11) throws GeneralSecurityException {
        int i11 = a.f27374a[o11.ordinal()];
        if (i11 == 1) {
            return C4027i.c.f26833b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4027i.c.f26834c;
        }
        if (i11 == 4) {
            return C4027i.c.f26835d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
