package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.na;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f4866a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;

    public m0(f2 base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f4866a = base64Wrapper;
        this.b = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }

    public final d0 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new JSONException("Missing response");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject(U3.i.K);
        JSONArray jSONArray = jSONObject2.getJSONArray("elements");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        a(jSONArray, linkedHashMap, linkedHashMap2);
        String string = jSONObject2.getString("template");
        String optString = jSONObject.optString("name");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String string2 = jSONObject.getString("ad_id");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = this.e;
        String optString2 = jSONObject.optString("baseurl");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        na c = c(jSONObject.optJSONObject("infoicon"));
        String string3 = jSONObject.getString("cgn");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = jSONObject.getString("creative");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String optString3 = jSONObject.optString("media-type");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        String str2 = this.b;
        String a2 = n0.a(str2);
        String string5 = jSONObject.getString("link");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String optString4 = jSONObject.optString("deep-link");
        Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
        String string6 = jSONObject.getString("to");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        int i = this.c;
        String str3 = this.d;
        t1 t1Var = (t1) linkedHashMap.get("body");
        if (t1Var != null) {
            return new d0(optString, string2, optString2, str, c, string3, string4, optString3, linkedHashMap, str2, a2, string5, optString4, string6, i, str3, string, t1Var, linkedHashMap2, yf.c.a(jSONObject.optString("renderingengine")), a(jSONObject.optJSONArray("scripts")), b(jSONObject.optJSONObject("events")), null, null, n0.a(jSONObject.optInt("mtype")), i4.c.a(jSONObject.optInt("clkp")), this.f, 12582912, null);
        }
        throw new IllegalStateException("WebView AdUnit does not have a template html body asset");
    }

    public final Map b(JSONObject jSONObject) {
        Iterator<String> keys;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                }
                hashMap.put(next, arrayList);
            }
        }
        return hashMap;
    }

    public final na c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new na(null, null, null, null, null, null, 63, null);
        }
        String optString = jSONObject.optString("imageurl");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = jSONObject.optString("clickthroughUrl");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        return new na(optString, optString2, na.b.c.a(jSONObject.optInt(U3.i.L)), d(jSONObject.optJSONObject("margin")), d(jSONObject.optJSONObject("padding")), d(jSONObject.optJSONObject(ContentDisposition.Parameters.Size)));
    }

    public final na.a d(JSONObject jSONObject) {
        return jSONObject != null ? new na.a(jSONObject.optDouble("w"), jSONObject.optDouble("h")) : new na.a(0.0d, 0.0d, 3, null);
    }

    public final void a(JSONArray jSONArray, Map map, Map map2) {
        for (JSONObject jSONObject : g8.asList(jSONArray)) {
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("value");
            String optString = jSONObject.optString("param");
            if (string2 != null) {
                int hashCode = string2.hashCode();
                if (hashCode != -1333900842) {
                    if (hashCode != 3213227) {
                        if (hashCode == 106436749 && string2.equals("param")) {
                            map2.put(optString, string3);
                            if (string != null) {
                                int hashCode2 = string.hashCode();
                                if (hashCode2 != -1422292723) {
                                    if (hashCode2 != -1389119727) {
                                        if (hashCode2 != -878282975) {
                                            if (hashCode2 == -315925656 && string.equals(CampaignEx.JSON_KEY_REWARD_AMOUNT)) {
                                                Intrinsics.checkNotNull(string3);
                                                a(string3);
                                            }
                                        } else if (string.equals("reward_currency")) {
                                            this.d = string3;
                                        }
                                    } else if (string.equals("impression_id")) {
                                        this.e = string3;
                                    }
                                } else if (string.equals("adm.js")) {
                                    f2 f2Var = this.f4866a;
                                    Intrinsics.checkNotNull(string3);
                                    this.f = f2Var.b(string3);
                                }
                            }
                        }
                    } else if (string2.equals("html")) {
                        Intrinsics.checkNotNull(optString);
                        if (optString.length() == 0) {
                            optString = "body";
                        }
                    }
                } else if (string2.equals("preCachedVideo")) {
                    this.b = string3;
                }
                map.put(optString, new t1(string2, string, string3));
            }
            Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                optString = string;
            }
            map.put(optString, new t1(string2, string, string3));
        }
    }

    public final void a(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        this.c = i;
    }

    public final List a(JSONArray jSONArray) {
        List asList;
        return (jSONArray == null || (asList = g8.asList(jSONArray)) == null) ? CollectionsKt.emptyList() : asList;
    }
}
