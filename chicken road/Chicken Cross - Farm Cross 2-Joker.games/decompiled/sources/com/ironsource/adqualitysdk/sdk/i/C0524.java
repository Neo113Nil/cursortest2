package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.є, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0524 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f1191;

    public C0524(C0470 c0470) {
        this.f1191 = c0470;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0516 c0516;
        C0470 c0470 = this.f1191;
        synchronized (c0470) {
            c0516 = c0470.f891;
        }
        if (!c0516.f1171.m5449()) {
            C0932 c0932 = this.f1191.f882.f3359.f3039;
            C0932.m5757(c0932.f2607, ISAdQualityInitError.NO_NETWORK_CONNECTION, StringFog.decrypt("/tXT+S3hFjrC0dP0J/sPMNPOmvgm\n", "sLrzl0iVYVU=\n"));
            return;
        }
        if (this.f1191.mo5405()) {
            return;
        }
        C0932 c09322 = this.f1191.f882.f3359.f3039;
        C0932.m5757(c09322.f2607, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, StringFog.decrypt("maRGzu+GTQm5g36K7bdnRbOYaczXlAwJv5ZjisqaQQC/gnM=\n", "0PcHqr7zLGU=\n"));
    }
}
