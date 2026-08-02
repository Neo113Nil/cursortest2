package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ManageCardScreenKt$ManageCardScreen$4$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent manageCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel) this.receiver).processEvent(manageCardEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent manageCardEvent) {
        Camera2StreamConfigurationMap(manageCardEvent);
        return kotlin.Unit.INSTANCE;
    }

    ManageCardScreenKt$ManageCardScreen$4$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;)V", 0);
    }
}
