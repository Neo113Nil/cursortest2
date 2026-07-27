package sg.bigo.ads.d;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4955l;
import sg.bigo.ads.K0.I;

/* renamed from: sg.bigo.ads.d.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5058d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12722a;

    public RunnableC5058d(String str) {
        this.f12722a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArray;
        if (BigoAdSdk.d != null) {
            Iterator it = BigoAdSdk.g.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                BigoAdSdk.d.a((String) pair.first, (String) pair.second);
            }
            String str = this.f12722a;
            HashMap hashMap = new HashMap();
            if (!I.a((CharSequence) str)) {
                try {
                    jSONArray = new JSONArray(str);
                } catch (JSONException unused) {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("country", "all");
                            String optString2 = optJSONObject.optString("host", "");
                            if (AbstractC4955l.a(optString2)) {
                                hashMap.put(optString, optString2);
                            }
                        }
                    }
                }
            }
            if (!A.a(hashMap)) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    BigoAdSdk.d.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        BigoAdSdk.g.clear();
    }
}
