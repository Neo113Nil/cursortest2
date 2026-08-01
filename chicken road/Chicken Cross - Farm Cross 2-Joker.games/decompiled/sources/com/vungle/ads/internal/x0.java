package com.vungle.ads.internal;

import com.vungle.ads.BaseFullscreenAd$play$2;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class x0 extends com.vungle.ads.internal.presenter.c {
    public final /* synthetic */ y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(BaseFullscreenAd$play$2 baseFullscreenAd$play$2, y0 y0Var) {
        super(baseFullscreenAd$play$2);
        this.b = y0Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        this.b.a(h.f);
        this.f12081a.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        this.b.a(h.e);
        this.f12081a.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) {
        this.b.a(h.d);
        this.b.l.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        y0 y0Var = this.b;
        q1 q1Var = y0Var.l;
        analyticsClient.a(q1Var, y0Var.m, q1Var.b);
        this.f12081a.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.b.a(h.g);
        super.onFailure(error);
    }
}
