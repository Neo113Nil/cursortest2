package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.AdRequestParameters;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ৰ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0684 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1871;

    public C0684(C0582 c0582) {
        this.f1871 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1871;
        AdRequestParameters adRequestParameters = (AdRequestParameters) arrayList.get(0);
        c0582.getClass();
        return adRequestParameters.getAdsType().getName();
    }
}
