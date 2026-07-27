package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastBeacon;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˁ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0442 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f739;

    public C0442(C0441 c0441) {
        this.f739 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f739;
        VastBeacon vastBeacon = (VastBeacon) arrayList.get(0);
        c0441.getClass();
        return vastBeacon.uri;
    }
}
