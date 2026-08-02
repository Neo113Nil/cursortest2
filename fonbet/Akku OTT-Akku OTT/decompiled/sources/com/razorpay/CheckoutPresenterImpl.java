package com.razorpay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.razorpay.AnalyticsProperty;
import com.razorpay.BaseCheckoutActivity;
import com.razorpay.CheckoutBridge;
import com.razorpay.CheckoutNfcUtility;
import com.razorpay.CheckoutUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class CheckoutPresenterImpl implements CheckoutInteractor, CheckoutPresenter {
    protected Activity activity;
    private AutoReadOtpHelper autoReadOtpHelper;
    private Task<Void> automaticRetrievalTask;
    private long checkoutLoadStartAt;
    Queue<String> checkoutMessageQueue;
    OoOo_ checkoutOptions;
    private String checkoutUrl;
    private boolean clearHistory;
    private String dashOptions;
    private JSONObject dashOptionsJSON;
    private EventCallback eventCallback;
    private Boolean hideCircularLoader;
    JSONObject integratedPluginsData;
    private Boolean internalUpiApp;
    private boolean isCheckoutLoaded;
    private boolean isCheckoutLoadedEventFired;
    private boolean isCheckoutRenderedCompleteEventFired;
    private Boolean isTouchNGoPayment;
    private Task<Void> loginOtpSmsTask;
    String merchantKey;
    BroadcastReceiver otpAutoReadBroadcast;
    protected HashMap<String, String> pluginsMap;
    private long preloadAbortDuration;
    private long preloadCompleteDuration;
    private ArrayList<String> subscribedAnalyticsEvents;
    private boolean truecallerLoginAttempt;
    UpiTurboCheckout upiTurbo;
    private Task<Void> userConsentTask;
    protected CheckoutView view;
    private ArrayList<String> walletsWithAppToAppRedirection;
    private boolean isOnLoadTriggered = false;
    private String checkoutContent = "{}";
    private int paymentAttempts = 0;
    private boolean isPaymentSuccessful = false;
    private boolean isSmsReceiverRegistered = false;
    private boolean isTwoWebViewFlow = false;
    private boolean isMagic = false;
    private int merchantLogoResourceId = 0;
    private boolean isActivityCreated = false;
    private boolean sendSmsHash = false;
    private boolean allowRotation = false;
    private String sanitizedChallanEncodedString = "";
    private boolean isDynamicUrlLoaded = false;
    private String payment_id = null;
    private oooOOoO$0 magicBase = null;
    private boolean nameNotFound_retryStatus = false;

    /* renamed from: com.razorpay.CheckoutPresenterImpl$18, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass18 {
        static final /* synthetic */ int[] $SwitchMap$com$razorpay$PhoneNumberHintHelper$PhoneNumberHintResponseStates;

        static {
            int[] iArr = new int[o_$O$0$$$O$$$__o0Oo.values().length];
            $SwitchMap$com$razorpay$PhoneNumberHintHelper$PhoneNumberHintResponseStates = iArr;
            try {
                iArr[o_$O$0$$$O$$$__o0Oo.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$razorpay$PhoneNumberHintHelper$PhoneNumberHintResponseStates[o_$O$0$$$O$$$__o0Oo.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$razorpay$PhoneNumberHintHelper$PhoneNumberHintResponseStates[o_$O$0$$$O$$$__o0Oo.FAILED_TO_FETCH_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$razorpay$PhoneNumberHintHelper$PhoneNumberHintResponseStates[o_$O$0$$$O$$$__o0Oo.USER_DECLINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface CheckoutView {
        void addJavascriptInterfaceToPrimaryWebview(Object obj, String str);

        void checkSmsPermission();

        void clearWebViewHistory(int i);

        void destroy(int i, String str);

        WebView getWebView(int i);

        void hideProgressBar();

        boolean isWebViewVisible(int i);

        void loadData(int i, String str, String str2, String str3);

        void loadDataWithBaseURL(int i, String str, String str2, String str3, String str4, String str5);

        void loadUrl(int i, String str);

        void makeWebViewVisible(int i);

        void showProgressBar(int i);

        void showToast(String str, int i);
    }

    public CheckoutPresenterImpl(Activity activity, CheckoutView checkoutView) {
        Boolean bool = Boolean.FALSE;
        this.internalUpiApp = bool;
        this.hideCircularLoader = bool;
        this.isTouchNGoPayment = bool;
        this.otpAutoReadBroadcast = new BroadcastReceiver() { // from class: com.razorpay.CheckoutPresenterImpl.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_RECEIVED_SMS);
                    int i = status.a;
                    if (i != 0) {
                        if (i != 15) {
                            return;
                        }
                        AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_TIMEOUT);
                        return;
                    }
                    Intent intent2 = (Intent) extras.get("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                    if (intent2 == null) {
                        String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                        Intent intent3 = new Intent();
                        intent3.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", str);
                        CheckoutPresenterImpl.this.onActivityResultReceived(1001, -1, intent3);
                        return;
                    }
                    ComponentName callingActivity = CheckoutPresenterImpl.this.activity.getCallingActivity();
                    if (callingActivity != null && callingActivity.getPackageName().equals(CheckoutPresenterImpl.this.activity.getPackageName()) && CheckoutPresenterImpl.this.activity.getLocalClassName().contains("CheckoutActivity")) {
                        try {
                            CheckoutPresenterImpl.this.activity.startActivityForResult(intent2, 1001);
                            AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_SHOWED_ONE_TIME_CONSENT);
                        } catch (ActivityNotFoundException e) {
                            AnalyticsUtil.reportError("AutoReadOtpHelper", "S0", e.getLocalizedMessage());
                        }
                    }
                }
            }
        };
        this.checkoutMessageQueue = new LinkedList();
        this.isCheckoutLoaded = false;
        this.isCheckoutLoadedEventFired = false;
        this.isCheckoutRenderedCompleteEventFired = false;
        this.integratedPluginsData = new JSONObject();
        this.truecallerLoginAttempt = false;
        this.activity = activity;
        this.view = checkoutView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllPlugins() {
        HashMap<String, String> hashMap = this.pluginsMap;
        if (hashMap == null || this.upiTurbo == null || !hashMap.containsKey("com.razorpay.plugin.upi_turbo")) {
            return;
        }
        this.upiTurbo.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeWebViewCallback(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        CheckoutView checkoutView;
        int i2 = 1;
        if (i == 1) {
            checkoutView = this.view;
        } else {
            checkoutView = this.view;
            i2 = 2;
        }
        try {
            String host = new URL(checkoutView.getWebView(i2).getTag().toString()).getHost();
            if (host == null || (!host.endsWith("razorpay.com") && !host.endsWith("razorpay.in") && !this.isDynamicUrlLoaded)) {
                webViewSafeCheckCallback.unSecure();
                return;
            }
            webViewSafeCheckCallback.secure();
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
            webViewSafeCheckCallback.unSecure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getHandleMessageFormattedString() {
        return android.support.v4.media.b.b("javascript: handleMessage(", getOptionsForHandleMessage().toString(), ")");
    }

    private JSONObject getSdkObject() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("framework", AnalyticsUtil.getFramework());
        jSONObject.put("type", _Oo_O_$.SDK_TYPE);
        jSONObject.put("name", _Oo_O_$.SDK_TYPE + "_android_" + AnalyticsUtil.getFramework());
        jSONObject.put("version", com.razorpay.a.a.O$$$__o0Oo.VERSION_NAME);
        jSONObject.put("platform", "android");
        String callingPackage = this.activity.getCallingPackage();
        if (callingPackage == null) {
            callingPackage = this.activity.getPackageName();
            str = "getPackageName";
        } else {
            str = "getCallingPackage";
        }
        if (callingPackage == null) {
            callingPackage = this.activity.getApplicationContext().getPackageName();
            str = "getApplicationContext.getPackageName";
        }
        if (callingPackage == null) {
            callingPackage = this.activity.getApplication().getPackageName();
            str = "getApplication.getPackageName";
        }
        if (callingPackage == null) {
            str = "null";
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("function_name", str);
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PACKAGE_NAME_FUNC_USED, jSONObject2);
        jSONObject.put("package_name", callingPackage);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRetry(String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "handleRetry", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (CheckoutUtils.shouldRetryPayment(this.paymentAttempts)) {
                try {
                    if (str != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("attempt_count", Integer.valueOf(this.paymentAttempts));
                        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PAYMENT_RETRY, AnalyticsUtil.getJSONResponse(hashMap));
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(this.checkoutUrl.contains("?") ? "&" : "?");
                            str = sb.toString();
                            if (jSONObject.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR) instanceof JSONObject) {
                                str = str + "error=" + ((JSONObject) jSONObject.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR)).toString();
                            }
                        }
                        helpersReset();
                        loadForm(str);
                    } else {
                        destroyActivity(0, "");
                    }
                } catch (Exception e) {
                    destroyActivity(0, "");
                    AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
                }
            } else {
                destroyActivity(0, str);
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "handleRetry", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e2) {
            AnalyticsUtil.reportCaughtException(e2);
        }
    }

    private void loadResultToWebView(JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("result", jSONObject);
        AnalyticsUtil.trackEvent(AnalyticsEvent.NATIVE_INTENT_ONACTIVITY_RESULT, AnalyticsUtil.getJSONResponse(hashMap));
        if (this.isCheckoutLoaded) {
            this.view.loadUrl(1, str);
            return;
        }
        if (this.checkoutMessageQueue == null) {
            this.checkoutMessageQueue = new LinkedList();
        }
        this.checkoutMessageQueue.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void markPaymentCancelled() {
        if (this.payment_id == null || this.isPaymentSuccessful) {
            return;
        }
        try {
            String constructBasicAuth = BaseUtils.constructBasicAuth(this.merchantKey);
            HashMap hashMap = new HashMap();
            hashMap.put(RtspHeaders.AUTHORIZATION, "Basic " + constructBasicAuth);
            String str = "https://api.razorpay.com/v1/payments/" + this.payment_id + "/cancel?platform=android_sdk";
            Logger.d("Sending cancel request");
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PAYMENT_CANCEL_API_CALLED);
            Owl.get(str, hashMap, new Callback() { // from class: com.razorpay.CheckoutPresenterImpl.4
                @Override // com.razorpay.Callback
                public void run(ResponseObject responseObject) {
                    Logger.d("API Cancel hit: " + responseObject.getResponseResult());
                }
            });
            this.payment_id = null;
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
            Logger.d("Exception in cancel req", e);
        }
    }

    private void saveImageToGallery(String str, String str2, String str3) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str + "." + str3);
            contentValues.put("mime_type", BaseUtils.getType(str3));
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                contentValues.put("is_pending", (Integer) 1);
                contentValues.put("relative_path", "DCIM");
            }
            Uri insert = this.activity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (insert != null) {
                OutputStream openOutputStream = this.activity.getContentResolver().openOutputStream(insert);
                if (openOutputStream != null) {
                    try {
                        openOutputStream.write(decode);
                        openOutputStream.flush();
                    } finally {
                    }
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                if (i >= 29) {
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    this.activity.getContentResolver().update(insert, contentValues, null, null);
                }
                this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.21
                    @Override // java.lang.Runnable
                    public void run() {
                        Toast.makeText(CheckoutPresenterImpl.this.activity, "Image saved to gallery", 0).show();
                    }
                });
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", "Failed to save image: " + e.getMessage());
            Logger.d("Failed to save image to gallery: " + e.getMessage());
        }
    }

    private void savePrefillData(JSONObject jSONObject) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "savePrefillData", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (jSONObject.has("contact")) {
                CheckoutUtils.setUserContact(this.activity, jSONObject.getString("contact"));
                this.checkoutOptions.putPrefill("contact", jSONObject.getString("contact"));
            }
            if (jSONObject.has("email")) {
                CheckoutUtils.setUserEmail(this.activity, jSONObject.getString("email"));
                this.checkoutOptions.putPrefill("email", jSONObject.getString("email"));
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "savePrefillData", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            Logger.e("Error parsing JSON", e);
        }
    }

    private void sendErrorResultToWeb() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("actionResult", "CANCELLED");
            injectJs(String.format("onActionResult(%s)", jSONObject));
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    private void sendQueuedMessagesToCheckout() {
        Queue<String> queue = this.checkoutMessageQueue;
        if (queue == null || queue.isEmpty()) {
            return;
        }
        Iterator<String> it = this.checkoutMessageQueue.iterator();
        while (it.hasNext()) {
            this.view.loadUrl(1, it.next());
        }
        this.checkoutMessageQueue.clear();
    }

    private void setupExternalPlugins(HashMap<String, String> hashMap) {
        this.integratedPluginsData = new JSONObject();
        if (hashMap == null || !hashMap.containsKey("com.razorpay.plugin.upi_turbo")) {
            return;
        }
        try {
            JSONObject asJson = this.checkoutOptions.getAsJson();
            if (asJson.has("prefill") && asJson.getJSONObject("prefill").has("contact")) {
                this.integratedPluginsData.put("upi_turbo", true);
                CheckoutUtils.showLoader(this.activity);
                if (asJson.has("order_id")) {
                    this.upiTurbo = new UpiTurboCheckout(this.activity, asJson.getJSONObject("prefill").getString("contact"), this.checkoutOptions.getColor(), asJson.getString("order_id"));
                } else {
                    this.upiTurbo = new UpiTurboCheckout(this.activity, asJson.getJSONObject("prefill").getString("contact"), this.checkoutOptions.getColor(), null);
                }
                this.upiTurbo.getLinkedUpiAccounts(new GenericPluginCallback() { // from class: com.razorpay.CheckoutPresenterImpl.19
                    @Override // com.razorpay.GenericPluginCallback
                    public void onError(@NonNull JSONObject jSONObject) {
                        try {
                            CheckoutPresenterImpl.this.integratedPluginsData.remove("upi_turbo");
                            CheckoutPresenterImpl.this.integratedPluginsData.put("upiTurboData", jSONObject);
                            CheckoutPresenterImpl.this.onLoad();
                        } catch (JSONException unused) {
                        }
                    }

                    @Override // com.razorpay.GenericPluginCallback
                    public void onSuccess(@NonNull Object obj) {
                        try {
                            CheckoutPresenterImpl.this.integratedPluginsData.remove("upi_turbo");
                            CheckoutPresenterImpl.this.integratedPluginsData.put("upiTurboData", obj);
                            CheckoutPresenterImpl.this.onLoad();
                        } catch (JSONException unused) {
                        }
                    }
                }, null);
            }
        } catch (JSONException unused) {
            this.integratedPluginsData.remove("upi_turbo");
            onLoad();
        }
    }

    private void startSmsRetrievers() {
        this.automaticRetrievalTask = new zzab(this.activity).startSmsRetriever();
        this.userConsentTask = new zzab(this.activity).startSmsUserConsent(null);
    }

    public void addAnalyticsData(JSONObject jSONObject) {
        AnalyticsUtil.addFilteredPropertiesFromPayload(jSONObject);
    }

    public void addOnFlowEnd() {
        oooOOoO$0 ooooooo_0 = this.magicBase;
        if (ooooooo_0 != null) {
            ooooooo_0.paymentFlowEnd();
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void backPressed(final Map<String, Object> map) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_HARD_BACK_PRESSED, AnalyticsUtil.getJSONResponse(map));
        if (CheckoutUtils.isCheckoutUrl(this.view.getWebView(1)) && !this.view.isWebViewVisible(2)) {
            this.view.loadUrl(1, "javascript: window.backPressed ? window.backPressed('onCheckoutBackPress') : CheckoutBridge.onCheckoutBackPress();");
            map.put("in_checkout", CredentialEntry.TRUE_STRING);
        } else if (_Oo_O_$.getInstance().isBackButtonAlertEnabled()) {
            CheckoutUtils.showDialog(this.activity, _Oo_O_$.getInstance().getBackButtonAlertMessage(), _Oo_O_$.getInstance().getBackButtonPositiveText(), _Oo_O_$.getInstance().getBackButtonNegativeText(), new CheckoutUtils.BackButtonDialogCallback() { // from class: com.razorpay.CheckoutPresenterImpl.5
                @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
                public void onNegativeButtonClick() {
                    Logger.d("ALERT Cancel");
                    AnalyticsUtil.trackEvent(AnalyticsEvent.ALERT_PAYMENT_CANCELLED, AnalyticsUtil.getJSONResponse((Map<String, Object>) map));
                    if (CheckoutPresenterImpl.this.isTwoWebViewFlow) {
                        CheckoutPresenterImpl.this.view.makeWebViewVisible(1);
                        CheckoutPresenterImpl.this.view.loadUrl(2, "about:blank");
                        CheckoutPresenterImpl.this.view.loadUrl(1, "javascript: window.onpaymentcancel()");
                    } else {
                        CheckoutPresenterImpl.this.handleRetry(null);
                        CheckoutPresenterImpl.this.markPaymentCancelled();
                    }
                    CheckoutPresenterImpl.this.clearAllPlugins();
                    CheckoutPresenterImpl.this.isTwoWebViewFlow = false;
                }

                @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
                public void onPositiveButtonClick() {
                    Logger.d("ALERT Don't cancel");
                    AnalyticsUtil.trackEvent(AnalyticsEvent.ALERT_PAYMENT_CONTINUE, AnalyticsUtil.getJSONResponse((Map<String, Object>) map));
                }
            });
        } else {
            destroyActivity(0, "BackPressed");
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void callNativeIntent(String str, String str2) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "callNativeIntent", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            MonitoringUtil.setCheckoutStage("payment_handover");
            if (str.contains("truecallersdk://truesdk")) {
                this.truecallerLoginAttempt = true;
            }
            BaseUtils.startActivityForResult(str, str2, this.activity);
            if (str2 != null) {
                ((BaseCheckoutActivity) this.activity).setLifecycleContext(LifecycleContext.REDIRECTING_TO_APP, str2);
            } else {
                try {
                    ((BaseCheckoutActivity) this.activity).setLifecycleContext(LifecycleContext.REDIRECTING_USING_SCHEME, str.split(":")[0]);
                } catch (Exception unused) {
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            if (str2 == null) {
                str2 = "null";
            }
            hashMap.put("package_name", str2);
            AnalyticsUtil.trackEvent(AnalyticsEvent.NATIVE_INTENT_CALLED, AnalyticsUtil.getJSONResponse(hashMap));
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "callNativeIntent", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void checkSmsPermission() {
        this.view.checkSmsPermission();
    }

    @Override // com.razorpay.CheckoutPresenter
    public void cleanUpOnDestroy() {
        try {
            markPaymentCancelled();
            clearAllPlugins();
            unregisterReceivers();
            RazorpayExceptionHandler.unregister();
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void destroyActivity(int i, String str) {
        String valueOf = String.valueOf(i);
        AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.ORDER;
        AnalyticsUtil.addProperty("destroy_resultCode", new AnalyticsProperty(valueOf, scope));
        AnalyticsUtil.addProperty("destroy_result", new AnalyticsProperty(str, scope));
        AnalyticsUtil.trackEvent(AnalyticsEvent.INTERNAL_DESTROY_METHOD_CALLED);
        cleanUpOnDestroy();
        this.view.destroy(i, str);
    }

    public void enableAddon(JSONObject jSONObject) {
        try {
            if (jSONObject.has("magic")) {
                boolean z = jSONObject.getBoolean("magic");
                this.isMagic = z;
                oooOOoO$0 ooooooo_0 = this.magicBase;
                if (ooooooo_0 != null) {
                    ooooooo_0.setMagicEnabled(z);
                }
                AnalyticsUtil.addProperty("is_magic", new AnalyticsProperty(this.isMagic, AnalyticsProperty.Scope.PAYMENT));
            }
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
        }
    }

    public void enableCheckoutLoaded() {
        this.isCheckoutLoaded = true;
    }

    public void enableTwoViewFlow() {
        this.isTwoWebViewFlow = true;
    }

    @Override // com.razorpay.CheckoutPresenter
    public void fetchCondfig() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "fetchCondfig", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            _Oo_O_$.IS_MAGIC_ENABLED = isMagicPresent();
            _Oo_O_$.fetchConfig(this.activity, this.merchantKey);
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "fetchCondfig", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    public void forwardEventToMerchant(String str) {
        Activity activity;
        EventCallback eventCallback = this.eventCallback;
        if (eventCallback == null) {
            eventCallback = Checkout.getEventCallback();
        }
        if (eventCallback == null || (activity = this.activity) == null || activity.isFinishing()) {
            return;
        }
        try {
            eventCallback.onEvent(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError("CheckoutPresenterImpl", "S2", "Event callback error: " + e.getMessage());
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public OoOo_ getCheckoutOptions() {
        return this.checkoutOptions;
    }

    @Override // com.razorpay.CheckoutInteractor
    public void getDownloadFileString(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (str2.contains("base64,")) {
            try {
                this.sanitizedChallanEncodedString = str2.split("base64,")[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                AnalyticsUtil.reportError("CheckoutPresenterImpl", "S0", "getDownloadFileString: " + e.getMessage());
                return;
            }
        } else {
            this.sanitizedChallanEncodedString = str2;
        }
        String type = BaseUtils.getType(str3);
        if (type.startsWith("image/")) {
            saveImageToGallery(str, this.sanitizedChallanEncodedString, str3);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType(type);
            intent.putExtra("android.intent.extra.TITLE", str);
            this.activity.startActivityForResult(intent, 78);
        } catch (ActivityNotFoundException unused) {
            Logger.d("No app found to handle file saving");
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public String getGPayFOPs(Double d) {
        Iterator<Map.Entry<String, String>> it = this.pluginsMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (key != null && key.toLowerCase().contains("gpay_in_a_box")) {
                try {
                    RzpPlugin rzpPlugin = (RzpPlugin) RzpPlugin.class.getClassLoader().loadClass(next.getValue()).getDeclaredConstructor(null).newInstance(null);
                    if (rzpPlugin instanceof RzpGPayInABoxExternalPlugin) {
                        return ((RzpGPayInABoxExternalPlugin) rzpPlugin).getPaymentMethods(this.activity, d.doubleValue());
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public JSONObject getOptionsForHandleMessage() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("options", this.checkoutOptions.getAsJson());
            jSONObject.put("data", this.checkoutContent);
            jSONObject.put("id", AnalyticsUtil.getLocalOrderId());
            boolean z = true;
            jSONObject.put("pdf_download_supported", true);
            jSONObject.put("file_download_supported", true);
            jSONObject.put("key_id", this.merchantKey);
            jSONObject.put("externalSDKs", new JSONObject());
            if (this.checkoutOptions.shouldSendHashForSms()) {
                jSONObject.put("sms_hash", new AppSignatureHelper(this.activity).getAppSignatures().get(0));
            }
            jSONObject.put("upi_intents_data", CheckoutUtils.getUpiIntentsDataInJsonArray(this.activity));
            jSONObject.put("uri_data", CheckoutUtils.getAppIntentDataInJsonArray(this.activity));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("openedAt", System.currentTimeMillis());
            jSONObject.put("metadata", jSONObject2);
            jSONObject.put("sdk", getSdkObject());
            String deviceToken = _$O0_o.getDeviceToken(this.activity.getApplicationContext());
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject.put("device_token", deviceToken);
            }
            jSONObject.put("sdk_popup", true);
            jSONObject.put("magic", true);
            jSONObject.put("network_type", BaseUtils.getNetworkType(this.activity));
            jSONObject.put("activity_recreated", this.isActivityCreated);
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.activity);
            jSONObject.put("nfc_supported", defaultAdapter != null);
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                z = false;
            }
            jSONObject.put("nfc_enabled", z);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("country_code");
            jSONObject.put("request_attributes", jSONArray);
            ArrayList<String> arrayList = this.subscribedAnalyticsEvents;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it = this.subscribedAnalyticsEvents.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next());
                }
                jSONObject.put("merchant_events", jSONArray2);
            }
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
            return jSONObject;
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void getPdfString(String str, String str2) {
        if (TextUtils.isEmpty(str2) || !str2.contains("base64,")) {
            return;
        }
        this.sanitizedChallanEncodedString = str2.split("base64,")[1];
        try {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("application/pdf");
            intent.putExtra("android.intent.extra.TITLE", str);
            this.activity.startActivityForResult(intent, 77);
        } catch (ActivityNotFoundException unused) {
            Logger.d("No app found to handle PDF saving");
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public String getProgressBarColor() {
        JSONObject jSONObject;
        String str = null;
        try {
            if (this.checkoutOptions.getAsJson() == null) {
                throw new Exception("No options defined");
            }
            String string = this.checkoutOptions.getAsJson().getJSONObject("theme").getString("color");
            Color.parseColor(string);
            return string;
        } catch (Exception e) {
            try {
                jSONObject = this.dashOptionsJSON;
            } catch (Exception e2) {
                AnalyticsUtil.reportError("CxPsntrImpl", "S2", e2.getMessage());
            }
            if (jSONObject == null) {
                throw new Exception("No dash options defined");
            }
            str = jSONObject.getJSONObject("theme").getString("color");
            Color.parseColor(str);
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getMessage());
            return str;
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public String getSdkPlugins() {
        HashMap<String, String> allPluginsFromManifest = BaseUtils.getAllPluginsFromManifest(this.activity);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAmazonPluginIntegrated", false);
            jSONObject.put("isGooglePayPluginIntegrated", false);
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
        }
        if (allPluginsFromManifest != null && allPluginsFromManifest.size() != 0) {
            for (String str : allPluginsFromManifest.values()) {
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RazorpayAmazon")) {
                    jSONObject.put("isAmazonPluginIntegrated", true);
                }
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RzpGpayMerged")) {
                    jSONObject.put("isGooglePayPluginIntegrated", true);
                }
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RazorpayTurbo")) {
                    jSONObject.put("isTurboPluginIntegrated", true);
                }
            }
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    @Override // com.razorpay.CheckoutPresenter
    public List<String> getWalletsWithAppToAppRedirection() {
        return this.walletsWithAppToAppRedirection;
    }

    @Override // com.razorpay.CheckoutPresenter
    public void handleCardSaving() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "handleCardSaving", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            AnalyticsUtil.trackEvent(AnalyticsEvent.CARD_SAVING_START);
            _$O0_o.fetchDeviceTokenFromOtherAppsIfRequired(this.activity.getApplicationContext());
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "handleCardSaving", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    public void handleMerchantActivityResult(int i, Intent intent) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "handleMerchantActivityResult", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            JSONObject jSONObject = new JSONObject();
            if (i != -1 || intent == null) {
                jSONObject.put("actionResult", "CANCELLED");
            } else {
                String stringExtra = intent.getStringExtra("actionResult");
                jSONObject.put("actionResult", stringExtra != null ? stringExtra : "CANCELLED");
            }
            injectJs(String.format("onActionResult(%s)", jSONObject));
            HashMap hashMap = new HashMap();
            hashMap.put("result", jSONObject);
            AnalyticsUtil.trackEvent(AnalyticsEvent.MERCHANT_ACTIVITY_RESULT_RECEIVED, AnalyticsUtil.getJSONResponse(hashMap));
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "handleMerchantActivityResult", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    public void helpersReset() {
        Logger.d("helpersReset called");
    }

    public void injectJs(String str) {
        this.view.loadUrl(1, defpackage.g.a("javascript: ", str));
    }

    @Override // com.razorpay.CheckoutInteractor
    public void invokePopup(final String str) {
        this.isTwoWebViewFlow = true;
        try {
            this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        CheckoutPresenterImpl.this.enableAddon(jSONObject);
                        if (jSONObject.has(FirebaseAnalytics.Param.CONTENT)) {
                            CheckoutPresenterImpl.this.view.loadDataWithBaseURL(2, "about:blank", jSONObject.getString(FirebaseAnalytics.Param.CONTENT), "text/html", "UTF-8", null);
                        }
                        if (jSONObject.has("url")) {
                            CheckoutPresenterImpl.this.view.loadUrl(2, jSONObject.getString("url"));
                        }
                        if (!jSONObject.has("focus") || jSONObject.getBoolean("focus")) {
                            CheckoutPresenterImpl.this.view.makeWebViewVisible(2);
                        } else {
                            CheckoutPresenterImpl.this.view.makeWebViewVisible(1);
                        }
                    } catch (Exception e) {
                        AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
                    }
                    AnalyticsUtil.addProperty("two_webview_flow", new AnalyticsProperty(true, AnalyticsProperty.Scope.PAYMENT));
                }
            });
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public boolean isAllowRotation() {
        return this.allowRotation;
    }

    @Override // com.razorpay.CheckoutPresenter
    public boolean isMagicPresent() {
        return false;
    }

    @Override // com.razorpay.CheckoutInteractor
    public boolean isUserRegistered(String str) {
        return BaseUtils.checkGpayCardsUpiRegistered(this.activity, str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public boolean isUserRegisteredOnUPI(String str) {
        return BaseUtils.checkUpiRegisteredApp(this.activity, str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void isWebViewSafe(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        executeWebViewCallback(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void isWebViewSafeOnUI(final int i, final CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.16
            @Override // java.lang.Runnable
            public void run() {
                CheckoutPresenterImpl.this.executeWebViewCallback(i, webViewSafeCheckCallback);
            }
        });
    }

    @Override // com.razorpay.CheckoutPresenter
    public void loadFetchedForm(String str, String str2) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "loadFetchedForm", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (this.paymentAttempts != 0) {
                AnalyticsUtil.postData();
            }
            int i = this.paymentAttempts + 1;
            this.paymentAttempts = i;
            AnalyticsUtil.addProperty("payment_attempt", new AnalyticsProperty(i, AnalyticsProperty.Scope.ORDER));
            this.clearHistory = true;
            this.view.loadDataWithBaseURL(1, str, str2, "text/html", "UTF-8", null);
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "loadFetchedForm", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void loadForm(String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "loadForm", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (this.paymentAttempts != 0) {
                AnalyticsUtil.postData();
            }
            int i = this.paymentAttempts + 1;
            this.paymentAttempts = i;
            AnalyticsUtil.addProperty("payment_attempt", new AnalyticsProperty(i, AnalyticsProperty.Scope.ORDER));
            this.clearHistory = true;
            this.view.loadUrl(1, (this.checkoutUrl + str).replace(" ", "%20"));
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "loadForm", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onActivityResultReceived(int i, int i2, Intent intent) {
        OutputStream openOutputStream;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "onActivityResultReceived", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (i == 77 && i2 == -1) {
                if (intent != null && intent.getData() != null) {
                    Uri data = intent.getData();
                    String str = this.sanitizedChallanEncodedString;
                    try {
                        openOutputStream = this.activity.getContentResolver().openOutputStream(data);
                        if (openOutputStream != null) {
                            try {
                                openOutputStream.write(Base64.decode(str, 0));
                                openOutputStream.flush();
                                BaseUtils.openPdfFile(this.activity, data);
                            } finally {
                            }
                        }
                        if (openOutputStream != null) {
                            openOutputStream.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onActivityResultReceived", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                return;
            }
            if (i == 78 && i2 == -1) {
                if (intent != null && intent.getData() != null) {
                    Uri data2 = intent.getData();
                    String str2 = this.sanitizedChallanEncodedString;
                    try {
                        openOutputStream = this.activity.getContentResolver().openOutputStream(data2);
                        if (openOutputStream != null) {
                            try {
                                openOutputStream.write(Base64.decode(str2, 0));
                                openOutputStream.flush();
                                BaseUtils.openFile(this.activity, data2);
                            } finally {
                            }
                        }
                        if (openOutputStream != null) {
                            openOutputStream.close();
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onActivityResultReceived", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                return;
            }
            if (i == 1001) {
                if (i2 == -1) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_RECEIVED_SMS);
                    String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                    if (this.isCheckoutLoaded) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sender", "razorpay");
                            jSONObject.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, stringExtra);
                            jSONObject.toString();
                            injectJs("OTPElf.showOTP('" + stringExtra + "','razorpay')");
                            AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_OTP_POPULATION_JS);
                        } catch (JSONException e3) {
                            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e3.getLocalizedMessage());
                            e3.printStackTrace();
                        }
                    }
                } else {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_CONSENT_DECLINED);
                }
                Task<Void> task = this.userConsentTask;
                if (task != null && !task.isSuccessful()) {
                    startSmsRetrievers();
                }
                AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onActivityResultReceived", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                return;
            }
            if (i == 98003) {
                handleMerchantActivityResult(i2, intent);
            } else if (i == 99) {
                JSONObject jSONFromIntentData = BaseUtils.getJSONFromIntentData(intent);
                if (jSONFromIntentData.toString().contains("\"from\":\"razorpay\"") && AnalyticsUtil.getKeyType().equalsIgnoreCase("test") && this.internalUpiApp.booleanValue()) {
                    destroyActivity(0, "");
                    return;
                }
                loadResultToWebView(jSONFromIntentData, "javascript: upiIntentResponse(" + jSONFromIntentData.toString() + ")");
            } else if (i == 102) {
                o_$O$0$$$_$O0_o onActivityResultReceived = PhoneNumberHintHelper.INSTANCE.onActivityResultReceived(this.activity, i2, intent);
                int i3 = AnonymousClass18.$SwitchMap$com$razorpay$PhoneNumberHintHelper$PhoneNumberHintResponseStates[onActivityResultReceived.getState().ordinal()];
                if (i3 == 1) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_RESULT_SUCCESS);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("provider", "PHONE_NUMBER_HINT");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("contact", onActivityResultReceived.getContact());
                    jSONObject2.put("data", jSONObject3);
                    injectJs("window.externalSDKResponse(" + jSONObject2.toString() + ")");
                } else if (i3 == 2) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_RESULT_ERROR);
                } else if (i3 == 3) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_RESULT_FAILED_TO_FETCH_NUMBER);
                } else if (i3 == 4) {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.PHONE_NUMBER_HINT_RESULT_USER_DECLINED);
                }
            } else if (i == 20) {
                try {
                    JSONObject jSONObject4 = new JSONObject("{'data':" + i2 + "}");
                    jSONObject4.put("provider", "CRED");
                    loadResultToWebView(jSONObject4, "javascript:externalAppResponse(" + jSONObject4.toString() + ")");
                } catch (JSONException e4) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S0", e4.getMessage());
                }
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onActivityResultReceived", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return;
        } catch (Exception e5) {
            AnalyticsUtil.reportCaughtException(e5);
        }
        AnalyticsUtil.reportCaughtException(e5);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onCheckoutBackPress() {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_SOFT_BACK_PRESSED);
        destroyActivity(0, "" + BaseUtils.getPaymentCancelledResponse(BaseUtils.getInstance().getMetadata()));
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onCheckoutRendered() {
        Logger.d("LOAD_TIME onCheckoutRendered " + System.currentTimeMillis());
        if (this.isCheckoutRenderedCompleteEventFired) {
            return;
        }
        this.isCheckoutRenderedCompleteEventFired = true;
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_RENDERED_COMPLETE);
    }

    public void onComplete(JSONObject jSONObject) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "onComplete(JSONObject)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            MonitoringUtil.setCheckoutStage("payment_result_receive");
            if (jSONObject.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.PAYMENT;
                AnalyticsUtil.addProperty("payment_status", new AnalyticsProperty("fail", scope));
                AnalyticsUtil.addProperty("payload", new AnalyticsProperty(jSONObject.toString(), scope));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PAYMENT_COMPLETE);
                if (this.isTwoWebViewFlow) {
                    this.view.makeWebViewVisible(1);
                }
                onError(jSONObject);
            } else if (jSONObject.has("razorpay_fund_account_id")) {
                destroyActivity(1, jSONObject.toString());
            } else if (jSONObject.has("razorpay_payment_id")) {
                String string = jSONObject.getString("razorpay_payment_id");
                this.payment_id = string;
                AnalyticsProperty.Scope scope2 = AnalyticsProperty.Scope.PAYMENT;
                AnalyticsUtil.addProperty("payment_id", new AnalyticsProperty(string, scope2));
                AnalyticsUtil.addProperty("payment_status", new AnalyticsProperty(FirebaseAnalytics.Param.SUCCESS, scope2));
                AnalyticsUtil.addProperty("payload", new AnalyticsProperty(jSONObject.toString(), scope2));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PAYMENT_COMPLETE);
                this.isPaymentSuccessful = true;
                destroyActivity(1, jSONObject.toString());
            } else if (jSONObject.has("external_wallet")) {
                destroyActivity(4, jSONObject.toString());
            } else {
                destroyActivity(0, "Post payment parsing error");
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onComplete(JSONObject)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
            destroyActivity(0, e.getMessage());
        }
        this.isTwoWebViewFlow = false;
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onDismiss() {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_JS_DISMISSED);
        destroyActivity(0, BaseUtils.getPaymentCancelledResponse(BaseUtils.getInstance().getMetadata()));
    }

    public void onError(final JSONObject jSONObject) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "onError(JSONObject)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (this.isTwoWebViewFlow) {
                this.view.loadUrl(1, "javascript: window.onComplete(" + jSONObject.toString() + ")");
            } else {
                this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.7
                    @Override // java.lang.Runnable
                    public void run() {
                        CheckoutPresenterImpl.this.handleRetry(jSONObject.toString());
                    }
                });
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onError(JSONObject)", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onEvent(String str) {
        forwardEventToMerchant(str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onFault(String str) {
        try {
            Logger.d(new JSONObject(str).toString());
        } catch (JSONException unused) {
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onLoad() {
        if (this.integratedPluginsData.has("upi_turbo")) {
            return;
        }
        CheckoutUtils.dismissLoader();
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.6
            @Override // java.lang.Runnable
            public void run() {
                CheckoutPresenterImpl.this.view.loadUrl(1, CheckoutPresenterImpl.this.getHandleMessageFormattedString());
                CheckoutPresenterImpl checkoutPresenterImpl = CheckoutPresenterImpl.this;
                checkoutPresenterImpl.view.loadUrl(1, android.support.v4.media.b.b("javascript: CheckoutBridge.sendAnalyticsData({data: ", AnalyticsUtil.getAnalyticsDataForCheckout(checkoutPresenterImpl.activity).toString(), "})"));
                CheckoutPresenterImpl.this.isCheckoutLoaded = true;
            }
        });
        startSmsRetrievers();
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onPageFinished(int i, WebView webView, String str) {
        oooOOoO$0 ooooooo_0;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "onPageFinished", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (i == 1) {
                primaryWebviewPageFinished(str, webView);
                if (!str.contains(this.checkoutUrl)) {
                    CheckoutUtils.dismissLoader();
                }
            } else if (i == 2 && (ooooooo_0 = this.magicBase) != null && this.isMagic) {
                ooooooo_0.onPageFinished(webView, str);
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onPageFinished", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onPageStarted(int i, WebView webView, String str) {
        oooOOoO$0 ooooooo_0;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "onPageStarted", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (i == 2 && (ooooooo_0 = this.magicBase) != null && this.isMagic) {
                ooooooo_0.onPageStarted(webView, str);
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onPageStarted", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onProgressChanges(int i, int i2) {
        oooOOoO$0 ooooooo_0;
        if (i == 1) {
            this.view.showProgressBar(i2);
        } else if (i == 2 && (ooooooo_0 = this.magicBase) != null && this.isMagic) {
            ooooooo_0.onProgressChanged(i2);
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onRequestAction(String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "onRequestAction", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if ("INVOKE_MERCHANT_ACTION".equals(new JSONObject(str).optString("handlerAction", ""))) {
                Class<? extends Activity> addressWalletUpdateActivityClass = Checkout.getAddressWalletUpdateActivityClass();
                if (addressWalletUpdateActivityClass == null) {
                    AnalyticsUtil.reportError("CheckoutPresenterImpl", "S2", "AddressWalletUpdateActivity not registered");
                    sendErrorResultToWeb();
                    return;
                }
                Intent intent = new Intent(this.activity, addressWalletUpdateActivityClass);
                intent.putExtra("data", str);
                this.activity.startActivityForResult(intent, 98003);
                HashMap hashMap = new HashMap();
                hashMap.put("result", str);
                AnalyticsUtil.trackEvent(AnalyticsEvent.MERCHANT_ACTIVITY_LAUNCHED, AnalyticsUtil.getJSONResponse(hashMap));
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onRequestAction", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            sendErrorResultToWeb();
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onResumeTriggered() {
        if (this.truecallerLoginAttempt && this.view.isWebViewVisible(1)) {
            try {
                this.view.loadUrl(1, String.format("javascript: window.externalSDKResponse(%s)", new JSONObject().put("provider", "truecaller")));
                this.truecallerLoginAttempt = false;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:8:0x0031, B:10:0x0044, B:12:0x0053, B:15:0x005c, B:16:0x0069, B:18:0x006f, B:20:0x0075, B:22:0x008d, B:23:0x00a8, B:24:0x0062, B:26:0x0066, B:27:0x00ab), top: B:7:0x0031, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:8:0x0031, B:10:0x0044, B:12:0x0053, B:15:0x005c, B:16:0x0069, B:18:0x006f, B:20:0x0075, B:22:0x008d, B:23:0x00a8, B:24:0x0062, B:26:0x0066, B:27:0x00ab), top: B:7:0x0031, outer: #1 }] */
    @Override // com.razorpay.CheckoutInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSubmit(String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "onSubmit", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            CheckoutUtils.dismissLoader();
            this.isTouchNGoPayment = Boolean.FALSE;
            if (this.paymentAttempts > 1) {
                AnalyticsUtil.refreshPaymentSession();
                MonitoringUtil.refreshPaymentAttempt();
            }
            MonitoringUtil.setCheckoutStage("payment_submit");
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.checkoutContent = str;
                addAnalyticsData(jSONObject);
                savePrefillData(jSONObject);
                if (jSONObject.has("method")) {
                    String string = jSONObject.getString("method");
                    MonitoringUtil.setPaymentMethod(string);
                    if (!string.equalsIgnoreCase("netbanking") && !string.equalsIgnoreCase("card")) {
                        unregisterSmsListener();
                        if (string.equals("wallet")) {
                            unregisterReceivers();
                        } else if (jSONObject.has("wallet")) {
                            String string2 = jSONObject.getString("wallet");
                            this.isTouchNGoPayment = Boolean.valueOf("touchngo".equalsIgnoreCase(string2));
                            if (this.checkoutOptions.hasExternalWallet(string2)) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("external_wallet", string2);
                                AnalyticsUtil.addProperty("external_wallet", new AnalyticsProperty(string2, AnalyticsProperty.Scope.ORDER));
                                AnalyticsUtil.trackEvent(AnalyticsEvent.EXTERNAL_WALLET_SELECTED);
                                onComplete(jSONObject2);
                            }
                        }
                    }
                    if (!this.isSmsReceiverRegistered) {
                        registerSmsListener();
                    }
                    if (string.equals("wallet")) {
                    }
                }
                BaseUtils.getInstance().setDeeplinkEnabled(this.activity, this.isTouchNGoPayment.booleanValue());
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_SUBMIT);
                AnalyticsUtil.postData();
            } catch (Exception e) {
                AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
                Logger.e("Error in submit", e);
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "onSubmit", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e2) {
            AnalyticsUtil.reportCaughtException(e2);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void passPrefillToSegment() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "passPrefillToSegment", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            String prefilledEmail = this.checkoutOptions.getPrefilledEmail();
            if (!TextUtils.isEmpty(prefilledEmail)) {
                AnalyticsUtil.addProperty("email", new AnalyticsProperty(prefilledEmail, AnalyticsProperty.Scope.ORDER));
            }
            String prefilledContact = this.checkoutOptions.getPrefilledContact();
            if (!TextUtils.isEmpty(prefilledContact)) {
                AnalyticsUtil.addProperty("contact", new AnalyticsProperty(prefilledContact, AnalyticsProperty.Scope.ORDER));
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "passPrefillToSegment", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    public void primaryWebviewPageFinished(String str, WebView webView) {
        long nanoTime = System.nanoTime();
        this.view.hideProgressBar();
        if (str.contains("https://api.razorpay.com") && str.contains("android") && str.contains(com.razorpay.a.a.O$$$__o0Oo.VERSION_NAME)) {
            if (this.paymentAttempts == 1) {
                sendQueuedMessagesToCheckout();
            }
            if (this.paymentAttempts == 1 && !this.isCheckoutLoadedEventFired) {
                this.isCheckoutLoadedEventFired = true;
                this.isCheckoutLoaded = true;
                HashMap hashMap = new HashMap();
                long j = nanoTime - this.checkoutLoadStartAt;
                hashMap.put("checkout_load_duration", Long.valueOf(j));
                Logger.d("preload ; checkout loaded in " + BaseUtils.nanoTimeToSecondsString(j, 2) + " sec.");
                Logger.d("LOAD_TIME : checkout loaded in " + BaseUtils.nanoTimeToSecondsString(j, 2) + " sec.");
                Logger.d("Checkout loaded in " + BaseUtils.nanoTimeToSecondsString(j, 2) + " sec.");
                long j2 = this.preloadCompleteDuration;
                if (j2 > 0) {
                    hashMap.put("preload_finish_duration", Long.valueOf(j2));
                    Logger.d("Preload was completed in " + BaseUtils.nanoTimeToSecondsString(this.preloadCompleteDuration, 2) + " sec.");
                } else {
                    long j3 = this.preloadAbortDuration;
                    if (j3 > 0) {
                        hashMap.put("preload_abort_duration", Long.valueOf(j3));
                        Logger.d("Preload was aborted in " + BaseUtils.nanoTimeToSecondsString(this.preloadAbortDuration, 2) + " sec.");
                    }
                }
                long j4 = this.preloadCompleteDuration - j;
                if (j4 > 0) {
                    hashMap.put("time_shaved_off", Long.valueOf(j4));
                    Logger.d("Load time shaved is " + BaseUtils.nanoTimeToSecondsString(j4, 2) + " sec.");
                }
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_LOADED, AnalyticsUtil.getJSONResponse(hashMap));
            }
            if (this.clearHistory) {
                this.view.clearWebViewHistory(1);
                this.clearHistory = false;
            }
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void redirectToNfcSettings() {
        CheckoutNfcUtility.INSTANCE.openNfcSettings(this.activity);
    }

    @Override // com.razorpay.CheckoutInteractor
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public void registerSmsListener() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "registerSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            if (Build.VERSION.SDK_INT >= 33) {
                this.activity.registerReceiver(this.otpAutoReadBroadcast, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
            } else {
                this.activity.registerReceiver(this.otpAutoReadBroadcast, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND", null);
            }
            this.isSmsReceiverRegistered = true;
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "registerSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            this.isSmsReceiverRegistered = false;
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void relay(String str) {
    }

    @Override // com.razorpay.CheckoutInteractor
    public void requestExtraAnalyticsData() {
        final JSONObject extraAnalyticsPayload = AnalyticsUtil.getExtraAnalyticsPayload();
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CheckoutPresenterImpl.this.view.loadUrl(1, "javascript: CheckoutBridge.sendExtraAnalyticsData(" + extraAnalyticsPayload.toString() + ")");
                } catch (Exception e) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
                }
            }
        });
    }

    @Override // com.razorpay.CheckoutInteractor
    public void requestOtpPermission() {
    }

    @Override // com.razorpay.CheckoutPresenter
    public void saveInstanceState(Bundle bundle) {
        if (this.merchantLogoResourceId != 0) {
            bundle.putString(C$0o__.OPTIONS, this.checkoutOptions.getOptionsWithoutImage());
            bundle.putInt(C$0o__.IMAGE, this.merchantLogoResourceId);
        } else {
            bundle.putString(C$0o__.OPTIONS, this.checkoutOptions.getAsString());
        }
        bundle.putString("DASH_OPTIONS", this.dashOptions);
        if (this.activity.getIntent() != null) {
            bundle.putBoolean(C$0o__.DISABLE_FULL_SCREEN, this.activity.getIntent().getBooleanExtra(C$0o__.DISABLE_FULL_SCREEN, false));
        }
        JSONObject checkoutActivityStateBundleToJSONObject = CheckoutUtils.checkoutActivityStateBundleToJSONObject(bundle);
        if (checkoutActivityStateBundleToJSONObject != null) {
            SharedPreferenceUtil.setValue(this.activity, "SAVED_STATE_BUNDLE_MAP", checkoutActivityStateBundleToJSONObject.toString());
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void sendDataToWebView(final int i, final String str) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.15
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 == 1) {
                    CheckoutPresenterImpl.this.view.loadUrl(1, android.support.v4.media.b.b("javascript: handleRelay(", str, ")"));
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    CheckoutPresenterImpl.this.view.loadUrl(2, android.support.v4.media.b.b("javascript: Magic.handleRelay(", str, ")"));
                }
            }
        });
    }

    @Override // com.razorpay.CheckoutPresenter
    public void sendExternalSdkResponse(String str) {
        final String b = android.support.v4.media.b.b("javascript: window.externalSDKResponse(", str, ")");
        if (this.isCheckoutLoaded) {
            this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.20
                @Override // java.lang.Runnable
                public void run() {
                    CheckoutPresenterImpl.this.view.loadUrl(1, b);
                }
            });
            return;
        }
        if (this.checkoutMessageQueue == null) {
            this.checkoutMessageQueue = new LinkedList();
        }
        this.checkoutMessageQueue.add(b);
    }

    @Override // com.razorpay.CheckoutPresenter
    public void sendOtpPermissionCallback(final boolean z) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("granted", z);
                    CheckoutPresenterImpl.this.view.loadUrl(1, "javascript: otpPermissionCallback(" + jSONObject.toString() + ")");
                } catch (Exception e) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
                }
            }
        });
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setAppToken(String str) {
        _$O0_o.setAppToken(this.activity, str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setAttributes(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("country_code") || (string = jSONObject.getString("country_code")) == null || string.isEmpty()) {
                return;
            }
            SharedPreferenceUtil.setValue(this.activity, "country_code", string);
            AnalyticsUtil.addProperty("country_code", new AnalyticsProperty(string, AnalyticsProperty.Scope.ORDER));
            Logger.d("Country code set: ".concat(string));
        } catch (Exception e) {
            Logger.e("Error parsing attributes", e);
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getMessage());
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void setCheckoutLoadStartAt() {
        this.checkoutLoadStartAt = System.nanoTime();
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setDeviceToken(String str) {
        _$O0_o.setDeviceToken(this.activity, str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setDimensions(final int i, final int i2) {
        if (ResourceUtils.isTablet(this.activity)) {
            this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    WindowManager.LayoutParams attributes = CheckoutPresenterImpl.this.activity.getWindow().getAttributes();
                    Logger.d("SetDimensions called");
                    Logger.d("Height:" + i2);
                    Logger.d("Width:" + i);
                    attributes.height = ResourceUtils.dpToPx(CheckoutPresenterImpl.this.activity, i2);
                    attributes.width = ResourceUtils.dpToPx(CheckoutPresenterImpl.this.activity, i);
                    CheckoutPresenterImpl.this.activity.getWindow().setAttributes(attributes);
                }
            });
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void setEventCallback(EventCallback eventCallback) {
        this.eventCallback = eventCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    @Override // com.razorpay.CheckoutInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMerchantOptions(String str) {
        this.dashOptions = str;
        if (str != null) {
            try {
            } catch (Exception e) {
                Logger.e("Error parsing merchant dash options JSON", e);
                this.dashOptionsJSON = null;
                AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
            }
            if (!str.equalsIgnoreCase("undefined")) {
                this.dashOptionsJSON = new JSONObject(this.dashOptions);
                if (this.dashOptionsJSON != null) {
                    CheckoutUtils.setMerchantOptions(this.activity, this.merchantKey, null);
                    return;
                } else {
                    CheckoutUtils.setMerchantOptions(this.activity, this.merchantKey, str);
                    return;
                }
            }
        }
        this.dashOptionsJSON = null;
        if (this.dashOptionsJSON != null) {
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public boolean setOptions(Bundle bundle, boolean z) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "setOptions", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            this.isActivityCreated = z;
            if (bundle == null) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.CALLING_ON_INVALID_PARAMETER);
                destroyActivity(0, "Invalid parameters passed");
                return false;
            }
            this.checkoutOptions = new OoOo_(bundle.getString(C$0o__.OPTIONS));
            setupExternalPlugins(this.pluginsMap);
            JSONObject asJson = this.checkoutOptions.getAsJson();
            _Oo_O_$ _oo_o__ = _Oo_O_$.getInstance();
            if (asJson.has("retry")) {
                _oo_o__.setRetryConfigFromOptions(asJson);
            }
            if (asJson.has("hideNativeLoader")) {
                this.hideCircularLoader = Boolean.TRUE;
            }
            this.merchantKey = this.checkoutOptions.getMerchantKey();
            this.sendSmsHash = this.checkoutOptions.shouldSendHashForSms();
            this.allowRotation = this.checkoutOptions.allowRotation();
            int i = bundle.getInt(C$0o__.IMAGE, 0);
            this.merchantLogoResourceId = i;
            this.checkoutOptions.modifyMerchantOptions(this.activity, i);
            CheckoutUtils.addAddons(this.activity, this.merchantKey);
            asJson.has("ep");
            String checkoutUrlWithOptions = CheckoutUtils.getCheckoutUrlWithOptions(this.checkoutOptions);
            this.checkoutUrl = checkoutUrlWithOptions;
            if (checkoutUrlWithOptions == null) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.CALLING_ON_INVALID_URL);
                destroyActivity(3, "Invalid URL. Please make sure you've set public key");
                return false;
            }
            this.walletsWithAppToAppRedirection = BaseUtils.getAppsWithPackageNames(this.activity, _oo_o__.getWalletsWithAppToAppRedirection());
            if (z) {
                this.dashOptions = bundle.getString("DASH_OPTIONS");
                if (bundle.getBoolean(C$0o__.DISABLE_FULL_SCREEN, false)) {
                    CheckoutUtils.disableFullScreenMode(this.activity);
                }
            } else {
                this.checkoutOptions.logMerchantOptions();
                String merchantOptions = CheckoutUtils.getMerchantOptions(this.activity, this.merchantKey);
                this.dashOptions = merchantOptions;
                if (merchantOptions != null) {
                    try {
                        this.dashOptionsJSON = new JSONObject(this.dashOptions);
                    } catch (Exception e) {
                        AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
                    }
                }
                String string = bundle.getString(C$0o__.FRAMEWORK);
                if (string != null) {
                    AnalyticsUtil.addProperty("framework", new AnalyticsProperty(string, AnalyticsProperty.Scope.ORDER));
                }
                AnalyticsUtil.setFramework(string);
                String string2 = bundle.getString(C$0o__.FRAMEWORK_VERSION);
                if (string2 != null) {
                    AnalyticsUtil.addProperty("frameworkVersion", new AnalyticsProperty(string2, AnalyticsProperty.Scope.ORDER));
                }
                if (bundle.getBoolean(C$0o__.DISABLE_FULL_SCREEN, false)) {
                    CheckoutUtils.disableFullScreenMode(this.activity);
                }
                if (bundle.containsKey("PRELOAD_COMPLETE_DURATION")) {
                    this.preloadCompleteDuration = bundle.getLong("PRELOAD_COMPLETE_DURATION");
                }
                if (bundle.containsKey("PRELOAD_ABORT_DURATION")) {
                    this.preloadAbortDuration = bundle.getLong("PRELOAD_ABORT_DURATION");
                }
                if (!this.walletsWithAppToAppRedirection.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("app:list", this.walletsWithAppToAppRedirection);
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_SUPPORTED_WALLETS_IDENTIFIED, AnalyticsUtil.getJSONResponse(hashMap));
                }
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "setOptions", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return true;
        } catch (Exception e2) {
            AnalyticsUtil.reportCaughtException(e2);
            return false;
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void setOptionsWithDynamicUrl(Context context, Bundle bundle, boolean z, final BaseCheckoutActivity.SetOptionsCallback setOptionsCallback) {
        if (SharedPreferenceUtil.getValue(context, "optimizer_hosted") == null) {
            CheckoutUtils.isFeatureEnabled(this.checkoutOptions.getMerchantKey(), "optimizer_hosted", new Callback() { // from class: com.razorpay.CheckoutPresenterImpl.12
                @Override // com.razorpay.Callback
                public void run(ResponseObject responseObject) {
                    if (!responseObject.getResponseResult().equalsIgnoreCase(String.valueOf(true))) {
                        setOptionsCallback.onFeatureDisabled();
                        return;
                    }
                    CheckoutPresenterImpl checkoutPresenterImpl = CheckoutPresenterImpl.this;
                    checkoutPresenterImpl.checkoutUrl = CheckoutUtils.getCheckoutUrlWithOptions(checkoutPresenterImpl.checkoutOptions, null);
                    CheckoutPresenterImpl.this.isDynamicUrlLoaded = true;
                    setOptionsCallback.onOptionsSet();
                }
            });
            return;
        }
        this.checkoutUrl = CheckoutUtils.getCheckoutUrlWithOptions(this.checkoutOptions, null);
        this.isDynamicUrlLoaded = true;
        setOptionsCallback.onOptionsSet();
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setPaymentID(String str) {
        Logger.d("setPaymentID called: " + str);
        this.payment_id = str;
        MonitoringUtil.setPaymentId(str);
        BaseUtils.getInstance().setPaymentId(str);
        if (this.checkoutOptions.getOrderId() != null) {
            BaseUtils.getInstance().setOrderId(this.checkoutOptions.getOrderId());
        }
        AnalyticsUtil.addProperty("payment_id", new AnalyticsProperty(str, AnalyticsProperty.Scope.PAYMENT));
        AnalyticsUtil.trackEvent(AnalyticsEvent.PAYMENT_ID_ATTACHED);
    }

    @Override // com.razorpay.CheckoutPresenter
    public void setSubscribedAnalyticsEvents(ArrayList<String> arrayList) {
        this.subscribedAnalyticsEvents = arrayList;
    }

    @Override // com.razorpay.CheckoutPresenter
    public void setUpAddOn() {
    }

    @Override // com.razorpay.CheckoutPresenter
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            List<String> walletsWithAppToAppRedirection = getWalletsWithAppToAppRedirection();
            if (str.startsWith("razorpay://")) {
                try {
                    String queryParameter = Uri.parse(str).getQueryParameter("fallback");
                    if (queryParameter != null) {
                        webView.loadUrl(queryParameter);
                        AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                        return true;
                    }
                } catch (Exception unused) {
                    AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                    return false;
                }
            }
            if (_Oo_O_$.getInstance().isTNGRedirectionEnabled() && this.isTouchNGoPayment.booleanValue()) {
                if (!str.contains("tngdigital")) {
                    AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                    return false;
                }
                if (!walletsWithAppToAppRedirection.contains("my.com.tngdigital.ewallet")) {
                    AnalyticsUtil.addProperty("url", new AnalyticsProperty(str, AnalyticsProperty.Scope.PAYMENT));
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_TNG_WALLET_WEB_FLOW_START);
                    AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                    return false;
                }
                callNativeIntent(str, "my.com.tngdigital.ewallet");
                AnalyticsUtil.addProperty("url", new AnalyticsProperty(str, AnalyticsProperty.Scope.PAYMENT));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_WEBVIEW_URL_OVERRIDE);
                AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                return true;
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return false;
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            return false;
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void showAlertDialog(final String str, final String str2, final String str3) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.14
            @Override // java.lang.Runnable
            public void run() {
                CheckoutUtils.showDialog(CheckoutPresenterImpl.this.activity, str, str3, str2, new CheckoutUtils.BackButtonDialogCallback() { // from class: com.razorpay.CheckoutPresenterImpl.14.1
                    @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
                    public void onNegativeButtonClick() {
                        CheckoutPresenterImpl.this.view.loadUrl(1, "javascript: CheckoutBridge.isPositiveButtonClicked({isClicked: " + Boolean.FALSE + "})");
                    }

                    @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
                    public void onPositiveButtonClick() {
                        CheckoutPresenterImpl.this.view.loadUrl(1, "javascript: CheckoutBridge.isPositiveButtonClicked({isClicked: " + Boolean.TRUE + "})");
                    }
                });
            }
        });
    }

    @Override // com.razorpay.CheckoutPresenter
    public void showLoaderDialog(final int i, final String str) {
        this.view.loadUrl(1, "about:blank");
        if (this.activity.isFinishing()) {
            return;
        }
        final AlertDialog create = new AlertDialog.Builder(this.activity).create();
        create.setCancelable(false);
        create.setTitle("Trouble Connecting");
        create.setMessage("Unable to connect to Razorpay.\n\nPlease check your internet connection and/or disconnect from VPN if connected and hit Try Again");
        create.setButton(-1, "Try again", new DialogInterface.OnClickListener() { // from class: com.razorpay.CheckoutPresenterImpl.24
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                CheckoutPresenterImpl.this.loadForm("");
            }
        });
        create.setButton(-2, "Cancel Payment", new DialogInterface.OnClickListener() { // from class: com.razorpay.CheckoutPresenterImpl.25
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                create.dismiss();
                CheckoutPresenterImpl.this.destroyActivity(i, str);
            }
        });
        create.show();
    }

    @Override // com.razorpay.CheckoutPresenter
    public void showRetryDialog(final int i, final String str) {
        this.view.loadUrl(1, "about:blank");
        final AlertDialog create = new AlertDialog.Builder(this.activity).create();
        create.setTitle("Trouble Connecting");
        create.setMessage("Please check your internet connection & restart the payment process.\n\nRetrying in 5 seconds");
        create.setButton(-2, "Cancel Payment", new DialogInterface.OnClickListener() { // from class: com.razorpay.CheckoutPresenterImpl.22
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                create.dismiss();
                CheckoutPresenterImpl.this.destroyActivity(i, str);
            }
        });
        create.show();
        new CountDownTimer(5000L, 1000L) { // from class: com.razorpay.CheckoutPresenterImpl.23
            @Override // android.os.CountDownTimer
            public void onFinish() {
                create.dismiss();
                CheckoutPresenterImpl.this.loadForm("");
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j > 0) {
                    create.setMessage("Please reset network settings & restart the payment process.\n\nRetrying in " + (j / 1000) + " second(s)");
                }
            }
        }.start();
    }

    @Override // com.razorpay.CheckoutInteractor
    public void toast(final String str, final int i) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.13
            @Override // java.lang.Runnable
            public void run() {
                CheckoutPresenterImpl.this.view.showToast(str, i);
            }
        });
    }

    @Override // com.razorpay.CheckoutInteractor
    public void triggerNfcCardScanner() {
        CheckoutNfcUtility checkoutNfcUtility = CheckoutNfcUtility.INSTANCE;
        CheckoutNfcUtility$O$$$__o0Oo initAdapter = checkoutNfcUtility.initAdapter(this.activity);
        checkoutNfcUtility.registerNfcStateListener(this.activity);
        CheckoutNfcUtility.CheckoutNfcResponse checkoutNfcResponse = new CheckoutNfcUtility.CheckoutNfcResponse() { // from class: com.razorpay.CheckoutPresenterImpl.17
            @Override // com.razorpay.CheckoutNfcUtility.CheckoutNfcResponse
            public void onFailed(JSONObject jSONObject) {
                CheckoutPresenterImpl.this.sendExternalSdkResponse(jSONObject.toString());
            }

            @Override // com.razorpay.CheckoutNfcUtility.CheckoutNfcResponse
            public void onResponse(JSONObject jSONObject) {
                CheckoutPresenterImpl.this.sendExternalSdkResponse(jSONObject.toString());
            }
        };
        checkoutNfcUtility.setPendingNfcResponse(checkoutNfcResponse);
        if (initAdapter == CheckoutNfcUtility$O$$$__o0Oo.NFC_ENABLED) {
            checkoutNfcUtility.initDefaultAdapter(this.activity, checkoutNfcResponse);
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void triggerPhoneNumberHintApi() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "triggerPhoneNumberHintApi", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            PhoneNumberHintHelper.INSTANCE.triggerPhoneNumberHintApi(this.activity);
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "triggerPhoneNumberHintApi", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void unregisterNfcScanner() {
        CheckoutNfcUtility checkoutNfcUtility = CheckoutNfcUtility.INSTANCE;
        checkoutNfcUtility.disableReaderMode(this.activity);
        checkoutNfcUtility.unregisterNfcStateListener(this.activity);
    }

    @Override // com.razorpay.CheckoutPresenter
    public void unregisterReceivers() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "unregisterReceivers", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            BroadcastReceiver broadcastReceiver = this.otpAutoReadBroadcast;
            if (broadcastReceiver != null) {
                this.activity.unregisterReceiver(broadcastReceiver);
                this.isSmsReceiverRegistered = false;
            }
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "unregisterReceivers", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            this.isSmsReceiverRegistered = false;
            AnalyticsUtil.reportCaughtException(e);
            AnalyticsUtil.reportError("CxPrntrImpl", "S2", e.getMessage());
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void unregisterSmsListener() {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("CheckoutPresenterImpl", "unregisterSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            unregisterReceivers();
            AnalyticsUtil.logCheckoutFunctionExit("CheckoutPresenterImpl", "unregisterSmsListener", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onDismiss(String str) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_JS_DISMISSED);
        try {
            destroyActivity(0, new JSONObject(str).toString());
        } catch (JSONException unused) {
            destroyActivity(0, BaseUtils.getGenericPaymentErrorResponse(str, BaseUtils.getInstance().getMetadata()));
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onError(String str) {
        try {
            onError(new JSONObject(str));
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
            this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.11
                @Override // java.lang.Runnable
                public void run() {
                    CheckoutPresenterImpl.this.helpersReset();
                    CheckoutPresenterImpl.this.loadForm("");
                }
            });
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onComplete(final String str) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.CheckoutPresenterImpl.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Logger.d("oncomplete JavascriptInterface");
                    CheckoutPresenterImpl.this.onComplete(jSONObject);
                } catch (Exception e) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
                    CheckoutPresenterImpl.this.destroyActivity(0, BaseUtils.getPaymentCancelledResponse(BaseUtils.getInstance().getMetadata()));
                }
            }
        });
    }

    public CheckoutPresenterImpl(Activity activity, CheckoutView checkoutView, HashMap<String, String> hashMap) {
        Boolean bool = Boolean.FALSE;
        this.internalUpiApp = bool;
        this.hideCircularLoader = bool;
        this.isTouchNGoPayment = bool;
        this.otpAutoReadBroadcast = new BroadcastReceiver() { // from class: com.razorpay.CheckoutPresenterImpl.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_RECEIVED_SMS);
                    int i = status.a;
                    if (i != 0) {
                        if (i != 15) {
                            return;
                        }
                        AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_TIMEOUT);
                        return;
                    }
                    Intent intent2 = (Intent) extras.get("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                    if (intent2 == null) {
                        String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                        Intent intent3 = new Intent();
                        intent3.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", str);
                        CheckoutPresenterImpl.this.onActivityResultReceived(1001, -1, intent3);
                        return;
                    }
                    ComponentName callingActivity = CheckoutPresenterImpl.this.activity.getCallingActivity();
                    if (callingActivity != null && callingActivity.getPackageName().equals(CheckoutPresenterImpl.this.activity.getPackageName()) && CheckoutPresenterImpl.this.activity.getLocalClassName().contains("CheckoutActivity")) {
                        try {
                            CheckoutPresenterImpl.this.activity.startActivityForResult(intent2, 1001);
                            AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_SHOWED_ONE_TIME_CONSENT);
                        } catch (ActivityNotFoundException e) {
                            AnalyticsUtil.reportError("AutoReadOtpHelper", "S0", e.getLocalizedMessage());
                        }
                    }
                }
            }
        };
        this.checkoutMessageQueue = new LinkedList();
        this.isCheckoutLoaded = false;
        this.isCheckoutLoadedEventFired = false;
        this.isCheckoutRenderedCompleteEventFired = false;
        this.integratedPluginsData = new JSONObject();
        this.truecallerLoginAttempt = false;
        this.activity = activity;
        this.view = checkoutView;
        this.pluginsMap = hashMap;
    }
}
