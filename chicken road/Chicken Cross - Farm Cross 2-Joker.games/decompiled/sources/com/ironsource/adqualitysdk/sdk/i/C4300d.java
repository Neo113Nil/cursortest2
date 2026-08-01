package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Placement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4300d implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4304h f151;

    public C4300d(C4304h c4304h) {
        this.f151 = c4304h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C4304h c4304h = this.f151;
        Placement placement = (Placement) arrayList.get(0);
        c4304h.getClass();
        return Boolean.valueOf(placement.isIncentivized());
    }
}
