package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0921 extends AbstractC0714 {
    public C0921(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112) {
        super(abstractC0411, abstractC04112);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0714
    /* renamed from: ﾒ */
    public final Number mo5494(Number number, Number number2) {
        return ((number instanceof Double) || (number2 instanceof Double)) ? Double.valueOf(number.doubleValue() - number2.doubleValue()) : ((number instanceof Long) || (number2 instanceof Long)) ? Long.valueOf(number.longValue() - number2.longValue()) : Integer.valueOf(number.intValue() - number2.intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821
    /* renamed from: ﾒ */
    public final String mo5427() {
        return StringFog.decrypt("VA==\n", "eTX+k5rrfmY=\n");
    }
}
