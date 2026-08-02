package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0094@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ShowDebitCardUseCase;", "showDebitCardUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;", "clipboardManager", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ShowDebitCardUseCase;Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ShowDebitCardUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowDebitCardSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager getHighSpeedVideoSizes;

    public ShowDebitCardSideEffectsMiddleware(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase showDebitCardUseCase, com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager clipboardManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clipboardManager, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = showDebitCardUseCase;
        this.getHighSpeedVideoSizes = clipboardManager;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent showDebitCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(showDebitCardEvent, showDebitCardState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent showDebitCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (showDebitCardEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(showDebitCardState, function1, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if (showDebitCardEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.CopyButtonClicked) {
            com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success success = showDebitCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success ? (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success) showDebitCardState : null;
            if (success == null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Cannot copy card number - current state is not Success", null, null, null, 14, null);
            } else {
                com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager.copyWithTimeout$default(this.getHighSpeedVideoSizes, success.getCardDetails().getCardNumber(), null, 0L, 6, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware$loadCardDetails$1 showDebitCardSideEffectsMiddleware$loadCardDetails$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware$loadCardDetails$1) {
            showDebitCardSideEffectsMiddleware$loadCardDetails$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware$loadCardDetails$1) continuation;
            if ((showDebitCardSideEffectsMiddleware$loadCardDetails$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                showDebitCardSideEffectsMiddleware$loadCardDetails$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = showDebitCardSideEffectsMiddleware$loadCardDetails$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showDebitCardSideEffectsMiddleware$loadCardDetails$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.ShowDebitCardRequest showDebitCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.ShowDebitCardRequest(this.getHighSpeedVideoFpsRanges);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase showDebitCardUseCase = this.Camera2StreamConfigurationMap;
                    showDebitCardSideEffectsMiddleware$loadCardDetails$1.getHighSpeedVideoFpsRangesFor = showDebitCardState;
                    showDebitCardSideEffectsMiddleware$loadCardDetails$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    showDebitCardSideEffectsMiddleware$loadCardDetails$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(showDebitCardRequest);
                    showDebitCardSideEffectsMiddleware$loadCardDetails$1.Camera2StreamConfigurationMap = 1;
                    obj = showDebitCardUseCase.invoke2(showDebitCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails>>) showDebitCardSideEffectsMiddleware$loadCardDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) showDebitCardSideEffectsMiddleware$loadCardDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                    showDebitCardState = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) showDebitCardSideEffectsMiddleware$loadCardDetails$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded((com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if ((showDebitCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading ? (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading) showDebitCardState : null) == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Current state is not Loading while handling ShowDebitCardError", null, null, null, 14, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.RiskDeniedError) {
                        debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE;
                    } else if (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoInternet) {
                        debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK;
                    } else {
                        debitErrorType = ((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading) showDebitCardState).getRetryCount() == 0 ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE : com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL;
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed(((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult).getTag(), debitErrorType, debitErrorType != com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE ? ((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading) showDebitCardState).getRetryCount() : 1));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        showDebitCardSideEffectsMiddleware$loadCardDetails$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware$loadCardDetails$1(this, continuation);
        java.lang.Object obj2 = showDebitCardSideEffectsMiddleware$loadCardDetails$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showDebitCardSideEffectsMiddleware$loadCardDetails$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
