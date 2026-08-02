package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Hj extends Ij {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f9455b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9456c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9457d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9458e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9459g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f9460h;

    public Hj(Lq lq, JSONObject jSONObject) {
        super(lq);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject j02 = N4.b.j0(jSONObject, strArr);
        this.f9455b = j02 == null ? null : j02.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject j03 = N4.b.j0(jSONObject, strArr2);
        this.f9456c = j03 == null ? false : j03.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject j04 = N4.b.j0(jSONObject, strArr3);
        this.f9457d = j04 == null ? false : j04.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject j05 = N4.b.j0(jSONObject, strArr4);
        this.f9458e = j05 == null ? false : j05.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject j06 = N4.b.j0(jSONObject, strArr5);
        this.f9459g = j06 != null ? j06.optString(strArr5[0], "") : "";
        this.f = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X4)).booleanValue()) {
            this.f9460h = jSONObject.optJSONObject("omid_settings");
        } else {
            this.f9460h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij
    public final Hq a() {
        JSONObject jSONObject = this.f9460h;
        return jSONObject != null ? new Hq(1, jSONObject) : this.f9599a.f10484V;
    }

    @Override // com.google.android.gms.internal.ads.Ij
    public final String b() {
        return this.f9459g;
    }

    @Override // com.google.android.gms.internal.ads.Ij
    public final boolean c() {
        return this.f9458e;
    }

    @Override // com.google.android.gms.internal.ads.Ij
    public final boolean d() {
        return this.f9456c;
    }

    @Override // com.google.android.gms.internal.ads.Ij
    public final boolean e() {
        return this.f9457d;
    }

    @Override // com.google.android.gms.internal.ads.Ij
    public final boolean f() {
        return this.f;
    }
}
