package b8;

import C.o0;
import S7.p;
import T7.C4024f;
import X7.a;
import b8.j;
import c8.C5767f;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import com.google.crypto.tink.internal.q;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.internal.t;
import f8.C6444B;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final B<g, e> f55687a = B.b(new o0(), g.class, e.class);

    /* renamed from: b, reason: collision with root package name */
    private static final B<g, p> f55688b = B.b(new Ej.b(), g.class, p.class);

    /* renamed from: c, reason: collision with root package name */
    private static final C5890i f55689c = C5890i.d("type.googleapis.com/google.crypto.tink.HmacKey", p.class, E.c.SYMMETRIC, C6444B.M());

    /* renamed from: d, reason: collision with root package name */
    private static final C4024f f55690d = new C4024f();

    /* renamed from: e, reason: collision with root package name */
    private static final h f55691e = new h();

    /* renamed from: f, reason: collision with root package name */
    private static final a.EnumC0605a f55692f = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static void a() throws GeneralSecurityException {
        a.EnumC0605a enumC0605a = f55692f;
        if (!enumC0605a.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C5767f.e();
        t.b().c(f55687a);
        t.b().c(f55688b);
        s b11 = s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", n.f55715a);
        j.a aVar = new j.a();
        aVar.c(32);
        aVar.d(16);
        j.c cVar = j.c.f55710e;
        aVar.e(cVar);
        j.b bVar = j.b.f55703d;
        aVar.b(bVar);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", aVar.a());
        j.a aVar2 = new j.a();
        aVar2.c(32);
        aVar2.d(32);
        j.c cVar2 = j.c.f55707b;
        aVar2.e(cVar2);
        aVar2.b(bVar);
        hashMap.put("HMAC_SHA256_256BITTAG", aVar2.a());
        j.a aVar3 = new j.a();
        aVar3.c(32);
        aVar3.d(32);
        aVar3.e(cVar);
        aVar3.b(bVar);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", aVar3.a());
        j.a aVar4 = new j.a();
        aVar4.c(64);
        aVar4.d(16);
        aVar4.e(cVar2);
        j.b bVar2 = j.b.f55705f;
        aVar4.b(bVar2);
        hashMap.put("HMAC_SHA512_128BITTAG", aVar4.a());
        j.a aVar5 = new j.a();
        aVar5.c(64);
        aVar5.d(16);
        aVar5.e(cVar);
        aVar5.b(bVar2);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", aVar5.a());
        j.a aVar6 = new j.a();
        aVar6.c(64);
        aVar6.d(32);
        aVar6.e(cVar2);
        aVar6.b(bVar2);
        hashMap.put("HMAC_SHA512_256BITTAG", aVar6.a());
        j.a aVar7 = new j.a();
        aVar7.c(64);
        aVar7.d(32);
        aVar7.e(cVar);
        aVar7.b(bVar2);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", aVar7.a());
        hashMap.put("HMAC_SHA512_512BITTAG", n.f55716b);
        j.a aVar8 = new j.a();
        aVar8.c(64);
        aVar8.d(64);
        aVar8.e(cVar);
        aVar8.b(bVar2);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", aVar8.a());
        b11.d(Collections.unmodifiableMap(hashMap));
        com.google.crypto.tink.internal.p.c().a(f55691e, j.class);
        q.b().a(f55690d, j.class);
        C5885d.d().h(f55689c, enumC0605a);
    }
}
