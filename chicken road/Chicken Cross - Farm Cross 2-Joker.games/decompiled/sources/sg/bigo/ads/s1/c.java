package sg.bigo.ads.s1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.c0.C5052c;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13305a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ d c;

    public c(d dVar, String str, AbstractMap abstractMap) {
        this.c = dVar;
        this.f13305a = str;
        this.b = abstractMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C5052c a2 = new sg.bigo.ads.u1.a(this.b, this.f13305a).a(this.c.d, 0L);
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", a2.b);
            jSONObject.put("event_info", a2.c);
            jSONArray.put(jSONObject);
            hashMap.put("sdk_events", jSONArray);
            sg.bigo.ads.V0.a aVar = a.b.f13303a;
            if (aVar != null) {
                aVar.a(hashMap, null);
            }
        } catch (JSONException unused) {
        }
    }
}
