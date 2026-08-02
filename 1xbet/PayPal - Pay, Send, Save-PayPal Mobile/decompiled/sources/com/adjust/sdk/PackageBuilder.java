package com.adjust.sdk;

/* loaded from: classes7.dex */
public class PackageBuilder {
    private static com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.PackageBuilder.ActivityStateCopy activityStateCopy;
    private com.adjust.sdk.AdjustConfig adjustConfig;
    com.adjust.sdk.AdjustAttribution attribution;
    private long createdAt;
    java.lang.String deeplink;
    private com.adjust.sdk.DeviceInfo deviceInfo;
    java.util.Map<java.lang.String, java.lang.String> extraParameters;
    private com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager;
    private com.adjust.sdk.GlobalParameters globalParameters;
    java.lang.Boolean googlePlayInstant;
    java.lang.String installVersion;
    com.adjust.sdk.ActivityHandler.InternalState internalState;
    java.lang.Boolean isClick;
    com.adjust.sdk.LicenseData licenseData;
    java.lang.String preinstallLocation;
    java.lang.String preinstallPayload;
    java.lang.String rawReferrer;
    java.lang.String referrer;
    java.lang.String referrerApi;
    java.lang.String reftag;
    long clickTimeInSeconds = -1;
    long clickTimeInMilliseconds = -1;
    long installBeginTimeInSeconds = -1;
    long clickTimeServerInSeconds = -1;
    long installBeginTimeServerInSeconds = -1;

    public static class ActivityStateCopy {
        public final int Camera2StreamConfigurationMap;
        public final int getHighResolutionOutputSizeshNQ4ISI;
        public final int getHighSpeedVideoFpsRanges;
        public final long getHighSpeedVideoFpsRangesFor;
        public final long getHighSpeedVideoSizes;
        public final java.lang.String getInputFormats;
        public final java.lang.String getOutputMinFrameDuration;

        public ActivityStateCopy(com.adjust.sdk.ActivityState activityState) {
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighSpeedVideoFpsRanges = -1;
            this.getHighSpeedVideoSizes = -1L;
            this.getHighSpeedVideoFpsRangesFor = -1L;
            this.getInputFormats = null;
            this.getOutputMinFrameDuration = null;
            if (activityState == null) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = activityState.eventCount;
            this.Camera2StreamConfigurationMap = activityState.sessionCount;
            this.getHighSpeedVideoFpsRanges = activityState.subsessionCount;
            this.getHighSpeedVideoSizes = activityState.timeSpent;
            this.getHighSpeedVideoFpsRangesFor = activityState.sessionLength;
            this.getInputFormats = activityState.uuid;
            this.getOutputMinFrameDuration = activityState.pushToken;
        }
    }

    public PackageBuilder(com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager, long j) {
        this.createdAt = j;
        this.deviceInfo = deviceInfo;
        this.adjustConfig = adjustConfig;
        this.activityStateCopy = new com.adjust.sdk.PackageBuilder.ActivityStateCopy(activityState);
        this.firstSessionDelayManager = firstSessionDelayManager;
        this.globalParameters = globalParameters;
    }

    public static void addBoolean(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Boolean bool) {
        if (map == null || bool == null) {
            return;
        }
        addLong(map, str, bool.booleanValue() ? 1L : 0L);
    }

    private static void addDate(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.util.Date date) {
        if (map == null || date == null) {
            return;
        }
        addString(map, str, com.adjust.sdk.Util.dateFormatter.format(date));
    }

    private static void addDateInMilliseconds(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (map == null || j <= 0) {
            return;
        }
        addDate(map, str, new java.util.Date(j));
    }

    private static void addDateInSeconds(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (map == null || j <= 0) {
            return;
        }
        addDate(map, str, new java.util.Date(j * 1000));
    }

    public static void addDouble(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, double d) {
        if (map == null || d < 0.0d) {
            return;
        }
        addString(map, str, java.lang.Double.toString(d));
    }

    private static void addDoubleWithoutRounding(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Double d) {
        if (map == null || d == null) {
            return;
        }
        addString(map, str, java.lang.Double.toString(d.doubleValue()));
    }

    private static void addDuration(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (map == null || j < 0) {
            return;
        }
        addLong(map, str, (j + 500) / 1000);
    }

