package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class PageActionsManager {
    private static final java.lang.String TAG = "PageActionsManager";

    public static void startPageActions(java.lang.String str, final com.knotapi.knot.webview.KnotView knotView, java.util.List<com.knotapi.knot.models.PageActions> list) {
        for (final com.knotapi.knot.models.PageActions pageActions : list) {
            if (com.knotapi.knot.utilities.Helper.isUrlMatch(str, pageActions.getUrl(), pageActions.getIsUrlRegex())) {
                if (pageActions.getRedirectUrl() != null) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.PageActionsManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.knotapi.knot.webview.KnotView.this.loadUrl(pageActions.getRedirectUrl());
                        }
                    });
                }
                if (pageActions.getComplete()) {
                    knotView.finalStep();
                    return;
                }
                return;
            }
        }
    }
}
