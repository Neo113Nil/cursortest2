package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState;Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$HubDataFetchResult;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent$HubDataFetchResult;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Success;", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeState$Success;Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHomeReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SavingsHomeReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.ComponentNames.SAVINGS_HOME_REDUCER;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect>> reduce(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState state, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent event) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy2;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy3;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy4;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy5;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy6;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy7;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy8;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy9;
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success copy10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error error = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error) state;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.RetryRequested.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success(false, kotlin.collections.CollectionsKt.emptyList(), true, null, null, null, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success success = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success) state;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.Initialize.INSTANCE)) {
                    if (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult) {
                        return getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult) event);
                    }
                    boolean z = event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NetworkError;
                    if (z || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError) || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError)) {
                        if (!z) {
                            if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError)) {
                                if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError)) {
                                    throw new java.lang.IllegalStateException("Unexpected error intent: ".concat(java.lang.String.valueOf(event)).toString());
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError) event).getMessage()), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError) event).getMessage()), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.NetworkError.INSTANCE, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested) {
                        com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested tileRetryRequested = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TileRetryRequested) event;
                        copy9 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : false, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : kotlin.collections.SetsKt.plus(success.getLoadingTileTypes(), tileRetryRequested.getComponentType()), (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy9, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry(tileRetryRequested.getComponentType()));
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TransferClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyGeneralSavingsClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SmartRouteClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.InterestEarningsClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.CreateGoalClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SavingsStatementsClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.FdicInsuranceClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceClicked.INSTANCE)) {
                        return getHighSpeedVideoSizes(success, event);
                    }
                    boolean z2 = event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked;
                    if (z2 || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage) || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType) || (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked)) {
                        if (!z2) {
                            if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage) && !(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType)) {
                                if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked)) {
                                    throw new java.lang.IllegalStateException("Unexpected parameterized navigation intent: ".concat(java.lang.String.valueOf(event)).toString());
                                }
                                com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked educationalTileClicked = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.EducationalTileClicked) event;
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails(educationalTileClicked.getTitle(), educationalTileClicked.getContent()));
                            }
                            return getHighSpeedVideoSizes(success, event);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GoalClicked) event).getGoal()));
                    }
                    if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.PromoTileDismissed)) {
                        boolean z3 = event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess;
                        if (!z3 && !(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess) && !(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError) && !(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess) && !(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess)) {
                            if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed)) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.ClearGoalForSuccessSheet.INSTANCE)) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoShowTaxPreferencePrompt.INSTANCE)) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                                    }
                                    copy5 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : false, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy5, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference(success.getElectronic1099OptIn()));
                                }
                                copy6 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : false, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
                            }
                            copy7 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : false, (r18 & 8) != 0 ? success.electronic1099OptIn : java.lang.Boolean.valueOf(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed) event).getSelectedDigital()), (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
                        }
                        if (!z3) {
                            if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess)) {
                                if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError)) {
                                    if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess)) {
                                        if (!(event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess)) {
                                            throw new java.lang.IllegalStateException("Unexpected success/error callback intent: ".concat(java.lang.String.valueOf(event)).toString());
                                        }
                                        copy = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : true, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceUpdateSuccess) event).getMessage(), 0L, 2, null));
                                    }
                                    copy2 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : true, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy2, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess) event).getFormattedToastMessage(), 0L, 2, null));
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError) event).getError(), 0L, 2, null));
                            }
                            copy3 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : true, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy3, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess) event).getMessage(), 0L, 2, null));
                        }
                        copy4 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : true, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy4, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess) event).getFormattedToastMessage(), 0L, 2, null));
                    }
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> savingsHubData = success.getSavingsHubData();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(savingsHubData, 10));
                    for (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO promoZoneDTO : savingsHubData) {
                        if (promoZoneDTO instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO) {
                            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO promoZoneDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO) promoZoneDTO;
                            java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneBaseDTO> tiles = promoZoneDTO2.getTiles();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj : tiles) {
                                if (!(((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneBaseDTO) obj) instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoTileDTO)) {
                                    arrayList2.add(obj);
                                }
                            }
                            promoZoneDTO = promoZoneDTO2.copy(new java.util.ArrayList<>(arrayList2));
                        }
                        arrayList.add(promoZoneDTO);
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : arrayList) {
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO savingsHubTileDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO) obj2;
                        if (!(savingsHubTileDTO instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO) || !((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.PromoZoneDTO) savingsHubTileDTO).getTiles().isEmpty()) {
                            arrayList3.add(obj2);
                        }
                    }
                    copy8 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : arrayList3, (r18 & 4) != 0 ? success.isLoading : false, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
                }
                copy10 = success.copy((r18 & 1) != 0 ? success.isFeatureAvailable : false, (r18 & 2) != 0 ? success.savingsHubData : null, (r18 & 4) != 0 ? success.isLoading : true, (r18 & 8) != 0 ? success.electronic1099OptIn : null, (r18 & 16) != 0 ? success.savingsAccountId : null, (r18 & 32) != 0 ? success.loadingTileTypes : null, (r18 & 64) != 0 ? success.goalForSuccessSheet : null, (r18 & 128) != 0 ? success.shouldAutoShowTaxPreferencePrompt : false);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy10, null, 2, null);
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Loading loading = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult) {
                return getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult) event);
            }
            if (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NetworkError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.NetworkError.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.GraphQLError(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.GraphQLError) event).getMessage()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Error.UnknownError(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.UnknownError) event).getMessage()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial initial = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Initial) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.Initialize.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success(false, kotlin.collections.CollectionsKt.emptyList(), true, null, null, null, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.HubDataFetchResult p0) {
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success(p0.isFeatureAvailable(), p0.getSavingsHubData(), false, p0.getElectronic1099OptIn(), p0.getSavingsAccountId(), kotlin.collections.SetsKt.emptySet(), p0.getGoalForSuccessSheet(), p0.getShouldAutoShowTaxPreferencePrompt()), null, 2, null);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent p1) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TransferClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToTransferMoney.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoney.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AddMoneyGeneralSavingsClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyGeneralSavings.INSTANCE);
        }
        if (p1 instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAddMoneyWithFiType) p1).getFiType()));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SmartRouteClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToSmartRoute.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSave.INSTANCE);
        }
        if (p1 instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.NavigateToAutoSaveManage) p1).getGoal()));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.InterestEarningsClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToInterestEarnings.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.CreateGoalClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToCreateGoal.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.SavingsStatementsClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowSavingsStatementsInfo.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.FdicInsuranceClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowFdicInsurance.INSTANCE);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference(p0.getElectronic1099OptIn()));
        }
        throw new java.lang.IllegalStateException("Unexpected navigation intent in handleNavigationIntent: ".concat(java.lang.String.valueOf(p1)).toString());
    }
}
