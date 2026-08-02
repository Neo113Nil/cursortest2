package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/legacyservicing/viewmodel/LegacyServicingLandingEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegacyServicingLandingReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public LegacyServicingLandingReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "LegacyServicingLandingReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Error) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnRetryClicked.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Loading.INSTANCE, null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnUrlFetched) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingUiEffect.NavigateToWebView(((com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnUrlFetched) event).getUrl()));
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnUrlFetchFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Error(((com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnUrlFetchFailed) event).getErrorMessage()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Initial) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingEvent.OnViewCreated.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingState.Loading.INSTANCE, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
