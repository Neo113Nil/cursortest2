package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ק, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0586 extends AbstractC0830 {
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0830
    /* renamed from: ﻛ */
    public final String mo5372() {
        return StringFog.decrypt("b03WoZxWZFNgR5XulV15W2VGleiWSiVVaFGVwpRbYlhpY9/8\n", "DCK7j/s5CzQ=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0830
    /* renamed from: ｋ */
    public final Class mo5373() {
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0830
    /* renamed from: ﾇ */
    public final String mo5375() {
        return StringFog.decrypt("qpOAclQ=\n", "y/ftHTYdByA=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0830
    /* renamed from: ﾒ */
    public final AbstractC0557 mo5374() {
        try {
            if (Prode.class.getName().equals("com.ironsource.adqualitysdk.sdk.i.Prode")) {
                Class.forName(StringFog.decrypt("jlFQ5OFwa4aBWxOr6Ht2joRaE63rbCqAiU0TnONtd4iCUHSk4HA=\n", "7T49yoYfBOE=\n"));
            }
            return new C0624(StringFog.decrypt("qpOAclQ=\n", "y/ftHTYdByA=\n"));
        } catch (Throwable unused) {
            return new C0588(StringFog.decrypt("qpOAclQ=\n", "y/ftHTYdByA=\n"));
        }
    }
}
