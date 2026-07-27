package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ͺ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0461 extends AbstractC0395 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList f859;

    public C0461(ArrayList arrayList) {
        this.f859 = arrayList;
    }

    public final String toString() {
        return AbstractC1257.m5940("MA==\n", "C4Y65cU1W0k=\n", new StringBuilder().append(StringFog.decrypt("buEZrg==\n", "GIBrjhOzEiE=\n")).append(TextUtils.join(StringFog.decrypt("2JU=\n", "9LUcHYUElKs=\n"), this.f859)));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0395
    /* renamed from: ﾒ */
    public final C1192 mo5331(C1074 c1074, C1226 c1226) {
        List asList;
        Iterator it = this.f859.iterator();
        while (it.hasNext()) {
            AbstractC0411 abstractC0411 = (AbstractC0411) it.next();
            C1055 c1055 = abstractC0411 instanceof C1055 ? (C1055) abstractC0411 : abstractC0411 instanceof C0705 ? ((C0705) abstractC0411).f1903 : null;
            if (c1055 != null && (asList = Arrays.asList(c1055.f3138)) != null) {
                Iterator it2 = asList.iterator();
                while (it2.hasNext()) {
                    c1074.f3185.put((String) it2.next(), null);
                }
            }
            abstractC0411.mo5387(c1074, c1226);
        }
        return new C1192(null);
    }
}
