package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1018 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1016 f3031;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1155 f3032;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONArray f3033;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3034;

    public C1018(C1016 c1016, boolean z, JSONArray jSONArray, C1155 c1155) {
        this.f3031 = c1016;
        this.f3034 = z;
        this.f3033 = jSONArray;
        this.f3032 = c1155;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        JSONObject mo5493 = this.f3031.mo5493(null, this.f3034, false, false);
        try {
            mo5493.put(StringFog.decrypt("nSM/czWV\n", "+FVaHUHmyYY=\n"), this.f3033);
        } catch (JSONException e) {
            String decrypt = StringFog.decrypt("/d1kRrmKcxbP9nNPropdENLWd0u0kWg=\n", "vLMFKsD+GnU=\n");
            AbstractC0544.m5511(decrypt, decrypt, StringFog.decrypt("2lEEBPhLUD76QgIC5AwTKelGGB/HDkct\n", "nyN2a4prM0w=\n"), e, null, false);
        }
        AbstractC1145.m5892(new C1024(this, mo5493));
    }
}
