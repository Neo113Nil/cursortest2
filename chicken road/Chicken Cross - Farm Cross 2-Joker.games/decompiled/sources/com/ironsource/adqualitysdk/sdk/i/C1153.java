package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.רּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1153 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f3306;

    public C1153(C0957 c0957) {
        this.f3306 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f3306;
        VastAdSource vastAdSource = (VastAdSource) arrayList.get(0);
        c0957.getClass();
        return vastAdSource.getCreatives();
    }
}
