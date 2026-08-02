package com.paypal.oslo.feature.identity.sna.ui.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutomaticMobileVerificationReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AutomaticMobileVerificationReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AutomaticMobileVerificationReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect>> reduce(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState state, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent event) {
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
        if (state instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Initial) {
            com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Initial initial = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success(((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded) event).getStatus() == com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus.FULL_CONSENT, null, false, 6, null), uiEffect, i, objArr15 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed) {
                com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed consentStatusLoadFailed = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed) event;
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error(consentStatusLoadFailed.getError()), new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError(consentStatusLoadFailed.getError())));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(initial, event));
        }
        if (state instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading) {
            com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading loading = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success(((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded) event).getEnabled(), null, false, 6, null), objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success(!r12.getAttemptedState(), null, false, 6, null), new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError(((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed) event).getError())));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(loading, event));
        }
        if (state instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success) {
            com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success success = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success) state;
            if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent) {
                com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent toggleConsent = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent) event;
                if (!toggleConsent.getEnabled() && success.isEnabled()) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success.copy$default(success, false, null, true, 3, null), objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0));
                }
                if (toggleConsent.getEnabled() && !success.isEnabled()) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading.INSTANCE, objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0));
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(success, objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConfirmDisable.INSTANCE)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading.INSTANCE, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.CancelDisable.INSTANCE)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success.copy$default(success, false, null, false, 3, null), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.PrivacyPolicyClicked.INSTANCE)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(success, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToPrivacyPolicy.INSTANCE));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.UpdateNumberClicked.INSTANCE)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(success, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToUpdateNumber.INSTANCE));
            }
            if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success.copy$default(success, false, ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded) event).getNumbers(), false, 5, null), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(success, event));
        }
        if (!(state instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error) state, event));
    }
}
