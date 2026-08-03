package com.ironsource;

/* loaded from: classes5.dex */
public class G4 extends com.ironsource.H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G4(com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.Jg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.H
    public void a(com.ironsource.B instance, com.ironsource.H.b loadSelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.q() + " is ready to load");
        loadSelection.a().add(instance);
    }
}
