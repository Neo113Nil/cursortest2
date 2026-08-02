package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1473qc {

    /* renamed from: a, reason: collision with root package name */
    public final List f15125a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15126b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15127c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15128d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15129e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15130g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f15131h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15132j;

    /* renamed from: k, reason: collision with root package name */
    public final long f15133k;

    public C1473qc(JSONObject jSONObject) {
        this.f = jSONObject.optString("url");
        this.f15126b = jSONObject.optString("base_uri");
        this.f15127c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        this.f15128d = optString != null && (optString.equals("1") || optString.equals("true"));
        String optString2 = jSONObject.optString("cookies_include", "true");
        this.f15129e = optString2 != null && (optString2.equals("1") || optString2.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString3 = jSONObject.optString("errors");
        this.f15125a = optString3 == null ? null : Arrays.asList(optString3.split(","));
        this.f15130g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f15131h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        String optString4 = jSONObject.optString("start_time");
        Long l5 = -1L;
        if (!TextUtils.isEmpty(optString4)) {
            try {
                l5 = Long.valueOf(optString4);
            } catch (NumberFormatException unused) {
            }
        }
        this.f15132j = l5.longValue();
        String optString5 = jSONObject.optString("end_time");
        Long l6 = -1L;
        if (!TextUtils.isEmpty(optString5)) {
            try {
                l6 = Long.valueOf(optString5);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f15133k = l6.longValue();
    }
}
