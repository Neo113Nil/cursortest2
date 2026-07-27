package sg.bigo.ads.Q0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.F;
import sg.bigo.ads.R0.t;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final b f12510a;
    public final sg.bigo.ads.U.h b;
    public final sg.bigo.ads.T0.g c;
    public final Context h;
    public sg.bigo.ads.P0.b j;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final c k = new c(this);
    public final e l = new e(this);
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public n(Context context, u uVar, sg.bigo.ads.T0.g gVar) {
        this.h = context;
        this.f12510a = new b(context, gVar);
        this.b = uVar;
        this.c = gVar;
    }

    public static boolean a(n nVar, d dVar) {
        sg.bigo.ads.R0.i iVar = nVar.f12510a.j;
        iVar.c();
        if (!nVar.d.compareAndSet(false, true)) {
            return false;
        }
        if (!iVar.c()) {
            nVar.d.set(false);
            return false;
        }
        iVar.l = System.currentTimeMillis();
        nVar.f12510a.a(0L);
        new sg.bigo.ads.b1.q(nVar.b, nVar, new g(nVar, iVar, SystemClock.elapsedRealtime(), dVar)).b();
        return true;
    }

    public static void a(n nVar, String str, boolean z) {
        nVar.f.compareAndSet(false, z);
        if (nVar.e.compareAndSet(false, true)) {
            t tVar = nVar.f12510a.m;
            tVar.getClass();
            Math.abs(System.currentTimeMillis() - tVar.d);
            h hVar = new h(nVar);
            i iVar = new i(nVar);
            if (Math.abs(System.currentTimeMillis() - tVar.d) > tVar.b) {
                tVar.d = System.currentTimeMillis();
                synchronized (tVar) {
                    if (!A.a(tVar.c)) {
                        Iterator it = tVar.c.iterator();
                        while (it.hasNext()) {
                            ((sg.bigo.ads.R0.s) it.next()).d = true;
                        }
                    }
                }
                nVar.a(str, tVar, hVar, new j(nVar, str, hVar, iVar));
                return;
            }
            if (nVar.f.compareAndSet(true, false) && nVar.g.compareAndSet(false, true)) {
                nVar.a(str, hVar, iVar);
            }
            nVar.e.set(false);
        }
    }

    public final q a(String str, String str2) {
        q qVar = new q(this.f12510a, this.b, this.c, str, str2);
        qVar.l = this.k;
        return qVar;
    }

    public final boolean a(String str, ValueCallback valueCallback, ValueCallback valueCallback2) {
        sg.bigo.ads.R0.m mVar = this.f12510a.n;
        mVar.a();
        if (!mVar.a()) {
            this.g.set(false);
            return false;
        }
        mVar.e = System.currentTimeMillis();
        synchronized (mVar) {
            if (!A.a(mVar.d)) {
                Iterator it = mVar.d.iterator();
                while (it.hasNext()) {
                    ((sg.bigo.ads.R0.b) it.next()).d = true;
                }
            }
        }
        a(str, mVar, new k(this, mVar, valueCallback), valueCallback2);
        return true;
    }

    public final void a(String str, sg.bigo.ads.R0.u uVar, ValueCallback valueCallback, ValueCallback valueCallback2) {
        int i;
        boolean z;
        sg.bigo.ads.R0.b a2 = uVar.a(str);
        Objects.toString(a2);
        this.f12510a.a(0L);
        if (a2 == null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue("not available url.");
                return;
            }
            return;
        }
        sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(new sg.bigo.ads.B0.d(a2.b), this.h);
        sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
        if (jVar != null) {
            i = jVar.f12521a;
            z = jVar.a(13);
        } else {
            i = 3;
            z = false;
        }
        aVar.c = AbstractRunnableC5522h.a("ConfigNet", i, z);
        AbstractC5507g.a(aVar, new l(this, a2, valueCallback, SystemClock.elapsedRealtime(), str, uVar, valueCallback2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01fd  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(String str, String str2, long j, boolean z) {
        r rVar;
        JSONObject jSONObject;
        int optInt;
        int i;
        ?? r2;
        r rVar2;
        String str3;
        String str4;
        boolean z2;
        boolean z3;
        b bVar = this.f12510a;
        ConcurrentHashMap concurrentHashMap = this.i;
        String e = ((u) this.b).e();
        int i2 = this.c.M;
        bVar.getClass();
        if (TextUtils.isEmpty(str)) {
            rVar2 = new r(false, false, 4003, "config content is empty");
        } else {
            String trim = str.trim();
            boolean startsWith = trim.startsWith("{");
            ArrayList arrayList = new ArrayList();
            if (!startsWith) {
                a aVar = new a(arrayList);
                if (TextUtils.isEmpty(trim)) {
                    str3 = "a";
                    str4 = "cip error with empty.";
                } else if (TextUtils.isEmpty("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F")) {
                    str3 = "a";
                    str4 = "string error with empty.";
                } else {
                    trim = F.b(trim, aVar);
                    if (TextUtils.isEmpty(trim)) {
                        str3 = "a";
                        str4 = "cip error with empty content.";
                    }
                    if (TextUtils.isEmpty(trim)) {
                        AbstractC5496a.a("AntiBanUtils", "decrypt error, decrypted content is empty.");
                        trim = null;
                    }
                }
                AbstractC5496a.a(str3, str4);
                trim = null;
                if (TextUtils.isEmpty(trim)) {
                }
            }
            if (!A.a(arrayList)) {
                bVar.h = true;
                rVar2 = new r(false, startsWith, 4004, Log.getStackTraceString((Throwable) arrayList.get(0)));
            } else {
                try {
                    jSONObject = new JSONObject(trim);
                    optInt = jSONObject.optInt("version", 0);
                    i = bVar.e;
                } catch (JSONException e2) {
                    rVar = new r(false, startsWith, 4005, Log.getStackTraceString(e2));
                }
                if (optInt < i ? false : optInt == i ? bVar.q : true) {
                    boolean z4 = optInt == i;
                    bVar.e = optInt;
                    bVar.g = startsWith;
                    bVar.i = str2;
                    bVar.j.a(b.a(jSONObject.optJSONObject("cfg_svr")), z4, e, i2);
                    bVar.k.a(b.a(jSONObject.optJSONObject("report_svr")), z4, e, i2);
                    bVar.l.a(b.a(jSONObject.optJSONObject("ad_svr")), z4, e, i2);
                    if (z4) {
                        r2 = 0;
                    } else {
                        t tVar = bVar.m;
                        JSONObject a2 = b.a(jSONObject.optJSONObject("third_pay_svr"));
                        synchronized (tVar) {
                            long max = Math.max(a2.optLong("interval", t.e / 1000) * 1000, sg.bigo.ads.R0.u.f12524a);
                            ArrayList a3 = t.a();
                            JSONArray optJSONArray = a2.optJSONArray("urls");
                            if (optJSONArray != null) {
                                int i3 = 0;
                                while (i3 < optJSONArray.length()) {
                                    JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                                    String optString = optJSONObject.optString("name", "");
                                    String optString2 = optJSONObject.optString("url", "");
                                    JSONArray jSONArray = optJSONArray;
                                    String optString3 = optJSONObject.optString("region", "");
                                    if (URLUtil.isNetworkUrl(optString2)) {
                                        a3.add(new sg.bigo.ads.R0.s(optString, optString2, optString3, false));
                                    }
                                    i3++;
                                    optJSONArray = jSONArray;
                                }
                            }
                            tVar.b = max;
                            tVar.c = a3;
                        }
                        bVar.n.a(b.a(jSONObject.optJSONObject("third_free_svr")));
                        bVar.o.a(b.a(jSONObject.optJSONObject("uri_opt_timeout")));
                        bVar.p.a(b.a(jSONObject.optJSONObject("req_pool_size")));
                        if (!A.a(concurrentHashMap)) {
                            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                String str5 = (String) entry.getKey();
                                String str6 = (String) entry.getValue();
                                bVar.j.a(str5, str6);
                                bVar.k.a(str5, str6);
                                bVar.l.a(str5, str6);
                            }
                        }
                        r2 = 0;
                    }
                    bVar.q = r2;
                    rVar = new r(true, startsWith, r2, "success");
                    long elapsedRealtime = j > 0 ? 0L : SystemClock.elapsedRealtime() - j;
                    if (!rVar.f12514a) {
                        this.f12510a.a(0L);
                        if (z) {
                            z2 = rVar.b;
                            z3 = true;
                            sg.bigo.ads.s1.b.a(elapsedRealtime, z2, str2, z3);
                        }
                        return rVar;
                    }
                    int i4 = rVar.c;
                    if (i4 == 0) {
                        if (z) {
                            z2 = rVar.b;
                            z3 = false;
                            sg.bigo.ads.s1.b.a(elapsedRealtime, z2, str2, z3);
                        }
                    } else if (z) {
                        sg.bigo.ads.s1.b.a(elapsedRealtime, rVar.b, str2, i4, rVar.d);
                    }
                    return rVar;
                }
                rVar2 = new r(false, startsWith, 0, "local config version is " + bVar.e + ", remote version is " + optInt);
            }
        }
        rVar = rVar2;
        if (j > 0) {
        }
        if (!rVar.f12514a) {
        }
    }
}
