package com.ironsource;

/* loaded from: classes5.dex */
public final class Fa implements com.ironsource.La {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ba f5702a;
    private final com.ironsource.L2 b;
    private final java.lang.Long c;
    private com.ironsource.Ef.a d;
    private final long e;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.ironsource.AbstractC3036f3.c b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.ironsource.AbstractC3036f3.c cVar, long j) {
            super(0);
            this.b = cVar;
            this.c = j;
        }

        public final void a() {
            com.ironsource.Fa.this.f5702a.a(com.ironsource.Fa.this.b, this.b, java.lang.Long.valueOf(this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public Fa(com.ironsource.Ba strategy, com.ironsource.L2 currentAdUnit, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f5702a = strategy;
        this.b = currentAdUnit;
        this.c = l;
        this.e = strategy.p().a();
        strategy.r();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final com.ironsource.Fa this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.C3312ub.a(this$0.f5702a.a(), new java.lang.Runnable() { // from class: com.ironsource.Fa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Fa.d(com.ironsource.Fa.this);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.Fa this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.ironsource.Cg.a(this$0.f5702a.k(), new android.graphics.Rect())) {
            this$0.e();
            return;
        }
        long a2 = this$0.f5702a.p().a();
        long j = a2 - this$0.e;
        java.lang.Long l = this$0.c;
        com.ironsource.C3312ub.a((com.ironsource.C3312ub) this$0.f5702a.a(), com.ironsource.AbstractRunnableC3136ke.f6349a.a(this$0.new a(new com.ironsource.AbstractC3036f3.c(l != null ? a2 - l.longValue() : 0L, new com.ironsource.AbstractC3036f3.d.f(j)), a2)), 0L, 2, (java.lang.Object) null);
    }

    private final void e() {
        long q = this.f5702a.q();
        com.ironsource.Ef o = this.f5702a.o();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.ironsource.Fa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Fa.c(com.ironsource.Fa.this);
            }
        };
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        this.d = o.a(runnable, kotlin.time.DurationKt.toDuration(q, kotlin.time.DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.La
    public void f() {
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5702a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.La
    public void b() {
        this.f5702a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.La
    public void c() {
        com.ironsource.Ef.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        com.ironsource.Ba ba = this.f5702a;
        ba.a((com.ironsource.La) new com.ironsource.Ea(ba));
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5702a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.La
    public void d() {
        com.ironsource.Ef.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        com.ironsource.Ba ba = this.f5702a;
        ba.a((com.ironsource.La) new com.ironsource.Ha(ba, this.b));
    }
}
