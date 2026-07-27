package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.internal.Constants;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅈ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1080 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1015 f3190;

    public C1080(C1015 c1015) {
        this.f3190 = c1015;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1015 c1015 = this.f3190;
        Constants.AdType adType = (Constants.AdType) arrayList.get(0);
        c1015.getClass();
        return adType.getPlacementType();
    }
}
