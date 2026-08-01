package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ι, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1055 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3138;

    public C1055(String str) {
        this.f3138 = AbstractC1212.m5923(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1055.class != obj.getClass()) {
            return false;
        }
        return this.f3138.equals(((C1055) obj).f3138);
    }

    public final int hashCode() {
        String str = this.f3138;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f3138;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        C0623 c0623;
        try {
            return new C1192(c1074.m5837(this.f3138));
        } catch (Exception unused) {
            String str = this.f3138;
            if (str != null) {
                c0623 = c1226.f3484.m5382(str);
            } else {
                c1226.getClass();
                c0623 = null;
            }
            if (c0623 != null) {
                return new C1192(c0623);
            }
            new C0364(c1226, c1074, AbstractC1257.m5940("wQ==\n", "5lEqWO5Hji8=\n", new StringBuilder().append(StringFog.decrypt("2Sly/uyRSOf9N3Xw6thD9rw+eOHs1F7i9TRusbk=\n", "nFsAkZ6xLZE=\n")).append(this)), null).m5536(c1226.m5929());
            return new C1192(null);
        }
    }
}
