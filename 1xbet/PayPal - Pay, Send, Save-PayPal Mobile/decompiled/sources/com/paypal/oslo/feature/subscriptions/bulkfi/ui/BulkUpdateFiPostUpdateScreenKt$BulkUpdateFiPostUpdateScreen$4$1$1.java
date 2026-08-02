package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$4$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent bulkUpdateFiPostUpdateUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiPostUpdateUiEvent, "");
        ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel) this.receiver).onEvent(bulkUpdateFiPostUpdateUiEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent bulkUpdateFiPostUpdateUiEvent) {
        getHighResolutionOutputSizeshNQ4ISI(bulkUpdateFiPostUpdateUiEvent);
        return kotlin.Unit.INSTANCE;
    }

    BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$4$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;)V", 0);
    }
}
