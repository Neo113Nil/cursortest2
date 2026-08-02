package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$4$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent manageAgreementEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAgreementEvent, "");
        ((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel) this.receiver).onEvent(manageAgreementEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent manageAgreementEvent) {
        getHighSpeedVideoFpsRangesFor(manageAgreementEvent);
        return kotlin.Unit.INSTANCE;
    }

    ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$4$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent;)V", 0);
    }
}
