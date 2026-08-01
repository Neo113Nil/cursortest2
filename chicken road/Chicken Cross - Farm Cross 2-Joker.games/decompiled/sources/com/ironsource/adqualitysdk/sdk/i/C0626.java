package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ړ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0626 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1654;

    public C0626(C0582 c0582) {
        this.f1654 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1654;
        Ad.Display.Banner banner = (Ad.Display.Banner) arrayList.get(0);
        c0582.getClass();
        return banner.getExtProtoList();
    }
}
