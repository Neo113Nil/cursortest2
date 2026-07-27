package sg.bigo.ads.U0;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.B;

/* loaded from: classes3.dex */
public abstract class b implements sg.bigo.ads.P.c {
    public final e A;
    public final long B;
    public final sg.bigo.ads.N.c C;
    public final int D;
    public int E;
    public boolean G;
    public long H;
    public sg.bigo.ads.T0.q I;
    public sg.bigo.ads.T0.q J;
    public final String K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final String O;
    public final double Q;
    public final String R;
    public final String S;
    public final boolean T;
    public final String U;
    public final String V;
    public final String W;
    public final m X;
    public final int Y;
    public String Z;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12568a;
    public int a0;
    public final ArrayList b;
    public int b0;
    public final sg.bigo.ads.T0.p c;
    public boolean c0;
    public final long d;
    public int d0;
    public boolean e0;
    public final String f;
    public final String g;
    public int g0;
    public final String h;
    public final int h0;
    public final String i;
    public sg.bigo.ads.P.t i0;
    public final String j;
    public final HashMap j0;
    public final int k;
    public final String k0;
    public final int l;
    public final int l0;
    public final long m;
    public final int m0;
    public final String n;
    public final int n0;
    public final String o;
    public final int o0;
    public final n p;
    public final int p0;
    public final r[] q;
    public final String q0;
    public final r[] r;
    public final String r0;
    public final r[] s;
    public final String s0;
    public final r[] t;
    public final int t0;
    public final ArrayList u;
    public final String v;
    public final int v0;
    public final long w;
    public final String w0;
    public final String x;
    public final String y;
    public final j z;
    public int F = 0;
    public int P = 2;
    public int f0 = 1;
    public final sg.bigo.ads.P.n u0 = new sg.bigo.ads.P.n();
    public final long e = SystemClock.elapsedRealtime();

