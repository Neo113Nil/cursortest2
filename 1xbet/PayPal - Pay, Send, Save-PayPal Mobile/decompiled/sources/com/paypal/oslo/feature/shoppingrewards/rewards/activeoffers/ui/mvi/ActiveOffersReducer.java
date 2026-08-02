package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/ui/mvi/ActiveOffersEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOffersReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersReducer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersReducer();

    private ActiveOffersReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ActiveOffersReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect>> reduce(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState state, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Close)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Close close = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Close) state;
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoad) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Loading.INSTANCE, null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(close, event);
                    }
                    com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Error error = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnRetry) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Loading.INSTANCE, null, 2, null);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnClose.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Close.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.NavigateClose.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Ready ready = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Ready) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnClose.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Close.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.NavigateClose.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnClick.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnOfferClick) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnOfferClick onOfferClick = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnOfferClick) event;
                    int i = com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersReducer.WhenMappings.$EnumSwitchMapping$0[onOfferClick.getClickType().ordinal()];
                    if (i == 1) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.NavigateToScreen(new com.paypal.oslo.feature.shoppingrewards.api.rewards.offerdetails.navigation.OfferDetailsDestination(onOfferClick.getOfferId(), (java.lang.String) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                    }
                    if (i != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiEffect.NavigateToScreen(new com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.CategoryConfirmationDestination(onOfferClick.getOfferId(), onOfferClick.getTouchpointId())));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Loading loading = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Ready(((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadSuccess) event).getData()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Error(((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoadError) event).getErrorType()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Initial initial = (com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersEvent.OnLoad) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersUiState.Loading.INSTANCE, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }
}
