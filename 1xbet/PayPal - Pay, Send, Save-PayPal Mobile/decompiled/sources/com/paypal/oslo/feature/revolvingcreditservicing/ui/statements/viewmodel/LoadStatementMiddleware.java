package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/LoadStatementMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/GetStatementSummaryUseCase;", "getStatements", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/mapper/StatementSummaryToUiModelMapper;", "uiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/GetStatementSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/mapper/StatementSummaryToUiModelMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/GetStatementSummaryUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/mapper/StatementSummaryToUiModelMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LoadStatementMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public LoadStatementMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase getStatementSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper statementSummaryToUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getStatementSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementSummaryToUiModelMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getStatementSummaryUseCase;
        this.getHighSpeedVideoSizes = statementSummaryToUiModelMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState statementHubState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(statementHubState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState statementHubState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(statementHubState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading) statementHubState).getArgs(), function1, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r2 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware$loadScreen$1 loadStatementMiddleware$loadScreen$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest statementSummaryRequest;
        java.lang.Object invoke2;
        arrow.core.Either either;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent, kotlin.Unit> function12;
        java.util.List list;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable loggable;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware$loadScreen$1) {
            loadStatementMiddleware$loadScreen$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware$loadScreen$1) continuation;
            if ((loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = loadStatementMiddleware$loadScreen$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    cpi = statementHubArgs.getCpi();
                    if (cpi == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN) {
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatementsFailed.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    statementSummaryRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest(cpi, statementHubArgs.getCreditAccountId());
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase getStatementSummaryUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    loadStatementMiddleware$loadScreen$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementHubArgs);
                    loadStatementMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor = function1;
                    loadStatementMiddleware$loadScreen$1.getHighSpeedVideoFpsRanges = cpi;
                    loadStatementMiddleware$loadScreen$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementSummaryRequest);
                    loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizesFor = 1;
                    invoke2 = getStatementSummaryUseCase.invoke2(statementSummaryRequest, (kotlin.coroutines.Continuation<? super arrow.core.Ior<kotlin.Unit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary>>) loadStatementMiddleware$loadScreen$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizes;
                        int i3 = loadStatementMiddleware$loadScreen$1.Camera2StreamConfigurationMap;
                        function12 = (kotlin.jvm.functions.Function1) loadStatementMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list = (java.util.List) obj;
                        if (list.isEmpty()) {
                            loggable = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements(list);
                        } else {
                            loggable = com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadEmptyStatements.INSTANCE;
                        }
                        function12.invoke(loggable);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest statementSummaryRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest) loadStatementMiddleware$loadScreen$1.getInputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) loadStatementMiddleware$loadScreen$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) loadStatementMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs2 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs) loadStatementMiddleware$loadScreen$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    statementSummaryRequest = statementSummaryRequest2;
                    statementHubArgs = statementHubArgs2;
                    cpi = creditProductIdentifier;
                    function1 = function13;
                    invoke2 = obj;
                }
                either = ((arrow.core.Ior) invoke2).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper statementSummaryToUiModelMapper = this.getHighSpeedVideoSizes;
                    loadStatementMiddleware$loadScreen$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementHubArgs);
                    loadStatementMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor = function1;
                    loadStatementMiddleware$loadScreen$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cpi);
                    loadStatementMiddleware$loadScreen$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementSummaryRequest);
                    loadStatementMiddleware$loadScreen$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    loadStatementMiddleware$loadScreen$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementSummary);
                    loadStatementMiddleware$loadScreen$1.Camera2StreamConfigurationMap = 0;
                    loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizes = 0;
                    loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizesFor = 2;
                    obj = statementSummaryToUiModelMapper.map(statementSummary, cpi, loadStatementMiddleware$loadScreen$1);
                    if (obj != coroutine_suspended) {
                        function12 = function1;
                        list = (java.util.List) obj;
                        if (list.isEmpty()) {
                        }
                        function12.invoke(loggable);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatementsFailed.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        loadStatementMiddleware$loadScreen$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware$loadScreen$1(this, continuation);
        java.lang.Object obj2 = loadStatementMiddleware$loadScreen$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loadStatementMiddleware$loadScreen$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) invoke2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
