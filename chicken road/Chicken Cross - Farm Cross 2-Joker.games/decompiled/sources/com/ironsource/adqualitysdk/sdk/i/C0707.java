package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ห, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0707 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0411[] f1905;

    public C0707(ArrayList arrayList) {
        AbstractC0411[] abstractC0411Arr = new AbstractC0411[arrayList.size()];
        this.f1905 = abstractC0411Arr;
        arrayList.toArray(abstractC0411Arr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0707.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1905, ((C0707) obj).f1905);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1905);
    }

    public final String toString() {
        return AbstractC1257.m5940("iA==\n", "1fE2cNbeB8E=\n", new StringBuilder().append(StringFog.decrypt("ZA==\n", "P6F9QV9ccao=\n")).append(AbstractC0411.m5425(this.f1905)));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0411 abstractC0411 : this.f1905) {
            arrayList.add(abstractC0411.m5426(c1074, c1226).f3386);
        }
        return new C1192(arrayList);
    }
}
