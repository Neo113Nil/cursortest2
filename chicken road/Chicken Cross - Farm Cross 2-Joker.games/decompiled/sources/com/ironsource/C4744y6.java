package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4744y6 implements InterfaceC4762z6, InterfaceC4618r6 {

    /* renamed from: a, reason: collision with root package name */
    private final C4672u6 f8772a;
    private final C4565o6 b;
    private C4565o6 c;

    public C4744y6(C4672u6 strategy, C4565o6 currentAdUnit, C4565o6 c4565o6) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f8772a = strategy;
        this.b = currentAdUnit;
        this.c = c4565o6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f8772a.a("show called while showing");
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.f8772a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void c(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.f8772a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.J0
    public void e() {
        this.f8772a.c().e();
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void loadAd() {
        this.f8772a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC4618r6
    public void onClosed() {
        this.f8772a.a(a(this, null, 1, null));
        this.f8772a.c().onClosed();
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.f8772a.d().a(adInfo);
        } else {
            this.f8772a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void b(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.f8772a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (!Intrinsics.areEqual(adUnit, this.b)) {
            this.f8772a.a("progressive show failed while showing current ad");
            return;
        }
        this.f8772a.a(a(ironSourceError));
        this.f8772a.d().c(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4762z6
    public void a(C4565o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.f8772a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4618r6
    public void a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f8772a.c().a(reward);
    }

    static /* synthetic */ InterfaceC4762z6 a(C4744y6 c4744y6, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return c4744y6.a(ironSourceError);
    }

    private final InterfaceC4762z6 a(IronSourceError ironSourceError) {
        if (Y4.f8021a.a(ironSourceError)) {
            return new C4708w6(this.f8772a, this.b, this.c, true);
        }
        C4565o6 c4565o6 = this.c;
        if (c4565o6 == null) {
            return new C4690v6(this.f8772a);
        }
        if (c4565o6.e() != null) {
            return new C4708w6(this.f8772a, c4565o6, null, false, 8, null);
        }
        return new C4726x6(this.f8772a, c4565o6, false);
    }
}
