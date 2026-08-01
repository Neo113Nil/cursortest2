package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴮ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0937 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2634;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityInitError f2635;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Set f2636;

    public C0937(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        this.f2636 = set;
        this.f2635 = iSAdQualityInitError;
        this.f2634 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        for (ISAdQualityInitListener iSAdQualityInitListener : this.f2636) {
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitFailed(this.f2635, this.f2634);
            }
        }
        this.f2636.clear();
    }
}
