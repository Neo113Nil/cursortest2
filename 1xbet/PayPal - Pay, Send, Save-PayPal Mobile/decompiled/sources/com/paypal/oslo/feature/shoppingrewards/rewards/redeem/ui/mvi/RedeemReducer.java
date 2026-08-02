package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemReducer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemReducer();

    private RedeemReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RedeemReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect>> reduce(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState state, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent event) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary copy;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary copy2;
        java.lang.Object obj;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture copy3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities)) {
                    if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture)) {
                        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection)) {
                            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary)) {
                                if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming)) {
                                    if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation)) {
                                        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error error = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error) state;
                                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRetry) {
                                            if (error.getRedeemingState() != null) {
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error.getRedeemingState(), null, 2, null);
                                            }
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading(error.getRedeemType(), error.getAvailablePoints()), null, 2, null);
                                        }
                                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss) {
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen.INSTANCE);
                                        }
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                                    }
                                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation readyConfirmation = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation) state;
                                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyConfirmation, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreenAfterRedemption.INSTANCE);
                                    }
                                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnActivityClick) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyConfirmation, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.NavigateToActivity.INSTANCE);
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(readyConfirmation, event);
                                }
                                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) state;
                                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation(redeeming.getRedeemType(), redeeming.getAmount(), redeeming.getConvertedAmount(), ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess) event).getFormattedAmount(), redeeming.getSelectedCharityName(), redeeming.getSelectedCharityLogoUrl(), redeeming.getAvailablePoints()), null, 2, null);
                                }
                                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error(redeeming.getRedeemType(), ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError) event).getErrorType(), redeeming.getAvailablePoints(), redeeming), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(redeeming, event);
                            }
                            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary readySummary = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary) state;
                            if ((event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnConfirmDonation) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeem)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming(readySummary.getRedeemType(), readySummary.getAmount(), readySummary.getConvertedAmount(), readySummary.getCurrencyCode(), readySummary.getFormattedAmount(), readySummary.getSelectedCharityId(), readySummary.getSelectedCharityName(), readySummary.getSelectedCharityLogoUrl(), readySummary.getAvailablePoints(), readySummary.getShareInfoEnabled()), null, 2, null);
                            }
                            if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted)) {
                                if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle)) {
                                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readySummary, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl(((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick) event).getUrl()));
                                    }
                                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShowTermsBottomSheet) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readySummary, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet(readySummary.getRedeemType()));
                                    }
                                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readySummary, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen.INSTANCE);
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(readySummary, event);
                                }
                                copy = readySummary.copy((r22 & 1) != 0 ? readySummary.redeemType : null, (r22 & 2) != 0 ? readySummary.amount : null, (r22 & 4) != 0 ? readySummary.convertedAmount : null, (r22 & 8) != 0 ? readySummary.currencyCode : null, (r22 & 16) != 0 ? readySummary.formattedAmount : null, (r22 & 32) != 0 ? readySummary.selectedCharityId : null, (r22 & 64) != 0 ? readySummary.selectedCharityName : null, (r22 & 128) != 0 ? readySummary.selectedCharityLogoUrl : null, (r22 & 256) != 0 ? readySummary.availablePoints : 0, (r22 & 512) != 0 ? readySummary.shareInfoEnabled : ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle) event).getShareInfo());
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                            }
                            copy2 = readySummary.copy((r22 & 1) != 0 ? readySummary.redeemType : null, (r22 & 2) != 0 ? readySummary.amount : null, (r22 & 4) != 0 ? readySummary.convertedAmount : null, (r22 & 8) != 0 ? readySummary.currencyCode : null, (r22 & 16) != 0 ? readySummary.formattedAmount : ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted) event).getFormattedAmount(), (r22 & 32) != 0 ? readySummary.selectedCharityId : null, (r22 & 64) != 0 ? readySummary.selectedCharityName : null, (r22 & 128) != 0 ? readySummary.selectedCharityLogoUrl : null, (r22 & 256) != 0 ? readySummary.availablePoints : 0, (r22 & 512) != 0 ? readySummary.shareInfoEnabled : false);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                        }
                        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection readyCharitySelection = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection) state;
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity) {
                            java.util.Iterator<T> it = readyCharitySelection.getCharities().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel) obj).getId(), ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity) event).getCharityId())) {
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel charityModel = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel) obj;
                            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = readyCharitySelection.getRedeemType();
                            int availablePoints = readyCharitySelection.getAvailablePoints();
                            double availablePoints2 = readyCharitySelection.getAvailablePoints();
                            double conversionRate = readyCharitySelection.getConversionRate();
                            int availablePoints3 = readyCharitySelection.getAvailablePoints();
                            double conversionRate2 = readyCharitySelection.getConversionRate();
                            java.lang.String exchangeRatePoints = readyCharitySelection.getExchangeRatePoints();
                            java.lang.String exchangeRateAmount = readyCharitySelection.getExchangeRateAmount();
                            java.lang.String currencyCode = readyCharitySelection.getCurrencyCode();
                            java.lang.String exchangeRateDisplayText = readyCharitySelection.getExchangeRateDisplayText();
                            java.lang.String charityId = ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity) event).getCharityId();
                            java.lang.String name2 = charityModel != null ? charityModel.getName() : null;
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture(redeemType, java.lang.String.valueOf(availablePoints), java.lang.String.valueOf(availablePoints2 * conversionRate), availablePoints3, conversionRate2, exchangeRatePoints, exchangeRateAmount, currencyCode, exchangeRateDisplayText, charityId, name2 == null ? "" : name2, charityModel != null ? charityModel.getLogoUrl() : null), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyCharitySelection, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(readyCharitySelection, event);
                    }
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture readyCapture = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture) state;
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange) {
                        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange onAmountChange = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange) event;
                        copy3 = readyCapture.copy((r28 & 1) != 0 ? readyCapture.redeemType : null, (r28 & 2) != 0 ? readyCapture.amount : onAmountChange.getAmount(), (r28 & 4) != 0 ? readyCapture.convertedAmount : java.lang.String.valueOf((kotlin.text.StringsKt.toIntOrNull(onAmountChange.getAmount()) != null ? r1.intValue() : 0) * readyCapture.getConversionRate()), (r28 & 8) != 0 ? readyCapture.availablePoints : 0, (r28 & 16) != 0 ? readyCapture.conversionRate : 0.0d, (r28 & 32) != 0 ? readyCapture.exchangeRatePoints : null, (r28 & 64) != 0 ? readyCapture.exchangeRateAmount : null, (r28 & 128) != 0 ? readyCapture.currencyCode : null, (r28 & 256) != 0 ? readyCapture.exchangeRateDisplayText : null, (r28 & 512) != 0 ? readyCapture.selectedCharityId : null, (r28 & 1024) != 0 ? readyCapture.selectedCharityName : null, (r28 & 2048) != 0 ? readyCapture.selectedCharityLogoUrl : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnNext)) {
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyCapture, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.OpenTermsUrl(((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick) event).getUrl()));
                        }
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShowTermsBottomSheet) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyCapture, new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.ShowTermsBottomSheet(readyCapture.getRedeemType()));
                        }
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(readyCapture, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(readyCapture, event);
                    }
                    int i = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemReducer.WhenMappings.$EnumSwitchMapping$0[readyCapture.getRedeemType().ordinal()];
                    if (i == 1 || i == 2) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming(readyCapture.getRedeemType(), readyCapture.getAmount(), readyCapture.getConvertedAmount(), readyCapture.getCurrencyCode(), "", null, null, null, readyCapture.getAvailablePoints(), false, 512, null), null, 2, null);
                    }
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType2 = readyCapture.getRedeemType();
                    java.lang.String amount = readyCapture.getAmount();
                    java.lang.String convertedAmount = readyCapture.getConvertedAmount();
                    java.lang.String currencyCode2 = readyCapture.getCurrencyCode();
                    java.lang.String selectedCharityId = readyCapture.getSelectedCharityId();
                    java.lang.String str = selectedCharityId == null ? "" : selectedCharityId;
                    java.lang.String selectedCharityName = readyCapture.getSelectedCharityName();
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary(redeemType2, amount, convertedAmount, currencyCode2, "", str, selectedCharityName == null ? "" : selectedCharityName, readyCapture.getSelectedCharityLogoUrl(), readyCapture.getAvailablePoints(), false, 512, null), null, 2, null);
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities loadingCharities = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities) state;
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection(loadingCharities.getRedeemType(), ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess) event).getCharities(), null, loadingCharities.getAvailablePoints(), loadingCharities.getConversionRate(), loadingCharities.getExchangeRatePoints(), loadingCharities.getExchangeRateAmount(), loadingCharities.getCurrencyCode(), loadingCharities.getExchangeRateDisplayText()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error(loadingCharities.getRedeemType(), ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError) event).getErrorType(), loadingCharities.getAvailablePoints(), null, 8, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loadingCharities, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loadingCharities, event);
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading loading = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess) {
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess onLoadSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess) event;
                java.lang.Object data = onLoadSuccess.getData();
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response response = data instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response ? (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response) data : null;
                double conversionRate3 = response != null ? response.getConversionRate() : 0.0d;
                java.lang.String exchangeRatePoints2 = response != null ? response.getExchangeRatePoints() : null;
                java.lang.String str2 = exchangeRatePoints2 == null ? "" : exchangeRatePoints2;
                java.lang.String exchangeRateAmount2 = response != null ? response.getExchangeRateAmount() : null;
                java.lang.String str3 = exchangeRateAmount2 == null ? "" : exchangeRateAmount2;
                java.lang.String currencyCode3 = response != null ? response.getCurrencyCode() : null;
                java.lang.String str4 = currencyCode3 == null ? "" : currencyCode3;
                int pointsAvailable = response != null ? response.getPointsAvailable() : loading.getAvailablePoints();
                int i2 = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemReducer.WhenMappings.$EnumSwitchMapping$0[loading.getRedeemType().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture(loading.getRedeemType(), java.lang.String.valueOf(pointsAvailable), java.lang.String.valueOf(pointsAvailable * conversionRate3), pointsAvailable, conversionRate3, str2, str3, str4, onLoadSuccess.getExchangeRateDisplayText(), null, null, null, 3584, null), null, 2, null);
                }
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities(loading.getRedeemType(), pointsAvailable, conversionRate3, str2, str3, str4, onLoadSuccess.getExchangeRateDisplayText()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error(loading.getRedeemType(), ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError) event).getErrorType(), loading.getAvailablePoints(), null, 8, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemUiEffect.DismissScreen.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial initial = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad) {
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad onLoad = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading(onLoad.getRedeemType(), onLoad.getAvailablePoints()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
