package com.razorpay;

import android.app.Activity;
import android.text.TextUtils;
import com.razorpay.AnalyticsProperty;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class OoOo_ {
    private JSONObject O$$$__o0Oo;

    public OoOo_(String str) {
        try {
            this.O$$$__o0Oo = new JSONObject(str);
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CheckoutOptions", "S0", e.getMessage());
        }
    }

    private void O$$$__o0Oo(String str) {
        if (getPrefill() == null || !getPrefill().has("contact")) {
            putPrefill("contact", str);
        }
    }

    private void _$O0_o(String str) {
        if (getPrefill() == null || !getPrefill().has("email")) {
            putPrefill("email", str);
        }
    }

    public boolean allowRotation() {
        try {
            if (this.O$$$__o0Oo.has("allow_rotation")) {
                return this.O$$$__o0Oo.getBoolean("allow_rotation");
            }
            return false;
        } catch (JSONException e) {
            Logger.e("Error reading options!", e);
            AnalyticsUtil.reportError(getClass().getName(), "error:exception", e.getMessage());
            return true;
        }
    }

    public <T> T get(String str) {
        Object opt = this.O$$$__o0Oo.opt(str);
        if (opt == null) {
            return null;
        }
        return (T) opt.getClass().cast(opt);
    }

    public JSONObject getAsJson() {
        return this.O$$$__o0Oo;
    }

    public String getAsString() {
        return this.O$$$__o0Oo.toString();
    }

    public String getColor() {
        try {
            JSONObject asJson = getAsJson();
            if (asJson.has("theme") && asJson.getJSONObject("theme").has("color")) {
                return asJson.getJSONObject("theme").getString("color");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public String getMerchantKey() {
        try {
            return this.O$$$__o0Oo.getString(Constants.KEY);
        } catch (JSONException e) {
            Logger.e("Error reading options!", e);
            AnalyticsUtil.reportError("CheckoutOptions", "S0", e.getMessage());
            return null;
        }
    }

    public String getOptionsWithoutImage() {
        O$$$__o0Oo("image", null);
        return this.O$$$__o0Oo.toString();
    }

    public String getOrderId() {
        try {
            if (this.O$$$__o0Oo.has("order_id")) {
                return this.O$$$__o0Oo.getString("order_id");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject getOtpElfPreferences() {
        return this.O$$$__o0Oo.optJSONObject("otpelf_preferences");
    }

    public JSONObject getPrefill() {
        return this.O$$$__o0Oo.optJSONObject("prefill");
    }

    public String getPrefilledContact() {
        if (getPrefill() == null) {
            return null;
        }
        return getPrefill().optString("contact");
    }

    public String getPrefilledEmail() {
        if (getPrefill() == null) {
            return null;
        }
        return getPrefill().optString("email");
    }

    public boolean has(String str) {
        return this.O$$$__o0Oo.has(str);
    }

    public boolean hasExternalWallet(String str) {
        try {
            if (this.O$$$__o0Oo.has("external")) {
                return this.O$$$__o0Oo.getJSONObject("external").getJSONArray("wallets").toString().contains(str);
            }
            return false;
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S2", e.getMessage());
            return false;
        }
    }

    public void logMerchantOptions() {
        try {
            JSONObject jSONObject = new JSONObject(this.O$$$__o0Oo.toString());
            if (jSONObject.has("prefill")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("prefill");
                jSONObject2.remove("card");
                jSONObject2.remove("card[number]");
                jSONObject2.remove("card[expiry]");
                jSONObject2.remove("card[cvv]");
                jSONObject.put("prefill", jSONObject2);
            }
            jSONObject.remove("image");
            AnalyticsUtil.addProperty("merchant options", new AnalyticsProperty(jSONObject, AnalyticsProperty.Scope.ORDER));
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S2", e.getMessage());
        }
    }

    public void modifyMerchantOptions(Activity activity, int i) {
        String base64FromCurrentAppsResource;
        O$$$__o0Oo("redirect", Boolean.TRUE);
        if (i != 0 && (base64FromCurrentAppsResource = CheckoutUtils.getBase64FromCurrentAppsResource(activity, i)) != null) {
            O$$$__o0Oo("image", base64FromCurrentAppsResource);
        }
        String userEmail = CheckoutUtils.getUserEmail(activity);
        if (!TextUtils.isEmpty(userEmail)) {
            _$O0_o(userEmail);
        }
        String userContact = CheckoutUtils.getUserContact(activity);
        if (TextUtils.isEmpty(userContact)) {
            return;
        }
        O$$$__o0Oo(userContact);
    }

    public void putPrefill(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        if (getPrefill() != null) {
            jSONObject = getPrefill();
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getMessage());
        }
        try {
            this.O$$$__o0Oo.put("prefill", jSONObject);
        } catch (JSONException e2) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e2.getMessage());
        }
    }

    public boolean shouldDisableHardwareAccelerationForLowEndDevices() {
        try {
            if (this.O$$$__o0Oo.has("disable_hardware_acceleration")) {
                return this.O$$$__o0Oo.getBoolean("disable_hardware_acceleration");
            }
            return false;
        } catch (JSONException e) {
            Logger.e("Error reading options!", e);
            AnalyticsUtil.reportError(getClass().getName(), "error:exception", e.getMessage());
            return false;
        }
    }

    public boolean shouldSendHashForSms() {
        try {
            if (this.O$$$__o0Oo.has("send_sms_hash")) {
                return this.O$$$__o0Oo.getBoolean("send_sms_hash");
            }
            return true;
        } catch (JSONException e) {
            Logger.e("Error reading options!", e);
            AnalyticsUtil.reportError(getClass().getName(), "error:exception", e.getMessage());
            return true;
        }
    }

    private void O$$$__o0Oo(String str, Object obj) {
        try {
            this.O$$$__o0Oo.put(str, obj);
        } catch (JSONException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getMessage());
        }
    }
}
