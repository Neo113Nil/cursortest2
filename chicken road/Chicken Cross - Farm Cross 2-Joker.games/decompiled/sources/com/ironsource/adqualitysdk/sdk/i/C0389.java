package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɛ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0389 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1305 f499;

    public C0389(C1305 c1305) {
        this.f499 = c1305;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1305 c1305 = this.f499;
        AdView adView = (AdView) arrayList.get(0);
        AdListener adListener = (AdListener) arrayList.get(1);
        c1305.getClass();
        adView.setAdListener(adListener);
        return null;
    }
}
