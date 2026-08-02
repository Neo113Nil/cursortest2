package T7;

import T7.C4039v;
import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.C6463t;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: T7.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4038u {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4036s, S7.a> f26890a = com.google.crypto.tink.internal.B.b(new Ql.c(), C4036s.class, S7.a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C4037t f26891b = new C4037t();

    /* renamed from: c, reason: collision with root package name */
    private static final C4024f f26892c = new C4024f();

    /* renamed from: d, reason: collision with root package name */
    private static final C5890i f26893d = C5890i.d("type.googleapis.com/google.crypto.tink.AesGcmSivKey", S7.a.class, E.c.SYMMETRIC, C6463t.J());

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        U7.j.e();
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        C4039v.a aVar = new C4039v.a();
        aVar.b(16);
        C4039v.b bVar = C4039v.b.f26898b;
        aVar.c(bVar);
        hashMap.put("AES128_GCM_SIV", aVar.a());
        C4039v.a aVar2 = new C4039v.a();
        aVar2.b(16);
        C4039v.b bVar2 = C4039v.b.f26900d;
        aVar2.c(bVar2);
        hashMap.put("AES128_GCM_SIV_RAW", aVar2.a());
        C4039v.a aVar3 = new C4039v.a();
        aVar3.b(32);
        aVar3.c(bVar);
        hashMap.put("AES256_GCM_SIV", aVar3.a());
        C4039v.a aVar4 = new C4039v.a();
        aVar4.b(32);
        aVar4.c(bVar2);
        hashMap.put("AES256_GCM_SIV_RAW", aVar4.a());
        b11.d(Collections.unmodifiableMap(hashMap));
        com.google.crypto.tink.internal.q.b().a(f26892c, C4039v.class);
        com.google.crypto.tink.internal.p.c().a(f26891b, C4039v.class);
        com.google.crypto.tink.internal.t.b().c(f26890a);
        C5885d.d().g(f26893d);
    }
}
