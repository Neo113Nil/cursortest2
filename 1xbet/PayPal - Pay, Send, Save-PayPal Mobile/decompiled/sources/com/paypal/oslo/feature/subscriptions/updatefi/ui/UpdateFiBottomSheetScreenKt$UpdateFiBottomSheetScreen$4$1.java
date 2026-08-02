package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent updateFiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateFiEvent, "");
        ((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel) this.receiver).onEvent(updateFiEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent updateFiEvent) {
        getHighSpeedVideoFpsRangesFor(updateFiEvent);
        return kotlin.Unit.INSTANCE;
    }

    UpdateFiBottomSheetScreenKt$UpdateFiBottomSheetScreen$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;)V", 0);
    }
}
