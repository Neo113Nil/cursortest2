package U7;

import T7.C4040w;
import T7.C4043z;
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
import f8.x;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<C4043z, G> f27409a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<G> f27410b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<C4040w, F> f27411c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f27412d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27413a;

        static {
            int[] iArr = new int[O.values().length];
            f27413a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27413a[O.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27413a[O.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27413a[O.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f27409a = com.google.crypto.tink.internal.z.a(new l(), C4043z.class);
        f27410b = com.google.crypto.tink.internal.x.a(new m(), c11);
        f27411c = AbstractC5889h.a(new I1.w(), C4040w.class);
        f27412d = AbstractC5887f.a(new Pk0.a(2), c11);
    }

    public static F a(C4040w c4040w, S7.r rVar) {
        x.b H11 = f8.x.H();
        byte[] d11 = c4040w.h().d(rVar);
        H11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", H11.b().toByteString(), E.c.SYMMETRIC, f(c4040w.i().c()), c4040w.c());
    }

    public static C4040w b(F f7, S7.r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            f8.x I11 = f8.x.I(f7.g(), C5910p.b());
            if (I11.G() == 0) {
                return C4040w.g(g(f7.e()), C7307b.a(I11.F().n(), rVar), f7.b());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static G c(C4043z c4043z) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        L11.k(f8.y.E().toByteString());
        L11.i(f(c4043z.c()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static C4043z d(com.google.crypto.tink.internal.G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            f8.y.F(g10.c().K(), C5910p.b());
            return C4043z.b(g(g10.c().I()));
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e11);
        }
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f27409a);
        a11.h(f27410b);
        a11.g(f27411c);
        a11.f(f27412d);
    }

    private static O f(C4043z.a aVar) throws GeneralSecurityException {
        if (C4043z.a.f26910b.equals(aVar)) {
            return O.TINK;
        }
        if (C4043z.a.f26911c.equals(aVar)) {
            return O.CRUNCHY;
        }
        if (C4043z.a.f26912d.equals(aVar)) {
            return O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static C4043z.a g(O o11) throws GeneralSecurityException {
        int i11 = a.f27413a[o11.ordinal()];
        if (i11 == 1) {
            return C4043z.a.f26910b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4043z.a.f26911c;
        }
        if (i11 == 4) {
            return C4043z.a.f26912d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
