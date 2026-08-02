package I2;

import C0.RunnableC0085d;
import D6.y0;
import F2.C0254t;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzayw;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class M implements L {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3552b;

    /* renamed from: d, reason: collision with root package name */
    public I3.b f3554d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f3556f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f3557g;

    /* renamed from: i, reason: collision with root package name */
    public String f3559i;
    public String j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3551a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3553c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public zzayw f3555e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3558h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3560k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f3561l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f3562m = -1;

    /* renamed from: n, reason: collision with root package name */
    public zzbyk f3563n = new zzbyk("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f3564o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f3565p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f3566q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f3567r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f3568s = Collections.emptySet();

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f3569t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f3570u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3571v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f3572w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f3573x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f3574y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f3575z = "";

    /* renamed from: A, reason: collision with root package name */
    public String f3547A = "{}";

    /* renamed from: B, reason: collision with root package name */
    public int f3548B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f3549C = -1;

    /* renamed from: D, reason: collision with root package name */
    public long f3550D = 0;

    public final void a(int i7) {
        l();
        synchronized (this.f3551a) {
            try {
                this.f3562m = i7;
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    if (i7 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i7);
                    }
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjw)).booleanValue()) {
            l();
            synchronized (this.f3551a) {
                try {
                    if (this.f3547A.equals(str)) {
                        return;
                    }
                    this.f3547A = str;
                    SharedPreferences.Editor editor = this.f3557g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f3557g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(boolean z4) {
        l();
        synchronized (this.f3551a) {
            try {
                if (z4 == this.f3560k) {
                    return;
                }
                this.f3560k = z4;
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z4);
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(boolean z4) {
        l();
        synchronized (this.f3551a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzkw)).longValue();
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z4);
                    this.f3557g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str, String str2, boolean z4) {
        l();
        synchronized (this.f3551a) {
            try {
                JSONArray optJSONArray = this.f3569t.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z4 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i7;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z4);
                    E2.o.f1952C.j.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.f3569t.put(str, optJSONArray);
                } catch (JSONException e7) {
                    int i8 = J.f3546b;
                    J2.j.h("Could not update native advanced settings", e7);
                }
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f3569t.toString());
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i7) {
        l();
        synchronized (this.f3551a) {
            try {
                if (this.f3549C == i7) {
                    return;
                }
                this.f3549C = i7;
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i7);
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(long j) {
        l();
        synchronized (this.f3551a) {
            try {
                if (this.f3550D == j) {
                    return;
                }
                this.f3550D = j;
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(String str) {
        l();
        synchronized (this.f3551a) {
            try {
                this.f3561l = str;
                if (this.f3557g != null) {
                    if (str.equals("-1")) {
                        this.f3557g.remove("IABTCF_TCString");
                    } else {
                        this.f3557g.putString("IABTCF_TCString", str);
                    }
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        boolean z4;
        l();
        synchronized (this.f3551a) {
            z4 = this.f3570u;
        }
        return z4;
    }

    public final boolean j() {
        boolean z4;
        l();
        synchronized (this.f3551a) {
            z4 = this.f3571v;
        }
        return z4;
    }

    public final boolean k() {
        boolean z4;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaK)).booleanValue()) {
            return false;
        }
        l();
        synchronized (this.f3551a) {
            z4 = this.f3560k;
        }
        return z4;
    }

    public final void l() {
        I3.b bVar = this.f3554d;
        if (bVar == null || bVar.isDone()) {
            return;
        }
        try {
            this.f3554d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            int i7 = J.f3546b;
            J2.j.h("Interrupted while waiting for preferences loaded.", e7);
        } catch (CancellationException e8) {
            e = e8;
            int i8 = J.f3546b;
            J2.j.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e9) {
            e = e9;
            int i82 = J.f3546b;
            J2.j.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e10) {
            e = e10;
            int i822 = J.f3546b;
            J2.j.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void m() {
        zzbza.zza.execute(new RunnableC0085d(this, 10));
    }

    public final zzbyk n() {
        zzbyk zzbykVar;
        l();
        synchronized (this.f3551a) {
            try {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlG)).booleanValue() && this.f3563n.zzj()) {
                    Iterator it = this.f3553c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                zzbykVar = this.f3563n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbykVar;
    }

    public final String o() {
        String str;
        l();
        synchronized (this.f3551a) {
            str = this.f3572w;
        }
        return str;
    }

    public final void p(Context context) {
        synchronized (this.f3551a) {
            try {
                if (this.f3556f != null) {
                    return;
                }
                this.f3554d = zzbza.zza.zza(new y0(8, this, context));
                this.f3552b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
            l();
            synchronized (this.f3551a) {
                try {
                    if (this.f3575z.equals(str)) {
                        return;
                    }
                    this.f3575z = str;
                    SharedPreferences.Editor editor = this.f3557g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f3557g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void r(boolean z4) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
            l();
            synchronized (this.f3551a) {
                try {
                    if (this.f3574y == z4) {
                        return;
                    }
                    this.f3574y = z4;
                    SharedPreferences.Editor editor = this.f3557g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z4);
                        this.f3557g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void s(String str) {
        l();
        synchronized (this.f3551a) {
            try {
                if (TextUtils.equals(this.f3572w, str)) {
                    return;
                }
                this.f3572w = str;
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(long j) {
        l();
        synchronized (this.f3551a) {
            try {
                if (this.f3565p == j) {
                    return;
                }
                this.f3565p = j;
                SharedPreferences.Editor editor = this.f3557g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f3557g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
