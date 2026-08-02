package J2;

import Q2.C0387u0;
import Q2.c1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f2721a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2722b;

    public k(c1 c1Var) {
        this.f2721a = c1Var;
        C0387u0 c0387u0 = c1Var.f5000m;
        this.f2722b = c0387u0 == null ? null : c0387u0.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1 c1Var = this.f2721a;
        jSONObject.put("Adapter", c1Var.f4998k);
        jSONObject.put("Latency", c1Var.f4999l);
        String str = c1Var.f5002o;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = c1Var.f5003p;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = c1Var.f5004q;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = c1Var.f5005r;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : c1Var.f5001n.keySet()) {
            jSONObject2.put(str5, c1Var.f5001n.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        b bVar = this.f2722b;
        if (bVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", bVar.o());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