    public b(long j, sg.bigo.ads.N.c cVar, sg.bigo.ads.T0.p pVar, JSONObject jSONObject) {
        this.l0 = 1;
        this.m0 = 0;
        this.n0 = 1;
        this.v0 = 0;
        this.w0 = "";
        this.B = j;
        this.C = cVar;
        this.c = pVar;
        this.f = jSONObject.optString("ad_id", "");
        this.g = jSONObject.optString("title", "");
        this.h = jSONObject.optString("description", "");
        this.i = jSONObject.optString("cta", "");
        String optString = jSONObject.optString("dsp_name", "");
        this.j = optString;
        this.T = "BigoDsp".equalsIgnoreCase(optString);
        this.k = jSONObject.optInt("adx_type", 0);
        this.l = jSONObject.optInt("ad_type", -1);
        this.m = jSONObject.optLong("sid");
        this.n = jSONObject.optString(CampaignEx.JSON_KEY_CREATIVE_ID, "");
        this.o = jSONObject.optString("series_id", "");
        JSONObject optJSONObject = jSONObject.optJSONObject(ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
        if (optJSONObject != null) {
            this.p = new n(optJSONObject);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new r(optJSONObject2));
                }
            }
            r[] rVarArr = new r[arrayList.size()];
            this.r = rVarArr;
            this.r = (r[]) arrayList.toArray(rVarArr);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject3 != null) {
                    arrayList2.add(new r(optJSONObject3));
                }
            }
            r[] rVarArr2 = new r[arrayList2.size()];
            this.q = rVarArr2;
            this.q = (r[]) arrayList2.toArray(rVarArr2);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (optJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject4 != null) {
                    arrayList3.add(new r(optJSONObject4));
                }
            }
            r[] rVarArr3 = new r[arrayList3.size()];
            this.s = rVarArr3;
            this.s = (r[]) arrayList3.toArray(rVarArr3);
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (optJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                JSONObject optJSONObject5 = optJSONArray4.optJSONObject(i4);
                if (optJSONObject5 != null) {
                    arrayList4.add(new r(optJSONObject5));
                }
            }
            r[] rVarArr4 = new r[arrayList4.size()];
            this.t = rVarArr4;
            this.t = (r[]) arrayList4.toArray(rVarArr4);
        }
        this.u = new ArrayList();
        JSONArray optJSONArray5 = jSONObject.optJSONArray("om_data");
        if (optJSONArray5 != null) {
            this.u = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                this.u.add(new l(optJSONArray5.optJSONObject(i5)));
            }
        }
        this.v = jSONObject.optString("enc_price", "");
        this.z = new j(jSONObject);
        this.A = new e(jSONObject);
        this.w = jSONObject.optLong("switch_bit_map", 0L);
        this.x = jSONObject.optString("abflags", "");
        this.d = jSONObject.optLong("expired_interval", 0L);
        this.y = jSONObject.optString("mapping_slot", "");
        jSONObject.optLong("probe_interval");
        this.D = jSONObject.optInt("playable_ad_switch", 0);
        this.R = jSONObject.optString("req_slot");
        a(jSONObject.optString("interstitial_style_getad_config"), false);
        a(jSONObject.optString("common_style_config"), true);
        sg.bigo.ads.P.n nVar = this.u0;
        String optString2 = jSONObject.optString("ad_form");
        nVar.getClass();
        if (!TextUtils.isEmpty(optString2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString2);
                nVar.f12486a = jSONObject2.optLong("form_id", 0L);
                nVar.c = jSONObject2.optString("title", "");
                nVar.b = jSONObject2.optString("ad_lang", "en");
                nVar.d = jSONObject2.optString("description", "");
                nVar.g = jSONObject2.optString("purpose", "");
                nVar.i = jSONObject2.optInt("color", 0);
                nVar.j = jSONObject2.optInt("form_style_id", 0);
                nVar.h = jSONObject2.optString("extra", "");
                nVar.a(jSONObject2);
                JSONObject optJSONObject6 = jSONObject2.optJSONObject("icon");
                if (optJSONObject6 != null) {
                    nVar.f = new sg.bigo.ads.P.o(optJSONObject6);
                }
                JSONArray optJSONArray6 = jSONObject2.optJSONArray("questions");
                if (optJSONArray6 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                        JSONObject optJSONObject7 = optJSONArray6.optJSONObject(i6);
                        if (optJSONObject7 != null) {
                            arrayList5.add(new sg.bigo.ads.O.e(optJSONObject7));
                        }
                    }
                    sg.bigo.ads.O.e[] eVarArr = new sg.bigo.ads.O.e[arrayList5.size()];
                    nVar.k = eVarArr;
                    nVar.k = (sg.bigo.ads.O.e[]) arrayList5.toArray(eVarArr);
                }
                sg.bigo.ads.O.d dVar = nVar.l;
                String optString3 = jSONObject2.optString(ShareConstants.WEB_DIALOG_PARAM_PRIVACY, "");
                dVar.getClass();
                if (!TextUtils.isEmpty(optString3)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(optString3);
                        dVar.f12470a = jSONObject3.optString("name", "");
                        dVar.b = jSONObject3.optString("url", "");
                    } catch (JSONException unused) {
                    }
                }
                nVar.m.a(jSONObject2.optString("feedback", ""));
            } catch (JSONException unused2) {
            }
        }
        this.L = jSONObject.optString(U3.i.F0);
        this.K = jSONObject.optString("sdk_style_id");
        this.M = jSONObject.optInt("banner_show_ad", 0) == 1;
        this.N = jSONObject.optInt("banner_show_domain", 0) == 1;
        this.O = jSONObject.optString("ru_ad_marker");
        this.Q = (jSONObject.optLong("bid_price", 0L) * 1.0d) / 1.0E8d;
        this.S = jSONObject.optString("adx_country");
        this.h0 = jSONObject.optInt(U3.i.n, 0);
        if (sg.bigo.ads.P.a.b(this.l)) {
            this.f12568a = jSONObject;
        }
        this.U = jSONObject.optString("ad_bundle_id", "");
        this.V = jSONObject.optString("pop_h5");
        this.W = jSONObject.optString("pop_img");
        JSONObject optJSONObject8 = jSONObject.optJSONObject("pop_page");
        if (optJSONObject8 != null) {
            this.X = new m(optJSONObject8);
        }
        int optInt = jSONObject.optInt("ad_resp_type");
        this.Y = optInt;
        if (optInt == 2) {
            JSONArray optJSONArray7 = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
            ArrayList arrayList6 = null;
            if (optJSONArray7 != null && optJSONArray7.length() > 0) {
                ArrayList arrayList7 = null;
                for (int i7 = 0; i7 < optJSONArray7.length(); i7++) {
                    JSONObject optJSONObject9 = optJSONArray7.optJSONObject(i7);
                    if (optJSONObject9 != null) {
                        b a2 = a(j, cVar, pVar, optJSONObject9);
                        if (a2 != null) {
                            arrayList7 = arrayList7 == null ? new ArrayList() : arrayList7;
                            a2.Y = this.Y;
                            arrayList7.add(a2);
                        } else {
                            sg.bigo.ads.s1.b.a(1005, 10205, "Error ad in ads", (sg.bigo.ads.P.c) null);
                        }
                    }
                }
                arrayList6 = arrayList7;
            }
            this.b = arrayList6;
        }
        this.j0 = B.a(jSONObject.optString("pub_extra_info"));
        this.k0 = jSONObject.optString("dsp_extra");
        this.l0 = jSONObject.optInt("native_banner_fill_strategy", 1);
        this.m0 = jSONObject.optInt("guide_type", 0);
        this.n0 = jSONObject.optInt("native_banner_click_type", 0);
        this.o0 = jSONObject.optInt("is_interactive", 0);
        this.v0 = jSONObject.optInt("vpaid_imp_method", 0);
        this.w0 = jSONObject.optString("sponsored", "");
        JSONObject optJSONObject10 = jSONObject.optJSONObject("playable_cfg");
        if (optJSONObject10 != null) {
            this.p0 = optJSONObject10.optInt("playable_load_type", 0);
            this.q0 = optJSONObject10.optString("zip_url", "");
            this.r0 = optJSONObject10.optString("html_path", "");
            JSONObject optJSONObject11 = optJSONObject10.optJSONObject("param_json");
            if (optJSONObject11 != null) {
                this.t0 = optJSONObject11.optInt("js_click", 0);
            }
            this.s0 = optJSONObject11 != null ? optJSONObject11.toString() : "";
        }
    }

    public static b a(long j, sg.bigo.ads.N.c cVar, sg.bigo.ads.T0.p pVar, String str) {
        try {
            return a(j, cVar, pVar, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean b() {
        return this.h0 == 1;
    }

    public static b a(long j, sg.bigo.ads.N.c cVar, sg.bigo.ads.T0.p pVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("adx_type", 0);
        if (optInt != 1 && optInt != 2) {
            if (optInt == 3) {
                return new c(j, cVar, pVar, jSONObject);
            }
            if (optInt != 5) {
                return null;
            }
        }
        return new k(j, cVar, pVar, jSONObject);
    }

    public final boolean a(int i) {
        return (this.w & ((long) i)) > 0;
    }

    public final boolean a() {
        return (!this.G || this.H <= 0) ? SystemClock.elapsedRealtime() - this.e >= this.d * 1000 : System.currentTimeMillis() > this.H;
    }

    public final void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            sg.bigo.ads.T0.q qVar = new sg.bigo.ads.T0.q(new JSONObject(str));
            if (z) {
                this.J = qVar;
            } else {
                this.I = qVar;
            }
        } catch (JSONException unused) {
        }
    }
}
