package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.Placement;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class r implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4314s f245;

    public r(C4314s c4314s) {
        this.f245 = c4314s;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C4314s c4314s = this.f245;
        Placement placement = (Placement) arrayList.get(0);
        c4314s.getClass();
        return Boolean.valueOf(placement.isRewardedVideo());
    }
}
