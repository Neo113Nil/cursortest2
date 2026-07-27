package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.C4293aa;
import com.ironsource.C4364d2;
import com.ironsource.C4436h2;
import com.ironsource.C4444ha;
import com.ironsource.C4491k4;
import com.ironsource.C4561o2;
import com.ironsource.C4689v5;
import com.ironsource.EnumC4707w5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4673u7;
import com.ironsource.L6;
import com.ironsource.T9;
import com.ironsource.U0;
import com.ironsource.V1;
import com.ironsource.Z1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();
    public static final String c = "auctionId";
    public static final String d = "armData";
    public static final String e = "larmData";
    public static final String f = "isAdUnitCapped";
    public static final String g = "settings";
    public static final String h = "waterfall";
    public static final String i = "genericParams";
    public static final String j = "configurations";
    public static final String k = "instances";
    public static final String l = "${AUCTION_LOSS}";
    public static final String m = "${AUCTION_MBR}";
    public static final String n = "${AUCTION_PRICE}";
    public static final String o = "${DYNAMIC_DEMAND_SOURCE}";
    public static final String p = "${INSTANCE}";
    public static final String q = "${INSTANCE_TYPE}";
    public static final String r = "${PLACEMENT_NAME}";
    private static final String s = "adMarkup";
    private static final String t = "dynamicDemandSource";
    private static final String u = "params";
    public static final String v = "dlpl";
    public static final String w = "adUnit";
    public static final String x = "parallelLoad";
    public static final String y = "bidderExclusive";
    public static final String z = "showPriorityEnabled";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f8379a = new AtomicBoolean(false);
    private final InterfaceC4673u7 b = Ib.a0().a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f8380a;
        private List<C4561o2> b;
        private C4561o2 c;
        private JSONObject d;
        private JSONObject e;
        private int f;
        private String g;
        private V1 h;

        public a(String str) {
            this.f8380a = str;
        }

        public String a() {
            return this.f8380a;
        }

        public JSONObject b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        public String d() {
            return this.g;
        }

        public C4561o2 e() {
            return this.c;
        }

        public JSONObject f() {
            return this.d;
        }

        public V1 g() {
            return this.h;
        }

        public List<C4561o2> h() {
            return this.b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            V1 v1 = this.h;
            return v1 != null ? v1.a(str) : new p.b();
        }
    }

    static class b implements Runnable {
        private static final int d = 15000;

        /* renamed from: a, reason: collision with root package name */
        private String f8381a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.f8381a = str;
            this.b = str2;
            this.c = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0081 A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:3:0x0025, B:9:0x005a, B:11:0x0081, B:12:0x0086, B:16:0x0084), top: B:2:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:3:0x0025, B:9:0x005a, B:11:0x0081, B:12:0x0086, B:16:0x0084), top: B:2:0x0025 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z;
            String str = this.f8381a + ";" + this.b + ";" + this.c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                if (responseCode != 200 && responseCode != 204) {
                    z = false;
                    Ib.a0().q().a(new C4689v5(!z ? EnumC4707w5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : EnumC4707w5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, responseCode).put("reason", responseMessage)));
                }
                z = true;
                Ib.a0().q().a(new C4689v5(!z ? EnumC4707w5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : EnumC4707w5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, responseCode).put("reason", responseMessage)));
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(optString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.c = new C4561o2(jSONObject2);
            r3 = jSONObject2.has(d) ? jSONObject2.optJSONObject(d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(k)) {
                aVar.h = new V1.a(jSONObject2.optJSONObject(k));
            }
        }
        aVar.b = new ArrayList();
        if (jSONObject.has(h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(h);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                C4561o2 c4561o2 = new C4561o2(jSONArray.getJSONObject(i2), i2, r3);
                if (!c4561o2.n()) {
                    aVar.f = 1002;
                    aVar.g = "waterfall " + i2;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.b.add(c4561o2);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str) || !C4444ha.a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has("dynamicDemandSource")) {
                return "";
            }
            str2 = jSONObject2.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + str2);
            return str2;
        } catch (JSONException e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str2;
        }
    }

    public Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return hashMap;
    }

    private c a() {
        c cVar = c.SECURE;
        return Build.VERSION.SDK_INT >= 28 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar : (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    JSONObject a(h hVar) throws JSONException {
        ISBannerSize iSBannerSize;
        C4293aa c4293aa;
        int i2;
        IronSource.a c2 = hVar.c();
        boolean u2 = hVar.u();
        Map<String, Object> h2 = hVar.h();
        List<String> l2 = hVar.l();
        Z1 e2 = hVar.e();
        int p2 = hVar.p();
        ISBannerSize f2 = hVar.f();
        C4293aa o2 = hVar.o();
        boolean q2 = hVar.q();
        boolean r2 = hVar.r();
        ArrayList<C4436h2> k2 = hVar.k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String n2 = hVar.n();
        if (n2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(L6.y0, 1);
            jSONObject3.put(L6.B0, e2 != null ? e2.a(n2) : "");
            iSBannerSize = f2;
            jSONObject3.put(L6.C0, true);
            jSONObject2.put(n2, jSONObject3);
        } else {
            iSBannerSize = f2;
        }
        Iterator<String> it = h2.keySet().iterator();
        while (true) {
            c4293aa = o2;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it2 = it;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(L6.y0, 2);
            Map<String, Object> map = h2;
            jSONObject4.put(L6.p0, new JSONObject((Map) h2.get(next)));
            jSONObject4.put(L6.B0, e2 != null ? e2.a(next) : "");
            jSONObject4.put("ts", r2 ? 1 : 0);
            jSONObject2.put(next, jSONObject4);
            o2 = c4293aa;
            it = it2;
            h2 = map;
        }
        for (String str : l2) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(L6.y0, 1);
            jSONObject5.put(L6.B0, e2 != null ? e2.a(str) : "");
            jSONObject2.put(str, jSONObject5);
        }
        Iterator<C4436h2> it3 = k2.iterator();
        while (it3.hasNext()) {
            C4436h2 next2 = it3.next();
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(L6.y0, next2.e() ? 2 : 1);
            Map<String, Object> f3 = next2.f();
            if (!f3.isEmpty()) {
                jSONObject6.put(L6.p0, new JSONObject(f3));
            }
            jSONObject6.put(L6.B0, e2 != null ? e2.a(next2.g()) : "");
            jSONObject6.put("ts", r2 ? 1 : 0);
            if (!next2.h().isEmpty()) {
                jSONObject6.put(v, next2.h());
            }
            jSONObject2.put(next2.g(), jSONObject6);
        }
        jSONObject.put(L6.x0, jSONObject2);
        if (hVar.w()) {
            i2 = 1;
            jSONObject.put(L6.x1, 1);
        } else {
            i2 = 1;
        }
        if (hVar.t()) {
            jSONObject.put("do", i2);
        }
        new T9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject a2 = new C4364d2(U0.a(c2)).a();
        a(a2, false);
        a2.put(L6.z0, p2);
        a2.put(L6.A0, a().ordinal());
        if (c4293aa != null) {
            a2.put(L6.j1, c4293aa.i());
        }
        jSONObject.put(L6.u0, a2);
        if (iSBannerSize != null) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(L6.r0, iSBannerSize.getDescription());
            jSONObject7.put(L6.t0, iSBannerSize.getWidth());
            jSONObject7.put(L6.s0, iSBannerSize.getHeight());
            jSONObject.put(L6.q0, jSONObject7);
        }
        jSONObject.put(L6.l0, c2.toString());
        if (hVar.b() != null) {
            jSONObject.put("adf", hVar.b());
        }
        if (hVar.d() != null) {
            jSONObject.put("mediationAdUnitId", hVar.d());
        }
        if (hVar.v() != null) {
            jSONObject.put(L6.o0, hVar.v());
        }
        jSONObject.put(L6.v0, !u2 ? 1 : 0);
        if (hVar.g() != null) {
            jSONObject.put(L6.t1, new JSONObject().put(L6.u1, hVar.g()));
        } else {
            Object remove = a2.remove(L6.t1);
            if (remove != null) {
                jSONObject.put(L6.t1, remove);
            }
        }
        if (q2) {
            jSONObject.put(L6.r1, 1);
        }
        return jSONObject;
    }

    public String a(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(n, str4).replace(l, str6).replace(m, str5).replace(p, str2).replace(q, Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    public String a(String str, int i2, C4561o2 c4561o2, String str2, String str3, String str4) {
        String i3 = c4561o2.i();
        return a(str, c4561o2.c(), i2, b().c(c4561o2.k()), i3, b().a(i3, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str;
        }
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double parseDouble = Double.parseDouble(str);
        return Double.parseDouble(str2) == 0.0d ? "" : String.valueOf(Math.round((parseDouble / r7) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(L6.l1)) || !this.f8379a.compareAndSet(false, true)) {
            return;
        }
        Ib.a0().q().a(new C4689v5(EnumC4707w5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z2, true, -1)));
    }
}
