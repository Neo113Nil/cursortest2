package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AdViewController;
import com.applovin.sdk.AppLovinAdDisplayListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒸ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0799 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2312;

    public C0799(C0759 c0759) {
        this.f2312 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2312;
        AdViewController adViewController = (AdViewController) arrayList.get(0);
        AppLovinAdDisplayListener appLovinAdDisplayListener = (AppLovinAdDisplayListener) arrayList.get(1);
        c0759.getClass();
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        return null;
    }
}
