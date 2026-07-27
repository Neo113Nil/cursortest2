package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class f4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4201a;
    private final String b;

    public f4(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f4201a = JsonUtils.getString(jSONObject, "id", "");
        this.b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f4201a;
    }

    public String b() {
        return this.b;
    }
}
