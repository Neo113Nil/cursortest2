package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import io.ktor.http.ContentDisposition;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class w5 extends n5 {
    protected final u g;
    private final String h;

    public w5(u uVar, String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
        this.g = uVar;
        this.h = lVar.b();
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.g.e());
        if (this.g.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.g.g().getLabel());
        }
        return hashMap;
    }

    protected abstract n5 a(JSONObject jSONObject);

    protected void a(int i, String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Unable to fetch " + this.g + " ad: server returned " + i);
        }
        this.f4351a.g().a(h2.C, this.g, new AppLovinError(i, str));
    }

    protected void b(JSONObject jSONObject) {
        s0.c(jSONObject, this.f4351a);
        s0.b(jSONObject, this.f4351a);
        s0.a(jSONObject, this.f4351a);
        u.a(jSONObject);
        this.f4351a.s0().a(a(jSONObject));
    }

    protected abstract String e();

    protected abstract String f();

    protected Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.g.e());
        if (this.g.f() != null) {
            hashMap.put(ContentDisposition.Parameters.Size, this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            hashMap.put("require", this.g.g().getLabel());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        z4.a aVar;
        Map map;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Fetching next ad of zone: " + this.g);
        }
        if (((Boolean) this.f4351a.a(c5.b4)).booleanValue() && t7.k() && com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        t7.a(this.f4351a, this.b);
        this.f4351a.g().a(h2.A, this.g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f4351a.l().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f4351a.a(c5.p3)).booleanValue()) {
                aVar = z4.a.a(((Integer) this.f4351a.a(c5.C5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f4351a.B().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f4351a.a(c5.N5)).booleanValue() && !((Boolean) this.f4351a.a(c5.J5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f4351a.a(c5.u5)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4351a.k0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                z4.a a2 = z4.a.a(((Integer) this.f4351a.a(c5.D5)).intValue());
                Map a3 = t7.a(this.f4351a.B().a(h(), false, false));
                if (!((Boolean) this.f4351a.a(c5.T6)).booleanValue()) {
                    a3.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVar = a2;
                map = a3;
            }
            if (t7.h(a()) || t7.j(a())) {
                map.putAll(this.f4351a.l().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.h)) {
                map.put("sts", this.h);
            }
            a.C0085a f = com.applovin.impl.sdk.network.a.a(this.f4351a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f4351a.a(c5.e3)).intValue()).c(((Boolean) this.f4351a.a(c5.f3)).booleanValue()).d(((Boolean) this.f4351a.a(c5.g3)).booleanValue()).c(((Integer) this.f4351a.a(c5.d3)).intValue()).a(aVar).f(true);
            if (andResetCustomPostBody != null) {
                f.a(andResetCustomPostBody);
                f.b(((Boolean) this.f4351a.a(c5.Y5)).booleanValue());
            }
            a aVar2 = new a(f.a(), this.f4351a);
            aVar2.c(c5.l0);
            aVar2.b(c5.m0);
            this.f4351a.s0().a(aVar2);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Unable to fetch ad for zone id: " + this.g, th);
            }
            a(0, th.getMessage());
        }
    }

    class a extends r6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
                HashMap hashMap = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
                CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i), hashMap);
                CollectionUtils.putStringIfValid("ad_zone_id", w5.this.g.e(), hashMap);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.m.a()), hashMap);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.m.b()), hashMap);
                this.f4351a.g().d(h2.B, hashMap);
                w5.this.b(jSONObject);
                return;
            }
            w5.this.a(i, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            w5.this.a(i, str2);
            this.f4351a.E().a("fetchAd", str, i, str2);
        }
    }
}
