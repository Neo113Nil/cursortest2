package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒦ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0781 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0713 f2284;

    public C0781(C0713 c0713) {
        this.f2284 = c0713;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0713 c0713 = this.f2284;
        ImpressionDataListener impressionDataListener = (ImpressionDataListener) arrayList.get(0);
        c0713.getClass();
        IronSource.removeImpressionDataListener(impressionDataListener);
        return null;
    }
}
