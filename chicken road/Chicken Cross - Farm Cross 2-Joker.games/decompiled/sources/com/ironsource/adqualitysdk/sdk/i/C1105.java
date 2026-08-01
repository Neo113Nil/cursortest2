package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.イ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1105 extends AbstractC0537 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0395[] f3229;

    public C1105(ArrayList arrayList, byte b) {
        super(b);
        AbstractC0395[] abstractC0395Arr = new AbstractC0395[arrayList.size()];
        this.f3229 = abstractC0395Arr;
        arrayList.toArray(abstractC0395Arr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1105.class != obj.getClass()) {
            return false;
        }
        AbstractC0395[] abstractC0395Arr = this.f3229;
        AbstractC0395[] abstractC0395Arr2 = ((C1105) obj).f3229;
        return abstractC0395Arr != null ? abstractC0395Arr.equals(abstractC0395Arr2) : abstractC0395Arr2 == null;
    }

    public final int hashCode() {
        AbstractC0395[] abstractC0395Arr = this.f3229;
        if (abstractC0395Arr != null) {
            return abstractC0395Arr.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("Jrc=\n", "Xb3KHuzxnZI=\n"));
        for (AbstractC0395 abstractC0395 : this.f3229) {
            byte b = this.f1207;
            for (int i = 0; i < b; i++) {
                sb.append("  ");
            }
            sb.append(abstractC0395.toString());
            sb.append("\n");
        }
        int i2 = this.f1207 - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append(StringFog.decrypt("Lg==\n", "UxzPbPGQ5ew=\n"));
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final C1192 mo5331(C1074 c1074, C1226 c1226) {
        C1192 c1192 = new C1192(null);
        C1074 c10742 = new C1074(new HashMap(), c1074, false);
        for (AbstractC0395 abstractC0395 : this.f3229) {
            c1192 = abstractC0395.m5395(c10742, c1226);
            if (c1192.f3385 || c1192.f3384 || c1192.f3383) {
                break;
            }
            c1074.f3178 = (short) (c1074.f3178 + 1);
        }
        return c1192;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final int mo5330() {
        int i = 2;
        for (AbstractC0395 abstractC0395 : this.f3229) {
            i += abstractC0395.mo5330();
        }
        return i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final int mo5396(C1074 c1074) {
        int i = 0;
        for (int i2 = 0; i2 < c1074.f3178; i2++) {
            i += this.f3229[i2].mo5330();
        }
        return i;
    }
}
