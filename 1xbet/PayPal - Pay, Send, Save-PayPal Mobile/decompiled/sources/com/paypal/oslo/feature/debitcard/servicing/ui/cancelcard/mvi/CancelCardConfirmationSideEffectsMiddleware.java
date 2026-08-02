package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0094@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;", "cancelCardUseCase", "", "cardId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;Ljava/lang/String;)V", "preState", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleStateTransition", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardConfirmationSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public CancelCardConfirmationSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cancelCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleStateTransition(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState cancelCardConfirmationState, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState cancelCardConfirmationState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleStateTransition2(cancelCardConfirmationState, cancelCardConfirmationState2, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleStateTransition, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleStateTransition2(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState cancelCardConfirmationState, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState cancelCardConfirmationState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if ((cancelCardConfirmationState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState.Loading) && !(cancelCardConfirmationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState.Loading)) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware$cancelCard$1 cancelCardConfirmationSideEffectsMiddleware$cancelCard$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware$cancelCard$1) {
            cancelCardConfirmationSideEffectsMiddleware$cancelCard$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware$cancelCard$1) continuation;
            if ((cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest cancelCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest(this.getHighSpeedVideoFpsRangesFor);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelCardRequest);
                    cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.Camera2StreamConfigurationMap = 1;
                    obj = cancelCardUseCase.invoke2(cancelCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardResult>>) cancelCardConfirmationSideEffectsMiddleware$cancelCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent.CancellationSuccessful.INSTANCE);
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent.CancellationFailed(new com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo(error.getTag(), error.getErrorMessage()), com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cancelCardConfirmationSideEffectsMiddleware$cancelCard$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware$cancelCard$1(this, continuation);
        java.lang.Object obj2 = cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cancelCardConfirmationSideEffectsMiddleware$cancelCard$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
