package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Na implements Qa {

    /* renamed from: a, reason: collision with root package name */
    private final La f7809a;

    public Na(La strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f7809a = strategy;
    }

    @Override // com.ironsource.Qa
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7809a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void b() {
        this.f7809a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void c() {
        this.f7809a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Qa
    public void b(IronSourceError ironSourceError) {
        this.f7809a.a("Received load failed on a destroyed ad");
    }
}
