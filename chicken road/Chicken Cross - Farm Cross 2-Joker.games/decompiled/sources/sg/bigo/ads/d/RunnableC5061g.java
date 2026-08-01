package sg.bigo.ads.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: sg.bigo.ads.d.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5061g implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = C5063i.h;
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = C5063i.h.iterator();
        while (it.hasNext()) {
            jSONArray.put(C5063i.a((C5063i) it.next()));
        }
        hashMap.put("user_consent_event", jSONArray.toString());
        hashMap.put("uuid", sg.bigo.ads.F0.a.e());
        sg.bigo.ads.s1.b.a(hashMap);
        C5063i.h.clear();
    }
}
