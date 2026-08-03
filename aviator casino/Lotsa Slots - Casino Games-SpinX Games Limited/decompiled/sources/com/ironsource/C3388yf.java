package com.ironsource;

/* renamed from: com.ironsource.yf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3388yf extends com.ironsource.Pg {
    private final com.ironsource.Uc d;
    private final com.ironsource.Jg e;
    private final com.ironsource.H f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3388yf(com.ironsource.V0 adTools, com.ironsource.Uc outcomeReporter, com.ironsource.Jg waterfallInstances, com.ironsource.H adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
        this.f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.Pg
    public void a(com.ironsource.B instance) {
        com.ironsource.B a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f.a(instance)) {
            this.d.a(this.e.b(), instance);
        } else {
            if (!this.f.a() || (a2 = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), a2);
        }
    }

    @Override // com.ironsource.Pg
    public void b(com.ironsource.B instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Pg
    public void c(com.ironsource.B instanceToShow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.d.a(this.e.b(), instanceToShow);
    }

    @Override // com.ironsource.Pg
    public void a() {
        com.ironsource.B a2 = this.f.c().a();
        if (a2 != null) {
            this.d.a(this.e.b(), a2);
        }
    }
}
