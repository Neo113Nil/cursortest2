package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ເ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0721 extends AbstractC0714 {
    public C0721(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112) {
        super(abstractC0411, abstractC04112);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0714
    /* renamed from: ﾒ */
    public final Number mo5494(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number2.doubleValue() * number.doubleValue());
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            return Long.valueOf(number2.longValue() * number.longValue());
        }
        return Integer.valueOf(number2.intValue() * number.intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821
    /* renamed from: ﾒ */
    public final String mo5427() {
        return StringFog.decrypt("qg==\n", "gF/55YgD6Ks=\n");
    }
}
