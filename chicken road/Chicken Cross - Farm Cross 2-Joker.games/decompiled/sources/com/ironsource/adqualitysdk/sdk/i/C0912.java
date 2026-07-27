package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᚁ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0912 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2552;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2553;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2554;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0969 f2555;

    public C0912(C0682 c0682, C0969 c0969, String str, String str2) {
        this.f2552 = c0682;
        this.f2555 = c0969;
        this.f2554 = str;
        this.f2553 = str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        JSONObject jSONObject;
        JSONObject m5622 = C0682.m5622(this.f2552, this.f2555);
        m5622.put(StringFog.decrypt("za4=\n", "qNZHji5m6gk=\n"), true);
        C0682.m5621(this.f2552).put(this.f2555.f2812.f3104, m5622);
        String m5527 = this.f2555.f2809.m5527();
        C0651 c0651 = this.f2552.f1860;
        if (StringFog.decrypt("ab+EyEquOf0=\n", "LfbXiQjifLk=\n").equals(m5527)) {
            AbstractC0544.m5509(StringFog.decrypt("UOJf8IvFSARhwFDwj8FZGQ==\n", "E40xnu6mPGs=\n"), this.f2555.f2812.f3103 + StringFog.decrypt("NGr36sNaH897e7jt3h8Y0mdo+ujIWw==\n", "FAmYhK0/fLs=\n"));
            if (c0651 != null) {
                AbstractC1145.m5891(new C0660(c0651, this.f2554, EnumC0670.f1832));
            }
        } else if (this.f2552.m5636(this.f2554)) {
            AbstractC0544.m5509(StringFog.decrypt("izprLpvHYrq6GGQun8Nzpw==\n", "yFUFQP6kFtU=\n"), this.f2555.f2812.f3103 + StringFog.decrypt("g0LVqa5R9SnMU5qwoUe2OcpS26WsUfJ9xVPVquBA/jiDUt+1tlHk\n", "oyG6x8A0ll0=\n"));
            if (c0651 != null) {
                AbstractC1145.m5891(new C0660(c0651, this.f2554, EnumC0670.f1832));
            }
            m5622.put(StringFog.decrypt("UkMf\n", "NiBsACiNHNQ=\n"), true);
        } else {
            this.f2552.getClass();
            C0470 c0470 = (C0470) AbstractC0398.m5397();
            synchronized (c0470) {
                jSONObject = c0470.f3224;
            }
            if (!jSONObject.optBoolean(c0470.f902)) {
                C0682 c0682 = this.f2552;
                C0969 c0969 = this.f2555;
                c0682.getClass();
                if (!C0682.f1854.equals(m5527) && (TextUtils.isEmpty(m5527) || AbstractC1191.m5913(m5527, c0969.f2812.f3101) < 0 || AbstractC1191.m5913(m5527, c0969.f2812.f3100) > 0)) {
                    m5622.put(StringFog.decrypt("MdRB\n", "QqIyN6nIUzY=\n"), false);
                    if (c0651 != null) {
                        AbstractC1145.m5891(new C0663(c0651, this.f2554, EnumC0676.f1845));
                    }
                    AbstractC0480.m5465(StringFog.decrypt("RWixNgZSEoZ0Sr42AlYDmw==\n", "BgffWGMxZuk=\n"), AbstractC1257.m5940("39RtTqIiyZqG2GpOvzjNypDPaguobd/D38l2C+wu0tSR2H0aoz8=\n", "/70ebsxNvbo=\n", AbstractC1196.m5920("eQ8m/Sl8qI0qNQ3YKQ==\n", "WVxitgkKzf8=\n", new StringBuilder().append(this.f2553), m5527)), null, true, true, false);
                    if (this.f2555.m5787()) {
                        ((C1096) this.f2552.m5631()).adQualitySdkInitFailed(ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET, AbstractC1257.m5940("7Ceg1hye4ku1K6fWAYTmG6M8p5MW0fQS7Dq7k1KS+QWiK7CCHYM=\n", "zE7T9nLxlms=\n", new StringBuilder().append(this.f2555.f2812.f3103).append(StringFog.decrypt("OwJZelNq6CZoOHJfUw==\n", "G1EdMXMcjVQ=\n")).append(this.f2555.f2809.m5527())));
                    }
                }
            }
            AbstractC1145.m5895(new C0913(this));
            ((ArrayList) C0682.m5620(this.f2552)).add(this.f2555);
        }
        m5622.remove(StringFog.decrypt("cds=\n", "FKMSUUs8qws=\n"));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5391(Throwable th) {
        C0651 c0651 = this.f2552.f1860;
        if (c0651 != null) {
            AbstractC1145.m5891(new C0663(c0651, this.f2554, EnumC0676.f1842));
        }
        AbstractC0480.m5465(StringFog.decrypt("qxwC77EqNIyaPg3vtS4lkQ==\n", "6HNsgdRJQOM=\n"), StringFog.decrypt("z9YpzQGmr3Hj0DLDH++8duTDe8Ec6Kh66dA00FM=\n", "iqRbonOGxh8=\n") + this.f2554, th, true, true, true);
    }
}
