package T7;

import Kk.C3532b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private static final V f26774a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<U, S7.a> f26775b = com.google.crypto.tink.internal.B.b(new C3532b(), U.class, S7.a.class);

    public static void a() throws GeneralSecurityException {
        U7.y.e();
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", T.f26766g);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", T.f26767h);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", T.f26768i);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", T.f26769j);
        b11.d(Collections.unmodifiableMap(hashMap));
        com.google.crypto.tink.internal.t.b().c(f26775b);
        com.google.crypto.tink.internal.p.c().a(f26774a, X.class);
    }
}
