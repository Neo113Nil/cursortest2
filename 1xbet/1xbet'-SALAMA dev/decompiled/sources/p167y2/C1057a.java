package p167y2;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1057a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1057a f18147d;

    public C1057a(int i7, String str, String str2, C1057a c1057a) {
        this.f18144a = i7;
        this.f18145b = str;
        this.f18146c = str2;
        this.f18147d = c1057a;
    }

    public int a() {
        return this.f18144a;
    }

    public final zze b() {
        C1057a c1057a = this.f18147d;
        return new zze(this.f18144a, this.f18145b, this.f18146c, c1057a == null ? null : new zze(c1057a.f18144a, c1057a.f18145b, c1057a.f18146c, null, null), null);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f18144a);
        jSONObject.put("Message", this.f18145b);
        jSONObject.put("Domain", this.f18146c);
        C1057a c1057a = this.f18147d;
        if (c1057a == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", c1057a.c());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
