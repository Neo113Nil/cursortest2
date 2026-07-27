package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Da implements Ka {

    /* renamed from: a, reason: collision with root package name */
    private final Ba f7600a;

    public Da(Ba strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f7600a = strategy;
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7600a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.f7600a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ka
    public void c() {
        this.f7600a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ka
    public void d() {
        this.f7600a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Ka
    public void f() {
        this.f7600a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        this.f7600a.a("Received load failed on a destroyed ad");
    }
}
