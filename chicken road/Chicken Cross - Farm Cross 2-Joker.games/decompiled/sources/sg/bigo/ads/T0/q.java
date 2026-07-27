package sg.bigo.ads.T0;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.K0.z;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12558a;

    public q(JSONObject jSONObject) {
        this.f12558a = jSONObject;
    }

    public final q a(HashMap hashMap) {
        try {
            q qVar = new q(new JSONObject(this.f12558a.toString()));
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getValue();
                String str2 = (String) entry.getKey();
                JSONObject optJSONObject = this.f12558a.optJSONObject(str);
                if (optJSONObject != null) {
                    qVar.f12558a.put(str2, optJSONObject);
                }
                qVar.f12558a.remove(str);
                this.f12558a.remove(str);
            }
            return qVar;
        } catch (Exception unused) {
            return this;
        }
    }

    public final int b(String str) {
        Integer a2 = z.a(a(str));
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }

    public final String toString() {
        return this.f12558a.toString();
    }

    public final Object a(String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return null;
        }
        JSONObject jSONObject = this.f12558a;
        for (int i = 0; i < split.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(split[i]);
            if (jSONObject == null) {
                return null;
            }
        }
        return jSONObject.opt(split[split.length - 1]);
    }
}
