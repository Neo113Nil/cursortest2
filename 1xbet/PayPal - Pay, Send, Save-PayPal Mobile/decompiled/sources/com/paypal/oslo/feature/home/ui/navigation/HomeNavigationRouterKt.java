package com.paypal.oslo.feature.home.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeNavigationRouterKt {
    public static final /* synthetic */ java.lang.String access$getDestinationType(androidx.navigation3.runtime.NavKey navKey) {
        if (navKey instanceof com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.ShoppingIABDestination) {
            return "iab";
        }
        if ((navKey instanceof com.paypal.oslo.core.webview.navigation.SecureWebViewDestination) || (navKey instanceof com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination)) {
            return "secureWebview";
        }
        return "native";
    }
}
