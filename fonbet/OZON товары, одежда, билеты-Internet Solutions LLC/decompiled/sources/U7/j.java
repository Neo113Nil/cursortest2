package U7;

import Kk.C3532b;
import T7.C4036s;
import T7.C4039v;
import T7.Z;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.C6463t;
import f8.C6464u;
import f8.E;
import f8.G;
import f8.O;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4039v, G> f27396a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<G> f27397b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<C4036s, F> f27398c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f27399d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27400a;

        static {
            int[] iArr = new int[O.values().length];
            f27400a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27400a[O.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27400a[O.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27400a[O.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f27396a = com.google.crypto.tink.internal.z.a(new K00.b(), C4039v.class);
        f27397b = com.google.crypto.tink.internal.x.a(new C3532b(), c11);
        f27398c = AbstractC5889h.a(new Z(), C4036s.class);
        f27399d = AbstractC5887f.a(new i(), c11);
    }

    public static C4039v a(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            C6464u I11 = C6464u.I(g10.c().K(), C5910p.b());
            if (I11.G() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            C4039v.a b11 = C4039v.b();
            b11.b(I11.F());
            b11.c(g(g10.c().I()));
            return b11.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e11);
        }
    }

    public static C4036s b(F f7, S7.r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            C6463t I11 = C6463t.I(f7.g(), C5910p.b());
            if (I11.G() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C4039v.a b11 = C4039v.b();
            b11.b(I11.F().size());
            b11.c(g(f7.e()));
            C4039v a11 = b11.a();
            C4036s.a g10 = C4036s.g();
            g10.d(a11);
            g10.c(C7307b.a(I11.F().n(), rVar));
            g10.b(f7.b());
            return g10.a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static F c(C4036s c4036s, S7.r rVar) {
        C6463t.b H11 = C6463t.H();
        byte[] d11 = c4036s.h().d(rVar);
        H11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", H11.b().toByteString(), E.c.SYMMETRIC, f(c4036s.i().d()), c4036s.c());
    }

    public static G d(C4039v c4039v) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        C6464u.b H11 = C6464u.H();
        H11.i(c4039v.c());
        L11.k(H11.b().toByteString());
        L11.i(f(c4039v.d()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f27396a);
        a11.h(f27397b);
        a11.g(f27398c);
        a11.f(f27399d);
    }

    private static O f(C4039v.b bVar) throws GeneralSecurityException {
        if (C4039v.b.f26898b.equals(bVar)) {
            return O.TINK;
        }
        if (C4039v.b.f26899c.equals(bVar)) {
            return O.CRUNCHY;
        }
        if (C4039v.b.f26900d.equals(bVar)) {
            return O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + bVar);
    }

    private static C4039v.b g(O o11) throws GeneralSecurityException {
        int i11 = a.f27400a[o11.ordinal()];
        if (i11 == 1) {
            return C4039v.b.f26898b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4039v.b.f26899c;
        }
        if (i11 == 4) {
            return C4039v.b.f26900d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
