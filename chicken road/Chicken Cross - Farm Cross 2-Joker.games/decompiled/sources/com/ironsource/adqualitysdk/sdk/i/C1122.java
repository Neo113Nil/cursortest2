package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.乁, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1122 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1111 f3254;

    public C1122(C1111 c1111) {
        this.f3254 = c1111;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        ArrayList arrayList = new ArrayList(this.f3254.f3238.values());
        this.f3254.f3238.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Z z = (Z) it.next();
            z.f3235 = null;
            C1188.m5907().m5908(z);
        }
    }
}
