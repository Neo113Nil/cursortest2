package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.AdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʄ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0408 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1305 f539;

    public C0408(C1305 c1305) {
        this.f539 = c1305;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1305 c1305 = this.f539;
        AdView adView = (AdView) arrayList.get(0);
        c1305.getClass();
        return adView.getPlacementId();
    }
}
