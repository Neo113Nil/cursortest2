package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class HomeScreenKt$HomeScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.home.ui.mvi.HomeEvent homeEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeEvent, "");
        ((com.paypal.oslo.feature.home.ui.HomeViewModel) this.receiver).processEvent(homeEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.home.ui.mvi.HomeEvent homeEvent) {
        getHighResolutionOutputSizeshNQ4ISI(homeEvent);
        return kotlin.Unit.INSTANCE;
    }

    HomeScreenKt$HomeScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.home.ui.HomeViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;)V", 0);
    }
}
