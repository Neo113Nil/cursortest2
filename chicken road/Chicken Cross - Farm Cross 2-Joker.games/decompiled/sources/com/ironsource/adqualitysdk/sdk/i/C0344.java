package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ľ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0344 extends AbstractC0411 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f438;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411 f439;

    public C0344(AbstractC0411 abstractC0411, String str) {
        this.f439 = abstractC0411;
        this.f438 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0344.class != obj.getClass()) {
            return false;
        }
        C0344 c0344 = (C0344) obj;
        AbstractC0411 abstractC0411 = this.f439;
        if (abstractC0411 == null ? c0344.f439 != null : !abstractC0411.equals(c0344.f439)) {
            return false;
        }
        String str = this.f438;
        String str2 = c0344.f438;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        AbstractC0411 abstractC0411 = this.f439;
        int hashCode = (abstractC0411 != null ? abstractC0411.hashCode() : 0) * 31;
        String str = this.f438;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return this.f439.toString() + StringFog.decrypt("6Q==\n", "xzQTV54xv4Q=\n") + this.f438;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        Object obj = this.f439.m5426(c1074, c1226).f3386;
        C0623 c0623 = null;
        if (!(obj instanceof C1226)) {
            try {
                return new C1192(obj.getClass().getDeclaredField(this.f438).get(obj));
            } catch (Exception unused) {
                return new C1192(null);
            }
        }
        C1226 c12262 = (C1226) obj;
        String str = this.f438;
        if (str != null) {
            c0623 = c12262.f3484.m5382(str);
        } else {
            c12262.getClass();
        }
        return new C1192(c0623);
    }
}
