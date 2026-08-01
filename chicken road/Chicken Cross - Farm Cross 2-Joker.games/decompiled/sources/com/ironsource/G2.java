package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4596q1 f7633a;
    private final Executor b;

    public G2(InterfaceC4596q1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f7633a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.F2
    public BannerAdView a(J9 adInstance, C4370d8 adContainer, W1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new N2(adInstance, adContainer, auctionDataReporter, this.f7633a, null, null, null, null, null, 496, null));
    }
}
