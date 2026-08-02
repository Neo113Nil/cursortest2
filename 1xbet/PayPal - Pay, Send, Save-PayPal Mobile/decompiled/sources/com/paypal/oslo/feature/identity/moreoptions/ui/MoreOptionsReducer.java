package com.paypal.oslo.feature.identity.moreoptions.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState;Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MoreOptionsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MoreOptionsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "MoreOptionsReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect>> reduce(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState state, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 2;
        com.paypal.oslo.core.mvi.UiEffect uiEffect = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        java.lang.Object[] objArr8 = 0;
        java.lang.Object[] objArr9 = 0;
        java.lang.Object[] objArr10 = 0;
        java.lang.Object[] objArr11 = 0;
        java.lang.Object[] objArr12 = 0;
        java.lang.Object[] objArr13 = 0;
        java.lang.Object[] objArr14 = 0;
        java.lang.Object[] objArr15 = 0;
        java.lang.Object[] objArr16 = 0;
        java.lang.Object[] objArr17 = 0;
        java.lang.Object[] objArr18 = 0;
        java.lang.Object[] objArr19 = 0;
        java.lang.Object[] objArr20 = 0;
        java.lang.Object[] objArr21 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr23 = 0;
        if (state instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading) {
            com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading loading = (com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading) state;
            if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize)) {
                if (event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loading, objArr22 == true ? 1 : 0, i, objArr21 == true ? 1 : 0));
                }
                if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess)) {
                    if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure)) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(loading, event));
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure) event).getMessage()), objArr18 == true ? 1 : 0, i, objArr17 == true ? 1 : 0));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess) event).getOptions(), false), objArr20 == true ? 1 : 0, i, objArr19 == true ? 1 : 0));
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize) event).getOptions(), false), uiEffect, i, objArr23 == true ? 1 : 0));
        }
        if (state instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded) {
            com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded loaded = (com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded) state;
            if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions)) {
                if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess)) {
                    if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure)) {
                        if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize)) {
                            if (event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.ToggleShowMore) {
                                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded.copy$default(loaded, null, !loaded.getShowAllOptions(), 1, null), objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0));
                            }
                            if (event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption) {
                                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loaded, new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect.NavigateToAuthentication(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption) event).getType())));
                            }
                            if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Dismiss)) {
                                return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(loaded, event));
                            }
                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loaded, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect.CloseBottomSheet.INSTANCE));
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize) event).getOptions(), false), objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0));
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure) event).getMessage()), objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess) event).getOptions(), false), objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0));
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading.INSTANCE, objArr16 == true ? 1 : 0, i, objArr15 == true ? 1 : 0));
        }
        if (!(state instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error error = (com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error) state;
        if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions)) {
            if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess)) {
                if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure)) {
                    if (!(event instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Dismiss)) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(error, event));
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(error, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiEffect.CloseBottomSheet.INSTANCE));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure) event).getMessage()), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
            }
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess) event).getOptions(), false), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0));
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading.INSTANCE, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0));
    }
}
