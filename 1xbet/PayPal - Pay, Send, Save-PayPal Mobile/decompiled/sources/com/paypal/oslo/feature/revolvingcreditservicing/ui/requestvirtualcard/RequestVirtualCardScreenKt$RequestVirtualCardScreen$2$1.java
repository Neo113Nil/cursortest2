package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RequestVirtualCardScreenKt$RequestVirtualCardScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent requestVirtualCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel) this.receiver).processEvent(requestVirtualCardEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent requestVirtualCardEvent) {
        getHighSpeedVideoSizes(requestVirtualCardEvent);
        return kotlin.Unit.INSTANCE;
    }

    RequestVirtualCardScreenKt$RequestVirtualCardScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardEvent;)V", 0);
    }
}
