package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ma implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final La f7795a;

    public Ma(La strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f7795a = strategy;
    }

    @Override // com.ironsource.Qa
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7795a.a("Received load success before load called");
    }

    @Override // com.ironsource.Qa
    public void b() {
        J2 a2 = this.f7795a.i().a(true);
        this.f7795a.a(a2);
        La la = this.f7795a;
        la.a(new Pa(la, a2));
        a2.a(this.f7795a.g());
    }

    @Override // com.ironsource.Qa
    public void c() {
        J2 k = this.f7795a.k();
        if (k != null) {
            k.a(false);
        }
        this.f7795a.a((J2) null);
        La la = this.f7795a;
        la.a(new Na(la));
    }

    @Override // com.ironsource.Qa
    public void b(IronSourceError ironSourceError) {
        this.f7795a.a("Received load failed before load called");
    }
}
