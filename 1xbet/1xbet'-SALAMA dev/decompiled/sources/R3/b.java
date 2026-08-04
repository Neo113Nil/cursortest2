package R3;

import A1.AbstractC0021h;
import V3.C0459a;
import V3.C0460b;
import V3.C0461c;
import V3.C0462d;
import V3.C0463e;
import V3.C0464f;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC0021h {
    @Override // A1.AbstractC0021h
    public final AbstractC0821a b(AbstractC0821a abstractC0821a) {
        C0462d c0462d = (C0462d) abstractC0821a;
        C0459a c0459aE = C0460b.E();
        c0459aE.e();
        C0460b.y((C0460b) c0459aE.f11827b);
        byte[] bArrA = W3.n.a(c0462d.A());
        C0828h c0828hT = AbstractC0829i.t(bArrA, 0, bArrA.length);
        c0459aE.e();
        C0460b.z((C0460b) c0459aE.f11827b, c0828hT);
        C0464f c0464fB = c0462d.B();
        c0459aE.e();
        C0460b.A((C0460b) c0459aE.f11827b, c0464fB);
        return (C0460b) c0459aE.b();
    }

    @Override // A1.AbstractC0021h
    public final Map l() {
        HashMap map = new HashMap();
        C0461c c0461cC = C0462d.C();
        c0461cC.e();
        C0462d.y((C0462d) c0461cC.f11827b);
        C0463e c0463eB = C0464f.B();
        c0463eB.e();
        C0464f.y((C0464f) c0463eB.f11827b);
        C0464f c0464f = (C0464f) c0463eB.b();
        c0461cC.e();
        C0462d.z((C0462d) c0461cC.f11827b, c0464f);
        map.put("AES_CMAC", new Q3.c((C0462d) c0461cC.b(), 1));
        C0461c c0461cC2 = C0462d.C();
        c0461cC2.e();
        C0462d.y((C0462d) c0461cC2.f11827b);
        C0463e c0463eB2 = C0464f.B();
        c0463eB2.e();
        C0464f.y((C0464f) c0463eB2.f11827b);
        C0464f c0464f2 = (C0464f) c0463eB2.b();
        c0461cC2.e();
        C0462d.z((C0462d) c0461cC2.f11827b, c0464f2);
        map.put("AES256_CMAC", new Q3.c((C0462d) c0461cC2.b(), 1));
        C0461c c0461cC3 = C0462d.C();
        c0461cC3.e();
        C0462d.y((C0462d) c0461cC3.f11827b);
        C0463e c0463eB3 = C0464f.B();
        c0463eB3.e();
        C0464f.y((C0464f) c0463eB3.f11827b);
        C0464f c0464f3 = (C0464f) c0463eB3.b();
        c0461cC3.e();
        C0462d.z((C0462d) c0461cC3.f11827b, c0464f3);
        map.put("AES256_CMAC_RAW", new Q3.c((C0462d) c0461cC3.b(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // A1.AbstractC0021h
    public final AbstractC0821a m(AbstractC0829i abstractC0829i) {
        return C0462d.D(abstractC0829i, C0835o.a());
    }

    @Override // A1.AbstractC0021h
    public final void p(AbstractC0821a abstractC0821a) throws GeneralSecurityException {
        C0462d c0462d = (C0462d) abstractC0821a;
        c.t(c0462d.B());
        if (c0462d.A() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
