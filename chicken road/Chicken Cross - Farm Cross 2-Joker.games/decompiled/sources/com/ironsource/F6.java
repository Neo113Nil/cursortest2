package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F6 implements G6 {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f7625a;
    private final C4565o6 b;

    public F6(A6 strategy, C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f7625a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.G6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7625a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.G6
    public void b(IronSourceError ironSourceError) {
        A6 a6 = this.f7625a;
        a6.a(new B6(a6, this.b, false, 4, null));
        this.f7625a.d().b(ironSourceError);
    }

    @Override // com.ironsource.G6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        A6 a6 = this.f7625a;
        a6.a(new E6(a6, this.b));
        this.f7625a.d().b(adInfo);
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        this.f7625a.d().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.G6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7625a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.G6
    public void c(IronSourceError ironSourceError) {
        this.f7625a.a("show failed while loading");
    }

    @Override // com.ironsource.G6
    public void a() {
        this.f7625a.a("ad expired while loading");
    }

    @Override // com.ironsource.G6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7625a.a("show success while loading");
    }
}
