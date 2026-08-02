package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0094@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;", "getDebitInstrumentsUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "p1", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function1;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageSecondaryCardSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getHighSpeedVideoSizes;

    public ManageSecondaryCardSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitInstrumentsUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardProductName;
        this.getHighSpeedVideoSizes = getDebitInstrumentsUseCase;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent manageSecondaryCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState manageSecondaryCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(manageSecondaryCardEvent, manageSecondaryCardState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent manageSecondaryCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState manageSecondaryCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (manageSecondaryCardEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.LoadInstruments) {
            java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(function1, 0, continuation);
            return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
        }
        if (manageSecondaryCardEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.RetryClicked) {
            java.lang.Object highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(function1, manageSecondaryCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error ? ((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardState.Error) manageSecondaryCardState).getRetryCount() + 1 : 0, continuation);
            return highSpeedVideoFpsRanges2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges2 : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent, kotlin.Unit> function1, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1 manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1;
        int i2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1) {
            manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1) continuation;
            if ((manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoSizes;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest debitInstrumentsRequest = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest(this.getHighResolutionOutputSizeshNQ4ISI.name(), null, 2, null);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase = this.getHighSpeedVideoSizes;
                    manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentsRequest);
                    manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.Camera2StreamConfigurationMap = i;
                    manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoSizes = 1;
                    obj = getDebitInstrumentsUseCase.invoke2(debitInstrumentsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse>>) manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.Camera2StreamConfigurationMap;
                    function1 = (kotlin.jvm.functions.Function1) manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> instruments = ((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()).getInstruments();
                    boolean canAddSecondaryCardholder = com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.canAddSecondaryCardholder(instruments);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : instruments) {
                        if (!((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj2).getPrimary()) {
                            arrayList.add(obj2);
                        }
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.InstrumentsLoaded(arrayList, com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.getMaxAdditionalCardsAllowed(instruments), canAddSecondaryCardholder));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.InstrumentsLoadingFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), i, new com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo(error.getTag(), error.getErrorMessage())));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1(this, continuation);
        java.lang.Object obj3 = manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = manageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1.getHighSpeedVideoSizes;
        if (i2 != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj3;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
