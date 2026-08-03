package com.helpshift.config;

/* loaded from: classes.dex */
public class HSConfigManager {
    private static final int BC_LOG_MSG_LIMIT = 5000;
    private static final java.lang.String HELPCENTER = "helpcenter";
    private static final int LOG_LIMIT = 100;
    private static final java.lang.String TAG = "ConfigMangr";
    private static final int USER_TRAIL_LIMIT = 10;
    private static final int USER_TRAIL_LIST_LIMIT = 10;
    private static final java.lang.String WEBCHAT = "webchat";
    private final com.helpshift.platform.Device device;
    private boolean hcIsSandbox;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final com.helpshift.user.UserManager userManager;
    private java.lang.String webViewVersion;
    private final com.helpshift.analytics.HSWebchatAnalyticsManager webchatAnalyticsManager;
    private final java.util.ArrayList<org.json.JSONObject> debugLogs = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.String> userTrailList = new java.util.ArrayList<>();

    public HSConfigManager(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.analytics.HSWebchatAnalyticsManager hSWebchatAnalyticsManager, com.helpshift.platform.Device device, com.helpshift.user.UserManager userManager) {
        this.persistentStorage = hSPersistentStorage;
        this.webchatAnalyticsManager = hSWebchatAnalyticsManager;
        this.device = device;
        this.userManager = userManager;
    }

    public void saveInstallKeys(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str2.split("\\.", 2);
        this.persistentStorage.setDomain(split[0].trim());
        this.persistentStorage.setHost(split[1].trim());
        this.persistentStorage.setPlatformId(str);
    }

    public java.lang.String getPlatformId() {
        return this.persistentStorage.getPlatformId();
    }

    public java.lang.String getDomain() {
        return this.persistentStorage.getDomain();
    }

    public java.lang.String getHost() {
        return this.persistentStorage.getHost();
    }

    public void saveConfig(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.persistentStorage.setConfig(com.helpshift.util.JsonUtils.mapToJsonString(map));
    }

    public void saveLocalProactiveConfig(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.persistentStorage.setLocalProactiveConfig(com.helpshift.util.JsonUtils.mapToJsonString(map));
    }

    public void saveLanguage(java.lang.String str) {
        this.persistentStorage.setLanguage(str);
    }

    public void saveUiConfigDataOfWebchat(java.lang.String str) {
        saveUiConfigDataFor("webchat", str);
    }

    public void saveUiConfigDataOfHelpcenter(java.lang.String str) {
        saveUiConfigDataFor("helpcenter", str);
    }

    public java.lang.String getUiConfigDataOfWebchat() {
        return getUiConfigDataFor("webchat");
    }

    public java.lang.String getUiConfigDataOfHelpcenter() {
        return getUiConfigDataFor("helpcenter");
    }

    private void saveUiConfigDataFor(java.lang.String str, java.lang.String str2) {
        if (com.helpshift.util.Utils.isEmpty(str2) || !com.helpshift.util.JsonUtils.isValidJsonString(str2)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if ("webchat".equals(str)) {
                this.persistentStorage.setWebchatUiConfigData(jSONObject.toString());
            } else if ("helpcenter".equals(str)) {
                this.persistentStorage.setHelpcenterUiConfigData(jSONObject.toString());
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "error in saving the ui config data for " + str, e);
        }
    }

    private java.lang.String getUiConfigDataFor(java.lang.String str) {
        if ("webchat".equals(str)) {
            return this.persistentStorage.getWebchatUiConfigData();
        }
        if (!"helpcenter".equals(str)) {
            return "";
        }
        return this.persistentStorage.getHelpcenterUiConfigData();
    }

