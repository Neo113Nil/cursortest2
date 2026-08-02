package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class ErrorViewActionsManager {
    private static final java.lang.String TAG = "ErrorViewActionsManager";

    public static void startErrorViewActions(java.lang.String str, com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.models.ErrorViewActions errorViewActions) {
        if (!com.knotapi.knot.utilities.Helper.isUrlMatch(str, errorViewActions.getUrl(), errorViewActions.getIsUrlRegex()) || errorViewActions.getErrorView() == null) {
            return;
        }
        com.knotapi.knot.models.ErrorView errorView = knotView.getViewClient().getErrorView();
        errorView.setTitle(errorViewActions.getErrorView().get("title").getAsString());
        errorView.setContent(errorViewActions.getErrorView().get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION).getAsString());
        knotView.getViewClient().showErrorPage(errorView);
    }
}
