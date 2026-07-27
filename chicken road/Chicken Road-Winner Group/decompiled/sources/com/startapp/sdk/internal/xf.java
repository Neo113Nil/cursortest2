package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xf {

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f4634o = MetaData.E().o0();

    /* renamed from: b, reason: collision with root package name */
    public final Context f4636b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f4637c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f4638d;

    /* renamed from: e, reason: collision with root package name */
    public final TrackingParams f4639e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f4640g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4641h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4642i;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f4644k;

    /* renamed from: l, reason: collision with root package name */
    public vf f4645l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4646m;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4635a = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f4643j = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public final Object f4647n = new Object();

    public xf(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j3, boolean z3, wf wfVar) {
        Context a3 = w0.a(context);
        this.f4636b = a3 != null ? a3 : context;
        this.f4637c = placement;
        this.f4638d = strArr;
        this.f4639e = trackingParams;
        this.f = j3;
        this.f4646m = z3;
        this.f4644k = new WeakReference(wfVar);
    }

    public final void a() {
        if (this.f4641h && this.f4642i) {
            this.f4635a.removeCallbacksAndMessages(null);
            this.f -= System.currentTimeMillis() - this.f4640g;
            this.f4642i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z3;
        synchronized (this.f4647n) {
            try {
                z3 = this.f4646m;
                if (z3) {
                    this.f4645l = new vf(this, str, jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3) {
            c(str, jSONObject);
        } else if (a(4)) {
            d9 d9Var = new d9(e9.f3617d);
            d9Var.f3574d = "SI.defImp";
            d9Var.f3578i = B0.c.j("reason=", str);
            d9Var.a();
        }
    }

    public final void c() {
        if (this.f4643j.get() != 0) {
            return;
        }
        if (!f4634o) {
            b(null, null);
            return;
        }
        long j3 = this.f;
        if (this.f4642i) {
            return;
        }
        this.f4642i = true;
        if (!this.f4641h) {
            this.f4641h = true;
        }
        this.f4640g = System.currentTimeMillis();
        this.f4635a.postDelayed(new uf(this), j3);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f4641h = false;
        this.f4635a.removeCallbacksAndMessages(null);
        this.f4642i = false;
        this.f4640g = 0L;
    }

    public static boolean a(int i3) {
        AnalyticsConfig h3 = MetaData.E().h();
        ComponentInfoEventConfig i4 = h3 != null ? h3.i() : null;
        return i4 != null && i4.a((long) i3);
    }

    public final void c(String str, JSONObject jSONObject) {
        if (!this.f4643j.compareAndSet(0, 1)) {
            int incrementAndGet = this.f4643j.incrementAndGet();
            if (a(str != null ? 2 : 1)) {
                d9 d9Var = new d9(e9.f3617d);
                d9Var.f3574d = "SI.repImp";
                d9Var.f3578i = B0.c.j("reason=", str);
                d9Var.f3575e = String.valueOf(incrementAndGet);
                d9Var.a();
                return;
            }
            return;
        }
        if (str == null) {
            Context context = this.f4636b;
            String[] strArr = this.f4638d;
            TrackingParams trackingParams = this.f4639e;
            if (context != null && strArr != null) {
                b9.a(context, Arrays.asList(strArr), trackingParams);
            }
            wf wfVar = (wf) this.f4644k.get();
            if (wfVar != null) {
                String[] strArr2 = this.f4638d;
                if (strArr2 != null && strArr2.length > 0) {
                    r0 = g0.a(strArr2[0], (String) null);
                }
                wfVar.a(r0);
            }
            try {
                u0 u0Var = (u0) com.startapp.sdk.components.a.a(this.f4636b).f3350Q.a();
                AdPreferences.Placement placement = this.f4637c;
                ConcurrentHashMap concurrentHashMap = u0Var.f4405c;
                Integer num = (Integer) concurrentHashMap.get(placement);
                concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
        String[] strArr3 = this.f4638d;
        TrackingParams trackingParams2 = this.f4639e;
        g0.a(strArr3, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
    }

    public final void b() {
        vf vfVar;
        synchronized (this.f4647n) {
            vfVar = this.f4645l;
            this.f4646m = false;
            this.f4645l = null;
        }
        if (vfVar != null) {
            vfVar.run();
        }
        if (a(4)) {
            d9 d9Var = new d9(e9.f3617d);
            d9Var.f3574d = "SI.prcImp";
            StringBuilder sb = new StringBuilder("impr=");
            sb.append(vfVar != null);
            d9Var.f3578i = sb.toString();
            d9Var.a();
        }
    }
}
