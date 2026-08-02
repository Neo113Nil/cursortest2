package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RewardsDetailReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RewardsDetailReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RewardsDetailReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent event) {
        java.lang.String rewardsProgramTermsUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        r4 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards navigateToRedeemRewards = null;
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading)) {
                            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError paymentPastDueError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError) state;
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorDismissed) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(paymentPastDueError, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateBack.INSTANCE);
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorMakePaymentClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(paymentPastDueError, new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToMakePaymentFromPastDueError(paymentPastDueError.getCreditAccountId()));
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(paymentPastDueError, event);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading) state;
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched) {
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched onRewardsSummaryFetched = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched) event;
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel(onRewardsSummaryFetched.getRewardsSummary(), onRewardsSummaryFetched.getProductFeatureOffers(), onRewardsSummaryFetched.getRewardsContentUrls()), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetchFailed) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel(null, null, null, 4, null), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnBackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRedeemClicked) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready ready2 = ready;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = ready.getRewardsSummary();
                    if ((rewardsSummary != null ? rewardsSummary.getCurrentBalanceAmount() : null) != null && ready.getRewardsSummary().getCreditAccountId() != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi = ready.getCpi();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalanceAmount = ready.getRewardsSummary().getCurrentBalanceAmount();
                        java.lang.String creditAccountId = ready.getRewardsSummary().getCreditAccountId();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = ready.getProductFeatureOffers();
                        boolean isPayPalPlusRedeemEligible = productFeatureOffers != null ? productFeatureOffers.isPayPalPlusRedeemEligible() : false;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers2 = ready.getProductFeatureOffers();
                        java.lang.Boolean loyaltyProgramEnrolled = productFeatureOffers2 != null ? productFeatureOffers2.getLoyaltyProgramEnrolled() : null;
                        boolean isRedeemSectionEnabled = ready.getData().isRedeemSectionEnabled();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers3 = ready.getProductFeatureOffers();
                        java.lang.String payPalPlusConversionRate = productFeatureOffers3 != null ? productFeatureOffers3.getPayPalPlusConversionRate() : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = ready.getRewardsContentUrls();
                        java.lang.String rewardsProgramTermsUrl2 = rewardsContentUrls != null ? rewardsContentUrls.getRewardsProgramTermsUrl() : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls2 = ready.getRewardsContentUrls();
                        java.lang.String loyaltyProgramLearnMoreUrl = rewardsContentUrls2 != null ? rewardsContentUrls2.getLoyaltyProgramLearnMoreUrl() : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls3 = ready.getRewardsContentUrls();
                        java.lang.String loyaltyProgramTermsAndConditionsUrl = rewardsContentUrls3 != null ? rewardsContentUrls3.getLoyaltyProgramTermsAndConditionsUrl() : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers4 = ready.getProductFeatureOffers();
                        navigateToRedeemRewards = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRedeemRewards(cpi, currentBalanceAmount, creditAccountId, isPayPalPlusRedeemEligible, loyaltyProgramEnrolled, isRedeemSectionEnabled, payPalPlusConversionRate, rewardsProgramTermsUrl2, loyaltyProgramLearnMoreUrl, loyaltyProgramTermsAndConditionsUrl, productFeatureOffers4 != null ? productFeatureOffers4.getRewardsCalculation() : null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, navigateToRedeemRewards);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnLearnMoreClicked) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready ready3 = ready;
                    java.lang.String loyaltyProgramLearnMoreUrl2 = ready.getData().getLoyaltyProgramLearnMoreUrl();
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready3, loyaltyProgramLearnMoreUrl2 != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToLearnMore(loyaltyProgramLearnMoreUrl2) : null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsDetailProgramTermsClicked) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers5 = ready.getProductFeatureOffers();
                    if (productFeatureOffers5 != null && productFeatureOffers5.isPayPalPlusRedeemEligible()) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls4 = ready.getRewardsContentUrls();
                        if (rewardsContentUrls4 != null) {
                            rewardsProgramTermsUrl = rewardsContentUrls4.getLoyaltyProgramTermsAndConditionsUrl();
                        }
                        rewardsProgramTermsUrl = null;
                    } else {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls5 = ready.getRewardsContentUrls();
                        if (rewardsContentUrls5 != null) {
                            rewardsProgramTermsUrl = rewardsContentUrls5.getRewardsProgramTermsUrl();
                        }
                        rewardsProgramTermsUrl = null;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, rewardsProgramTermsUrl != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateToRewardsProgramTerms(rewardsProgramTermsUrl) : null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnBackClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailUiEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized onUiModelInitialized = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready(onUiModelInitialized.getCpi(), onUiModelInitialized.getUiModel(), initializingUiModel.getRewardsSummary(), initializingUiModel.getProductFeatureOffers(), initializingUiModel.getRewardsContentUrls()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializingUiModel, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated) event;
            if (onViewCreated.getHasPastDueAmount()) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError(onViewCreated.getCreditAccountId(), onViewCreated.getEntryWasFromAccountSummary()), null, 2, null);
            }
            if (onViewCreated.getRewardsSummary() == null) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel(onViewCreated.getRewardsSummary(), onViewCreated.getProductFeatureOffers(), onViewCreated.getRewardsContentUrls()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
