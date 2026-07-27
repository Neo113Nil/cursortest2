package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: MBridgeTrackManager.java */
/* loaded from: classes6.dex */
public final class m {
    private static final ConcurrentHashMap<String, m> b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final k f9993a;

    /* compiled from: MBridgeTrackManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f9993a.q().b();
            } catch (Exception e) {
                if (com.mbridge.msdk.tracker.a.f9983a) {
                    Log.e("TrackManager", "flush error", e);
                }
            }
        }
    }

    /* compiled from: MBridgeTrackManager.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f9995a;
        final /* synthetic */ JSONObject b;

        b(e eVar, JSONObject jSONObject) {
            this.f9995a = eVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f9993a.h().a(this.f9995a);
                JSONObject jSONObject = this.b;
                if (jSONObject != null) {
                    jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, m.this.d());
                    long[] e = m.this.e();
                    this.b.put("track_time", e[0]);
                    this.b.put("track_count", e[1]);
                    this.f9995a.a(this.b);
                }
                this.f9995a.b(m.this.f9993a.c().f);
                m.this.f9993a.h().b(this.f9995a);
            } catch (Exception e2) {
                Log.d("TrackManager", "trackEvent error", e2);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f9993a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                mVarArr[i] = it.next().getValue();
                i++;
            }
        } catch (Exception e) {
            if (com.mbridge.msdk.tracker.a.f9983a) {
                Log.e("TrackManager", "getAllTrackManager error", e);
            }
        }
        return mVarArr;
    }

    public JSONObject c() {
        return this.f9993a.p();
    }

    public String d() {
        return this.f9993a.t();
    }

    public long[] e() {
        return this.f9993a.h().a();
    }

    public String f() {
        return this.f9993a.w();
    }

    public boolean g() {
        return !this.f9993a.x();
    }

    public String h() {
        if (!g()) {
            return this.f9993a.y();
        }
        if (com.mbridge.msdk.tracker.a.f9983a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }

    public void i() {
        this.f9993a.b();
    }

    public static m a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f9993a.x()) {
            if (com.mbridge.msdk.tracker.a.f9983a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject i = eVar.i();
            if (i != null && !i.has("ts")) {
                try {
                    i.put("ts", System.currentTimeMillis());
                } catch (Exception e) {
                    Log.e("TrackManager", "trackEvent error", e);
                }
            }
            try {
                this.f9993a.i().a(new b(eVar, i));
            } catch (Exception e2) {
                if (com.mbridge.msdk.tracker.a.f9983a) {
                    Log.e("TrackManager", "trackEvent error", e2);
                }
            }
        }
    }

    public void a() {
        try {
            this.f9993a.i().a(new a());
        } catch (Exception e) {
            if (com.mbridge.msdk.tracker.a.f9983a) {
                Log.e("TrackManager", "flush error", e);
            }
        }
    }

    public static m b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.remove(str);
        } catch (Exception e) {
            if (com.mbridge.msdk.tracker.a.f9983a) {
                Log.e("TrackManager", "removeTrackManager error", e);
            }
            return null;
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f9993a.a(eVar);
    }

    public void a(JSONObject jSONObject) {
        this.f9993a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