    private static void addInteger(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Integer num) {
        if (map == null || num == null) {
            return;
        }
        addString(map, str, java.lang.Integer.toString(num.intValue()));
    }

    public static void addJsonObject(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, org.json.JSONObject jSONObject) {
        if (map == null || jSONObject == null) {
            return;
        }
        addString(map, str, jSONObject.toString());
    }

    public static void addLong(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, long j) {
        if (map == null || j < 0) {
            return;
        }
        addString(map, str, java.lang.Long.toString(j));
    }

    public static void addMapJson(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.util.Map map2) {
        if (map == null || map2 == null || map2.size() == 0) {
            return;
        }
        addString(map, str, new org.json.JSONObject(map2).toString());
    }

    public static void addString(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        if (map == null || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private void checkDeviceIds(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null || map.containsKey(a.b.l) || map.containsKey("gps_adid") || map.containsKey("fire_adid") || map.containsKey("oaid") || map.containsKey("imei") || map.containsKey("meid") || map.containsKey("device_id") || map.containsKey("imeis") || map.containsKey("meids") || map.containsKey("device_ids")) {
            return;
        }
        com.adjust.sdk.AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.coppaComplianceEnabled) {
            logger.info("Missing Device IDs. COPPA enabled.", new java.lang.Object[0]);
        } else if (adjustConfig.playStoreKidsComplianceEnabled) {
            logger.info("Missing Device IDs. Play store kids compliance enabled.", new java.lang.Object[0]);
        } else {
            logger.error("Missing Device IDs. Please check if Proguard is correctly set with Adjust SDK", new java.lang.Object[0]);
        }
    }

    private boolean containsFireIds(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("fire_adid");
    }

    private boolean containsPlayIds(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey("gps_adid");
    }

