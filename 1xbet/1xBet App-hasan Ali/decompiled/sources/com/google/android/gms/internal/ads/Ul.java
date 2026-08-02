package com.google.android.gms.internal.ads;

import Q2.InterfaceC0368k0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ul {

    /* renamed from: a, reason: collision with root package name */
    public final Vl f11787a;

    /* renamed from: b, reason: collision with root package name */
    public final C0812bm f11788b;

    /* renamed from: c, reason: collision with root package name */
    public final Ml f11789c;

    /* renamed from: d, reason: collision with root package name */
    public final Ql f11790d;

    /* renamed from: e, reason: collision with root package name */
    public final B.L f11791e;
    public final BinderC0767am f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1294md f11792g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1294md f11793h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f11794j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11795k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f11800p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11803s;

    /* renamed from: t, reason: collision with root package name */
    public int f11804t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11805u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f11796l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f11797m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f11798n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f11799o = "{}";

    /* renamed from: q, reason: collision with root package name */
    public long f11801q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public Rl f11802r = Rl.f11447k;

    /* renamed from: v, reason: collision with root package name */
    public Tl f11806v = Tl.f11669k;

    /* renamed from: w, reason: collision with root package name */
    public long f11807w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f11808x = "";

    public Ul(Vl vl, C0812bm c0812bm, Ml ml, Context context, U2.a aVar, Ql ql, BinderC0767am binderC0767am, SharedPreferencesOnSharedPreferenceChangeListenerC1294md sharedPreferencesOnSharedPreferenceChangeListenerC1294md, SharedPreferencesOnSharedPreferenceChangeListenerC1294md sharedPreferencesOnSharedPreferenceChangeListenerC1294md2, String str) {
        this.f11787a = vl;
        this.f11788b = c0812bm;
        this.f11789c = ml;
        B.L l5 = new B.L();
        l5.f644e = "";
        l5.f642c = context;
        l5.f643d = context.getApplicationInfo();
        A7 a7 = F7.M8;
        Q2.r rVar = Q2.r.f5053d;
        l5.f640a = ((Integer) rVar.f5056c.a(a7)).intValue();
        l5.f641b = ((Integer) rVar.f5056c.a(F7.N8)).intValue();
        this.f11791e = l5;
        this.i = aVar.f5852k;
        this.f11795k = str;
        this.f11790d = ql;
        this.f = binderC0767am;
        this.f11792g = sharedPreferencesOnSharedPreferenceChangeListenerC1294md;
        this.f11793h = sharedPreferencesOnSharedPreferenceChangeListenerC1294md2;
        this.f11794j = context;
        P2.o.f4767B.f4780n.f5727g = this;
    }

    public final synchronized C0634Ld a(String str) {
        C0634Ld c0634Ld;
        try {
            c0634Ld = new C0634Ld();
            if (this.f11797m.containsKey(str)) {
                c0634Ld.b((Ol) this.f11797m.get(str));
            } else {
                if (!this.f11798n.containsKey(str)) {
                    this.f11798n.put(str, new ArrayList());
                }
                ((List) this.f11798n.get(str)).add(c0634Ld);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0634Ld;
    }

    public final synchronized void b(String str, Ol ol) {
        A7 a7 = F7.z8;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && f()) {
            if (this.f11804t >= ((Integer) rVar.f5056c.a(F7.B8)).intValue()) {
                U2.j.i("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f11796l.containsKey(str)) {
                this.f11796l.put(str, new ArrayList());
            }
            this.f11804t++;
            ((List) this.f11796l.get(str)).add(ol);
            if (((Boolean) rVar.f5056c.a(F7.X8)).booleanValue()) {
                String str2 = ol.f10976m;
                this.f11797m.put(str2, ol);
                if (this.f11798n.containsKey(str2)) {
                    List list = (List) this.f11798n.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C0634Ld) it.next()).b(ol);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void c() {
        A7 a7 = F7.z8;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            if (((Boolean) rVar.f5056c.a(F7.O8)).booleanValue() && P2.o.f4767B.f4774g.d().m()) {
                i();
                return;
            }
            String v4 = P2.o.f4767B.f4774g.d().v();
            if (TextUtils.isEmpty(v4)) {
                return;
            }
            try {
                if (new JSONObject(v4).optBoolean("isTestMode", false)) {
                    i();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void d(InterfaceC0368k0 interfaceC0368k0, Tl tl) {
        if (!f()) {
            try {
                interfaceC0368k0.u0(AbstractC1803xs.I(18, null, null));
                return;
            } catch (RemoteException unused) {
                U2.j.i("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z8)).booleanValue()) {
            this.f11806v = tl;
            this.f11787a.a(interfaceC0368k0, new C1866z9(this, 1), new C1417p9(3, this.f), new C1866z9(this, 0));
            return;
        } else {
            try {
                interfaceC0368k0.u0(AbstractC1803xs.I(1, null, null));
                return;
            } catch (RemoteException unused2) {
                U2.j.i("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final void e(boolean z3) {
        if (!this.f11805u && z3) {
            i();
        }
        l(z3, true);
    }

    public final synchronized boolean f() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.O8)).booleanValue()) {
            return this.f11803s || P2.o.f4767B.f4780n.g();
        }
        return this.f11803s;
    }

    public final synchronized boolean g() {
        return this.f11803s;
    }

    public final synchronized JSONObject h() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f11796l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (Ol ol : (List) entry.getValue()) {
                    if (ol.f10978o != Nl.f10809k) {
                        jSONArray.put(ol.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void i() {
        this.f11805u = true;
        Ql ql = this.f11790d;
        ql.getClass();
        Q2.E0 e02 = new Q2.E0(1, ql);
        Kl kl = ql.f11244a;
        kl.getClass();
        kl.f10232e.f10334k.a(new Kw(26, kl, e02), kl.f10235j);
        this.f11787a.f11931m = this;
        this.f11788b.f = this;
        this.f11789c.i = this;
        this.f.f12708p = this;
        A7 a7 = F7.c9;
        Q2.r rVar = Q2.r.f5053d;
        if (!TextUtils.isEmpty((CharSequence) rVar.f5056c.a(a7))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f11794j);
            List asList = Arrays.asList(((String) rVar.f5056c.a(a7)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC1294md sharedPreferencesOnSharedPreferenceChangeListenerC1294md = this.f11792g;
            sharedPreferencesOnSharedPreferenceChangeListenerC1294md.f14502c = asList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1294md);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1294md.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        A7 a72 = F7.d9;
        if (!TextUtils.isEmpty((CharSequence) rVar.f5056c.a(a72))) {
            SharedPreferences sharedPreferences = this.f11794j.getSharedPreferences("admob", 0);
            List asList2 = Arrays.asList(((String) rVar.f5056c.a(a72)).split(","));
            SharedPreferencesOnSharedPreferenceChangeListenerC1294md sharedPreferencesOnSharedPreferenceChangeListenerC1294md2 = this.f11793h;
            sharedPreferencesOnSharedPreferenceChangeListenerC1294md2.f14502c = asList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1294md2);
            Iterator it2 = asList2.iterator();
            while (it2.hasNext()) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1294md2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String v4 = P2.o.f4767B.f4774g.d().v();
        synchronized (this) {
            if (!TextUtils.isEmpty(v4)) {
                try {
                    JSONObject jSONObject = new JSONObject(v4);
                    l(jSONObject.optBoolean("isTestMode", false), false);
                    k((Rl) Enum.valueOf(Rl.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f11799o = jSONObject.optString("networkExtras", "{}");
                    this.f11801q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.f11808x = P2.o.f4767B.f4774g.d().w();
    }

    public final void j() {
        String jSONObject;
        P2.o oVar = P2.o.f4767B;
        T2.I d5 = oVar.f4774g.d();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.f11803s);
                jSONObject2.put("gesture", this.f11802r);
                long j5 = this.f11801q;
                oVar.f4776j.getClass();
                if (j5 > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.f11799o);
                    jSONObject2.put("networkExtrasExpirationSecs", this.f11801q);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        d5.b(jSONObject);
    }

    public final synchronized void k(Rl rl, boolean z3) {
        try {
            if (this.f11802r != rl) {
                if (f()) {
                    m();
                }
                this.f11802r = rl;
                if (f()) {
                    n();
                }
                if (z3) {
                    j();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void l(boolean z3, boolean z5) {
        try {
            if (this.f11803s != z3) {
                this.f11803s = z3;
                if (z3) {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.O8)).booleanValue()) {
                        if (!P2.o.f4767B.f4780n.g()) {
                        }
                    }
                    n();
                    if (z5) {
                        j();
                        return;
                    }
                }
                if (!f()) {
                    m();
                }
                if (z5) {
                }
            }
        } finally {
        }
    }

    public final synchronized void m() {
        int ordinal = this.f11802r.ordinal();
        if (ordinal == 1) {
            this.f11788b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f11789c.b();
        }
    }

    public final synchronized void n() {
        int ordinal = this.f11802r.ordinal();
        if (ordinal == 1) {
            this.f11788b.c();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f11789c.c();
        }
    }
}
