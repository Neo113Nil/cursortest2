package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ca implements Ka {

    /* renamed from: a, reason: collision with root package name */
    private final Ba f7582a;
    private boolean b;

    public Ca(Ba strategy, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f7582a = strategy;
        this.b = z;
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7582a.a("Received load success before load");
    }

    @Override // com.ironsource.Ka
    public void b() {
        J2 a2 = this.f7582a.i().a(true);
        this.f7582a.a((Ka) new Fa(this.f7582a, a2, this.b));
        a2.a(this.f7582a.g());
    }

    @Override // com.ironsource.Ka
    public void c() {
        Ba ba = this.f7582a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.Ka
    public void f() {
        this.b = false;
    }

    public /* synthetic */ Ca(Ba ba, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, (i & 2) != 0 ? false : z);
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        this.f7582a.a("Received load failed before load");
    }
}
