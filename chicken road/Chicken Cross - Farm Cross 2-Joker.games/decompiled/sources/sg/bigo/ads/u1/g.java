package sg.bigo.ads.u1;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.V0.m;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.c0.C5052c;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.t1.b f13339a;
    public sg.bigo.ads.v1.b b = null;
    public final i c;
    public final sg.bigo.ads.V0.a d;
    public final sg.bigo.ads.U.h e;
    public final Context f;

    public g(Context context, sg.bigo.ads.t1.b bVar, m mVar, u uVar) {
        this.f = context;
        this.c = new i(bVar);
        this.f13339a = bVar;
        this.d = mVar;
        this.e = uVar;
    }

    public static void a(g gVar) {
        int size;
        i iVar = gVar.c;
        synchronized (iVar) {
            size = iVar.b.size();
        }
        if (size >= gVar.f13339a.f13324a) {
            gVar.a();
        } else {
            gVar.b();
        }
    }

    public final void b() {
        boolean isEmpty;
        if (this.b != null) {
            return;
        }
        i iVar = this.c;
        synchronized (iVar) {
            isEmpty = iVar.b.isEmpty();
        }
        if (isEmpty) {
            return;
        }
        c cVar = new c(this);
        long j = this.f13339a.b;
        ExecutorService executorService = sg.bigo.ads.v1.c.f13361a;
        sg.bigo.ads.v1.b bVar = new sg.bigo.ads.v1.b(cVar);
        sg.bigo.ads.v1.c.b.postDelayed(bVar, j);
        this.b = bVar;
    }

    public final void a() {
        ArrayList arrayList;
        sg.bigo.ads.v1.b bVar = this.b;
        ExecutorService executorService = sg.bigo.ads.v1.c.f13361a;
        if (bVar != null) {
            bVar.b.set(true);
            Future future = bVar.c;
            if (future != null && !future.isCancelled() && !future.isDone()) {
                future.cancel(true);
            }
            sg.bigo.ads.v1.c.b.removeCallbacks(bVar);
        }
        this.b = null;
        i iVar = this.c;
        synchronized (iVar) {
            arrayList = new ArrayList(iVar.b);
            Iterator it = iVar.c.iterator();
            while (it.hasNext()) {
                arrayList.remove((C5052c) it.next());
            }
            iVar.b.clear();
            iVar.c.addAll(arrayList);
        }
        if (arrayList.isEmpty()) {
            AbstractC5496a.b("Stats", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C5052c c5052c = (C5052c) it2.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", c5052c.b);
                jSONObject.put("event_info", c5052c.c);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_events", jSONArray);
        this.d.a(hashMap, new f(this, arrayList));
    }
}
