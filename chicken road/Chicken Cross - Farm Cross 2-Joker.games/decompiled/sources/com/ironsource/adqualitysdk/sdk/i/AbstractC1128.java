package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.忄, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC1128 extends AbstractC0821 {
    public AbstractC1128(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112) {
        super(abstractC0411, abstractC04112);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        Object obj = this.f2379.m5426(c1074, c1226).f3386;
        Object obj2 = this.f2378.m5426(c1074, c1226).f3386;
        try {
            return new C1192(Boolean.valueOf(mo5428(new BigDecimal(obj.toString()).compareTo(new BigDecimal(obj2.toString())))));
        } catch (Exception unused) {
            return ((obj instanceof String) && (obj2 instanceof String)) ? new C1192(Boolean.valueOf(mo5440((String) obj, (String) obj2))) : new C1192(Boolean.valueOf(mo5439(obj, obj2)));
        }
    }

    /* renamed from: ﾒ */
    public abstract boolean mo5428(int i);

    /* renamed from: ﾒ */
    public abstract boolean mo5439(Object obj, Object obj2);

    /* renamed from: ﾒ */
    public abstract boolean mo5440(String str, String str2);
}
