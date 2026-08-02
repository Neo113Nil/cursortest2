package com.razorpay;

import android.os.Bundle;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
abstract class BaseCheckoutOtpelfActivity extends BaseCheckoutActivity {
    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        RzpPlugin rzpPlugin;
        RzpPluginCompatibilityResponse isCompatible;
        HashMap<String, String> allPluginsFromManifest = BaseUtils.getAllPluginsFromManifest(this);
        if (allPluginsFromManifest == null || allPluginsFromManifest.size() == 0) {
            OO$_0o_ oO$_0o_ = new OO$_0o_(this, this);
            this.presenter = oO$_0o_;
            this.checkoutBridgeObject = new CheckoutBridge(oO$_0o_, 1);
            super.onCreate(bundle);
            return;
        }
        _$o0O$_$O __o0o___o = new _$o0O$_$O(this, this, allPluginsFromManifest);
        this.presenter = __o0o___o;
        this.checkoutBridgeObject = new __Oo_(__o0o___o, 1);
        super.onCreate(bundle);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAmazonPluginIntegrated", false);
            jSONObject.put("isGooglePayPluginIntegrated", false);
        } catch (JSONException unused) {
        }
        for (String str : allPluginsFromManifest.values()) {
            try {
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RazorpayAmazon")) {
                    jSONObject.put("isAmazonPluginIntegrated", true);
                }
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RzpGpayMerged")) {
                    jSONObject.put("isGooglePayPluginIntegrated", true);
                }
                rzpPlugin = (RzpPlugin) RzpPlugin.class.getClassLoader().loadClass(str).newInstance();
                isCompatible = rzpPlugin.isCompatible(_Oo_O_$.SDK_TYPE, _Oo_O_$.SDK_VERSION_CODE, _Oo_O_$.SDK_VERSION);
            } catch (ClassNotFoundException e) {
                e = e;
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e = e2;
                e.printStackTrace();
            } catch (InstantiationException e3) {
                e = e3;
                e.printStackTrace();
            } catch (JSONException e4) {
                e = e4;
                e.printStackTrace();
            }
            if (!isCompatible.isCompatible()) {
                destroy(7, isCompatible.getErrorMessage());
                return;
            }
            rzpPlugin.isRegistered(this, new RzpPluginRegisterCallback() { // from class: com.razorpay.BaseCheckoutOtpelfActivity.1
                @Override // com.razorpay.RzpPluginRegisterCallback
                public void onResponse(boolean z) {
                }
            });
        }
    }
}
