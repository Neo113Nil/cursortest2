package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.mediation.config.MediationConfig;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1264 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1015 f3574;

    public C1264(C1015 c1015) {
        this.f3574 = c1015;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1015 c1015 = this.f3574;
        MediationConfig mediationConfig = (MediationConfig) arrayList.get(0);
        c1015.getClass();
        return mediationConfig.getAdapterConfigurations();
    }
}
