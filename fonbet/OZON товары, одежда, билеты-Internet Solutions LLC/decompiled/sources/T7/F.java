package T7;

import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.E;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final C5890i f26716a = C5890i.d("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", S7.a.class, E.c.SYMMETRIC, f8.M.J());

    /* renamed from: b, reason: collision with root package name */
    private static final D f26717b = new D();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<N, S7.a> f26718c = com.google.crypto.tink.internal.B.b(new E(), N.class, S7.a.class);

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        S.f();
        com.google.crypto.tink.internal.p.c().a(f26717b, O.class);
        com.google.crypto.tink.internal.t.b().c(f26718c);
        C5885d.d().g(f26716a);
    }
}
