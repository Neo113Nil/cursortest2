package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class RunCustomScript {
    public static final java.lang.String TAG = "Knot:RunCustomScript";

    public static void runScript(org.json.JSONArray jSONArray, com.knotapi.knot.models.Bot bot, final android.webkit.WebView webView, android.app.Activity activity, boolean z) {
        int i;
        try {
            final org.json.JSONObject jSONObject = new org.json.JSONObject(bot.getParsedCustomScripts());
            while (i < jSONArray.length()) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                final java.lang.String string = jSONObject2.getString("src");
                i = (z || jSONObject2.getBoolean("mainFrameOnly")) ? 0 : i + 1;
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.RunCustomScript$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        webView.evaluateJavascript(jSONObject.optString(string), null);
                    }
                });
            }
        } catch (org.json.JSONException e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error executing runCustomScript");
        }
    }

    public static void runScriptInMerchantView(com.knotapi.knot.models.Bot bot, android.webkit.WebView webView, android.app.Activity activity, boolean z) {
        bot.getCustomScripts();
        bot.isCustomScriptsSet();
        bot.isAndroidScriptTriggersSet();
        if (!bot.isCustomScriptsSet() || !bot.isAndroidScriptTriggersSet()) {
            bot.getCustomScripts();
            return;
        }
        try {
            runScript(new org.json.JSONObject(bot.getAndroidScriptTriggers()).getJSONArray("webViewConfig"), bot, webView, activity, z);
            bot.getCustomScripts();
        } catch (org.json.JSONException e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error executing runCustomScript");
        }
    }

    public static void runScriptInPopUpView(com.knotapi.knot.models.Bot bot, android.webkit.WebView webView, android.app.Activity activity, boolean z) {
        if (bot.isCustomScriptsSet() && bot.isAndroidChromeScriptTriggersSet()) {
            try {
                runScript(new org.json.JSONObject(bot.getAndroidChromeScriptTriggers()).getJSONArray("webViewConfig"), bot, webView, activity, z);
            } catch (org.json.JSONException e) {
                com.knotapi.knot.services.ErrorReporter.report(e, "Error executing runCustomScript");
            }
        }
    }
}
