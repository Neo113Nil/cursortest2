package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "url", "extractCleanDomain", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABUiState;", "uiState", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingWebViewState;", "webViewState", "defaultToolbarPrefix", "generateToolbarTitle", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingIABUiState;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingWebViewState;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScreenUtilsKt {
    public static final java.lang.String generateToolbarTitle(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState shoppingWebViewState, java.lang.String str) {
        java.lang.String title;
        java.lang.String toolBarPrefix;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingIABUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingWebViewState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (shoppingIABUiState.getShowInterstitial()) {
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails interstitialDetails = shoppingIABUiState.getIabOfferDetails().getInterstitialDetails();
            if (interstitialDetails != null && (toolBarPrefix = interstitialDetails.getToolBarPrefix()) != null) {
                str = toolBarPrefix;
            }
            java.lang.String merchantDisplayName = shoppingIABUiState.getIabOfferDetails().getMerchantDisplayName();
            if (merchantDisplayName == null) {
                java.lang.String merchantName = shoppingIABUiState.getIabOfferDetails().getMerchantName();
                if (merchantName != null) {
                    str2 = merchantName;
                }
            } else {
                str2 = merchantDisplayName;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            return sb.toString();
        }
        if (shoppingWebViewState.getCurrentUrl().length() > 0) {
            java.lang.String merchantDisplayName2 = shoppingIABUiState.getIabOfferDetails().getMerchantDisplayName();
            if (merchantDisplayName2 != null || (merchantDisplayName2 = shoppingIABUiState.getIabOfferDetails().getMerchantName()) != null) {
                return merchantDisplayName2;
            }
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo toolBarInfo = shoppingIABUiState.getToolBarInfo();
            title = toolBarInfo != null ? toolBarInfo.getTitle() : null;
            return title == null ? "" : title;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabToolBarInfo toolBarInfo2 = shoppingIABUiState.getToolBarInfo();
        title = toolBarInfo2 != null ? toolBarInfo2.getTitle() : null;
        return title == null ? "" : title;
    }

    public static final java.lang.String extractCleanDomain(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            if (host != null) {
                return kotlin.text.StringsKt.removePrefix(host, (java.lang.CharSequence) "www.");
            }
            return null;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger logger = com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("url", str);
            java.lang.String message = e.getMessage();
            pairArr[1] = kotlin.TuplesKt.to("error", message != null ? message : "");
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(logger, "URL parsing failed for domain extraction", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }
}
