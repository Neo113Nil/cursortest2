package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PayFlowContainerScreenKt$PayFlowContainerScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent payFlowContainerEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payFlowContainerEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel) this.receiver).handleIntent(payFlowContainerEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerEvent payFlowContainerEvent) {
        getHighResolutionOutputSizeshNQ4ISI(payFlowContainerEvent);
        return kotlin.Unit.INSTANCE;
    }

    PayFlowContainerScreenKt$PayFlowContainerScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel.class, "handleIntent", "handleIntent(Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerEvent;)V", 0);
    }
}
