package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0094@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/ProvisionDebitInstrumentUseCase;", "provisionUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/ProvisionDebitInstrumentUseCase;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$ProvisionCard;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$ProvisionCard;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/ProvisionDebitInstrumentUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DebitCardApplyAndCreateSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase provisionDebitInstrumentUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionDebitInstrumentUseCase, "");
        this.getHighSpeedVideoSizes = provisionDebitInstrumentUseCase;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent debitCardApplyAndCreateEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(debitCardApplyAndCreateEvent, debitCardApplyAndCreateUiState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent debitCardApplyAndCreateEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (debitCardApplyAndCreateEvent instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard) debitCardApplyAndCreateEvent, function1, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard provisionCard, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1 debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1) {
            debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1 = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1) continuation;
            if ((debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentRequest provisionDebitInstrumentRequest = new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentRequest(provisionCard.getProductName(), provisionCard.getShouldIssuePhysical(), provisionCard.getFundingPreference(), provisionCard.getTokenProductName());
                    com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase provisionDebitInstrumentUseCase = this.getHighSpeedVideoSizes;
                    debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisionCard);
                    debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.getHighSpeedVideoFpsRangesFor = function1;
                    debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisionDebitInstrumentRequest);
                    debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.Camera2StreamConfigurationMap = 1;
                    obj = provisionDebitInstrumentUseCase.invoke(provisionDebitInstrumentRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse>>) debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, java.lang.String.valueOf(error.getErrorMessage()), null, null, 6, null);
                    if (error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.RiskDeniedError) {
                        debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE;
                    } else {
                        debitErrorType = error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoInternet ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK : com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError(java.lang.String.valueOf(error.getErrorMessage()), error.getTag(), debitErrorType));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1 = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1(this, continuation);
        java.lang.Object obj2 = debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardApplyAndCreateSideEffectsMiddleware$handleProvisionCard$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
