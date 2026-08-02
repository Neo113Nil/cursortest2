package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ViewPinReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ViewPinReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ViewPinReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect.NavigateToChangePin navigateToChangePin;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Ready)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnViewCreated) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnBackClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect.NavigateBack.INSTANCE);
            }
            if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnActionButtonClicked)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Ready ready2 = ready;
            if (ready.getUiModel().getHasPhysicalCard()) {
                navigateToChangePin = com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect.NavigateBack.INSTANCE;
            } else {
                navigateToChangePin = com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect.NavigateToChangePin.INSTANCE;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, navigateToChangePin);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnViewCreated) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Ready(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnViewCreated) event).getUiModel()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnBackClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect.NavigateBack.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnActionButtonClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
