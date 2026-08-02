package T7;

import N3.C3660k;
import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.E;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<G, S7.a> f26708a = com.google.crypto.tink.internal.B.b(new C3660k(), G.class, S7.a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C5890i f26709b = C5890i.d("type.googleapis.com/google.crypto.tink.KmsAeadKey", S7.a.class, E.c.REMOTE, f8.K.J());

    /* renamed from: c, reason: collision with root package name */
    private static final A f26710c = new A();

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        M.e();
        com.google.crypto.tink.internal.t.b().c(f26708a);
        com.google.crypto.tink.internal.p.c().a(f26710c, H.class);
        C5885d.d().g(f26709b);
    }
}
