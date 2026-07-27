package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D6 implements G6 {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f7595a;
    private final C4565o6 b;
    private final C4565o6 c;

    public D6(A6 strategy, C4565o6 currentAdUnit, C4565o6 progressiveAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.f7595a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
    }

    @Override // com.ironsource.G6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7595a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.G6
    public void b(IronSourceError ironSourceError) {
        A6 a6 = this.f7595a;
        a6.a(new B6(a6, this.b, false, 4, null));
    }

    @Override // com.ironsource.G6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        A6 a6 = this.f7595a;
        a6.a(new C6(a6, this.b, this.c, adInfo));
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        A6 a6 = this.f7595a;
        a6.a(new F6(a6, this.c));
    }

    @Override // com.ironsource.G6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7595a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.G6
    public void a() {
        this.f7595a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.G6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7595a.a("show success before progressive load success");
    }

    @Override // com.ironsource.G6
    public void c(IronSourceError ironSourceError) {
        this.f7595a.a("show failed before progressive load success");
    }
}
