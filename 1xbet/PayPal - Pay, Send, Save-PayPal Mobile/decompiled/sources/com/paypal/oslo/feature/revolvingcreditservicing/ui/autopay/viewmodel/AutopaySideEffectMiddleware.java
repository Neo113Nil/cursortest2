package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopaySideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAutopayOverviewUseCase;", "getAutopayOverviewUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/UpdateAutopayUseCase;", "updateAutopayUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewToAutopayMapper;", "mapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAutopayOverviewUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/UpdateAutopayUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewToAutopayMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Loading;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Loading;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ProcessingAutopayPreferenceUpdate;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ProcessingAutopayPreferenceUpdate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAutopayOverviewUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/UpdateAutopayUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewToAutopayMapper;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopaySideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getHighSpeedVideoFpsRanges;

    public AutopaySideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase getAutopayOverviewUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase updateAutopayUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper autopayOverviewToAutopayMapper, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutopayOverviewUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutopayUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayOverviewToAutopayMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.getHighSpeedVideoFpsRangesFor = getAutopayOverviewUseCase;
        this.getHighSpeedVideoSizes = updateAutopayUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = autopayOverviewToAutopayMapper;
        this.getHighSpeedVideoFpsRanges = creditProductIdentifier;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState autopayState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(autopayState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState autopayState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (autopayState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading) autopayState, function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        if (!(autopayState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate) autopayState, function1, continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading loading, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$fetchUiData$1 autopaySideEffectMiddleware$fetchUiData$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewRequest autopayOverviewRequest;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading loading2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, kotlin.Unit> function12;
        arrow.core.Ior ior;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, kotlin.Unit> function13;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading loading3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$fetchUiData$1) {
            autopaySideEffectMiddleware$fetchUiData$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$fetchUiData$1) continuation;
            if ((autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = autopaySideEffectMiddleware$fetchUiData$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    autopayOverviewRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewRequest(this.getHighSpeedVideoFpsRanges);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAutopayOverviewUseCase getAutopayOverviewUseCase = this.getHighSpeedVideoFpsRangesFor;
                    loading2 = loading;
                    autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoFpsRangesFor = loading2;
                    autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizes = function1;
                    autopaySideEffectMiddleware$fetchUiData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverviewRequest);
                    autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizesFor = 1;
                    obj = getAutopayOverviewUseCase.invoke2(autopayOverviewRequest, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview>>) autopaySideEffectMiddleware$fetchUiData$1);
                    if (obj != coroutine_suspended) {
                        function12 = function1;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoFpsRanges;
                    int i3 = autopaySideEffectMiddleware$fetchUiData$1.getHighResolutionOutputSizeshNQ4ISI;
                    autopayOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) autopaySideEffectMiddleware$fetchUiData$1.getInputFormats;
                    function13 = (kotlin.jvm.functions.Function1) autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizes;
                    loading3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading) autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    autopayScreenUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel) obj;
                    if (autopayScreenUiModel == null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.getHighSpeedVideoFpsRanges;
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments = autopayOverview.getEligibleFundingInstruments();
                        if (eligibleFundingInstruments == null) {
                            eligibleFundingInstruments = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = eligibleFundingInstruments;
                        java.lang.String creditAccountId = autopayOverview.getCreditAccountId();
                        if (creditAccountId == null) {
                            creditAccountId = loading3.getCreditAccountId();
                        }
                        java.lang.String str = creditAccountId;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount maxAllowableRepaymentAmount = autopayOverview.getMaxAllowableRepaymentAmount();
                        java.math.BigDecimal bigDecimal = maxAllowableRepaymentAmount != null ? maxAllowableRepaymentAmount.toBigDecimal() : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount maxAllowableRepaymentAmount2 = autopayOverview.getMaxAllowableRepaymentAmount();
                        function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched(autopayScreenUiModel, creditProductIdentifier, list, str, bigDecimal, maxAllowableRepaymentAmount2 != null ? maxAllowableRepaymentAmount2.getCurrencyCode() : null));
                    } else {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Autopay overview data incomplete after fetch", null, null, null, 14, null);
                        function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData(this.getHighSpeedVideoFpsRanges, loading3.getCreditAccountId()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
                autopayOverviewRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewRequest) autopaySideEffectMiddleware$fetchUiData$1.Camera2StreamConfigurationMap;
                function12 = (kotlin.jvm.functions.Function1) autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizes;
                loading2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading) autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData(this.getHighSpeedVideoFpsRanges, loading2.getCreditAccountId()));
                } else {
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) ((arrow.core.Ior.Right) ior).getValue();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper autopayOverviewToAutopayMapper = this.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = this.getHighSpeedVideoFpsRanges;
                        autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoFpsRangesFor = loading2;
                        autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizes = function12;
                        autopaySideEffectMiddleware$fetchUiData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverviewRequest);
                        autopaySideEffectMiddleware$fetchUiData$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        autopaySideEffectMiddleware$fetchUiData$1.getInputFormats = autopayOverview2;
                        autopaySideEffectMiddleware$fetchUiData$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoFpsRanges = 0;
                        autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizesFor = 2;
                        obj = autopayOverviewToAutopayMapper.toUi(autopayOverview2, creditProductIdentifier2, autopaySideEffectMiddleware$fetchUiData$1);
                        if (obj != coroutine_suspended) {
                            function13 = function12;
                            loading3 = loading2;
                            autopayOverview = autopayOverview2;
                            autopayScreenUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel) obj;
                            if (autopayScreenUiModel == null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData(this.getHighSpeedVideoFpsRanges, loading2.getCreditAccountId()));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        autopaySideEffectMiddleware$fetchUiData$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$fetchUiData$1(this, continuation);
        java.lang.Object obj2 = autopaySideEffectMiddleware$fetchUiData$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopaySideEffectMiddleware$fetchUiData$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate processingAutopayPreferenceUpdate, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$performUpdate$1 autopaySideEffectMiddleware$performUpdate$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$performUpdate$1) {
            autopaySideEffectMiddleware$performUpdate$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$performUpdate$1) continuation;
            if ((autopaySideEffectMiddleware$performUpdate$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                autopaySideEffectMiddleware$performUpdate$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = autopaySideEffectMiddleware$performUpdate$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopaySideEffectMiddleware$performUpdate$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String creditAccountId = processingAutopayPreferenceUpdate.getCreditAccountId();
                    java.util.ArrayList arrayList = null;
                    if (creditAccountId == null || kotlin.text.StringsKt.isBlank(creditAccountId)) {
                        creditAccountId = null;
                    }
                    if (creditAccountId == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Autopay update failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("failureReason", "missingCreditAccountId")), null, null, 12, null);
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopayError.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    java.math.BigDecimal customAmount = processingAutopayPreferenceUpdate.getCustomAmount();
                    if (customAmount != null) {
                        java.lang.String currencyCode = processingAutopayPreferenceUpdate.getCurrencyCode();
                        if (currencyCode == null) {
                            currencyCode = "";
                        }
                        java.lang.String obj2 = customAmount.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                        currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyCode, obj2);
                    } else {
                        currencyAmount = null;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.getHighSpeedVideoFpsRanges;
                    boolean enrolled = processingAutopayPreferenceUpdate.getEnrolled();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption = processingAutopayPreferenceUpdate.getSelectedOption();
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> selectedFundingInstruments = processingAutopayPreferenceUpdate.getSelectedFundingInstruments();
                    if (selectedFundingInstruments != null) {
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = selectedFundingInstruments;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrumentMapperKt.toFundingInstrument((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) it.next()));
                        }
                        arrayList = arrayList2;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest updateAutopayRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest(creditAccountId, creditProductIdentifier, enrolled, selectedOption, arrayList, currencyAmount);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.UpdateAutopayUseCase updateAutopayUseCase = this.getHighSpeedVideoSizes;
                    autopaySideEffectMiddleware$performUpdate$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(processingAutopayPreferenceUpdate);
                    autopaySideEffectMiddleware$performUpdate$1.getHighSpeedVideoSizes = function1;
                    autopaySideEffectMiddleware$performUpdate$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditAccountId);
                    autopaySideEffectMiddleware$performUpdate$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    autopaySideEffectMiddleware$performUpdate$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateAutopayRequest);
                    autopaySideEffectMiddleware$performUpdate$1.getOutputMinFrameDuration = 1;
                    obj = updateAutopayUseCase.invoke(updateAutopayRequest, autopaySideEffectMiddleware$performUpdate$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) autopaySideEffectMiddleware$performUpdate$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult) ((arrow.core.Either.Right) either).getValue()).getEffectiveInCurrentBillingCycle()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopayError.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        autopaySideEffectMiddleware$performUpdate$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$performUpdate$1(this, continuation);
        java.lang.Object obj3 = autopaySideEffectMiddleware$performUpdate$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopaySideEffectMiddleware$performUpdate$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj3).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
