package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.ads.network.common.model.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꮠ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0735 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0569 f2007;

    public C0735(C0569 c0569) {
        this.f2007 = c0569;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0569 c0569 = this.f2007;
        Ad ad = (Ad) arrayList.get(0);
        c0569.getClass();
        return ad.getCreativeId();
    }
}
