package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.ChartboostDelegate;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｱ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1286 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1221 f3669;

    public C1286(C1221 c1221) {
        this.f3669 = c1221;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1221 c1221 = this.f3669;
        ChartboostDelegate chartboostDelegate = (ChartboostDelegate) arrayList.get(0);
        c1221.getClass();
        return new C1229(c1221, chartboostDelegate, c0807);
    }
}
