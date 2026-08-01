package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.〵, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1096 implements ISAdQualityInitListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1022 f3216;

    public C1096(C1022 c1022) {
        this.f3216 = c1022;
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
        C0932.m5757(this.f3216.f3039.f2607, iSAdQualityInitError, str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitSuccess() {
        C0932 c0932 = this.f3216.f3039;
        String str = C0932.f2604;
        c0932.getClass();
        AbstractC1145.m5891(new C0941(c0932));
    }
}
