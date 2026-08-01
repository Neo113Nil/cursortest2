package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4690v6 implements InterfaceC4762z6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4672u6 f8730a;

    public C4690v6(C4672u6 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f8730a = strategy;
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f8730a.a("show called before load success");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8730a.a("load success before load called");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void c(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8730a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void loadAd() {
        C4565o6 a2 = this.f8730a.b().a(true, this.f8730a.c());
        this.f8730a.a(new C4726x6(this.f8730a, a2, true));
        a2.a(this.f8730a);
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8730a.a("ad expired before load called");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8730a.a("load failed before load called");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8730a.a("ad display success before load called");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8730a.a("ad display failed before load called");
    }
}
