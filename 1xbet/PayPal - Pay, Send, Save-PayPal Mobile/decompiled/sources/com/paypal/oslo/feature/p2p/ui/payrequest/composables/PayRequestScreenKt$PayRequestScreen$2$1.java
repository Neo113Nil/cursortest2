package com.paypal.oslo.feature.p2p.ui.payrequest.composables;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PayRequestScreenKt$PayRequestScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent payRequestEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payRequestEvent, "");
        ((com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel) this.receiver).processEvent(payRequestEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent payRequestEvent) {
        Camera2StreamConfigurationMap(payRequestEvent);
        return kotlin.Unit.INSTANCE;
    }

    PayRequestScreenKt$PayRequestScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;)V", 0);
    }
}
