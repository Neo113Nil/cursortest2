package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0015\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0015\u0010 R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/GetRewardsSummaryUseCase;", "getRewardsSummaryUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/GetRewardsSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$InitializingUiModel;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$InitializingUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "p2", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "(Ljava/lang/Float;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/GetRewardsSummaryUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RewardsDetailSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager getHighSpeedVideoFpsRangesFor;

    public RewardsDetailSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase getRewardsSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRewardsSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = currencyFormatterFacade;
        this.getHighSpeedVideoFpsRanges = getRewardsSummaryUseCase;
        this.Camera2StreamConfigurationMap = creditProductIdentifier;
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState rewardsDetailState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(rewardsDetailState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState rewardsDetailState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (rewardsDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(function1, continuation);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }
        if (rewardsDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel) rewardsDetailState, function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$fetchRewardsDetail$1 rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$fetchRewardsDetail$1) {
            rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$fetchRewardsDetail$1) continuation;
            if ((rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase getRewardsSummaryUseCase = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.Camera2StreamConfigurationMap;
                    rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.getHighSpeedVideoSizes = 1;
                    obj = getRewardsSummaryUseCase.invoke(creditProductIdentifier, rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult rewardsSummaryResult = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult) ((arrow.core.Either.Right) either).getValue();
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched(rewardsSummaryResult.getRewardsSummary(), rewardsSummaryResult.getProductFeatureOffers(), rewardsSummaryResult.getRewardsContentUrls()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetchFailed.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$fetchRewardsDetail$1(this, continuation);
        java.lang.Object obj2 = rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rewardsDetailSideEffectMiddleware$fetchRewardsDetail$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$getRewardsUiModel$1 rewardsDetailSideEffectMiddleware$getRewardsUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2;
        java.lang.Object format$default;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function12;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        java.lang.Float f;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function13;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalanceAmount;
        java.lang.String value;
        java.lang.Object format$default2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function14;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function15;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel4;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel2;
        java.lang.Object format$default3;
        java.lang.String str2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function16;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel5;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        java.lang.Boolean loyaltyProgramEnrolled;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$getRewardsUiModel$1) {
            rewardsDetailSideEffectMiddleware$getRewardsUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$getRewardsUiModel$1) continuation;
            if ((rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = initializingUiModel.getRewardsSummary();
                    java.lang.Float floatOrNull = (rewardsSummary == null || (currentBalanceAmount = rewardsSummary.getCurrentBalanceAmount()) == null || (value = currentBalanceAmount.getValue()) == null) ? null : kotlin.text.StringsKt.toFloatOrNull(value);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary2 = initializingUiModel.getRewardsSummary();
                    if (rewardsSummary2 != null) {
                        currencyAmount = rewardsSummary2.getCurrentBalanceAmount();
                        initializingUiModel2 = initializingUiModel;
                    } else {
                        initializingUiModel2 = initializingUiModel;
                        currencyAmount = null;
                    }
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel2;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes = function1;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier4;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.Camera2StreamConfigurationMap = this;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getInputFormats = floatOrNull;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration = 1;
                    java.lang.Float f2 = floatOrNull;
                    currencyAmount2 = null;
                    format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currencyAmount, null, 0, rewardsDetailSideEffectMiddleware$getRewardsUiModel$1, 6, null);
                    if (format$default != coroutine_suspended) {
                        function12 = function1;
                        creditProductIdentifier = creditProductIdentifier4;
                        f = f2;
                        initializingUiModel3 = initializingUiModel;
                        function13 = function12;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getInputFormats;
                        function16 = (kotlin.jvm.functions.Function1) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.Camera2StreamConfigurationMap;
                        java.lang.String str3 = (java.lang.String) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes;
                        initializingUiModel5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str2 = str3;
                        cashBackBalanceUiModel2 = cashBackBalanceUiModel3;
                        currencyAmount2 = null;
                        java.lang.String str4 = (java.lang.String) obj;
                        java.lang.String str5 = str4 != null ? "" : str4;
                        boolean z = (this.getHighSpeedVideoFpsRangesFor.isPayPalPlusCbmcEnabled() || (productFeatureOffers = initializingUiModel5.getProductFeatureOffers()) == null || !productFeatureOffers.isPayPalPlusRedeemEligible()) ? false : true;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers2 = initializingUiModel5.getProductFeatureOffers();
                        boolean booleanValue = (productFeatureOffers2 != null || (loyaltyProgramEnrolled = productFeatureOffers2.getLoyaltyProgramEnrolled()) == null) ? false : loyaltyProgramEnrolled.booleanValue();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers3 = initializingUiModel5.getProductFeatureOffers();
                        boolean isPayPalPlusRedeemEligible = productFeatureOffers3 == null ? productFeatureOffers3.isPayPalPlusRedeemEligible() : false;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = initializingUiModel5.getRewardsContentUrls();
                        function16.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized(creditProductIdentifier3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel((java.lang.String) null, cashBackBalanceUiModel2, str5, str2, z, booleanValue, isPayPalPlusRedeemEligible, rewardsContentUrls == null ? rewardsContentUrls.getLoyaltyProgramLearnMoreUrl() : currencyAmount2, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function17 = (kotlin.jvm.functions.Function1) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes;
                    function15 = (kotlin.jvm.functions.Function1) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function14 = function17;
                    initializingUiModel4 = initializingUiModel6;
                    currencyAmount2 = null;
                    creditProductIdentifier2 = creditProductIdentifier5;
                    cashBackBalanceUiModel = cashBackBalanceUiModel4;
                    str = (java.lang.String) obj;
                    if (str == null) {
                        str = "";
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary3 = initializingUiModel4.getRewardsSummary();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount yearToDateCashBack = rewardsSummary3 == null ? rewardsSummary3.getYearToDateCashBack() : currencyAmount2;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel4;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function15);
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes = cashBackBalanceUiModel;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.Camera2StreamConfigurationMap = function14;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getInputFormats = creditProductIdentifier2;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration = 3;
                    cashBackBalanceUiModel2 = cashBackBalanceUiModel;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$getRewardsUiModel$1 rewardsDetailSideEffectMiddleware$getRewardsUiModel$12 = rewardsDetailSideEffectMiddleware$getRewardsUiModel$1;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function18 = function14;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6 = creditProductIdentifier2;
                    format$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade2, yearToDateCashBack, null, 0, rewardsDetailSideEffectMiddleware$getRewardsUiModel$12, 6, null);
                    if (format$default3 != coroutine_suspended) {
                        str2 = str;
                        function16 = function18;
                        obj = format$default3;
                        initializingUiModel5 = initializingUiModel4;
                        creditProductIdentifier3 = creditProductIdentifier6;
                        java.lang.String str42 = (java.lang.String) obj;
                        if (str42 != null) {
                        }
                        if (this.getHighSpeedVideoFpsRangesFor.isPayPalPlusCbmcEnabled()) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers22 = initializingUiModel5.getProductFeatureOffers();
                        if (productFeatureOffers22 != null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers32 = initializingUiModel5.getProductFeatureOffers();
                        if (productFeatureOffers32 == null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls2 = initializingUiModel5.getRewardsContentUrls();
                        function16.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized(creditProductIdentifier3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel((java.lang.String) null, cashBackBalanceUiModel2, str5, str2, z, booleanValue, isPayPalPlusRedeemEligible, rewardsContentUrls2 == null ? rewardsContentUrls2.getLoyaltyProgramLearnMoreUrl() : currencyAmount2, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                java.lang.Float f3 = (java.lang.Float) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getInputFormats;
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier7 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function19 = (kotlin.jvm.functions.Function1) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function110 = (kotlin.jvm.functions.Function1) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel) rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                creditProductIdentifier = creditProductIdentifier7;
                function13 = function110;
                currencyAmount2 = null;
                f = f3;
                function12 = function19;
                format$default = obj;
                initializingUiModel3 = initializingUiModel7;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(f, (java.lang.String) format$default, initializingUiModel3.getRewardsSummary() != null);
                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade3 = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary4 = initializingUiModel3.getRewardsSummary();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount lifetimeCashBack = rewardsSummary4 == null ? rewardsSummary4.getLifetimeCashBack() : currencyAmount2;
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel3;
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI = function12;
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.Camera2StreamConfigurationMap = creditProductIdentifier;
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getInputFormats = currencyAmount2;
                rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration = 2;
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier8 = creditProductIdentifier;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function111 = function12;
                format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade3, lifetimeCashBack, null, 0, rewardsDetailSideEffectMiddleware$getRewardsUiModel$1, 6, null);
                if (format$default2 != coroutine_suspended) {
                    function14 = function111;
                    function15 = function13;
                    cashBackBalanceUiModel = Camera2StreamConfigurationMap;
                    creditProductIdentifier2 = creditProductIdentifier8;
                    initializingUiModel4 = initializingUiModel3;
                    obj = format$default2;
                    str = (java.lang.String) obj;
                    if (str == null) {
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade22 = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary32 = initializingUiModel4.getRewardsSummary();
                    if (rewardsSummary32 == null) {
                    }
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel4;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function15);
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes = cashBackBalanceUiModel;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.Camera2StreamConfigurationMap = function14;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getInputFormats = creditProductIdentifier2;
                    rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration = 3;
                    cashBackBalanceUiModel2 = cashBackBalanceUiModel;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$getRewardsUiModel$1 rewardsDetailSideEffectMiddleware$getRewardsUiModel$122 = rewardsDetailSideEffectMiddleware$getRewardsUiModel$1;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function182 = function14;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier62 = creditProductIdentifier2;
                    format$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade22, yearToDateCashBack, null, 0, rewardsDetailSideEffectMiddleware$getRewardsUiModel$122, 6, null);
                    if (format$default3 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$getRewardsUiModel$1(this, continuation);
        java.lang.Object obj2 = rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(f, (java.lang.String) format$default, initializingUiModel3.getRewardsSummary() != null);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade32 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary42 = initializingUiModel3.getRewardsSummary();
        if (rewardsSummary42 == null) {
        }
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRanges = initializingUiModel3;
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighSpeedVideoSizes = Camera2StreamConfigurationMap2;
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getHighResolutionOutputSizeshNQ4ISI = function12;
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.Camera2StreamConfigurationMap = creditProductIdentifier;
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getInputFormats = currencyAmount2;
        rewardsDetailSideEffectMiddleware$getRewardsUiModel$1.getOutputMinFrameDuration = 2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier82 = creditProductIdentifier;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, kotlin.Unit> function1112 = function12;
        format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade32, lifetimeCashBack, null, 0, rewardsDetailSideEffectMiddleware$getRewardsUiModel$1, 6, null);
        if (format$default2 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel Camera2StreamConfigurationMap(java.lang.Float p0, java.lang.String p1, boolean p2) {
        if (p0 == null || p1 == null || p2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Error.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, 0.0f)) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Zero.INSTANCE;
        }
        if (p0.floatValue() < 0.0f) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative(p0.floatValue(), p1);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive(p0.floatValue(), p1);
    }
}
