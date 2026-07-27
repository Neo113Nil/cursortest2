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
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.g1.a f12961a;
    public sg.bigo.ads.i1.b b = null;
    public final h c;
    public final sg.bigo.ads.V0.a d;
    public final sg.bigo.ads.U.h e;
    public final Context f;

    public f(Context context, sg.bigo.ads.g1.a aVar, sg.bigo.ads.V0.c cVar, sg.bigo.ads.X0.u uVar) {
        this.f = context;
        this.c = new h(aVar);
        this.f12961a = aVar;
        this.d = cVar;
        this.e = uVar;
    }

    public static void a(f fVar) {
        int size;
        h hVar = fVar.c;
        synchronized (hVar) {
            size = hVar.b.size();
        }
        if (size >= fVar.f12961a.f12797a) {
            fVar.a();
        } else {
            if (fVar.c.a()) {
                return;
            }
            fVar.b();
        }
    }

    public final void b() {
        if (this.b != null) {
            return;
        }
        b bVar = new b(this);
        long j = this.f12961a.b;
        ExecutorService executorService = sg.bigo.ads.i1.c.f12995a;
        sg.bigo.ads.i1.b bVar2 = new sg.bigo.ads.i1.b(bVar);
        sg.bigo.ads.i1.c.b.postDelayed(bVar2, j);
        this.b = bVar2;
    }

    public final void a() {
        ArrayList arrayList;
        sg.bigo.ads.i1.c.a(this.b);
        this.b = null;
        h hVar = this.c;
        synchronized (hVar) {
            arrayList = new ArrayList(hVar.b);
            Iterator it = hVar.c.iterator();
            while (it.hasNext()) {
                arrayList.remove((C5051b) it.next());
            }
            hVar.b.clear();
            hVar.c.addAll(arrayList);
        }
        if (arrayList.isEmpty()) {
            AbstractC5496a.b("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
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
        this.d.a(hashMap, new e(this, arrayList));
    }
}
