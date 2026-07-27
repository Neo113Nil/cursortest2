package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922w2 {
    public static void a(C0554hm c0554hm, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                    String optString = optJSONObject2.optString("key", null);
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject2.optString("value", null);
                        arrayList.add(new Pair(optString, optString2 != null ? new C0844t2(optString2) : null));
                    }
                }
            }
            c0554hm.f7454s = new C0870u2(arrayList);
        }
    }
}
