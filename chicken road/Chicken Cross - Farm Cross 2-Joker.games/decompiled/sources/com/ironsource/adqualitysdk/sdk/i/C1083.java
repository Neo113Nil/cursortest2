package com.ironsource.adqualitysdk.sdk.i;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅴ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1083 implements InterfaceC1014 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3192;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3193;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3194;

    public C1083(C0623 c0623, C1074 c1074, C1226 c1226) {
        this.f3194 = c0623;
        this.f3193 = c1074;
        this.f3192 = c1226;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1014
    /* renamed from: ﾒ */
    public final JSONObject mo5674(String str, JSONObject jSONObject) {
        return (JSONObject) this.f3194.m5583(this.f3193, this.f3192, Arrays.asList(str, jSONObject)).f3386;
    }
}
