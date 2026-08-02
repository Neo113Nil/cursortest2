package com.razorpay;

import android.webkit.JavascriptInterface;
import com.razorpay.CheckoutBridge;

/* loaded from: classes4.dex */
public class __Oo_ extends CheckoutBridge {
    private final PluginCheckoutInteractor pluginCheckoutInteractor;

    public __Oo_(PluginCheckoutInteractor pluginCheckoutInteractor, int i) {
        super(pluginCheckoutInteractor, i);
        this.pluginCheckoutInteractor = pluginCheckoutInteractor;
    }

    @Override // com.razorpay.CheckoutBridge
    @JavascriptInterface
    public /* bridge */ /* synthetic */ void invokePopup(String str) {
        super.invokePopup(str);
    }

    @Override // com.razorpay.CheckoutBridge
    @JavascriptInterface
    public /* bridge */ /* synthetic */ void onCheckoutBackPress() {
        super.onCheckoutBackPress();
    }

    @JavascriptInterface
    public void processPayment(final String str) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_PROCESS_PAYMENT_CALLED, AnalyticsUtil.getJSONResponse(com.google.android.gms.ads.identifier.a.a("data", str)));
        super.isWebViewSafeOnUI(new CheckoutBridge.WebViewSafeCheckCallback() { // from class: com.razorpay.__Oo_.1
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void secure() {
                __Oo_.this.pluginCheckoutInteractor.processPayment(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public void triggerExternalSdkFunc(final String str) {
        super.isWebViewSafeOnUI(new CheckoutBridge.WebViewSafeCheckCallback() { // from class: com.razorpay.__Oo_.2
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void secure() {
                __Oo_.this.pluginCheckoutInteractor.triggerExternalSdkFunc(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void unSecure() {
            }
        });
    }
}
