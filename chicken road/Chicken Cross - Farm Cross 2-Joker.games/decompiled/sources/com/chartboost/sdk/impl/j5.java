package com.chartboost.sdk.impl;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j5 implements vh {
    @Override // com.chartboost.sdk.impl.vh
    public JSONObject a() {
        String b = d4.b.b();
        String c = e7.f4748a.c();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", b);
        jSONObject.put("app_version", c);
        jSONObject.put("load-id", uuid);
        jSONObject.put("load_id", uuid);
        jSONObject.put("sdk", "Chartboost-Android-SDK");
        jSONObject.put("sdk_version", "9.13.0");
        return jSONObject;
    }
}
