package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.x;
import com.unity3d.ads.BuildConfig;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: Global.java */
/* loaded from: classes6.dex */
class k {
    private static volatile String o = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f9992a;
    private final m b;
    private Context c;
    private x d;
    private JSONObject e;
    private List<String> f;
    private List<String> g;
    private volatile c h;
    private volatile l i;
    private volatile d j;
    private volatile j k;
    private volatile s l;
    private volatile boolean m = true;
    private volatile o n;

    k(String str, m mVar) {
        this.f9992a = str;
        this.b = mVar;
    }

    void a(Context context) {
        this.c = context;
    }

    void b() {
        this.m = true;
        try {
            q().j();
            this.l = null;
            this.k = null;
        } catch (Exception e) {
            if (a.f9983a) {
                Log.e("TrackManager", "report manager shutdown exception", e);
            }
        }
    }

    x c() {
        x xVar = this.d;
        if (xVar != null) {
            return xVar;
        }
        x a2 = new x.b().a();
        this.d = a2;
        return a2;
    }

    Context d() {
        return this.c;
    }

    c e() {
        if (y.b(this.h)) {
            synchronized (k.class) {
                if (y.b(this.h)) {
                    String u = u();
                    this.h = new c(new b(d(), f(), u), u);
                }
            }
        }
        return this.h;
    }

    String f() {
        return TextUtils.isEmpty(w()) ? String.format("track_manager_%s.db", BuildConfig.FLAVOR) : String.format("track_manager_%s.db", w());
    }

    d g() {
        if (y.b(this.j)) {
            this.j = c().h;
        }
        return this.j;
    }

    l h() {
        if (y.b(this.i)) {
            synchronized (k.class) {
                if (y.b(this.i)) {
                    this.i = new q(new g(e(), q()));
                }
            }
        }
        return this.i;
    }

    j i() {
        if (y.b(this.k)) {
            synchronized (k.class) {
                if (y.b(this.k)) {
                    this.k = new j();
                }
            }
        }
        return this.k;
    }

    int j() {
        if (c().f10038a < 0) {
            return 50;
        }
        return c().f10038a;
    }

    int k() {
        return Math.max(c().e, 0);
    }

    int l() {
        if (c().d <= 0) {
            return 2;
        }
        return c().d;
    }

    int m() {
        return Math.max(c().b, 0);
    }

    o n() {
        if (y.b(this.n)) {
            synchronized (k.class) {
                if (y.b(this.n)) {
                    this.n = new o(l(), o(), s(), r());
                }
            }
        }
        return this.n;
    }

    p o() {
        return c().g;
    }

    JSONObject p() {
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.e = jSONObject2;
        return jSONObject2;
    }

    s q() {
        if (y.b(this.l)) {
            synchronized (k.class) {
                if (y.b(this.l)) {
                    this.l = new s(this);
                }
            }
        }
        return this.l;
    }

    int r() {
        return c().c;
    }

    w s() {
        return c().i;
    }

    String t() {
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        String uuid = UUID.randomUUID().toString();
        o = uuid;
        return uuid;
    }

    String u() {
        return "event_table";
    }

    m v() {
        return this.b;
    }

    String w() {
        return this.f9992a;
    }

    boolean x() {
        return this.m;
    }

    String y() {
        if (!y.b(this.c) && !y.b(this.d)) {
            try {
                q().k();
                this.m = false;
                if (TextUtils.isEmpty(o)) {
                    o = UUID.randomUUID().toString();
                }
                return o;
            } catch (Exception e) {
                if (a.f9983a) {
                    Log.e("TrackManager", "start error", e);
                }
                this.m = true;
            }
        }
        return "";
    }

    void a(x xVar) {
        this.d = xVar;
    }

    void a(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = c().j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e) {
                if (a.f9983a) {
                    Log.e("TrackManager", "event filter apply exception", e);
                }
            }
        }
        String g = eVar.g();
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        if (this.g != null) {
            try {
                return !r0.contains(g);
            } catch (Exception e2) {
                if (a.f9983a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e2);
                }
            }
        }
        List<String> list = this.f;
        if (list != null) {
            try {
                return list.contains(g);
            } catch (Exception e3) {
                if (a.f9983a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e3);
                }
            }
        }
        return true;
    }

    boolean a() throws IllegalStateException {
        if (!y.b(c())) {
            if (!y.b(g())) {
                if (!y.b(s())) {
                    if (!y.b(o()) && !y.b(o().b())) {
                        if (TextUtils.isEmpty(o().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