    public java.lang.String getHelpcenterConfigJs(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        org.json.JSONObject helpshiftConfig = getHelpshiftConfig(false, str3);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (com.helpshift.util.Utils.isNotEmpty(str)) {
                jSONObject.put("faqId", str);
            }
            if (com.helpshift.util.Utils.isNotEmpty(str2)) {
                jSONObject.put("sectionId", str2);
            }
            if (z) {
                jSONObject.put("showChatIcon", false);
            } else if (this.userManager.shouldShowChatIconInHelpcenter()) {
                jSONObject.put("showChatIcon", true);
            }
            java.lang.String additionalHelpcenterData = this.persistentStorage.getAdditionalHelpcenterData();
            if (com.helpshift.util.Utils.isNotEmpty(additionalHelpcenterData) && com.helpshift.util.JsonUtils.isValidJsonString(additionalHelpcenterData)) {
                jSONObject.put("additionalInfo", new org.json.JSONObject(additionalHelpcenterData));
            }
            if (this.hcIsSandbox) {
                jSONObject.put("hcIsSandbox", true);
            }
            helpshiftConfig.put("helpcenterConfig", jSONObject);
            return helpshiftConfig.toString();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in generating the helpcenter config", e);
            return helpshiftConfig.toString();
        }
    }

    public java.lang.String getWebchatConfigJs(boolean z, java.lang.String str) {
        return getHelpshiftConfig(z, str).toString();
    }

    private org.json.JSONObject getHelpshiftConfig(boolean z, java.lang.String str) {
        java.lang.String platformId = getPlatformId();
        java.lang.String domain = getDomain();
        java.lang.String config = this.persistentStorage.getConfig();
        org.json.JSONObject liteSdkConfig = getLiteSdkConfig(z);
        if (com.helpshift.util.Utils.isEmpty(config)) {
            config = "{}";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(config);
            jSONObject.put("platformId", platformId);
            jSONObject.put(com.ironsource.X3.j.D, domain);
            addWidgetOption(jSONObject);
            addLanguage(jSONObject);
            addUserConfig(jSONObject);
            addClearAnonymousUserConfig(jSONObject);
            addSDKSource(jSONObject, str);
            addWebViewVersion(jSONObject);
            addIsBreadcrumbsOrDebugLogsAvailable(liteSdkConfig);
            if (com.helpshift.util.ConfigValues.SOURCE_PROACTIVE.equals(str)) {
                addConfigForSubsequentProactiveIssues(jSONObject);
            }
            addAnonUserIdToLiteSDKConfig(liteSdkConfig);
            if (!this.userTrailList.isEmpty()) {
                jSONObject.put("userTrail", new org.json.JSONArray((java.util.Collection) this.userTrailList));
            }
            jSONObject.put("liteSdkConfig", liteSdkConfig);
            addTokenForUserWithIdentity(jSONObject);
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in creating the config object", e);
            return new org.json.JSONObject();
        }
    }

    private void addIsBreadcrumbsOrDebugLogsAvailable(org.json.JSONObject jSONObject) {
        boolean z = true;
        org.json.JSONArray breadCrumbs = getBreadCrumbs(1);
        org.json.JSONArray debugLogs = getDebugLogs(1);
        if (breadCrumbs.length() <= 0 && debugLogs.length() <= 0) {
            z = false;
        }
        jSONObject.put(com.helpshift.util.ConfigValues.BREADCRUMBS_OR_LOGS_AVAILABLE, z);
    }

    private void addTokenForUserWithIdentity(org.json.JSONObject jSONObject) {
        if (this.userManager.getCurrentUser() instanceof com.helpshift.user.UserWithIdentity) {
            com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) this.userManager.getCurrentUser();
            jSONObject.put("accessToken", userWithIdentity.getAccessToken());
            jSONObject.put("refreshToken", userWithIdentity.getRefreshToken());
        }
    }

    private void addAnonUserIdToLiteSDKConfig(org.json.JSONObject jSONObject) {
        if (com.helpshift.util.Utils.isNotEmpty(this.persistentStorage.getAnonymousUserIdMap())) {
            java.lang.String str = (java.lang.String) com.helpshift.util.JsonUtils.jsonStringToMap(this.persistentStorage.getAnonymousUserIdMap()).get("userId");
            if (com.helpshift.util.Utils.isNotEmpty(str)) {
                jSONObject.put("anonUserId", str);
            }
        }
    }

    private void addConfigForSubsequentProactiveIssues(org.json.JSONObject jSONObject) {
        java.lang.String localProactiveConfig = this.persistentStorage.getLocalProactiveConfig();
        if (com.helpshift.util.Utils.isEmpty(localProactiveConfig)) {
            localProactiveConfig = "{}";
        }
        try {
            jSONObject.put("configForSubsequentProactiveIssues", new org.json.JSONObject(localProactiveConfig));
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting local proactive config ", e);
        }
    }

    private void addClearAnonymousUserConfig(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("clearAnonymousUserOnLogin", this.persistentStorage.isClearAnonymousUser());
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "error in setting clear anonymous user flag ", e);
        }
    }

    private void addSDKSource(org.json.JSONObject jSONObject, java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Adding sdk open source value to config : " + str);
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return;
        }
        jSONObject.put("source", str);
    }

    private void addWidgetOption(org.json.JSONObject jSONObject) {
        if (jSONObject.has("widgetOptions")) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("showLauncher", false);
            jSONObject2.put("fullScreen", true);
            jSONObject.put("widgetOptions", jSONObject2);
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting the widget option config", e);
        }
    }

    private void addLanguage(org.json.JSONObject jSONObject) {
        if (jSONObject.has("language")) {
            return;
        }
        try {
            java.lang.String language = this.persistentStorage.getLanguage();
            if (com.helpshift.util.Utils.isEmpty(language)) {
                language = this.device.getLanguage();
            }
            jSONObject.put("language", language);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting the language", e);
        }
    }

    private void addUserConfig(org.json.JSONObject jSONObject) {
        java.lang.String activeUser = this.persistentStorage.getActiveUser();
        if (com.helpshift.util.Utils.isNotEmpty(activeUser)) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(activeUser);
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (org.json.JSONException e) {
                com.helpshift.log.HSLogger.e(TAG, "Error in setting the user config", e);
            }
        }
    }

    private void addWebViewVersion(org.json.JSONObject jSONObject) {
        if (com.helpshift.util.Utils.isEmpty(this.webViewVersion)) {
            return;
        }
        jSONObject.put(com.helpshift.util.ConfigValues.WEBVIEW_VERSION, this.webViewVersion);
    }

    public synchronized void pushBreadCrumb(java.lang.String str) {
        try {
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.ENGLISH).format(new java.util.Date());
            org.json.JSONArray breadCrumbs = this.persistentStorage.getBreadCrumbs();
            if (breadCrumbs == null) {
                breadCrumbs = new org.json.JSONArray();
            }
            if (str.length() > 5000) {
                str = str.substring(0, 5000);
            }
            breadCrumbs.put(jsonifyBreadCrumb(str.trim(), format));
            int length = breadCrumbs.length();
            if (length > 100) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i = length - 100; i <= 100; i++) {
                    jSONArray.put(breadCrumbs.getJSONObject(i));
                }
                breadCrumbs = jSONArray;
            }
            this.persistentStorage.setBreadCrumbs(breadCrumbs.toString());
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error pushing BreadCrumbs", e);
        }
    }

    public synchronized void clearBreadCrumbs() {
        this.persistentStorage.setBreadCrumbs(new org.json.JSONArray().toString());
    }

    private org.json.JSONObject jsonifyBreadCrumb(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("a", str);
        jSONObject.put("d", str2);
        return jSONObject;
    }

    public synchronized void addDebugLog(org.json.JSONObject jSONObject) {
        this.debugLogs.add(jSONObject);
        if (this.debugLogs.size() > 100) {
            try {
                this.debugLogs.remove(this.debugLogs.size() - 101);
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error trimming DebugLog Array", e);
            }
        }
    }

    public synchronized org.json.JSONArray getDebugLogs(int i) {
        org.json.JSONArray jSONArray;
        jSONArray = new org.json.JSONArray();
        try {
            int min = java.lang.Math.min(this.debugLogs.size(), i);
            for (int i2 = 0; i2 < min; i2++) {
                jSONArray.put(this.debugLogs.get(i2));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting DebugLogs.", e);
        }
        return jSONArray;
    }

    public synchronized org.json.JSONArray getBreadCrumbs(int i) {
        org.json.JSONArray jSONArray;
        jSONArray = new org.json.JSONArray();
        try {
            org.json.JSONArray breadCrumbs = this.persistentStorage.getBreadCrumbs();
            int length = breadCrumbs.length();
            for (int i2 = i < length ? length - i : 0; i2 < length; i2++) {
                jSONArray.put(breadCrumbs.get(i2));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting breadcrumbs", e);
        }
        return jSONArray;
    }

    private org.json.JSONObject getLiteSdkConfig(boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String localStorageData = this.persistentStorage.getLocalStorageData();
            if (com.helpshift.util.Utils.isNotEmpty(localStorageData)) {
                jSONObject.put("localStorageData", new org.json.JSONObject(localStorageData));
            }
            jSONObject.put("metaData", generateDeviceMetadata());
            jSONObject.put(com.ironsource.M6.F, this.device.getOsType());
            java.lang.String currentPushToken = this.persistentStorage.getCurrentPushToken();
            if (com.helpshift.util.Utils.isNotEmpty(currentPushToken) && !this.userManager.isPushTokenSynced()) {
                jSONObject.put("pushToken", currentPushToken);
            }
            jSONObject.put("analyticsData", new org.json.JSONObject(this.webchatAnalyticsManager.getAnalyticsDataMap()));
            jSONObject.put("deviceId", this.device.getDeviceId());
            jSONObject.put("launchedFromHelpcenter", z);
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "error in generating liteSdkConfig", e);
            return jSONObject;
        }
    }

    private org.json.JSONObject generateDeviceMetadata() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appVersion", this.device.getAppVersion());
            jSONObject.put("appName", this.device.getAppName());
            jSONObject.put("appIdentifier", this.device.getAppIdentifier());
            jSONObject.put(com.ironsource.X3.j.Y, this.device.getBatteryLevel());
            jSONObject.put("batteryStatus", this.device.getBatteryStatus());
            jSONObject.put("carrierName", this.device.getCarrierName());
            jSONObject.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, this.device.getCountryCode());
            jSONObject.put("networkType", this.device.getNetworkType());
            com.helpshift.util.ValuePair<java.lang.String, java.lang.String> diskSpace = this.device.getDiskSpace();
            jSONObject.put("diskSpace", diskSpace.first);
            jSONObject.put("freeSpace", diskSpace.second);
            jSONObject.put("osVersion", this.device.getOSVersion());
            jSONObject.put("deviceModel", this.device.getDeviceModel());
            jSONObject.put("liteSdkVersion", this.device.getSDKVersion());
            jSONObject.put("pluginType", this.webchatAnalyticsManager.getCommonAnalyticsMap().get(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS));
            java.lang.String str = this.webchatAnalyticsManager.getCommonAnalyticsMap().get("pv");
            if (!com.helpshift.util.Utils.isEmpty(str)) {
                jSONObject.put("pluginVersion", str);
            }
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "error in generating device metadata", e);
        }
        return jSONObject;
    }

    public void setLocalStorageData(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !com.helpshift.util.JsonUtils.isValidJsonString(str)) {
            return;
        }
        try {
            java.lang.String localStorageData = this.persistentStorage.getLocalStorageData();
            if (com.helpshift.util.Utils.isNotEmpty(localStorageData)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(localStorageData);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                this.persistentStorage.saveLocalStorageData(jSONObject2.toString());
                return;
            }
            this.persistentStorage.saveLocalStorageData(str);
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "error in storing local storage data", e);
        }
    }

    public void removeLocalStorageData(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !com.helpshift.util.JsonUtils.isValidJsonString(str)) {
            return;
        }
        java.lang.String localStorageData = this.persistentStorage.getLocalStorageData();
        if (com.helpshift.util.Utils.isEmpty(localStorageData)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("data");
            org.json.JSONObject jSONObject = new org.json.JSONObject(localStorageData);
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String string = jSONArray.getString(i);
                if (jSONObject.has(string)) {
                    jSONObject.remove(string);
                }
            }
            this.persistentStorage.saveLocalStorageData(jSONObject.toString());
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "error in deleting local storage data", e);
        }
    }

    public java.lang.String getLocalStorageData() {
        java.lang.String localStorageData = this.persistentStorage.getLocalStorageData();
        return com.helpshift.util.Utils.isEmpty(localStorageData) ? "{}" : localStorageData;
    }

    public void setAdditionalHelpcenterData(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !com.helpshift.util.JsonUtils.isValidJsonString(str)) {
            return;
        }
        try {
            java.lang.String additionalHelpcenterData = this.persistentStorage.getAdditionalHelpcenterData();
            if (com.helpshift.util.Utils.isNotEmpty(additionalHelpcenterData)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(additionalHelpcenterData);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                this.persistentStorage.saveAdditionalHelpcenterData(jSONObject2.toString());
                return;
            }
            this.persistentStorage.saveAdditionalHelpcenterData(str);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "error in storing additional Helpcenter data", e);
        }
    }

    public java.lang.String getAdditionalInfo() {
        java.lang.String additionalHelpcenterData = this.persistentStorage.getAdditionalHelpcenterData();
        return com.helpshift.util.Utils.isEmpty(additionalHelpcenterData) ? "{}" : additionalHelpcenterData;
    }

    public void removeAdditionalHelpcenterData(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !com.helpshift.util.JsonUtils.isValidJsonString(str)) {
            return;
        }
        java.lang.String additionalHelpcenterData = this.persistentStorage.getAdditionalHelpcenterData();
        if (com.helpshift.util.Utils.isEmpty(additionalHelpcenterData)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("data");
            org.json.JSONObject jSONObject = new org.json.JSONObject(additionalHelpcenterData);
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String string = jSONArray.getString(i);
                if (jSONObject.has(string)) {
                    jSONObject.remove(string);
                }
            }
            this.persistentStorage.saveAdditionalHelpcenterData(jSONObject.toString());
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "error in deleting helpcenter data", e);
        }
    }

    public void addUserTrail(java.lang.String str) {
        if (str.length() > 10) {
            str = str.substring(0, 10);
        }
        if (this.userTrailList.size() < 10) {
            this.userTrailList.add(str);
        } else {
            this.userTrailList.add(str);
            this.userTrailList.remove(0);
        }
    }

    public void clearUserTrail() {
        this.userTrailList.clear();
    }

    public void saveWebViewVersion(java.lang.String str) {
        this.webViewVersion = str;
    }
}
