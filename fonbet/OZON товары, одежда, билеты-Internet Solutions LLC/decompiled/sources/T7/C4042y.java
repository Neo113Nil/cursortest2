package T7;

import T7.C4043z;
import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: T7.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4042y {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4040w, S7.a> f26906a = com.google.crypto.tink.internal.B.b(new Ep.a(), C4040w.class, S7.a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C4041x f26907b = new C4041x();

    /* renamed from: c, reason: collision with root package name */
    private static final C5890i f26908c = C5890i.d("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", S7.a.class, E.c.SYMMETRIC, f8.x.J());

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        U7.n.e();
        com.google.crypto.tink.internal.t.b().c(f26906a);
        com.google.crypto.tink.internal.p.c().a(f26907b, C4043z.class);
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", C4043z.b(C4043z.a.f26910b));
        hashMap.put("CHACHA20_POLY1305_RAW", C4043z.b(C4043z.a.f26912d));
        b11.d(Collections.unmodifiableMap(hashMap));
        C5885d.d().g(f26908c);
    }
}
