package T7;

import T7.c0;
import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<Y, S7.a> f26785a = com.google.crypto.tink.internal.B.b(new Z(), Y.class, S7.a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C5890i f26786b = C5890i.d("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", S7.a.class, E.c.SYMMETRIC, f8.U.J());

    /* renamed from: c, reason: collision with root package name */
    private static final C4024f f26787c = new C4024f();

    /* renamed from: d, reason: collision with root package name */
    private static final a0 f26788d = new a0();

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        U7.A.e();
        com.google.crypto.tink.internal.t.b().c(f26785a);
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", c0.b(c0.a.f26790b));
        hashMap.put("XCHACHA20_POLY1305_RAW", c0.b(c0.a.f26792d));
        b11.d(Collections.unmodifiableMap(hashMap));
        com.google.crypto.tink.internal.p.c().a(f26788d, c0.class);
        com.google.crypto.tink.internal.q.b().a(f26787c, c0.class);
        C5885d.d().g(f26786b);
    }
}
