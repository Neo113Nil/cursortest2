package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1183 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3367;

    public C1183(String str) {
        this.f3367 = AbstractC1212.m5923(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1183.class != obj.getClass()) {
            return false;
        }
        String str = this.f3367;
        String str2 = ((C1183) obj).f3367;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f3367;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f3367;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        AbstractC0557 abstractC0557 = c1226.f3481;
        String str = this.f3367;
        return new C1192(abstractC0557.m5528(str.substring(0, str.length() - StringFog.decrypt("sym6ADE3\n", "nUrWYUJE19Y=\n").length()), true));
    }
}
