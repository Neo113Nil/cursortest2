package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵚ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0980 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0970 f2895;

    public C0980(C0970 c0970) {
        this.f2895 = c0970;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.ironsource.adqualitysdk.sdk.i.ᒯ] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0970 c0970 = this.f2895;
        if (c0970.f2818) {
            C0682 c0682 = c0970.f2813.f2613;
            Context context = c0970.f2817;
            C0982 c0982 = new C0982(this);
            synchronized (c0682) {
                if (c0682.f1869.get()) {
                    return;
                }
                if (c0682.f1868) {
                    AbstractC1145.m5891(new C0797(c0982));
                } else {
                    String decrypt = StringFog.decrypt("SddiEXHYo6dx4Hcv\n", "CLMzZBC0ytM=\n");
                    AbstractC0544.m5512(decrypt, decrypt, StringFog.decrypt("2PS8ZIWA9/HY9LxkhYD6tYe2/xrH2Ki/kPnQLfnYu7Ccrehp\n", "9dmRSait2tw=\n") + IronSourceAdQuality.getSDKVersion() + StringFog.decrypt("cfqTJrU5vWh8+pMmtTm9\n", "Ude+C5gUkEU=\n"), true);
                    C0798 c0798 = new C0798(c0682, c0982, context);
                    if (c0682.m5627()) {
                        String str = AbstractC0978.f2894;
                        ArrayList arrayList = new ArrayList(Arrays.asList(new C0495(), new C0507(), new C0515()));
                        ArrayList arrayList2 = new ArrayList(AbstractC0978.f2893);
                        if (!arrayList.isEmpty()) {
                            AbstractC0830 abstractC0830 = (AbstractC0830) arrayList.remove(0);
                            String str2 = (String) arrayList2.remove(0);
                            if (!arrayList.isEmpty()) {
                                c0798 = new C0790(c0682, context, arrayList, arrayList2, c0798);
                            }
                            AbstractC1145.m5891(new C0788(c0682, str2, context, abstractC0830, c0798));
                        }
                    } else {
                        AbstractC1145.m5891(new C0788(c0682, AbstractC0978.f2894, context, new C0499(), c0798));
                    }
                    c0682.f1868 = true;
                }
            }
        }
    }
}
