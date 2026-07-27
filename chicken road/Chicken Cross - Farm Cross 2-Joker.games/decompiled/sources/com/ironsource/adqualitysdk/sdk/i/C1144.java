package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.טּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1144 extends AbstractRunnableC0730 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1111 f3281;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0939 f3282;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0425 f3283;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0691 f3284;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3285;

    public C1144(C1111 c1111, JSONObject jSONObject, C0691 c0691, C0425 c0425, C0939 c0939) {
        this.f3281 = c1111;
        this.f3285 = jSONObject;
        this.f3284 = c0691;
        this.f3283 = c0425;
        this.f3282 = c0939;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        String m5880 = C1111.m5880(this.f3281, this.f3285);
        C1151 c1151 = (C1151) this.f3281.f3239.get(m5880);
        if (c1151 == null) {
            c1151 = new C1151(this.f3285, this.f3284);
            this.f3281.f3239.put(m5880, c1151);
        } else {
            c1151.f2213 = this.f3284;
            C1160 c1160 = new C1160(this.f3285);
            c1151.f2212 = c1160;
            c1151.f3297 = c1160;
            AbstractC1145.m5892(new C1243(c1151));
        }
        c1151.f3235 = this.f3283;
        c1151.f3303 = this.f3282;
    }
}
