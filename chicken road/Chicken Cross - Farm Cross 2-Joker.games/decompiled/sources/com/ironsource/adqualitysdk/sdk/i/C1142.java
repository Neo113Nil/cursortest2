package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.וּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1142 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f3279;

    public C1142(C0441 c0441) {
        this.f3279 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f3279;
        VastMediaFileScenario vastMediaFileScenario = (VastMediaFileScenario) arrayList.get(0);
        c0441.getClass();
        return vastMediaFileScenario.vastScenarioCreativeData;
    }
}
