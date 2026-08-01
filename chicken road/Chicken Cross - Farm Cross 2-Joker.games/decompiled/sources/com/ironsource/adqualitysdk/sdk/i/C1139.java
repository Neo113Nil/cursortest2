package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.גּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1139 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f3276;

    public C1139(C0957 c0957) {
        this.f3276 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f3276;
        StaticResource staticResource = (StaticResource) arrayList.get(0);
        c0957.getClass();
        return staticResource.getCreativeType();
    }
}
