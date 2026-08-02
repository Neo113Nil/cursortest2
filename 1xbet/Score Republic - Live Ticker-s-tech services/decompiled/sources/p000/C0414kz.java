package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: renamed from: kz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0414kz implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4609j;

    /* JADX INFO: renamed from: k */
    public final Object f4610k;

    public C0414kz() {
        this.f4609j = 0;
        this.f4610k = new ArrayDeque(10);
    }

    /* JADX INFO: renamed from: i */
    public void m3123i(xv1 xv1Var, Bundle bundle) {
        l32 l32Var;
        f02 f02Var;
        Uri uri;
        v22 v22Var = (v22) this.f4610k;
        try {
            try {
                f02 f02Var2 = (f02) v22Var.f7192j;
                ky1 ky1Var = f02Var2.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4608w.m5312a("onActivityCreated");
                Intent intent = xv1Var.f9092l;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        f02.m1558k(f02Var2.f2250r);
                        String str = f72.m1681D0(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        a02 a02Var = f02Var2.f2248p;
                        f02.m1560m(a02Var);
                        a02Var.m6J(new z12(this, z, uri, str, queryParameter));
                        f02Var = (f02) v22Var.f7192j;
                    }
                    l32Var = f02Var.f2253u;
                }
                f02Var = (f02) v22Var.f7192j;
            } catch (RuntimeException e) {
                ky1 ky1Var2 = ((f02) v22Var.f7192j).f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5313b(e, "Throwable caught in onActivityCreated");
            }
            l32Var = f02Var.f2253u;
        } finally {
            l32Var = ((f02) v22Var.f7192j).f2253u;
            f02.m1559l(l32Var);
            l32Var.m3163H(xv1Var, bundle);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3124j(xv1 xv1Var) {
        l32 l32Var = ((f02) ((v22) this.f4610k).f7192j).f2253u;
        f02.m1559l(l32Var);
        synchronized (l32Var.f4667u) {
            try {
                if (Objects.equals(l32Var.f4662p, xv1Var)) {
                    l32Var.f4662p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((f02) l32Var.f7192j).f2245m.m774P()) {
            l32Var.f4661o.remove(Integer.valueOf(xv1Var.f9090j));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m3125k(xv1 xv1Var) {
        f02 f02Var = (f02) ((v22) this.f4610k).f7192j;
        l32 l32Var = f02Var.f2253u;
        f02.m1559l(l32Var);
        synchronized (l32Var.f4667u) {
            l32Var.f4666t = false;
            l32Var.f4663q = true;
        }
        f02 f02Var2 = (f02) l32Var.f7192j;
        f02Var2.f2252t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (f02Var2.f2245m.m774P()) {
            f32 f32VarM3166K = l32Var.m3166K(xv1Var);
            l32Var.f4659m = l32Var.f4658l;
            l32Var.f4658l = null;
            a02 a02Var = f02Var2.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new dc1(l32Var, f32VarM3166K, jElapsedRealtime));
        } else {
            l32Var.f4658l = null;
            a02 a02Var2 = f02Var2.f2248p;
            f02.m1560m(a02Var2);
            a02Var2.m6J(new RunnableC0018ah(l32Var, jElapsedRealtime));
        }
        s52 s52Var = f02Var.f2249q;
        f02.m1559l(s52Var);
        f02 f02Var3 = (f02) s52Var.f7192j;
        f02Var3.f2252t.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        a02 a02Var3 = f02Var3.f2248p;
        f02.m1560m(a02Var3);
        a02Var3.m6J(new h52(s52Var, jElapsedRealtime2, 1));
    }

    /* JADX INFO: renamed from: l */
    public void m3126l(xv1 xv1Var) {
        f02 f02Var = (f02) ((v22) this.f4610k).f7192j;
        s52 s52Var = f02Var.f2249q;
        f02.m1559l(s52Var);
        f02 f02Var2 = (f02) s52Var.f7192j;
        f02Var2.f2252t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a02 a02Var = f02Var2.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new h52(s52Var, jElapsedRealtime, 0));
        l32 l32Var = f02Var.f2253u;
        f02.m1559l(l32Var);
        Object obj = l32Var.f4667u;
        synchronized (obj) {
            try {
                l32Var.f4666t = true;
                if (!Objects.equals(xv1Var, l32Var.f4662p)) {
                    synchronized (obj) {
                        l32Var.f4662p = xv1Var;
                        l32Var.f4663q = false;
                        f02 f02Var3 = (f02) l32Var.f7192j;
                        if (f02Var3.f2245m.m774P()) {
                            l32Var.f4664r = null;
                            a02 a02Var2 = f02Var3.f2248p;
                            f02.m1560m(a02Var2);
                            a02Var2.m6J(new i32(l32Var, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f02 f02Var4 = (f02) l32Var.f7192j;
        if (!f02Var4.f2245m.m774P()) {
            l32Var.f4658l = l32Var.f4664r;
            a02 a02Var3 = f02Var4.f2248p;
            f02.m1560m(a02Var3);
            a02Var3.m6J(new i32(l32Var, 0));
            return;
        }
        l32Var.m3164I(xv1Var.f9091k, l32Var.m3166K(xv1Var), false);
        qv1 qv1Var = ((f02) l32Var.f7192j).f2255w;
        f02.m1557j(qv1Var);
        f02 f02Var5 = (f02) qv1Var.f7192j;
        f02Var5.f2252t.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        a02 a02Var4 = f02Var5.f2248p;
        f02.m1560m(a02Var4);
        a02Var4.m6J(new RunnableC0018ah(qv1Var, jElapsedRealtime2));
    }

    /* JADX INFO: renamed from: m */
    public void m3127m(xv1 xv1Var, Bundle bundle) {
        f32 f32Var;
        l32 l32Var = ((f02) ((v22) this.f4610k).f7192j).f2253u;
        f02.m1559l(l32Var);
        if (!((f02) l32Var.f7192j).f2245m.m774P() || bundle == null || (f32Var = (f32) l32Var.f4661o.get(Integer.valueOf(xv1Var.f9090j))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", f32Var.f2297c);
        bundle2.putString("name", f32Var.f2295a);
        bundle2.putString("referrer_name", f32Var.f2296b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f4609j;
        Object obj = this.f4610k;
        switch (i) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) obj;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                w00 w00VarM5221b = w00.m5221b();
                                w00VarM5221b.m5224a();
                                InterfaceC0826w3 interfaceC0826w3 = (InterfaceC0826w3) w00VarM5221b.f8321d.mo2281a(InterfaceC0826w3.class);
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                }
                                if (interfaceC0826w3 != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    interfaceC0826w3.mo4423d(string2, "fcm");
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string2);
                                    interfaceC0826w3.mo4425f("fcm", "_cmp", bundle3);
                                } else {
                                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        d71.m1113h(bundle2, "_no");
                    }
                    break;
                }
                break;
            case 1:
                ((mw1) obj).m3434b(new bw1(this, bundle, activity));
                break;
            default:
                m3123i(xv1.m5690b(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f4609j) {
            case 0:
                break;
            case 1:
                ((mw1) this.f4610k).m3434b(new lw1(this, activity, 4));
                break;
            default:
                m3124j(xv1.m5690b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f4609j) {
            case 0:
                break;
            case 1:
                ((mw1) this.f4610k).m3434b(new lw1(this, activity, 2));
                break;
            default:
                m3125k(xv1.m5690b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f4609j) {
            case 0:
                break;
            case 1:
                ((mw1) this.f4610k).m3434b(new lw1(this, activity, 1));
                break;
            default:
                m3126l(xv1.m5690b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f4609j) {
            case 0:
                break;
            case 1:
                bv1 bv1Var = new bv1();
                ((mw1) this.f4610k).m3434b(new bw1(this, activity, bv1Var));
                Bundle bundleM784c = bv1Var.m784c(50L);
                if (bundleM784c != null) {
                    bundle.putAll(bundleM784c);
                }
                break;
            default:
                m3127m(xv1.m5690b(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f4609j) {
            case 1:
                ((mw1) this.f4610k).m3434b(new lw1(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f4609j) {
            case 1:
                ((mw1) this.f4610k).m3434b(new lw1(this, activity, 3));
                break;
        }
    }

    public /* synthetic */ C0414kz(int i, Object obj) {
        this.f4609j = i;
        this.f4610k = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m3115a(Activity activity) {
    }

    /* JADX INFO: renamed from: b */
    private final void m3116b(Activity activity) {
    }

    /* JADX INFO: renamed from: c */
    private final void m3117c(Activity activity) {
    }

    /* JADX INFO: renamed from: e */
    private final void m3119e(Activity activity) {
    }

    /* JADX INFO: renamed from: f */
    private final void m3120f(Activity activity) {
    }

    /* JADX INFO: renamed from: g */
    private final void m3121g(Activity activity) {
    }

    /* JADX INFO: renamed from: h */
    private final void m3122h(Activity activity) {
    }

    /* JADX INFO: renamed from: d */
    private final void m3118d(Activity activity, Bundle bundle) {
    }
}
