package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ट, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0659 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1807;

    public C0659(C0582 c0582) {
        this.f1807 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1807;
        Ad.Video video = (Ad.Video) arrayList.get(0);
        c0582.getClass();
        return video.getAdm();
    }
}
