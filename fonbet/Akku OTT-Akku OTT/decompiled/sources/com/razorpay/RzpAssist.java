package com.razorpay;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.razorpay.AnalyticsProperty;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class RzpAssist implements SmsAgentInterface {
    private String $$_$I1l1_;
    private Activity $l$I1I11I1;
    private OtpElfData IIII$1$_I;
    private long I__1l;
    private SmsAgent _$_l_$1l$;
    private String __Il11I1l;
    private String ___Il$;
    private int l$$$11Il1;
    private WebView l$1_I$l$;
    private String lI_l1Il_;
    String lastSms;
    String message;
    String sender;
    private boolean __l1_ = false;
    private String _llI = "";
    private String _l_1l__ = "";
    private boolean _1__ = false;
    private boolean $I__I = false;
    private JSONObject $lll$_lIl = new JSONObject();
    private JSONObject __II$$ = new JSONObject();
    private boolean $l_I$1 = false;
    private boolean I1lII = false;
    private boolean llIl = false;

    public RzpAssist(String str, Activity activity, WebView webView, String str2, int i, String str3) {
        this.$$_$I1l1_ = "standalone";
        if (CoreConfig.getInstance().isOTPElfEnabled().booleanValue()) {
            if (str == null || str.isEmpty()) {
                throw new RuntimeException("merchantKey cannot be null or empty");
            }
            this.$$_$I1l1_ = str2;
            this.l$$$11Il1 = i;
            this.___Il$ = str3;
            Logger.d("OTPElf Constructor");
            if (str2.equals("standalone") || str2.equalsIgnoreCase(com.razorpay.a.a.O$$$__o0Oo.SDK_TYPE) || str2.equalsIgnoreCase("custom")) {
                AnalyticsUtil.setup(activity, str, str2, i, str3);
            }
            this.l$1_I$l$ = webView;
            this.lI_l1Il_ = str;
            this.$l$I1I11I1 = activity;
            OtpElfData otpElfData = new OtpElfData(activity);
            this.IIII$1$_I = otpElfData;
            otpElfData.checkForUpdates();
            l$1_I$l$();
            AnalyticsUtil.addProperty("OTPElf Version", new AnalyticsProperty(BaseUtils.getLocalVersion(activity, OtpElfData.versionKey), AnalyticsProperty.Scope.ORDER));
        }
    }

    private void __l1_() {
        try {
            JSONObject oTPElfSettings = CoreConfig.getInstance().getOTPElfSettings();
            oTPElfSettings.put("merchant_key", this.lI_l1Il_);
            oTPElfSettings.put("otp_permission", this.__l1_);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.$$_$I1l1_);
            jSONObject.put("version", this.___Il$);
            jSONObject.put("platform", "android");
            jSONObject.put("framework", "native");
            jSONObject.put("name", this.$$_$I1l1_ + "_android_native");
            oTPElfSettings.put("sdk", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            if (this._1__) {
                Logger.d("This is Magic");
                jSONObject2.put("type", "magic");
                jSONObject2.put("version_code", ResourceUtils.getMagicVersionCode());
            } else {
                Logger.d("not magic");
                jSONObject2.put("type", "rzpassist");
                jSONObject2.put("version_code", ResourceUtils.getRzpAssistVersionCode());
            }
            oTPElfSettings.put("plugin", jSONObject2);
            oTPElfSettings.put("payment_data", this.__II$$);
            oTPElfSettings.put("preferences", this.$lll$_lIl);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("package_name", this.$l$I1I11I1.getApplicationContext().getPackageName());
            PackageManager packageManager = this.$l$I1I11I1.getPackageManager();
            jSONObject3.put("app_name", AnalyticsUtil.returnUndefinedIfNull(packageManager.getPackageInfo(this.$l$I1I11I1.getPackageName(), 0).applicationInfo.loadLabel(packageManager)));
            jSONObject3.put("platform", "mobile_sdk");
            jSONObject3.put("os", "android");
            jSONObject3.put("os_version", Build.VERSION.RELEASE);
            jSONObject3.put("data_network_type", BaseUtils.getDataNetworkType(this.$l$I1I11I1).getNetworkTypeName());
            jSONObject3.put("framework", AnalyticsUtil.getFramework());
            jSONObject3.put("library", com.razorpay.a.a.O$$$__o0Oo.SDK_TYPE);
            jSONObject3.put("sdk", jSONObject);
            oTPElfSettings.put("metadata", jSONObject3);
            l$1_I$l$("window.__rzp_options = " + oTPElfSettings.toString());
        } catch (Exception e) {
            Logger.e("Unable to load otpelf settings", e);
        }
        l$1_I$l$(this.IIII$1$_I.getOtpElfJs());
        AnalyticsUtil.trackEvent(AnalyticsEvent.OTPELF_INJECTED);
        String str = this.lastSms;
        if (str != null) {
            l$1_I$l$(androidx.core.database.a.d("OTPElf.showOTP('", str, "','", this.sender, "')"));
            this.lastSms = null;
        }
    }

    private void _llI() {
        try {
            String constructBasicAuth = BaseUtils.constructBasicAuth(this.lI_l1Il_);
            HashMap hashMap = new HashMap();
            hashMap.put(RtspHeaders.AUTHORIZATION, "Basic " + constructBasicAuth);
            hashMap.put(RtspHeaders.CONTENT_TYPE, "application/json");
            if (this.__Il11I1l == null) {
                return;
            }
            String str = "https://api.razorpay.com/v1/payments/" + this.__Il11I1l + "/metadata";
            Logger.d("Sending Stats Request");
            JSONObject createStatsPayload = AutoOtpUtils.createStatsPayload(this.I1lII);
            Logger.d("PAYLOAD");
            Logger.d(createStatsPayload.toString());
            Logger.d(str);
            Owl.post(str, createStatsPayload.toString(), hashMap, new Callback() { // from class: com.razorpay.RzpAssist.1
                @Override // com.razorpay.Callback
                public void run(ResponseObject responseObject) {
                    Logger.d("API Metadata: " + responseObject.getResponseResult());
                }
            });
        } catch (Exception e) {
            AnalyticsUtil.reportError("RzpAssist", "S0", e.getMessage());
        }
    }

    private void l$1_I$l$() {
        SmsAgent smsAgentInstance = SmsAgent.getSmsAgentInstance();
        this._$_l_$1l$ = smsAgentInstance;
        smsAgentInstance.registerForCallbacks(this);
        this._$_l_$1l$.takeActionsIfPermissionsAreGranted(this.$l$I1I11I1);
        this.l$1_I$l$.addJavascriptInterface(this, "OTPElfBridge");
        this.l$1_I$l$.getSettings().setUseWideViewPort(true);
    }

    @JavascriptInterface
    public void copyToClipboard(String str) {
        ((ClipboardManager) this.$l$I1I11I1.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("rzp_clip_data", str));
    }

    public void enableMagic() {
        this._1__ = true;
    }

    public String getCurrentLoadingUrl() {
        return this._l_1l__;
    }

    public String getLastLoadedUrl() {
        return this._llI;
    }

    public boolean isRazorpayOtpReceived() {
        return this.$I__I;
    }

    @JavascriptInterface
    public void onOtpParsed(final String str) {
        this.$l$I1I11I1.runOnUiThread(new Runnable() { // from class: com.razorpay.RzpAssist.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    OTP otp = new OTP(jSONObject.getString("otp"), jSONObject.getString("sender"), jSONObject.getString("bank"));
                    HashMap hashMap = new HashMap();
                    hashMap.put("sender", otp.getSender());
                    if (otp.getSender().contains("RZRPAY")) {
                        RzpAssist.this.$I__I = true;
                        hashMap.put("razorpay_otp", Boolean.TRUE);
                    } else {
                        hashMap.put("razorpay_otp", Boolean.FALSE);
                        RzpAssist.this.I1lII = true;
                        AnalyticsUtil.addProperty("payment_otp_received", new AnalyticsProperty(true, AnalyticsProperty.Scope.PAYMENT));
                    }
                    AnalyticsUtil.trackEvent(AnalyticsEvent.OTP_RECEIVED, AnalyticsUtil.getJSONResponse(hashMap));
                } catch (Exception e) {
                    Logger.e("Error in parsing json", e);
                }
            }
        });
    }

    public void onPageFinished(WebView webView, String str) {
        AnalyticsUtil.trackPageLoadEnd(str, System.nanoTime() - this.I__1l);
        this._llI = str;
        this._l_1l__ = "";
        if (CoreConfig.getInstance().isOTPElfEnabled().booleanValue() && !this.llIl) {
            __l1_();
            this.llIl = true;
        }
    }

    public void onPageStarted(WebView webView, String str) {
        Logger.d("RzpAssist onPageStarted: " + str);
        AnalyticsUtil.trackPageLoadStart(str);
        this.I__1l = System.nanoTime();
        this._l_1l__ = str;
        this.llIl = false;
    }

    public void onProgressChanged(int i) {
        CoreConfig.getInstance().isOTPElfEnabled().booleanValue();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this._$_l_$1l$.handleRequestPermissionsResult(this.$l$I1I11I1, i, strArr, iArr);
    }

    @JavascriptInterface
    public final void openKeyboard() {
        this.$l$I1I11I1.runOnUiThread(new Runnable() { // from class: com.razorpay.RzpAssist.3
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) RzpAssist.this.$l$I1I11I1.getSystemService("input_method")).showSoftInput(RzpAssist.this.l$1_I$l$, 0);
            }
        });
    }

    public void paymentFlowEnd() {
        if (this.$$_$I1l1_.equals("standalone")) {
            AnalyticsUtil.postData();
        }
        if (CoreConfig.getInstance().isOTPElfEnabled().booleanValue()) {
            this._$_l_$1l$.removeSMSBroadcastReceiver(this.$l$I1I11I1);
            this._$_l_$1l$.deregisterForCallbacks(this);
        }
    }

    @Override // com.razorpay.SmsAgentInterface
    public void postSms(String str, String str2) {
        if (this.$l_I$1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sender", str);
                jSONObject.put(Constants.MESSAGE, str2);
                this.sender = str;
                this.message = str2;
                this.lastSms = jSONObject.toString();
                l$1_I$l$("OTPElf.showOTP('" + str2 + "','" + str + "')");
            } catch (Exception e) {
                Logger.e("Exception", e);
            }
        }
    }

    public final void reset() {
        _llI();
        this._llI = "";
        this._l_1l__ = "";
        this.I1lII = false;
    }

    public void setOTPEnabled(boolean z) {
        this.__l1_ = z;
        AnalyticsUtil.addProperty("otp_autoreading_access", new AnalyticsProperty(z, AnalyticsProperty.Scope.ORDER));
    }

    public void setOtpElfPreferences(JSONObject jSONObject) {
        this.$lll$_lIl = jSONObject;
    }

    public void setPaymentData(JSONObject jSONObject) {
        this.__II$$ = jSONObject;
    }

    public void setPaymentId(String str) {
        this.__Il11I1l = str;
    }

    public void setRzpAssistEnabled(boolean z) {
        this.$l_I$1 = z;
    }

    @Override // com.razorpay.SmsAgentInterface
    public void setSmsPermission(boolean z) {
        setOTPEnabled(z);
    }

    @JavascriptInterface
    public final void setUseWideViewPort(final boolean z) {
        this.$l$I1I11I1.runOnUiThread(new Runnable() { // from class: com.razorpay.RzpAssist.2
            @Override // java.lang.Runnable
            public void run() {
                RzpAssist.this.l$1_I$l$.getSettings().setUseWideViewPort(z);
            }
        });
    }

    @JavascriptInterface
    public final void toast(final String str) {
        this.$l$I1I11I1.runOnUiThread(new Runnable() { // from class: com.razorpay.RzpAssist.4
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(RzpAssist.this.$l$I1I11I1, str, 1).show();
            }
        });
    }

    @JavascriptInterface
    public void trackEvent(String str, String str2) {
        try {
            AnalyticsEvent analyticsEvent = AnalyticsEvent.JS_EVENT;
            analyticsEvent.setEventName(str);
            AnalyticsUtil.trackEvent(analyticsEvent, new JSONObject(str2));
        } catch (Exception e) {
            Logger.e("Error in tracking JS Event", e);
        }
    }

    private void l$1_I$l$(String str) {
        this.l$1_I$l$.loadUrl("javascript: " + str);
    }

    @JavascriptInterface
    public final void trackEvent(String str) {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.JS_EVENT;
        analyticsEvent.setEventName(str);
        AnalyticsUtil.trackEvent(analyticsEvent);
    }
}
