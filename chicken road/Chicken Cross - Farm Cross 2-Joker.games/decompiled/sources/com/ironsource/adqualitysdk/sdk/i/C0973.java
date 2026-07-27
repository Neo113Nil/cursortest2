package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0973 extends AbstractC0981 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0411 f2879;

    public C0973(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112, AbstractC0411 abstractC04113) {
        super(abstractC0411, abstractC04112);
        this.f2879 = abstractC04113;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0981
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0973.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        AbstractC0411 abstractC0411 = this.f2879;
        AbstractC0411 abstractC04112 = ((C0973) obj).f2879;
        return abstractC0411 != null ? abstractC0411.equals(abstractC04112) : abstractC04112 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0981
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        AbstractC0411 abstractC0411 = this.f2879;
        return hashCode + (abstractC0411 != null ? abstractC0411.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0981
    public final String toString() {
        return super.toString() + StringFog.decrypt("PrmX\n", "HoS3Oc7Sbb4=\n") + this.f2879.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        C1192 m5426 = this.f2896.m5426(c1074, c1226);
        C1192 m54262 = this.f2879.m5426(c1074, c1226);
        try {
            Object obj = this.f2897.m5426(c1074, c1226).f3386;
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put((String) m5426.f3386, m54262.f3386);
            } else if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(m5426.m5917().intValue(), m54262.f3386);
            } else if (obj instanceof Map) {
                ((Map) obj).put(m5426.f3386, m54262.f3386);
            } else if (obj instanceof List) {
                ((List) obj).set(m5426.m5917().intValue(), m54262.f3386);
            } else if (obj.getClass().isArray()) {
                ((Object[]) obj)[m5426.m5917().intValue()] = m54262.f3386;
            } else {
                new C0364(c1226, c1074, StringFog.decrypt("97AY4f98Dv7Trh/v+TUF75KxH+z+PxnhwrZK/vgoS+3Kshjr/i8C59ziTQ==\n", "ssJqjo1ca4g=\n") + this + StringFog.decrypt("8Pdk/ftGrh2w7TDmqUq0FveWGanmUecSue0x5/pKtwO4vzDs7R+oEb2oJ/2p\n", "181EiYk/x3M=\n") + obj, null).m5536(c1226.m5929());
            }
        } catch (Exception e) {
            new C0364(c1226, c1074, AbstractC1257.m5940("OQ==\n", "Hg3J7fbjiQE=\n", new StringBuilder().append(StringFog.decrypt("9hWjumPZ5DnSC6S0ZZDvKJMUpLdimvMmwxPxpWSNoSrLF6OwYoroIN1H9g==\n", "s2fR1RH5gU8=\n")).append(this)), e).m5536(c1226.m5929());
        }
        return m54262;
    }
}
