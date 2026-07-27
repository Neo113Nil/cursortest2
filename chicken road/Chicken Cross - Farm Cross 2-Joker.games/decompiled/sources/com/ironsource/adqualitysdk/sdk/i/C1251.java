package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻧ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1251 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f3542;

    public C1251(C0441 c0441) {
        this.f3542 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f3542;
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        c0441.getClass();
        return adResponse.getClickTrackingUrls();
    }
}
