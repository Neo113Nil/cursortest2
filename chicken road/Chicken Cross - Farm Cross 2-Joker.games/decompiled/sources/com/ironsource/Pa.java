package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Pa implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final La f7848a;
    private final J2 b;

    public Pa(La strategy, J2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f7848a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Qa
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7848a.a(adUnitCallback, this.b);
        La la = this.f7848a;
        la.a(new Oa(la, this.b));
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f7848a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.b.a(true);
        this.f7848a.a((J2) null);
        La la = this.f7848a;
        la.a(new Na(la));
    }

    @Override // com.ironsource.Qa
    public void b(IronSourceError ironSourceError) {
        this.f7848a.a(ironSourceError);
        this.b.a(false);
        this.f7848a.a((J2) null);
        La la = this.f7848a;
        la.a(new Na(la));
    }
}
