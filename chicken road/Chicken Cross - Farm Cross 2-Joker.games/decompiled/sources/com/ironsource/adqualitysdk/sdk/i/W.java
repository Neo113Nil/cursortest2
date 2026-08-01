package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* loaded from: classes6.dex */
public final class W extends AbstractC0395 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0395 f138;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f139;

    public W(AbstractC0411 abstractC0411, AbstractC0395 abstractC0395) {
        this.f139 = abstractC0411;
        this.f138 = abstractC0395;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w = (W) obj;
        AbstractC0411 abstractC0411 = this.f139;
        if (abstractC0411 == null ? w.f139 != null : !abstractC0411.equals(w.f139)) {
            return false;
        }
        AbstractC0395 abstractC0395 = this.f138;
        AbstractC0395 abstractC03952 = w.f138;
        return abstractC0395 != null ? abstractC0395.equals(abstractC03952) : abstractC03952 == null;
    }

    public final int hashCode() {
        AbstractC0411 abstractC0411 = this.f139;
        int hashCode = (abstractC0411 != null ? abstractC0411.hashCode() : 0) * 31;
        AbstractC0395 abstractC0395 = this.f138;
        return hashCode + (abstractC0395 != null ? abstractC0395.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("YZmcZm0cyg==\n", "FvH1Cgg84mU=\n") + this.f139 + StringFog.decrypt("/dE=\n", "1PEwT2hR2vE=\n") + this.f138;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1192 mo5331(C1074 c1074, C1226 c1226) {
        while (this.f139.m5426(c1074, c1226).m5918()) {
            C1192 m5395 = this.f138.m5395(c1074, c1226);
            if (m5395.f3384) {
                break;
            }
            if (m5395.f3385) {
                return m5395;
            }
        }
        return new C1192(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int mo5330() {
        return this.f138.mo5330();
    }
}
