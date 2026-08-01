package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ヶ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1112 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1111 f3240;

    public C1112(C1111 c1111) {
        this.f3240 = c1111;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        ArrayList arrayList = new ArrayList(this.f3240.f3237.values());
        this.f3240.f3237.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0447) it.next()).m5445();
        }
    }
}
