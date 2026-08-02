package y2;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1797a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18140c;

    /* renamed from: d, reason: collision with root package name */
    public final C1797a f18141d;

    public C1797a(int i7, String str, String str2, C1797a c1797a) {
        this.f18138a = i7;
        this.f18139b = str;
        this.f18140c = str2;
        this.f18141d = c1797a;
    }

    public int a() {
        return this.f18138a;
    }

    public final zze b() {
        C1797a c1797a = this.f18141d;
        return new zze(this.f18138a, this.f18139b, this.f18140c, c1797a == null ? null : new zze(c1797a.f18138a, c1797a.f18139b, c1797a.f18140c, null, null), null);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f18138a);
        jSONObject.put("Message", this.f18139b);
        jSONObject.put("Domain", this.f18140c);
        C1797a c1797a = this.f18141d;
        if (c1797a == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", c1797a.c());
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
