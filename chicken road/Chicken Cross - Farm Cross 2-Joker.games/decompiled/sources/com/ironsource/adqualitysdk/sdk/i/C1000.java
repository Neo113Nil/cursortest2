package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.MBBannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ḯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1000 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f2925;

    public C1000(C0971 c0971) {
        this.f2925 = c0971;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0971 c0971 = this.f2925;
        MBBannerView mBBannerView = (MBBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        c0971.getClass();
        mBBannerView.setBannerAdListener(bannerAdListener);
        return null;
    }
}
