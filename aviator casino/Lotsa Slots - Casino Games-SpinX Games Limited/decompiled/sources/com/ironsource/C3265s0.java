package com.ironsource;

/* renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3265s0 implements com.ironsource.InterfaceC3124k2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3069h0 f6586a;

    public C3265s0(com.ironsource.C3069h0 adProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f6586a = adProperties;
    }

    @Override // com.ironsource.InterfaceC3124k2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f6586a.c());
        auctionRequestParams.a(this.f6586a.a().toString());
        auctionRequestParams.a(java.lang.Boolean.TRUE);
    }
}
