package com.ironsource;

/* loaded from: classes5.dex */
public final class S2 extends com.ironsource.C3265s0 {
    private final com.ironsource.mediationsdk.ISBannerSize b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(com.ironsource.C3069h0 adProperties, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        super(adProperties);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.b = iSBannerSize;
    }

    @Override // com.ironsource.C3265s0, com.ironsource.InterfaceC3124k2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.b);
    }
}
