package com.ironsource;

import com.ironsource.AbstractC4365d3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ja implements Ka {

    /* renamed from: a, reason: collision with root package name */
    private final Ba f7715a;
    private final J2 b;
    private final J2 c;
    private final long d;
    private final boolean e;

    public Ja(Ba strategy, J2 currentAdUnit, J2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f7715a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7715a.a(adUnitCallback, this.c, this.b, (AbstractC4365d3) new AbstractC4365d3.c(this.f7715a.o().a() - this.d, AbstractC4365d3.d.C1322d.f8129a), false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.f7715a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Ka
    public void c() {
        this.b.a(true);
        this.c.a(true);
        Ba ba = this.f7715a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        Ba ba = this.f7715a;
        ba.a((Ka) new Ga(ba, this.b));
    }

    @Override // com.ironsource.Ka
    public void f() {
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        this.f7715a.a(ironSourceError, this.b, (AbstractC4365d3) new AbstractC4365d3.c(this.f7715a.o().a() - this.d, AbstractC4365d3.d.c.f8128a), this.e, false, Long.valueOf(this.d));
    }

    public /* synthetic */ Ja(Ba ba, J2 j2, J2 j22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, j2, j22, j, (i & 16) != 0 ? true : z);
    }
}
