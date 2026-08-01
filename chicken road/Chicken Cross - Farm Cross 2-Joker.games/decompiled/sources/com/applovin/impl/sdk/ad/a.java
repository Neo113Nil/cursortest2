package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.adview.e;
import com.applovin.impl.c4;
import com.applovin.impl.l4;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class a extends b implements v4 {
    private final String q;
    private final String r;
    private final String s;
    private final l4 t;
    private c4 u;

    public a(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        super(jSONObject, jSONObject2, lVar);
        this.q = h1();
        this.r = o1();
        this.s = n1();
        this.t = new l4(this);
        String j1 = j1();
        if (StringUtils.isValidString(j1)) {
            this.u = new c4(this, j1, lVar);
        }
    }

    private String n1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(m5 m5Var) {
        m5Var.b("html", this.q);
        m5Var.b("stream_url", this.s);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean D0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void G0() {
        m5 m5Var = this.synchronizedAdObject;
        if (m5Var != null) {
            m5Var.a(new Consumer() { // from class: com.applovin.impl.sdk.ad.a$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    a.this.o((m5) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.q);
            JsonUtils.putString(this.adObject, "stream_url", this.s);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String K() {
        return this.r;
    }

    public void a(Uri uri) {
        m5 m5Var = this.synchronizedAdObject;
        if (m5Var != null) {
            m5Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public void b(List list) {
        String h1 = h1();
        if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(h1)) {
            return;
        }
        Map m = m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String uri = ((Uri) it.next()).toString();
            String str = (String) m.get(uri);
            if (StringUtils.isValidString(str)) {
                h1 = StringUtils.replace(h1, uri, str);
            }
        }
        d(h1);
    }

    public void d(String str) {
        m5 m5Var = this.synchronizedAdObject;
        if (m5Var != null) {
            m5Var.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri e0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : f1();
    }

    public long e1() {
        return getLongFromAdObject("ad_load_timeout_ms", 0L);
    }

    public Uri f1() {
        String stringFromAdObject = getStringFromAdObject(CampaignEx.JSON_KEY_CLICK_URL, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public e.a g1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        JSONObject jSONObject;
        m5 m5Var = this.synchronizedFullResponse;
        if (m5Var != null) {
            jSONObject = m5Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                deepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObject = deepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject2, "html", this.q);
            JsonUtils.putString(jSONObject2, "video", this.r);
            JsonUtils.putString(jSONObject2, "stream_url", this.s);
        }
        return jSONObject;
    }

    public String h1() {
        return getStringFromAdObject("html", "");
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return n0() != null;
    }

    public c4 i1() {
        return this.u;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.j4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.g0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public String j1() {
        return getStringFromAdObject("mpd_url", "");
    }

    public float k1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public String l1() {
        return this.s;
    }

    public int m1() {
        return getIntFromAdObject("required_mpd_segment_cache_percent", 0);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri n0() {
        String n1 = n1();
        if (StringUtils.isValidString(n1)) {
            return Uri.parse(n1);
        }
        String o1 = o1();
        if (StringUtils.isValidString(o1)) {
            return Uri.parse(o1);
        }
        return null;
    }

    public String o1() {
        return getStringFromAdObject("video", "");
    }

    public boolean p1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void q1() {
        m5 m5Var = this.synchronizedAdObject;
        if (m5Var != null) {
            m5Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean z0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.j4
    public l4 getAdEventTracker() {
        return this.t;
    }

    public static a a(JSONObject jSONObject, l lVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null || (jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null)) == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, lVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> keys = jSONObject4.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string3 = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                aVar.a(next, string3);
            }
        }
        c4 i1 = aVar.i1();
        if (i1 != null && !i1.f()) {
            return null;
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.a(Uri.parse(string2));
        }
        return aVar;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.q);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.r);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.s);
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
