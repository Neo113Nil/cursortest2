package R3;

import A1.AbstractC0021h;
import V3.C0459a;
import V3.C0460b;
import V3.C0461c;
import V3.C0462d;
import V3.C0463e;
import V3.C0464f;
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends AbstractC0021h {
    @Override // A1.AbstractC0021h
    public final AbstractC0865a b(AbstractC0865a abstractC0865a) {
        C0462d c0462d = (C0462d) abstractC0865a;
        C0459a E7 = C0460b.E();
        E7.e();
        C0460b.y((C0460b) E7.f11827b);
        byte[] a2 = W3.n.a(c0462d.A());
        C0872h t7 = AbstractC0873i.t(a2, 0, a2.length);
        E7.e();
        C0460b.z((C0460b) E7.f11827b, t7);
        C0464f B7 = c0462d.B();
        E7.e();
        C0460b.A((C0460b) E7.f11827b, B7);
        return (C0460b) E7.b();
    }

    @Override // A1.AbstractC0021h
    public final Map l() {
        HashMap hashMap = new HashMap();
        C0461c C3 = C0462d.C();
        C3.e();
        C0462d.y((C0462d) C3.f11827b);
        C0463e B7 = C0464f.B();
        B7.e();
        C0464f.y((C0464f) B7.f11827b);
        C0464f c0464f = (C0464f) B7.b();
        C3.e();
        C0462d.z((C0462d) C3.f11827b, c0464f);
        hashMap.put("AES_CMAC", new Q3.c((C0462d) C3.b(), 1));
        C0461c C7 = C0462d.C();
        C7.e();
        C0462d.y((C0462d) C7.f11827b);
        C0463e B8 = C0464f.B();
        B8.e();
        C0464f.y((C0464f) B8.f11827b);
        C0464f c0464f2 = (C0464f) B8.b();
        C7.e();
        C0462d.z((C0462d) C7.f11827b, c0464f2);
        hashMap.put("AES256_CMAC", new Q3.c((C0462d) C7.b(), 1));
        C0461c C8 = C0462d.C();
        C8.e();
        C0462d.y((C0462d) C8.f11827b);
        C0463e B9 = C0464f.B();
        B9.e();
        C0464f.y((C0464f) B9.f11827b);
        C0464f c0464f3 = (C0464f) B9.b();
        C8.e();
        C0462d.z((C0462d) C8.f11827b, c0464f3);
        hashMap.put("AES256_CMAC_RAW", new Q3.c((C0462d) C8.b(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // A1.AbstractC0021h
    public final AbstractC0865a m(AbstractC0873i abstractC0873i) {
        return C0462d.D(abstractC0873i, C0879o.a());
    }

    @Override // A1.AbstractC0021h
    public final void p(AbstractC0865a abstractC0865a) {
        C0462d c0462d = (C0462d) abstractC0865a;
        c.t(c0462d.B());
        if (c0462d.A() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
