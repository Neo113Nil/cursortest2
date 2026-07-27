package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0941 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0932 f2645;

    public C0941(C0932 c0932) {
        this.f2645 = c0932;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        Iterator it = this.f2645.f2607.iterator();
        while (it.hasNext()) {
            ISAdQualityInitListener iSAdQualityInitListener = (ISAdQualityInitListener) it.next();
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitSuccess();
            }
        }
        this.f2645.f2607.clear();
    }
}
