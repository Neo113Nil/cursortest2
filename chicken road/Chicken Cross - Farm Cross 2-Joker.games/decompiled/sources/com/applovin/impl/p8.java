package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class p8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4373a;
    private final String b;
    private final List c;

    public p8(JSONObject jSONObject) {
        this.f4373a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f4373a;
    }

    public String b() {
        return this.b;
    }

    public List c() {
        return this.c;
    }
}
