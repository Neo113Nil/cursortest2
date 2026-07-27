package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0786 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0713 f2288;

    public C0786(C0713 c0713) {
        this.f2288 = c0713;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0713 c0713 = this.f2288;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c0713.getClass();
        return impressionData.getAllData();
    }
}
