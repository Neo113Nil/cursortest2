package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q2 extends C4630s0 {
    private final ISBannerSize b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(C4434h0 adProperties, ISBannerSize iSBannerSize) {
        super(adProperties);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.b = iSBannerSize;
    }

    @Override // com.ironsource.C4630s0, com.ironsource.InterfaceC4454i2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.b);
    }
}
