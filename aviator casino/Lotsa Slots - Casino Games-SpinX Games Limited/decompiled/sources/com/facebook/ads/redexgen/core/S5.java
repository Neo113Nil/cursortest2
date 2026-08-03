package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class S5 implements com.facebook.ads.internal.api.NativeAdViewTypeApi {
    public final com.facebook.ads.redexgen.core.EnumC1101Ve A00;

    public S5(int i) {
        this.A00 = com.facebook.ads.redexgen.core.EnumC1101Ve.A00(i);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getHeight() {
        return this.A00.A04();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getValue() {
        return this.A00.A05();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getWidth() {
        return this.A00.A06();
    }
}
