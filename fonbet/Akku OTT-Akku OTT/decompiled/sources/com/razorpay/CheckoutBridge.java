package com.razorpay;

import android.webkit.JavascriptInterface;

/* loaded from: classes4.dex */
class CheckoutBridge {
    private String integratedPlugin;
    CheckoutInteractor interactor;
    private boolean isRegistered = true;
    private int webViewType;

    public interface WebViewSafeCheckCallback {
        void secure();

        void unSecure();
    }

    public CheckoutBridge(CheckoutInteractor checkoutInteractor, int i) {
        this.interactor = checkoutInteractor;
        this.webViewType = i;
    }

    @JavascriptInterface
    public final void callNativeIntent(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "callNativeIntent(String)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.33
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.callNativeIntent(str, null);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "callNativeIntent(String)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void getDownloadFileString(final String str, final String str2, final String str3) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "getDownloadFileString", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.31
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.getDownloadFileString(str2, str, str3);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "getDownloadFileString", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final String getGPayFOPs(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "getGPayFOPs", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            final String[] strArr = {null};
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.22
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    strArr[0] = CheckoutBridge.this.interactor.getGPayFOPs(Double.valueOf(Double.parseDouble(str)));
                    AnalyticsUtil.trackEvent(AnalyticsEvent.GPAY_IN_A_BOX_GET_PAYMENT_FOPS_COMPLETED);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "getGPayFOPs", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return strArr[0];
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            return null;
        }
    }

    @JavascriptInterface
    public final void getPdfString(final String str, final String str2) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "getPdfString", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.19
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.getPdfString(str, str2);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "getPdfString", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final String getSdkPlugins() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "getSdkPlugins", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.17
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge checkoutBridge = CheckoutBridge.this;
                    checkoutBridge.integratedPlugin = checkoutBridge.interactor.getSdkPlugins();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "getSdkPlugins", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return this.integratedPlugin;
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            return null;
        }
    }

    @JavascriptInterface
    public void invokePopup(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "invokePopup", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            this.interactor.invokePopup(str);
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.12
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.invokePopup(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "invokePopup", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final boolean isUserRegistered(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "isUserRegistered", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.13
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge checkoutBridge = CheckoutBridge.this;
                    checkoutBridge.isRegistered = checkoutBridge.interactor.isUserRegistered(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "isUserRegistered", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return this.isRegistered;
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            return false;
        }
    }

    @JavascriptInterface
    public final boolean isUserRegisteredOnUPI(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "isUserRegisteredOnUPI", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.11
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge checkoutBridge = CheckoutBridge.this;
                    checkoutBridge.isRegistered = checkoutBridge.interactor.isUserRegisteredOnUPI(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "isUserRegisteredOnUPI", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return this.isRegistered;
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            return false;
        }
    }

    public void isWebViewSafe(WebViewSafeCheckCallback webViewSafeCheckCallback) {
        this.interactor.isWebViewSafe(this.webViewType, webViewSafeCheckCallback);
    }

    public void isWebViewSafeOnUI(WebViewSafeCheckCallback webViewSafeCheckCallback) {
        this.interactor.isWebViewSafeOnUI(this.webViewType, webViewSafeCheckCallback);
    }

    @JavascriptInterface
    public void onCheckoutBackPress() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "onCheckoutBackPress", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.23
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onCheckoutBackPress();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "onCheckoutBackPress", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void onCheckoutRendered() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "onCheckoutRendered", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.18
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onCheckoutRendered();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "onCheckoutRendered", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void oncomplete(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "oncomplete", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.5
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onComplete(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "oncomplete", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void ondismiss() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "ondismiss", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.7
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onDismiss();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "ondismiss", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void onerror(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "onerror", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.10
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onError(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "onerror", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void onfault(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "onfault", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.4
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onFault(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "onfault", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void onload() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "onload", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.1
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onLoad();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "onload", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void onmerchantevent(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.25
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void secure() {
                CheckoutBridge.this.interactor.onEvent(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void onrequestaction(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "onrequestaction", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.26
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onRequestAction(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "onrequestaction", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void onsubmit(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "onsubmit", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.3
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onSubmit(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "onsubmit", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void redirectToNfcSettings() {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.29
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void secure() {
                CheckoutBridge.this.interactor.redirectToNfcSettings();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void registerNfcScanner() {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.27
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void secure() {
                CheckoutBridge.this.interactor.triggerNfcCardScanner();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void registerSmsListener() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "registerSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.20
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.registerSmsListener();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "registerSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void relay(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "relay", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.14
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.sendDataToWebView(2, str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "relay", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void requestExtraAnalyticsData() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "requestExtraAnalyticsData", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.9
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.requestExtraAnalyticsData();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "requestExtraAnalyticsData", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void setAppToken(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "setAppToken", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            this.interactor.setAppToken(str);
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.30
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.setAppToken(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "setAppToken", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void setAttributes(String str) {
        this.interactor.setAttributes(str);
    }

    @JavascriptInterface
    public final void setDeviceToken(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "setDeviceToken", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.32
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.setDeviceToken(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "setDeviceToken", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void setDimensions(final int i, final int i2) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "setDimensions", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.6
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.setDimensions(i, i2);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "setDimensions", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void setMerchantOptions(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "setMerchantOptions", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.2
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.setMerchantOptions(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "setMerchantOptions", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void setPaymentID(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "setPaymentID", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.35
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.setPaymentID(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "setPaymentID", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void showAlertDialog(final String str, final String str2, final String str3) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "showAlertDialog", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.16
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.showAlertDialog(str, str2, str3);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "showAlertDialog", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void toast(final String str, final int i) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "toast", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.15
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.toast(str, i);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "toast", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void triggerPhoneNumberHintApi() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "triggerPhoneNumberHintApi", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_TRIGGERED);
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.24
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.triggerPhoneNumberHintApi();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "triggerPhoneNumberHintApi", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void unregisterNfcScanner() {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.28
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void secure() {
                CheckoutBridge.this.interactor.unregisterNfcScanner();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void unregisterSmsListener() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "unregisterSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.21
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.unregisterSmsListener();
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "unregisterSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void callNativeIntent(final String str, final String str2) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "callNativeIntent(String,String)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.34
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.callNativeIntent(str, str2);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "callNativeIntent(String,String)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @JavascriptInterface
    public final void ondismiss(final String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutBridge", "ondismiss(String)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.CheckoutBridge.8
                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void secure() {
                    CheckoutBridge.this.interactor.onDismiss(str);
                }

                @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
                public void unSecure() {
                }
            });
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutBridge", "ondismiss(String)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }
}
