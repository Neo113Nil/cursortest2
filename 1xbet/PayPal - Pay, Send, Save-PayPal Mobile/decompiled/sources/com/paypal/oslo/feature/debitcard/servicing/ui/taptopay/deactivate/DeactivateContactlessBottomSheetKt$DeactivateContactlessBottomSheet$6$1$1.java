package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$6$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateContactlessSheetEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel) this.receiver).processEvent(deactivateContactlessSheetEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent) {
        getHighSpeedVideoFpsRangesFor(deactivateContactlessSheetEvent);
        return kotlin.Unit.INSTANCE;
    }

    DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$6$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
