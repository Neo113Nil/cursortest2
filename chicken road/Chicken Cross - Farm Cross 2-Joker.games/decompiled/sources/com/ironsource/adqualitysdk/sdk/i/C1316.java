package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.Chartboost;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾜ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1316 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1221 f3790;

    public C1316(C1221 c1221) {
        this.f3790 = c1221;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1221 c1221 = this.f3790;
        c1221.getClass();
        Chartboost.setDelegate(new C1229(c1221, Chartboost.getDelegate(), c0807));
        return null;
    }
}
