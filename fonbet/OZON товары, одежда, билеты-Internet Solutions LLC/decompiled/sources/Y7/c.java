package Y7;

import J0.C3354v2;
import T7.C4024f;
import X7.a;
import Y7.a;
import Y7.d;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5890i;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.q;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.internal.t;
import f8.C6465v;
import f8.E;
import j8.C7307b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final B<a, S7.d> f34756a = B.b(new C3354v2(), a.class, S7.d.class);

    /* renamed from: b, reason: collision with root package name */
    private static final C5890i f34757b = C5890i.d("type.googleapis.com/google.crypto.tink.AesSivKey", S7.d.class, E.c.SYMMETRIC, C6465v.J());

    /* renamed from: c, reason: collision with root package name */
    private static final C4024f f34758c = new C4024f();

    /* renamed from: d, reason: collision with root package name */
    private static final b f34759d = new b();

    public static i8.f a(a aVar) {
        d(aVar.i());
        return i8.f.c(aVar);
    }

    static a b(d dVar, Integer num) throws GeneralSecurityException {
        d(dVar);
        a.C0639a c0639a = new a.C0639a();
        c0639a.d(dVar);
        c0639a.b(num);
        c0639a.c(C7307b.b(dVar.c()));
        return c0639a.a();
    }

    public static void c() throws GeneralSecurityException {
        if (!a.EnumC0605a.ALGORITHM_NOT_FIPS.a()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        Z7.a.e();
        t.b().c(f34756a);
        s b11 = s.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", i.f34777a);
        d.a aVar = new d.a();
        aVar.b(64);
        aVar.c(d.b.f34766d);
        hashMap.put("AES256_SIV_RAW", aVar.a());
        b11.d(Collections.unmodifiableMap(hashMap));
        q.b().a(f34758c, d.class);
        p.c().a(f34759d, d.class);
        C5885d.d().g(f34757b);
    }

    private static void d(d dVar) throws GeneralSecurityException {
        if (dVar.c() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + dVar.c() + ". Valid keys must have 64 bytes.");
    }
}
