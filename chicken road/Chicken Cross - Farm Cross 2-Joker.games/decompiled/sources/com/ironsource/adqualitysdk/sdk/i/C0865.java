package com.ironsource.adqualitysdk.sdk.i;

import com.moloco.sdk.publisher.Banner;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0865 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0824 f2484;

    public C0865(C0824 c0824) {
        this.f2484 = c0824;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0824 c0824 = this.f2484;
        Banner banner = (Banner) arrayList.get(0);
        c0824.getClass();
        return banner.getAdShowListener();
    }
}
