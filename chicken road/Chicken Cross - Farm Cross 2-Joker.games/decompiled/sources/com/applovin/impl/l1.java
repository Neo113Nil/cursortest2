package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4278a;
    private final String b;
    private final boolean c;

    l1(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f4278a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.c = t7.a(list);
        } else {
            this.c = t7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f4278a;
    }

    public boolean c() {
        return this.c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || t7.a(str2, str) != 1) {
            return str3 == null || t7.a(str3, str) != -1;
        }
        return false;
    }
}
