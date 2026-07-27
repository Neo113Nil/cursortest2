package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G4 extends Sg {
    private final Uc d;
    private final Mg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G4(T0 adTools, Uc outcomeReporter, Mg waterfallInstances) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
    }

    @Override // com.ironsource.Sg
    public void a() {
    }

    @Override // com.ironsource.Sg
    public void a(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Sg
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.d.a(this.e.b(), instance);
    }

    @Override // com.ironsource.Sg
    public void c(B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }
}
