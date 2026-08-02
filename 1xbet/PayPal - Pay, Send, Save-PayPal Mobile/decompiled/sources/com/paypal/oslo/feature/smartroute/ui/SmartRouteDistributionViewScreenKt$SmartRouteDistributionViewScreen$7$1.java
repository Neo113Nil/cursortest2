package com.paypal.oslo.feature.smartroute.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent distributionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionEvent, "");
        ((com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel) this.receiver).onEvent(distributionEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent distributionEvent) {
        getHighSpeedVideoFpsRangesFor(distributionEvent);
        return kotlin.Unit.INSTANCE;
    }

    SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;)V", 0);
    }
}
