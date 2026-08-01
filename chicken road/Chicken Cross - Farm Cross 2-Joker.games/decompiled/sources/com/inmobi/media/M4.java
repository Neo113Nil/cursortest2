package com.inmobi.media;

import com.ironsource.C4761z5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class M4 extends AbstractC3790ia {
    public final String b;
    public final List c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(String url, String accountId, List configRequestContexts, boolean z) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
        this.b = accountId;
        this.c = configRequestContexts;
        this.d = z;
    }

    public final Mf a() {
        List<N4> list = this.c;
        JSONArray jSONArray = new JSONArray();
        for (N4 n4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4761z5.q, n4.b.getType());
            jSONObject.put("t", n4.b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.b);
        linkedHashMap.put("p", jSONArray2);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject b = AbstractC4263z7.b();
        if (b != null) {
            String jSONObject2 = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject2);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(U1.d);
        linkedHashMap.putAll(Y5.f6965a.a(false));
        linkedHashMap.putAll(AbstractC3704f9.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) U1.e));
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Li.a((HashMap) linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.d) {
            linkedHashMap2.put("rip", "true");
        }
        return new Mf(this.f7160a, linkedHashMap2, null, new B7(linkedHashMap), null, 52);
    }
}
