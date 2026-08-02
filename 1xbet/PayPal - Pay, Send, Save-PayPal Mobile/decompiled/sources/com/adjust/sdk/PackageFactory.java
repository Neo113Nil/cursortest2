package com.adjust.sdk;

/* loaded from: classes7.dex */
public class PackageFactory {
    private static final java.lang.String ADJUST_PREFIX = "adjust_";

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r2 = r11.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage(android.net.Uri uri, android.net.Uri uri2, long j, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        java.lang.String obj;
        if (uri == null || obj == null || obj.length() == 0) {
            return null;
        }
        try {
            obj = java.net.URLDecoder.decode(obj, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (java.lang.IllegalArgumentException e2) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (java.lang.Exception e3) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Deeplink url decoding failed. Message: (%s)", e3.getMessage());
        }
        com.adjust.sdk.AdjustFactory.getLogger().verbose("Url to parse (%s)", obj);
        android.net.UrlQuerySanitizer urlQuerySanitizer = new android.net.UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseUrl(obj);
        com.adjust.sdk.PackageBuilder queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, firstSessionDelayManager, internalState);
        if (queryStringClickPackageBuilder == null) {
            return null;
        }
        queryStringClickPackageBuilder.deeplink = uri.toString();
        queryStringClickPackageBuilder.clickTimeInMilliseconds = j;
        if (uri2 != null) {
            queryStringClickPackageBuilder.referrer = uri2.toString();
        }
        return queryStringClickPackageBuilder.buildClickPackage("deeplink");
    }

    public static com.adjust.sdk.ActivityPackage buildInstallReferrerSdkClickPackage(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, java.lang.System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.referrer = referrerDetails.installReferrer;
        packageBuilder.clickTimeInSeconds = referrerDetails.referrerClickTimestampSeconds;
        packageBuilder.installBeginTimeInSeconds = referrerDetails.installBeginTimestampSeconds;
        packageBuilder.clickTimeServerInSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        packageBuilder.installBeginTimeServerInSeconds = referrerDetails.installBeginTimestampServerSeconds;
        packageBuilder.installVersion = referrerDetails.installVersion;
        packageBuilder.googlePlayInstant = referrerDetails.googlePlayInstant;
        packageBuilder.isClick = referrerDetails.isClick;
        packageBuilder.referrerApi = str;
        return packageBuilder.buildClickPackage(com.adjust.sdk.Constants.INSTALL_REFERRER);
    }

    public static com.adjust.sdk.ActivityPackage buildLicenseVerificationSdkClickPackage(com.adjust.sdk.LicenseData licenseData, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, java.lang.System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.licenseData = licenseData;
        return packageBuilder.buildClickPackage(com.adjust.sdk.Constants.LICENSE_VERIFICATION);
    }

