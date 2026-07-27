package com.applovin.impl;

import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class b7 extends w6 {
    protected b7(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private t4 b(JSONObject jSONObject) {
        Map<String, String> emptyMap;
        String str;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        s0.c(jSONObject2, this.f4351a);
        s0.b(jSONObject, this.f4351a);
        s0.a(jSONObject, this.f4351a);
        try {
            emptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            emptyMap = Collections.emptyMap();
        }
        try {
            str = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            str = "network_timeout";
        }
        return t4.a(str, emptyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        t4 b = b(jSONObject);
        a(b);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Pending reward handled: " + b);
        }
    }

    protected abstract void a(t4 t4Var);

    @Override // com.applovin.impl.w6
    protected int g() {
        return ((Integer) this.f4351a.a(c5.j1)).intValue();
    }

    protected abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    class a implements r0.e {
        a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (b7.this.h()) {
                com.applovin.impl.sdk.p pVar = b7.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    b7 b7Var = b7.this;
                    b7Var.c.b(b7Var.b, "Reward validation succeeded with code " + i + " but task was cancelled already");
                }
                com.applovin.impl.sdk.p pVar2 = b7.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    b7 b7Var2 = b7.this;
                    b7Var2.c.b(b7Var2.b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar3 = b7.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                b7 b7Var3 = b7.this;
                b7Var3.c.a(b7Var3.b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
            }
            b7.this.c(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (b7.this.h()) {
                com.applovin.impl.sdk.p pVar = b7.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    b7 b7Var = b7.this;
                    b7Var.c.b(b7Var.b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar2 = b7.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                b7 b7Var2 = b7.this;
                b7Var2.c.b(b7Var2.b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            b7.this.a(i);
        }
    }
}
