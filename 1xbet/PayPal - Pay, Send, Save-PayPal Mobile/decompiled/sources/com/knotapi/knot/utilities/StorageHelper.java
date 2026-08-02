package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class StorageHelper {
    private static final java.lang.String TAG = "StorageHelper";

    public static boolean checkLocalStorageParams(java.lang.String str, java.util.List<java.lang.String> list) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> it = list.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (jSONObject.optString(it.next(), "").isEmpty()) {
                    z = false;
                }
            }
            return z;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    public static boolean checkSessionStorageParams(java.lang.String str, java.util.List<java.lang.String> list) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> it = list.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (jSONObject.optString(it.next(), "").isEmpty()) {
                    z = false;
                }
            }
            return z;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    private static java.util.List<java.lang.String> getLocalParamNames(com.knotapi.knot.models.Bot bot) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator<com.google.gson.JsonElement> it = com.google.gson.JsonParser.parseString(bot.getAllSettings().get("localStorageParams").getAsString()).getAsJsonArray().iterator();
            while (it.hasNext()) {
                java.lang.String asString = it.next().getAsString();
                if (!asString.isEmpty()) {
                    arrayList.add(asString);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    private static java.util.List<java.lang.String> getSessionParamNames(com.knotapi.knot.models.Bot bot) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator<com.google.gson.JsonElement> it = com.google.gson.JsonParser.parseString(bot.getAllSettings().get("sessionStorageParams").getAsString()).getAsJsonArray().iterator();
            while (it.hasNext()) {
                java.lang.String asString = it.next().getAsString();
                if (!asString.isEmpty()) {
                    arrayList.add(asString);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    private static void proceedWithStorageDetails(java.lang.String str, java.lang.String str2, com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.models.Bot bot) {
        if (bot.getHasLocalStorage() && !java.lang.Boolean.parseBoolean(bot.getIsUsingLocalStorage())) {
            str = "{}";
        }
        if (bot.getHasSessionStorage() && !java.lang.Boolean.parseBoolean(bot.getIsUsingSessionStorage())) {
            str2 = "{}";
        }
        knotView.captureManualScreenshot(knotView);
        knotView.getMerchantViewListener().sendRunningEvent(str, str2);
    }

    private static void showError(com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.models.Bot bot, com.google.gson.JsonObject jsonObject) {
        try {
            knotView.viewClient.showErrorPage(new com.knotapi.knot.models.ErrorView(bot.getMerchantName(), jsonObject.has("title") ? jsonObject.get("title").getAsString() : "Error Occurred", jsonObject.has("content") ? jsonObject.get("content").getAsString() : "An unexpected error occurred.", bot.getLogoURL(), bot.getTheme().has("background_color") ? bot.getTheme().get("background_color").getAsString() : "#FFFFFF", bot.getTheme().has("text_color") ? bot.getTheme().get("text_color").getAsString() : "#000000", "storageError"));
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, TAG);
        }
    }

    private static boolean validateRegexStorage(java.lang.String str, java.util.List<java.lang.String> list) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        boolean z = true;
        for (java.lang.String str2 : list) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(?:\\\\)*([\"'])([^\"']*");
            sb.append(java.util.regex.Pattern.quote(str2));
            sb.append("[^\"']*)\\1\\s*[:=]\\s*(?:\\\\)*([\"'])([^\"']+)\\3");
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(sb.toString()).matcher(str);
            while (true) {
                if (!matcher.find()) {
                    z = false;
                    break;
                }
                java.lang.String group = matcher.group(4);
                if (group != null) {
                    java.lang.String trim = group.trim();
                    if (!trim.isEmpty() && !trim.equalsIgnoreCase("null") && !trim.equalsIgnoreCase("undefined")) {
                        break;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validateStorage(java.lang.String str, java.lang.String str2, com.knotapi.knot.models.Bot bot) {
        boolean z;
        boolean z2;
        if (bot.getAllSettings().has("localStorageParams")) {
            java.util.List<java.lang.String> localParamNames = getLocalParamNames(bot);
            if (!localParamNames.isEmpty() && ((!com.knotapi.knot.utilities.Helper.isValidJson(str) || !checkLocalStorageParams(str, localParamNames)) && !validateRegexStorage(str, localParamNames))) {
                z = false;
                if (bot.getAllSettings().has("sessionStorageParams")) {
                    java.util.List<java.lang.String> sessionParamNames = getSessionParamNames(bot);
                    if (!sessionParamNames.isEmpty() && ((!com.knotapi.knot.utilities.Helper.isValidJson(str2) || !checkSessionStorageParams(str2, sessionParamNames)) && !validateRegexStorage(str2, sessionParamNames))) {
                        z2 = false;
                        return !z && z2;
                    }
                }
                z2 = true;
                if (z) {
                }
            }
        }
        z = true;
        if (bot.getAllSettings().has("sessionStorageParams")) {
        }
        z2 = true;
        if (z) {
        }
    }

    public static void validateStorages(java.lang.String str, java.lang.String str2, com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.models.Bot bot) {
        knotView.getmExtraInfo().setLoggedInPage(knotView.getUrl());
        if (knotView.getStorageValidationStartTime() == 0) {
            knotView.setStorageValidationStartTime(java.lang.System.currentTimeMillis());
        }
        com.google.gson.JsonObject storageErrorViewJson = bot.getStorageErrorViewJson();
        if (java.lang.System.currentTimeMillis() - knotView.getStorageValidationStartTime() >= (storageErrorViewJson.has("time") ? storageErrorViewJson.get("time").getAsInt() : 10000)) {
            showError(knotView, bot, storageErrorViewJson);
            return;
        }
        if (!bot.isStorageRequired()) {
            proceedWithStorageDetails(str, str2, knotView, bot);
        } else if (validateStorage(str, str2, bot)) {
            proceedWithStorageDetails(str, str2, knotView, bot);
        } else {
            knotView.getStorageDetails();
        }
    }
}
