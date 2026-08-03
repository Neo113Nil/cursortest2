package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1070Tz implements com.facebook.ads.internal.api.AdSizeApi {
    public final /* synthetic */ com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.EnumC1110Vp A01;

    public C1070Tz(com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl dynamicLoaderImpl, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp) {
        this.A00 = dynamicLoaderImpl;
        this.A01 = enumC1110Vp;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A01.A03();
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01.A04();
    }
}
