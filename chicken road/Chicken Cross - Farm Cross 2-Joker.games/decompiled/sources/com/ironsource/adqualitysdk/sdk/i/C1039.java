package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.core.HyprMXController;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1039 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1012 f3088;

    public C1039(C1012 c1012) {
        this.f3088 = c1012;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1012 c1012 = this.f3088;
        HyprMXController hyprMXController = (HyprMXController) arrayList.get(0);
        c1012.getClass();
        return hyprMXController.getPlacementController();
    }
}
