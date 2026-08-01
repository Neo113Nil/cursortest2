package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.〳, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1095 implements ISAdQualityAdListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1022 f3215;

    public C1095(C1022 c1022) {
        this.f3215 = c1022;
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
        ISAdQualityAdListener iSAdQualityAdListener = this.f3215.f3039.f2612;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adClosed(str, iSAdQualityAdType);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
        ISAdQualityAdListener iSAdQualityAdListener = this.f3215.f3039.f2612;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adDisplayed(str, iSAdQualityAdType);
        }
    }
}
