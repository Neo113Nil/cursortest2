package T7;

import T7.C4027i;
import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.C6448d;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: T7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4026h {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4023e, S7.a> f26810a = com.google.crypto.tink.internal.B.b(new Ek.a(), C4023e.class, S7.a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C5890i f26811b = C5890i.d("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", S7.a.class, E.c.SYMMETRIC, C6448d.L());

    /* renamed from: c, reason: collision with root package name */
    private static final C4024f f26812c = new C4024f();

    /* renamed from: d, reason: collision with root package name */
    private static final C4025g f26813d = new C4025g();

    /* renamed from: e, reason: collision with root package name */
    private static final a.EnumC0605a f26814e = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static void a() throws GeneralSecurityException {
        a.EnumC0605a enumC0605a = f26814e;
        if (!enumC0605a.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        U7.b.f();
        com.google.crypto.tink.internal.t.b().c(f26810a);
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", T.f26764e);
        C4027i.a aVar = new C4027i.a();
        aVar.b(16);
        aVar.d(32);
        aVar.f(16);
        aVar.e(16);
        C4027i.b bVar = C4027i.b.f26829d;
        aVar.c(bVar);
        C4027i.c cVar = C4027i.c.f26835d;
        aVar.g(cVar);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", aVar.a());
        hashMap.put("AES256_CTR_HMAC_SHA256", T.f26765f);
        C4027i.a aVar2 = new C4027i.a();
        aVar2.b(32);
        aVar2.d(32);
        aVar2.f(32);
        aVar2.e(16);
        aVar2.c(bVar);
        aVar2.g(cVar);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", aVar2.a());
        b11.d(Collections.unmodifiableMap(hashMap));
        com.google.crypto.tink.internal.q.b().a(f26812c, C4027i.class);
        com.google.crypto.tink.internal.p.c().a(f26813d, C4027i.class);
        C5885d.d().h(f26811b, enumC0605a);
    }
}
