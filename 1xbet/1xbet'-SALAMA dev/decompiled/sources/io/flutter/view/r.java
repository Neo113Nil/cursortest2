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
import p155w1.AbstractC0997i0;
import p155w1.B0;
import p155w1.C1040u0;
import p155w1.C1055z0;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static r f14354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C0418n f14355f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14359d;

    public static void g(HashMap map, HashMap map2, C1055z0 c1055z0, boolean z4) {
        for (Map.Entry entry : map.entrySet()) {
            C1055z0 c1055z1 = (C1055z0) entry.getKey();
            if (c1055z0 == null || c1055z0 == c1055z1) {
                Map map3 = (Map) entry.getValue();
                if (z4) {
                    map3 = new HashMap(map3);
                }
                map2.put(c1055z1, map3);
            }
        }
    }

    public static void h(HashMap map, HashMap map2, boolean z4, boolean z7) {
        SparseArray sparseArray;
        for (Map.Entry entry : map.entrySet()) {
            C1055z0 c1055z0 = (C1055z0) entry.getKey();
            if (z4) {
                SparseArray sparseArray2 = (SparseArray) entry.getValue();
                sparseArray = new SparseArray(sparseArray2.size());
                for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                    B0 b7 = (B0) sparseArray2.valueAt(i7);
                    int i8 = b7.f17290b;
                    if (z7) {
                        B0 b8 = new B0();
                        b8.f17292d = new HashMap();
                        b8.f17289a = b7.f17289a;
                        b8.f17290b = b7.f17290b;
                        b8.f17291c = b7.f17291c;
                        b8.f17292d = new HashMap(b7.f17292d);
                        b7 = b8;
                    }
                    sparseArray.put(i8, b7);
                }
            } else {
                sparseArray = (SparseArray) entry.getValue();
            }
            map2.put(c1055z0, sparseArray);
        }
    }

    public static r p(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f14354e == null) {
            r rVar = new r();
            rVar.f14356a = -1L;
            rVar.f14358c = new q(rVar, 0L);
            rVar.f14359d = new a(rVar);
            rVar.f14357b = flutterJNI;
            f14354e = rVar;
        }
        if (f14355f == null) {
            r rVar2 = f14354e;
            Objects.requireNonNull(rVar2);
            C0418n c0418n = new C0418n(rVar2, displayManager, 1);
            f14355f = c0418n;
            displayManager.registerDisplayListener(c0418n, null);
        }
        if (f14354e.f14356a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f14354e.f14356a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f14354e;
    }

    public synchronized ArrayList a(HashMap map) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (SparseArray sparseArray : map.values()) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                arrayList.add((B0) sparseArray.valueAt(i7));
            }
        }
        return arrayList;
    }

    public JSONObject b(HashMap map, HashMap map2, boolean z4) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<B0> arrayListA = a(map);
            if (z4) {
                Collections.sort(arrayListA);
            }
            for (B0 b7 : arrayListA) {
                Map map3 = (Map) map2.get(b7.f17289a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", b7.f17290b);
                jSONObject2.put("version", b7.f17291c);
                jSONObject2.put("document", b7.f17289a.f17949a);
                JSONArray jSONArray2 = new JSONArray();
                HashMap map4 = b7.f17292d;
                Iterator it = (z4 ? new TreeMap(map4).entrySet() : map4.entrySet()).iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((Map.Entry) it.next()).getKey();
                    C1040u0 c1040u0 = (C1040u0) map3.get(str2);
                    if (c1040u0 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("name", str2);
                            int i7 = c1040u0.f17884a;
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
                            jSONObject3.put("value", c1040u0.f17885b);
                        } catch (JSONException e7) {
                            AbstractC0997i0.r("Error to create JSON object.", e7);
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
                jSONObject.put("refreshInSeconds", this.f14356a);
                return jSONObject;
            } catch (JSONException e8) {
                e = e8;
                AbstractC0997i0.r("Error to create JSON object.", e);
                return null;
            }
        } catch (JSONException e9) {
            e = e9;
            AbstractC0997i0.r("Error to create JSON object.", e);
            return null;
        }
    }

    public synchronized void c(ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                d(arrayList, (HashMap) this.f14357b);
                l(arrayList);
            }
        }
    }

    public synchronized void d(ArrayList arrayList, HashMap map) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b7 = (B0) it.next();
                int i7 = b7.f17290b;
                C1055z0 c1055z0 = b7.f17289a;
                SparseArray sparseArray = (SparseArray) map.get(c1055z0);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    map.put(c1055z0, sparseArray);
                } else {
                    B0 b8 = (B0) sparseArray.get(i7);
                    if (b8 != null) {
                        for (Map.Entry entry : b8.f17292d.entrySet()) {
                            String str = (String) entry.getKey();
                            HashMap map2 = b7.f17292d;
                            if (!map2.containsKey(str)) {
                                map2.put(str, (C1040u0) entry.getValue());
                            }
                        }
                    }
                }
                sparseArray.put(i7, b7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(ArrayList arrayList, HashMap map, HashMap map2) {
        try {
            HashMap map3 = new HashMap();
            h(map, map3, true, false);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b7 = (B0) it.next();
                SparseArray sparseArray = (SparseArray) map3.get(b7.f17289a);
                if (sparseArray != null) {
                    sparseArray.remove(b7.f17290b);
                }
            }
            for (Map.Entry entry : map3.entrySet()) {
                C1055z0 c1055z0 = (C1055z0) entry.getKey();
                SparseArray sparseArray2 = (SparseArray) entry.getValue();
                SparseArray sparseArray3 = (SparseArray) map.get(c1055z0);
                Map map4 = (Map) map2.get(c1055z0);
                for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
                    B0 b8 = (B0) sparseArray2.valueAt(i7);
                    sparseArray3.remove(b8.f17290b);
                    Iterator it2 = b8.f17292d.keySet().iterator();
                    while (it2.hasNext()) {
                        map4.remove((String) it2.next());
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
            d(arrayList, (HashMap) this.f14357b);
            i(arrayList, (HashMap) this.f14359d);
            return;
        }
        HashMap map = new HashMap();
        h((HashMap) this.f14357b, map, true, true);
        HashMap map2 = new HashMap();
        g((HashMap) this.f14359d, map2, null, true);
        e(arrayList, map, map2);
        d(arrayList, map);
        i(arrayList, map2);
        AbstractC0997i0.o(3, "Verify ETag merged JSON: ".concat(String.valueOf(b(map, map2, true))));
        h(map, (HashMap) this.f14357b, false, false);
        g(map2, (HashMap) this.f14359d, null, false);
    }

    public synchronized void i(ArrayList arrayList, HashMap map) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b7 = (B0) it.next();
                C1055z0 c1055z0 = b7.f17289a;
                Map map2 = (Map) map.get(c1055z0);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(c1055z0, map2);
                }
                for (Map.Entry entry : b7.f17292d.entrySet()) {
                    String str = (String) entry.getKey();
                    C1040u0 c1040u0 = (C1040u0) entry.getValue();
                    if (c1040u0.f17884a == 3) {
                        map2.remove(str);
                    } else {
                        map2.put(str, c1040u0);
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
            B0 b7 = (B0) it.next();
            C1055z0 c1055z0 = b7.f17289a;
            if (c1055z0 != C1055z0.f17948d) {
                return true;
            }
            SparseArray sparseArray = (SparseArray) ((HashMap) this.f14357b).get(c1055z0);
            if (sparseArray == null) {
                return true;
            }
            B0 b8 = (B0) sparseArray.get(b7.f17290b);
            if (b8 == null) {
                return true;
            }
            if (b7.f17291c != b8.f17291c) {
                return true;
            }
        }
        return false;
    }

    public synchronized String k() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            int size = 0;
            for (SparseArray sparseArray : ((HashMap) this.f14357b).values()) {
                size += sparseArray.size();
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    B0 b7 = (B0) sparseArray.valueAt(i7);
                    sb.append("," + b7.f17290b);
                    sb.append("," + b7.f17291c);
                }
            }
            sb.insert(0, size);
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public synchronized void l(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B0 b7 = (B0) it.next();
                C1055z0 c1055z0 = b7.f17289a;
                Map map = (Map) ((HashMap) this.f14358c).get(c1055z0);
                if (map == null) {
                    map = new HashMap();
                    ((HashMap) this.f14358c).put(c1055z0, map);
                }
                Map map2 = (Map) ((HashMap) this.f14359d).get(c1055z0);
                if (map2 == null) {
                    map2 = new HashMap();
                    ((HashMap) this.f14359d).put(c1055z0, map2);
                }
                for (Map.Entry entry : b7.f17292d.entrySet()) {
                    String str = (String) entry.getKey();
                    C1040u0 c1040u0 = (C1040u0) entry.getValue();
                    map.put(str, c1040u0);
                    map2.put(str, c1040u0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList m() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) this.f14357b).entrySet()) {
            if (((SparseArray) entry.getValue()).size() > 0) {
                arrayList.add((C1055z0) entry.getKey());
            }
        }
        return arrayList;
    }

    public synchronized int n() {
        int size;
        Iterator it = ((HashMap) this.f14357b).values().iterator();
        size = 0;
        while (it.hasNext()) {
            size += ((SparseArray) it.next()).size();
        }
        return size;
    }

    public synchronized void o() {
        this.f14357b = new HashMap();
        this.f14359d = new HashMap();
        for (C1055z0 c1055z0 : C1055z0.f17946b.values()) {
            ((HashMap) this.f14357b).put(c1055z0, new SparseArray());
            ((HashMap) this.f14359d).put(c1055z0, new HashMap());
        }
    }
}
