package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƈ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0362 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f462;

    public C0362(C1267 c1267) {
        this.f462 = c1267;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1267 c1267 = this.f462;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) arrayList.get(0);
        c1267.getClass();
        return new C1269(c1267, threadPoolExecutor, c0807);
    }
}
