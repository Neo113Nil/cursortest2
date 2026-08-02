package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Ready;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent$OnDataLoaded;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState$Ready;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "CreditDisclosureGateResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AccountSummaryReducer(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AccountSummaryReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04aa  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // com.paypal.oslo.core.mvi.Reducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent event) {
        kotlin.Pair pair;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl cardHolderTerms;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardDisplayLogo;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready copy;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument;
        java.lang.String str;
        java.lang.String contentDeliveryNetwork;
        java.lang.String creditInstrumentId;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardDisplayLogo2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber;
        java.lang.Object obj;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount pastDueAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity;
        java.lang.Object obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready copy2;
        java.lang.Object obj3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None none;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl creditDisclosuresUrl;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName> tags;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = false;
        int i = 2;
        java.lang.String str2 = 0;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowAutopayScheduledNextCycleBottomSheet showAutopayScheduledNextCycleBottomSheet = null;
        r8 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        r8 = null;
        r8 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability cardActivationPreloadedAvailability = null;
        str2 = 0;
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateBack) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateBack.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked) {
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel error2 = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnFullScreenErrorButtonClicked) event).getError();
                            if (error2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RequestAppUpdate) {
                                pair = kotlin.TuplesKt.to(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPlayStore.INSTANCE);
                            } else if (error2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.GenericError) {
                                pair = kotlin.TuplesKt.to(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading(z, r5 ? 1 : 0, str2), null);
                            } else {
                                if (!(error2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RewardsPaymentPastDue)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                pair = kotlin.TuplesKt.to(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateBack.INSTANCE);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState) pair.component1(), (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect) pair.component2());
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading(z, r5 ? 1 : 0, str2), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnReload) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading(z, r5 ? 1 : 0, str2), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAutopayUpdateReceived) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading(true), null, 2, null);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnBottomSheetDismissed)) {
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked) {
                            int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecurringAccountItemClicked) event).getRecurringAccountItemType().ordinal()];
                            if (i2 == 1) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToManageCard(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountSummaryOverviewToManageCardArgsMapperKt.toManageCardDetails(ready.getAccountSummaryOverView())));
                            }
                            if (i2 == 2) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPaymentSummary(ready.getAccountSummaryOverView().getCreditAccountId(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview.INSTANCE.from(ready.getAccountSummaryOverView())));
                            }
                            if (i2 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToStatements(ready.getAccountSummaryOverView().getCreditAccountId()));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllActivitiesButtonClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToActivities(ready.getAccountSummaryOverView()));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToActivityDetail(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRecentActivityClicked) event).getTransaction()));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllSpecialFinancingButtonClicked) {
                            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> promotionalActivitiesOverview = ready.getAccountSummaryOverView().getPromotionalActivitiesOverview();
                            if (promotionalActivitiesOverview == null) {
                                promotionalActivitiesOverview = kotlin.collections.CollectionsKt.emptyList();
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToSpecialFinancing(promotionalActivitiesOverview));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked) {
                            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> promotionalActivitiesOverview2 = ready.getAccountSummaryOverView().getPromotionalActivitiesOverview();
                            if (promotionalActivitiesOverview2 != null) {
                                java.util.Iterator<T> it = promotionalActivitiesOverview2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) obj2).getPromoId().toString(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSpecialFinancingItemClicked) event).getPromoId())) {
                                        break;
                                    }
                                }
                                promotionalActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) obj2;
                            } else {
                                promotionalActivity = null;
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, promotionalActivity != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToSpecialFinancingDetail(promotionalActivity, ready.getCreditProductIdentifier()) : null);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnMakePaymentClicked) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview = ready.getAccountSummaryOverView().getAccountOverview();
                            if (accountOverview != null && (billing2 = accountOverview.getBilling()) != null) {
                                currencyAmount = billing2.getMaxRepayableAmount();
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToMakePayment(ready.getAccountSummaryOverView().getCreditAccountId(), (currencyAmount == null || com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.isValidPositiveAmount(currencyAmount.getValue())) ? false : true));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewAutopayClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToAutopay(ready.getAccountSummaryOverView().getCreditAccountId()));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToUrl(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDetailsPageClick) event).getUrl()));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPhoneNumber(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPhoneNumberClick) event).getPhoneNumber()));
                        }
                        if ((event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPaymentsClicked) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnInfoMessageClicked)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPaymentSummary(ready.getAccountSummaryOverView().getCreditAccountId(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview.INSTANCE.from(ready.getAccountSummaryOverView())));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToUrl(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAmountToAvoidInterestInfoClicked) event).getUrl().getValue()));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCashbackRewardClicked) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview2 = ready.getAccountSummaryOverView().getAccountOverview();
                            java.lang.String value = (accountOverview2 == null || (billing = accountOverview2.getBilling()) == null || (pastDueAmount = billing.getPastDueAmount()) == null) ? null : pastDueAmount.getValue();
                            boolean isValidPositiveAmount = com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.isValidPositiveAmount(value != null ? value : "");
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready ready2 = ready;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = ready.getAccountSummaryOverView().getRewardsSummary();
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, rewardsSummary != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRewards(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary.copy$default(rewardsSummary, null, null, null, false, ready.getAccountSummaryOverView().getCreditAccountId(), 15, null), ready.getAccountSummaryOverView().getProductFeatureOffers(), isValidPositiveAmount, ready.getAccountSummaryOverView().getCreditAccountId(), ready.getAccountSummaryOverView().getRewardsContentUrls()) : null);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCardActivationClicked) {
                            if (ready.getCreditProductIdentifier() == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US) {
                                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument> creditInstruments = ready.getAccountSummaryOverView().getCreditInstruments();
                                if (creditInstruments != null) {
                                    java.util.Iterator<T> it2 = creditInstruments.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it2.next();
                                        if (((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument) obj).getActivationStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentActivationStatus.READY_TO_ACTIVATE) {
                                            break;
                                        }
                                    }
                                    creditInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument) obj;
                                } else {
                                    creditInstrument = null;
                                }
                                java.lang.String creditAccountId = ready.getAccountSummaryOverView().getCreditAccountId();
                                java.lang.String str3 = creditAccountId == null ? "" : creditAccountId;
                                java.lang.String activationPhoneNumber = ready.getAccountSummaryOverView().getActivationPhoneNumber();
                                if (activationPhoneNumber == null) {
                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = ready.getAccountSummaryOverView().getCustomerServiceContact();
                                    activationPhoneNumber = (customerServiceContact == null || (phoneNumber = customerServiceContact.getPhoneNumber()) == null) ? null : phoneNumber.getNationalNumber();
                                    if (activationPhoneNumber == null) {
                                        str = "";
                                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview3 = ready.getAccountSummaryOverView().getAccountOverview();
                                        contentDeliveryNetwork = (accountOverview3 != null || (cardDisplayLogo2 = accountOverview3.getCardDisplayLogo()) == null) ? null : cardDisplayLogo2.getContentDeliveryNetwork();
                                        if (creditInstrument != null && (creditInstrumentId = creditInstrument.getCreditInstrumentId()) != null) {
                                            java.lang.String lastDigits = creditInstrument.getLastDigits();
                                            cardActivationPreloadedAvailability = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability(str3, creditInstrumentId, lastDigits != null ? "" : lastDigits, contentDeliveryNetwork, str);
                                        }
                                    }
                                }
                                str = activationPhoneNumber;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview32 = ready.getAccountSummaryOverView().getAccountOverview();
                                if (accountOverview32 != null) {
                                }
                                if (creditInstrument != null) {
                                    java.lang.String lastDigits2 = creditInstrument.getLastDigits();
                                    cardActivationPreloadedAvailability = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability(str3, creditInstrumentId, lastDigits2 != null ? "" : lastDigits2, contentDeliveryNetwork, str);
                                }
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToCardActivation(cardActivationPreloadedAvailability));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                        }
                        if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed)) {
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPrioritizedAccountAction(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination) event).getDestination()));
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToFeature(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination) event).getDestination()));
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateBack) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateBack.INSTANCE);
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnSeeAllAccountFeaturesClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToManageCard(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountSummaryOverviewToManageCardArgsMapperKt.toManageCardDetails(ready.getAccountSummaryOverView())));
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowPushToWalletToast.INSTANCE);
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPushToWalletError(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPushToWalletFailed) event).getError()));
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnRequestVirtualCardClicked) {
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready ready3 = ready;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview4 = ready.getAccountSummaryOverView().getAccountOverview();
                                java.lang.String contentDeliveryNetwork2 = (accountOverview4 == null || (cardDisplayLogo = accountOverview4.getCardDisplayLogo()) == null) ? null : cardDisplayLogo.getContentDeliveryNetwork();
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls = ready.getAccountSummaryOverView().getContentUrls();
                                if (contentUrls != null && (cardHolderTerms = contentUrls.getCardHolderTerms()) != null) {
                                    str2 = cardHolderTerms.getValue();
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRequestVirtualCard(contentDeliveryNetwork2, str2));
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                        }
                        copy = ready.copy((r30 & 1) != 0 ? ready.accountSummaryOverView : null, (r30 & 2) != 0 ? ready.recurringAccountActionsSection : null, (r30 & 4) != 0 ? ready.specialFinancingSection : null, (r30 & 8) != 0 ? ready.recentActivitySection : null, (r30 & 16) != 0 ? ready.accountFeaturesSection : null, (r30 & 32) != 0 ? ready.prioritizedAccountActionSection : com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PrioritizedAccountActionsMapperKt.removeDismissedItem(ready.getPrioritizedAccountActionSection(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed) event).getActionName()), (r30 & 64) != 0 ? ready.balanceModuleUiModel : null, (r30 & 128) != 0 ? ready.prioritizedAccountAction : null, (r30 & 256) != 0 ? ready.pushToWalletUiState : null, (r30 & 512) != 0 ? ready.toolbarTitleRes : 0, (r30 & 1024) != 0 ? ready.creditProductIdentifier : null, (r30 & 2048) != 0 ? ready.cashbackRewardUiModel : null, (r30 & 4096) != 0 ? ready.bottomSheetToShow : null, (r30 & 8192) != 0 ? ready.shouldCheckBottomSheetConditions : false);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                    }
                    copy2 = ready.copy((r30 & 1) != 0 ? ready.accountSummaryOverView : null, (r30 & 2) != 0 ? ready.recurringAccountActionsSection : null, (r30 & 4) != 0 ? ready.specialFinancingSection : null, (r30 & 8) != 0 ? ready.recentActivitySection : null, (r30 & 16) != 0 ? ready.accountFeaturesSection : null, (r30 & 32) != 0 ? ready.prioritizedAccountActionSection : null, (r30 & 64) != 0 ? ready.balanceModuleUiModel : null, (r30 & 128) != 0 ? ready.prioritizedAccountAction : null, (r30 & 256) != 0 ? ready.pushToWalletUiState : null, (r30 & 512) != 0 ? ready.toolbarTitleRes : 0, (r30 & 1024) != 0 ? ready.creditProductIdentifier : null, (r30 & 2048) != 0 ? ready.cashbackRewardUiModel : null, (r30 & 4096) != 0 ? ready.bottomSheetToShow : com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None.INSTANCE, (r30 & 8192) != 0 ? ready.shouldCheckBottomSheetConditions : false);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending creditDisclosurePending = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureCompleted) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(getHighSpeedVideoSizes(creditDisclosurePending.getPendingDataEvent(), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None.INSTANCE), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCreditDisclosureFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.GenericError.INSTANCE, str2, i, str2), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateBack) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(creditDisclosurePending, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(creditDisclosurePending, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded) event;
                boolean isCBMC = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifierExtensionsKt.isCBMC(onDataLoaded.getCreditProductIdentifier());
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview5 = onDataLoaded.getAccountSummary().getAccountOverview();
                boolean z2 = (accountOverview5 == null || (tags = accountOverview5.getTags()) == null || !tags.contains(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.CREDIT_DISCLOSURES_PRESENTED)) ? false : true;
                if (!isCBMC || z2) {
                    obj3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.NotRequired.INSTANCE;
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls contentUrls2 = onDataLoaded.getAccountSummary().getContentUrls();
                    java.lang.String value2 = (contentUrls2 == null || (creditDisclosuresUrl = contentUrls2.getCreditDisclosuresUrl()) == null) ? null : creditDisclosuresUrl.getValue();
                    if (value2 != null) {
                        obj3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required(value2);
                    } else {
                        obj3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.MissingUrl.INSTANCE;
                    }
                }
                if (obj3 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.CreditDisclosurePending(onDataLoaded), new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToCreditDisclosure(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required) obj3).getUrl()));
                }
                if (obj3 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.MissingUrl) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.GenericError.INSTANCE, str2, i, str2), null, 2, null);
                }
                if (!(obj3 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.NotRequired)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (loading.getShouldCheckBottomSheetConditions()) {
                    none = onDataLoaded.getBottomSheetToShow();
                } else {
                    none = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None.INSTANCE;
                }
                if (none instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.AutopayScheduledWithPaymentDue) {
                    showAutopayScheduledNextCycleBottomSheet = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowAutopayScheduledWithPaymentDue.INSTANCE;
                } else if (none instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.AutopayScheduledNextCycle) {
                    showAutopayScheduledNextCycleBottomSheet = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowAutopayScheduledNextCycleBottomSheet(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.AutopayScheduledNextCycle) none).getNextBillingCycleDate());
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(none, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(getHighSpeedVideoSizes(onDataLoaded, none), showAutopayScheduledNextCycleBottomSheet);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.GenericError.INSTANCE, str2, i, str2), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAppUpdateNeeded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RequestAppUpdate.INSTANCE, str2, i, str2), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnViewCreated) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading(z, r5 ? 1 : 0, str2), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded onDataLoaded, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready(onDataLoaded.getAccountSummary(), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountActionsFactory.INSTANCE.create(), onDataLoaded.getSpecialFinancingSectionUiState(), onDataLoaded.getRecentActivitiesSection(), onDataLoaded.getAccountFeaturesSection(), onDataLoaded.getPrioritizedAccountActionSection(), onDataLoaded.getBalanceModuleUiModel(), null, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletUiState.INSTANCE.from(onDataLoaded.getStarPayWalletOverview(), this.getHighSpeedVideoFpsRangesFor.isPushToWalletEnabled()), com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.ToolbarTitleMapperKt.toToolbarTitle(onDataLoaded.getCreditProductIdentifier()), onDataLoaded.getCreditProductIdentifier(), onDataLoaded.getCashbackRewardUiModel(), accountSummaryBottomSheetType, false, 128, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult;", "", "NotRequired", "Required", "MissingUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult$MissingUrl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult$NotRequired;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult$Required;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    interface CreditDisclosureGateResult {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult$NotRequired;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NotRequired implements com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.NotRequired INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.NotRequired();

            public final int hashCode() {
                return 165798818;
            }

            private NotRequired() {
            }

            public final java.lang.String toString() {
                return "NotRequired";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.NotRequired)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult$Required;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult$Required;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Required implements com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult {
            public static final int $stable = 0;
            private final java.lang.String url;

            public Required(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.url = str;
            }

            public final java.lang.String getUrl() {
                return this.url;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.url;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Required(url=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required) other).url);
            }

            public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required copy(java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required(url);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getUrl() {
                return this.url;
            }

            public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.Required required, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = required.url;
                }
                return required.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult$MissingUrl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryReducer$CreditDisclosureGateResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingUrl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.MissingUrl INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.MissingUrl();

            public final int hashCode() {
                return 325098521;
            }

            private MissingUrl() {
            }

            public final java.lang.String toString() {
                return "MissingUrl";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryReducer.CreditDisclosureGateResult.MissingUrl)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType.MANAGED_ACCOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType.PAYMENTS_SUMMARY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType.STATEMENTS_HUB.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
