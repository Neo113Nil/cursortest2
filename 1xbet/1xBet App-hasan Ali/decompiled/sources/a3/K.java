package a3;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.C1392ol;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.F7;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final int f6501a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6502b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6503c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6504d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f6505e;
    public final ArrayDeque f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f6506g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final C1616tl f6507h;
    public ConcurrentHashMap i;

    public K(C1616tl c1616tl) {
        this.f6507h = c1616tl;
        A7 a7 = F7.y6;
        Q2.r rVar = Q2.r.f5053d;
        this.f6501a = ((Integer) rVar.f5056c.a(a7)).intValue();
        A7 a72 = F7.z6;
        D7 d7 = rVar.f5056c;
        this.f6502b = ((Long) d7.a(a72)).longValue();
        this.f6503c = ((Boolean) d7.a(F7.D6)).booleanValue();
        this.f6504d = ((Boolean) d7.a(F7.C6)).booleanValue();
        this.f6505e = Collections.synchronizedMap(new I(this));
    }

    public final synchronized String a(String str, C1392ol c1392ol) {
        J j5 = (J) this.f6505e.get(str);
        c1392ol.f14844a.put("request_id", str);
        if (j5 == null) {
            c1392ol.f14844a.put("mhit", "false");
            return null;
        }
        c1392ol.f14844a.put("mhit", "true");
        return j5.f6499b;
    }

    public final synchronized void b(String str, String str2, C1392ol c1392ol) {
        P2.o.f4767B.f4776j.getClass();
        this.f6505e.put(str, new J(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        h();
        f(c1392ol);
    }

    public final synchronized void c(String str) {
        this.f6505e.remove(str);
    }

    public final synchronized boolean d(int i, String str, String str2) {
        J j5 = (J) this.f6505e.get(str);
        if (j5 == null) {
            return false;
        }
        j5.f6500c.add(str2);
        return j5.f6500c.size() < i;
    }

    public final synchronized boolean e(String str, String str2) {
        J j5 = (J) this.f6505e.get(str);
        if (j5 != null) {
            if (j5.f6500c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void f(C1392ol c1392ol) {
        try {
            try {
                if (this.f6503c) {
                    ArrayDeque arrayDeque = this.f6506g;
                    ArrayDeque clone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f;
                    ArrayDeque clone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    AbstractC0613Id.f9539a.execute(new K2.e(this, c1392ol, clone, clone2, 5));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void g(C1392ol c1392ol, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c1392ol.f14844a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f6504d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(G4.d.P(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f6507h.b(this.i, false);
        }
    }

    public final synchronized void h() {
        P2.o.f4767B.f4776j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f6505e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((J) entry.getValue()).f6498a.longValue() <= this.f6502b) {
                    break;
                }
                this.f6506g.add(new Pair((String) entry.getKey(), ((J) entry.getValue()).f6499b));
                it.remove();
            }
        } catch (ConcurrentModificationException e3) {
            P2.o.f4767B.f4774g.i("QueryJsonMap.removeExpiredEntries", e3);
        }
    }
}
