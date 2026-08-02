package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SetDebitPinUseCase;", "setDebitPinUseCase", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;", "pinMode", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SetDebitPinUseCase;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;)V", "preState", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleStateTransition", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SetDebitPinUseCase;", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitPinSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase getHighSpeedVideoSizes;

    public DebitPinSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase setDebitPinUseCase, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode debitPinMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitPinUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitPinFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitPinMode, "");
        this.getHighSpeedVideoSizes = setDebitPinUseCase;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = setDebitPinFlowType;
        this.Camera2StreamConfigurationMap = debitPinMode;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleStateTransition(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleStateTransition2(debitPinState, debitPinState2, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleStateTransition, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleStateTransition2(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (debitPinState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing) {
            int i = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.ordinal()];
            if (i == 1) {
                java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing) debitPinState2).getPin(), function1, continuation);
                return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded(((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing) debitPinState2).getPin()));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware$createPin$1 debitPinSideEffectsMiddleware$createPin$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware$createPin$1) {
            debitPinSideEffectsMiddleware$createPin$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware$createPin$1) continuation;
            if ((debitPinSideEffectsMiddleware$createPin$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                debitPinSideEffectsMiddleware$createPin$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = debitPinSideEffectsMiddleware$createPin$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitPinSideEffectsMiddleware$createPin$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest setDebitPinRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest(this.getHighSpeedVideoFpsRangesFor, str, this.getHighSpeedVideoFpsRanges);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase setDebitPinUseCase = this.getHighSpeedVideoSizes;
                    debitPinSideEffectsMiddleware$createPin$1.getHighSpeedVideoSizes = str;
                    debitPinSideEffectsMiddleware$createPin$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    debitPinSideEffectsMiddleware$createPin$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setDebitPinRequest);
                    debitPinSideEffectsMiddleware$createPin$1.Camera2StreamConfigurationMap = 1;
                    obj = setDebitPinUseCase.invoke2(setDebitPinRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult>>) debitPinSideEffectsMiddleware$createPin$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitPinSideEffectsMiddleware$createPin$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) debitPinSideEffectsMiddleware$createPin$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded(str));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    java.lang.String errorMessage = error.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "Failed to set PIN";
                    }
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error);
                    java.lang.String tag = error.getTag();
                    if (tag.length() <= 0) {
                        tag = null;
                    }
                    if (tag == null) {
                        tag = "unknown_code";
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed(errorMessage, tag, debitErrorType));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        debitPinSideEffectsMiddleware$createPin$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware$createPin$1(this, continuation);
        java.lang.Object obj2 = debitPinSideEffectsMiddleware$createPin$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitPinSideEffectsMiddleware$createPin$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode.SET_PIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode.COLLECT_PIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
