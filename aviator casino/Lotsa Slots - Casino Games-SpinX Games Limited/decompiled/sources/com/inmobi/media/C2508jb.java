package com.inmobi.media;

/* renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2508jb extends com.inmobi.media.AbstractC2735s1 {
    public final com.inmobi.media.C2631o1 b;
    public final com.inmobi.media.Ic c;
    public kotlinx.coroutines.Job d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2508jb(com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.Ic stateMachine) {
        super(adManagerComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    public static final kotlin.Unit a(com.inmobi.media.C2508jb c2508jb) {
        c2508jb.c.e();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC2735s1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC2735s1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC2735s1
    public final void e() {
        com.inmobi.media.L6.a(this.d);
        this.d = null;
    }

    public final void g() {
        kotlinx.coroutines.Job launch$default;
        long j = this.f5436a.c;
        kotlinx.coroutines.CoroutineScope coroutineScope = this.b.e;
        kotlin.jvm.functions.Function0 timeOutCallback = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.jb$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2508jb.a(com.inmobi.media.C2508jb.this);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeOutCallback, "timeOutCallback");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.Jk(j, timeOutCallback, null), 3, null);
        this.d = launch$default;
    }

    @Override // com.inmobi.media.AbstractC2735s1
    public final void a() {
        com.inmobi.media.L6.a(this.d);
        this.d = null;
    }
}
