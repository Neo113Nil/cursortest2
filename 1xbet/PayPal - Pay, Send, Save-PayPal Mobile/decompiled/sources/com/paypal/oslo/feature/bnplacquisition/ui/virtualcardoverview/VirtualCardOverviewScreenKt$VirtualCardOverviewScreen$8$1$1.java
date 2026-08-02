package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$8$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent virtualCardOverviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardOverviewEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel) this.receiver).processEvent(virtualCardOverviewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent virtualCardOverviewEvent) {
        Camera2StreamConfigurationMap(virtualCardOverviewEvent);
        return kotlin.Unit.INSTANCE;
    }

    VirtualCardOverviewScreenKt$VirtualCardOverviewScreen$8$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewEvent;)V", 0);
    }
}
