package com.ironsource;

/* renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3197o3 extends com.ironsource.H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3197o3(com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.Jg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.H
    public void a(com.ironsource.B instance, com.ironsource.H.b loadSelection) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        if (!instance.v()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.p() + " (non-bidder) is ready to load");
            loadSelection.a().add(instance);
            return;
        }
        loadSelection.a(true);
        if (loadSelection.e()) {
            str = "Advanced Loading: Starting to load bidder " + instance.p() + ". No other instances will be loaded at the same time.";
            loadSelection.a().add(instance);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + instance.p() + " as a non bidder is being loaded";
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(instance.d().name() + " - " + str);
    }

    @Override // com.ironsource.H
    public boolean a(com.ironsource.H.b loadSelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return super.a(loadSelection) || loadSelection.d();
    }
}
