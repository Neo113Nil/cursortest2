package com.paypal.oslo.feature.inappcheckout.ui.ryp.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class RypScreenKt$RypScreen$7$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ((com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel) this.receiver).onEvent(event);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event event) {
        Camera2StreamConfigurationMap(event);
        return kotlin.Unit.INSTANCE;
    }

    RypScreenKt$RypScreen$7$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;)V", 0);
    }
}
