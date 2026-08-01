package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ა, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0723 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0654 f1997;

    public C0723(C0654 c0654) {
        this.f1997 = c0654;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0654 c0654 = this.f1997;
        MaioAdsListenerInterface maioAdsListenerInterface = (MaioAdsListenerInterface) arrayList.get(0);
        c0654.getClass();
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        return null;
    }
}
