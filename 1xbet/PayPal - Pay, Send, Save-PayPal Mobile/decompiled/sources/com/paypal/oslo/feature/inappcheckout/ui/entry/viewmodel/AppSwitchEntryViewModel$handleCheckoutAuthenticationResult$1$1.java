package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AppSwitchEntryViewModel$handleCheckoutAuthenticationResult$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ((com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel) this.receiver).Camera2StreamConfigurationMap(event);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event event) {
        getHighSpeedVideoFpsRanges(event);
        return kotlin.Unit.INSTANCE;
    }

    AppSwitchEntryViewModel$handleCheckoutAuthenticationResult$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$Event;)V", 0);
    }
}
