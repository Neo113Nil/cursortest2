package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedeemRewardsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RedeemRewardsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RedeemRewardsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready copy2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready copy3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel copy4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready copy5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnBackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateBack.INSTANCE);
                    }
                    if ((event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnTryAgainClicked) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedeemClicked.INSTANCE)) {
                        if (error.getRewardsSummary() != null && error.getCreditAccountId() != null && error.getCreditProductIdentifier() != null) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption(error.getRewardsSummary(), error.getEnteredAmount(), error.getSelectedRedemptionOption(), error.getCreditAccountId(), error.getCreditProductIdentifier(), false, 32, null), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnDoneClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess(error.getEnteredAmount(), false));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption processingRedemption = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnBackClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(processingRedemption, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateBack.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionSuccess) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionSuccess onRedemptionSuccess = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionSuccess) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(processingRedemption.getRewardsSummary(), null, null, processingRedemption.getCreditAccountId(), processingRedemption.getCreditProductIdentifier(), 0.0f, false, processingRedemption.isPayPalPlusCbmcEnabled(), 38, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess(onRedemptionSuccess.getRedeemedAmount(), onRedemptionSuccess.isPartialSuccess()));
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionError) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error(((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionError) event).getErrorContext(), processingRedemption.getRewardsSummary(), processingRedemption.getEnteredAmount(), processingRedemption.getSelectedRedemptionOption(), processingRedemption.getCreditAccountId(), processingRedemption.getCreditProductIdentifier(), false), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processingRedemption, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnBackClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnAmountChanged) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnAmountChanged onAmountChanged = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnAmountChanged) event;
                java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(onAmountChanged.getAmount());
                if (bigDecimalOrNull == null) {
                    bigDecimalOrNull = java.math.BigDecimal.ZERO;
                }
                java.math.BigDecimal bigDecimalOrNull2 = kotlin.text.StringsKt.toBigDecimalOrNull(ready.getRewardsSummary().getAvailableRewards().getValue());
                if (bigDecimalOrNull2 == null) {
                    bigDecimalOrNull2 = java.math.BigDecimal.ZERO;
                }
                if (bigDecimalOrNull.compareTo(java.math.BigDecimal.ZERO) <= 0) {
                    stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_enter_amount_greater_than_zero, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                } else {
                    stringResOnly = bigDecimalOrNull.compareTo(bigDecimalOrNull2) > 0 ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_less_equal_balance_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
                }
                boolean z = (stringResOnly != null || kotlin.text.StringsKt.isBlank(onAmountChanged.getAmount()) || (ready.isPayPalPlusCbmcEnabled() && ready.getRewardsSummary().isPayPalPlusEligible() && ready.getSelectedRedemptionOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE)) ? false : true;
                java.lang.String amount = onAmountChanged.getAmount();
                copy4 = r14.copy((r26 & 1) != 0 ? r14.availableRewards : null, (r26 & 2) != 0 ? r14.isPayPalPlusEligible : false, (r26 & 4) != 0 ? r14.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? r14.payPalPlusConversionRate : null, (r26 & 16) != 0 ? r14.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? r14.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? r14.rewardsCalculation : null, (r26 & 128) != 0 ? r14.selectedRedemptionOption : null, (r26 & 256) != 0 ? r14.enteredAmount : onAmountChanged.getAmount(), (r26 & 512) != 0 ? r14.validationError : stringResOnly, (r26 & 1024) != 0 ? r14.termsText : null, (r26 & 2048) != 0 ? ready.getRewardsSummary().termsLinkText : null);
                copy5 = ready.copy((r18 & 1) != 0 ? ready.rewardsSummary : copy4, (r18 & 2) != 0 ? ready.enteredAmount : amount, (r18 & 4) != 0 ? ready.selectedRedemptionOption : null, (r18 & 8) != 0 ? ready.creditAccountId : null, (r18 & 16) != 0 ? ready.creditProductIdentifier : null, (r18 & 32) != 0 ? ready.enteredAmountToPoints : 0.0f, (r18 & 64) != 0 ? ready.redeemButtonEnabled : z, (r18 & 128) != 0 ? ready.isPayPalPlusCbmcEnabled : false);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionOptionSelected) {
                if (ready.getRewardsSummary().getValidationError() == null || ready.getSelectedRedemptionOption() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE) {
                    rewardsSummary = ready.getRewardsSummary();
                } else {
                    rewardsSummary = r8.copy((r26 & 1) != 0 ? r8.availableRewards : null, (r26 & 2) != 0 ? r8.isPayPalPlusEligible : false, (r26 & 4) != 0 ? r8.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? r8.payPalPlusConversionRate : null, (r26 & 16) != 0 ? r8.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? r8.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? r8.rewardsCalculation : null, (r26 & 128) != 0 ? r8.selectedRedemptionOption : null, (r26 & 256) != 0 ? r8.enteredAmount : null, (r26 & 512) != 0 ? r8.validationError : null, (r26 & 1024) != 0 ? r8.termsText : null, (r26 & 2048) != 0 ? ready.getRewardsSummary().termsLinkText : null);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel = rewardsSummary;
                copy3 = ready.copy((r18 & 1) != 0 ? ready.rewardsSummary : redeemRewardsUiModel, (r18 & 2) != 0 ? ready.enteredAmount : null, (r18 & 4) != 0 ? ready.selectedRedemptionOption : ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionOptionSelected) event).getOption(), (r18 & 8) != 0 ? ready.creditAccountId : null, (r18 & 16) != 0 ? ready.creditProductIdentifier : null, (r18 & 32) != 0 ? ready.enteredAmountToPoints : 0.0f, (r18 & 64) != 0 ? ready.redeemButtonEnabled : !kotlin.text.StringsKt.isBlank(ready.getEnteredAmount()) && redeemRewardsUiModel.getValidationError() == null, (r18 & 128) != 0 ? ready.isPayPalPlusCbmcEnabled : false);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedeemClicked) {
                if (!ready.isPayPalPlusCbmcEnabled() || !ready.getRewardsSummary().isPayPalPlusEligible() || ready.getSelectedRedemptionOption() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE) {
                    if (ready.getSelectedRedemptionOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE) {
                        selectedRedemptionOption = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_BALANCE;
                    } else {
                        selectedRedemptionOption = ready.getSelectedRedemptionOption();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption(ready.getRewardsSummary(), ready.getEnteredAmount(), selectedRedemptionOption, ready.getCreditAccountId(), ready.getCreditProductIdentifier(), ready.isPayPalPlusCbmcEnabled()), null, 2, null);
                }
                copy = r7.copy((r26 & 1) != 0 ? r7.availableRewards : null, (r26 & 2) != 0 ? r7.isPayPalPlusEligible : false, (r26 & 4) != 0 ? r7.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? r7.payPalPlusConversionRate : null, (r26 & 16) != 0 ? r7.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? r7.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? r7.rewardsCalculation : null, (r26 & 128) != 0 ? r7.selectedRedemptionOption : null, (r26 & 256) != 0 ? r7.enteredAmount : null, (r26 & 512) != 0 ? r7.validationError : new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_select_redemption_option_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), (r26 & 1024) != 0 ? r7.termsText : null, (r26 & 2048) != 0 ? ready.getRewardsSummary().termsLinkText : null);
                copy2 = ready.copy((r18 & 1) != 0 ? ready.rewardsSummary : copy, (r18 & 2) != 0 ? ready.enteredAmount : null, (r18 & 4) != 0 ? ready.selectedRedemptionOption : null, (r18 & 8) != 0 ? ready.creditAccountId : null, (r18 & 16) != 0 ? ready.creditProductIdentifier : null, (r18 & 32) != 0 ? ready.enteredAmountToPoints : 0.0f, (r18 & 64) != 0 ? ready.redeemButtonEnabled : false, (r18 & 128) != 0 ? ready.isPayPalPlusCbmcEnabled : false);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Initial) state;
        if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnViewCreated)) {
            return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnBackClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnViewCreated) event;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(onViewCreated.getSummary(), null, null, onViewCreated.getCreditAccountId(), onViewCreated.getCreditProductIdentifier(), 0.0f, false, onViewCreated.isPayPalPlusCbmcEnabled(), 38, null), null, 2, null);
    }
}
