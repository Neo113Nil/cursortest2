package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j9 implements vh {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f4823a;

    public j9(u2 identity) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f4823a = identity;
    }

    @Override // com.chartboost.sdk.impl.vh
    public JSONObject a() {
        i9 k = this.f4823a.k();
        JSONObject jSONObject = new JSONObject();
        String d = k.d();
        if (d != null) {
            jSONObject.put("appSetId", d);
        }
        String d2 = k.d();
        if (d2 != null) {
            jSONObject.put("app_set_id", d2);
        }
        Integer e = k.e();
        if (e != null) {
            jSONObject.put("appSetIdScope", e.intValue());
        }
        Integer e2 = k.e();
        if (e2 != null) {
            jSONObject.put("app_set_id_scope", e2.intValue());
        }
        String a2 = k.a();
        if (a2 != null) {
            jSONObject.put("ifa", a2);
        }
        String c = k.c();
        if (c != null) {
            jSONObject.put("instance_id", c);
        }
        return jSONObject;
    }
}
