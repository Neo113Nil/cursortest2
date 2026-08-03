package com.ironsource;

/* loaded from: classes5.dex */
public final class Ia implements com.ironsource.La {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ba f5755a;
    private final com.ironsource.L2 b;
    private final com.ironsource.L2 c;
    private final long d;
    private final boolean e;
    private com.ironsource.InterfaceC3187nb<com.unity3d.mediation.LevelPlayAdInfo> f;
    private com.ironsource.Ef.a g;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.ironsource.Ia, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Ia.a f5756a = new com.ironsource.Ia.a();

        a() {
            super(1);
        }

        public final void a(com.ironsource.Ia weak) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weak, "$this$weak");
            weak.e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.ironsource.Ia ia) {
            a(ia);
            return kotlin.Unit.INSTANCE;
        }
    }

    public Ia(com.ironsource.Ba strategy, com.ironsource.L2 currentAdUnit, com.ironsource.L2 reloadingAdUnit, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f5755a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        com.ironsource.InterfaceC3187nb<com.unity3d.mediation.LevelPlayAdInfo> interfaceC3187nb = this.f;
        if (interfaceC3187nb == null) {
            com.ironsource.Ba ba = this.f5755a;
            ba.a((com.ironsource.La) new com.ironsource.Ka(ba, this.b, this.c, this.d, this.e));
        } else if (interfaceC3187nb instanceof com.ironsource.InterfaceC3187nb.b) {
            a((com.unity3d.mediation.LevelPlayAdInfo) ((com.ironsource.InterfaceC3187nb.b) interfaceC3187nb).b());
        } else if (interfaceC3187nb instanceof com.ironsource.InterfaceC3187nb.a) {
            b(((com.ironsource.InterfaceC3187nb.a) interfaceC3187nb).b());
        }
    }

    private final void g() {
        com.ironsource.Ef o = this.f5755a.o();
        com.ironsource.Ef.b a2 = com.ironsource.T6.a(this, com.ironsource.Ia.a.f5756a);
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        this.g = o.a(a2, kotlin.time.DurationKt.toDuration(this.f5755a.l(), kotlin.time.DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    @Override // com.ironsource.La
    public void b() {
        this.f5755a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.La
    public void c() {
        com.ironsource.Ef.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        this.c.a(true);
        com.ironsource.Ba ba = this.f5755a;
        ba.a((com.ironsource.La) new com.ironsource.Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        com.ironsource.Ef.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        com.ironsource.Ba ba = this.f5755a;
        ba.a((com.ironsource.La) new com.ironsource.Ha(ba, this.b));
    }

    @Override // com.ironsource.La
    public void f() {
        com.ironsource.Ba ba = this.f5755a;
        ba.a((com.ironsource.La) new com.ironsource.Ia(ba, this.b, this.c, ba.p().a(), false, 16, null));
    }

    private final void b(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5755a.a(ironSourceError, this.b, (com.ironsource.AbstractC3036f3) new com.ironsource.AbstractC3036f3.c(this.f5755a.p().a() - this.d, com.ironsource.AbstractC3036f3.d.g.f6248a), this.e, false, java.lang.Long.valueOf(this.d));
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        com.unity3d.mediation.LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            a(new com.ironsource.InterfaceC3187nb.b(c));
        } else {
            a(new com.ironsource.InterfaceC3187nb.a(new com.ironsource.mediationsdk.logger.IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new com.ironsource.mediationsdk.logger.IronSourceError(0, "Unknown error");
        }
        a(new com.ironsource.InterfaceC3187nb.a(ironSourceError));
    }

    private final void a(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
        long a2 = this.f5755a.p().a() - this.d;
        this.f5755a.a(new com.ironsource.C3301u0(this.c, levelPlayAdInfo), this.c, this.b, (com.ironsource.AbstractC3036f3) new com.ironsource.AbstractC3036f3.c(a2, com.ironsource.AbstractC3036f3.d.h.f6249a), false, java.lang.Long.valueOf(this.d));
    }

    public /* synthetic */ Ia(com.ironsource.Ba ba, com.ironsource.L2 l2, com.ironsource.L2 l22, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    private final void a(com.ironsource.InterfaceC3187nb<com.unity3d.mediation.LevelPlayAdInfo> interfaceC3187nb) {
        java.lang.String b;
        if (this.f != null) {
            com.ironsource.Ba ba = this.f5755a;
            b = com.ironsource.Ja.b(interfaceC3187nb);
            ba.a("Received excessive load " + b + " while reloading");
            return;
        }
        this.f = interfaceC3187nb;
    }
}
