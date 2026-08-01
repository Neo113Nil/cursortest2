package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.〱, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1094 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f3214;

    public C1094(C1012 c1012) {
        this.f3214 = c1012;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1012 c1012 = this.f3214;
        OfferCacheEntity offerCacheEntity = (OfferCacheEntity) arrayList.get(0);
        c1012.getClass();
        return offerCacheEntity.clickThroughUrl;
    }
}
