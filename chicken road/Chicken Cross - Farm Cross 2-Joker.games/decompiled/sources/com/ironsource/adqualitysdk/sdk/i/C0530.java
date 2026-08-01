package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ҁ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0530 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0337 f1197;

    public C0530(C0337 c0337) {
        this.f1197 = c0337;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0337 c0337 = this.f1197;
        InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) arrayList.get(0);
        c0337.getClass();
        return inneractiveAdViewUnitController.getAdSpot();
    }
}
