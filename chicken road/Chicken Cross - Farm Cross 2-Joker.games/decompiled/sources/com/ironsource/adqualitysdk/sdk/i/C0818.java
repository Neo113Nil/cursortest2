package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0818 extends AbstractC0395 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f2376;

    public C0818(AbstractC0411 abstractC0411) {
        this.f2376 = abstractC0411;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0411 abstractC0411 = this.f2376;
        AbstractC0411 abstractC04112 = ((C0818) obj).f2376;
        return abstractC0411 != null ? abstractC0411.equals(abstractC04112) : abstractC04112 == null;
    }

    public final int hashCode() {
        AbstractC0411 abstractC0411 = this.f2376;
        if (abstractC0411 != null) {
            return abstractC0411.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.f2376 != null ? AbstractC1257.m5940("iA==\n", "s1ixFc9uTKw=\n", new StringBuilder().append(this.f2376)) : StringFog.decrypt("BA==\n", "P/LV9iD0ibY=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public C1192 mo5331(C1074 c1074, C1226 c1226) {
        AbstractC0411 abstractC0411 = this.f2376;
        return abstractC0411 != null ? abstractC0411.m5426(c1074, c1226) : new C1192(null);
    }
}
