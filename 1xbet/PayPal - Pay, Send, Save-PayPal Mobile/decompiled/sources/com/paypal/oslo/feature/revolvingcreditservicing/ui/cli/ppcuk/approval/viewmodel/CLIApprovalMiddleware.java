package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/mapper/CLIApprovalUiModelMapper;", "creditLineApprovalUiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/mapper/CLIApprovalUiModelMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$InitializeUiModel;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/viewmodel/CLIApprovalState$InitializeUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/mapper/CLIApprovalUiModelMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApprovalMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CLIApprovalMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper cLIApprovalUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalUiModelMapper, "");
        this.Camera2StreamConfigurationMap = cLIApprovalUiModelMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState cLIApprovalState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(cLIApprovalState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState cLIApprovalState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(cLIApprovalState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel) cLIApprovalState, function1, continuation);
        return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log.e("Unable to parse model", r8);
        r9.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnUiModelInitializedError.INSTANCE);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalState.InitializeUiModel initializeUiModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware$mapToUiModel$1 cLIApprovalMiddleware$mapToUiModel$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware$mapToUiModel$1) {
            cLIApprovalMiddleware$mapToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware$mapToUiModel$1) continuation;
            if ((cLIApprovalMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cLIApprovalMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware$mapToUiModel$1 cLIApprovalMiddleware$mapToUiModel$12 = cLIApprovalMiddleware$mapToUiModel$1;
                java.lang.Object obj = cLIApprovalMiddleware$mapToUiModel$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIApprovalMiddleware$mapToUiModel$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper cLIApprovalUiModelMapper = this.Camera2StreamConfigurationMap;
                    java.lang.String expirationDate = initializeUiModel.getReadyInfo().getExpirationDate();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit = initializeUiModel.getReadyInfo().getNewCreditLimit();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount = initializeUiModel.getReadyInfo().getMonthlyPaymentAmount();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit = initializeUiModel.getReadyInfo().getCurrentCreditLimit();
                    cLIApprovalMiddleware$mapToUiModel$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initializeUiModel);
                    cLIApprovalMiddleware$mapToUiModel$12.getHighSpeedVideoSizes = function1;
                    cLIApprovalMiddleware$mapToUiModel$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = cLIApprovalUiModelMapper.mapToUiModel(expirationDate, newCreditLimit, monthlyPaymentAmount, currentCreditLimit, cLIApprovalMiddleware$mapToUiModel$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cLIApprovalMiddleware$mapToUiModel$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnUiModelInitialized((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
        }
        cLIApprovalMiddleware$mapToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware$mapToUiModel$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware$mapToUiModel$1 cLIApprovalMiddleware$mapToUiModel$122 = cLIApprovalMiddleware$mapToUiModel$1;
        java.lang.Object obj2 = cLIApprovalMiddleware$mapToUiModel$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIApprovalMiddleware$mapToUiModel$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalEvent.OnUiModelInitialized((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel) obj2));
        return kotlin.Unit.INSTANCE;
    }
}
