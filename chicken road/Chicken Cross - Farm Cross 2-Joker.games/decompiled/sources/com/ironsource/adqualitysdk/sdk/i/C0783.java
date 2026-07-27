package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0783 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0713 f2285;

    public C0783(C0713 c0713) {
        this.f2285 = c0713;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0713 c0713 = this.f2285;
        ImpressionDataListener impressionDataListener = (ImpressionDataListener) arrayList.get(0);
        c0713.getClass();
        IronSource.addImpressionDataListener(impressionDataListener);
        return null;
    }
}
