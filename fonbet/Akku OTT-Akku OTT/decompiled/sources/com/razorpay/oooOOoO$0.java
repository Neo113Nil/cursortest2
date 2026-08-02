package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class oooOOoO$0 implements SmsAgentInterface {
    String lastSms;
    C$$O_$ magicData;
    String merchantKey;
    SmsAgent smsAgent;
    WebView webView;
    boolean hasOtpPermission = false;
    boolean isMagicEnabled = false;
    boolean jsInsertedInCurrentPage = false;
    Context context = this.context;
    Context context = this.context;

    public oooOOoO$0(Activity activity, WebView webView) {
        this.webView = webView;
        SmsAgent smsAgentInstance = SmsAgent.getSmsAgentInstance();
        this.smsAgent = smsAgentInstance;
        smsAgentInstance.registerForCallbacks(this);
        C$$O_$ c$$o_$ = new C$$O_$(activity);
        this.magicData = c$$o_$;
        c$$o_$.checkForUpdates();
    }

    private void O$$$__o0Oo(String str) {
        this.webView.loadUrl("javascript: " + str);
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.jsInsertedInCurrentPage) {
            return;
        }
        try {
            JSONObject magicSettings = _Oo_O_$.getInstance().getMagicSettings();
            magicSettings.put("merchant_key", this.merchantKey);
            magicSettings.put("otp_permission", this.hasOtpPermission);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", _Oo_O_$.SDK_TYPE);
            jSONObject.put("version_code", _Oo_O_$.SDK_VERSION_CODE);
            magicSettings.put("sdk", jSONObject);
            O$$$__o0Oo("window.__rzp_options = " + magicSettings.toString());
        } catch (Exception e) {
            Logger.e("Unable to load magic settings", e);
        }
        O$$$__o0Oo(this.magicData.getMagicJs());
        String str2 = this.lastSms;
        if (str2 != null) {
            O$$$__o0Oo(android.support.v4.media.b.b("Magic.elfBridge.setSms(", str2, ")"));
            this.lastSms = null;
        }
        this.jsInsertedInCurrentPage = true;
    }

    public void onPageStarted(WebView webView, String str) {
        this.jsInsertedInCurrentPage = false;
    }

    public void onProgressChanged(int i) {
    }

    public void paymentFlowEnd() {
        this.smsAgent.deregisterForCallbacks(this);
        this.smsAgent.removeSMSBroadcastReceiver((Activity) this.context);
    }

    @Override // com.razorpay.SmsAgentInterface
    public void postSms(String str, String str2) {
        if (this.isMagicEnabled) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sender", str);
                jSONObject.put(Constants.MESSAGE, str2);
                this.lastSms = jSONObject.toString();
                O$$$__o0Oo("Magic.elfBridge.setSms(" + jSONObject.toString() + ")");
            } catch (Exception e) {
                Logger.e("Exception", e);
            }
        }
    }

    public void setMagicEnabled(boolean z) {
        this.isMagicEnabled = z;
    }

    @Override // com.razorpay.SmsAgentInterface
    public void setSmsPermission(boolean z) {
        this.hasOtpPermission = z;
    }
}
