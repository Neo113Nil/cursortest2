package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/RedeemRewardsUseCase;", "redeemRewardsUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/RedeemRewardsUseCase;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ProcessingRedemption;", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ProcessingRedemption;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/rewards/RedeemRewardsUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedeemRewardsSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase getHighSpeedVideoFpsRanges;

    public RedeemRewardsSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase redeemRewardsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemRewardsUseCase, "");
        this.getHighSpeedVideoFpsRanges = redeemRewardsUseCase;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState redeemRewardsState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(redeemRewardsState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState redeemRewardsState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(redeemRewardsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption) redeemRewardsState, function1, continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption processingRedemption, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware$processRedemption$1 redeemRewardsSideEffectMiddleware$processRedemption$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType rewardType;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent, kotlin.Unit> function12;
        arrow.core.Either either;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware$processRedemption$1) {
            redeemRewardsSideEffectMiddleware$processRedemption$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware$processRedemption$1) continuation;
            if ((redeemRewardsSideEffectMiddleware$processRedemption$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                redeemRewardsSideEffectMiddleware$processRedemption$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = redeemRewardsSideEffectMiddleware$processRedemption$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = redeemRewardsSideEffectMiddleware$processRedemption$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(processingRedemption.getRewardsSummary().getAvailableRewards().getCurrencyCode(), processingRedemption.getEnteredAmount());
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = processingRedemption.getCreditProductIdentifier();
                    java.lang.String creditAccountId = processingRedemption.getCreditAccountId();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption = processingRedemption.getSelectedRedemptionOption();
                    if (processingRedemption.getSelectedRedemptionOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_PLUS_POINTS) {
                        rewardType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.POINTS;
                    } else {
                        rewardType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.CASHBACK;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest redeemRewardRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest(creditProductIdentifier, creditAccountId, currencyAmount, selectedRedemptionOption, rewardType, null, 32, null);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase redeemRewardsUseCase = this.getHighSpeedVideoFpsRanges;
                    redeemRewardsSideEffectMiddleware$processRedemption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(processingRedemption);
                    redeemRewardsSideEffectMiddleware$processRedemption$1.Camera2StreamConfigurationMap = function1;
                    redeemRewardsSideEffectMiddleware$processRedemption$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    redeemRewardsSideEffectMiddleware$processRedemption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(redeemRewardRequest);
                    redeemRewardsSideEffectMiddleware$processRedemption$1.getHighSpeedVideoFpsRanges = 1;
                    obj = redeemRewardsUseCase.invoke(redeemRewardRequest, redeemRewardsSideEffectMiddleware$processRedemption$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function12 = (kotlin.jvm.functions.Function1) redeemRewardsSideEffectMiddleware$processRedemption$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult redemptionResult = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult) ((arrow.core.Either.Right) either).getValue();
                    function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionSuccess(redemptionResult.getRedeemedAmount().getValue(), redemptionResult.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus.PENDING));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError redeemRewardsError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError) ((arrow.core.Either.Left) either).getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(redeemRewardsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError.InsufficientRewards.INSTANCE)) {
                        errorContext = com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.INSUFFICIENT_REWARDS;
                    } else {
                        errorContext = kotlin.jvm.internal.Intrinsics.areEqual(redeemRewardsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError.InvalidAmount.INSTANCE) ? com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.INVALID_AMOUNT : com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.REDEEMING_REWARDS;
                    }
                    function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionError(errorContext));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        redeemRewardsSideEffectMiddleware$processRedemption$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware$processRedemption$1(this, continuation);
        java.lang.Object obj2 = redeemRewardsSideEffectMiddleware$processRedemption$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = redeemRewardsSideEffectMiddleware$processRedemption$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
