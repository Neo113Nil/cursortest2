package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class SquareSpaceClient extends com.knotapi.knot.webview.KnotViewClient {
    public SquareSpaceClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.utilities.Cookie buildCookie = super.buildCookie(str, str2);
        buildCookie.setDomain(str2.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)[2]);
        return buildCookie;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.models.ErrorView getErrorView() {
        com.knotapi.knot.models.ErrorView errorView = super.getErrorView();
        errorView.setName("Square Space");
        return errorView;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        if (knotView.isUserLoggedIn(knotView.getUrl())) {
            this.knotView.getMerchantViewListener().sendRunningEvent(str, str2);
        } else {
            this.knotView.getStorageDetails();
        }
    }
}
