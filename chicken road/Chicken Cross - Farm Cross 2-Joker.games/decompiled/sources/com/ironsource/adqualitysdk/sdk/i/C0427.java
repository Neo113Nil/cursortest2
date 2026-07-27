package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJPlacement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʲ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0427 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1319 f571;

    public C0427(C1319 c1319) {
        this.f571 = c1319;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1319 c1319 = this.f571;
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        c1319.getClass();
        return tJPlacement.getVideoListener();
    }
}
