package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒮ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0789 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0788 f2295;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2296;

    public C0789(C0788 c0788, String str) {
        this.f2295 = c0788;
        this.f2296 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (this.f2295.f2290.f1869.get()) {
            return;
        }
        AbstractC0544.m5509(StringFog.decrypt("YJc/TpjJF9VRtTBOnM0GyA==\n", "I/hRIP2qY7o=\n"), StringFog.decrypt("w8mVtuFla8jwzpKlqGdoz+TCn7bndic=\n", "iqf8wogEB6E=\n") + this.f2296);
        try {
            C0788 c0788 = this.f2295;
            c0788.f2290.m5632(c0788.f2293, c0788.f2294, this.f2296, c0788.f2292, c0788.f2291);
        } catch (Throwable th) {
            C0651 c0651 = this.f2295.f2290.f1860;
            if (c0651 != null) {
                AbstractC1145.m5891(new C0663(c0651, this.f2296, EnumC0676.f1843));
            }
            HashMap m5618 = C0682.m5618(this.f2295.f2290);
            String str = this.f2295.f2294;
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            m5618.put(str, th2.toString());
            AbstractC0480.m5465(StringFog.decrypt("vVw/IBirx76MfjAgHK/Wow==\n", "/jNRTn3Is9E=\n"), StringFog.decrypt("2Q/VuBOp6/P5HNO+D+6o4vMTybIC/efzvA==\n", "nH2n12GJiIE=\n") + this.f2296, th, true, true, true);
        }
    }
}
