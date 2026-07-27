package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAdClickListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖧ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0882 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2507;

    public C0882(C0759 c0759) {
        this.f2507 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2507;
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialog = (AppLovinInterstitialAdDialog) arrayList.get(0);
        AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) arrayList.get(1);
        c0759.getClass();
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        return null;
    }
}
