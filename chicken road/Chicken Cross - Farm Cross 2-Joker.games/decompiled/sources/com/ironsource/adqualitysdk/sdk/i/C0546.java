package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.PangleAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ӭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0546 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0486 f1242;

    public C0546(C0486 c0486) {
        this.f1242 = c0486;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0486 c0486 = this.f1242;
        PangleAd pangleAd = (PangleAd) arrayList.get(0);
        c0486.getClass();
        return pangleAd.getMediaExtraInfo();
    }
}
