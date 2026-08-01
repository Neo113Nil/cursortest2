package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class x7 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    private int f4555a;
    private int b;
    private Uri c;
    private c8 d;
    private final Set e = new HashSet();
    private final Map f = new HashMap();

    private x7() {
    }

    public static x7 a(t8 t8Var, x7 x7Var, y7 y7Var, com.applovin.impl.sdk.l lVar) {
        t8 c;
        if (t8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (x7Var == null) {
            try {
                x7Var = new x7();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                lVar.E().a("VastCompanionAd", th);
                return null;
            }
        }
        if (x7Var.f4555a == 0 && x7Var.b == 0) {
            int parseInt = StringUtils.parseInt((String) t8Var.a().get("width"));
            int parseInt2 = StringUtils.parseInt((String) t8Var.a().get("height"));
            if (parseInt > 0 && parseInt2 > 0) {
                x7Var.f4555a = parseInt;
                x7Var.b = parseInt2;
            }
        }
        x7Var.d = c8.a(t8Var, x7Var.d, lVar);
        if (x7Var.c == null && (c = t8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N)) != null) {
            String d = c.d();
            if (StringUtils.isValidString(d)) {
                x7Var.c = Uri.parse(d);
            }
        }
        g8.a(t8Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O), x7Var.e, y7Var, lVar);
        g8.a(t8Var, x7Var.f, y7Var, lVar);
        return x7Var;
    }

    public Set b() {
        return this.e;
    }

    public Uri c() {
        return this.c;
    }

    public Map d() {
        return this.f;
    }

    public c8 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        if (this.f4555a != x7Var.f4555a || this.b != x7Var.b) {
            return false;
        }
        Uri uri = this.c;
        if (uri == null ? x7Var.c != null : !uri.equals(x7Var.c)) {
            return false;
        }
        c8 c8Var = this.d;
        if (c8Var == null ? x7Var.d != null : !c8Var.equals(x7Var.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? x7Var.e != null : !set.equals(x7Var.e)) {
            return false;
        }
        Map map = this.f;
        Map map2 = x7Var.f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f4555a * 31) + this.b) * 31;
        Uri uri = this.c;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        c8 c8Var = this.d;
        int hashCode2 = (hashCode + (c8Var != null ? c8Var.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f4555a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        c8 a2 = c8.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), lVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            e8 a3 = e8.a(JsonUtils.getJSONObject(jSONArray, i3, (JSONObject) null), lVar);
            if (a3 != null) {
                hashSet.add(a3);
            }
        }
        x7 x7Var = new x7();
        x7Var.f4555a = i;
        x7Var.b = i2;
        x7Var.c = parse;
        x7Var.d = a2;
        x7Var.e.addAll(hashSet);
        return x7Var;
    }

    @Override // com.applovin.impl.v4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f4555a);
        JsonUtils.putInt(jSONObject, "height", this.b);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        c8 c8Var = this.d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", c8Var != null ? c8Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((e8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
