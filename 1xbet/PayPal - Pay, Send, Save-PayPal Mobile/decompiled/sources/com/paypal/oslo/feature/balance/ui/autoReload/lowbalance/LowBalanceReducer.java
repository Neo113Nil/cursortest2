package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceStateStore;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceStateStore;Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LowBalanceReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public LowBalanceReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "BALANCE_AUTO_RELOAD_LOW_BALANCE_REDUCER";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect>> reduce(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore state, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent event) {
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy2;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy3;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy4;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy5;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy6;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy7;
        com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy8;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy9;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy10;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState state2 = state.getState();
        if (!(state2 instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Initial)) {
            if (!(state2 instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Ready)) {
                boolean z = state2 instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading;
                if (!z || ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading) state.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.SETUP) {
                    if (!z || ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading) state.getState()).getStep() != com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.TURN_OFF) {
                        if (!(state2 instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                        }
                        if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnInitialize)) {
                            if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffError)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                            }
                            copy = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.SETUP), (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                        }
                        copy2 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.SETUP), (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffSuccess)) {
                        if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffError)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                        }
                        copy3 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.TURN_OFF), (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
                    }
                    copy4 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Ready.INSTANCE, (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy4, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.GoBackWithTurnOffResult.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded) {
                    com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded) event;
                    copy6 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : onDataLoaded.getThresholdAmount(), (r32 & 4) != 0 ? state.rechargeAmount : onDataLoaded.getRechargeAmount(), (r32 & 8) != 0 ? state.currencyCode : onDataLoaded.getCurrencyCode(), (r32 & 16) != 0 ? state.minimumAmount : onDataLoaded.getMinimumAmount(), (r32 & 32) != 0 ? state.maximumAmount : onDataLoaded.getMaximumAmount(), (r32 & 64) != 0 ? state.thresholdOptions : onDataLoaded.getThresholdOptions(), (r32 & 128) != 0 ? state.rechargeOptions : onDataLoaded.getRechargeOptions(), (r32 & 256) != 0 ? state.formattedMinimum : onDataLoaded.getFormattedMinimum(), (r32 & 512) != 0 ? state.formattedMaximum : onDataLoaded.getFormattedMaximum(), (r32 & 1024) != 0 ? state.formattedThresholdOptions : onDataLoaded.getFormattedThresholdOptions(), (r32 & 2048) != 0 ? state.formattedRechargeOptions : onDataLoaded.getFormattedRechargeOptions(), (r32 & 4096) != 0 ? state.state : com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Ready.INSTANCE, (r32 & 8192) != 0 ? state.isAutoReloadEnabled : onDataLoaded.isAutoReloadEnabled(), (r32 & 16384) != 0 ? state.financialInstrumentId : onDataLoaded.getFinancialInstrumentId());
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataError)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                }
                copy5 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.SETUP), (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
            }
            if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount)) {
                if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount)) {
                    if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions) {
                        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions onUpdateRechargeOptions = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions) event;
                        copy8 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : onUpdateRechargeOptions.getOptions(), (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : onUpdateRechargeOptions.getFormattedOptions(), (r32 & 4096) != 0 ? state.state : null, (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnThresholdAmountClick.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenThresholdAmountBottomSheet(new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceThreshold(state.getThresholdAmount().getAmount()), state.getCurrencyCode(), state.getMinimumAmount(), state.getMaximumAmount(), state.getThresholdOptions(), state.getFormattedMinimum(), state.getFormattedMaximum(), state.getFormattedThresholdOptions()));
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnReloadAmountClick.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenRechargeAmountBottomSheet(new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent.LowBalanceRecharge(state.getRechargeAmount().getAmount(), state.getThresholdAmount().getAmount()), state.getCurrencyCode(), state.getMinimumAmount(), state.getMaximumAmount(), state.getRechargeOptions(), state.getThresholdAmount().getFormattedAmount(), state.getFormattedMaximum(), state.getFormattedRechargeOptions()));
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnNextButtonClick.INSTANCE)) {
                        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore lowBalanceStateStore = state;
                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance lowBalance = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance(state.getRechargeAmount(), state.getThresholdAmount(), state.getFinancialInstrumentId());
                        java.lang.String currencyCode = state.getCurrencyCode();
                        if (state.isAutoReloadEnabled()) {
                            autoReloadFlowType = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.UPDATE;
                        } else {
                            autoReloadFlowType = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.CREATE;
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(lowBalanceStateStore, new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenReviewBottomSheet(lowBalance, currencyCode, autoReloadFlowType));
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffButtonClick.INSTANCE)) {
                        return kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnBackButtonClick.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                    }
                    copy7 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.TURN_OFF), (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
                }
                copy9 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount) event).getAmount(), (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : null, (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy9, null, 2, null);
            }
            copy10 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount) event).getAmount(), (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : null, (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy10, null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnInitialize)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        copy11 = state.copy((r32 & 1) != 0 ? state.name : null, (r32 & 2) != 0 ? state.thresholdAmount : null, (r32 & 4) != 0 ? state.rechargeAmount : null, (r32 & 8) != 0 ? state.currencyCode : null, (r32 & 16) != 0 ? state.minimumAmount : null, (r32 & 32) != 0 ? state.maximumAmount : null, (r32 & 64) != 0 ? state.thresholdOptions : null, (r32 & 128) != 0 ? state.rechargeOptions : null, (r32 & 256) != 0 ? state.formattedMinimum : null, (r32 & 512) != 0 ? state.formattedMaximum : null, (r32 & 1024) != 0 ? state.formattedThresholdOptions : null, (r32 & 2048) != 0 ? state.formattedRechargeOptions : null, (r32 & 4096) != 0 ? state.state : new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep.SETUP), (r32 & 8192) != 0 ? state.isAutoReloadEnabled : false, (r32 & 16384) != 0 ? state.financialInstrumentId : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy11, null, 2, null);
    }
}
