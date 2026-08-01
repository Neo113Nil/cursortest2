package sg.bigo.ads.d;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.d.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5063i {
    public static final ArrayList h = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final String f12726a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public C5063i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f12726a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static JSONObject a(C5063i c5063i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consent_type", c5063i.f12726a);
            jSONObject.put("last_status", c5063i.b);
            jSONObject.put("cur_status", c5063i.c);
            jSONObject.put("get_token", c5063i.d);
            jSONObject.put("tcf_applias", c5063i.e);
            jSONObject.put("tcf_purpose", c5063i.f);
            jSONObject.put("tcf_interests", c5063i.g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
