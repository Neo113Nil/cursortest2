package com.inmobi.media;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B1 {
    public static void a(Context context, LinkedHashMap counts) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(counts, "counts");
        ConcurrentHashMap concurrentHashMap = Db.b;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Db a2 = Cb.a(applicationContext, "app_activity_counts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : counts.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            a2.a("activity_counts");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            C1 c1 = (C1) entry2.getKey();
            jSONArray.put(new JSONObject().put("network_name", c1.f6485a).put("format", c1.b).put("count", ((Number) entry2.getValue()).intValue()));
        }
        a2.a("activity_counts", jSONArray.toString(), false);
    }
}
