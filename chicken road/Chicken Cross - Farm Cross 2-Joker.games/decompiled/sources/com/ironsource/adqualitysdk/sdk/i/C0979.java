package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵙ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0979 extends AbstractC0981 {
    public C0979(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112) {
        super(abstractC0411, abstractC04112);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        Object obj;
        C1192 m5426 = this.f2896.m5426(c1074, c1226);
        try {
            obj = this.f2897.m5426(c1074, c1226).f3386;
        } catch (Exception e) {
            new C0364(c1226, c1074, AbstractC1257.m5940("dw==\n", "UJlMEvTJdvY=\n", new StringBuilder().append(StringFog.decrypt("eDRd/IUiJbJcKlryg2suox01WvGEYTKtTTIP9JJ2YKFFNl32hHEpq1NmCA==\n", "PUYvk/cCQMQ=\n")).append(this)), e).m5536(c1226.m5929());
        }
        if (obj instanceof JSONObject) {
            return new C1192(((JSONObject) obj).opt((String) m5426.f3386));
        }
        if (obj instanceof JSONArray) {
            return new C1192(((JSONArray) obj).opt(m5426.m5917().intValue()));
        }
        if (obj instanceof Map) {
            return new C1192(((Map) obj).get(m5426.f3386));
        }
        if (obj instanceof List) {
            return new C1192(((List) obj).get(m5426.m5917().intValue()));
        }
        if (obj.getClass().isArray()) {
            return new C1192(((Object[]) obj)[m5426.m5917().intValue()]);
        }
        new C0364(c1226, c1074, StringFog.decrypt("CGct1f5jMO0seSrb+Co7/G1mKtj/ICfyPWF/3ek3df41ZS3f/zA89CM1eA==\n", "TRVfuoxDVZs=\n") + this + StringFog.decrypt("H5R4zl1wfkNfjizVD3xkSBj1BZpAZzdMVo4t1Fx8Z11X3CzfSyl4T1LLO84P\n", "OK5Yui8JFy0=\n") + obj, null).m5536(c1226.m5929());
        return new C1192(null);
    }
}
