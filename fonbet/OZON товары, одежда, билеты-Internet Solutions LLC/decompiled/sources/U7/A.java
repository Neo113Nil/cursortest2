package U7;

import C.o0;
import Gl.C3124a;
import I0.C3173b;
import T7.Y;
import T7.c0;
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
import f8.U;
import f8.V;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.z<c0, G> f27365a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.x<G> f27366b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<Y, F> f27367c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f27368d;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27369a;

        static {
            int[] iArr = new int[O.values().length];
            f27369a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27369a[O.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27369a[O.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27369a[O.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f27365a = com.google.crypto.tink.internal.z.a(new H00.a(), c0.class);
        f27366b = com.google.crypto.tink.internal.x.a(new C3173b(), c11);
        f27367c = AbstractC5889h.a(new C3124a(), Y.class);
        f27368d = AbstractC5887f.a(new o0(), c11);
    }

    public static F a(Y y11, S7.r rVar) {
        U.b H11 = U.H();
        byte[] d11 = y11.h().d(rVar);
        H11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", H11.b().toByteString(), E.c.SYMMETRIC, f(y11.i().c()), y11.c());
    }

    public static c0 b(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + g10.c().J());
        }
        try {
            if (V.G(g10.c().K(), C5910p.b()).F() == 0) {
                return c0.b(g(g10.c().I()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A e11) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e11);
        }
    }

    public static Y c(F f7, S7.r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            U I11 = U.I(f7.g(), C5910p.b());
            if (I11.G() == 0) {
                return Y.g(g(f7.e()), C7307b.a(I11.F().n(), rVar), f7.b());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static G d(c0 c0Var) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        L11.k(V.E().toByteString());
        L11.i(f(c0Var.c()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.u a11 = com.google.crypto.tink.internal.u.a();
        a11.i(f27365a);
        a11.h(f27366b);
        a11.g(f27367c);
        a11.f(f27368d);
    }

    private static O f(c0.a aVar) throws GeneralSecurityException {
        if (c0.a.f26790b.equals(aVar)) {
            return O.TINK;
        }
        if (c0.a.f26791c.equals(aVar)) {
            return O.CRUNCHY;
        }
        if (c0.a.f26792d.equals(aVar)) {
            return O.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    private static c0.a g(O o11) throws GeneralSecurityException {
        int i11 = a.f27369a[o11.ordinal()];
        if (i11 == 1) {
            return c0.a.f26790b;
        }
        if (i11 == 2 || i11 == 3) {
            return c0.a.f26791c;
        }
        if (i11 == 4) {
            return c0.a.f26792d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
