package sg.bigo.ads.h1;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.c0.C5051b;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final r f12969a;
    public final sg.bigo.ads.V0.a b;
    public final long c;
    public final Context d;
    public sg.bigo.ads.i1.b e = null;
    public final u f;

    public p(r rVar, sg.bigo.ads.V0.a aVar, u uVar, Context context, long j) {
        this.f = uVar;
        this.d = context;
        this.c = j;
        this.f12969a = rVar;
        this.b = aVar;
    }

    public void a() {
        boolean isEmpty;
        r rVar = this.f12969a;
        synchronized (rVar) {
            isEmpty = rVar.b.isEmpty();
        }
        if (isEmpty) {
            return;
        }
        c();
    }

    public final void b() {
        ArrayList arrayList;
        r rVar = this.f12969a;
        if (rVar == null) {
            AbstractC5496a.b("Callback", "sendEventsRightNow but EventStorage null!!");
            return;
        }
        synchronized (rVar) {
            arrayList = new ArrayList(rVar.b);
            Iterator it = rVar.c.iterator();
            while (it.hasNext()) {
                arrayList.remove((C5051b) it.next());
            }
            rVar.b.clear();
            rVar.c.addAll(arrayList);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sg.bigo.ads.i1.c.a(this.e);
        this.e = null;
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                jSONArray.put(new JSONObject(((C5051b) it2.next()).c));
            } catch (JSONException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("events", jSONArray);
        this.b.a(hashMap, new n(this, arrayList));
    }

    public final void c() {
        if (this.e != null) {
            return;
        }
        o oVar = new o(this);
        long j = this.c;
        ExecutorService executorService = sg.bigo.ads.i1.c.f12995a;
        sg.bigo.ads.i1.b bVar = new sg.bigo.ads.i1.b(oVar);
        sg.bigo.ads.i1.c.b.postDelayed(bVar, j);
        this.e = bVar;
    }
}
