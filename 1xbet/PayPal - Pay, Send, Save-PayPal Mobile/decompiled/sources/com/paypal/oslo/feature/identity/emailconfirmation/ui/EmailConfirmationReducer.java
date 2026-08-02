package com.paypal.oslo.feature.identity.emailconfirmation.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiState;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationEvent;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiState;Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationEvent;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public EmailConfirmationReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "EmailConfirmationReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect>> reduce(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState state, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.CloseButtonClicked) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(state, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithDismiss.INSTANCE));
        }
        if (state instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading) {
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading loading = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading) state;
            int i = 2;
            com.paypal.oslo.core.mvi.UiEffect uiEffect = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            java.lang.Object[] objArr4 = 0;
            java.lang.Object[] objArr5 = 0;
            if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.StartConfirmation) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loading, uiEffect, i, objArr5 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationSuccess) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success(((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationSuccess) event).getConfirmedEmail()), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0));
            }
            if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError) {
                com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError confirmationError = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationError) event;
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error(confirmationError.getErrorType(), confirmationError.getMessage()), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(loading, event));
        }
        if (state instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success) {
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success success = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success) state;
            if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.Dismiss) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(success, new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess(success.getConfirmedEmail())));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(success, event));
        }
        if (!(state instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error error = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error) state;
        if (event instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.Dismiss) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(error, new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError(error.getErrorType(), error.getMessage())));
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(error, event));
    }
}
