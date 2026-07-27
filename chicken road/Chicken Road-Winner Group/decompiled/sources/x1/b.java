package x1;

import A0.j;
import a.AbstractC0086a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.plugin.editing.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s1.C1199f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f10545g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f10546h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f10547i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC1250a f10548j = new RunnableC1250a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final RunnableC1250a f10549k = new RunnableC1250a(1);
    public long f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10550a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10551b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final d f10553d = new d();

    /* renamed from: c, reason: collision with root package name */
    public final V1.b f10552c = new V1.b(17);

    /* renamed from: e, reason: collision with root package name */
    public final V1.b f10554e = new V1.b(new j(25));

    public static void b() {
        if (f10547i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10547i = handler;
            handler.post(f10548j);
            f10547i.postDelayed(f10549k, 200L);
        }
    }

    public final void a(View view, k kVar, JSONObject jSONObject, boolean z3) {
        Object obj;
        boolean z4;
        if (AbstractC0086a.a(view) == null) {
            d dVar = this.f10553d;
            char c3 = dVar.f10560d.contains(view) ? (char) 1 : dVar.f10565j ? (char) 2 : (char) 3;
            if (c3 == 3) {
                return;
            }
            JSONObject d3 = kVar.d(view);
            w1.b.c(jSONObject, d3);
            HashMap hashMap = dVar.f10557a;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                obj = (String) hashMap.get(view);
                if (obj != null) {
                    hashMap.remove(view);
                }
            }
            boolean z5 = false;
            if (obj != null) {
                try {
                    d3.put("adSessionId", obj);
                } catch (JSONException unused) {
                }
                WeakHashMap weakHashMap = dVar.f10564i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z5 = true;
                }
                try {
                    d3.put("hasWindowFocus", Boolean.valueOf(z5));
                } catch (JSONException unused2) {
                }
                boolean contains = dVar.f10563h.contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        d3.put("isPipActive", valueOf);
                    } catch (JSONException unused3) {
                    }
                }
                dVar.f10565j = true;
                return;
            }
            HashMap hashMap2 = dVar.f10558b;
            c cVar = (c) hashMap2.get(view);
            if (cVar != null) {
                hashMap2.remove(view);
            }
            if (cVar != null) {
                C1199f c1199f = cVar.f10555a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = cVar.f10556b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    d3.put("isFriendlyObstructionFor", jSONArray);
                    d3.put("friendlyObstructionClass", c1199f.f10327b);
                    d3.put("friendlyObstructionPurpose", c1199f.f10328c);
                    d3.put("friendlyObstructionReason", (Object) null);
                } catch (JSONException unused4) {
                }
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z3 || z4;
            boolean z7 = c3 == 1;
            kVar.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i3 = 0;
                if (!z7) {
                    while (i3 < viewGroup.getChildCount()) {
                        a(viewGroup.getChildAt(i3), kVar, d3, z6);
                        i3++;
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                while (i3 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i3);
                    ArrayList arrayList = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap3.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i3++;
                }
                ArrayList arrayList2 = new ArrayList(hashMap3.keySet());
                Collections.sort(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((ArrayList) hashMap3.get((Float) it2.next())).iterator();
                    while (it3.hasNext()) {
                        a((View) it3.next(), kVar, d3, z6);
                    }
                }
            }
        }
    }
}
