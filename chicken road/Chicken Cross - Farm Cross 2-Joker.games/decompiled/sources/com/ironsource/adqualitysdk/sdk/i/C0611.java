package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٺ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0611 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1585;

    public C0611(C0582 c0582) {
        this.f1585 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1585;
        Ad ad = (Ad) arrayList.get(0);
        int intValue = ((Integer) arrayList.get(1)).intValue();
        c0582.getClass();
        return ad.getAdomain(intValue);
    }
}
