package y2;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final zzv f18172a;

    /* renamed from: b, reason: collision with root package name */
    public final C1797a f18173b;

    public k(zzv zzvVar) {
        this.f18172a = zzvVar;
        zze zzeVar = zzvVar.f10786c;
        this.f18173b = zzeVar == null ? null : zzeVar.j();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        zzv zzvVar = this.f18172a;
        jSONObject.put("Adapter", zzvVar.f10784a);
        jSONObject.put("Latency", zzvVar.f10785b);
        String str = zzvVar.f10788e;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = zzvVar.f10789f;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = zzvVar.f10790x;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = zzvVar.f10791y;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : zzvVar.f10787d.keySet()) {
            jSONObject2.put(str5, zzvVar.f10787d.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        C1797a c1797a = this.f18173b;
        if (c1797a == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", c1797a.c());
        }
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
