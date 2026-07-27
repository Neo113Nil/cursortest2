package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class u7 extends com.applovin.impl.sdk.ad.b implements v4 {
    private final Set A;
    private final String q;
    private final String r;
    private final d8 s;
    private final long t;
    private final h8 u;
    private final x7 v;
    private final String w;
    private final w7 x;
    private final q4 y;
    private final Set z;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f4523a;
        private JSONObject b;
        private com.applovin.impl.sdk.l c;
        private long d;
        private String e;
        private String f;
        private d8 g;
        private h8 h;
        private x7 i;
        private w7 j;
        private Set k;
        private Set l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b b(Set set) {
            this.k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f4523a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.l lVar) {
            if (lVar != null) {
                this.c = lVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f = str;
            return this;
        }

        public b a(d8 d8Var) {
            this.g = d8Var;
            return this;
        }

        public b a(h8 h8Var) {
            this.h = h8Var;
            return this;
        }

        public b a(x7 x7Var) {
            this.i = x7Var;
            return this;
        }

        public b a(w7 w7Var) {
            this.j = w7Var;
            return this;
        }

        public b a(Set set) {
            this.l = set;
            return this;
        }

        public b a(long j) {
            this.d = j;
            return this;
        }

        public u7 a() {
            return new u7(this);
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set h1() {
        x7 x7Var = this.v;
        return x7Var != null ? x7Var.b() : Collections.emptySet();
    }

    private String k1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o(m5 m5Var) {
        return t7.a(m5Var.a("vimp_urls", new JSONObject()), getClCode(), null, k1(), L(), N0(), this.sdk);
    }

    private Set o1() {
        h8 h8Var = this.u;
        return h8Var != null ? h8Var.b() : Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List B() {
        List a2;
        m5 m5Var = this.synchronizedAdObject;
        if (m5Var != null) {
            return (List) m5Var.a(new Function() { // from class: com.applovin.impl.u7$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List o;
                    o = u7.this.o((m5) obj);
                    return o;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = t7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, k1(), L(), N0(), this.sdk);
        }
        return a2;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && f1() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean D0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void G0() {
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String K() {
        return this.w;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public void d(String str) {
        m5 m5Var = this.synchronizedAdObject;
        if (m5Var != null) {
            m5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri e0() {
        return f1();
    }

    public w7 e1() {
        return this.x;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7) || !super.equals(obj)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        String str = this.q;
        if (str == null ? u7Var.q != null : !str.equals(u7Var.q)) {
            return false;
        }
        String str2 = this.r;
        if (str2 == null ? u7Var.r != null : !str2.equals(u7Var.r)) {
            return false;
        }
        d8 d8Var = this.s;
        if (d8Var == null ? u7Var.s != null : !d8Var.equals(u7Var.s)) {
            return false;
        }
        h8 h8Var = this.u;
        if (h8Var == null ? u7Var.u != null : !h8Var.equals(u7Var.u)) {
            return false;
        }
        x7 x7Var = this.v;
        if (x7Var == null ? u7Var.v != null : !x7Var.equals(u7Var.v)) {
            return false;
        }
        w7 w7Var = this.x;
        if (w7Var == null ? u7Var.x != null : !w7Var.equals(u7Var.x)) {
            return false;
        }
        Set set = this.z;
        if (set == null ? u7Var.z != null : !set.equals(u7Var.z)) {
            return false;
        }
        Set set2 = this.A;
        Set set3 = u7Var.A;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public Uri f1() {
        h8 h8Var = this.u;
        if (h8Var != null) {
            return h8Var.c();
        }
        return null;
    }

    public x7 g1() {
        return this.v;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.t;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List g;
        h8 h8Var = this.u;
        return (h8Var == null || (g = h8Var.g()) == null || g.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        d8 d8Var = this.s;
        int hashCode4 = (hashCode3 + (d8Var != null ? d8Var.hashCode() : 0)) * 31;
        h8 h8Var = this.u;
        int hashCode5 = (hashCode4 + (h8Var != null ? h8Var.hashCode() : 0)) * 31;
        x7 x7Var = this.v;
        int hashCode6 = (hashCode5 + (x7Var != null ? x7Var.hashCode() : 0)) * 31;
        w7 w7Var = this.x;
        int hashCode7 = (hashCode6 + (w7Var != null ? w7Var.hashCode() : 0)) * 31;
        Set set = this.z;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.A;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public String i1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.j4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.x != null;
    }

    public c j1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public a8 l1() {
        h8 h8Var = this.u;
        if (h8Var != null) {
            return h8Var.f();
        }
        return null;
    }

    public long m1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri n0() {
        i8 q1 = q1();
        if (q1 != null) {
            return q1.e();
        }
        return null;
    }

    public d8 n1() {
        return this.s;
    }

    public h8 p1() {
        return this.u;
    }

    public i8 q1() {
        Long f = s0.f(this.sdk);
        return this.u.a(f != null ? f.longValue() : 0L);
    }

    public boolean r1() {
        return l1() != null;
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void t1() {
        m5 m5Var = this.synchronizedAdObject;
        if (m5Var != null) {
            m5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.q + "', adDescription='" + this.r + "', systemInfo=" + this.s + ", videoCreative=" + this.u + ", companionAd=" + this.v + ", adVerifications=" + this.x + ", impressionTrackers=" + this.z + ", errorTrackers=" + this.A + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean y1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean z0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    private u7(b bVar) {
        super(bVar.f4523a, bVar.b, bVar.c);
        this.q = bVar.e;
        this.s = bVar.g;
        this.r = bVar.f;
        this.u = bVar.h;
        this.v = bVar.i;
        this.x = bVar.j;
        this.z = bVar.k;
        this.A = bVar.l;
        this.y = new q4(this);
        Uri n0 = n0();
        if (n0 != null) {
            this.w = n0.toString();
        } else {
            this.w = "";
        }
        this.t = bVar.d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.sdk.Q().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.z;
        }
        if (dVar == d.VIDEO_CLICK) {
            return o1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return h1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return l1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return l1().f();
        }
        if (dVar == d.ERROR) {
            return this.A;
        }
        this.sdk.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.sdk.Q().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.j4
    public q4 getAdEventTracker() {
        return this.y;
    }

    private Set a(c cVar, String[] strArr) {
        Map d2;
        x7 x7Var;
        h8 h8Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (h8Var = this.u) != null) {
                d2 = h8Var.e();
            } else {
                d2 = (cVar != c.COMPANION_AD || (x7Var = this.v) == null) ? null : x7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (d2 != null && !d2.isEmpty()) {
                for (String str : strArr) {
                    if (d2.containsKey(str)) {
                        hashSet.addAll((Collection) d2.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    public static u7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f4523a = jSONObject3;
        bVar.c = lVar;
        bVar.d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.g = d8.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), lVar);
        bVar.h = h8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), lVar);
        bVar.i = x7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), lVar);
        bVar.j = w7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), lVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            e8 a2 = e8.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), lVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        bVar.k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            e8 a3 = e8.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), lVar);
            if (a3 != null) {
                hashSet2.add(a3);
            }
        }
        bVar.l = hashSet2;
        u7 u7Var = new u7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> keys = jSONObject4.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                u7Var.a(next, string);
            }
        }
        return u7Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.t);
        JsonUtils.putString(jSONObject, "title", this.q);
        JsonUtils.putString(jSONObject, "ad_description", this.r);
        d8 d8Var = this.s;
        if (d8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", d8Var.a());
        }
        h8 h8Var = this.u;
        if (h8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", h8Var.a());
        }
        x7 x7Var = this.v;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", x7Var.a());
        }
        w7 w7Var = this.x;
        if (w7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", w7Var.a());
        }
        if (this.z != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.z.iterator();
            while (it.hasNext()) {
                jSONArray.put(((e8) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.A != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.A.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((e8) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : m().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        m5 m5Var = this.synchronizedFullResponse;
        if (m5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", m5Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}
