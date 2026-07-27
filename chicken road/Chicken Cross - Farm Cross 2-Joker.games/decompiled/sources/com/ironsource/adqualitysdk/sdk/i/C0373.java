package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementVideoListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ǃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0373 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1319 f475;

    public C0373(C1319 c1319) {
        this.f475 = c1319;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1319 c1319 = this.f475;
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        TJPlacementVideoListener tJPlacementVideoListener = (TJPlacementVideoListener) arrayList.get(1);
        c1319.getClass();
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        return null;
    }
}
