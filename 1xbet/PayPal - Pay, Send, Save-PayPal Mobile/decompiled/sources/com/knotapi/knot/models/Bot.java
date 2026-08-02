package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class Bot implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.knotapi.knot.models.Bot> CREATOR = new android.os.Parcelable.Creator<com.knotapi.knot.models.Bot>() { // from class: com.knotapi.knot.models.Bot.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.knotapi.knot.models.Bot createFromParcel(android.os.Parcel parcel) {
            return new com.knotapi.knot.models.Bot(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.knotapi.knot.models.Bot[] newArray(int i) {
            return new com.knotapi.knot.models.Bot[i];
        }
    };
    public static final java.lang.String TAG = "Knot:Bot";
    com.google.gson.JsonObject allSettings;
    int botId;
    java.lang.String callbackPath;
    java.lang.String callbackScript;
    java.lang.String callbackUrl;
    java.lang.String checkLoginPath;
    java.lang.String checkLoginScript;
    java.lang.String customLoginScript;
    java.lang.String customScripts;
    com.google.gson.JsonObject globalSettings;
    java.lang.String loggedInScript;
    java.lang.String loggedInUrl;
    java.lang.String loginPath;
    java.lang.String loginScript;
    java.lang.String loginUrl;
    java.lang.String logoURL;
    int merchantCount;
    int merchantId;
    java.lang.String merchantName;
    java.lang.String parsedCustomScripts;
    java.lang.String path;
    java.lang.String paymentUrl;
    java.lang.String script;
    int[] selectedMerchantIds;
    java.lang.String theme;
    java.lang.Boolean isDetached = java.lang.Boolean.FALSE;
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.util.List<com.knotapi.knot.models.Interceptor> interceptorsList = new java.util.ArrayList();

    public Bot() {
    }

    public static com.knotapi.knot.models.Bot getBotObject(java.lang.String str) throws org.json.JSONException {
        com.knotapi.knot.models.Bot bot = new com.knotapi.knot.models.Bot();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        bot.setAllSettings(com.google.gson.JsonParser.parseString(str).getAsJsonObject());
        bot.setGlobalSettings(bot.allSettings.has("globalSettings") ? bot.allSettings.getAsJsonObject("globalSettings") : new com.google.gson.JsonObject());
        bot.setBotId(jSONObject.optInt("id"));
        bot.setMerchantId(jSONObject.optInt("merchantId"));
        bot.setMerchantName(jSONObject.optString("merchantName"));
        bot.setTheme(jSONObject.optString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME));
        bot.setLoginUrl(parseString(jSONObject, "loginUrl"));
        bot.setPaymentUrl(parseString(jSONObject, "paymentUrl"));
        bot.setLoggedInUrl(parseString(jSONObject, "loggedInUrl"));
        bot.setScript(parseString(jSONObject, "script"));
        bot.setLoginScript(parseString(jSONObject, "loginScript"));
        bot.setLoggedInScript(parseString(jSONObject, "loggedInScript"));
        bot.setPath(parseString(jSONObject, "path"));
        bot.setLoginPath(parseString(jSONObject, "loginPath"));
        bot.setCallbackUrl(parseString(jSONObject, "callbackUrl"));
        bot.setCallbackScript(parseString(jSONObject, "callbackScript"));
        bot.setCallbackPath(parseString(jSONObject, "callbackPath"));
        bot.setCustomLoginScript(parseString(jSONObject, "customLoginScript"));
        bot.setCheckLoginScript(parseString(jSONObject, "checkLoginScript"));
        bot.setCustomScripts(parseString(jSONObject, "customScripts"));
        bot.setParsedCustomScripts(parseString(jSONObject, "parsedCustomScripts"));
        bot.setLogoURL(parseString(jSONObject, "logoURL"));
        bot.setCheckLoginPath(parseString(jSONObject, "checkLoginPath"));
        bot.setDetached(java.lang.Boolean.valueOf(jSONObject.optBoolean("isDetached")));
        return bot;
    }

    public static int parseBoolean(org.json.JSONObject jSONObject, java.lang.String str) {
        if (!jSONObject.has(str)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt(jSONObject.getString(str).toLowerCase()) != 0 ? 1 : 0;
        } catch (java.lang.NumberFormatException e) {
            e.getMessage();
            try {
                return java.lang.Boolean.parseBoolean(jSONObject.getString(str)) ? 1 : 0;
            } catch (org.json.JSONException e2) {
                e2.getMessage();
                return 0;
            }
        } catch (org.json.JSONException e3) {
            e3.getMessage();
            return 0;
        }
    }

    public static java.lang.String parseString(org.json.JSONObject jSONObject, java.lang.String str) {
        if (!jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (org.json.JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public boolean androidLoggedInUrlSameAs(java.lang.String str) {
        if (!isAndroidLoggedInUrlRegexSet()) {
            return (str == null || getAndroidLoggedInUrl() == null || getAndroidLoggedInUrl().isEmpty() || !str.equals(getAndroidLoggedInUrl())) ? false : true;
        }
        try {
            return java.util.regex.Pattern.compile(hasAndroidLoggedInUrlRegex() ? getAndroidLoggedInUrlRegex() : getAndroidLoggedInUrl()).matcher(str).matches();
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    public boolean checkEmailLinkIsValid(java.lang.String str) {
        try {
            if (isLoginLinkRegexSet()) {
                return java.util.regex.Pattern.compile(getLoginLinkRegex()).matcher(str).matches();
            }
            return false;
        } catch (java.util.regex.PatternSyntaxException | java.lang.Exception unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.google.gson.JsonObject fetchGlobalSettings() {
        com.google.gson.JsonObject allSettings = getAllSettings();
        if (allSettings == null || !allSettings.has("globalSettings")) {
            return null;
        }
        return allSettings.getAsJsonObject("globalSettings");
    }

    public boolean genericLoggedInUrlSameAs(java.lang.String str) {
        if (!isLoggedInUrlRegexSet()) {
            return str != null && hasLoggedInUrl() && str.equals(this.loggedInUrl);
        }
        try {
            return java.util.regex.Pattern.compile(hasLoggedInUrlRegex() ? getLoggedInUrlRegex() : this.loggedInUrl).matcher(str).matches();
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    public java.lang.String getAccountsHost() {
        try {
            return this.allSettings.get("accountsHost").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public com.google.gson.JsonObject getAllSettings() {
        return this.allSettings;
    }

    public boolean getAllowChromeClientWindow() {
        if (this.allSettings.has("allowChromeClientWindow")) {
            return this.allSettings.get("allowChromeClientWindow").getAsBoolean();
        }
        return false;
    }

    public java.lang.String getAmazonPopUpUserAgent() {
        try {
            return this.allSettings.get("amazonPopUpUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getAmazonUserAgent() {
        try {
            return this.allSettings.get("amazonUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getAndroidChromeScriptTriggers() {
        try {
            return this.allSettings.get("androidChromeScriptTriggers").getAsJsonObject().toString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getAndroidFbSSO() {
        try {
            return this.allSettings.get("androidFbSso").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getAndroidLoggedInUrl() {
        try {
            return this.allSettings.get("androidLoggedInUrl").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getAndroidLoggedInUrlRegex() {
        try {
            return this.allSettings.get("androidLoggedInUrlRegex").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.util.List<com.knotapi.knot.models.PageActions> getAndroidPageActions() {
        try {
            if (getAllSettings().get("androidPageActions") == null) {
                return null;
            }
            com.google.gson.JsonArray asJsonArray = getAllSettings().get("androidPageActions").getAsJsonArray();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add((com.knotapi.knot.models.PageActions) this.gson.fromJson(it.next(), com.knotapi.knot.models.PageActions.class));
            }
            return arrayList;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String getAndroidPaymentUrl() {
        try {
            return this.allSettings.get("androidPaymentUrl").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getAndroidSSOGlobal() {
        java.lang.String asString;
        com.google.gson.JsonElement parseString;
        try {
            if (!getGlobalSettings().has("android_sso") || (asString = getGlobalSettings().get("android_sso").getAsString()) == null || (parseString = com.google.gson.JsonParser.parseString(asString)) == null || !parseString.isJsonObject()) {
                return com.knotapi.knot.utilities.Constants.androidSSOUserAgent;
            }
            com.google.gson.JsonObject asJsonObject = parseString.getAsJsonObject();
            return asJsonObject.has("user_agent") ? asJsonObject.get("user_agent").toString().replace("\"", "") : com.knotapi.knot.utilities.Constants.androidSSOUserAgent;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return com.knotapi.knot.utilities.Constants.androidSSOUserAgent;
        }
    }

    public java.lang.String getAndroidScriptTriggers() {
        try {
            return this.allSettings.get("androidScriptTriggers").getAsJsonObject().toString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getAndroidUserAgent() {
        try {
            return this.allSettings.get("androidUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public com.google.gson.JsonElement getBlockedUrls() {
        return com.knotapi.knot.utilities.Helper.getJsonParam(this, "block_requests", "block_requests");
    }

    public int getBotId() {
        return this.botId;
    }

    public java.lang.String getCallbackPath() {
        return this.callbackPath;
    }

    public java.lang.String getCallbackScript() {
        return this.callbackScript;
    }

    public java.lang.String getCallbackUrl() {
        return this.callbackUrl;
    }

    public java.lang.String getCheckLoginPath() {
        return this.checkLoginPath;
    }

    public java.lang.String getCheckLoginScript() {
        return this.checkLoginScript;
    }

    public java.lang.String getChromeDisableLinks() {
        try {
            return this.allSettings.get("ChromeDisableLinks").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getChromeRemoveElements() {
        try {
            return this.allSettings.get("ChromeRemoveElements").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean getCleanCookies() {
        try {
            return getAllSettings().get("getCleanCookies").getAsBoolean();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public java.lang.String getConfirmationErrorMessage() {
        try {
            return this.allSettings.get("confirmationErrorMessage").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getConfirmationErrorTitle() {
        try {
            return this.allSettings.get("confirmationErrorTitle").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getCookieActions() {
        try {
            return this.allSettings.get("cookiesActions").toString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean getCredentialTracking() {
        if (this.allSettings.has("credentialTracking")) {
            return this.allSettings.get("credentialTracking").getAsBoolean();
        }
        return false;
    }

    public java.lang.String getCustomLoginScript() {
        return this.customLoginScript;
    }

    public java.lang.String getCustomScripts() {
        return this.customScripts;
    }

    public java.lang.String getCustomUserAgent() {
        try {
            return this.allSettings.get("userAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.Boolean getDetached() {
        return this.isDetached;
    }

    public java.lang.String getDisableLinks() {
        try {
            return this.allSettings.get("disableLinks").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public com.knotapi.knot.models.ErrorViewActions getErrorViewActions() {
        try {
            if (getAllSettings().get("errorViewActions") == null) {
                return null;
            }
            com.google.gson.JsonObject asJsonObject = getAllSettings().get("errorViewActions").getAsJsonObject();
            com.knotapi.knot.models.ErrorViewActions errorViewActions = new com.knotapi.knot.models.ErrorViewActions();
            errorViewActions.setUrl(asJsonObject.get("url").getAsString());
            errorViewActions.setIsUrlRegex(asJsonObject.get("isUrlRegex").getAsBoolean());
            errorViewActions.setErrorView(asJsonObject.get("errorView").getAsJsonObject());
            return errorViewActions;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String getFacebookPopUpUserAgent() {
        try {
            return this.allSettings.get("PopUpUserAgentFacebook").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getFacebookUserAgent() {
        try {
            return this.allSettings.get("facebookUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public com.google.gson.JsonObject getGlobalSettings() {
        return this.globalSettings;
    }

    public java.lang.String getGooglePopUpUserAgent() {
        try {
            return this.allSettings.get("googlePopUpUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getGoogleUserAgent() {
        try {
            return this.allSettings.get("googleUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean getHasLocalStorage() {
        return (getIsUsingLocalStorage() == null || getIsUsingLocalStorage().isEmpty() || getIsUsingLocalStorage().equals("null")) ? false : true;
    }

    public boolean getHasSessionStorage() {
        return (getIsUsingSessionStorage() == null || getIsUsingSessionStorage().isEmpty() || getIsUsingSessionStorage().equals("null")) ? false : true;
    }

    public java.lang.String getHiddenPagesPattern() {
        try {
            return this.allSettings.get("hiddenPagesPattern").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getHomePage() {
        try {
            return this.allSettings.get("homePage").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getIgnoreDomains() {
        try {
            return getAllSettings().has("ignoreDomains") ? getAllSettings().get("ignoreDomains").getAsString() : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public java.lang.String getInterceptIntentUrl() {
        try {
            return this.allSettings.get("interceptIntentUrl").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.util.List<com.knotapi.knot.models.Interceptor> getInterceptorRules() {
        if (!this.interceptorsList.isEmpty()) {
            return this.interceptorsList;
        }
        try {
            java.util.Iterator<com.google.gson.JsonElement> it = getAllSettings().get("interceptor").getAsJsonArray().iterator();
            while (it.hasNext()) {
                this.interceptorsList.add((com.knotapi.knot.models.Interceptor) this.gson.fromJson(it.next(), com.knotapi.knot.models.Interceptor.class));
            }
            return this.interceptorsList;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return null;
        }
    }

    public int getIsAndroidLoggedInUrlRegex() {
        try {
            return this.allSettings.get("isAndroidLoggedInUrlRegex").getAsInt();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public int getIsLoggedInUrlRegex() {
        try {
            return this.allSettings.get("isLoggedInUrlRegex").getAsInt();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public java.lang.String getIsUsingLocalStorage() {
        try {
            return this.allSettings.get("isUsingLocalStorage").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getIsUsingSessionStorage() {
        try {
            return this.allSettings.get("isUsingSessionStorage").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getLogInUrlRegex() {
        try {
            return this.allSettings.get("logInUrlRegex").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getLoggedInPredicate() {
        try {
            return this.allSettings.get("loggedInPredicate").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getLoggedInScript() {
        return this.loggedInScript;
    }

    public java.lang.String getLoggedInUrl() {
        return this.loggedInUrl;
    }

    public java.lang.String getLoggedInUrlRegex() {
        try {
            return this.allSettings.get("loggedInUrlRegex").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getLoginLinkRegex() {
        try {
            return this.allSettings.get("loginLinkRegex").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getLoginPath() {
        return this.loginPath;
    }

    public java.lang.String getLoginScript() {
        return this.loginScript;
    }

    public java.lang.String getLoginType() {
        try {
            return this.allSettings.get("loginType").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getLoginUrl() {
        return this.loginUrl;
    }

    public java.lang.String getLoginUrlAndroid() {
        try {
            return this.allSettings.get("loginUrlAndroid").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getLogoURL() {
        return this.logoURL;
    }

    public int getMerchantCount() {
        return this.merchantCount;
    }

    public int getMerchantId() {
        return this.merchantId;
    }

    public java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public java.lang.String getNoSubscriptionUrl() {
        try {
            return this.allSettings.get("noSubscriptionUrl").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getParsedCustomScripts() {
        return this.parsedCustomScripts;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public java.lang.String getPaymentUrl() {
        return this.paymentUrl;
    }

    public java.lang.String getPaymentUrlAndroid() {
        try {
            return this.allSettings.get("paymentUrlAndroid").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getPaymentUrlRegex() {
        try {
            return this.allSettings.get("paymentUrlRegex").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getPaymentsRedirectUrl() {
        try {
            return this.allSettings.get("paymentsRedirect").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getReauthUrl() {
        try {
            return this.allSettings.get("reauthUrl").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getRemoveElements() {
        try {
            return this.allSettings.get("removeElements").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getScript() {
        return this.script;
    }

    public java.lang.String getSignUpPage() {
        try {
            return this.allSettings.get("signUpPage").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getSpotifyUserAgent() {
        try {
            return this.allSettings.get("SpotifyUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public com.google.gson.JsonObject getStorageErrorViewJson() {
        java.lang.String asString;
        com.google.gson.JsonElement parseString;
        try {
            if (getGlobalSettings().has("error_view_json") && (asString = getGlobalSettings().get("error_view_json").getAsString()) != null && !asString.isEmpty() && (parseString = com.google.gson.JsonParser.parseString(asString.replace("\\\"", "\""))) != null && parseString.isJsonObject()) {
                return parseString.getAsJsonObject();
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return new com.google.gson.JsonObject();
    }

    public com.google.gson.JsonObject getTheme() {
        return com.google.gson.JsonParser.parseString(this.theme).getAsJsonObject();
    }

    public java.lang.String getTransactionsUrl() {
        try {
            return this.allSettings.get("transactionsUrl").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getUserAgent(com.knotapi.knot.webview.KnotView knotView) {
        return isUseAndroidDefaultUserAgent() ? knotView.getSettings().getUserAgentString() : hasAndroidUserAgent() ? getAndroidUserAgent() : hasUserAgent() ? getCustomUserAgent() : com.knotapi.knot.utilities.Constants.operaUserAgent;
    }

    public java.lang.String getVisiblePagesPattern() {
        try {
            return this.allSettings.get("visiblePagesPattern").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getXPopUpUserAgent() {
        try {
            return this.allSettings.get("xPopUpUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public java.lang.String getXUserAgent() {
        try {
            return this.allSettings.get("xUserAgent").getAsString();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean hasAmazonPopUpUserAgent() {
        return (getAmazonPopUpUserAgent() == null || getAmazonPopUpUserAgent().isEmpty() || getAmazonPopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasAmazonUserAgent() {
        return (getAmazonUserAgent() == null || getAmazonUserAgent().isEmpty() || getAmazonUserAgent().equals("null")) ? false : true;
    }

    public boolean hasAndroidLoggedInUrlRegex() {
        return (getAndroidLoggedInUrlRegex() == null || getAndroidLoggedInUrlRegex().isEmpty() || getAndroidLoggedInUrlRegex().equals("null")) ? false : true;
    }

    public boolean hasAndroidUserAgent() {
        return (getAndroidUserAgent() == null || getAndroidUserAgent().isEmpty() || getAndroidUserAgent().equals("null")) ? false : true;
    }

    public boolean hasCheckLoginScript() {
        java.lang.String str = this.checkLoginScript;
        return (str == null || str.isEmpty() || this.checkLoginScript.equals("null")) ? false : true;
    }

    public boolean hasChromeDisableLinks() {
        return (getChromeDisableLinks() == null || getChromeDisableLinks().isEmpty() || getChromeDisableLinks().equals("null")) ? false : true;
    }

    public boolean hasChromeRemoveElements() {
        return (getChromeRemoveElements() == null || getChromeRemoveElements().isEmpty() || getChromeRemoveElements().equals("null")) ? false : true;
    }

    public boolean hasClearLocalAndWebStorage() {
        return getAllSettings().has("clearLocalAndWebStorage") && getAllSettings().get("clearLocalAndWebStorage").getAsBoolean();
    }

    public boolean hasCookieActions() {
        return (getCookieActions() == null || getCookieActions().isEmpty() || getCookieActions().equals("null")) ? false : true;
    }

    public boolean hasCustomLoginScript() {
        java.lang.String str = this.customLoginScript;
        return (str == null || str.isEmpty() || this.customLoginScript.equals("null")) ? false : true;
    }

    public boolean hasDisableLinks() {
        return (getDisableLinks() == null || getDisableLinks().isEmpty() || getDisableLinks().equals("null")) ? false : true;
    }

    public boolean hasFacebookPopUpUserAgent() {
        return (getFacebookPopUpUserAgent() == null || getFacebookPopUpUserAgent().isEmpty() || getFacebookPopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasFacebookUserAgent() {
        return (getFacebookUserAgent() == null || getFacebookUserAgent().isEmpty() || getFacebookUserAgent().equals("null")) ? false : true;
    }

    public boolean hasGetCleanCookies() {
        return getAllSettings().has("getCleanCookies");
    }

    public boolean hasGooglePopUpUserAgent() {
        return (getGooglePopUpUserAgent() == null || getGooglePopUpUserAgent().isEmpty() || getGooglePopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasGoogleUserAgent() {
        return (getGoogleUserAgent() == null || getGoogleUserAgent().isEmpty() || getGoogleUserAgent().equals("null")) ? false : true;
    }

    public boolean hasHiddenPagesPattern() {
        return (getHiddenPagesPattern() == null || getHiddenPagesPattern().isEmpty() || getHiddenPagesPattern().equals("null")) ? false : true;
    }

    public boolean hasIgnoreDomains() {
        java.lang.String ignoreDomains = getIgnoreDomains();
        return (ignoreDomains == null || ignoreDomains.isEmpty() || ignoreDomains.equals("null")) ? false : true;
    }

    public boolean hasLogInUrlRegex() {
        return (getLogInUrlRegex() == null || getLogInUrlRegex().isEmpty() || getLogInUrlRegex().equals("null")) ? false : true;
    }

    public boolean hasLoggedInPredicate() {
        return (getLoggedInPredicate() == null || getLoggedInPredicate().isEmpty() || getLoggedInPredicate().equals("null")) ? false : true;
    }

    public boolean hasLoggedInUrl() {
        java.lang.String str = this.loggedInUrl;
        return (str == null || str.isEmpty() || this.loggedInUrl.equals("null")) ? false : true;
    }

    public boolean hasLoggedInUrlRegex() {
        return (getLoggedInUrlRegex() == null || getLoggedInUrlRegex().isEmpty() || getLoggedInUrlRegex().equals("null")) ? false : true;
    }

    public boolean hasLoginScript() {
        java.lang.String str = this.loginScript;
        return (str == null || str.isEmpty() || this.loginScript.equals("null")) ? false : true;
    }

    public boolean hasNoSubscriptionUrl() {
        return (getNoSubscriptionUrl() == null || getNoSubscriptionUrl().isEmpty() || getNoSubscriptionUrl().equals("null")) ? false : true;
    }

    public boolean hasPaymentUrlAndroid() {
        return (getPaymentUrlAndroid() == null || getPaymentUrlAndroid().isEmpty() || getPaymentUrlAndroid().equals("null")) ? false : true;
    }

    public boolean hasPaymentsRedirectUrl() {
        return (getPaymentsRedirectUrl() == null || getPaymentsRedirectUrl().isEmpty() || getPaymentsRedirectUrl().equals("null")) ? false : true;
    }

    public boolean hasRemoveElements() {
        return (getRemoveElements() == null || getRemoveElements().isEmpty() || getRemoveElements().equals("null")) ? false : true;
    }

    public boolean hasRequiredCookies() {
        com.google.gson.JsonObject asJsonObject = getAllSettings().getAsJsonObject("cookiesActions");
        return (!asJsonObject.has("requiredCookies") || asJsonObject.getAsJsonArray("requiredCookies") == null || asJsonObject.getAsJsonArray("requiredCookies").isJsonNull() || asJsonObject.getAsJsonArray("requiredCookies").isEmpty()) ? false : true;
    }

    public boolean hasSpotifyUserAgent() {
        return (getSpotifyUserAgent() == null || getSpotifyUserAgent().isEmpty() || getSpotifyUserAgent().equals("null")) ? false : true;
    }

    public boolean hasSupportDeepLinks() {
        return getAllSettings().has("supportDeepLinks");
    }

    public boolean hasUserAgent() {
        return (getCustomUserAgent() == null || getCustomUserAgent().isEmpty() || getCustomUserAgent().equals("null")) ? false : true;
    }

    public boolean hasVisiblePagesPattern() {
        java.lang.String visiblePagesPattern = getVisiblePagesPattern();
        return (visiblePagesPattern == null || visiblePagesPattern.isEmpty() || visiblePagesPattern.equals("null")) ? false : true;
    }

    public boolean hasXPopUpUserAgent() {
        return (getXPopUpUserAgent() == null || getXPopUpUserAgent().isEmpty() || getXPopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasXUserAgent() {
        return (getXUserAgent() == null || getXUserAgent().isEmpty() || getXUserAgent().equals("null")) ? false : true;
    }

    public boolean isAndroidChromeScriptTriggersSet() {
        return (getAndroidChromeScriptTriggers() == null || getAndroidChromeScriptTriggers().isEmpty() || getAndroidChromeScriptTriggers().equals("null")) ? false : true;
    }

    public boolean isAndroidLoggedInUrlRegexSet() {
        return getIsAndroidLoggedInUrlRegex() == 1 || hasAndroidLoggedInUrlRegex();
    }

    public boolean isAndroidScriptTriggersSet() {
        return (getAndroidScriptTriggers() == null || getAndroidScriptTriggers().isEmpty() || getAndroidScriptTriggers().equals("null")) ? false : true;
    }

    public boolean isCheckLoggedInInLoadResource() {
        try {
            return this.allSettings.get("checkLoggedInInLoadResource").getAsInt() == 1;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCheckLoggedInWithAndroidUrlContains() {
        try {
            return this.allSettings.get("checkLoggedInWithAndroidUrlContains").getAsInt() == 1;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCheckLoggedInWithAndroidUrlEquals() {
        try {
            return this.allSettings.get("checkLoggedInWithAndroidUrlEquals").getAsInt() == 1;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCheckLoggedInWithLoggedInUrlContains() {
        try {
            return this.allSettings.get("checkLoggedInWithLoggedInUrlContains").getAsInt() == 1;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isClearLocalAndWebStorage() {
        try {
            return getAllSettings().get("clearLocalAndWebStorage").getAsBoolean();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCustomScriptsSet() {
        java.lang.String str = this.customScripts;
        return (str == null || str.isEmpty() || this.customScripts.equals("null")) ? false : true;
    }

    public boolean isDetectLoginUsingCookiesAndLoggedInUrl() {
        try {
            return this.allSettings.get("detectLoginUsingCookiesAndLoggedInUrl").getAsInt() == 1;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isInterceptRedirectionIntent() {
        try {
            return this.allSettings.get("interceptRedirectionIntent").getAsBoolean();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isLoadNoCacheMode() {
        try {
            return this.allSettings.get("loadNoCacheMode").getAsInt() == 1;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isLoggedInUrlRegexSet() {
        return getIsLoggedInUrlRegex() == 1 || hasLoggedInUrlRegex();
    }

    public boolean isLoginLinkRegexSet() {
        return (getLoginLinkRegex() == null || getLoginLinkRegex().isEmpty() || getLoginLinkRegex().equals("null")) ? false : true;
    }

    public boolean isLoginTypeAndroid() {
        try {
            return getLoginType().equals(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isNoCORSMode() {
        try {
            return this.allSettings.get("noCorsMode").getAsBoolean();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isPaymentUrlSet() {
        java.lang.String str = this.paymentUrl;
        return (str == null || str.isEmpty() || this.paymentUrl.equals("null")) ? false : true;
    }

    public boolean isStorageRequired() {
        try {
            return getAllSettings().get("isStorageRequired").getAsBoolean();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isSupportDeepLinks() {
        try {
            return getAllSettings().get("supportDeepLinks").getAsBoolean();
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isTransactionsUrlSet() {
        return (getTransactionsUrl() == null || getTransactionsUrl().isEmpty() || getTransactionsUrl().equals("null")) ? false : true;
    }

    public boolean isUseAndroidDefaultUserAgent() {
        try {
            return this.allSettings.get("defaultUserAgent").getAsInt() == 1;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean logInUrlSameAs(java.lang.String str) {
        if (!hasLogInUrlRegex()) {
            return str != null && hasLogInUrlRegex() && str.equals(this.loginUrl);
        }
        try {
            return java.util.regex.Pattern.compile(hasLogInUrlRegex() ? getLogInUrlRegex() : this.loginUrl).matcher(str).matches();
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    public boolean loggedInUrlSameAs(java.lang.String str) {
        try {
            return ((getAndroidLoggedInUrl() == null || getAndroidLoggedInUrl().isEmpty()) && !isAndroidLoggedInUrlRegexSet()) ? genericLoggedInUrlSameAs(str) : androidLoggedInUrlSameAs(str);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean noSubscriptionUrlSameAs(java.lang.String str) {
        if (!hasNoSubscriptionUrl()) {
            return hasNoSubscriptionUrl() && getNoSubscriptionUrl() != null && (str.equals(getNoSubscriptionUrl()) || str.contains(getNoSubscriptionUrl()));
        }
        try {
            return java.util.regex.Pattern.compile(getNoSubscriptionUrl()).matcher(str).matches();
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    public boolean paymentUrlSameAs(java.lang.String str) {
        if (getPaymentUrlRegex() != null && !getPaymentUrlRegex().isEmpty()) {
            try {
                return java.util.regex.Pattern.compile(getPaymentUrlRegex()).matcher(str).matches();
            } catch (java.util.regex.PatternSyntaxException unused) {
                return false;
            }
        }
        if (isPaymentUrlSet()) {
            java.lang.String paymentUrlAndroid = hasPaymentUrlAndroid() ? getPaymentUrlAndroid() : this.paymentUrl;
            return str.contains(paymentUrlAndroid) || str.startsWith(paymentUrlAndroid);
        }
        return false;
    }

    public void setAllSettings(com.google.gson.JsonObject jsonObject) {
        this.allSettings = jsonObject;
    }

    public void setBotId(int i) {
        this.botId = i;
    }

    public void setCallbackPath(java.lang.String str) {
        this.callbackPath = str;
    }

    public void setCallbackScript(java.lang.String str) {
        this.callbackScript = str;
    }

    public void setCallbackUrl(java.lang.String str) {
        this.callbackUrl = str;
    }

    public void setCheckLoginPath(java.lang.String str) {
        this.checkLoginPath = str;
    }

    public void setCheckLoginScript(java.lang.String str) {
        this.checkLoginScript = str;
    }

    public void setCustomLoginScript(java.lang.String str) {
        this.customLoginScript = str;
    }

    public void setCustomScripts(java.lang.String str) {
        this.customScripts = str;
    }

    public void setDetached(java.lang.Boolean bool) {
        this.isDetached = bool;
    }

    public void setGlobalSettings(com.google.gson.JsonObject jsonObject) {
        this.globalSettings = jsonObject;
    }

    public void setLoggedInScript(java.lang.String str) {
        this.loggedInScript = str;
    }

    public void setLoggedInUrl(java.lang.String str) {
        this.loggedInUrl = str;
    }

    public void setLoginPath(java.lang.String str) {
        this.loginPath = str;
    }

    public void setLoginScript(java.lang.String str) {
        this.loginScript = str;
    }

    public void setLoginUrl(java.lang.String str) {
        this.loginUrl = str;
    }

    public void setLogoURL(java.lang.String str) {
        this.logoURL = str;
    }

    public void setMerchantCount(int i) {
        this.merchantCount = i;
    }

    public void setMerchantId(int i) {
        this.merchantId = i;
    }

    public void setMerchantName(java.lang.String str) {
        this.merchantName = str;
    }

    public void setParsedCustomScripts(java.lang.String str) {
        this.parsedCustomScripts = str;
    }

    public void setPath(java.lang.String str) {
        this.path = str;
    }

    public void setPaymentUrl(java.lang.String str) {
        this.paymentUrl = str;
    }

    public void setScript(java.lang.String str) {
        this.script = str;
    }

    public void setTheme(java.lang.String str) {
        this.theme = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.botId);
        parcel.writeInt(this.merchantId);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.theme);
        parcel.writeString(this.loginUrl);
        parcel.writeString(this.paymentUrl);
        parcel.writeString(this.loggedInUrl);
        parcel.writeString(this.script);
        parcel.writeString(this.loginScript);
        parcel.writeString(this.loggedInScript);
        parcel.writeString(this.path);
        parcel.writeString(this.loginPath);
        parcel.writeString(this.callbackUrl);
        parcel.writeString(this.callbackScript);
        parcel.writeString(this.callbackPath);
        parcel.writeString(this.customLoginScript);
        parcel.writeString(this.checkLoginScript);
        parcel.writeString(this.customScripts);
        parcel.writeString(this.parsedCustomScripts);
        parcel.writeString(this.logoURL);
        parcel.writeString(this.checkLoginPath);
    }

    public java.lang.String getFacebookUserAgent(java.lang.String str) {
        return hasFacebookUserAgent() ? getFacebookUserAgent() : str;
    }

    public Bot(android.os.Parcel parcel) {
        this.botId = parcel.readInt();
        this.merchantId = parcel.readInt();
        this.merchantName = parcel.readString();
        this.theme = parcel.readString();
        this.loginUrl = parcel.readString();
        this.paymentUrl = parcel.readString();
        this.loggedInUrl = parcel.readString();
        this.script = parcel.readString();
        this.loginScript = parcel.readString();
        this.loggedInScript = parcel.readString();
        this.path = parcel.readString();
        this.loginPath = parcel.readString();
        this.callbackUrl = parcel.readString();
        this.callbackScript = parcel.readString();
        this.callbackPath = parcel.readString();
        this.customLoginScript = parcel.readString();
        this.checkLoginScript = parcel.readString();
        this.customScripts = parcel.readString();
        this.parsedCustomScripts = parcel.readString();
        this.logoURL = parcel.readString();
        this.checkLoginPath = parcel.readString();
    }
}
