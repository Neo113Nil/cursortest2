package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕑ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0873 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2493;

    public C0873(C0441 c0441) {
        this.f2493 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2493;
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        c0441.getClass();
        return videoClicks.clickThrough;
    }
}
