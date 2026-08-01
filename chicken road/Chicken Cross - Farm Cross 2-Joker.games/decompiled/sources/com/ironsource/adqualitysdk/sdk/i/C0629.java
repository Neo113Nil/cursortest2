package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ږ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0629 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f1723 = new HashMap();

    public C0629(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            this.f1723.put(AbstractC1212.m5923(str), (AbstractC0411) hashMap.get(str));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0629.class != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.f1723;
        HashMap hashMap2 = ((C0629) obj).f1723;
        return hashMap != null ? hashMap.equals(hashMap2) : hashMap2 == null;
    }

    public final int hashCode() {
        HashMap hashMap = this.f1723;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        if (this.f1723.isEmpty()) {
            return StringFog.decrypt("sHU=\n", "ywiEB/G3kBA=\n");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("UMo=\n", "K+rLfwhotug=\n"));
        boolean z = true;
        for (String str : this.f1723.keySet()) {
            if (!z) {
                sb.append(StringFog.decrypt("QgI=\n", "biIHPgNCplc=\n"));
            }
            sb.append(StringFog.decrypt("9g==\n", "1Lm2/rJcDuk=\n"));
            sb.append(str);
            sb.append(StringFog.decrypt("1YxR\n", "97ZxXb6iW2w=\n"));
            sb.append(this.f1723.get(str));
            z = false;
        }
        sb.append(StringFog.decrypt("SMQ=\n", "aLlPITUFRLg=\n"));
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f1723.keySet()) {
            C1192 m5426 = ((AbstractC0411) this.f1723.get(str)).m5426(c1074, c1226);
            try {
                jSONObject.put(str, m5426.f3386);
            } catch (JSONException unused) {
                new C0364(c1226, c1074, AbstractC0548.m5514("/G4yvwX2KKH8\n", "3AhdzSWdTdg=\n", new StringBuilder().append(StringFog.decrypt("xsFG8pDmiXv3x13zheaQbezdFOuDqo97ow==\n", "g7M0neLG+h4=\n")).append(m5426.f3386), str), null).m5536(c1226.m5929());
            }
        }
        return new C1192(jSONObject);
    }
}
