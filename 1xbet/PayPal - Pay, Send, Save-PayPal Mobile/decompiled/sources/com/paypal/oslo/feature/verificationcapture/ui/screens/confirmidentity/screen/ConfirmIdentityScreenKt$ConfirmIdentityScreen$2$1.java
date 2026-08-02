package com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ConfirmIdentityScreenKt$ConfirmIdentityScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityEvent confirmIdentityEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmIdentityEvent, "");
        ((com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel) this.receiver).processEvent(confirmIdentityEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityEvent confirmIdentityEvent) {
        Camera2StreamConfigurationMap(confirmIdentityEvent);
        return kotlin.Unit.INSTANCE;
    }

    ConfirmIdentityScreenKt$ConfirmIdentityScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityEvent;)V", 0);
    }
}
