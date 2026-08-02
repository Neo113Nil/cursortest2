package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552Ad {

    /* renamed from: d, reason: collision with root package name */
    public String f7597d;

    /* renamed from: e, reason: collision with root package name */
    public String f7598e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f7599g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7600h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7601j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7594a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7595b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7596c = new HashMap();
    public final ArrayList i = new ArrayList();

    public C0552Ad(String str, long j5) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f7597d = "";
        this.f7600h = false;
        this.f7601j = false;
        this.f7598e = str;
        this.f = j5;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f7599g = new JSONObject(str);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.jb)).booleanValue() && a()) {
                return;
            }
            if (this.f7599g.optInt("status", -1) != 1) {
                this.f7600h = false;
                U2.j.i("App settings could not be fetched successfully.");
                return;
            }
            this.f7600h = true;
            this.f7597d = this.f7599g.optString("app_id");
            JSONArray optJSONArray2 = this.f7599g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f7595b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f7596c.put(optString2, new C0596Ga(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f7599g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                    this.f7594a.add(optJSONArray3.optString(i5));
                }
            }
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.w6)).booleanValue() && (optJSONObject2 = this.f7599g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    this.i.add(optJSONArray.get(i6).toString());
                }
            }
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.S5)).booleanValue() || (optJSONObject = this.f7599g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f7601j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e3) {
            U2.j.j("Exception occurred while processing app setting json", e3);
            P2.o.f4767B.f4774g.i("AppSettings.parseAppSettingsJson", e3);
        }
    }

    public final boolean a() {
        if (!TextUtils.isEmpty(this.f7598e) && this.f7599g != null) {
            A7 a7 = F7.mb;
            Q2.r rVar = Q2.r.f5053d;
            long longValue = ((Long) rVar.f5056c.a(a7)).longValue();
            A7 a72 = F7.lb;
            D7 d7 = rVar.f5056c;
            if (((Boolean) d7.a(a72)).booleanValue() && !TextUtils.isEmpty(this.f7598e)) {
                longValue = this.f7599g.optLong("cache_ttl_sec", ((Long) d7.a(a7)).longValue());
            }
            P2.o.f4767B.f4776j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (longValue >= 0) {
                long j5 = this.f;
                if (j5 > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j5) > longValue) {
                    this.f7594a.clear();
                    this.f7595b.clear();
                    this.f7596c.clear();
                    this.f7597d = "";
                    this.f7598e = "";
                    this.f7599g = null;
                    this.f7600h = false;
                    this.i.clear();
                    this.f7601j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
