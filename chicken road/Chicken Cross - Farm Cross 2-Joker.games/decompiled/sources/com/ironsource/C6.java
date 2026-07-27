package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C6 implements G6 {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f7581a;
    private final C4565o6 b;
    private final C4565o6 c;
    private LevelPlayAdInfo d;

    public C6(A6 strategy, C4565o6 currentAdUnit, C4565o6 progressiveAdUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7581a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
        this.d = adInfo;
    }

    @Override // com.ironsource.G6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7581a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.G6
    public void b(IronSourceError ironSourceError) {
        this.f7581a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.G6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7581a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        this.f7581a.d().b(this.d);
        A6 a6 = this.f7581a;
        a6.a(new E6(a6, this.c));
    }

    @Override // com.ironsource.G6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d = adInfo;
    }

    @Override // com.ironsource.G6
    public void c(IronSourceError ironSourceError) {
        this.f7581a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.G6
    public void a() {
        A6 a6 = this.f7581a;
        a6.a(new B6(a6, this.b, true));
    }

    @Override // com.ironsource.G6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7581a.a("show success on progressive ad unit that already loaded");
    }
}
