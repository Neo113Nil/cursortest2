package com.razorpay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import com.razorpay.BaseCheckoutActivity;
import com.razorpay.CheckoutBridge;
import com.razorpay.CheckoutPresenterImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class _$o0O$_$O extends OO$_0o_ implements PluginCheckoutInteractor {
    private RzpPlugin extActiveRzpPluginInstance;
    private boolean isExtPluginFuncTriggered;
    private boolean isExtRzpPluginActive;
    private HashMap<String, String> pluginsMap;
    private final RzpInternalCallback rzpInternalCallback;

    public _$o0O$_$O(Activity activity, CheckoutPresenterImpl.CheckoutView checkoutView, HashMap<String, String> hashMap) {
        super(activity, checkoutView, hashMap);
        this.isExtRzpPluginActive = false;
        this.isExtPluginFuncTriggered = false;
        this.rzpInternalCallback = new RzpInternalCallback() { // from class: com.razorpay._$o0O$_$O.1
            /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[ADDED_TO_REGION] */
            @Override // com.razorpay.RzpInternalCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPaymentError(int i, String str) {
                char c;
                HashMap a = com.google.android.gms.ads.identifier.a.a("response", str);
                a.put("code", Integer.valueOf(i));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR, AnalyticsUtil.getJSONResponse(a));
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("provider")) {
                        String string = jSONObject.getString("provider");
                        int hashCode = string.hashCode();
                        if (hashCode == -1307457359) {
                            if (string.equals("GPAY_IN_A_BOX")) {
                                c = 2;
                                if (c != 0) {
                                }
                                _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        }
                        if (hashCode == -1048776318) {
                            if (string.equals("GOOGLE_PAY")) {
                                c = 0;
                                if (c != 0) {
                                }
                                _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        }
                        if (hashCode == 1839316877 && string.equals("UPI_TURBO")) {
                            c = 1;
                            if (c != 0 || c == 1 || c == 2) {
                                _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                            } else {
                                _$o0O$_$O.this.onComplete(jSONObject.toString());
                                return;
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                    }
                } catch (Exception unused) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR_EXCEPTION);
                    _$o0O$_$O.this.onComplete(str);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[ADDED_TO_REGION] */
            @Override // com.razorpay.RzpInternalCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPaymentSuccess(String str) {
                char c;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("provider")) {
                        String string = jSONObject.getString("provider");
                        int hashCode = string.hashCode();
                        if (hashCode == -1307457359) {
                            if (string.equals("GPAY_IN_A_BOX")) {
                                c = 2;
                                if (c != 0) {
                                }
                                _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        } else if (hashCode != -1048776318) {
                            if (hashCode == 1839316877 && string.equals("UPI_TURBO")) {
                                c = 1;
                                if (c != 0 || c == 1 || c == 2) {
                                    _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                                } else {
                                    _$o0O$_$O.this.onComplete(jSONObject.toString());
                                }
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        } else {
                            if (string.equals("GOOGLE_PAY")) {
                                c = 0;
                                if (c != 0) {
                                }
                                _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        }
                    }
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_SUCCESS, AnalyticsUtil.getJSONResponse(str));
                } catch (JSONException unused) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR);
                }
            }
        };
        this.pluginsMap = hashMap;
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void backPressed(Map map) {
        super.backPressed(map);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void callNativeIntent(String str, String str2) {
        super.callNativeIntent(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void checkSmsPermission() {
        super.checkSmsPermission();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void cleanUpOnDestroy() {
        super.cleanUpOnDestroy();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void destroyActivity(int i, String str) {
        super.destroyActivity(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void fetchCondfig() {
        super.fetchCondfig();
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public /* bridge */ /* synthetic */ void forwardEventToMerchant(String str) {
        super.forwardEventToMerchant(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ OoOo_ getCheckoutOptions() {
        return super.getCheckoutOptions();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void getDownloadFileString(String str, String str2, String str3) {
        super.getDownloadFileString(str, str2, str3);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ String getGPayFOPs(Double d) {
        return super.getGPayFOPs(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    @Override // com.razorpay.CheckoutPresenterImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject getOptionsForHandleMessage() {
        char c;
        _$o0O$_$O __o0o___o = this;
        JSONObject optionsForHandleMessage = super.getOptionsForHandleMessage();
        final JSONObject jSONObject = new JSONObject();
        try {
            boolean z = false;
            boolean z2 = false;
            for (final String str : __o0o___o.pluginsMap.keySet()) {
                final int length = str.length();
                final int i = 20;
                String substring = str.substring(20, length);
                int hashCode = substring.hashCode();
                if (hashCode == -1863410739) {
                    if (substring.equals("upi_turbo")) {
                        c = 2;
                        if (c != 0) {
                        }
                        __o0o___o = this;
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    __o0o___o = this;
                } else if (hashCode != 1474526159) {
                    if (hashCode == 2134877489 && substring.equals("googlepay_all")) {
                        c = 0;
                        if (c != 0) {
                            try {
                                if (Class.forName("com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient").newInstance() != null) {
                                    jSONObject.put("googlepay", true);
                                    z2 = true;
                                }
                            } catch (ClassNotFoundException unused) {
                                AnalyticsUtil.reportError(getClass().getName(), "S2", "GooglePay SDK is not included");
                            }
                        } else if (c == 1) {
                            jSONObject.put(str.substring(20, length), true);
                            z = true;
                        } else if (c != 2) {
                            jSONObject.put(str.substring(20, length), true);
                        } else if (!__o0o___o.isExtPluginFuncTriggered) {
                            __o0o___o.isExtPluginFuncTriggered = true;
                            JSONObject jSONObject2 = __o0o___o.integratedPluginsData;
                            if (jSONObject2.has("upiTurboData")) {
                                __o0o___o.isExtPluginFuncTriggered = false;
                                Object obj = jSONObject2.get("upiTurboData");
                                if (obj instanceof JSONArray) {
                                    jSONObject.put(str.substring(20, length), obj);
                                } else {
                                    jSONObject.put(str.substring(20, length), new JSONArray());
                                }
                            } else {
                                __o0o___o.upiTurbo.getLinkedUpiAccounts(new GenericPluginCallback() { // from class: com.razorpay._$o0O$_$O.3
                                    @Override // com.razorpay.GenericPluginCallback
                                    public void onError(@NonNull JSONObject jSONObject3) {
                                        try {
                                            _$o0O$_$O.this.isExtPluginFuncTriggered = false;
                                            jSONObject.put(str.substring(i, length), new JSONArray());
                                        } catch (JSONException unused2) {
                                        }
                                    }

                                    @Override // com.razorpay.GenericPluginCallback
                                    public void onSuccess(@NonNull Object obj2) {
                                        try {
                                            _$o0O$_$O.this.isExtPluginFuncTriggered = false;
                                            if (((JSONArray) obj2).length() == 0) {
                                                jSONObject.put(str.substring(i, length), new JSONArray());
                                            } else {
                                                jSONObject.put(str.substring(i, length), obj2);
                                            }
                                        } catch (JSONException unused2) {
                                        }
                                    }
                                }, null);
                            }
                        }
                        __o0o___o = this;
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    __o0o___o = this;
                } else {
                    if (substring.equals("googlepay")) {
                        c = 1;
                        if (c != 0) {
                        }
                        __o0o___o = this;
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    __o0o___o = this;
                }
            }
            if (z && z2) {
                optionsForHandleMessage.put("googlepay_wrapper_version", "both");
            } else if (z2) {
                optionsForHandleMessage.put("googlepay_wrapper_version", ExifInterface.GPS_MEASUREMENT_2D);
            }
            optionsForHandleMessage.put("external_sdks", jSONObject);
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getLocalizedMessage());
        }
        return optionsForHandleMessage;
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void getPdfString(String str, String str2) {
        super.getPdfString(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ String getProgressBarColor() {
        return super.getProgressBarColor();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ String getSdkPlugins() {
        return super.getSdkPlugins();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ List getWalletsWithAppToAppRedirection() {
        return super.getWalletsWithAppToAppRedirection();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void handleCardSaving() {
        super.handleCardSaving();
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public /* bridge */ /* synthetic */ void handleMerchantActivityResult(int i, Intent intent) {
        super.handleMerchantActivityResult(i, intent);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void invokePopup(String str) {
        super.invokePopup(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean isAllowRotation() {
        return super.isAllowRotation();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean isMagicPresent() {
        return super.isMagicPresent();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ boolean isUserRegistered(String str) {
        return super.isUserRegistered(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ boolean isUserRegisteredOnUPI(String str) {
        return super.isUserRegisteredOnUPI(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void isWebViewSafe(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        super.isWebViewSafe(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void isWebViewSafeOnUI(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        super.isWebViewSafeOnUI(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void loadFetchedForm(String str, String str2) {
        super.loadFetchedForm(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void loadForm(String str) {
        super.loadForm(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void onActivityResultReceived(int i, int i2, Intent intent) {
        if (this.isExtRzpPluginActive) {
            this.extActiveRzpPluginInstance.onActivityResult(this.merchantKey, i, i2, intent);
        } else {
            super.onActivityResultReceived(i, i2, intent);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onCheckoutBackPress() {
        super.onCheckoutBackPress();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onCheckoutRendered() {
        super.onCheckoutRendered();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onComplete(String str) {
        super.onComplete(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onDismiss() {
        super.onDismiss();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onError(String str) {
        super.onError(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onEvent(String str) {
        super.onEvent(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onFault(String str) {
        super.onFault(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onLoad() {
        super.onLoad();
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onPageFinished(int i, WebView webView, String str) {
        super.onPageFinished(i, webView, str);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onPageStarted(int i, WebView webView, String str) {
        super.onPageStarted(i, webView, str);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onProgressChanges(int i, int i2) {
        super.onProgressChanges(i, i2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onRequestAction(String str) {
        super.onRequestAction(str);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onResumeTriggered() {
        super.onResumeTriggered();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onSubmit(String str) {
        super.onSubmit(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void passPrefillToSegment() {
        super.passPrefillToSegment();
    }

    @Override // com.razorpay.PluginCheckoutInteractor
    public void processPayment(String str) {
        RzpPlugin rzpPlugin;
        HashMap<String, String> hashMap = this.pluginsMap;
        if (hashMap == null || hashMap.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_CALLING_PROCESS_PAYMENT, AnalyticsUtil.getJSONResponse(com.google.android.gms.ads.identifier.a.a("data", str)));
            if (this.pluginsMap.containsKey("com.razorpay.plugin.googlepay_all") && this.pluginsMap.containsValue("com.razorpay.plugin.googlepay")) {
                this.pluginsMap.remove("com.razorpay.plugin.googlepay");
            }
            for (String str2 : this.pluginsMap.values()) {
                try {
                    rzpPlugin = (RzpPlugin) RzpPlugin.class.getClassLoader().loadClass(str2).newInstance();
                } catch (ClassNotFoundException e) {
                    e = e;
                    AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                } catch (IllegalAccessException e2) {
                    e = e2;
                    AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                } catch (InstantiationException e3) {
                    e = e3;
                    AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                } catch (JSONException e4) {
                    e = e4;
                    AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                }
                if (rzpPlugin.doesHandlePayload(this.merchantKey, jSONObject, this.activity)) {
                    this.isExtRzpPluginActive = true;
                    this.extActiveRzpPluginInstance = rzpPlugin;
                    if (str2.equalsIgnoreCase("com.razorpay.RazorpayTurbo")) {
                        JSONObject asJson = this.checkoutOptions.getAsJson();
                        asJson.put("apiResponse", jSONObject.getJSONObject("data").getJSONObject("apiResponse"));
                        asJson.put("upiAccount", jSONObject.getJSONObject("data").getJSONObject("upiAccount"));
                        asJson.put("apiPayload", jSONObject.getJSONObject("data").getJSONObject("apiPayload"));
                        rzpPlugin.processPayment(this.merchantKey, asJson, this.activity, this.rzpInternalCallback);
                    } else {
                        rzpPlugin.processPayment(this.merchantKey, jSONObject, this.activity, this.rzpInternalCallback);
                    }
                    return;
                }
                continue;
            }
        } catch (JSONException unused) {
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_CALLING_PROCESS_PAYMENT_EXCEPTION, AnalyticsUtil.getJSONResponse(com.google.android.gms.ads.identifier.a.a("data", str)));
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void redirectToNfcSettings() {
        super.redirectToNfcSettings();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public /* bridge */ /* synthetic */ void registerSmsListener() {
        super.registerSmsListener();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void relay(String str) {
        super.relay(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void requestExtraAnalyticsData() {
        super.requestExtraAnalyticsData();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void requestOtpPermission() {
        super.requestOtpPermission();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void saveInstanceState(Bundle bundle) {
        super.saveInstanceState(bundle);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void sendDataToWebView(int i, String str) {
        super.sendDataToWebView(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void sendExternalSdkResponse(String str) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.SEND_EXTERNAL_SDK_RESPONSE);
        super.sendExternalSdkResponse(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void sendOtpPermissionCallback(boolean z) {
        super.sendOtpPermissionCallback(z);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setAppToken(String str) {
        super.setAppToken(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setAttributes(String str) {
        super.setAttributes(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setCheckoutLoadStartAt() {
        super.setCheckoutLoadStartAt();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setDeviceToken(String str) {
        super.setDeviceToken(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setDimensions(int i, int i2) {
        super.setDimensions(i, i2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setEventCallback(EventCallback eventCallback) {
        super.setEventCallback(eventCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setMerchantOptions(String str) {
        super.setMerchantOptions(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean setOptions(Bundle bundle, boolean z) {
        return super.setOptions(bundle, z);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setOptionsWithDynamicUrl(Context context, Bundle bundle, boolean z, BaseCheckoutActivity.SetOptionsCallback setOptionsCallback) {
        super.setOptionsWithDynamicUrl(context, bundle, z, setOptionsCallback);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setPaymentID(String str) {
        super.setPaymentID(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setSubscribedAnalyticsEvents(ArrayList arrayList) {
        super.setSubscribedAnalyticsEvents(arrayList);
    }

    @Override // com.razorpay.OO$_0o_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setUpAddOn() {
        super.setUpAddOn();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void showAlertDialog(String str, String str2, String str3) {
        super.showAlertDialog(str, str2, str3);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void showLoaderDialog(int i, String str) {
        super.showLoaderDialog(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void showRetryDialog(int i, String str) {
        super.showRetryDialog(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void toast(String str, int i) {
        super.toast(str, i);
    }

    @Override // com.razorpay.PluginCheckoutInteractor
    public void triggerExternalSdkFunc(String str) {
        HashMap<String, String> hashMap = this.pluginsMap;
        if (hashMap == null || hashMap.size() == 0) {
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("provider");
            if (string.hashCode() == 1839316877 && string.equals("UPI_TURBO") && jSONObject.getString("action").equalsIgnoreCase("LINK_NEW_ACCOUNT")) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.TRIGGER_EXTERNAL_SDK_FUNC_LINK_CALLED);
                this.upiTurbo.linkNewUpiAccountCheckout(jSONObject.getJSONObject("data").optString("color"), jSONObject.getJSONObject("data").optString("amountInDisplayFormat"), new GenericPluginCallback() { // from class: com.razorpay._$o0O$_$O.2
                    @Override // com.razorpay.GenericPluginCallback
                    public void onError(@NonNull JSONObject jSONObject2) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jSONObject2);
                            jSONObject.put("data", jSONObject3);
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }

                    @Override // com.razorpay.GenericPluginCallback
                    public void onSuccess(@NonNull Object obj) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("payload", obj);
                            jSONObject.put("data", jSONObject2);
                            _$o0O$_$O.this.sendExternalSdkResponse(jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void triggerNfcCardScanner() {
        super.triggerNfcCardScanner();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void triggerPhoneNumberHintApi() {
        super.triggerPhoneNumberHintApi();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void unregisterNfcScanner() {
        super.unregisterNfcScanner();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void unregisterReceivers() {
        super.unregisterReceivers();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void unregisterSmsListener() {
        super.unregisterSmsListener();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onDismiss(String str) {
        super.onDismiss(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public void onError(JSONObject jSONObject) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_ON_ERROR_CALLED, jSONObject);
        if (!this.isExtRzpPluginActive) {
            super.onError(jSONObject);
            return;
        }
        this.view.loadUrl(1, android.support.v4.media.b.b("javascript: window.onComplete(", jSONObject.toString(), ")"));
        this.isExtRzpPluginActive = false;
    }
}
