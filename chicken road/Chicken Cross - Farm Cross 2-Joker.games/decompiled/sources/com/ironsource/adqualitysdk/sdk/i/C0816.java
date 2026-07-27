package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓛ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0816 extends AbstractRunnableC0730 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2367;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0557 f2368;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ String f2369;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0730 f2370;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2371;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2372;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0830 f2373;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0969 f2374;

    public C0816(C0682 c0682, C0969 c0969, AbstractC0830 abstractC0830, String str, boolean z, AbstractRunnableC0730 abstractRunnableC0730, String str2, AbstractC0557 abstractC0557, Context context) {
        this.f2367 = c0682;
        this.f2374 = c0969;
        this.f2373 = abstractC0830;
        this.f2372 = str;
        this.f2371 = z;
        this.f2370 = abstractRunnableC0730;
        this.f2369 = str2;
        this.f2368 = abstractC0557;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0651 c0651;
        boolean mo5476;
        String str;
        String str2;
        AbstractRunnableC0730 abstractRunnableC0730;
        AbstractRunnableC0730 abstractRunnableC07302;
        if (this.f2367.f1869.get() || this.f2374 == null || C0682.m5619(this.f2367).contains(this.f2373) || (c0651 = this.f2367.f1860) == null) {
            return;
        }
        AbstractC1145.m5891(new C0658(c0651, this.f2372, this.f2374, this.f2371));
        C0969 c0969 = this.f2374;
        synchronized (c0969) {
            mo5476 = c0969.f2809.mo5476();
        }
        if (!mo5476 && (abstractRunnableC07302 = this.f2370) != null) {
            AbstractC1145.m5895(abstractRunnableC07302);
        }
        C0682 c0682 = this.f2367;
        C0969 c09692 = this.f2374;
        c0682.getClass();
        String m5788 = c09692.m5788();
        if (m5788 != null && AbstractC1191.m5913(IronSourceAdQuality.getSDKVersion(), m5788) < 0) {
            AbstractC1145.m5891(new C0855(this));
            return;
        }
        String decrypt = StringFog.decrypt("rcxyf9Kuocqc7n1/1qqw1w==\n", "7qMcEbfN1aU=\n");
        StringBuilder append = new StringBuilder().append(StringFog.decrypt("qtWLTAM5f6WZ0oxfSg==\n", "47viOGpYE8w=\n")).append(this.f2369).append(StringFog.decrypt("y+cJ8qHESBqI+gLxq9NZVZm1\n", "65Vsn86wLTo=\n"));
        if (this.f2371) {
            str = "7UvNdDowDrM=\n";
            str2 = "xSisF1JVapo=\n";
        } else {
            str = "h/tXKRdp3YiG\n";
            str2 = "r50yXXQBuOw=\n";
        }
        String sb = append.append(StringFog.decrypt(str, str2)).toString();
        int i = AbstractC1086.f3200;
        String m5514 = AbstractC0548.m5514("GIsmEQ==\n", "S9lqMeoC170=\n", new StringBuilder(), decrypt);
        AbstractC0544.m5512(m5514, m5514, sb, false);
        AbstractC0557 abstractC0557 = this.f2368;
        HashMap mo5369 = abstractC0557.mo5369();
        abstractC0557.f1272 = mo5369;
        mo5369.put(AbstractC0557.f1268, new C0583(abstractC0557));
        abstractC0557.f1272.put(AbstractC0557.f1267, new C0562(abstractC0557));
        abstractC0557.f1272.put(AbstractC0557.f1266, new C0560(abstractC0557));
        if (this.f2374.m5787() && (abstractRunnableC0730 = this.f2370) != null) {
            AbstractC1145.m5895(abstractRunnableC0730);
        }
        if (C0932.m5751().m5760()) {
            return;
        }
        C0682 c06822 = this.f2367;
        C0969 c09693 = this.f2374;
        String str3 = this.f2369;
        if (!c06822.f1869.get()) {
            String str4 = c09693.f2812.f3104;
            C0651 c06512 = c06822.f1860;
            if (c06512 != null) {
                AbstractC1145.m5891(new C0660(c06512, str4, EnumC0670.f1834));
                AbstractC1145.m5891(new C0912(c06822, c09693, str4, str3));
            }
        }
        if (this.f2367.m5636(this.f2374.f2812.f3104)) {
            return;
        }
        C0682.m5619(this.f2367).add(this.f2373);
    }
}
