package Z7;

import Am.C2438a;
import S7.r;
import T7.P;
import U7.c;
import Y7.a;
import Y7.d;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.u;
import com.google.crypto.tink.internal.x;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.C6465v;
import f8.E;
import f8.G;
import f8.O;
import f8.w;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final z<d, G> f35679a;

    /* renamed from: b, reason: collision with root package name */
    private static final x<G> f35680b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5889h<Y7.a, F> f35681c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5887f<F> f35682d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<d.b, O> f35683e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<O, d.b> f35684f;

    static {
        C7306a c11 = M.c("type.googleapis.com/google.crypto.tink.AesSivKey");
        f35679a = z.a(new c(), d.class);
        f35680b = x.a(new C2438a(), c11);
        f35681c = AbstractC5889h.a(new U7.d(), Y7.a.class);
        f35682d = AbstractC5887f.a(new P(4), c11);
        HashMap hashMap = new HashMap();
        d.b bVar = d.b.f34766d;
        O o11 = O.RAW;
        hashMap.put(bVar, o11);
        d.b bVar2 = d.b.f34764b;
        O o12 = O.TINK;
        hashMap.put(bVar2, o12);
        d.b bVar3 = d.b.f34765c;
        O o13 = O.CRUNCHY;
        hashMap.put(bVar3, o13);
        f35683e = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(O.class);
        enumMap.put((EnumMap) o11, (O) bVar);
        enumMap.put((EnumMap) o12, (O) bVar2);
        enumMap.put((EnumMap) o13, (O) bVar3);
        enumMap.put((EnumMap) O.LEGACY, (O) bVar3);
        f35684f = Collections.unmodifiableMap(enumMap);
    }

    public static Y7.a a(F f7, r rVar) {
        if (!f7.f().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            C6465v I11 = C6465v.I(f7.g(), C5910p.b());
            if (I11.G() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            d.a b11 = d.b();
            b11.b(I11.F().size());
            b11.c(g(f7.e()));
            d a11 = b11.a();
            a.C0639a g10 = Y7.a.g();
            g10.d(a11);
            g10.c(C7307b.a(I11.F().n(), rVar));
            g10.b(f7.b());
            return g10.a();
        } catch (A unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    public static d b(G g10) {
        if (!g10.c().J().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + g10.c().J());
        }
        try {
            w I11 = w.I(g10.c().K(), C5910p.b());
            if (I11.G() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            d.a b11 = d.b();
            b11.b(I11.F());
            b11.c(g(g10.c().I()));
            return b11.a();
        } catch (A e11) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e11);
        }
    }

    public static F c(Y7.a aVar, r rVar) {
        C6465v.b H11 = C6465v.H();
        byte[] d11 = aVar.h().d(rVar);
        H11.i(AbstractC5903i.e(0, d11.length, d11));
        return F.a("type.googleapis.com/google.crypto.tink.AesSivKey", H11.b().toByteString(), E.c.SYMMETRIC, f(aVar.i().d()), aVar.c());
    }

    public static G d(d dVar) {
        G.b L11 = f8.G.L();
        L11.j("type.googleapis.com/google.crypto.tink.AesSivKey");
        w.b H11 = w.H();
        H11.i(dVar.c());
        L11.k(H11.b().toByteString());
        L11.i(f(dVar.d()));
        return com.google.crypto.tink.internal.G.b(L11.b());
    }

    public static void e() throws GeneralSecurityException {
        u a11 = u.a();
        a11.i(f35679a);
        a11.h(f35680b);
        a11.g(f35681c);
        a11.f(f35682d);
    }

    private static O f(d.b bVar) throws GeneralSecurityException {
        Map<d.b, O> map = f35683e;
        if (map.containsKey(bVar)) {
            return map.get(bVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + bVar);
    }

    private static d.b g(O o11) throws GeneralSecurityException {
        Map<O, d.b> map = f35684f;
        if (map.containsKey(o11)) {
            return map.get(o11);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + o11.getNumber());
    }
}
