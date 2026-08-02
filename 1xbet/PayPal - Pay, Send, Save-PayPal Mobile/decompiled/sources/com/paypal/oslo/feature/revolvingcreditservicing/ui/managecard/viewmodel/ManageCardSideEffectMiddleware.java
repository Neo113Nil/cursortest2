package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010 \u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\"2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0004\b#\u0010$J3\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b#\u0010(J,\u0010*\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020)2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00100R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u0014\u00107\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0015\u00103\u001a\u0002088CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b#\u00109"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/mapper/ManageCardDetailsUiModelMapper;", "manageCardDetailsUiModelMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProductConfigurationsUseCase;", "getProductConfigurationsUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/managecard/UpdateCreditInstrumentUseCase;", "updateCreditInstrumentUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/managecard/UpdateStatementDeliveryPreferenceUseCase;", "updateStatementDeliveryPreferenceUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;", "getAccountSummaryUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/mapper/ManageCardDetailsUiModelMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProductConfigurationsUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/managecard/UpdateCreditInstrumentUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/managecard/UpdateStatementDeliveryPreferenceUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$InitializingUiModel;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$InitializingUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$TogglingCardLockStatus;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$TogglingCardLockStatus;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CreditInstrumentUpdateResponse;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "p2", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CreditInstrumentUpdateResponse;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState$ReadyInfo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/mapper/ManageCardDetailsUiModelMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProductConfigurationsUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getOutputFormats", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/managecard/UpdateCreditInstrumentUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/managecard/UpdateStatementDeliveryPreferenceUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "getInputFormats", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/builder/ManageCardActionItemsBuilder;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageCardSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ManageCardSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase getProductConfigurationsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase updateCreditInstrumentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase updateStatementDeliveryPreferenceUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getAccountSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetailsUiModelMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProductConfigurationsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCreditInstrumentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateStatementDeliveryPreferenceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoSizes = manageCardDetailsUiModelMapper;
        this.getHighSpeedVideoFpsRangesFor = getProductConfigurationsUseCase;
        this.Camera2StreamConfigurationMap = currencyFormatterFacade;
        this.getHighResolutionOutputSizeshNQ4ISI = updateCreditInstrumentUseCase;
        this.getHighSpeedVideoFpsRanges = updateStatementDeliveryPreferenceUseCase;
        this.getOutputMinFrameDuration = getAccountSummaryUseCase;
        this.getInputFormats = featureGateManager;
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware.$r8$lambda$7BqgKdm4PrhW9FL0QDi0UkpfxBQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware.this);
            }
        });
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState manageCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(manageCardState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState manageCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (manageCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary) manageCardState).getCpi(), function1, continuation);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }
        if (manageCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel) {
            java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel) manageCardState, function1, continuation);
            return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
        }
        if (manageCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus) manageCardState, function1, continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
        }
        if (manageCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready) manageCardState;
            if (ready.getReadyInfo().isUpdatingStatementDelivery() && ready.getReadyInfo().getEnrollingInPaper() != null) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(ready.getReadyInfo(), function1, continuation);
                return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
            }
            if (ready.getReadyInfo().isUpdatingStatementDelivery() && ready.getReadyInfo().getEnrollingInPaper() == null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Invalid state: isUpdatingStatementDelivery is true but enrollingInPaper is null", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY), kotlin.TuplesKt.to("isUpdatingStatementDelivery", "true")), null, null, 12, null);
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError.InvalidResponse.INSTANCE));
            }
        } else if (manageCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails) {
            function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel("1234 5678 9012 3456", "08/33", "389")));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$fetchAccountSummary$1 manageCardSideEffectMiddleware$fetchAccountSummary$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$fetchAccountSummary$1) {
            manageCardSideEffectMiddleware$fetchAccountSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$fetchAccountSummary$1) continuation;
            if ((manageCardSideEffectMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                manageCardSideEffectMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = manageCardSideEffectMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardSideEffectMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest servicingOverviewRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest(creditProductIdentifier, null, null, 6, null);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getAccountSummaryUseCase = this.getOutputMinFrameDuration;
                    manageCardSideEffectMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor = creditProductIdentifier;
                    manageCardSideEffectMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRanges = function1;
                    manageCardSideEffectMiddleware$fetchAccountSummary$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(servicingOverviewRequest);
                    manageCardSideEffectMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap = 1;
                    obj = getAccountSummaryUseCase.invoke(servicingOverviewRequest, manageCardSideEffectMiddleware$fetchAccountSummary$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRanges;
                    creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) manageCardSideEffectMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoadFailed.INSTANCE);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded(creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountSummaryOverviewToManageCardArgsMapperKt.toManageCardDetails((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) ((arrow.core.Ior.Right) ior).getValue())));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded(creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountSummaryOverviewToManageCardArgsMapperKt.toManageCardDetails((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) both.getRightValue())));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageCardSideEffectMiddleware$fetchAccountSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$fetchAccountSummary$1(this, continuation);
        java.lang.Object obj2 = manageCardSideEffectMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardSideEffectMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$getManageCardDetailUiModel$1 manageCardSideEffectMiddleware$getManageCardDetailUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function12;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function13;
        int i2;
        java.lang.Object creditDetailsSection;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel userInfoSectionUiModel;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function14;
        java.lang.String nationalNumber;
        java.lang.Object build;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function15;
        java.lang.String str3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber contactPhoneNumber;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$getManageCardDetailUiModel$1) {
            manageCardSideEffectMiddleware$getManageCardDetailUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$getManageCardDetailUiModel$1) continuation;
            if ((manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl eSignConsentUrl = initializingUiModel.getManageCardDetails().getESignConsentUrl();
                    if (eSignConsentUrl == null || (str = eSignConsentUrl.getValue()) == null) {
                        str = "https://www.paypal.com/us/webapps/mpp/ua/esign-full";
                    }
                    str2 = str;
                    int i3 = initializingUiModel.getCpi() == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC ? 1 : 0;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails = initializingUiModel.getManageCardDetails();
                    initializingUiModel2 = initializingUiModel;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                    function12 = function1;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes = function12;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap = i3;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration = 1;
                    java.lang.Object userInfoSectionUiModel2 = manageCardDetailsUiModelMapper.toUserInfoSectionUiModel(manageCardDetails, manageCardSideEffectMiddleware$getManageCardDetailUiModel$1);
                    if (userInfoSectionUiModel2 != coroutine_suspended) {
                        function13 = function12;
                        i2 = i3;
                        obj = userInfoSectionUiModel2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap;
                        function15 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputFormats;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes;
                        java.lang.String str4 = (java.lang.String) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        initializingUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        creditProductIdentifier = creditProductIdentifier2;
                        manageCardDetailUiModel = manageCardDetailUiModel2;
                        str3 = str4;
                        java.util.List list = (java.util.List) obj;
                        java.lang.String creditAccountId = initializingUiModel3.getManageCardDetails().getCreditAccountId();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument = initializingUiModel3.getManageCardDetails().getCreditInstrument();
                        function15.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized(creditProductIdentifier, manageCardDetailUiModel, list, creditAccountId, creditInstrument != null ? creditInstrument.getCreditInstrumentId() : null, str3, initializingUiModel3.getManageCardDetails().getPdfUrl()));
                        return kotlin.Unit.INSTANCE;
                    }
                    i2 = manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel userInfoSectionUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputFormats;
                    function13 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes;
                    str2 = (java.lang.String) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function16 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    userInfoSectionUiModel = userInfoSectionUiModel3;
                    function14 = function16;
                    initializingUiModel2 = initializingUiModel4;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel creditDetailsSectionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel cardArtSectionUiModel = this.getHighSpeedVideoSizes.toCardArtSectionUiModel(initializingUiModel2.getManageCardDetails(), i2 != 0, initializingUiModel2.getCpi());
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = initializingUiModel2.getManageCardDetails().getCustomerServiceContact();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber = customerServiceContact == null ? customerServiceContact.getPhoneNumber() : null;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary creditLostStolenContent = initializingUiModel2.getManageCardDetails().getCreditLostStolenContent();
                    nationalNumber = (creditLostStolenContent != null || (contactPhoneNumber = creditLostStolenContent.getContactPhoneNumber()) == null) ? null : contactPhoneNumber.getNationalNumber();
                    if (nationalNumber == null) {
                        nationalNumber = "";
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel(userInfoSectionUiModel, creditDetailsSectionUiModel, cardArtSectionUiModel, phoneNumber, nationalNumber);
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi = initializingUiModel2.getCpi();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder) this.getHighSpeedVideoSizesFor.getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails2 = initializingUiModel2.getManageCardDetails();
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes = manageCardDetailUiModel3;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputFormats = cpi;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizesFor = function13;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap = i2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration = 3;
                    build = manageCardActionItemsBuilder.build(manageCardDetails2, manageCardSideEffectMiddleware$getManageCardDetailUiModel$1);
                    if (build != coroutine_suspended) {
                        function15 = function13;
                        str3 = str2;
                        manageCardDetailUiModel = manageCardDetailUiModel3;
                        obj = build;
                        creditProductIdentifier = cpi;
                        initializingUiModel3 = initializingUiModel2;
                        java.util.List list2 = (java.util.List) obj;
                        java.lang.String creditAccountId2 = initializingUiModel3.getManageCardDetails().getCreditAccountId();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument2 = initializingUiModel3.getManageCardDetails().getCreditInstrument();
                        function15.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized(creditProductIdentifier, manageCardDetailUiModel, list2, creditAccountId2, creditInstrument2 != null ? creditInstrument2.getCreditInstrumentId() : null, str3, initializingUiModel3.getManageCardDetails().getPdfUrl()));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                i2 = manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap;
                function13 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes;
                str2 = (java.lang.String) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function17 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel) manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                function12 = function17;
                initializingUiModel2 = initializingUiModel5;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel userInfoSectionUiModel4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper2 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails3 = initializingUiModel2.getManageCardDetails();
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel2;
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes = function13;
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputFormats = userInfoSectionUiModel4;
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap = i2;
                manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration = 2;
                creditDetailsSection = manageCardDetailsUiModelMapper2.toCreditDetailsSection(manageCardDetails3, manageCardSideEffectMiddleware$getManageCardDetailUiModel$1);
                if (creditDetailsSection != coroutine_suspended) {
                    userInfoSectionUiModel = userInfoSectionUiModel4;
                    obj = creditDetailsSection;
                    function14 = function12;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel creditDetailsSectionUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel cardArtSectionUiModel2 = this.getHighSpeedVideoSizes.toCardArtSectionUiModel(initializingUiModel2.getManageCardDetails(), i2 != 0, initializingUiModel2.getCpi());
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact2 = initializingUiModel2.getManageCardDetails().getCustomerServiceContact();
                    if (customerServiceContact2 == null) {
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary creditLostStolenContent2 = initializingUiModel2.getManageCardDetails().getCreditLostStolenContent();
                    if (creditLostStolenContent2 != null) {
                    }
                    if (nationalNumber == null) {
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel manageCardDetailUiModel32 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardDetailUiModel(userInfoSectionUiModel, creditDetailsSectionUiModel2, cardArtSectionUiModel2, phoneNumber, nationalNumber);
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi2 = initializingUiModel2.getCpi();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder) this.getHighSpeedVideoSizesFor.getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails22 = initializingUiModel2.getManageCardDetails();
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes = manageCardDetailUiModel32;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputFormats = cpi2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizesFor = function13;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap = i2;
                    manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration = 3;
                    build = manageCardActionItemsBuilder2.build(manageCardDetails22, manageCardSideEffectMiddleware$getManageCardDetailUiModel$1);
                    if (build != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$getManageCardDetailUiModel$1(this, continuation);
        java.lang.Object obj2 = manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel userInfoSectionUiModel42 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper22 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails32 = initializingUiModel2.getManageCardDetails();
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel2;
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getHighSpeedVideoSizes = function13;
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getInputFormats = userInfoSectionUiModel42;
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.Camera2StreamConfigurationMap = i2;
        manageCardSideEffectMiddleware$getManageCardDetailUiModel$1.getOutputMinFrameDuration = 2;
        creditDetailsSection = manageCardDetailsUiModelMapper22.toCreditDetailsSection(manageCardDetails32, manageCardSideEffectMiddleware$getManageCardDetailUiModel$1);
        if (creditDetailsSection != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus togglingCardLockStatus, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$toggleCardLockStatus$1 manageCardSideEffectMiddleware$toggleCardLockStatus$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$toggleCardLockStatus$1) {
            manageCardSideEffectMiddleware$toggleCardLockStatus$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$toggleCardLockStatus$1) continuation;
            if ((manageCardSideEffectMiddleware$toggleCardLockStatus$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                manageCardSideEffectMiddleware$toggleCardLockStatus$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$toggleCardLockStatus$1 manageCardSideEffectMiddleware$toggleCardLockStatus$12 = manageCardSideEffectMiddleware$toggleCardLockStatus$1;
                java.lang.Object obj = manageCardSideEffectMiddleware$toggleCardLockStatus$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardSideEffectMiddleware$toggleCardLockStatus$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = togglingCardLockStatus.getReadyInfo();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState targetLockState = togglingCardLockStatus.getTargetLockState();
                    java.lang.String creditAccountId = readyInfo.getCreditAccountId();
                    java.lang.String creditInstrumentId = readyInfo.getCreditInstrumentId();
                    if (creditAccountId == null || creditInstrumentId == null) {
                        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure(targetLockState, "Missing required information"));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase updateCreditInstrumentUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi = readyInfo.getCpi();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockStateKt.toCreditInstrumentStatus(targetLockState);
                    manageCardSideEffectMiddleware$toggleCardLockStatus$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(togglingCardLockStatus);
                    manageCardSideEffectMiddleware$toggleCardLockStatus$12.getHighSpeedVideoFpsRangesFor = function1;
                    manageCardSideEffectMiddleware$toggleCardLockStatus$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(readyInfo);
                    manageCardSideEffectMiddleware$toggleCardLockStatus$12.getHighSpeedVideoFpsRanges = targetLockState;
                    manageCardSideEffectMiddleware$toggleCardLockStatus$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditAccountId);
                    manageCardSideEffectMiddleware$toggleCardLockStatus$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditInstrumentId);
                    manageCardSideEffectMiddleware$toggleCardLockStatus$12.getOutputMinFrameDuration = 1;
                    obj = updateCreditInstrumentUseCase.invoke(cpi, creditAccountId, creditInstrumentId, creditInstrumentStatus, manageCardSideEffectMiddleware$toggleCardLockStatus$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cardLockState = targetLockState;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cardLockState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState) manageCardSideEffectMiddleware$toggleCardLockStatus$12.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$toggleCardLockStatus$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure(cardLockState, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError) ((arrow.core.Ior.Left) ior).getValue()).toDisplayMessage()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse) ((arrow.core.Ior.Right) ior).getValue(), cardLockState, function1);
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse) both.getRightValue(), cardLockState, function1);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageCardSideEffectMiddleware$toggleCardLockStatus$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$toggleCardLockStatus$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$toggleCardLockStatus$1 manageCardSideEffectMiddleware$toggleCardLockStatus$122 = manageCardSideEffectMiddleware$toggleCardLockStatus$1;
        java.lang.Object obj2 = manageCardSideEffectMiddleware$toggleCardLockStatus$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardSideEffectMiddleware$toggleCardLockStatus$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse p0, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState p1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> p2) {
        if (p0.getCreditInstrumentId() != null) {
            p2.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess(p1));
        } else {
            p2.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure(p1, "Invalid response from server"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$updateStatementDelivery$1 manageCardSideEffectMiddleware$updateStatementDelivery$1;
        int i;
        java.lang.Boolean enrollingInPaper;
        java.lang.String str;
        arrow.core.Ior ior;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function12 = function1;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$updateStatementDelivery$1) {
            manageCardSideEffectMiddleware$updateStatementDelivery$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$updateStatementDelivery$1) continuation;
            if ((manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = manageCardSideEffectMiddleware$updateStatementDelivery$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String creditAccountId = readyInfo.getCreditAccountId();
                    enrollingInPaper = readyInfo.getEnrollingInPaper();
                    if (creditAccountId == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Cannot update statement delivery: missing credit account ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", "MissingCreditAccountId")), null, null, 12, null);
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError.InvalidResponse.INSTANCE));
                        return kotlin.Unit.INSTANCE;
                    }
                    if (enrollingInPaper == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Cannot update statement delivery: missing enrollingInPaper flag", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", "MissingEnrollingInPaperFlag")), null, null, 12, null);
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError.InvalidResponse.INSTANCE));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase updateStatementDeliveryPreferenceUseCase = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi = readyInfo.getCpi();
                    boolean booleanValue = enrollingInPaper.booleanValue();
                    manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(readyInfo);
                    manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighResolutionOutputSizeshNQ4ISI = function12;
                    manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoSizes = creditAccountId;
                    manageCardSideEffectMiddleware$updateStatementDelivery$1.Camera2StreamConfigurationMap = enrollingInPaper;
                    manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object invoke = updateStatementDeliveryPreferenceUseCase.invoke(cpi, creditAccountId, booleanValue, manageCardSideEffectMiddleware$updateStatementDelivery$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = creditAccountId;
                    obj = invoke;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Boolean bool = (java.lang.Boolean) manageCardSideEffectMiddleware$updateStatementDelivery$1.Camera2StreamConfigurationMap;
                    str = (java.lang.String) manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    enrollingInPaper = bool;
                    function12 = function13;
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(statementDeliveryError.getClass()).getSimpleName();
                    pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "");
                    pairArr[1] = kotlin.TuplesKt.to("enrollInPaper", java.lang.String.valueOf(enrollingInPaper.booleanValue()));
                    com.paypal.android.logger.Logger.e$default(logger, "Statement delivery preference update failed", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("creditAccountId", str)), null, 8, null);
                    function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError(statementDeliveryError));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess(((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue()));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    boolean booleanValue2 = ((java.lang.Boolean) both.getRightValue()).booleanValue();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError) leftValue).getClass()).getSimpleName();
                    pairArr2[0] = kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "");
                    pairArr2[1] = kotlin.TuplesKt.to("enrolledInPaper", java.lang.String.valueOf(booleanValue2));
                    logger2.w("Statement delivery preference update succeeded with warnings", kotlin.collections.MapsKt.mapOf(pairArr2), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("creditAccountId", str)));
                    function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess(booleanValue2));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageCardSideEffectMiddleware$updateStatementDelivery$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware$updateStatementDelivery$1(this, continuation);
        java.lang.Object obj2 = manageCardSideEffectMiddleware$updateStatementDelivery$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardSideEffectMiddleware$updateStatementDelivery$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder $r8$lambda$7BqgKdm4PrhW9FL0QDi0UkpfxBQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware manageCardSideEffectMiddleware) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder(manageCardSideEffectMiddleware.getHighSpeedVideoFpsRangesFor.invoke(), manageCardSideEffectMiddleware.Camera2StreamConfigurationMap, manageCardSideEffectMiddleware.getInputFormats);
    }
}
