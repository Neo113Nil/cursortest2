package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4717wf extends Sg {
    private final Uc d;
    private final Mg e;
    private final H f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4717wf(T0 adTools, Uc outcomeReporter, Mg waterfallInstances, H adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
        this.f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.Sg
    public void a(B instance) {
        B a2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f.a(instance)) {
            this.d.a(this.e.b(), instance);
        } else {
            if (!this.f.a() || (a2 = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), a2);
        }
    }

    @Override // com.ironsource.Sg
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Sg
    public void c(B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.d.a(this.e.b(), instanceToShow);
    }

    @Override // com.ironsource.Sg
    public void a() {
        B a2 = this.f.c().a();
        if (a2 != null) {
            this.d.a(this.e.b(), a2);
        }
    }
}
