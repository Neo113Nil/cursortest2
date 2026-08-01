package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐞ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0742 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f2070;

    public C0742(AbstractC0411 abstractC0411) {
        this.f2070 = abstractC0411;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0742.class != obj.getClass()) {
            return false;
        }
        AbstractC0411 abstractC0411 = this.f2070;
        AbstractC0411 abstractC04112 = ((C0742) obj).f2070;
        return abstractC0411 != null ? abstractC0411.equals(abstractC04112) : abstractC04112 == null;
    }

    public final int hashCode() {
        AbstractC0411 abstractC0411 = this.f2070;
        if (abstractC0411 != null) {
            return abstractC0411.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC1257.m5940("Zw==\n", "TnHCbiwLR98=\n", new StringBuilder().append(StringFog.decrypt("ew==\n", "U2soBYrC874=\n")).append(this.f2070));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        return this.f2070.m5426(c1074, c1226);
    }
}
