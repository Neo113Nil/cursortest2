package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0094@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEvent;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;", "deleteCardApi", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeactivateContactlessSheetSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DeactivateContactlessSheetSideEffectsMiddleware(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi deleteCardApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteCardApi, "");
        this.getHighSpeedVideoFpsRanges = deleteCardApi;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState deactivateContactlessSheetState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(deactivateContactlessSheetEvent, deactivateContactlessSheetState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent deactivateContactlessSheetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetState deactivateContactlessSheetState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (deactivateContactlessSheetEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateClicked) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateClicked) deactivateContactlessSheetEvent).getCardId(), function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        if (deactivateContactlessSheetEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.RetryClicked) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.RetryClicked) deactivateContactlessSheetEvent).getCardId(), function1, continuation);
            return highResolutionOutputSizeshNQ4ISI2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI2 : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1 deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1) {
            deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1) continuation;
            if ((deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId payPalCardId = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId(str);
                    deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.getHighSpeedVideoFpsRanges = function1;
                    deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalCardId);
                    deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.Camera2StreamConfigurationMap = 1;
                    obj = this.getHighSpeedVideoFpsRanges.invoke(payPalCardId, deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateSuccess.INSTANCE);
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEvent.DeactivateFailed(null, 1, null));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1(this, continuation);
        java.lang.Object obj2 = deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deactivateContactlessSheetSideEffectsMiddleware$handleDeactivateContactlessPayments$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
