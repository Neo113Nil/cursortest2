package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class LowesClient extends com.knotapi.knot.webview.KnotViewClient {
    private java.lang.String cookieValue;
    private java.lang.String defaultCookieValue;

    public LowesClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
        this.cookieValue = "";
        this.defaultCookieValue = "";
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.utilities.Cookie buildCookie = super.buildCookie(str, str2);
        if (buildCookie.getName().equals("_abck")) {
            if (buildCookie.getValue().contains("~0~") && (str2.equals(this.bot.getLoggedInUrl()) || str2.equals(this.bot.getPaymentUrl()))) {
                this.cookieValue = buildCookie.getValue();
                return buildCookie;
            }
            this.defaultCookieValue = buildCookie.getValue();
            buildCookie.setValue("");
        }
        return buildCookie;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        updateCookieValue();
    }

    public void updateCookieValue() {
        java.util.List<com.knotapi.knot.utilities.Cookie> cookies = this.knotView.getCookies();
        for (com.knotapi.knot.utilities.Cookie cookie : cookies) {
            if (cookie.getName().equals("_abck")) {
                if (this.cookieValue.isEmpty()) {
                    cookie.setValue(this.defaultCookieValue);
                } else {
                    cookie.setValue(this.cookieValue);
                }
            }
        }
        this.knotView.setCookies(cookies);
        this.knotView.getMerchantViewListener().sendRunningEvent("{}", "{}");
    }
}
