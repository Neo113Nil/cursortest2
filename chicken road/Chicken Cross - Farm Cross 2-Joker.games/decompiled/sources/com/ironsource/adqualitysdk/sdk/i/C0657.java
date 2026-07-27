package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0657 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1803;

    public C0657(C0582 c0582) {
        this.f1803 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1803;
        Ad ad = (Ad) arrayList.get(0);
        int intValue = ((Integer) arrayList.get(1)).intValue();
        c0582.getClass();
        return ad.getBundle(intValue);
    }
}
