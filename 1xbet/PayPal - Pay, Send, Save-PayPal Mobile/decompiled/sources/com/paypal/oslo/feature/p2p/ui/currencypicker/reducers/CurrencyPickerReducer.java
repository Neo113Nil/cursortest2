package com.paypal.oslo.feature.p2p.ui.currencypicker.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/reducers/CurrencyPickerReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyPickerState;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyPickerState;Lcom/paypal/oslo/feature/p2p/ui/currencypicker/events/CurrencyPickerEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyPickerReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.currencypicker.reducers.CurrencyPickerReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.currencypicker.reducers.CurrencyPickerReducer();

    private CurrencyPickerReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CurrencyPickerReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState, com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect>> reduce(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState state, com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent event) {
        com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom navigateToXoom;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCurrencies)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.LoadCryptos)) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged)) {
                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged)) {
                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClicked)) {
                            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor)) {
                                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded)) {
                                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed)) {
                                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded)) {
                                            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies)) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.copy$default(state, null, null, false, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.UpdateDisplayedCurrencies) event).getFilteredCurrencies(), false, null, 55, null), null, 2, null);
                                        }
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.copy$default(state, null, null, false, null, false, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed) event).getErrorMessage(), 15, null), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.copy$default(state, null, null, false, null, false, null, 15, null), null, 2, null);
                            }
                            com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor currencyClickedWithProcessor = (com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrencyClickedWithProcessor) event;
                            int i = com.paypal.oslo.feature.p2p.ui.currencypicker.reducers.CurrencyPickerReducer.WhenMappings.$EnumSwitchMapping$0[currencyClickedWithProcessor.getSelectedCurrency().getPaymentProcessor().ordinal()];
                            if (i == 1) {
                                navigateToXoom = new com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom(currencyClickedWithProcessor.getSelectedCurrency());
                            } else {
                                if (i != 2 && i != 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                navigateToXoom = new com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected(currencyClickedWithProcessor.getSelectedCurrency().getId(), currencyClickedWithProcessor.getSelectedCurrency().getCurrencyCode());
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, navigateToXoom);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.copy$default(state, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.SearchQueryChanged) event).getQuery(), null, false, null, false, null, 62, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.copy$default(state, null, ((com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.TabChanged) event).getType(), false, null, false, null, 61, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.copy$default(state, null, null, false, null, true, null, 15, null), null, 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.XOOM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.PAYPAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
