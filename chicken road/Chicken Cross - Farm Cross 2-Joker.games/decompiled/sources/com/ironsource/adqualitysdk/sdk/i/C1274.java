package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.InPlay.CBInPlay;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｚ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1274 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1221 f3649;

    public C1274(C1221 c1221) {
        this.f3649 = c1221;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1221 c1221 = this.f3649;
        CBInPlay cBInPlay = (CBInPlay) arrayList.get(0);
        c1221.getClass();
        return cBInPlay.getLocation();
    }
}
