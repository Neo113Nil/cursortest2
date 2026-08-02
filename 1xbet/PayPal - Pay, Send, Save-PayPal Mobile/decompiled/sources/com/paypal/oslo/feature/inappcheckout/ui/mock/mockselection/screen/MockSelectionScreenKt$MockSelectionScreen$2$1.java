package com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MockSelectionScreenKt$MockSelectionScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel) this.receiver).onEvent(event);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event event) {
        getHighResolutionOutputSizeshNQ4ISI(event);
        return kotlin.Unit.INSTANCE;
    }

    MockSelectionScreenKt$MockSelectionScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;)V", 0);
    }
}
