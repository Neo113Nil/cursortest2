package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class ShopifyClient extends com.knotapi.knot.webview.KnotViewClient {
    public ShopifyClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        if (!knotView.isUserLoggedIn(knotView.getUrl())) {
            this.knotView.getStorageDetails();
        } else {
            this.knotView.getmExtraInfo().setLoggedInPage(this.knotView.getUrl());
            this.knotView.getMerchantViewListener().sendRunningEvent(str, str2);
        }
    }
}
