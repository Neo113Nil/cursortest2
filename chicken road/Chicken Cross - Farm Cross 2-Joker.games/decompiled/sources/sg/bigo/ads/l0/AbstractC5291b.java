package sg.bigo.ads.l0;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.P.n;

/* renamed from: sg.bigo.ads.l0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5291b {

    /* renamed from: a, reason: collision with root package name */
    public static Locale f13054a;

    public static HashMap a(n nVar, boolean z, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject(nVar.h);
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject3.optString(next, ""));
            }
            jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_PRIVACY, z ? "1" : "0");
            jSONObject2.put("style_id", String.valueOf(nVar.j));
        } catch (Exception unused) {
        }
        hashMap.put("extra", jSONObject2);
        hashMap.put("form_qa", jSONObject);
        hashMap.put("form_id", Long.valueOf(nVar.f12486a));
        hashMap.put("timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        return hashMap;
    }

    public static String a(Context context, int i) {
        CharSequence a2 = AbstractC4944a.a(context, i, f13054a);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }
}
