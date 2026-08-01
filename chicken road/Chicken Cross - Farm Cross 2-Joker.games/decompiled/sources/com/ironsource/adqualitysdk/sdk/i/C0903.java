package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘇ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0903 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0713 f2533;

    public C0903(C0713 c0713) {
        this.f2533 = c0713;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0713 c0713 = this.f2533;
        Placement placement = (Placement) arrayList.get(0);
        c0713.getClass();
        if (placement != null) {
            return placement.getPlacementName();
        }
        return null;
    }
}
