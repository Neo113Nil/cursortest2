package T7;

import T7.C4032n;
import X7.a;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import f8.C6456l;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: T7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4031m {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C4028j, S7.a> f26844a = com.google.crypto.tink.internal.B.b(new C4029k(), C4028j.class, S7.a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C5890i f26845b = C5890i.d("type.googleapis.com/google.crypto.tink.AesEaxKey", S7.a.class, E.c.SYMMETRIC, C6456l.L());

    /* renamed from: c, reason: collision with root package name */
    private static final C4030l f26846c = new C4030l();

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        U7.e.f();
        com.google.crypto.tink.internal.t.b().c(f26844a);
        com.google.crypto.tink.internal.s b11 = com.google.crypto.tink.internal.s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", T.f26762c);
        C4032n.a aVar = new C4032n.a();
        aVar.b(16);
        aVar.c(16);
        aVar.d();
        C4032n.b bVar = C4032n.b.f26857d;
        aVar.e(bVar);
        hashMap.put("AES128_EAX_RAW", aVar.a());
        hashMap.put("AES256_EAX", T.f26763d);
        C4032n.a aVar2 = new C4032n.a();
        aVar2.b(16);
        aVar2.c(32);
        aVar2.d();
        aVar2.e(bVar);
        hashMap.put("AES256_EAX_RAW", aVar2.a());
        b11.d(Collections.unmodifiableMap(hashMap));
        com.google.crypto.tink.internal.p.c().a(f26846c, C4032n.class);
        C5885d.d().g(f26845b);
    }
}
