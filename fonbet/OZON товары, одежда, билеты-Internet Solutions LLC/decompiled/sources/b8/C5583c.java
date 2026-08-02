package b8;

import Gl.C3124a;
import I0.C3173b;
import S7.p;
import X7.a;
import b8.C5584d;
import c8.C5762a;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.internal.t;
import f8.C6445a;
import f8.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: b8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5583c {

    /* renamed from: a, reason: collision with root package name */
    private static final C5582b f55663a = new C5582b();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C5581a, e> f55664b = B.b(new C3173b(), C5581a.class, e.class);

    /* renamed from: c, reason: collision with root package name */
    private static final B<C5581a, p> f55665c = B.b(new C3124a(), C5581a.class, p.class);

    /* renamed from: d, reason: collision with root package name */
    private static final C5890i f55666d = C5890i.d("type.googleapis.com/google.crypto.tink.AesCmacKey", p.class, E.c.SYMMETRIC, C6445a.L());

    public static void a() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        C5762a.e();
        com.google.crypto.tink.internal.p.c().a(f55663a, C5584d.class);
        t.b().c(f55664b);
        t.b().c(f55665c);
        s b11 = s.b();
        HashMap hashMap = new HashMap();
        C5584d c5584d = n.f55717c;
        hashMap.put("AES_CMAC", c5584d);
        hashMap.put("AES256_CMAC", c5584d);
        C5584d.a aVar = new C5584d.a();
        aVar.b(32);
        aVar.c(16);
        aVar.d(C5584d.b.f55676e);
        hashMap.put("AES256_CMAC_RAW", aVar.a());
        b11.d(Collections.unmodifiableMap(hashMap));
        C5885d.d().g(f55666d);
    }
}
