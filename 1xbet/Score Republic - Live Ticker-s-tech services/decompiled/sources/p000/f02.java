package p000;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f02 implements f12 {

    /* JADX INFO: renamed from: O */
    public static volatile f02 f2227O;

    /* JADX INFO: renamed from: A */
    public v42 f2228A;

    /* JADX INFO: renamed from: B */
    public au1 f2229B;

    /* JADX INFO: renamed from: C */
    public vx1 f2230C;

    /* JADX INFO: renamed from: D */
    public b32 f2231D;

    /* JADX INFO: renamed from: F */
    public Boolean f2233F;

    /* JADX INFO: renamed from: G */
    public long f2234G;

    /* JADX INFO: renamed from: H */
    public volatile Boolean f2235H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f2236I;

    /* JADX INFO: renamed from: J */
    public int f2237J;

    /* JADX INFO: renamed from: K */
    public int f2238K;

    /* JADX INFO: renamed from: M */
    public final long f2240M;

    /* JADX INFO: renamed from: N */
    public final long f2241N;

    /* JADX INFO: renamed from: j */
    public final Context f2242j;

    /* JADX INFO: renamed from: k */
    public final boolean f2243k;

    /* JADX INFO: renamed from: l */
    public final u90 f2244l;

    /* JADX INFO: renamed from: m */
    public final bt1 f2245m;

    /* JADX INFO: renamed from: n */
    public final fz1 f2246n;

    /* JADX INFO: renamed from: o */
    public final ky1 f2247o;

    /* JADX INFO: renamed from: p */
    public final a02 f2248p;

    /* JADX INFO: renamed from: q */
    public final s52 f2249q;

    /* JADX INFO: renamed from: r */
    public final f72 f2250r;

    /* JADX INFO: renamed from: s */
    public final cy1 f2251s;

    /* JADX INFO: renamed from: t */
    public final wa0 f2252t;

    /* JADX INFO: renamed from: u */
    public final l32 f2253u;

    /* JADX INFO: renamed from: v */
    public final v22 f2254v;

    /* JADX INFO: renamed from: w */
    public final qv1 f2255w;

    /* JADX INFO: renamed from: x */
    public final a32 f2256x;

    /* JADX INFO: renamed from: y */
    public final String f2257y;

    /* JADX INFO: renamed from: z */
    public ay1 f2258z;

    /* JADX INFO: renamed from: E */
    public boolean f2232E = false;

    /* JADX INFO: renamed from: L */
    public final AtomicInteger f2239L = new AtomicInteger(0);

    public f02(q12 q12Var) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        boolean z = false;
        Context context = q12Var.f6310a;
        u90 u90Var = new u90(22);
        this.f2244l = u90Var;
        vk1.f8211d = u90Var;
        this.f2242j = context;
        this.f2243k = q12Var.f6314e;
        this.f2235H = q12Var.f6311b;
        this.f2257y = q12Var.f6317h;
        this.f2236I = true;
        if (h32.f3039b == null && context != null) {
            Object obj = h32.f3038a;
            synchronized (obj) {
                try {
                    if (h32.f3039b == null) {
                        synchronized (obj) {
                            try {
                                p22 p22Var = h32.f3039b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (p22Var == null || p22Var.f5967a != applicationContext2) {
                                    if (p22Var != null) {
                                        Iterator it = q22.f6343a.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        k32.m2987a();
                                    }
                                    h32.f3039b = new p22(applicationContext2, a90.m137u(new C0186et(applicationContext2, 8, z)));
                                    h32.f3040c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f2252t = wa0.f8472l;
        e22 e22Var = new e22(context, v12.f7998a, InterfaceC0420l4.f4668a, f90.f2350c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        m81 m81VarM3350b = m81.m3350b();
        m81VarM3350b.f5010l = new a81(strConcat, new String[0], 15, z);
        e22Var.m2002b(0, m81VarM3350b.m3354a());
        AtomicReference atomicReference = x22.f8760k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                x22.m5497b();
                AbstractC0477mo.m3412p(Level.WARNING, (Executor) x22.f8762m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = q12Var.f6315f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.f2252t.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f2240M = jCurrentTimeMillis;
        Long l2 = q12Var.f6316g;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.f2252t.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f2241N = jElapsedRealtime;
        bt1 bt1Var = new bt1(this);
        bt1Var.f984m = x80.f8856l;
        this.f2245m = bt1Var;
        fz1 fz1Var = new fz1(this);
        fz1Var.m1082D();
        this.f2246n = fz1Var;
        ky1 ky1Var = new ky1(this);
        ky1Var.m1082D();
        this.f2247o = ky1Var;
        f72 f72Var = new f72(this);
        f72Var.m1082D();
        this.f2250r = f72Var;
        this.f2251s = new cy1(new d02(q12Var, this));
        this.f2255w = new qv1(this);
        l32 l32Var = new l32(this);
        l32Var.m3447C();
        this.f2253u = l32Var;
        v22 v22Var = new v22(this);
        v22Var.m3447C();
        this.f2254v = v22Var;
        s52 s52Var = new s52(this);
        s52Var.m3447C();
        this.f2249q = s52Var;
        a32 a32Var = new a32(this);
        a32Var.m1082D();
        this.f2256x = a32Var;
        a02 a02Var = new a02(this);
        a02Var.m1082D();
        this.f2248p = a02Var;
        wv1 wv1Var = q12Var.f6313d;
        z = wv1Var == null || wv1Var.f8711k == 0;
        if (this.f2242j.getApplicationContext() instanceof Application) {
            m1559l(v22Var);
            if (((f02) v22Var.f7192j).f2242j.getApplicationContext() instanceof Application) {
                Application application = (Application) ((f02) v22Var.f7192j).f2242j.getApplicationContext();
                if (v22Var.f8010l == null) {
                    v22Var.f8010l = new C0414kz(2, v22Var);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(v22Var.f8010l);
                    application.registerActivityLifecycleCallbacks(v22Var.f8010l);
                    ky1 ky1Var2 = ((f02) v22Var.f7192j).f2247o;
                    m1560m(ky1Var2);
                    ky1Var2.f4608w.m5312a("Registered activity lifecycle callback");
                }
            }
        } else {
            m1560m(ky1Var);
            ky1Var.f4603r.m5312a("Application context is not an Application");
        }
        a02Var.m6J(new f31(13, this, q12Var));
    }

    /* JADX INFO: renamed from: j */
    public static final void m1557j(pw1 pw1Var) {
        if (pw1Var != null) {
            return;
        }
        C0270h1.m2191g("Component not created");
    }

    /* JADX INFO: renamed from: k */
    public static final void m1558k(sq1 sq1Var) {
        if (sq1Var != null) {
            return;
        }
        C0270h1.m2191g("Component not created");
    }

    /* JADX INFO: renamed from: l */
    public static final void m1559l(mx1 mx1Var) {
        if (mx1Var == null) {
            C0270h1.m2191g("Component not created");
        } else {
            if (mx1Var.f5182k) {
                return;
            }
            C0270h1.m2191g("Component not initialized: ".concat(String.valueOf(mx1Var.getClass())));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m1560m(d12 d12Var) {
        if (d12Var == null) {
            C0270h1.m2191g("Component not created");
        } else {
            if (d12Var.f1519k) {
                return;
            }
            C0270h1.m2191g("Component not initialized: ".concat(String.valueOf(d12Var.getClass())));
        }
    }

    /* JADX INFO: renamed from: s */
    public static f02 m1561s(Context context, wv1 wv1Var, Long l, Long l2) {
        Bundle bundle;
        if (wv1Var != null) {
            Bundle bundle2 = wv1Var.f8713m;
            wv1Var = new wv1(wv1Var.f8710j, wv1Var.f8711k, wv1Var.f8712l, bundle2, null);
        }
        p80.m3863h(context);
        p80.m3863h(context.getApplicationContext());
        if (f2227O == null) {
            synchronized (f02.class) {
                try {
                    if (f2227O == null) {
                        f2227O = new f02(new q12(context, wv1Var, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (wv1Var != null && (bundle = wv1Var.f8713m) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            p80.m3863h(f2227O);
            f2227O.f2235H = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        p80.m3863h(f2227O);
        return f2227O;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: a */
    public final u90 mo1562a() {
        return this.f2244l;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final ky1 mo1563b() {
        ky1 ky1Var = this.f2247o;
        m1560m(ky1Var);
        return ky1Var;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: c */
    public final a02 mo1564c() {
        a02 a02Var = this.f2248p;
        m1560m(a02Var);
        return a02Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1565d() {
        return m1568g() == 0;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: e */
    public final Context mo1566e() {
        return this.f2242j;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: f */
    public final wa0 mo1567f() {
        return this.f2252t;
    }

    /* JADX INFO: renamed from: g */
    public final int m1568g() {
        a02 a02Var = this.f2248p;
        m1560m(a02Var);
        a02Var.mo11z();
        bt1 bt1Var = this.f2245m;
        if (bt1Var.m773O()) {
            return 1;
        }
        m1560m(a02Var);
        a02Var.mo11z();
        if (!this.f2236I) {
            return 8;
        }
        fz1 fz1Var = this.f2246n;
        m1558k(fz1Var);
        fz1Var.mo11z();
        Boolean boolValueOf = fz1Var.m1908E().contains("measurement_enabled") ? Boolean.valueOf(fz1Var.m1908E().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        u90 u90Var = ((f02) bt1Var.f7192j).f2244l;
        Boolean boolM772N = bt1Var.m772N("firebase_analytics_collection_enabled");
        if (boolM772N != null) {
            return boolM772N.booleanValue() ? 0 : 4;
        }
        return (this.f2235H == null || this.f2235H.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX INFO: renamed from: h */
    public final boolean m1569h() {
        f72 f72Var;
        Context context;
        boolean z = false;
        if (!this.f2232E) {
            C0270h1.m2191g("AppMeasurement is not initialized");
            return false;
        }
        a02 a02Var = this.f2248p;
        m1560m(a02Var);
        a02Var.mo11z();
        Boolean bool = this.f2233F;
        wa0 wa0Var = this.f2252t;
        if (bool == null || this.f2234G == 0) {
            wa0Var.getClass();
            this.f2234G = SystemClock.elapsedRealtime();
            f72Var = this.f2250r;
            m1558k(f72Var);
            if (f72Var.m1725e0("android.permission.INTERNET") && f72Var.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f2242j;
                if (tk1.m4792a(context).m1503f() || this.f2245m.m762D() || (f72.m1695w0(context) && f72.m1687V(context))) {
                    z = true;
                }
            }
            this.f2233F = Boolean.valueOf(z);
            if (z) {
                this.f2233F = Boolean.valueOf(f72Var.m1703G(m1575r().m5220H()));
            }
        } else if (!bool.booleanValue()) {
            wa0Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f2234G) > 1000) {
                wa0Var.getClass();
                this.f2234G = SystemClock.elapsedRealtime();
                f72Var = this.f2250r;
                m1558k(f72Var);
                if (f72Var.m1725e0("android.permission.INTERNET")) {
                    context = this.f2242j;
                    if (tk1.m4792a(context).m1503f()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.f2233F = Boolean.valueOf(z);
                if (z) {
                    this.f2233F = Boolean.valueOf(f72Var.m1703G(m1575r().m5220H()));
                }
            }
        }
        return this.f2233F.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: i */
    public final void m1570i(int i, Throwable th, byte[] bArr) {
        ky1 ky1Var;
        ky1 ky1Var2;
        int i2 = i;
        ky1 ky1Var3 = this.f2247o;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                fz1 fz1Var = this.f2246n;
                m1558k(fz1Var);
                fz1Var.f2543C.m5853b(true);
                if (bArr != null || bArr.length == 0) {
                    m1560m(ky1Var3);
                    ky1Var3.f4607v.m5312a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        m1560m(ky1Var3);
                        ky1Var3.f4607v.m5312a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    f72 f72Var = this.f2250r;
                    m1558k(f72Var);
                    f02 f02Var = (f02) f72Var.f7192j;
                    if (TextUtils.isEmpty(strOptString)) {
                        ky1Var2 = ky1Var3;
                    } else {
                        Context context = f02Var.f2242j;
                        ky1Var2 = ky1Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.f2254v.m5026H("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = f02Var.f2242j;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    ky1 ky1Var4 = ((f02) f72Var.f7192j).f2247o;
                                    m1560m(ky1Var4);
                                    ky1Var4.f4600o.m5313b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            ky1Var = ky1Var2;
                            m1560m(ky1Var);
                            ky1Var.f4600o.m5313b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    m1560m(ky1Var2);
                    ky1Var = ky1Var2;
                    try {
                        ky1Var.f4603r.m5315d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        m1560m(ky1Var);
                        ky1Var.f4600o.m5313b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    ky1Var = ky1Var3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                fz1 fz1Var2 = this.f2246n;
                m1558k(fz1Var2);
                fz1Var2.f2543C.m5853b(true);
                if (bArr != null) {
                }
                m1560m(ky1Var3);
                ky1Var3.f4607v.m5312a("Deferred Deep Link response empty.");
                return;
            }
        }
        m1560m(ky1Var3);
        ky1Var3.f4603r.m5314c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    /* JADX INFO: renamed from: n */
    public final cy1 m1571n() {
        return this.f2251s;
    }

    /* JADX INFO: renamed from: o */
    public final ay1 m1572o() {
        m1559l(this.f2258z);
        return this.f2258z;
    }

    /* JADX INFO: renamed from: p */
    public final v42 m1573p() {
        m1559l(this.f2228A);
        return this.f2228A;
    }

    /* JADX INFO: renamed from: q */
    public final au1 m1574q() {
        m1560m(this.f2229B);
        return this.f2229B;
    }

    /* JADX INFO: renamed from: r */
    public final vx1 m1575r() {
        m1559l(this.f2230C);
        return this.f2230C;
    }
}
