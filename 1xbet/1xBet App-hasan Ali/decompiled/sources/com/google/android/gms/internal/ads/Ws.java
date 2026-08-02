package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ws {

    /* renamed from: g, reason: collision with root package name */
    public static final Ws f12113g = new Ws();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f12114h = new Handler(Looper.getMainLooper());
    public static Handler i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final C4 f12115j = new C4(6);

    /* renamed from: k, reason: collision with root package name */
    public static final C4 f12116k = new C4(7);
    public long f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12117a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12118b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final C0802bc f12120d = new C0802bc();

    /* renamed from: c, reason: collision with root package name */
    public final C1667ur f12119c = new C1667ur(3);

    /* renamed from: e, reason: collision with root package name */
    public final Er f12121e = new Er(1, new C0905dr(27));

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(f12115j);
            i.postDelayed(f12116k, 200L);
        }
    }

    public final void a(View view, Qs qs, JSONObject jSONObject, boolean z3) {
        Object obj;
        boolean z5;
        int i5;
        if (AbstractC1668us.l(view) == null) {
            C0802bc c0802bc = this.f12120d;
            char c5 = ((HashSet) c0802bc.f12822l).contains(view) ? (char) 1 : c0802bc.f12823m ? (char) 2 : (char) 3;
            if (c5 == 3) {
                return;
            }
            JSONObject e3 = qs.e(view);
            Us.b(jSONObject, e3);
            HashMap hashMap = (HashMap) c0802bc.f12824n;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) hashMap.get(view);
                if (obj2 != null) {
                    hashMap.remove(view);
                }
                obj = obj2;
            }
            boolean z6 = false;
            if (obj != null) {
                try {
                    e3.put("adSessionId", obj);
                } catch (JSONException e5) {
                    AbstractC1668us.q("Error with setting ad session id", e5);
                }
                WeakHashMap weakHashMap = (WeakHashMap) c0802bc.f12825o;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z6 = true;
                }
                try {
                    e3.put("hasWindowFocus", Boolean.valueOf(z6));
                } catch (JSONException e6) {
                    AbstractC1668us.q("Error with setting has window focus", e6);
                }
                boolean contains = ((HashSet) c0802bc.f12830t).contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        e3.put("isPipActive", valueOf);
                    } catch (JSONException e7) {
                        AbstractC1668us.q("Error with setting is picture-in-picture active", e7);
                    }
                }
                c0802bc.f12823m = true;
                return;
            }
            HashMap hashMap2 = (HashMap) c0802bc.f12821k;
            Vs vs = (Vs) hashMap2.get(view);
            if (vs != null) {
                hashMap2.remove(view);
            }
            if (vs != null) {
                Ks ks = vs.f11962a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = vs.f11963b;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    jSONArray.put((String) arrayList.get(i6));
                }
                try {
                    e3.put("isFriendlyObstructionFor", jSONArray);
                    e3.put("friendlyObstructionClass", ks.f10275b);
                    e3.put("friendlyObstructionPurpose", ks.f10276c);
                    e3.put("friendlyObstructionReason", ks.f10277d);
                } catch (JSONException e8) {
                    AbstractC1668us.q("Error with setting friendly obstruction", e8);
                }
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = z3 || z5;
            boolean z8 = c5 == 1;
            qs.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z8) {
                    for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                        a(viewGroup.getChildAt(i7), qs, e3, z7);
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    ArrayList arrayList2 = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(hashMap3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i9 = 0;
                while (i9 < size2) {
                    ArrayList arrayList4 = (ArrayList) hashMap3.get((Float) arrayList3.get(i9));
                    int size3 = arrayList4.size();
                    int i10 = 0;
                    while (true) {
                        i5 = i9 + 1;
                        if (i10 < size3) {
                            a((View) arrayList4.get(i10), qs, e3, z7);
                            i10++;
                        }
                    }
                    i9 = i5;
                }
            }
        }
    }
}
