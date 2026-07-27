package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｮ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1283 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1221 f3666;

    public C1283(C1221 c1221) {
        this.f3666 = c1221;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1221 c1221 = this.f3666;
        ChartboostDelegate chartboostDelegate = (ChartboostDelegate) arrayList.get(0);
        c1221.getClass();
        Chartboost.setDelegate(chartboostDelegate);
        return null;
    }
}
