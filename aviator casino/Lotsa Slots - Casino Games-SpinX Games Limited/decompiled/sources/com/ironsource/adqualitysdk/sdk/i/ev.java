package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class ev extends com.ironsource.adqualitysdk.sdk.i.em {
    /* renamed from: ﻐ, reason: contains not printable characters */
    abstract boolean mo7751(int i);

    /* renamed from: ｋ */
    abstract boolean mo7749(java.lang.Object obj, java.lang.Object obj2);

    /* renamed from: ｋ */
    abstract boolean mo7750(java.lang.String str, java.lang.String str2);

    public ev(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        java.lang.Object m7681 = m7732().m7718(eeVar, clVar).m7681();
        java.lang.Object m76812 = m7733().m7718(eeVar, clVar).m7681();
        try {
            return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Boolean.valueOf(mo7751(new java.math.BigDecimal(m7681.toString()).compareTo(new java.math.BigDecimal(m76812.toString())))));
        } catch (java.lang.Exception unused) {
            if ((m7681 instanceof java.lang.String) && (m76812 instanceof java.lang.String)) {
                return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Boolean.valueOf(mo7750((java.lang.String) m7681, (java.lang.String) m76812)));
            }
            return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Boolean.valueOf(mo7749(m7681, m76812)));
        }
    }
}
