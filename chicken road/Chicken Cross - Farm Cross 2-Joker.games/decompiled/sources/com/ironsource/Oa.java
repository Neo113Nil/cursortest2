package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Oa implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final La f7838a;
    private final J2 b;

    public Oa(La strategy, J2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f7838a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Qa
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7838a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f7838a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.b.a(true);
        this.f7838a.a((J2) null);
        La la = this.f7838a;
        la.a(new Na(la));
    }

    @Override // com.ironsource.Qa
    public void b(IronSourceError ironSourceError) {
        this.f7838a.a("Ad unit is already loaded");
    }
}
