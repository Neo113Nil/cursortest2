package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵛ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0981 extends AbstractC0411 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0411 f2896;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f2897;

    public AbstractC0981(AbstractC0411 abstractC0411, AbstractC0411 abstractC04112) {
        this.f2897 = abstractC0411;
        this.f2896 = abstractC04112;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0981 abstractC0981 = (AbstractC0981) obj;
        AbstractC0411 abstractC0411 = this.f2897;
        if (abstractC0411 == null ? abstractC0981.f2897 != null : !abstractC0411.equals(abstractC0981.f2897)) {
            return false;
        }
        AbstractC0411 abstractC04112 = this.f2896;
        AbstractC0411 abstractC04113 = abstractC0981.f2896;
        return abstractC04112 != null ? abstractC04112.equals(abstractC04113) : abstractC04113 == null;
    }

    public int hashCode() {
        AbstractC0411 abstractC0411 = this.f2897;
        int hashCode = (abstractC0411 != null ? abstractC0411.hashCode() : 0) * 31;
        AbstractC0411 abstractC04112 = this.f2896;
        return hashCode + (abstractC04112 != null ? abstractC04112.hashCode() : 0);
    }

    public String toString() {
        return AbstractC1257.m5940("6g==\n", "t71sb1UoQwg=\n", new StringBuilder().append(this.f2897.toString()).append(StringFog.decrypt("dg==\n", "LcGm2nnv7II=\n")).append(this.f2896.toString()));
    }
}
