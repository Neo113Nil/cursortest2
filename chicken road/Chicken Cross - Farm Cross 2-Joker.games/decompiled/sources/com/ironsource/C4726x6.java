package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.x6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4726x6 implements InterfaceC4762z6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4672u6 f8757a;
    private final C4565o6 b;
    private boolean c;

    public C4726x6(C4672u6 strategy, C4565o6 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f8757a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f8757a.a("show called while loading");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.c) {
            this.f8757a.a(new C4708w6(this.f8757a, this.b, null, false));
            return;
        }
        C4565o6 a2 = this.f8757a.b().a(false, this.f8757a.c());
        this.f8757a.a(new C4708w6(this.f8757a, this.b, a2, true));
        this.f8757a.d().b(adInfo);
        a2.a(this.f8757a);
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void c(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8757a.a("ad info changed while loading");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void loadAd() {
        if (this.c) {
            this.f8757a.a("load called while loading");
        }
        this.c = true;
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8757a.a("show success while loading");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8757a.a("show failed while loading");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8757a.a("ad expired while loading");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8757a.a(new C4690v6(this.f8757a));
        if (this.c) {
            this.f8757a.d().b(ironSourceError);
        }
    }
}
