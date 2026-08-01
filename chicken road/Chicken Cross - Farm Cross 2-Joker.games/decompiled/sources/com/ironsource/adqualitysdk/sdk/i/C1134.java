package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﬤ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1134 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1111 f3270;

    public C1134(C1111 c1111) {
        this.f3270 = c1111;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        ArrayList arrayList = new ArrayList(this.f3270.f3239.values());
        this.f3270.f3239.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1151 c1151 = (C1151) it.next();
            c1151.f3235 = null;
            c1151.f3303 = null;
            AbstractC0554 m5521 = AbstractC0554.m5521();
            synchronized (m5521) {
                m5521.f1253.remove(c1151);
            }
        }
    }
}
