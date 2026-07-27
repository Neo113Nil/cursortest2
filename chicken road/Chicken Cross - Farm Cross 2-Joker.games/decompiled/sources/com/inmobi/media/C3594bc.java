package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.bc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3594bc extends AbstractC4120u1 {
    public final C4008q1 b;
    public final Ad c;
    public Job d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3594bc(C4008q1 adManagerComponent, Ad stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    public static final Unit a(C3594bc c3594bc) {
        c3594bc.c.e();
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4120u1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC4120u1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC4120u1
    public final void e() {
        AbstractC3787i7.a(this.d);
        this.d = null;
    }

    public final void g() {
        Job launch$default;
        long j = this.f7406a.c;
        String str = "[AdFlow] startLoadTimeoutJob called: " + j;
        CoroutineScope coroutineScope = this.b.e;
        Function0 timeOutCallback = new Function0() { // from class: com.inmobi.media.bc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3594bc.a(C3594bc.this);
            }
        };
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(timeOutCallback, "timeOutCallback");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Fm(j, timeOutCallback, null), 3, null);
        this.d = launch$default;
    }

    @Override // com.inmobi.media.AbstractC4120u1
    public final void a() {
        AbstractC3787i7.a(this.d);
        this.d = null;
    }
}
