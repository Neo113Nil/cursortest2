package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AppLovinAdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0796 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2307;

    public C0796(C0759 c0759) {
        this.f2307 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2307;
        AppLovinAdView appLovinAdView = (AppLovinAdView) arrayList.get(0);
        c0759.getClass();
        return appLovinAdView.getAdViewController();
    }
}