    public static com.adjust.sdk.ActivityPackage buildPreinstallSdkClickPackage(java.lang.String str, java.lang.String str2, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, java.lang.System.currentTimeMillis());
        packageBuilder.preinstallPayload = str;
        packageBuilder.preinstallLocation = str2;
        return packageBuilder.buildClickPackage(com.adjust.sdk.Constants.PREINSTALL);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.adjust.sdk.ActivityPackage buildReftagSdkClickPackage(java.lang.String str, long j, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        java.lang.String str2;
        com.adjust.sdk.PackageBuilder queryStringClickPackageBuilder;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = java.net.URLDecoder.decode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
            str2 = com.adjust.sdk.Constants.MALFORMED;
            com.adjust.sdk.AdjustFactory.getLogger().verbose("Referrer to parse (%s)", str2);
            android.net.UrlQuerySanitizer urlQuerySanitizer = new android.net.UrlQuerySanitizer();
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseQuery(str2);
            queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, firstSessionDelayManager, internalState);
            if (queryStringClickPackageBuilder != null) {
            }
        } catch (java.lang.IllegalArgumentException e2) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
            str2 = com.adjust.sdk.Constants.MALFORMED;
            com.adjust.sdk.AdjustFactory.getLogger().verbose("Referrer to parse (%s)", str2);
            android.net.UrlQuerySanitizer urlQuerySanitizer2 = new android.net.UrlQuerySanitizer();
            urlQuerySanitizer2.setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer2.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer2.parseQuery(str2);
            queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer2.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, firstSessionDelayManager, internalState);
            if (queryStringClickPackageBuilder != null) {
            }
        } catch (java.lang.Exception e3) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e3.getMessage());
            str2 = com.adjust.sdk.Constants.MALFORMED;
            com.adjust.sdk.AdjustFactory.getLogger().verbose("Referrer to parse (%s)", str2);
            android.net.UrlQuerySanitizer urlQuerySanitizer22 = new android.net.UrlQuerySanitizer();
            urlQuerySanitizer22.setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer22.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer22.parseQuery(str2);
            queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer22.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, firstSessionDelayManager, internalState);
            if (queryStringClickPackageBuilder != null) {
            }
        }
        com.adjust.sdk.AdjustFactory.getLogger().verbose("Referrer to parse (%s)", str2);
        android.net.UrlQuerySanitizer urlQuerySanitizer222 = new android.net.UrlQuerySanitizer();
        urlQuerySanitizer222.setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer222.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer222.parseQuery(str2);
        queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer222.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, firstSessionDelayManager, internalState);
        if (queryStringClickPackageBuilder != null) {
            return null;
        }
        queryStringClickPackageBuilder.referrer = str2;
        queryStringClickPackageBuilder.clickTimeInMilliseconds = j;
        queryStringClickPackageBuilder.rawReferrer = str;
        return queryStringClickPackageBuilder.buildClickPackage(com.adjust.sdk.Constants.REFTAG);
    }

    private static com.adjust.sdk.PackageBuilder queryStringClickPackageBuilder(java.util.List<android.net.UrlQuerySanitizer.ParameterValuePair> list, com.adjust.sdk.ActivityState activityState, com.adjust.sdk.AdjustConfig adjustConfig, com.adjust.sdk.DeviceInfo deviceInfo, com.adjust.sdk.GlobalParameters globalParameters, com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager, com.adjust.sdk.ActivityHandler.InternalState internalState) {
        if (list == null) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.adjust.sdk.AdjustAttribution adjustAttribution = new com.adjust.sdk.AdjustAttribution();
        for (android.net.UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            readQueryString(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, adjustAttribution);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = (java.lang.String) linkedHashMap.remove(com.adjust.sdk.Constants.REFTAG);
        if (activityState != null) {
            activityState.lastInterval = currentTimeMillis - activityState.lastActivity;
        }
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, currentTimeMillis);
        packageBuilder.internalState = internalState;
        packageBuilder.extraParameters = linkedHashMap;
        packageBuilder.attribution = adjustAttribution;
        packageBuilder.reftag = str;
        return packageBuilder;
    }

    private static boolean readQueryString(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, com.adjust.sdk.AdjustAttribution adjustAttribution) {
        if (str == null || str2 == null || !str.startsWith(ADJUST_PREFIX)) {
            return false;
        }
        java.lang.String substring = str.substring(7);
        if (substring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (tryToSetAttribution(adjustAttribution, substring, str2)) {
            return true;
        }
        map.put(substring, str2);
        return true;
    }

    private static boolean tryToSetAttribution(com.adjust.sdk.AdjustAttribution adjustAttribution, java.lang.String str, java.lang.String str2) {
        if (str.equals("tracker")) {
            adjustAttribution.trackerName = str2;
            return true;
        }
        if (str.equals(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_CAMPAIGN)) {
            adjustAttribution.campaign = str2;
            return true;
        }
        if (str.equals("adgroup")) {
            adjustAttribution.adgroup = str2;
            return true;
        }
        if (!str.equals("creative")) {
            return false;
        }
        adjustAttribution.creative = str2;
        return true;
    }
}
