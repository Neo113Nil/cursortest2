package com.razorpay;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class _Oo_O_$ extends BaseConfig {
    private static boolean $O0Oo$oo0o = false;
    static String CONFIG_AUTH_KEY = "2HujvzmUo2nuRLLqhIHIV4sCEmRw9FIc";
    static String CONFIG_VERSION = "3.0.5";
    static boolean IS_MAGIC_ENABLED = true;
    private static _Oo_O_$ O$$$__o0Oo = null;
    static String SDK_TYPE = "standard";
    static String SDK_VERSION = "1.7.17";
    static int SDK_VERSION_CODE = 1717;
    private static final Object _$O0_o = new Object();
    private static boolean oO$$$_0$_0;
    private String $$O_$;
    private String $00oO$;
    private String $_$0$o0O;
    private Boolean O$_OO_OO;
    private boolean O0_$0;
    private int OO$_0o_;
    private JSONObject O__0_0oO;
    private String _$o0O$_$O;
    private boolean _Oo_O_$;
    private boolean __O000_$O0;
    private boolean __Oo_;
    private boolean o_$0_O;
    private boolean oooOOoO$0;
    private ArrayList<String> $0o__ = new ArrayList<>();
    private Map<String, String> OoOo_ = new HashMap();
    private boolean o_$O$0$$ = false;

    private void $0o__(JSONObject jSONObject) throws Exception {
        this._$o0O$_$O = (String) BaseUtils.getJsonValue("back_button.alert_message", jSONObject, "");
        this.__Oo_ = ((Boolean) BaseUtils.getJsonValue("back_button.enable", jSONObject, Boolean.FALSE)).booleanValue();
        this.$00oO$ = (String) BaseUtils.getJsonValue("back_button.positive_text", jSONObject, "");
        this.$_$0$o0O = (String) BaseUtils.getJsonValue("back_button.negative_text", jSONObject, "");
    }

    private void $O0Oo$oo0o(JSONObject jSONObject) throws Exception {
        this.$$O_$ = (String) BaseUtils.getJsonValue("native_loader.color", jSONObject, "");
        this.O0_$0 = ((Boolean) BaseUtils.getJsonValue("native_loader.enable", jSONObject, Boolean.TRUE)).booleanValue();
    }

    private _Oo_O_$() {
    }

    private static JSONObject O$$$__o0Oo(Context context) {
        return BaseConfig.getConfig(context, com.razorpay.checkout.lib.R.raw.rzp_config_checkout);
    }

    private void OoOo_(JSONObject jSONObject) throws Exception {
        this.__O000_$O0 = ((Boolean) BaseUtils.getJsonValue("feature_flags.verbose_logging.enabled", jSONObject, Boolean.FALSE)).booleanValue();
    }

    private void _$O0_o(JSONObject jSONObject) throws Exception {
        Boolean bool = Boolean.FALSE;
        this._Oo_O_$ = ((Boolean) BaseUtils.getJsonValue("card_saving.broadcast_receiver_flow", jSONObject, bool)).booleanValue();
        this.oooOOoO$0 = ((Boolean) BaseUtils.getJsonValue("card_saving.shared_preferences_flow", jSONObject, bool)).booleanValue();
        this.o_$0_O = ((Boolean) BaseUtils.getJsonValue("card_saving.local", jSONObject, bool)).booleanValue();
    }

    public static void ensureInitialized(Context context) {
        if ($O0Oo$oo0o) {
            return;
        }
        synchronized (_$O0_o) {
            try {
                if ($O0Oo$oo0o) {
                    return;
                }
                getInstance().init(context);
                $O0Oo$oo0o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void fetchConfig(Context context, String str) {
        if (getInstance().isConfigEnabled()) {
            HashMap hashMap = new HashMap();
            hashMap.put("AuthKey", CONFIG_AUTH_KEY);
            hashMap.put("Content-type", "application/json");
            hashMap.put("CurrentSettingVersion", _$O0_o(context));
            boolean booleanValue = ((Boolean) BaseUtils.getJsonValue("use_dynamic_config_url", getInstance().O__0_0oO, Boolean.FALSE)).booleanValue();
            oO$$$_0$_0 = booleanValue;
            if (!booleanValue) {
                BaseConfig.fetchConfig(O$$$__o0Oo("https://api.razorpay.com/v2/settings/sdk", context, str), O$$$__o0Oo("https://butler.razorpay.com/v1/settings", context, str), hashMap, context);
            } else {
                String O$$$__o0Oo2 = O$$$__o0Oo(GlobalUrlConfig.instance().getButlerUrl(), context, str);
                BaseConfig.fetchConfig(O$$$__o0Oo2, O$$$__o0Oo2, hashMap, context);
            }
        }
    }

    public static _Oo_O_$ getInstance() {
        if (O$$$__o0Oo == null) {
            _Oo_O_$ _oo_o__ = new _Oo_O_$();
            O$$$__o0Oo = _oo_o__;
            CoreConfig.setInstance(_oo_o__);
        }
        return O$$$__o0Oo;
    }

    public Boolean getAppStartupUsageEnabled() {
        Boolean bool = (Boolean) BaseUtils.getJsonValue("performance.app_startup", this.O__0_0oO, Boolean.TRUE);
        bool.booleanValue();
        return bool;
    }

    public String getBackButtonAlertMessage() {
        return this._$o0O$_$O;
    }

    public String getBackButtonNegativeText() {
        return this.$_$0$o0O;
    }

    public String getBackButtonPositiveText() {
        return this.$00oO$;
    }

    public ArrayList<String> getCheckoutAppendKeys() {
        return this.$0o__;
    }

    public Map<String, String> getCheckoutUrlConfig() {
        return this.OoOo_;
    }

    public String getNativeLoaderColor() {
        return this.$$O_$;
    }

    public Boolean getPrefetchEnabled() {
        Boolean bool = (Boolean) BaseUtils.getJsonValue("performance.prefetch", this.O__0_0oO, Boolean.TRUE);
        bool.booleanValue();
        return bool;
    }

    public Boolean getPreloadEnabled() {
        Boolean bool = (Boolean) BaseUtils.getJsonValue("performance.preload", this.O__0_0oO, Boolean.TRUE);
        bool.booleanValue();
        return bool;
    }

    public int getRetryMaxCount() {
        return this.OO$_0o_;
    }

    public void init(Context context) {
        setConfig(O$$$__o0Oo(context));
    }

    public boolean isBackButtonAlertEnabled() {
        return this.__Oo_;
    }

    public boolean isCardSavingBroadcastReceiverFlowEnabled() {
        return this._Oo_O_$;
    }

    public boolean isCardSavingLocalEnabled() {
        return this.o_$0_O;
    }

    public boolean isCardSavingSharedPreferencesFlowEnabled() {
        return this.oooOOoO$0;
    }

    public boolean isNativeLoaderEnabled() {
        return this.O0_$0;
    }

    public boolean isRetryEnabled() {
        return this.O$_OO_OO.booleanValue();
    }

    @Override // com.razorpay.BaseConfig
    public boolean isVerboseLoggingEnabled() {
        return this.__O000_$O0;
    }

    @Override // com.razorpay.BaseConfig
    public void setConfig(JSONObject jSONObject) {
        try {
            O$$$__o0Oo(jSONObject);
            _$O0_o(jSONObject);
            $O0Oo$oo0o(jSONObject);
            O$$$__o0Oo(jSONObject, false);
            $0o__(jSONObject);
            OoOo_(jSONObject);
            this.O__0_0oO = jSONObject;
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S2", e.getMessage());
            Logger.e("Error in setting Config, ErrorMessage=" + e.getMessage());
            e.printStackTrace();
        }
        super.setConfig(jSONObject);
    }

    public void setRetryConfigFromOptions(JSONObject jSONObject) {
        try {
            O$$$__o0Oo(jSONObject, true);
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getLocalizedMessage());
        }
    }

    private void O$$$__o0Oo(JSONObject jSONObject) throws Exception {
        this.$0o__ = BaseUtils.jsonStringArrayToArrayList((JSONArray) BaseUtils.getJsonValue("checkout.append_keys", jSONObject, new JSONArray()));
        JSONObject jSONObject2 = (JSONObject) BaseUtils.getJsonValue("checkout.url_config", jSONObject, new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.OoOo_.put(next, jSONObject2.getString(next));
        }
    }

    private static String _$O0_o(Context context) {
        String baseCurrentConfigVersion = BaseConfig.getBaseCurrentConfigVersion(context);
        return baseCurrentConfigVersion == null ? CONFIG_VERSION : baseCurrentConfigVersion;
    }

    private void O$$$__o0Oo(JSONObject jSONObject, boolean z) throws Exception {
        if (!this.o_$O$0$$) {
            Boolean bool = (Boolean) BaseUtils.getJsonValue("retry.enabled", jSONObject, Boolean.TRUE);
            bool.booleanValue();
            this.O$_OO_OO = bool;
            this.OO$_0o_ = ((Integer) BaseUtils.getJsonValue("retry.max_count", jSONObject, -1)).intValue();
        }
        this.o_$O$0$$ = z;
    }

    private static String O$$$__o0Oo(String str, Context context, String str2) {
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("tenant", "android_checkout").appendQueryParameter("sdk_version", SDK_VERSION).appendQueryParameter("sdk_type", SDK_TYPE).appendQueryParameter("magic_enabled", String.valueOf(IS_MAGIC_ENABLED)).appendQueryParameter("sdk_version_code", String.valueOf(SDK_VERSION_CODE)).appendQueryParameter("app_version", com.razorpay.a.a.O$$$__o0Oo.VERSION_NAME).appendQueryParameter("version", BaseConfig.getCurrentConfigVersionTag(_$O0_o(context)));
        BaseConfig.getFetchConfigBuilder(appendQueryParameter, context, str2);
        return appendQueryParameter.build().toString();
    }
}
