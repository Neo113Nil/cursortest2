package io.flutter.view;

import R5.C0418n;
import android.hardware.display.DisplayManager;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.SentryLogEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w1.AbstractC1706i0;
import w1.B0;
import w1.C1749u0;
import w1.C1764z0;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static r f14348e;

    /* renamed from: f, reason: collision with root package name */
    public static C0418n f14349f;

    /* renamed from: a, reason: collision with root package name */
    public long f14350a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14351b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14352c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14353d;

    public static void g(HashMap hashMap, HashMap hashMap2, C1764z0 c1764z0, boolean z4) {
        for (Map.Entry entry : hashMap.entrySet()) {
            C1764z0 c1764z02 = (C1764z0) entry.getKey();
            if (c1764z0 == null || c1764z0 == c1764z02) {
                Map map = (Map) entry.getValue();
                if (z4) {
                    map = new HashMap(map);
                }
                hashMap2.put(c1764z02, map);
            }
        }
    }

    public static void h(HashMap hashMap, HashMap hashMap2, boolean z4, boolean z7) {
        SparseArray sparseArray;
        for (Map.Entry entry : hashMap.entrySet()) {
            C1764z0 c1764z0 = (C1764z0) entry.getKey();
            if (z4) {
                SparseArray sparseArray2 = (SparseArray) entry.getValue();
                sparseArray = new SparseArray(sparseArray2.size());
                for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                    B0 b02 = (B0) sparseArray2.valueAt(i7);
                    int i8 = b02.f17284b;
                    if (z7) {
                        B0 b03 = new B0();
                        b03.f17286d = new HashMap();
                        b03.f17283a = b02.f17283a;
                        b03.f17284b = b02.f17284b;
                        b03.f17285c = b02.f17285c;
                        b03.f17286d = new HashMap(b02.f17286d);
                        b02 = b03;
                    }
                    sparseArray.put(i8, b02);
                }
            } else {
                sparseArray = (SparseArray) entry.getValue();
            }
            hashMap2.put(c1764z0, sparseArray);
        }
    }

    public static r p(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f14348e == null) {
            r rVar = new r();
            rVar.f14350a = -1L;
            rVar.f14352c = new q(rVar, 0L);
            rVar.f14353d = new a(rVar);
            rVar.f14351b = flutterJNI;
            f14348e = rVar;
        }
        if (f14349f == null) {
            r rVar2 = f14348e;
            Objects.requireNonNull(rVar2);
            C0418n c0418n = new C0418n(rVar2, displayManager, 1);
            f14349f = c0418n;
            displayManager.registerDisplayListener(c0418n, null);
        }
        if (f14348e.f14350a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f14348e.f14350a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f14348e;
    }

    public synchronized ArrayList a(HashMap hashMap) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (SparseArray sparseArray : hashMap.values()) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                arrayList.add((B0) sparseArray.valueAt(i7));
            }
        }
        return arrayList;
    }

    public JSONObject b(HashMap hashMap, HashMap hashMap2, boolean z4) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList a2 = a(hashMap);
            if (z4) {
                Collections.sort(a2);
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                B0 b02 = (B0) it.next();
                Map map = (Map) hashMap2.get(b02.f17283a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", b02.f17284b);
                jSONObject2.put("version", b02.f17285c);
                jSONObject2.put("document", b02.f17283a.f17943a);
                JSONArray jSONArray2 = new JSONArray();
                HashMap hashMap3 = b02.f17286d;
                Iterator it2 = (z4 ? new TreeMap(hashMap3).entrySet() : hashMap3.entrySet()).iterator();
                while (it2.hasNext()) {
                    String str2 = (String) ((Map.Entry) it2.next()).getKey();
                    C1749u0 c1749u0 = (C1749u0) map.get(str2);
                    if (c1749u0 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("name", str2);
                            int i7 = c1749u0.f17878a;
                            if (i7 == 1) {
                                str = "string";
                            } else if (i7 == 2) {
                                str = "localizedString";
                            } else {
                                if (i7 != 3) {
                                    throw null;
                                }
                                str = "tombstone";
                            }
                            jSONObject3.put("type", str);
                            jSONObject3.put("value", c1749u0.f17879b);
                        } catch (JSONException e7) {
                            AbstractC1706i0.r("Error to create JSON object.", e7);
                            jSONObject3 = null;
                        }
                        jSONArray2.put(jSONObject3);
                    }
                }
                jSONObject2.put(SentryLogEvents.JsonKeys.ITEMS, jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("variants", jSONArray);
            try {
                jSONObject.put("refreshInSeconds", this.f14350a);
                return jSONObject;
            } catch (JSONException e8) {
                e = e8;
                AbstractC1706i0.r("Error to create JSON object.", e);
                return null;
            }
        } catch (JSONException e9) {
            e = e9;
            AbstractC1706i0.r("Error to create JSON object.", e);
            return null;
        }
    }

    public synchronized void c(ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                d(arrayList, (HashMap) this.f14351b);
                l(arrayList);
            }
        }
    }

    public synchronized void d(ArrayList arrayList, HashMap hashMap) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b02 = (B0) it.next();
                int i7 = b02.f17284b;
                C1764z0 c1764z0 = b02.f17283a;
                SparseArray sparseArray = (SparseArray) hashMap.get(c1764z0);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    hashMap.put(c1764z0, sparseArray);
                } else {
                    B0 b03 = (B0) sparseArray.get(i7);
                    if (b03 != null) {
                        for (Map.Entry entry : b03.f17286d.entrySet()) {
                            String str = (String) entry.getKey();
                            HashMap hashMap2 = b02.f17286d;
                            if (!hashMap2.containsKey(str)) {
                                hashMap2.put(str, (C1749u0) entry.getValue());
                            }
                        }
                    }
                }
                sparseArray.put(i7, b02);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        try {
            HashMap hashMap3 = new HashMap();
            h(hashMap, hashMap3, true, false);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b02 = (B0) it.next();
                SparseArray sparseArray = (SparseArray) hashMap3.get(b02.f17283a);
                if (sparseArray != null) {
                    sparseArray.remove(b02.f17284b);
                }
            }
            for (Map.Entry entry : hashMap3.entrySet()) {
                C1764z0 c1764z0 = (C1764z0) entry.getKey();
                SparseArray sparseArray2 = (SparseArray) entry.getValue();
                SparseArray sparseArray3 = (SparseArray) hashMap.get(c1764z0);
                Map map = (Map) hashMap2.get(c1764z0);
                for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                    B0 b03 = (B0) sparseArray2.valueAt(i7);
                    sparseArray3.remove(b03.f17284b);
                    Iterator it2 = b03.f17286d.keySet().iterator();
                    while (it2.hasNext()) {
                        map.remove((String) it2.next());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f(ArrayList arrayList, boolean z4) {
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            o();
            return;
        }
        if (z4) {
            o();
            d(arrayList, (HashMap) this.f14351b);
            i(arrayList, (HashMap) this.f14353d);
            return;
        }
        HashMap hashMap = new HashMap();
        h((HashMap) this.f14351b, hashMap, true, true);
        HashMap hashMap2 = new HashMap();
        g((HashMap) this.f14353d, hashMap2, null, true);
        e(arrayList, hashMap, hashMap2);
        d(arrayList, hashMap);
        i(arrayList, hashMap2);
        AbstractC1706i0.o(3, "Verify ETag merged JSON: ".concat(String.valueOf(b(hashMap, hashMap2, true))));
        h(hashMap, (HashMap) this.f14351b, false, false);
        g(hashMap2, (HashMap) this.f14353d, null, false);
    }

    public synchronized void i(ArrayList arrayList, HashMap hashMap) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b02 = (B0) it.next();
                C1764z0 c1764z0 = b02.f17283a;
                Map map = (Map) hashMap.get(c1764z0);
                if (map == null) {
                    map = new HashMap();
                    hashMap.put(c1764z0, map);
                }
                for (Map.Entry entry : b02.f17286d.entrySet()) {
                    String str = (String) entry.getKey();
                    C1749u0 c1749u0 = (C1749u0) entry.getValue();
                    if (c1749u0.f17878a == 3) {
                        map.remove(str);
                    } else {
                        map.put(str, c1749u0);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean j(ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        if (arrayList.size() != n()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B0 b02 = (B0) it.next();
            C1764z0 c1764z0 = b02.f17283a;
            if (c1764z0 != C1764z0.f17942d) {
                return true;
            }
            SparseArray sparseArray = (SparseArray) ((HashMap) this.f14351b).get(c1764z0);
            if (sparseArray == null) {
                return true;
            }
            B0 b03 = (B0) sparseArray.get(b02.f17284b);
            if (b03 == null) {
                return true;
            }
            if (b02.f17285c != b03.f17285c) {
                return true;
            }
        }
        return false;
    }

    public synchronized String k() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            int i7 = 0;
            for (SparseArray sparseArray : ((HashMap) this.f14351b).values()) {
                i7 += sparseArray.size();
                for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                    B0 b02 = (B0) sparseArray.valueAt(i8);
                    sb.append("," + b02.f17284b);
                    sb.append("," + b02.f17285c);
                }
            }
            sb.insert(0, i7);
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public synchronized void l(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b02 = (B0) it.next();
                C1764z0 c1764z0 = b02.f17283a;
                Map map = (Map) ((HashMap) this.f14352c).get(c1764z0);
                if (map == null) {
                    map = new HashMap();
                    ((HashMap) this.f14352c).put(c1764z0, map);
                }
                Map map2 = (Map) ((HashMap) this.f14353d).get(c1764z0);
                if (map2 == null) {
                    map2 = new HashMap();
                    ((HashMap) this.f14353d).put(c1764z0, map2);
                }
                for (Map.Entry entry : b02.f17286d.entrySet()) {
                    String str = (String) entry.getKey();
                    C1749u0 c1749u0 = (C1749u0) entry.getValue();
                    map.put(str, c1749u0);
                    map2.put(str, c1749u0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList m() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) this.f14351b).entrySet()) {
            if (((SparseArray) entry.getValue()).size() > 0) {
                arrayList.add((C1764z0) entry.getKey());
            }
        }
        return arrayList;
    }

    public synchronized int n() {
        int i7;
        Iterator it = ((HashMap) this.f14351b).values().iterator();
        i7 = 0;
        while (it.hasNext()) {
            i7 += ((SparseArray) it.next()).size();
        }
        return i7;
    }

    public synchronized void o() {
        this.f14351b = new HashMap();
        this.f14353d = new HashMap();
        for (C1764z0 c1764z0 : C1764z0.f17940b.values()) {
            ((HashMap) this.f14351b).put(c1764z0, new SparseArray());
            ((HashMap) this.f14353d).put(c1764z0, new HashMap());
        }
    }
}
