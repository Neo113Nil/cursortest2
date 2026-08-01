package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.一, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1116 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f3244;

    public C1116(C0957 c0957) {
        this.f3244 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f3244;
        Wrapper wrapper = (Wrapper) arrayList.get(0);
        c0957.getClass();
        return wrapper.getCreatives();
    }
}
