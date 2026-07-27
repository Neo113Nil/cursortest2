package com.chartboost.sdk.internal.Model;

import com.chartboost.sdk.impl.f5;
import com.chartboost.sdk.impl.fi;
import com.chartboost.sdk.impl.fk;
import com.chartboost.sdk.impl.gi;
import com.chartboost.sdk.impl.k7;
import com.chartboost.sdk.impl.l1;
import com.chartboost.sdk.impl.p2;
import com.chartboost.sdk.impl.vd;
import com.chartboost.sdk.impl.wd;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.LGPD;
import com.ironsource.U3;
import com.moloco.sdk.internal.services.bidtoken.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {
    public final boolean A;
    public final C0226a B;
    public b C;
    public final String D;
    public final long E;
    public final long F;
    public final fi G;
    public final fk H;
    public final vd I;
    public final List J;
    public final boolean K;
    public final EndpointConfig L;

    /* renamed from: a, reason: collision with root package name */
    public final String f5106a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final int o;
    public final int p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final String y;
    public final String z;

    public a(JSONObject jSONObject) {
        List list;
        this.f5106a = jSONObject.optString("configVariant");
        this.b = jSONObject.optBoolean("prefetchDisable");
        this.c = jSONObject.optBoolean("publisherDisable");
        this.B = C0226a.a(jSONObject);
        try {
            this.C = b.a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.D = jSONObject.optString("publisherWarning", null);
        this.E = jSONObject.optLong("maxBytes", 104857600L);
        this.F = jSONObject.optLong("ttl", 604800000L);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.isEmpty()) {
                    arrayList.add(optString);
                }
            }
        }
        this.d = Collections.unmodifiableList(arrayList);
        JSONObject optJSONObject = jSONObject.optJSONObject("trackingLevels");
        optJSONObject = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.e = optJSONObject.optBoolean("critical", true);
        this.l = optJSONObject.optBoolean("includeStackTrace", true);
        this.f = optJSONObject.optBoolean("error");
        this.g = optJSONObject.optBoolean("debug");
        this.h = optJSONObject.optBoolean("session");
        this.i = optJSONObject.optBoolean("system");
        this.j = optJSONObject.optBoolean("timing");
        this.k = optJSONObject.optBoolean("user");
        this.m = optJSONObject.optBoolean("loggerCallerInfoCache", true);
        this.G = gi.b(jSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.H = fk.a(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("omSdk");
        this.I = wd.b(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = jSONObject.optJSONObject(U3.i.K);
        optJSONObject4 = optJSONObject4 == null ? new JSONObject() : optJSONObject4;
        this.n = optJSONObject4.optInt("cacheMaxBytes", 104857600);
        int optInt = optJSONObject4.optInt("cacheMaxUnits", 10);
        this.o = optInt > 0 ? optInt : 10;
        this.p = (int) TimeUnit.SECONDS.toDays(optJSONObject4.optInt("cacheTTLs", p2.f4951a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("directories");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String optString2 = optJSONArray2.optString(i2);
                if (!optString2.isEmpty()) {
                    arrayList2.add(optString2);
                }
            }
        }
        this.q = Collections.unmodifiableList(arrayList2);
        this.r = optJSONObject4.optBoolean("enabled", l());
        this.s = optJSONObject4.optBoolean("inplayEnabled", true);
        this.t = optJSONObject4.optBoolean("interstitialEnabled", true);
        int optInt2 = optJSONObject4.optInt("invalidatePendingImpression", 3);
        this.u = optInt2 <= 0 ? 3 : optInt2;
        this.v = optJSONObject4.optBoolean("lockOrientation", true);
        this.w = optJSONObject4.optInt("prefetchSession", 3);
        this.x = optJSONObject4.optBoolean("rewardVideoEnabled", true);
        String optString3 = optJSONObject4.optString("version", s.f10770a);
        this.y = optString3;
        this.z = String.format("%s/%s%s", U3.i.K, optString3, "/prefetch");
        this.A = optJSONObject4.optBoolean("redirectOpenToNativeBrowser", false);
        JSONArray optJSONArray3 = jSONObject.optJSONArray("event_trackers");
        if (jSONObject.has("event_trackers") && optJSONArray3 != null && optJSONArray3.length() == 0) {
            list = Collections.EMPTY_LIST;
        } else if (!jSONObject.has("event_trackers") || optJSONArray3 == null) {
            list = null;
        } else {
            try {
                List a2 = k7.a(optJSONArray3);
                list = (a2 == null || a2.isEmpty()) ? list : new ArrayList(a2);
                list = Collections.EMPTY_LIST;
            } catch (Exception unused) {
                list = Collections.EMPTY_LIST;
            }
        }
        this.J = list != null ? Collections.unmodifiableList(list) : null;
        this.K = jSONObject.optBoolean("nrp_waterfall_enabled", false);
        JSONObject optJSONObject5 = jSONObject.optJSONObject("nrp_waterfall_endpoints");
        if (optJSONObject5 != null) {
            this.L = new EndpointConfig(optJSONObject5.has("banner") ? optJSONObject5.optString("banner", "https://tracking.da.chartboost.com/unified/v1/sdk/banner") : "https://tracking.da.chartboost.com/unified/v1/sdk/banner", optJSONObject5.has("interstitial") ? optJSONObject5.optString("interstitial", "https://tracking.da.chartboost.com/unified/v1/sdk/interstitial") : "https://tracking.da.chartboost.com/unified/v1/sdk/interstitial", optJSONObject5.has("rewarded") ? optJSONObject5.optString("rewarded", "https://tracking.da.chartboost.com/unified/v1/sdk/rewarded") : "https://tracking.da.chartboost.com/unified/v1/sdk/rewarded");
        } else {
            this.L = EndpointConfig.INSTANCE.a();
        }
    }

    public static boolean l() {
        int[] iArr = {4, 4, 2};
        String a2 = l1.b().a();
        if (a2 != null && a2.length() > 0) {
            String[] split = a2.replaceAll("[^\\d.]", "").split("\\.");
            for (int i = 0; i < split.length && i < 3; i++) {
                try {
                    if (Integer.parseInt(split[i]) > iArr[i]) {
                        return true;
                    }
                    if (Integer.parseInt(split[i]) < iArr[i]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public C0226a a() {
        return this.B;
    }

    public List b() {
        return this.J;
    }

    public EndpointConfig c() {
        return this.L;
    }

    public vd d() {
        return this.I;
    }

    public fk e() {
        return this.H;
    }

    public boolean f() {
        return this.b;
    }

    public boolean g() {
        return this.c;
    }

    public String h() {
        return this.D;
    }

    public fi i() {
        return this.G;
    }

    public boolean j() {
        return this.K;
    }

    public boolean k() {
        return this.r;
    }

    public boolean m() {
        return this.v;
    }

    public f5 n() {
        return new f5(this.f5106a, this.r, this.y, this.K, this.L);
    }

    /* renamed from: com.chartboost.sdk.internal.Model.a$a, reason: collision with other inner class name */
    public static class C0226a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5107a;

        public static C0226a a(JSONObject jSONObject) {
            C0226a c0226a = new C0226a();
            c0226a.f5107a = jSONObject.optBoolean("bannerEnable", true);
            return c0226a;
        }

        public boolean a() {
            return this.f5107a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public HashSet f5108a;

        public static b a(JSONObject jSONObject) {
            b bVar = new b();
            HashSet hashSet = new HashSet();
            hashSet.add(CCPA.CCPA_STANDARD);
            hashSet.add(COPPA.COPPA_STANDARD);
            hashSet.add(LGPD.LGPD_STANDARD);
            JSONArray optJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                a(optJSONArray, hashSet, length);
                a(hashSet, length);
            }
            bVar.f5108a = hashSet;
            return bVar;
        }

        public static void a(JSONArray jSONArray, HashSet hashSet, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                hashSet.add(jSONArray.getString(i2));
            }
        }

        public static void a(HashSet hashSet, int i) {
            if (i == 0) {
                hashSet.clear();
            }
        }

        public HashSet a() {
            return this.f5108a;
        }
    }
}
