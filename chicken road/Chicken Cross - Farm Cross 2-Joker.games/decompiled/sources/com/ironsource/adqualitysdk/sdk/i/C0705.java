package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ล, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0705 extends AbstractC0411 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0411 f1902;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1055 f1903;

    public C0705(C1055 c1055, AbstractC0411 abstractC0411) {
        this.f1903 = c1055;
        this.f1902 = abstractC0411;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0705.class != obj.getClass()) {
            return false;
        }
        C0705 c0705 = (C0705) obj;
        C1055 c1055 = this.f1903;
        if (c1055 == null ? c0705.f1903 != null : !c1055.equals(c0705.f1903)) {
            return false;
        }
        AbstractC0411 abstractC0411 = this.f1902;
        AbstractC0411 abstractC04112 = c0705.f1902;
        return abstractC0411 != null ? abstractC0411.equals(abstractC04112) : abstractC04112 == null;
    }

    public final int hashCode() {
        C1055 c1055 = this.f1903;
        int hashCode = (c1055 != null ? c1055.hashCode() : 0) * 31;
        AbstractC0411 abstractC0411 = this.f1902;
        return hashCode + (abstractC0411 != null ? abstractC0411.hashCode() : 0);
    }

    public final String toString() {
        return this.f1903 + StringFog.decrypt("YFLn\n", "QG/Hzj1xgwY=\n") + this.f1902;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        C1192 m5426 = this.f1902.m5426(c1074, c1226);
        c1074.m5838(this.f1903.f3138, m5426.f3386);
        return m5426;
    }
}
