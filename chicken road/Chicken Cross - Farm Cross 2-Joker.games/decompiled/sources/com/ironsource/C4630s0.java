package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4630s0 implements InterfaceC4454i2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4434h0 f8513a;

    public C4630s0(C4434h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f8513a = adProperties;
    }

    @Override // com.ironsource.InterfaceC4454i2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f8513a.c());
        auctionRequestParams.a(this.f8513a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
