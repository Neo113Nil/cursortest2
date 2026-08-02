package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/mapper/CLIApplicationUiModelMapper;", "cliApplicationUiModelMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cli/RequestCreditLineIncreaseUseCase;", "requestCreditLineIncreaseUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/mapper/CLIApplicationUiModelMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cli/RequestCreditLineIncreaseUseCase;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$InitializingUiModel;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$InitializingUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/mapper/CLIApplicationUiModelMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cli/RequestCreditLineIncreaseUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApplicationMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CLIApplicationMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper cLIApplicationUiModelMapper, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase requestCreditLineIncreaseUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApplicationUiModelMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestCreditLineIncreaseUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cLIApplicationUiModelMapper;
        this.getHighSpeedVideoSizes = requestCreditLineIncreaseUseCase;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState cLIApplicationState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(cLIApplicationState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState cLIApplicationState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (cLIApplicationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel) cLIApplicationState, function1, continuation);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }
        if (cLIApplicationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease requestCreditLineIncrease = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease) cLIApplicationState;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo = requestCreditLineIncrease.getReadyInfo();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel = requestCreditLineIncrease.getUiModel();
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest(readyInfo.getCreditAccountId(), uiModel.getMonthlyIncomeAfterTax(), uiModel.getRevisedMonthlyIncomeAfterTax(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod.MONTHLY, null, readyInfo.getOfferId(), readyInfo.getCurrentCreditLimit().getCurrencyCode(), 16, null), function1, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if (cLIApplicationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease) {
            java.lang.Object highSpeedVideoSizes2 = getHighSpeedVideoSizes(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease) cLIApplicationState).getRequest(), function1, continuation);
            return highSpeedVideoSizes2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes2 : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$requestCreditLineIncrease$1 cLIApplicationMiddleware$requestCreditLineIncrease$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$requestCreditLineIncrease$1) {
            cLIApplicationMiddleware$requestCreditLineIncrease$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$requestCreditLineIncrease$1) continuation;
            if ((cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase requestCreditLineIncreaseUseCase = this.getHighSpeedVideoSizes;
                    cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighSpeedVideoSizes = requestCreditLineIncreaseRequest;
                    cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighSpeedVideoFpsRangesFor = function1;
                    cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = requestCreditLineIncreaseUseCase.invoke(requestCreditLineIncreaseRequest, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult>>) cLIApplicationMiddleware$requestCreditLineIncrease$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighSpeedVideoFpsRangesFor;
                    requestCreditLineIncreaseRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest) cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestSuccess((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult) ((arrow.core.Either.Right) either).getValue()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestError(requestCreditLineIncreaseRequest));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cLIApplicationMiddleware$requestCreditLineIncrease$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$requestCreditLineIncrease$1(this, continuation);
        java.lang.Object obj2 = cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIApplicationMiddleware$requestCreditLineIncrease$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel initializingUiModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$formatCreditLimits$1 cLIApplicationMiddleware$formatCreditLimits$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$formatCreditLimits$1) {
            cLIApplicationMiddleware$formatCreditLimits$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$formatCreditLimits$1) continuation;
            if ((cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cLIApplicationMiddleware$formatCreditLimits$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper cLIApplicationUiModelMapper = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit = initializingUiModel.getCurrentCreditLimit();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount offeredCreditLimit = initializingUiModel.getOfferedCreditLimit();
                    java.lang.String privacyStatementUrl = initializingUiModel.getPrivacyStatementUrl();
                    cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initializingUiModel);
                    cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoFpsRangesFor = function1;
                    cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoSizes = 1;
                    obj = cLIApplicationUiModelMapper.mapToUiModel(currentCreditLimit, offeredCreditLimit, privacyStatementUrl, cLIApplicationMiddleware$formatCreditLimits$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
        }
        cLIApplicationMiddleware$formatCreditLimits$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware$formatCreditLimits$1(this, continuation);
        java.lang.Object obj2 = cLIApplicationMiddleware$formatCreditLimits$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIApplicationMiddleware$formatCreditLimits$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel) obj2));
        return kotlin.Unit.INSTANCE;
    }
}
