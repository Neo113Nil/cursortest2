package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0855 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0816 f2467;

    public C0855(C0816 c0816) {
        this.f2467 = c0816;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0651 c0651;
        boolean mo5476;
        if (C0682.m5618(this.f2467.f2367).containsKey(this.f2467.f2374.f2812.f3104) || (c0651 = this.f2467.f2367.f1860) == null) {
            return;
        }
        AbstractC1145.m5891(new C0663(c0651, this.f2467.f2374.f2812.f3104, EnumC0676.f1846));
        C0816 c0816 = this.f2467;
        JSONObject m5622 = C0682.m5622(c0816.f2367, c0816.f2374);
        try {
            m5622.put(StringFog.decrypt("sJnv\n", "0e+cBB2e/NA=\n"), false);
        } catch (JSONException unused) {
        }
        C0682.m5621(this.f2467.f2367).put(this.f2467.f2374.f2812.f3104, m5622);
        C0667 m5609 = c0651.m5609(this.f2467.f2374.f2812.f3104);
        String m5611 = m5609 != null ? m5609.m5611(m5609.f1820) : null;
        C0682.m5618(this.f2467.f2367).put(this.f2467.f2374.f2812.f3104, m5611);
        C0969 c0969 = this.f2467.f2374;
        synchronized (c0969) {
            mo5476 = c0969.f2809.mo5476();
        }
        if (mo5476) {
            ((C1096) this.f2467.f2367.m5631()).adQualitySdkInitFailed(ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK, AbstractC1257.m5940("6cK8TE/XzZG7\n", "ya3ObCGyuvQ=\n", new StringBuilder().append(this.f2467.f2374.f2812.f3103).append(StringFog.decrypt("ayqMsEQvpr44MIe1RA==\n", "S1no22RZw8w=\n")).append(this.f2467.f2374.f2809.m5527()).append(StringFog.decrypt("5PTGerRs3jq3pvBkrmjAPuT1x2Dhc8ktt+/MZeE=\n", "xIajC8EFrF8=\n")).append(this.f2467.f2374.m5788())));
        }
        AbstractC0480.m5465(StringFog.decrypt("7/+SctqEdW/e3Z1y3oBkcg==\n", "rJD8HL/nAQA=\n"), m5611, null, true, true, false);
    }
}
