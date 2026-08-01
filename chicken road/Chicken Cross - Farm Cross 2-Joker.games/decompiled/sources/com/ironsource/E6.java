package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class E6 implements G6 {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f7611a;
    private final C4565o6 b;

    public E6(A6 strategy, C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f7611a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.G6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, this.f7611a);
    }

    @Override // com.ironsource.G6
    public void b(IronSourceError ironSourceError) {
        this.f7611a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.G6
    public void c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7611a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        A6 a6 = this.f7611a;
        a6.a(new B6(a6, null, false, 4, null));
        this.f7611a.loadAd();
    }

    @Override // com.ironsource.G6
    public void a() {
        A6 a6 = this.f7611a;
        a6.a(new B6(a6, null, true));
        this.f7611a.d().a();
    }

    @Override // com.ironsource.G6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7611a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.G6
    public void c(IronSourceError ironSourceError) {
        if (!Y4.f8021a.a(ironSourceError)) {
            A6 a6 = this.f7611a;
            a6.a(new B6(a6, null, false, 4, null));
        }
        this.f7611a.d().c(ironSourceError);
    }

    @Override // com.ironsource.G6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7611a.d().a(adInfo);
        C4565o6 a2 = this.f7611a.b().a(false, this.f7611a.c());
        A6 a6 = this.f7611a;
        a6.a(new D6(a6, this.b, a2));
        a2.a(this.f7611a);
    }
}
