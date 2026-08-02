package com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState;Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState$Success;", "p0", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState$Success;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWebViewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardWebViewReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardWebViewReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect>> reduce(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState state, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success success = (com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success) state;
            if ((event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.BackPressed) || (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.NativeReturnUriDetected)) {
                if (success.getHasAddedCardholder()) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect.NavigateBackWithResult(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded.INSTANCE));
                }
                if (success.getHasActivatedCard() || kotlin.text.StringsKt.contains((java.lang.CharSequence) success.getUrl(), (java.lang.CharSequence) "/activate", true)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect.NavigateBackWithResult(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated.INSTANCE));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddCardholderSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success.copy$default(success, null, false, null, true, false, false, 55, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess) {
                com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess addAddressSuccess = (com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess) event;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWebViewReducer: AddAddressSuccess", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("newAddressId", addAddressSuccess.getNewAddressId())), null, 4, null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success.copy$default(success, null, false, null, false, false, true, 31, null), new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect.NavigateBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.AddressAdded(addAddressSuccess.getNewAddressId())));
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ActivateCardSuccess) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success.copy$default(success, null, false, null, false, true, false, 47, null), new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect.NavigateBackWithResult(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardActivated.INSTANCE));
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.SeeDigitalCardClicked) {
                return getHighSpeedVideoFpsRangesFor(success, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.SEE_DIGITAL_WALLET);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ManageCardClicked) {
                return getHighSpeedVideoFpsRangesFor(success, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.NONE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.LinkBankAccountClicked) {
                return getHighSpeedVideoFpsRangesFor(success, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.LINK_ACCOUNT);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
        }
        com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Initial initial = (com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize) {
            com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize initialize = (com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success(initialize.getUrl(), initialize.isAuthRequired(), initialize.getTitle(), false, false, false, 56, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect>> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success p0, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction p1) {
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect.NavigateBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled(p1)));
    }
}
