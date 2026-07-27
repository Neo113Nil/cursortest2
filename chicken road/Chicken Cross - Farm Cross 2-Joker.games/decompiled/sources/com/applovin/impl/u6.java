package com.applovin.impl;

import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class u6 extends w6 {
    protected u6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private JSONObject a(t4 t4Var) {
        JSONObject e = e();
        JsonUtils.putString(e, "result", t4Var.b());
        Map a2 = t4Var.a();
        if (a2 != null) {
            JsonUtils.putJSONObject(e, "params", new JSONObject(a2));
        }
        return e;
    }

    protected abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.w6
    protected int g() {
        return ((Integer) this.f4351a.a(c5.k1)).intValue();
    }

    protected abstract t4 h();

    protected abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        t4 h = h();
        if (h != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Reporting pending reward: " + h + "...");
            }
            a(a(h), new a());
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Pending reward not found");
            }
            i();
        }
    }

    class a implements r0.e {
        a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            u6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            u6.this.a(i);
        }
    }
}
