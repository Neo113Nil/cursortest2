package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Pq {

    /* renamed from: a, reason: collision with root package name */
    public final String f11126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11127b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f11128c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f11129d;

    public Pq(JsonReader jsonReader) {
        JSONObject f02 = N4.b.f0(jsonReader);
        this.f11129d = f02;
        this.f11126a = f02.optString("ad_html", null);
        this.f11127b = f02.optString("ad_base_url", null);
        this.f11128c = f02.optJSONObject("ad_json");
    }
}
