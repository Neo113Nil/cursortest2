package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryReducer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryReducer();

    private RewardsSummaryReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RewardsSummaryReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect>> reduce(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState state, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error error = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRetry) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading(error.getDeferredDestination()), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready ready = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick onClick = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick) event;
                    if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.TargetingUnit) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                    }
                    if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.CategorySelection) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToCategorySelectionFlow.INSTANCE);
                    }
                    if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer activeOffer = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer) onClick;
                        int i = com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryReducer.WhenMappings.$EnumSwitchMapping$0[activeOffer.getClickType().ordinal()];
                        if (i == 1) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils.navigateToOfferDetails$shopping_rewards_prodRelease$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils.INSTANCE, ready, activeOffer.getOfferId(), null, 4, null);
                        }
                        if (i != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToCategoryConfirmation(activeOffer.getOfferId(), activeOffer.getTouchpointId()));
                    }
                    if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils.navigateToOfferDetails$shopping_rewards_prodRelease$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils.INSTANCE, ready, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer) onClick).getOfferId(), null, 4, null);
                    }
                    if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToRedeemFlow(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard) onClick).getDestination()));
                    }
                    if (onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SeeAllActiveOffers) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils.INSTANCE.navigateToScreen$shopping_rewards_prodRelease(ready, new com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersDestination("", com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.RewardsSummary));
                    }
                    if (!(onClick instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, onClick);
                    }
                    int i2 = com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryReducer.WhenMappings.$EnumSwitchMapping$1[((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer) onClick).getNavigationType().ordinal()];
                    if (i2 == 1) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils.INSTANCE.navigateToScreen$shopping_rewards_prodRelease(ready, com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination.INSTANCE);
                    }
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab onChangeTab = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready.copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData.copy$default(ready.getData(), null, null, null, null, onChangeTab.getTabIndex(), null, 47, null)), new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.UpdateTab(onChangeTab.getTabIndex()));
                }
                if ((event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnReload) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnOfferActivated) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnCategorySelectionChanged) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRedemptionCompleted)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading(null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnToastDisappeared) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready.copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData.copy$default(ready.getData(), null, null, null, null, 0, null, 31, null)), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading loading = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess) {
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess onLoadSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess) event;
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready ready2 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready(onLoadSuccess.getData());
                androidx.navigation3.runtime.NavKey deferredDestination = onLoadSuccess.getDeferredDestination();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, deferredDestination != null ? new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToScreen(deferredDestination, true) : null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError) {
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error(onLoadError.getTabIndex(), onLoadError.getDeferredDestination(), onLoadError.getErrorType()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Initial initial = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading(((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad) event).getDeferredDestination()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType.CATEGORY_CONFIRMATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType.MGM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType.NONE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
