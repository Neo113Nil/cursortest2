package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0089c8;
import p000.C0270h1;
import p000.C0414kz;
import p000.RunnableC0372ju;
import p000.RunnableC0452m;
import p000.a02;
import p000.a22;
import p000.a32;
import p000.a81;
import p000.c02;
import p000.c22;
import p000.d22;
import p000.d32;
import p000.dv1;
import p000.e62;
import p000.eu1;
import p000.f02;
import p000.f31;
import p000.f32;
import p000.f72;
import p000.fu1;
import p000.gv1;
import p000.iv1;
import p000.j62;
import p000.jx1;
import p000.kv1;
import p000.ky1;
import p000.l32;
import p000.l72;
import p000.o12;
import p000.oq0;
import p000.p80;
import p000.py1;
import p000.qv1;
import p000.u90;
import p000.v22;
import p000.vs0;
import p000.vv1;
import p000.vx1;
import p000.wc1;
import p000.wv1;
import p000.xb0;
import p000.xv1;
import p000.z12;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends dv1 {

    /* JADX INFO: renamed from: b */
    public f02 f1351b;

    /* JADX INFO: renamed from: c */
    public final C0089c8 f1352c;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f1351b = null;
        this.f1352c = new C0089c8(0);
    }

    @Override // p000.ev1
    public void beginAdUnitExposure(String str, long j) {
        m993c();
        qv1 qv1Var = this.f1351b.f2255w;
        f02.m1557j(qv1Var);
        qv1Var.m4200B(str, j);
    }

    /* JADX INFO: renamed from: c */
    public final void m993c() {
        if (this.f1351b != null) {
            return;
        }
        C0270h1.m2191g("Attempting to perform action before initialize.");
    }

    @Override // p000.ev1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m5033O(str, str2, bundle);
    }

    @Override // p000.ev1
    public void clearMeasurementEnabled(long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m3446B();
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new f31(17, v22Var, (Object) null));
    }

    /* JADX INFO: renamed from: d */
    public final void m994d(String str, gv1 gv1Var) {
        m993c();
        f72 f72Var = this.f1351b.f2250r;
        f02.m1558k(f72Var);
        f72Var.m1733o0(str, gv1Var);
    }

    @Override // p000.ev1
    public void endAdUnitExposure(String str, long j) {
        m993c();
        qv1 qv1Var = this.f1351b.f2255w;
        f02.m1557j(qv1Var);
        qv1Var.m4201C(str, j);
    }

    @Override // p000.ev1
    public void generateEventId(gv1 gv1Var) {
        m993c();
        f72 f72Var = this.f1351b.f2250r;
        f02.m1558k(f72Var);
        long jM1741z0 = f72Var.m1741z0();
        m993c();
        f72 f72Var2 = this.f1351b.f2250r;
        f02.m1558k(f72Var2);
        f72Var2.m1734p0(gv1Var, jM1741z0);
    }

    @Override // p000.ev1
    public void getAppInstanceId(gv1 gv1Var) {
        m993c();
        a02 a02Var = this.f1351b.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new c02(this, gv1Var, 0));
    }

    @Override // p000.ev1
    public void getCachedAppInstanceId(gv1 gv1Var) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        m994d((String) v22Var.f8014p.get(), gv1Var);
    }

    @Override // p000.ev1
    public void getConditionalUserProperties(String str, String str2, gv1 gv1Var) {
        m993c();
        a02 a02Var = this.f1351b.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new RunnableC0452m(this, gv1Var, str, str2, 11));
    }

    @Override // p000.ev1
    public void getCurrentScreenClass(gv1 gv1Var) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        l32 l32Var = ((f02) v22Var.f7192j).f2253u;
        f02.m1559l(l32Var);
        f32 f32Var = l32Var.f4658l;
        m994d(f32Var != null ? f32Var.f2296b : null, gv1Var);
    }

    @Override // p000.ev1
    public void getCurrentScreenName(gv1 gv1Var) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        l32 l32Var = ((f02) v22Var.f7192j).f2253u;
        f02.m1559l(l32Var);
        f32 f32Var = l32Var.f4658l;
        m994d(f32Var != null ? f32Var.f2295a : null, gv1Var);
    }

    @Override // p000.ev1
    public void getGmpAppId(gv1 gv1Var) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        m994d(v22Var.m5034P(), gv1Var);
    }

    @Override // p000.ev1
    public void getMaxUserProperties(String str, gv1 gv1Var) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        p80.m3860e(str);
        ((f02) v22Var.f7192j).getClass();
        m993c();
        f72 f72Var = this.f1351b.f2250r;
        f02.m1558k(f72Var);
        f72Var.m1735q0(gv1Var, 25);
    }

    @Override // p000.ev1
    public void getSessionId(gv1 gv1Var) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new f31(v22Var, gv1Var));
    }

    @Override // p000.ev1
    public void getTestFlag(gv1 gv1Var, int i) {
        m993c();
        if (i == 0) {
            f72 f72Var = this.f1351b.f2250r;
            f02.m1558k(f72Var);
            v22 v22Var = this.f1351b.f2254v;
            f02.m1559l(v22Var);
            AtomicReference atomicReference = new AtomicReference();
            a02 a02Var = ((f02) v22Var.f7192j).f2248p;
            f02.m1560m(a02Var);
            f72Var.m1733o0((String) a02Var.m7K(atomicReference, 15000L, "String test flag value", new c22(v22Var, atomicReference, 1)), gv1Var);
            return;
        }
        if (i == 1) {
            f72 f72Var2 = this.f1351b.f2250r;
            f02.m1558k(f72Var2);
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            a02 a02Var2 = ((f02) v22Var2.f7192j).f2248p;
            f02.m1560m(a02Var2);
            f72Var2.m1734p0(gv1Var, ((Long) a02Var2.m7K(atomicReference2, 15000L, "long test flag value", new c22(v22Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            f72 f72Var3 = this.f1351b.f2250r;
            f02.m1558k(f72Var3);
            v22 v22Var3 = this.f1351b.f2254v;
            f02.m1559l(v22Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            a02 a02Var3 = ((f02) v22Var3.f7192j).f2248p;
            f02.m1560m(a02Var3);
            double dDoubleValue = ((Double) a02Var3.m7K(atomicReference3, 15000L, "double test flag value", new c22(v22Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                gv1Var.mo785n(bundle);
                return;
            } catch (RemoteException e) {
                ky1 ky1Var = ((f02) f72Var3.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5313b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            f72 f72Var4 = this.f1351b.f2250r;
            f02.m1558k(f72Var4);
            v22 v22Var4 = this.f1351b.f2254v;
            f02.m1559l(v22Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            a02 a02Var4 = ((f02) v22Var4.f7192j).f2248p;
            f02.m1560m(a02Var4);
            f72Var4.m1735q0(gv1Var, ((Integer) a02Var4.m7K(atomicReference4, 15000L, "int test flag value", new c22(v22Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        f72 f72Var5 = this.f1351b.f2250r;
        f02.m1558k(f72Var5);
        v22 v22Var5 = this.f1351b.f2254v;
        f02.m1559l(v22Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        a02 a02Var5 = ((f02) v22Var5.f7192j).f2248p;
        f02.m1560m(a02Var5);
        f72Var5.m1737s0(gv1Var, ((Boolean) a02Var5.m7K(atomicReference5, 15000L, "boolean test flag value", new c22(v22Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // p000.ev1
    public void getUserProperties(String str, String str2, boolean z, gv1 gv1Var) {
        m993c();
        a02 a02Var = this.f1351b.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new z12(this, gv1Var, str, str2, z));
    }

    @Override // p000.ev1
    public void initForTests(Map map) {
        m993c();
    }

    @Override // p000.ev1
    public void initialize(xb0 xb0Var, wv1 wv1Var, long j) {
        f02 f02Var = this.f1351b;
        if (f02Var == null) {
            Context context = (Context) vs0.m5188H(xb0Var);
            p80.m3863h(context);
            this.f1351b = f02.m1561s(context, wv1Var, Long.valueOf(j), null);
        } else {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5312a("Attempting to initialize multiple times");
        }
    }

    @Override // p000.ev1
    public void initializeWithElapsedTime(xb0 xb0Var, wv1 wv1Var, long j, long j2) {
        f02 f02Var = this.f1351b;
        if (f02Var == null) {
            Context context = (Context) vs0.m5188H(xb0Var);
            p80.m3863h(context);
            this.f1351b = f02.m1561s(context, wv1Var, Long.valueOf(j), Long.valueOf(j2));
        } else {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5312a("Attempting to initialize multiple times");
        }
    }

    @Override // p000.ev1
    public void isDataCollectionEnabled(gv1 gv1Var) {
        m993c();
        a02 a02Var = this.f1351b.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new c02(this, gv1Var, 1));
    }

    @Override // p000.ev1
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m5024F(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // p000.ev1
    public void logEventAndBundle(String str, String str2, Bundle bundle, gv1 gv1Var, long j) {
        m993c();
        p80.m3860e(str2);
        String str3 = true != this.f1351b.f2245m.m770L(null, jx1.f4181f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        fu1 fu1Var = new fu1(str2, new eu1(bundle), str3, j, 0L);
        a02 a02Var = this.f1351b.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new RunnableC0452m(this, gv1Var, fu1Var, str, 6));
    }

    @Override // p000.ev1
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m5024F(str, str2, bundle, z, z2, j, j2);
    }

    @Override // p000.ev1
    public void logHealthData(int i, String str, xb0 xb0Var, xb0 xb0Var2, xb0 xb0Var3) {
        m993c();
        Object objM5188H = xb0Var == null ? null : vs0.m5188H(xb0Var);
        Object objM5188H2 = xb0Var2 == null ? null : vs0.m5188H(xb0Var2);
        Object objM5188H3 = xb0Var3 != null ? vs0.m5188H(xb0Var3) : null;
        ky1 ky1Var = this.f1351b.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.m3113J(i, true, false, str, objM5188H, objM5188H2, objM5188H3);
    }

    @Override // p000.ev1
    public void onActivityCreated(xb0 xb0Var, Bundle bundle, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        onActivityCreatedByScionActivityInfo(xv1.m5690b(activity), bundle, j);
    }

    @Override // p000.ev1
    public void onActivityCreatedByScionActivityInfo(xv1 xv1Var, Bundle bundle, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        C0414kz c0414kz = v22Var.f8010l;
        if (c0414kz != null) {
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            v22Var2.m5038T();
            c0414kz.m3123i(xv1Var, bundle);
        }
    }

    @Override // p000.ev1
    public void onActivityDestroyed(xb0 xb0Var, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        onActivityDestroyedByScionActivityInfo(xv1.m5690b(activity), j);
    }

    @Override // p000.ev1
    public void onActivityDestroyedByScionActivityInfo(xv1 xv1Var, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        C0414kz c0414kz = v22Var.f8010l;
        if (c0414kz != null) {
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            v22Var2.m5038T();
            c0414kz.m3124j(xv1Var);
        }
    }

    @Override // p000.ev1
    public void onActivityPaused(xb0 xb0Var, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        onActivityPausedByScionActivityInfo(xv1.m5690b(activity), j);
    }

    @Override // p000.ev1
    public void onActivityPausedByScionActivityInfo(xv1 xv1Var, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        C0414kz c0414kz = v22Var.f8010l;
        if (c0414kz != null) {
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            v22Var2.m5038T();
            c0414kz.m3125k(xv1Var);
        }
    }

    @Override // p000.ev1
    public void onActivityResumed(xb0 xb0Var, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        onActivityResumedByScionActivityInfo(xv1.m5690b(activity), j);
    }

    @Override // p000.ev1
    public void onActivityResumedByScionActivityInfo(xv1 xv1Var, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        C0414kz c0414kz = v22Var.f8010l;
        if (c0414kz != null) {
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            v22Var2.m5038T();
            c0414kz.m3126l(xv1Var);
        }
    }

    @Override // p000.ev1
    public void onActivitySaveInstanceState(xb0 xb0Var, gv1 gv1Var, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(xv1.m5690b(activity), gv1Var, j);
    }

    @Override // p000.ev1
    public void onActivitySaveInstanceStateByScionActivityInfo(xv1 xv1Var, gv1 gv1Var, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        C0414kz c0414kz = v22Var.f8010l;
        Bundle bundle = new Bundle();
        if (c0414kz != null) {
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            v22Var2.m5038T();
            c0414kz.m3127m(xv1Var, bundle);
        }
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = this.f1351b.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // p000.ev1
    public void onActivityStarted(xb0 xb0Var, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        onActivityStartedByScionActivityInfo(xv1.m5690b(activity), j);
    }

    @Override // p000.ev1
    public void onActivityStartedByScionActivityInfo(xv1 xv1Var, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        if (v22Var.f8010l != null) {
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            v22Var2.m5038T();
        }
    }

    @Override // p000.ev1
    public void onActivityStopped(xb0 xb0Var, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        onActivityStoppedByScionActivityInfo(xv1.m5690b(activity), j);
    }

    @Override // p000.ev1
    public void onActivityStoppedByScionActivityInfo(xv1 xv1Var, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        if (v22Var.f8010l != null) {
            v22 v22Var2 = this.f1351b.f2254v;
            f02.m1559l(v22Var2);
            v22Var2.m5038T();
        }
    }

    @Override // p000.ev1
    public void performAction(Bundle bundle, gv1 gv1Var, long j) {
        m993c();
        gv1Var.mo785n(null);
    }

    @Override // p000.ev1
    public void registerOnMeasurementEventListener(kv1 kv1Var) {
        Object l72Var;
        m993c();
        C0089c8 c0089c8 = this.f1352c;
        synchronized (c0089c8) {
            try {
                l72Var = (o12) c0089c8.get(Integer.valueOf(kv1Var.mo2967b()));
                if (l72Var == null) {
                    l72Var = new l72(this, kv1Var);
                    c0089c8.put(Integer.valueOf(kv1Var.mo2967b()), l72Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m3446B();
        if (v22Var.f8012n.add(l72Var)) {
            return;
        }
        ky1 ky1Var = ((f02) v22Var.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4603r.m5312a("OnEventListener already registered");
    }

    @Override // p000.ev1
    @Deprecated
    public void resetAnalyticsData(long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.f8014p.set(null);
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new a22(v22Var, j, 1));
    }

    @Override // p000.ev1
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.f8014p.set(null);
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new a22(v22Var, j, 1));
    }

    @Override // p000.ev1
    public void retrieveAndUploadBatches(iv1 iv1Var) {
        d32 d32Var;
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m3446B();
        f02 f02Var = (f02) v22Var.f7192j;
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        if (a02Var.m3G()) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        a02 a02Var2 = f02Var.f2248p;
        f02.m1560m(a02Var2);
        if (Thread.currentThread() == a02Var2.f9m) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5312a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zM4898g = u90.m4898g();
        ky1 ky1Var3 = f02Var.f2247o;
        if (zM4898g) {
            f02.m1560m(ky1Var3);
            ky1Var3.f4600o.m5312a("Cannot retrieve and upload batches from main thread");
            return;
        }
        f02.m1560m(ky1Var3);
        ky1Var3.f4608w.m5312a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        boolean z2 = false;
        int size = 0;
        int i = 0;
        while (!z2) {
            ky1 ky1Var4 = f02Var.f2247o;
            f02.m1560m(ky1Var4);
            ky1Var4.f4608w.m5312a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            a02 a02Var3 = f02Var.f2248p;
            f02.m1560m(a02Var3);
            a02Var3.m7K(atomicReference, 10000L, "[sgtm] Getting upload batches", new c22(v22Var, atomicReference, 6, z));
            j62 j62Var = (j62) atomicReference.get();
            if (j62Var == null) {
                break;
            }
            List list = j62Var.f3831j;
            if (list.isEmpty()) {
                break;
            }
            ky1 ky1Var5 = f02Var.f2247o;
            f02.m1560m(ky1Var5);
            ky1Var5.f4608w.m5313b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                e62 e62Var = (e62) it.next();
                try {
                    URL url = new URI(e62Var.f1975l).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    vx1 vx1VarM1575r = ((f02) v22Var.f7192j).m1575r();
                    vx1VarM1575r.m3446B();
                    p80.m3863h(vx1VarM1575r.f8288p);
                    String str = vx1VarM1575r.f8288p;
                    f02 f02Var2 = (f02) v22Var.f7192j;
                    ky1 ky1Var6 = f02Var2.f2247o;
                    f02.m1560m(ky1Var6);
                    wc1 wc1Var = ky1Var6.f4608w;
                    Long lValueOf = Long.valueOf(e62Var.f1973j);
                    wc1Var.m5315d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, e62Var.f1975l, Integer.valueOf(e62Var.f1974k.length));
                    if (!TextUtils.isEmpty(e62Var.f1979p)) {
                        ky1 ky1Var7 = f02Var2.f2247o;
                        f02.m1560m(ky1Var7);
                        ky1Var7.f4608w.m5314c(lValueOf, e62Var.f1979p, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = e62Var.f1976m;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    a32 a32Var = f02Var2.f2256x;
                    f02.m1560m(a32Var);
                    byte[] bArr = e62Var.f1974k;
                    oq0 oq0Var = new oq0(v22Var, atomicReference2, e62Var, 13);
                    a32Var.m1081C();
                    p80.m3863h(url);
                    p80.m3863h(bArr);
                    a02 a02Var4 = ((f02) a32Var.f7192j).f2248p;
                    f02.m1560m(a02Var4);
                    a02Var4.m9M(new py1(a32Var, str, url, bArr, map, oq0Var));
                    try {
                        f72 f72Var = f02Var2.f2250r;
                        f02.m1558k(f72Var);
                        f02 f02Var3 = (f02) f72Var.f7192j;
                        f02Var3.f2252t.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    f02Var3.f2252t.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        ky1 ky1Var8 = ((f02) v22Var.f7192j).f2247o;
                        f02.m1560m(ky1Var8);
                        ky1Var8.f4603r.m5312a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    d32Var = atomicReference2.get() == null ? d32.f1541k : (d32) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    ky1 ky1Var9 = ((f02) v22Var.f7192j).f2247o;
                    f02.m1560m(ky1Var9);
                    ky1Var9.f4600o.m5315d("[sgtm] Bad upload url for row_id", e62Var.f1975l, Long.valueOf(e62Var.f1973j), e);
                    d32Var = d32.f1543m;
                }
                if (d32Var != d32.f1542l) {
                    if (d32Var == d32.f1544n) {
                        z2 = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
            z = false;
        }
        ky1 ky1Var10 = f02Var.f2247o;
        f02.m1560m(ky1Var10);
        ky1Var10.f4608w.m5314c(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            iv1Var.mo1322e();
        } catch (RemoteException e2) {
            f02 f02Var4 = this.f1351b;
            p80.m3863h(f02Var4);
            ky1 ky1Var11 = f02Var4.f2247o;
            f02.m1560m(ky1Var11);
            ky1Var11.f4603r.m5313b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // p000.ev1
    public void setConditionalUserProperty(Bundle bundle, long j) {
        m993c();
        f02 f02Var = this.f1351b;
        if (bundle == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Conditional user property must not be null");
        } else {
            v22 v22Var = f02Var.f2254v;
            f02.m1559l(v22Var);
            v22Var.m5032N(bundle, j);
        }
    }

    @Override // p000.ev1
    public void setConsentThirdParty(Bundle bundle, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m5039U(bundle, -20, j);
    }

    @Override // p000.ev1
    public void setCurrentScreen(xb0 xb0Var, String str, String str2, long j) {
        m993c();
        Activity activity = (Activity) vs0.m5188H(xb0Var);
        p80.m3863h(activity);
        setCurrentScreenByScionActivityInfo(xv1.m5690b(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // p000.ev1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(xv1 xv1Var, String str, String str2, long j) {
        m993c();
        l32 l32Var = this.f1351b.f2253u;
        f02.m1559l(l32Var);
        f02 f02Var = (f02) l32Var.f7192j;
        if (!f02Var.f2245m.m774P()) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4605t.m5312a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        f32 f32Var = l32Var.f4658l;
        if (f32Var == null) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4605t.m5312a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = l32Var.f4661o;
        Integer numValueOf = Integer.valueOf(xv1Var.f9090j);
        if (concurrentHashMap.get(numValueOf) == null) {
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4605t.m5312a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = l32Var.m3161F(xv1Var.f9091k);
        }
        String str3 = f32Var.f2296b;
        String str4 = f32Var.f2295a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            ky1 ky1Var4 = f02Var.f2247o;
            f02.m1560m(ky1Var4);
            ky1Var4.f4605t.m5312a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                f02Var.f2245m.getClass();
            }
            ky1 ky1Var5 = f02Var.f2247o;
            f02.m1560m(ky1Var5);
            ky1Var5.f4605t.m5313b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            f02Var.f2245m.getClass();
            if (length2 <= 500) {
                ky1 ky1Var6 = f02Var.f2247o;
                f02.m1560m(ky1Var6);
                ky1Var6.f4608w.m5314c(str == null ? "null" : str, str2, "Setting current screen to name, class");
                f72 f72Var = f02Var.f2250r;
                f02.m1558k(f72Var);
                f32 f32Var2 = new f32(f72Var.m1741z0(), str, str2);
                concurrentHashMap.put(numValueOf, f32Var2);
                l32Var.m3164I(xv1Var.f9091k, f32Var2, true);
                return;
            }
        }
        ky1 ky1Var7 = f02Var.f2247o;
        f02.m1560m(ky1Var7);
        ky1Var7.f4605t.m5313b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // p000.ev1
    public void setDataCollectionEnabled(boolean z) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m3446B();
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new RunnableC0372ju(v22Var, z));
    }

    @Override // p000.ev1
    public void setDefaultEventParameters(Bundle bundle) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new d22(v22Var, bundle2, 2));
    }

    @Override // p000.ev1
    public void setEventInterceptor(kv1 kv1Var) {
        m993c();
        int i = 19;
        a81 a81Var = new a81(i, this, kv1Var);
        a02 a02Var = this.f1351b.f2248p;
        f02.m1560m(a02Var);
        boolean zM3G = a02Var.m3G();
        f02 f02Var = this.f1351b;
        if (!zM3G) {
            a02 a02Var2 = f02Var.f2248p;
            f02.m1560m(a02Var2);
            a02Var2.m6J(new f31(i, this, a81Var));
            return;
        }
        v22 v22Var = f02Var.f2254v;
        f02.m1559l(v22Var);
        v22Var.mo11z();
        v22Var.m3446B();
        a81 a81Var2 = v22Var.f8011m;
        if (a81Var != a81Var2) {
            p80.m3865j("EventInterceptor already set.", a81Var2 == null);
        }
        v22Var.f8011m = a81Var;
    }

    @Override // p000.ev1
    public void setInstanceIdProvider(vv1 vv1Var) {
        m993c();
    }

    @Override // p000.ev1
    public void setMeasurementEnabled(boolean z, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        v22Var.m3446B();
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new f31(17, v22Var, boolValueOf));
    }

    @Override // p000.ev1
    public void setMinimumSessionDuration(long j) {
        m993c();
    }

    @Override // p000.ev1
    public void setSessionTimeoutDuration(long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        a02 a02Var = ((f02) v22Var.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new a22(v22Var, j, 0));
    }

    @Override // p000.ev1
    public void setSgtmDebugInfo(Intent intent) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        f02 f02Var = (f02) v22Var.f7192j;
        Uri data = intent.getData();
        if (data == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4606u.m5312a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4606u.m5312a("[sgtm] Preview Mode was not enabled.");
            f02Var.f2245m.f983l = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        ky1 ky1Var3 = f02Var.f2247o;
        f02.m1560m(ky1Var3);
        ky1Var3.f4606u.m5313b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        f02Var.f2245m.f983l = queryParameter2;
    }

    @Override // p000.ev1
    public void setUserId(String str, long j) {
        m993c();
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        f02 f02Var = (f02) v22Var.f7192j;
        if (str != null && TextUtils.isEmpty(str)) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5312a("User ID must be non-empty or null");
        } else {
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new f31(v22Var, str, 20, false));
            v22Var.m5029K(null, "_id", str, true, j);
        }
    }

    @Override // p000.ev1
    public void setUserProperty(String str, String str2, xb0 xb0Var, boolean z, long j) {
        m993c();
        Object objM5188H = vs0.m5188H(xb0Var);
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m5029K(str, str2, objM5188H, z, j);
    }

    @Override // p000.ev1
    public void unregisterOnMeasurementEventListener(kv1 kv1Var) {
        Object l72Var;
        m993c();
        C0089c8 c0089c8 = this.f1352c;
        synchronized (c0089c8) {
            l72Var = (o12) c0089c8.remove(Integer.valueOf(kv1Var.mo2967b()));
        }
        if (l72Var == null) {
            l72Var = new l72(this, kv1Var);
        }
        v22 v22Var = this.f1351b.f2254v;
        f02.m1559l(v22Var);
        v22Var.m3446B();
        if (v22Var.f8012n.remove(l72Var)) {
            return;
        }
        ky1 ky1Var = ((f02) v22Var.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4603r.m5312a("OnEventListener had not been registered");
    }

    @Override // p000.ev1
    public void setConsent(Bundle bundle, long j) {
    }
}
