package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class HeadSpaceClient extends com.knotapi.knot.webview.KnotViewClient {
    public static final java.lang.String TAG = "Knot:HeadSpaceClient";

    public HeadSpaceClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.models.ErrorView getErrorView() {
        com.knotapi.knot.models.ErrorView errorView = super.getErrorView();
        errorView.setTitle("Account not found");
        errorView.setContent("Your account not found on HeadSpace with this login detail.");
        return errorView;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.contains("missing-profile-fields")) {
            showErrorPage(getErrorView());
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String optString = new org.json.JSONObject(str2).optString("branch_session");
            java.lang.String optString2 = !optString.isEmpty() ? new org.json.JSONObject(optString).optString("identity") : "";
            if (str2.contains("branch_session") && new org.json.JSONObject(str2).optString("mprtcl-v4_B0C8D5EC-events").equals("") && !optString2.equals("null") && !optString2.isEmpty()) {
                com.knotapi.knot.webview.KnotView knotView = this.knotView;
                if (knotView.isUserLoggedIn(knotView.getUrl())) {
                    updateCookieDomain();
                    this.knotView.getMerchantViewListener().sendRunningEvent(str, str2);
                    return;
                }
            }
            this.knotView.getStorageDetails();
        } catch (org.json.JSONException | java.lang.Exception unused) {
        }
    }

    public void updateCookieDomain() {
        java.util.List<com.knotapi.knot.utilities.Cookie> cookies = this.knotView.getCookies();
        for (com.knotapi.knot.utilities.Cookie cookie : cookies) {
            if (cookie.getName().equals("countryCode") || cookie.getName().equals("countryCodeLookupStatus") || cookie.getName().equals("lang") || cookie.getName().equals("OptanonConsent") || cookie.getName().equals("OptanonAlertBoxClosed") || cookie.getName().equals("hsngjwt") || cookie.getName().equals("AWSALBCORS")) {
                cookie.setSecure(true);
            }
        }
        this.knotView.setCookies(cookies);
    }
}
