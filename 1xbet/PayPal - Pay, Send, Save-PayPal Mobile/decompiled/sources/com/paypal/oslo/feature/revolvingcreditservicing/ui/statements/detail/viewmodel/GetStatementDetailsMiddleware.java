package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/GetStatementDetailsMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetStatementDetailsUseCase;", "getStatementDetails", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/DownloadStatementUseCase;", "downloadStatementUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProductConfigurationsUseCase;", "getProductConfigurations", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/mapper/StatementDetailsUiModelMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetStatementDetailsUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/DownloadStatementUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProductConfigurationsUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/mapper/StatementDetailsUiModelMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetStatementDetailsUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/DownloadStatementUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProductConfigurationsUseCase;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/mapper/StatementDetailsUiModelMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetStatementDetailsMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent> {
    public static final int $stable = 0;
    public static final java.lang.String MISSING_CREDIT_PRODUCT_IDENTIFIER_MESSAGE = "Missing credit product identifier";
    public static final java.lang.String STATEMENT_DETAILS_LOAD_FAILED_MESSAGE = "Failed to load statement details";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetStatementDetailsMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase getStatementDetailsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase downloadStatementUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase getProductConfigurationsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getStatementDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadStatementUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProductConfigurationsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsUiModelMapper, "");
        this.getHighSpeedVideoFpsRangesFor = getStatementDetailsUseCase;
        this.getHighSpeedVideoSizes = downloadStatementUseCase;
        this.getHighSpeedVideoFpsRanges = getProductConfigurationsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = statementDetailsUiModelMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState statementDetailsState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(statementDetailsState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState statementDetailsState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading) statementDetailsState).getArgs(), function1, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if (!(statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading) statementDetailsState).getArgs(), function1, continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0135, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r6, r2, r1, r3) == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0173, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r7, r2, r1, r3) == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$loadScreen$1 getStatementDetailsMiddleware$loadScreen$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        java.lang.Object invoke;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs2;
        arrow.core.Ior ior;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function12 = function1;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$loadScreen$1) {
            getStatementDetailsMiddleware$loadScreen$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$loadScreen$1) continuation;
            if ((getStatementDetailsMiddleware$loadScreen$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                getStatementDetailsMiddleware$loadScreen$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = getStatementDetailsMiddleware$loadScreen$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getStatementDetailsMiddleware$loadScreen$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    creditProductIdentifier = statementDetailsNavigationArgs.getCreditProductIdentifier();
                    if (creditProductIdentifier == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Statement details load failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("failureReason", "missingCreditProductIdentifier")), null, null, 12, null);
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDataLoadFailed(MISSING_CREDIT_PRODUCT_IDENTIFIER_MESSAGE));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase getStatementDetailsUseCase = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.StatementDetailsRequest statementDetailsRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.StatementDetailsRequest(statementDetailsNavigationArgs.getStatementId(), statementDetailsNavigationArgs.getCreditAccountId(), creditProductIdentifier);
                    getStatementDetailsMiddleware$loadScreen$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementDetailsNavigationArgs);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoSizes = function12;
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier;
                    getStatementDetailsMiddleware$loadScreen$1.getOutputMinFrameDuration = 1;
                    invoke = getStatementDetailsUseCase.invoke(statementDetailsRequest, getStatementDetailsMiddleware$loadScreen$1);
                    if (invoke != coroutine_suspended) {
                        statementDetailsNavigationArgs2 = statementDetailsNavigationArgs;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getStatementDetailsMiddleware$loadScreen$1.Camera2StreamConfigurationMap;
                    int i3 = getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoSizes;
                statementDetailsNavigationArgs2 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs) getStatementDetailsMiddleware$loadScreen$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                creditProductIdentifier = creditProductIdentifier2;
                function12 = function13;
                invoke = obj;
                ior = (arrow.core.Ior) invoke;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError statementDetailsError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(statementDetailsError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    com.paypal.android.logger.Logger.e$default(logger, "Statement details load failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, null, 12, null);
                    function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDataLoadFailed(STATEMENT_DETAILS_LOAD_FAILED_MESSAGE));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) ((arrow.core.Ior.Right) ior).getValue();
                    getStatementDetailsMiddleware$loadScreen$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementDetailsNavigationArgs2);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    getStatementDetailsMiddleware$loadScreen$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementDetails);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoFpsRanges = 0;
                    getStatementDetailsMiddleware$loadScreen$1.Camera2StreamConfigurationMap = 0;
                    getStatementDetailsMiddleware$loadScreen$1.getOutputMinFrameDuration = 2;
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) both.getRightValue();
                    getStatementDetailsMiddleware$loadScreen$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementDetailsNavigationArgs2);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    getStatementDetailsMiddleware$loadScreen$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementDetails2);
                    getStatementDetailsMiddleware$loadScreen$1.getHighSpeedVideoFpsRanges = 0;
                    getStatementDetailsMiddleware$loadScreen$1.Camera2StreamConfigurationMap = 0;
                    getStatementDetailsMiddleware$loadScreen$1.getOutputMinFrameDuration = 3;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        getStatementDetailsMiddleware$loadScreen$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$loadScreen$1(this, continuation);
        java.lang.Object obj2 = getStatementDetailsMiddleware$loadScreen$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getStatementDetailsMiddleware$loadScreen$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) invoke;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
    
        if (r3 != r5) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$dispatchDataLoaded$1 getStatementDetailsMiddleware$dispatchDataLoaded$1;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function12;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function13;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel;
        java.lang.Object mapToPaymentsUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel;
        java.lang.Object mapToSpecialFinancingSection;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function14;
        java.lang.Object mapToCashbackSection;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails4;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function15;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel3;
        java.lang.Object mapToTransactionSection;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function16;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails6 = statementDetails;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = creditProductIdentifier;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$dispatchDataLoaded$1) {
            getStatementDetailsMiddleware$dispatchDataLoaded$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$dispatchDataLoaded$1) continuation;
            if ((getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper = this.getHighResolutionOutputSizeshNQ4ISI;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails6;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier5;
                        function12 = function1;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function12;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 1;
                        obj = statementDetailsUiModelMapper.mapToHeaderUiModel(statementDetails6, creditProductIdentifier5, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                        break;
                    case 1:
                        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function17 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor;
                        creditProductIdentifier5 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails7 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12 = function17;
                        statementDetails6 = statementDetails7;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails6;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier5;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function12;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel5;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 2;
                        java.lang.Object mapToStatementSummaryUiModel = statementDetailsUiModelMapper2.mapToStatementSummaryUiModel(statementDetails6, creditProductIdentifier5, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                        if (mapToStatementSummaryUiModel != coroutine_suspended) {
                            creditProductIdentifier2 = creditProductIdentifier5;
                            function13 = function12;
                            statementDetails2 = statementDetails6;
                            statementHeaderUiModel = statementHeaderUiModel5;
                            obj = mapToStatementSummaryUiModel;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel) obj;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations invoke = this.getHighSpeedVideoFpsRanges.invoke();
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper3 = this.getHighResolutionOutputSizeshNQ4ISI;
                            getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails2;
                            getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier2;
                            getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function13;
                            getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel;
                            getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel3;
                            getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
                            getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 3;
                            mapToPaymentsUiModel = statementDetailsUiModelMapper3.mapToPaymentsUiModel(statementDetails2, creditProductIdentifier2, invoke, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                            if (mapToPaymentsUiModel != coroutine_suspended) {
                                statementDetails3 = statementDetails2;
                                statementHeaderUiModel2 = statementHeaderUiModel;
                                productConfigurations = invoke;
                                statementSummaryUiModel = statementSummaryUiModel3;
                                obj = mapToPaymentsUiModel;
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel) obj;
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper4 = this.getHighResolutionOutputSizeshNQ4ISI;
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails3;
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier2;
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function13;
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel2;
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel;
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productConfigurations);
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats = paymentsUiModel3;
                                getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 4;
                                mapToSpecialFinancingSection = statementDetailsUiModelMapper4.mapToSpecialFinancingSection(statementDetails3, creditProductIdentifier2, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                                if (mapToSpecialFinancingSection != coroutine_suspended) {
                                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function18 = function13;
                                    productConfigurations2 = productConfigurations;
                                    paymentsUiModel = paymentsUiModel3;
                                    obj = mapToSpecialFinancingSection;
                                    creditProductIdentifier3 = creditProductIdentifier2;
                                    function14 = function18;
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) obj;
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper5 = this.getHighResolutionOutputSizeshNQ4ISI;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails3;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier3;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function14;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel2;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productConfigurations2);
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats = paymentsUiModel;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputSizeshNQ4ISI = statementDetailSectionUiState4;
                                    getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 5;
                                    mapToCashbackSection = statementDetailsUiModelMapper5.mapToCashbackSection(statementDetails3, creditProductIdentifier3, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                                    if (mapToCashbackSection != coroutine_suspended) {
                                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel6 = statementHeaderUiModel2;
                                        productConfigurations3 = productConfigurations2;
                                        statementDetailSectionUiState = statementDetailSectionUiState4;
                                        obj = mapToCashbackSection;
                                        statementDetails4 = statementDetails3;
                                        creditProductIdentifier4 = creditProductIdentifier3;
                                        function15 = function14;
                                        statementHeaderUiModel3 = statementHeaderUiModel6;
                                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) obj;
                                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper6 = this.getHighResolutionOutputSizeshNQ4ISI;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails4;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier4);
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function15;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel3;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productConfigurations3);
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats = paymentsUiModel;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputSizeshNQ4ISI = statementDetailSectionUiState;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizesFor = statementDetailSectionUiState5;
                                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 6;
                                        mapToTransactionSection = statementDetailsUiModelMapper6.mapToTransactionSection(statementDetails4, creditProductIdentifier4, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                                        if (mapToTransactionSection != coroutine_suspended) {
                                            paymentsUiModel2 = paymentsUiModel;
                                            statementDetailSectionUiState2 = statementDetailSectionUiState;
                                            statementDetailSectionUiState3 = statementDetailSectionUiState5;
                                            obj = mapToTransactionSection;
                                            statementSummaryUiModel2 = statementSummaryUiModel;
                                            statementHeaderUiModel4 = statementHeaderUiModel3;
                                            function16 = function15;
                                            statementDetails5 = statementDetails4;
                                            function16.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDataLoaded(statementDetails5, statementHeaderUiModel4, statementSummaryUiModel2, paymentsUiModel2, statementDetailSectionUiState2, statementDetailSectionUiState3, (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) obj));
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        statementHeaderUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap;
                        function13 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
                        statementDetails2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        creditProductIdentifier2 = creditProductIdentifier6;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel32 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations invoke2 = this.getHighSpeedVideoFpsRanges.invoke();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper32 = this.getHighResolutionOutputSizeshNQ4ISI;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails2;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier2;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function13;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel32;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke2);
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 3;
                        mapToPaymentsUiModel = statementDetailsUiModelMapper32.mapToPaymentsUiModel(statementDetails2, creditProductIdentifier2, invoke2, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                        if (mapToPaymentsUiModel != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        productConfigurations = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations) getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap;
                        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function19 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor;
                        creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails8 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        statementDetails3 = statementDetails8;
                        statementSummaryUiModel = statementSummaryUiModel4;
                        function13 = function19;
                        statementHeaderUiModel2 = statementHeaderUiModel7;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel32 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper42 = this.getHighResolutionOutputSizeshNQ4ISI;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails3;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier2;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function13;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel2;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productConfigurations);
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats = paymentsUiModel32;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 4;
                        mapToSpecialFinancingSection = statementDetailsUiModelMapper42.mapToSpecialFinancingSection(statementDetails3, creditProductIdentifier2, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                        if (mapToSpecialFinancingSection != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        paymentsUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats;
                        productConfigurations2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations) getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats;
                        statementSummaryUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges;
                        statementHeaderUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap;
                        function14 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor;
                        creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
                        statementDetails3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState42 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper52 = this.getHighResolutionOutputSizeshNQ4ISI;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails3;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier3;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function14;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel2;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productConfigurations2);
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats = paymentsUiModel;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputSizeshNQ4ISI = statementDetailSectionUiState42;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 5;
                        mapToCashbackSection = statementDetailsUiModelMapper52.mapToCashbackSection(statementDetails3, creditProductIdentifier3, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                        if (mapToCashbackSection != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations) getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges;
                        statementHeaderUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap;
                        function15 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor;
                        creditProductIdentifier4 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
                        statementDetails4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        statementDetailSectionUiState = statementDetailSectionUiState6;
                        paymentsUiModel = paymentsUiModel4;
                        productConfigurations3 = productConfigurations4;
                        statementSummaryUiModel = statementSummaryUiModel5;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState52 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper62 = this.getHighResolutionOutputSizeshNQ4ISI;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes = statementDetails4;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier4);
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor = function15;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap = statementHeaderUiModel3;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges = statementSummaryUiModel;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productConfigurations3);
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats = paymentsUiModel;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputSizeshNQ4ISI = statementDetailSectionUiState;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizesFor = statementDetailSectionUiState52;
                        getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration = 6;
                        mapToTransactionSection = statementDetailsUiModelMapper62.mapToTransactionSection(statementDetails4, creditProductIdentifier4, getStatementDetailsMiddleware$dispatchDataLoaded$1);
                        if (mapToTransactionSection != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 6:
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState statementDetailSectionUiState8 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel paymentsUiModel5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.PaymentsUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.getInputFormats;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel statementHeaderUiModel8 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementHeaderUiModel) getStatementDetailsMiddleware$dispatchDataLoaded$1.Camera2StreamConfigurationMap;
                        function16 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails9 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails) getStatementDetailsMiddleware$dispatchDataLoaded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        statementDetailSectionUiState3 = statementDetailSectionUiState7;
                        statementDetailSectionUiState2 = statementDetailSectionUiState8;
                        statementDetails5 = statementDetails9;
                        paymentsUiModel2 = paymentsUiModel5;
                        statementSummaryUiModel2 = statementSummaryUiModel6;
                        statementHeaderUiModel4 = statementHeaderUiModel8;
                        function16.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDataLoaded(statementDetails5, statementHeaderUiModel4, statementSummaryUiModel2, paymentsUiModel2, statementDetailSectionUiState2, statementDetailSectionUiState3, (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementDetailSectionUiState) obj));
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        getStatementDetailsMiddleware$dispatchDataLoaded$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$dispatchDataLoaded$1(this, continuation);
        java.lang.Object obj2 = getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (getStatementDetailsMiddleware$dispatchDataLoaded$1.getOutputMinFrameDuration) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$downloadStatement$1 getStatementDetailsMiddleware$downloadStatement$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$downloadStatement$1) {
            getStatementDetailsMiddleware$downloadStatement$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$downloadStatement$1) continuation;
            if ((getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String creditAccountId = statementDetailsNavigationArgs.getCreditAccountId();
                    if (creditAccountId == null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Statement download failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("failureReason", "missingCreditAccountId")), null, 4, null);
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDownloadFailure.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase downloadStatementUseCase = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.DownloadStatementRequest downloadStatementRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.DownloadStatementRequest(creditAccountId, statementDetailsNavigationArgs.getStatementId());
                    getStatementDetailsMiddleware$downloadStatement$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementDetailsNavigationArgs);
                    getStatementDetailsMiddleware$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditAccountId);
                    getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoFpsRanges = 1;
                    obj = downloadStatementUseCase.invoke(downloadStatementRequest, getStatementDetailsMiddleware$downloadStatement$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) getStatementDetailsMiddleware$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDownloadSuccess((java.lang.String) ((arrow.core.Either.Right) either).getValue()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDownloadFailure.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        getStatementDetailsMiddleware$downloadStatement$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$downloadStatement$1(this, continuation);
        java.lang.Object obj2 = getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getStatementDetailsMiddleware$downloadStatement$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
