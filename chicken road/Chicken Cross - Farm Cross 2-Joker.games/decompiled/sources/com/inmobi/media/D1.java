package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class D1 {
    public static Map a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray optJSONArray2 = jSONObject.optJSONArray(com.ironsource.L6.E1);
        if (optJSONArray2 == null) {
            return MapsKt.emptyMap();
        }
        int length = optJSONArray2.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i);
            if (optJSONObject2 != null) {
                String optString = optJSONObject2.optString("nn");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                String obj = StringsKt.trim((CharSequence) optString).toString();
                if (obj.length() != 0 && (optJSONObject = optJSONObject2.optJSONObject("activities")) != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Intrinsics.checkNotNull(next);
                        String obj2 = StringsKt.trim((CharSequence) next).toString();
                        if (obj2.length() != 0 && (optJSONArray = optJSONObject.optJSONArray(next)) != null) {
                            int length2 = optJSONArray.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                String optString2 = optJSONArray.optString(i2);
                                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                                String obj3 = StringsKt.trim((CharSequence) optString2).toString();
                                if (obj3.length() != 0) {
                                    C1 c1 = new C1(obj, obj2);
                                    Object obj4 = linkedHashMap.get(obj3);
                                    if (obj4 == null) {
                                        obj4 = new ArrayList();
                                        linkedHashMap.put(obj3, obj4);
                                    }
                                    List list = (List) obj4;
                                    if (!list.contains(c1)) {
                                        list.add(c1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
