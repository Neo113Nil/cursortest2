package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationEvent;", "", "instrumentId", "collectedPin", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ActivatePhysicalCardUseCase;", "activatePhysicalCardUseCase", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ActivatePhysicalCardUseCase;)V", "preState", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleStateTransition", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ActivatePhysicalCardUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardActivationMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public DebitCardActivationMiddleware(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase activatePhysicalCardUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatePhysicalCardUseCase, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = activatePhysicalCardUseCase;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleStateTransition(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleStateTransition2(debitCardActivationState, debitCardActivationState2, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleStateTransition, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleStateTransition2(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if ((debitCardActivationState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading) && !(debitCardActivationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading)) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading) debitCardActivationState2).getCvv(), function1, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware$handleActivateCard$1 debitCardActivationMiddleware$handleActivateCard$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware$handleActivateCard$1) {
            debitCardActivationMiddleware$handleActivateCard$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware$handleActivateCard$1) continuation;
            if ((debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = debitCardActivationMiddleware$handleActivateCard$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardRequest activatePhysicalCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardRequest(this.getHighSpeedVideoSizes, str, this.getHighSpeedVideoFpsRangesFor);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase activatePhysicalCardUseCase = this.Camera2StreamConfigurationMap;
                    debitCardActivationMiddleware$handleActivateCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoFpsRanges = function1;
                    debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activatePhysicalCardRequest);
                    debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = activatePhysicalCardUseCase.invoke2(activatePhysicalCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult>>) debitCardActivationMiddleware$handleActivateCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivationSuccess.INSTANCE);
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivationFailed(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.ActivationUseCaseResultExtensionsKt.toActivationInlineErrorType(error), error.getTag(), com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardActivationMiddleware$handleActivateCard$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware$handleActivateCard$1(this, continuation);
        java.lang.Object obj2 = debitCardActivationMiddleware$handleActivateCard$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardActivationMiddleware$handleActivateCard$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
