package com.ironsource;

/* loaded from: classes5.dex */
public final class J4 extends com.ironsource.Pg {
    private final com.ironsource.Uc d;
    private final com.ironsource.Jg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(com.ironsource.V0 adTools, com.ironsource.Uc outcomeReporter, com.ironsource.Jg waterfallInstances) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
    }

    @Override // com.ironsource.Pg
    public void a() {
    }

    @Override // com.ironsource.Pg
    public void a(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Pg
    public void b(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.d.a(this.e.b(), instance);
    }

    @Override // com.ironsource.Pg
    public void c(com.ironsource.B instanceToShow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }
}
