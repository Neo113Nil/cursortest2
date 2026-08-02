package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsUiState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/mvi/OfferDetailsEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferDetailsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsReducer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsReducer();

    private OfferDetailsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "OfferDetailsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect>> reduce(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState state, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect>> output$default;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData copy;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet dismissBottomSheet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Activating)) {
                        if (!(state instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Error error = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Loading.INSTANCE, null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOffer) {
                            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow flow = error.getFlow();
                            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate activate = flow instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate ? (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.Flow.Activate) flow : null;
                            return (activate == null || (output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Activating(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.INSTANCE.getAsActivating(activate.getData())), null, 2, null)) == null) ? com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event) : output$default;
                        }
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Activating activating = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Activating) state;
                    if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess)) {
                        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError) {
                            com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError onActivateOfferError = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferError) event;
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Error(onActivateOfferError.getErrorType(), onActivateOfferError.getFlow()), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(activating, event);
                    }
                    copy = r5.copy((r24 & 1) != 0 ? r5.offerId : null, (r24 & 2) != 0 ? r5.title : null, (r24 & 4) != 0 ? r5.subtitle : null, (r24 & 8) != 0 ? r5.headerType : null, (r24 & 16) != 0 ? r5.detailsItems : null, (r24 & 32) != 0 ? r5.termsText : null, (r24 & 64) != 0 ? r5.termsTextLink : null, (r24 & 128) != 0 ? r5.termsUrls : null, (r24 & 256) != 0 ? r5.buttonCta : null, (r24 & 512) != 0 ? r5.isActive : false, (r24 & 1024) != 0 ? com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.INSTANCE.getAsReady(((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOfferSuccess) event).getData()).wasActivatedThisSession : true);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Ready(copy), null, 2, null);
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Ready ready = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnActivateOffer) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Activating(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.INSTANCE.getAsActivating(ready.getData())), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.NavigateToTerms(((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnTermsClick) event).getTag()));
                }
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Ready ready2 = ready;
                    if (ready.getData().getWasActivatedThisSession()) {
                        dismissBottomSheet = com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheetWithResult.INSTANCE;
                    } else {
                        dismissBottomSheet = com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet.INSTANCE;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, dismissBottomSheet);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Ready(((com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadSuccess) event).getData()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError) {
                com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoadError) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Error(onLoadError.getErrorType(), onLoadError.getFlow()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Loading.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Loading.INSTANCE, event);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Initial initial = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnLoad) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiState.Loading.INSTANCE, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsEvent.OnClose) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.mvi.OfferDetailsUiEffect.DismissBottomSheet.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
