package com.paypal.oslo.feature.p2p.ui.review.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/reducers/CurrencyConversionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/CurrencyConversionEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyConversionReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState, com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.review.reducers.CurrencyConversionReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.reducers.CurrencyConversionReducer();

    private CurrencyConversionReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CurrencyConversionReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState, com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect>> reduce(com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState state, com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent event) {
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy2;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy3;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy4;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy5;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy6;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy7;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy8;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy9;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy10;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy11;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy12;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy13;
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet;
        if (z || (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion) || (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption) || (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion)) {
            if (!z) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion)) {
                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption)) {
                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion)) {
                            throw new java.lang.IllegalStateException("Unreachable: handleSheetEvent received non-sheet event: ".concat(java.lang.String.valueOf(event)).toString());
                        }
                        copy = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy, new com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect.ConversionConfirmed(((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion) event).getOption(), state.getFxQuoteId()));
                    }
                    copy2 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption) event).getOption(), (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                }
                copy3 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy3, com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect.ConversionCancelled.INSTANCE);
            }
            copy4 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : state.getCommittedOption(), (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : true, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : state.getSheetInstanceId() + 1, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded) {
            com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded fxQuoteLoaded = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded) event;
            copy14 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : fxQuoteLoaded.getFormattedAmount(), (r28 & 4) != 0 ? state.conversionRate : fxQuoteLoaded.getConversionRate(), (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : fxQuoteLoaded.getFxQuoteId(), (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy14, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId) {
            com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId updateTransferAttemptId = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId) event;
            if (state.getTransferAttemptId().length() <= 0 || kotlin.jvm.internal.Intrinsics.areEqual(updateTransferAttemptId.getTransferAttemptId(), state.getTransferAttemptId())) {
                copy12 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : updateTransferAttemptId.getTransferAttemptId(), (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy12, null, 2, null);
            }
            copy13 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : updateTransferAttemptId.getTransferAttemptId(), (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL, (r28 & 1024) != 0 ? state.paymentPlanId : "", (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy13, null, 2, null);
        }
        boolean z2 = event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote;
        if (z2 || (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ClearCachedFxQuote)) {
            if (!z2) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ClearCachedFxQuote)) {
                    throw new java.lang.IllegalStateException("Unreachable: handleCacheEvent received non-cache event: ".concat(java.lang.String.valueOf(event)).toString());
                }
                copy5 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
            }
            copy6 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote) event).getFxQuote(), (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId)) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateStarted)) {
                    if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded) {
                        com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded providerUpdateSucceeded = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded) event;
                        copy8 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : providerUpdateSucceeded.getProvider(), (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : providerUpdateSucceeded.getFundingOptions());
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    copy7 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : state.getCommittedOption(), (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy7, com.paypal.oslo.feature.p2p.ui.review.effects.CurrencyConversionEffect.ShowError.INSTANCE);
                }
                copy9 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : true, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy9, null, 2, null);
            }
            copy10 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : null, (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId) event).getPaymentPlanId(), (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy10, null, 2, null);
        }
        com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange) event).getPlanCurrencyExchange();
        java.lang.String fxQuoteId = planCurrencyExchange.getFxQuoteId();
        java.lang.String str = fxQuoteId == null ? "" : fxQuoteId;
        com.paypal.oslo.feature.p2p.domain.model.Money amountFrom = planCurrencyExchange.getAmountFrom();
        com.paypal.oslo.feature.p2p.domain.model.Money amountTo = planCurrencyExchange.getAmountTo();
        com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate = planCurrencyExchange.getExchangeRate();
        com.paypal.oslo.feature.p2p.domain.model.FxQuote cachedFxQuote = state.getCachedFxQuote();
        copy11 = state.copy((r28 & 1) != 0 ? state.name : null, (r28 & 2) != 0 ? state.formattedAmount : null, (r28 & 4) != 0 ? state.conversionRate : null, (r28 & 8) != 0 ? state.selectedOption : null, (r28 & 16) != 0 ? state.fxQuoteId : null, (r28 & 32) != 0 ? state.isSheetVisible : false, (r28 & 64) != 0 ? state.transferAttemptId : null, (r28 & 128) != 0 ? state.sheetInstanceId : 0, (r28 & 256) != 0 ? state.cachedFxQuote : new com.paypal.oslo.feature.p2p.domain.model.FxQuote(str, amountFrom, amountTo, exchangeRate, cachedFxQuote != null ? cachedFxQuote.getConversionProvider() : null), (r28 & 512) != 0 ? state.committedOption : null, (r28 & 1024) != 0 ? state.paymentPlanId : null, (r28 & 2048) != 0 ? state.isProviderUpdatePending : false, (r28 & 4096) != 0 ? state.updatedFundingOptions : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy11, null, 2, null);
    }
}
