package com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class GenericFailureScreenKt$GenericFailureScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent genericFailureEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericFailureEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel) this.receiver).processEvent(genericFailureEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent genericFailureEvent) {
        Camera2StreamConfigurationMap(genericFailureEvent);
        return kotlin.Unit.INSTANCE;
    }

    GenericFailureScreenKt$GenericFailureScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.viewmodel.GenericFailureViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent;)V", 0);
    }
}
