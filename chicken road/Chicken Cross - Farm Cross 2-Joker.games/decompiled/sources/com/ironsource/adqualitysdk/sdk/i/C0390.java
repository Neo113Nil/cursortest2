package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɜ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0390 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1305 f500;

    public C0390(C1305 c1305) {
        this.f500 = c1305;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1305 c1305 = this.f500;
        Ad ad = (Ad) arrayList.get(0);
        c1305.getClass();
        return ad.getPlacementId();
    }
}
