package com.paypal.oslo.app.emw.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmwViewModelKt {
    public static final /* synthetic */ com.paypal.oslo.app.emw.domain.model.EmwUiState access$toUiState(com.paypal.oslo.app.emw.domain.models.WebAuthSessionAuthorizationError webAuthSessionAuthorizationError) {
        if (webAuthSessionAuthorizationError instanceof com.paypal.oslo.app.emw.domain.models.WebAuthSessionAuthorizationError.UrlValidationError) {
            return new com.paypal.oslo.app.emw.domain.model.EmwUiState.UrlValidationFailed(((com.paypal.oslo.app.emw.domain.models.WebAuthSessionAuthorizationError.UrlValidationError) webAuthSessionAuthorizationError).getError().getMessage());
        }
        if (webAuthSessionAuthorizationError instanceof com.paypal.oslo.app.emw.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure) {
            return new com.paypal.oslo.app.emw.domain.model.EmwUiState.AuthenticationFailed("Authentication failed");
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
