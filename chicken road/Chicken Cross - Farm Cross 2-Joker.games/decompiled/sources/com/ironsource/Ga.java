package com.ironsource;

import com.ironsource.AbstractC4365d3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ga implements Ka {

    /* renamed from: a, reason: collision with root package name */
    private final Ba f7638a;
    private final J2 b;

    public Ga(Ba strategy, J2 currentAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f7638a = strategy;
        this.b = currentAdUnit;
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7638a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.f7638a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ka
    public void c() {
        this.b.a(true);
        Ba ba = this.f7638a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
    }

    @Override // com.ironsource.Ka
    public void f() {
        Ba.a(this.f7638a, this.b, (AbstractC4365d3) new AbstractC4365d3.a(AbstractC4365d3.b.c.f8124a), false, 4, (Object) null);
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        this.f7638a.a("Received load failed while paused");
    }
}
