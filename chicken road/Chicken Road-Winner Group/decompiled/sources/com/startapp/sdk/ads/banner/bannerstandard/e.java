package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.jk;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard.a f2938a;

    public e(BannerStandard.a aVar) {
        this.f2938a = aVar;
    }

    public final void a(boolean z3, jk jkVar) {
        this.f2938a.fireViewableChangeEvent(z3);
        this.f2938a.fireExposureChangeEvent(jkVar);
        if (z3) {
            BannerStandard.this.proceedWithImpression();
        }
    }
}
