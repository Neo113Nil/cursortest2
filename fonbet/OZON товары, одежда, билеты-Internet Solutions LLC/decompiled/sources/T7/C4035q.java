package T7;

import T7.r;
import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: T7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4035q {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4033o, S7.a> f26866a = com.google.crypto.tink.internal.B.b(new Sh.b(), C4033o.class, S7.a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C5890i f26867b = C5890i.d("type.googleapis.com/google.crypto.tink.AesGcmKey", S7.a.class, E.c.SYMMETRIC, f8.r.J());

    /* renamed from: c, reason: collision with root package name */
    private static final C4024f f26868c = new C4024f();

    /* renamed from: d, reason: collision with root package name */
    private static final C4034p f26869d = new C4034p();

    /* renamed from: e, reason: collision with root package name */
    private static final a.EnumC0605a f26870e = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static void a() throws GeneralSecurityException {
        a.EnumC0605a enumC0605a = f26870e;
        if (!enumC0605a.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        U7.g.e();
        com.google.crypto.tink.internal.t.b().c(f26866a);
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", T.f26760a);
        r.a aVar = new r.a();
        aVar.b();
        aVar.c(16);
        aVar.d();
        r.b bVar = r.b.f26881d;
        aVar.e(bVar);
        hashMap.put("AES128_GCM_RAW", aVar.a());
        hashMap.put("AES256_GCM", T.f26761b);
        r.a aVar2 = new r.a();
        aVar2.b();
        aVar2.c(32);
        aVar2.d();
        aVar2.e(bVar);
        hashMap.put("AES256_GCM_RAW", aVar2.a());
        b11.d(Collections.unmodifiableMap(hashMap));
        com.google.crypto.tink.internal.q.b().a(f26868c, r.class);
        com.google.crypto.tink.internal.p.c().a(f26869d, r.class);
        C5885d.d().h(f26867b, enumC0605a);
    }
}
