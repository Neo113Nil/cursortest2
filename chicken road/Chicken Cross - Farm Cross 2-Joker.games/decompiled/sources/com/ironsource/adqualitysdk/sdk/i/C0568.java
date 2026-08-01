package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ד, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0568 extends AbstractC0821 {
    public C0568(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112) {
        super(abstractC0411, abstractC04112);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        C1192 m5426 = this.f2379.m5426(c1074, c1226);
        C1192 m54262 = this.f2378.m5426(c1074, c1226);
        if ((m5426.f3386 instanceof String) || (m54262.f3386 instanceof String)) {
            return new C1192("" + m5426.f3386 + m54262.f3386);
        }
        Number m5917 = m5426.m5917();
        Number m59172 = m54262.m5917();
        if ((m5917 instanceof Double) || (m59172 instanceof Double)) {
            return new C1192(Double.valueOf(m59172.doubleValue() + m5917.doubleValue()));
        }
        if ((m5917 instanceof Long) || (m59172 instanceof Long)) {
            return new C1192(Long.valueOf(m59172.longValue() + m5917.longValue()));
        }
        return new C1192(Integer.valueOf(m59172.intValue() + m5917.intValue()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0821
    /* renamed from: ﾒ */
    public final String mo5427() {
        return StringFog.decrypt("GQ==\n", "MnjOEga+27U=\n");
    }
}