    private java.util.Map<java.lang.String, java.lang.String> getAdRevenueParameters(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        addMapJson(hashMap, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.callbackParameters, adjustAdRevenue.callbackParameters, "Callback"));
        addMapJson(hashMap, com.adjust.sdk.Constants.PARTNER_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.partnerParameters, adjustAdRevenue.partnerParameters, "Partner"));
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addLong(hashMap, "connectivity_type", this.deviceInfo.connectivityType);
        addString(hashMap, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addDateInMilliseconds(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, this.deviceInfo.language);
        addString(hashMap, "mcc", this.deviceInfo.mcc);
        addString(hashMap, "mnc", this.deviceInfo.mnc);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addString(hashMap, "source", adjustAdRevenue.source);
        addDoubleWithoutRounding(hashMap, "revenue", adjustAdRevenue.revenue);
        addString(hashMap, "currency", adjustAdRevenue.currency);
        addInteger(hashMap, "ad_impressions_count", adjustAdRevenue.adImpressionsCount);
        addString(hashMap, "ad_revenue_network", adjustAdRevenue.adRevenueNetwork);
        addString(hashMap, "ad_revenue_unit", adjustAdRevenue.adRevenueUnit);
        addString(hashMap, "ad_revenue_placement", adjustAdRevenue.adRevenuePlacement);
        addLong(hashMap, "session_count", this.activityStateCopy.Camera2StreamConfigurationMap);
        addDuration(hashMap, "session_length", this.activityStateCopy.getHighSpeedVideoFpsRangesFor);
        addLong(hashMap, "subsession_count", this.activityStateCopy.getHighSpeedVideoFpsRanges);
        addDuration(hashMap, "time_spent", this.activityStateCopy.getHighSpeedVideoSizes);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getAttributionParameters(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "initiated_by", str);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getClickParameters(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        com.adjust.sdk.AdjustAttribution adjustAttribution = this.attribution;
        if (adjustAttribution != null) {
            addString(hashMap, "tracker", adjustAttribution.trackerName);
            addString(hashMap, com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_CAMPAIGN, this.attribution.campaign);
            addString(hashMap, "adgroup", this.attribution.adgroup);
            addString(hashMap, "creative", this.attribution.creative);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addMapJson(hashMap, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, this.globalParameters.callbackParameters);
        addDateInMilliseconds(hashMap, "click_time", this.clickTimeInMilliseconds);
        addDateInSeconds(hashMap, "click_time", this.clickTimeInSeconds);
        addDateInSeconds(hashMap, "click_time_server", this.clickTimeServerInSeconds);
        addLong(hashMap, "connectivity_type", this.deviceInfo.connectivityType);
        addString(hashMap, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "deeplink", this.deeplink);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addBoolean(hashMap, "google_play_instant", this.googlePlayInstant);
        addBoolean(hashMap, "is_click", this.isClick);
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addDateInSeconds(hashMap, "install_begin_time", this.installBeginTimeInSeconds);
        addDateInSeconds(hashMap, "install_begin_time_server", this.installBeginTimeServerInSeconds);
        addString(hashMap, "install_version", this.installVersion);
        addDateInMilliseconds(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, this.deviceInfo.language);
        addString(hashMap, "mcc", this.deviceInfo.mcc);
        addString(hashMap, "mnc", this.deviceInfo.mnc);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addMapJson(hashMap, "params", this.extraParameters);
        addMapJson(hashMap, com.adjust.sdk.Constants.PARTNER_PARAMETERS, this.globalParameters.partnerParameters);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addString(hashMap, "raw_referrer", this.rawReferrer);
        addString(hashMap, com.adjust.sdk.Constants.REFERRER, this.referrer);
        addString(hashMap, "referrer_api", this.referrerApi);
        addString(hashMap, com.adjust.sdk.Constants.REFTAG, this.reftag);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addLong(hashMap, "session_count", this.activityStateCopy.Camera2StreamConfigurationMap);
        addDuration(hashMap, "session_length", this.activityStateCopy.getHighSpeedVideoFpsRangesFor);
        addString(hashMap, "source", str);
        addLong(hashMap, "subsession_count", this.activityStateCopy.getHighSpeedVideoFpsRanges);
        addDuration(hashMap, "time_spent", this.activityStateCopy.getHighSpeedVideoSizes);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        addString(hashMap, "payload", this.preinstallPayload);
        addString(hashMap, "found_location", this.preinstallLocation);
        com.adjust.sdk.LicenseData licenseData = this.licenseData;
        if (licenseData != null) {
            addInteger(hashMap, "lvl_response_code", java.lang.Integer.valueOf(licenseData.getResponseCode()));
            addString(hashMap, "lvl_signed_data", this.licenseData.getSignedData());
            addString(hashMap, "lvl_signature", this.licenseData.getSignature());
        }
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private com.adjust.sdk.ActivityPackage getDefaultActivityPackage(com.adjust.sdk.ActivityKind activityKind) {
        com.adjust.sdk.ActivityPackage activityPackage = new com.adjust.sdk.ActivityPackage(activityKind);
        activityPackage.setClientSdk(this.deviceInfo.clientSdk);
        return activityPackage;
    }

    private java.lang.String getEventSuffix(com.adjust.sdk.AdjustEvent adjustEvent) {
        java.lang.Double d = adjustEvent.revenue;
        return d == null ? com.adjust.sdk.Util.formatString("'%s'", adjustEvent.eventToken) : com.adjust.sdk.Util.formatString("(%.5f %s, '%s')", d, adjustEvent.currency, adjustEvent.eventToken);
    }

    private java.util.Map<java.lang.String, java.lang.String> getGdprParameters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getInfoParameters(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addString(hashMap, "source", str);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getMeasurementConsentParameters(boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        addString(hashMap, "measurement", z ? "enable" : "disable");
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getSessionParameters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        addMapJson(hashMap, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, this.globalParameters.callbackParameters);
        addMapJson(hashMap, com.adjust.sdk.Constants.PARTNER_PARAMETERS, this.globalParameters.partnerParameters);
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addLong(hashMap, "connectivity_type", this.deviceInfo.connectivityType);
        addString(hashMap, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addDateInMilliseconds(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, this.deviceInfo.language);
        addString(hashMap, "mcc", this.deviceInfo.mcc);
        addString(hashMap, "mnc", this.deviceInfo.mnc);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addLong(hashMap, "session_count", this.activityStateCopy.Camera2StreamConfigurationMap);
        addDuration(hashMap, "session_length", this.activityStateCopy.getHighSpeedVideoFpsRangesFor);
        addLong(hashMap, "subsession_count", this.activityStateCopy.getHighSpeedVideoFpsRanges);
        addDuration(hashMap, "time_spent", this.activityStateCopy.getHighSpeedVideoSizes);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectStoreInfoToParameters(hashMap);
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getSubscriptionParameters(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addMapJson(hashMap, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.callbackParameters, adjustPlayStoreSubscription.getCallbackParameters(), "Callback"));
        addMapJson(hashMap, com.adjust.sdk.Constants.PARTNER_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.partnerParameters, adjustPlayStoreSubscription.getPartnerParameters(), "Partner"));
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addLong(hashMap, "connectivity_type", this.deviceInfo.connectivityType);
        addString(hashMap, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addDateInMilliseconds(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, this.deviceInfo.language);
        addString(hashMap, "mcc", this.deviceInfo.mcc);
        addString(hashMap, "mnc", this.deviceInfo.mnc);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addLong(hashMap, "session_count", this.activityStateCopy.Camera2StreamConfigurationMap);
        addDuration(hashMap, "session_length", this.activityStateCopy.getHighSpeedVideoFpsRangesFor);
        addLong(hashMap, "subsession_count", this.activityStateCopy.getHighSpeedVideoFpsRanges);
        addDuration(hashMap, "time_spent", this.activityStateCopy.getHighSpeedVideoSizes);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        addString(hashMap, "currency", adjustPlayStoreSubscription.getCurrency());
        addString(hashMap, "product_id", adjustPlayStoreSubscription.getSku());
        addString(hashMap, "purchase_token", adjustPlayStoreSubscription.getPurchaseToken());
        addString(hashMap, "receipt", adjustPlayStoreSubscription.getSignature());
        addLong(hashMap, "revenue", adjustPlayStoreSubscription.getPrice());
        addDateInMilliseconds(hashMap, "transaction_date", adjustPlayStoreSubscription.getPurchaseTime());
        addString(hashMap, "transaction_id", adjustPlayStoreSubscription.getOrderId());
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getThirdPartySharingParameters(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        java.lang.Boolean bool = adjustThirdPartySharing.isEnabled;
        if (bool != null) {
            addString(hashMap, "sharing", bool.booleanValue() ? "enable" : "disable");
        }
        addMapJson(hashMap, "granular_third_party_sharing_options", adjustThirdPartySharing.granularOptions);
        addMapJson(hashMap, "partner_sharing_settings", adjustThirdPartySharing.partnerSharingSettings);
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool2);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addBoolean(hashMap, "needs_response_details", bool2);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool2 = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool2);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.String> getVerificationParameters(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addLong(hashMap, "connectivity_type", this.deviceInfo.connectivityType);
        addString(hashMap, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addDateInMilliseconds(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, this.deviceInfo.language);
        addString(hashMap, "mcc", this.deviceInfo.mcc);
        addString(hashMap, "mnc", this.deviceInfo.mnc);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addLong(hashMap, "session_count", this.activityStateCopy.Camera2StreamConfigurationMap);
        addDuration(hashMap, "session_length", this.activityStateCopy.getHighSpeedVideoFpsRangesFor);
        addLong(hashMap, "subsession_count", this.activityStateCopy.getHighSpeedVideoFpsRanges);
        addDuration(hashMap, "time_spent", this.activityStateCopy.getHighSpeedVideoSizes);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        addString(hashMap, "product_id", adjustPlayStorePurchase.getProductId());
        addString(hashMap, "purchase_token", adjustPlayStorePurchase.getPurchaseToken());
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private void injectFeatureFlagsWithParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.adjustConfig.coppaComplianceEnabled) {
            addLong(map, "ff_coppa", 1L);
        }
        com.adjust.sdk.ActivityHandler.InternalState internalState = this.internalState;
        if (internalState != null) {
            addBoolean(map, "offline_mode_enabled", java.lang.Boolean.valueOf(internalState.offline));
            if (this.internalState.isInForeground()) {
                addBoolean(map, "foreground", java.lang.Boolean.TRUE);
            } else {
                addBoolean(map, com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, java.lang.Boolean.TRUE);
            }
        }
        if (this.adjustConfig.playStoreKidsComplianceEnabled) {
            addLong(map, "ff_play_store_kids_app", 1L);
        }
        int i = this.firstSessionDelayManager.getHighSpeedVideoFpsRanges;
        if (i != 2 && i != 0) {
            addBoolean(map, "ff_first_session_delay", java.lang.Boolean.TRUE);
        }
        if (this.adjustConfig.isAppSetIdReadingEnabled) {
            return;
        }
        addBoolean(map, "ff_app_set_id_disabled", java.lang.Boolean.TRUE);
    }

    private void injectStoreInfoToParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        com.adjust.sdk.AdjustStoreInfo adjustStoreInfo = this.deviceInfo.storeInfoFromClient;
        if (adjustStoreInfo != null) {
            addString(map, "store_name_from_client", adjustStoreInfo.storeName);
            addString(map, "store_app_id_from_client", this.deviceInfo.storeInfoFromClient.storeAppId);
        }
        addString(map, "store_name_from_system", this.deviceInfo.storeIdFromSystem);
        addString(map, "initiating_package_name", this.deviceInfo.initiatingPackageName);
        addString(map, "originating_package_name", this.deviceInfo.originatingPackageName);
    }

    public com.adjust.sdk.ActivityPackage buildAdRevenuePackage(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        java.util.Map<java.lang.String, java.lang.String> adRevenueParameters = getAdRevenueParameters(adjustAdRevenue);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.AD_REVENUE);
        defaultActivityPackage.setPath("/ad_revenue");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(adRevenueParameters);
        defaultActivityPackage.setCallbackParameters(adjustAdRevenue.callbackParameters);
        defaultActivityPackage.setPartnerParameters(adjustAdRevenue.partnerParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildAttributionPackage(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> attributionParameters = getAttributionParameters(str);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.ATTRIBUTION);
        defaultActivityPackage.setPath("attribution");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(attributionParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildClickPackage(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> clickParameters = getClickParameters(str);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.CLICK);
        defaultActivityPackage.setPath("/sdk_click");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setClickTimeInMilliseconds(this.clickTimeInMilliseconds);
        defaultActivityPackage.setClickTimeInSeconds(this.clickTimeInSeconds);
        defaultActivityPackage.setInstallBeginTimeInSeconds(this.installBeginTimeInSeconds);
        defaultActivityPackage.setClickTimeServerInSeconds(this.clickTimeServerInSeconds);
        defaultActivityPackage.setInstallBeginTimeServerInSeconds(this.installBeginTimeServerInSeconds);
        defaultActivityPackage.setInstallVersion(this.installVersion);
        defaultActivityPackage.setGooglePlayInstant(this.googlePlayInstant);
        defaultActivityPackage.setIsClick(this.isClick);
        defaultActivityPackage.setParameters(clickParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildEventPackage(com.adjust.sdk.AdjustEvent adjustEvent, int i) {
        java.util.Map<java.lang.String, java.lang.String> eventParameters = getEventParameters(adjustEvent, i);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.EVENT);
        defaultActivityPackage.setPath("/event");
        defaultActivityPackage.setSuffix(getEventSuffix(adjustEvent));
        defaultActivityPackage.setParameters(eventParameters);
        defaultActivityPackage.setCallbackParameters(adjustEvent.callbackParameters);
        defaultActivityPackage.setPartnerParameters(adjustEvent.partnerParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildGdprPackage() {
        java.util.Map<java.lang.String, java.lang.String> gdprParameters = getGdprParameters();
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.GDPR);
        defaultActivityPackage.setPath("/gdpr_forget_device");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(gdprParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildInfoPackage(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> infoParameters = getInfoParameters(str);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.INFO);
        defaultActivityPackage.setPath("/sdk_info");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(infoParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildMeasurementConsentPackage(boolean z) {
        java.util.Map<java.lang.String, java.lang.String> measurementConsentParameters = getMeasurementConsentParameters(z);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.MEASUREMENT_CONSENT);
        defaultActivityPackage.setPath("/measurement_consent");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(measurementConsentParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildSessionPackage() {
        java.util.Map<java.lang.String, java.lang.String> sessionParameters = getSessionParameters();
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.SESSION);
        defaultActivityPackage.setPath("/session");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(sessionParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildSubscriptionPackage(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        java.util.Map<java.lang.String, java.lang.String> subscriptionParameters = getSubscriptionParameters(adjustPlayStoreSubscription);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.SUBSCRIPTION);
        defaultActivityPackage.setPath("/v2/purchase");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(subscriptionParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildThirdPartySharingPackage(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        java.util.Map<java.lang.String, java.lang.String> thirdPartySharingParameters = getThirdPartySharingParameters(adjustThirdPartySharing);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.THIRD_PARTY_SHARING);
        defaultActivityPackage.setPath("/third_party_sharing");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setParameters(thirdPartySharingParameters);
        return defaultActivityPackage;
    }

    public com.adjust.sdk.ActivityPackage buildVerificationPackage(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        java.util.Map<java.lang.String, java.lang.String> verificationParameters = getVerificationParameters(adjustPlayStorePurchase);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION);
        defaultActivityPackage.setPath("/verify");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setPurchaseVerificationCallback(onPurchaseVerificationFinishedListener);
        defaultActivityPackage.setParameters(verificationParameters);
        return defaultActivityPackage;
    }

    public java.util.Map<java.lang.String, java.lang.String> getEventParameters(com.adjust.sdk.AdjustEvent adjustEvent, int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        addMapJson(hashMap, com.adjust.sdk.Constants.CALLBACK_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.callbackParameters, adjustEvent.callbackParameters, "Callback"));
        addMapJson(hashMap, com.adjust.sdk.Constants.PARTNER_PARAMETERS, com.adjust.sdk.Util.mergeParameters(this.globalParameters.partnerParameters, adjustEvent.partnerParameters, "Partner"));
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        addString(hashMap, "google_app_set_id", this.deviceInfo.appSetId);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addLong(hashMap, "connectivity_type", this.deviceInfo.connectivityType);
        addString(hashMap, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "currency", adjustEvent.currency);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, "event_callback_id", adjustEvent.callbackId);
        addLong(hashMap, "event_count", this.activityStateCopy.getHighResolutionOutputSizeshNQ4ISI);
        addString(hashMap, "event_token", adjustEvent.eventToken);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addString(hashMap, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, this.deviceInfo.language);
        addString(hashMap, "mcc", this.deviceInfo.mcc);
        addString(hashMap, "mnc", this.deviceInfo.mnc);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "product_id", adjustEvent.productId);
        addString(hashMap, "purchase_token", adjustEvent.purchaseToken);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addDouble(hashMap, "revenue", adjustEvent.revenue);
        addString(hashMap, "order_id", adjustEvent.orderId);
        addString(hashMap, "deduplication_id", adjustEvent.deduplicationId);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addLong(hashMap, "session_count", this.activityStateCopy.Camera2StreamConfigurationMap);
        addDuration(hashMap, "session_length", this.activityStateCopy.getHighSpeedVideoFpsRangesFor);
        addLong(hashMap, "subsession_count", this.activityStateCopy.getHighSpeedVideoFpsRanges);
        addDuration(hashMap, "time_spent", this.activityStateCopy.getHighSpeedVideoSizes);
        addInteger(hashMap, "seq", java.lang.Integer.valueOf(i));
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        addJsonObject(hashMap, "control_params", com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.adjustConfig.context).getControlParamsJson());
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }

    private static void addDouble(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Double d) {
        if (map == null || d == null) {
            return;
        }
        addString(map, str, com.adjust.sdk.Util.formatString("%.5f", d));
    }

    public com.adjust.sdk.ActivityPackage buildVerificationPackage(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        java.util.Map<java.lang.String, java.lang.String> verificationParameters = getVerificationParameters(adjustEvent);
        com.adjust.sdk.ActivityPackage defaultActivityPackage = getDefaultActivityPackage(com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION);
        defaultActivityPackage.setPath("/verify");
        defaultActivityPackage.setSuffix("");
        defaultActivityPackage.setPurchaseVerificationCallback(onPurchaseVerificationFinishedListener);
        defaultActivityPackage.setParameters(verificationParameters);
        return defaultActivityPackage;
    }

    private java.util.Map<java.lang.String, java.lang.String> getVerificationParameters(com.adjust.sdk.AdjustEvent adjustEvent) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.deviceInfo.reloadOtherDeviceInfoParams(this.adjustConfig, logger);
        java.util.Map<java.lang.String, java.lang.String> map = this.deviceInfo.imeiParameters;
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.deviceInfo.oaidParameters;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        this.deviceInfo.reloadPlayIds(this.adjustConfig);
        addString(hashMap, "android_uuid", this.activityStateCopy.getInputFormats);
        addString(hashMap, "gps_adid", this.deviceInfo.playAdId);
        addLong(hashMap, "gps_adid_attempt", this.deviceInfo.playAdIdAttempt);
        addString(hashMap, "gps_adid_src", this.deviceInfo.playAdIdSource);
        addBoolean(hashMap, "tracking_enabled", this.deviceInfo.isTrackingEnabled);
        addString(hashMap, "fire_adid", this.deviceInfo.fireAdId);
        addBoolean(hashMap, "fire_tracking_enabled", this.deviceInfo.fireTrackingEnabled);
        if (!containsPlayIds(hashMap) && !containsFireIds(hashMap)) {
            logger.warn("Google Advertising ID or Fire Advertising ID not detected, fallback to non Google Play and Fire identifiers will take place", new java.lang.Object[0]);
            this.deviceInfo.reloadNonPlayIds(this.adjustConfig);
            addString(hashMap, a.b.l, this.deviceInfo.androidId);
        }
        addString(hashMap, "api_level", this.deviceInfo.apiLevel);
        addString(hashMap, "app_token", this.adjustConfig.appToken);
        addString(hashMap, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.deviceInfo.appVersion);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        addBoolean(hashMap, "attribution_deeplink", bool);
        addLong(hashMap, "connectivity_type", this.deviceInfo.connectivityType);
        addString(hashMap, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, this.deviceInfo.country);
        addString(hashMap, "cpu_type", this.deviceInfo.abi);
        addDateInMilliseconds(hashMap, "created_at", this.createdAt);
        addString(hashMap, "default_tracker", this.adjustConfig.defaultTracker);
        addBoolean(hashMap, "needs_cost", this.adjustConfig.isCostDataInAttributionEnabled);
        addString(hashMap, "device_manufacturer", this.deviceInfo.deviceManufacturer);
        addString(hashMap, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, this.deviceInfo.deviceName);
        addString(hashMap, "device_type", this.deviceInfo.deviceType);
        addLong(hashMap, "ui_mode", this.deviceInfo.uiMode);
        addString(hashMap, "display_height", this.deviceInfo.displayHeight);
        addString(hashMap, "display_width", this.deviceInfo.displayWidth);
        addString(hashMap, "environment", this.adjustConfig.environment);
        addString(hashMap, com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXTERNAL_DEVICE_ID, this.adjustConfig.externalDeviceId);
        addString(hashMap, "fb_id", this.deviceInfo.fbAttributionId);
        addString(hashMap, "hardware_name", this.deviceInfo.hardwareName);
        addDateInMilliseconds(hashMap, "installed_at", this.deviceInfo.appInstallTime);
        addString(hashMap, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, this.deviceInfo.language);
        addString(hashMap, "mcc", this.deviceInfo.mcc);
        addString(hashMap, "mnc", this.deviceInfo.mnc);
        addBoolean(hashMap, "needs_response_details", bool);
        addString(hashMap, "os_build", this.deviceInfo.buildName);
        addString(hashMap, "os_name", this.deviceInfo.osName);
        addString(hashMap, "os_version", this.deviceInfo.osVersion);
        addString(hashMap, "package_name", this.deviceInfo.packageName);
        addString(hashMap, "push_token", this.activityStateCopy.getOutputMinFrameDuration);
        addString(hashMap, "screen_density", this.deviceInfo.screenDensity);
        addString(hashMap, "screen_format", this.deviceInfo.screenFormat);
        addString(hashMap, "screen_size", this.deviceInfo.screenSize);
        addLong(hashMap, "session_count", this.activityStateCopy.Camera2StreamConfigurationMap);
        addDuration(hashMap, "session_length", this.activityStateCopy.getHighSpeedVideoFpsRangesFor);
        addLong(hashMap, "subsession_count", this.activityStateCopy.getHighSpeedVideoFpsRanges);
        addDuration(hashMap, "time_spent", this.activityStateCopy.getHighSpeedVideoSizes);
        addString(hashMap, "updated_at", this.deviceInfo.appUpdateTime);
        addString(hashMap, "product_id", adjustEvent.getProductId());
        addString(hashMap, "purchase_token", adjustEvent.getPurchaseToken());
        addString(hashMap, "event_token", adjustEvent.getEventToken());
        addString(hashMap, "currency", adjustEvent.getCurrency());
        addDouble(hashMap, "revenue", adjustEvent.getRevenue());
        if (!this.deviceInfo.isGooglePlayGamesForPC) {
            bool = null;
        }
        addBoolean(hashMap, "gpg_pc_enabled", bool);
        injectFeatureFlagsWithParameters(hashMap);
        checkDeviceIds(hashMap);
        return hashMap;
    }
}
