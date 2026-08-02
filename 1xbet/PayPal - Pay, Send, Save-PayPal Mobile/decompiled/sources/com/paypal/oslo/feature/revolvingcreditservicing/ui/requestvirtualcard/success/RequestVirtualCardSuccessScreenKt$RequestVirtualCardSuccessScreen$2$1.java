package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RequestVirtualCardSuccessScreenKt$RequestVirtualCardSuccessScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEvent requestVirtualCardSuccessEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardSuccessEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessViewModel) this.receiver).processEvent(requestVirtualCardSuccessEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEvent requestVirtualCardSuccessEvent) {
        getHighSpeedVideoFpsRanges(requestVirtualCardSuccessEvent);
        return kotlin.Unit.INSTANCE;
    }

    RequestVirtualCardSuccessScreenKt$RequestVirtualCardSuccessScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessEvent;)V", 0);
    }
}
