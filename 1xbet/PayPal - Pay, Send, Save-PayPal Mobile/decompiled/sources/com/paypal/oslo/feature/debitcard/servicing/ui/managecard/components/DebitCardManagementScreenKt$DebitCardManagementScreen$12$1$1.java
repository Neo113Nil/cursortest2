package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DebitCardManagementScreenKt$DebitCardManagementScreen$12$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent debitCardManagementEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel) this.receiver).processEvent(debitCardManagementEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent debitCardManagementEvent) {
        getHighResolutionOutputSizeshNQ4ISI(debitCardManagementEvent);
        return kotlin.Unit.INSTANCE;
    }

    DebitCardManagementScreenKt$DebitCardManagementScreen$12$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
