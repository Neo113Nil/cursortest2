package T2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.C0552Ad;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.U5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: b, reason: collision with root package name */
    public boolean f5645b;

    /* renamed from: d, reason: collision with root package name */
    public E3.a f5647d;
    public SharedPreferences f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f5649g;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f5651j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5644a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5646c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public U5 f5648e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5650h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5652k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f5653l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f5654m = -1;

    /* renamed from: n, reason: collision with root package name */
    public C0552Ad f5655n = new C0552Ad("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f5656o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f5657p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f5658q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f5659r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f5660s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f5661t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f5662u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5663v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f5664w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f5665x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f5666y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f5667z = "";

    /* renamed from: A, reason: collision with root package name */
    public String f5640A = "{}";

    /* renamed from: B, reason: collision with root package name */
    public int f5641B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f5642C = -1;

    /* renamed from: D, reason: collision with root package name */
    public long f5643D = 0;

    public final void A(int i) {
        o();
        synchronized (this.f5644a) {
            try {
                if (this.f5659r == i) {
                    return;
                }
                this.f5659r = i;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(String str) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.O8)).booleanValue()) {
            o();
            synchronized (this.f5644a) {
                try {
                    if (this.f5667z.equals(str)) {
                        return;
                    }
                    this.f5667z = str;
                    SharedPreferences.Editor editor = this.f5649g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f5649g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void C(boolean z3) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.O8)).booleanValue()) {
            o();
            synchronized (this.f5644a) {
                try {
                    if (this.f5666y == z3) {
                        return;
                    }
                    this.f5666y = z3;
                    SharedPreferences.Editor editor = this.f5649g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z3);
                        this.f5649g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void D(String str) {
        o();
        synchronized (this.f5644a) {
            try {
                if (TextUtils.equals(this.f5664w, str)) {
                    return;
                }
                this.f5664w = str;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E(long j5) {
        o();
        synchronized (this.f5644a) {
            try {
                if (this.f5657p == j5) {
                    return;
                }
                this.f5657p = j5;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j5);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(int i) {
        o();
        synchronized (this.f5644a) {
            try {
                this.f5654m = i;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z8)).booleanValue()) {
            o();
            synchronized (this.f5644a) {
                try {
                    if (this.f5665x.equals(str)) {
                        return;
                    }
                    this.f5665x = str;
                    SharedPreferences.Editor editor = this.f5649g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f5649g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(String str) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.b9)).booleanValue()) {
            o();
            synchronized (this.f5644a) {
                try {
                    if (this.f5640A.equals(str)) {
                        return;
                    }
                    this.f5640A = str;
                    SharedPreferences.Editor editor = this.f5649g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f5649g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void d(boolean z3) {
        o();
        synchronized (this.f5644a) {
            try {
                if (z3 == this.f5652k) {
                    return;
                }
                this.f5652k = z3;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z3);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z3) {
        o();
        synchronized (this.f5644a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) Q2.r.f5053d.f5056c.a(F7.aa)).longValue();
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z3);
                    this.f5649g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, String str2, boolean z3) {
        o();
        synchronized (this.f5644a) {
            try {
                JSONArray optJSONArray = this.f5661t.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z3 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z3);
                    P2.o.f4767B.f4776j.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.f5661t.put(str, optJSONArray);
                } catch (JSONException e3) {
                    U2.j.j("Could not update native advanced settings", e3);
                }
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f5661t.toString());
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(int i) {
        o();
        synchronized (this.f5644a) {
            try {
                if (this.f5658q == i) {
                    return;
                }
                this.f5658q = i;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(int i) {
        o();
        synchronized (this.f5644a) {
            try {
                if (this.f5642C == i) {
                    return;
                }
                this.f5642C = i;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(long j5) {
        o();
        synchronized (this.f5644a) {
            try {
                if (this.f5643D == j5) {
                    return;
                }
                this.f5643D = j5;
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j5);
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(String str) {
        o();
        synchronized (this.f5644a) {
            try {
                this.f5653l = str;
                if (this.f5649g != null) {
                    if (str.equals("-1")) {
                        this.f5649g.remove("IABTCF_TCString");
                    } else {
                        this.f5649g.putString("IABTCF_TCString", str);
                    }
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z3;
        o();
        synchronized (this.f5644a) {
            z3 = this.f5662u;
        }
        return z3;
    }

    public final boolean l() {
        boolean z3;
        o();
        synchronized (this.f5644a) {
            z3 = this.f5663v;
        }
        return z3;
    }

    public final boolean m() {
        boolean z3;
        o();
        synchronized (this.f5644a) {
            z3 = this.f5666y;
        }
        return z3;
    }

    public final boolean n() {
        boolean z3;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8929y0)).booleanValue()) {
            return false;
        }
        o();
        synchronized (this.f5644a) {
            z3 = this.f5652k;
        }
        return z3;
    }

    public final void o() {
        E3.a aVar = this.f5647d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f5647d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            U2.j.j("Interrupted while waiting for preferences loaded.", e3);
        } catch (CancellationException e5) {
            e = e5;
            U2.j.g("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e6) {
            e = e6;
            U2.j.g("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e7) {
            e = e7;
            U2.j.g("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void p() {
        AbstractC0613Id.f9539a.execute(new A0.C(10, this));
    }

    public final int q() {
        int i;
        o();
        synchronized (this.f5644a) {
            i = this.f5658q;
        }
        return i;
    }

    public final long r() {
        long j5;
        o();
        synchronized (this.f5644a) {
            j5 = this.f5656o;
        }
        return j5;
    }

    public final long s() {
        long j5;
        o();
        synchronized (this.f5644a) {
            j5 = this.f5657p;
        }
        return j5;
    }

    public final C0552Ad t() {
        C0552Ad c0552Ad;
        o();
        synchronized (this.f5644a) {
            try {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.kb)).booleanValue() && this.f5655n.a()) {
                    ArrayList arrayList = this.f5646c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
                c0552Ad = this.f5655n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0552Ad;
    }

    public final String u() {
        String str;
        o();
        synchronized (this.f5644a) {
            str = this.f5664w;
        }
        return str;
    }

    public final String v() {
        String str;
        o();
        synchronized (this.f5644a) {
            str = this.f5665x;
        }
        return str;
    }

    public final String w() {
        String str;
        o();
        synchronized (this.f5644a) {
            str = this.f5640A;
        }
        return str;
    }

    public final JSONObject x() {
        JSONObject jSONObject;
        o();
        synchronized (this.f5644a) {
            jSONObject = this.f5661t;
        }
        return jSONObject;
    }

    public final void y(Context context) {
        synchronized (this.f5644a) {
            try {
                if (this.f != null) {
                    return;
                }
                this.f5647d = AbstractC0613Id.f9539a.b(new D3.h(12, this, context, false));
                this.f5645b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z() {
        o();
        synchronized (this.f5644a) {
            try {
                this.f5661t = new JSONObject();
                SharedPreferences.Editor editor = this.f5649g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f5649g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
