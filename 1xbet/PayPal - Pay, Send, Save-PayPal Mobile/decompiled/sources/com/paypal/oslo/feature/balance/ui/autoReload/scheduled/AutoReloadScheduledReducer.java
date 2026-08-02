package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledIntent;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledIntent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadScheduledReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AutoReloadScheduledReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "BALANCE_AUTO_RELOAD_SCHEDULED_REDUCER";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect>> reduce(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState state, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent event) {
        com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType;
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success copy;
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success copy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Initial) {
            return kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.Initialize.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff)) {
                if (!(state instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success)) {
                    if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError) {
                        return event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError) state, event);
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success success = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.Initialize.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading.INSTANCE, null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.ShowScheduledAmountBottomSheet.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet(new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.ScheduledRecharge(success.getReloadAmount().getAmount()), success.getCurrencyCode(), com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, success.getMinimumAmount(), success.getMaximumAmount(), success.getOptions(), success.getFormattedMinimum(), success.getFormattedMaximum(), success.getFormattedOptions()));
                }
                if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnScheduledAmountSelected)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.ShowScheduledFrequencyBottomSheet.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet(success.getFrequency()));
                    }
                    if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnScheduledFrequencySelected) {
                        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnScheduledFrequencySelected onScheduledFrequencySelected = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnScheduledFrequencySelected) event;
                        copy = success.copy((r28 & 1) != 0 ? success.frequency : onScheduledFrequencySelected.getFrequency(), (r28 & 2) != 0 ? success.startDate : onScheduledFrequencySelected.getStartDate(), (r28 & 4) != 0 ? success.reloadAmount : null, (r28 & 8) != 0 ? success.currencyCode : null, (r28 & 16) != 0 ? success.shouldShowTurnOffOption : false, (r28 & 32) != 0 ? success.isAutoReloadEnabled : false, (r28 & 64) != 0 ? success.financialInstrumentId : null, (r28 & 128) != 0 ? success.minimumAmount : null, (r28 & 256) != 0 ? success.maximumAmount : null, (r28 & 512) != 0 ? success.options : null, (r28 & 1024) != 0 ? success.formattedMinimum : null, (r28 & 2048) != 0 ? success.formattedMaximum : null, (r28 & 4096) != 0 ? success.formattedOptions : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnNextButtonClick.INSTANCE)) {
                        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success success2 = success;
                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled scheduled = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled(success.getReloadAmount(), success.getFrequency(), success.getStartDate(), success.getFinancialInstrumentId());
                        java.lang.String currencyCode = success.getCurrencyCode();
                        if (success.isAutoReloadEnabled()) {
                            autoReloadFlowType = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.UPDATE;
                        } else {
                            autoReloadFlowType = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.CREATE;
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success2, new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet(scheduled, currencyCode, autoReloadFlowType));
                    }
                    if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffButtonClick) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff.INSTANCE, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                }
                copy2 = success.copy((r28 & 1) != 0 ? success.frequency : null, (r28 & 2) != 0 ? success.startDate : null, (r28 & 4) != 0 ? success.reloadAmount : ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnScheduledAmountSelected) event).getAmount(), (r28 & 8) != 0 ? success.currencyCode : null, (r28 & 16) != 0 ? success.shouldShowTurnOffOption : false, (r28 & 32) != 0 ? success.isAutoReloadEnabled : false, (r28 & 64) != 0 ? success.financialInstrumentId : null, (r28 & 128) != 0 ? success.minimumAmount : null, (r28 & 256) != 0 ? success.maximumAmount : null, (r28 & 512) != 0 ? success.options : null, (r28 & 1024) != 0 ? success.formattedMinimum : null, (r28 & 2048) != 0 ? success.formattedMaximum : null, (r28 & 4096) != 0 ? success.formattedOptions : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
            }
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff loadingTurnOff = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff) state;
            if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loadingTurnOff, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.TurnOffAutoReloadResult.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loadingTurnOff, event);
        }
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading loading = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.Initialize.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading.INSTANCE, null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnDataLoaded)) {
            return event instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnDataError ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnDataLoaded) event;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success(onDataLoaded.getFrequency(), onDataLoaded.getStartDate(), onDataLoaded.getReloadAmount(), onDataLoaded.getCurrencyCode(), onDataLoaded.getShouldShowTurnOffOption(), onDataLoaded.isAutoReloadEnabled(), onDataLoaded.getFinancialInstrumentId(), onDataLoaded.getMinimumAmount(), onDataLoaded.getMaximumAmount(), onDataLoaded.getOptions(), onDataLoaded.getFormattedMinimum(), onDataLoaded.getFormattedMaximum(), onDataLoaded.getFormattedOptions()), null, 2, null);
    }
}
