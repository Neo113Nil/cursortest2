package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class KrogerClient extends com.knotapi.knot.webview.KnotViewClient {
    public KrogerClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void checkNoSubscriptionStatus() {
        if (!this.knotView.getUrl().contains("confirm/send") || this.knotView.merchantViewListener.isErrorViewVisible()) {
            return;
        }
        showErrorPage(getErrorView());
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.models.ErrorView getErrorView() {
        com.knotapi.knot.models.ErrorView errorView = super.getErrorView();
        errorView.setTitle(this.bot.getConfirmationErrorTitle());
        errorView.setContent(this.bot.getConfirmationErrorMessage());
        return errorView;
    }
}
