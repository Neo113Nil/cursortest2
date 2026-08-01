package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.internal.adapters.AdAdapter;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾚ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1315 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1305 f3789;

    public C1315(C1305 c1305) {
        this.f3789 = c1305;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1305 c1305 = this.f3789;
        AdAdapter adAdapter = (AdAdapter) arrayList.get(0);
        c1305.getClass();
        return adAdapter.getPlacementType();
    }
}
