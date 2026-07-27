package com.ironsource;

import com.ironsource.AbstractC4365d3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Fa implements Ka {

    /* renamed from: a, reason: collision with root package name */
    private final Ba f7626a;
    private final J2 b;
    private boolean c;

    public Fa(Ba strategy, J2 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f7626a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7626a.a(adUnitCallback, this.b, (J2) null, new AbstractC4365d3.a(AbstractC4365d3.b.C1321b.f8123a), this.c, (Long) null);
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.f7626a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Ka
    public void c() {
        this.b.a(true);
        Ba ba = this.f7626a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        this.c = true;
    }

    @Override // com.ironsource.Ka
    public void f() {
        this.c = false;
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        this.f7626a.a(ironSourceError, this.b, (AbstractC4365d3) new AbstractC4365d3.a(AbstractC4365d3.b.a.f8122a), false, this.c, (Long) null);
    }
}
