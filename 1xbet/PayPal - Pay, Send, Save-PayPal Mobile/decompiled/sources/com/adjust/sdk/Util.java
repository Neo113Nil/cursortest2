package com.adjust.sdk;

/* loaded from: classes7.dex */
public class Util {
    private static final java.lang.String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    public static final java.text.DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    private static final java.lang.String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final java.text.SimpleDateFormat dateFormatter = new java.text.SimpleDateFormat(DATE_FORMAT, java.util.Locale.US);
    private static volatile com.adjust.sdk.scheduler.SingleThreadFutureScheduler playAdIdScheduler = null;

    public static com.adjust.sdk.AdjustAttribution attributionFromJson(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null) {
            return null;
        }
        com.adjust.sdk.AdjustAttribution adjustAttribution = new com.adjust.sdk.AdjustAttribution();
        adjustAttribution.jsonResponse = jSONObject.toString();
        if ("unity".equals(str)) {
            adjustAttribution.trackerToken = jSONObject.optString("tracker_token", "");
            adjustAttribution.trackerName = jSONObject.optString("tracker_name", "");
            adjustAttribution.network = jSONObject.optString("network", "");
            adjustAttribution.campaign = jSONObject.optString(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_CAMPAIGN, "");
            adjustAttribution.adgroup = jSONObject.optString("adgroup", "");
            adjustAttribution.creative = jSONObject.optString("creative", "");
            adjustAttribution.clickLabel = jSONObject.optString("click_label", "");
            adjustAttribution.costType = jSONObject.optString("cost_type", "");
            adjustAttribution.costAmount = java.lang.Double.valueOf(jSONObject.optDouble("cost_amount", 0.0d));
            adjustAttribution.costCurrency = jSONObject.optString("cost_currency", "");
            adjustAttribution.fbInstallReferrer = jSONObject.optString("fb_install_referrer", "");
            return adjustAttribution;
        }
        adjustAttribution.trackerToken = jSONObject.optString("tracker_token");
        adjustAttribution.trackerName = jSONObject.optString("tracker_name");
        adjustAttribution.network = jSONObject.optString("network");
        adjustAttribution.campaign = jSONObject.optString(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_CAMPAIGN);
        adjustAttribution.adgroup = jSONObject.optString("adgroup");
        adjustAttribution.creative = jSONObject.optString("creative");
        adjustAttribution.clickLabel = jSONObject.optString("click_label");
        adjustAttribution.costType = jSONObject.optString("cost_type");
        adjustAttribution.costAmount = java.lang.Double.valueOf(jSONObject.optDouble("cost_amount"));
        adjustAttribution.costCurrency = jSONObject.optString("cost_currency");
        adjustAttribution.fbInstallReferrer = jSONObject.optString("fb_install_referrer");
        return adjustAttribution;
    }

    public static boolean canReadAppSetId(com.adjust.sdk.AdjustConfig adjustConfig) {
        if (adjustConfig.isAppSetIdReadingEnabled) {
            return canReadPlayIds(adjustConfig);
        }
        return false;
    }

    public static boolean canReadNonPlayIds(com.adjust.sdk.AdjustConfig adjustConfig) {
        return (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) ? false : true;
    }

    public static boolean canReadPlayIds(com.adjust.sdk.AdjustConfig adjustConfig) {
        return (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) ? false : true;
    }

    public static boolean checkPermission(android.content.Context context, java.lang.String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (java.lang.Exception e) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    public static java.lang.String convertToHex(byte[] bArr) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%0");
        sb.append(bArr.length << 1);
        sb.append("x");
        return formatString(sb.toString(), bigInteger);
    }

    public static java.lang.String createUuid() {
        return java.util.UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(java.lang.Enum r0, java.lang.Enum r1) {
        return equalObject(r0, r1);
    }

    public static boolean equalInt(java.lang.Integer num, java.lang.Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(java.lang.Long l, java.lang.Long l2) {
        return equalObject(l, l2);
    }

    public static boolean equalObject(java.lang.Object obj, java.lang.Object obj2) {
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : obj.equals(obj2);
    }

    public static boolean equalString(java.lang.String str, java.lang.String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(java.lang.Double d, java.lang.Double d2) {
        return (d == null || d2 == null) ? d == null && d2 == null : java.lang.Double.doubleToLongBits(d.doubleValue()) == java.lang.Double.doubleToLongBits(d2.doubleValue());
    }

    public static java.lang.String formatString(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.lang.String getAdidFromActivityStateFile(android.content.Context context) {
        com.adjust.sdk.ActivityState activityState = (com.adjust.sdk.ActivityState) readObject(context, com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME, "Activity state", com.adjust.sdk.ActivityState.class);
        if (activityState == null) {
            return null;
        }
        return activityState.adid;
    }

    public static java.lang.Object getAdvertisingInfoObject(final android.content.Context context, long j) {
        return runSyncInPlayAdIdSchedulerWithTimeout(context, new java.util.concurrent.Callable<java.lang.Object>() { // from class: com.adjust.sdk.Util.1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                try {
                    return com.adjust.sdk.Reflection.getAdvertisingInfoObject(context);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }
        }, j);
    }

    public static java.lang.String getAndroidId(android.content.Context context) {
        return com.adjust.sdk.AndroidIdUtil.getAndroidId(context);
    }

    public static com.adjust.sdk.AdjustAttribution getAttributionFromAttributionFile(android.content.Context context) {
        return (com.adjust.sdk.AdjustAttribution) readObject(context, com.adjust.sdk.Constants.ATTRIBUTION_FILENAME, "Attribution", com.adjust.sdk.AdjustAttribution.class);
    }

    public static java.lang.String getCpuAbi() {
        return null;
    }

    public static void getGoogleAdId(android.content.Context context, final com.adjust.sdk.OnGoogleAdIdReadListener onGoogleAdIdReadListener) {
        new com.adjust.sdk.scheduler.AsyncTaskExecutor<android.content.Context, java.lang.String>() { // from class: com.adjust.sdk.Util.4
            @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
            public final java.lang.String doInBackground(android.content.Context[] contextArr) {
                com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
                java.lang.String googleAdId = com.adjust.sdk.Util.getGoogleAdId(contextArr[0]);
                logger.debug("GoogleAdId read ".concat(java.lang.String.valueOf(googleAdId)), new java.lang.Object[0]);
                return googleAdId;
            }

            @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
            public final void onPostExecute(java.lang.String str) {
                java.lang.String str2 = str;
                com.adjust.sdk.OnGoogleAdIdReadListener onGoogleAdIdReadListener2 = com.adjust.sdk.OnGoogleAdIdReadListener.this;
                if (onGoogleAdIdReadListener2 != null) {
                    onGoogleAdIdReadListener2.onGoogleAdIdRead(str2);
                }
            }
        }.execute(context);
    }

    private static com.adjust.sdk.ILogger getLogger() {
        return com.adjust.sdk.AdjustFactory.getLogger();
    }

    public static java.lang.String getPlayAdId(final android.content.Context context, final java.lang.Object obj, long j) {
        return (java.lang.String) runSyncInPlayAdIdSchedulerWithTimeout(context, new java.util.concurrent.Callable<java.lang.String>() { // from class: com.adjust.sdk.Util.2
            @Override // java.util.concurrent.Callable
            public final java.lang.String call() {
                return com.adjust.sdk.Reflection.getPlayAdId(context, obj);
            }
        }, j);
    }

    public static java.lang.String getReasonString(java.lang.String str, java.lang.Throwable th) {
        return th != null ? formatString("%s: %s", str, th) : formatString("%s", str);
    }

    public static java.lang.String getRootCause(java.lang.Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.lang.String obj = stringWriter.toString();
        int indexOf = obj.indexOf("Caused by:");
        return obj.substring(indexOf, obj.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, indexOf));
    }

    private static java.lang.String getSdkPrefix(java.lang.String str) {
        java.lang.String[] split;
        if (str != null && str.contains("@") && (split = str.split("@")) != null && split.length == 2) {
            return split[0];
        }
        return null;
    }

    public static java.lang.String getSdkPrefixPlatform(java.lang.String str) {
        java.lang.String[] split;
        java.lang.String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (split = sdkPrefix.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    public static java.lang.String getSdkVersion() {
        return com.adjust.sdk.Constants.CLIENT_SDK;
    }

    public static long getWaitingTime(int i, com.adjust.sdk.BackoffStrategy backoffStrategy) {
        if (i < backoffStrategy.minRetries) {
            return 0L;
        }
        return (long) (java.lang.Math.min(((long) java.lang.Math.pow(2.0d, i - r0)) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static java.lang.String hash(java.lang.String str, java.lang.String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return convertToHex(messageDigest.digest());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(java.lang.Boolean bool, int i) {
        int i2 = i * 37;
        return bool == null ? i2 : bool.hashCode() + i2;
    }

    public static int hashDouble(java.lang.Double d, int i) {
        int i2 = i * 37;
        return d == null ? i2 : d.hashCode() + i2;
    }

    public static int hashEnum(java.lang.Enum r0, int i) {
        int i2 = i * 37;
        return r0 == null ? i2 : r0.hashCode() + i2;
    }

    public static int hashLong(java.lang.Long l, int i) {
        int i2 = i * 37;
        return l == null ? i2 : l.hashCode() + i2;
    }

    public static int hashObject(java.lang.Object obj, int i) {
        int i2 = i * 37;
        return obj == null ? i2 : obj.hashCode() + i2;
    }

    public static int hashString(java.lang.String str, int i) {
        int i2 = i * 37;
        return str == null ? i2 : str.hashCode() + i2;
    }

    public static boolean isAdjustUninstallDetectionPayload(java.util.Map<java.lang.String, java.lang.String> map) {
        return map != null && map.size() == 1 && java.util.Objects.equals(map.get(com.adjust.sdk.Constants.FCM_PAYLOAD_KEY), com.adjust.sdk.Constants.FCM_PAYLOAD_VALUE);
    }

    public static boolean isEnabledFromActivityStateFile(android.content.Context context) {
        com.adjust.sdk.ActivityState activityState = (com.adjust.sdk.ActivityState) readObject(context, com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME, "Activity state", com.adjust.sdk.ActivityState.class);
        if (activityState == null) {
            return true;
        }
        return activityState.enabled;
    }

    private static boolean isEqualGoogleReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant);
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei);
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery);
    }

    private static boolean isEqualMetaReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeMeta && equalString(referrerDetails.installReferrer, activityState.installReferrerMeta) && equalBoolean(referrerDetails.isClick, activityState.isClickMeta);
    }

    public static boolean isEqualReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str, com.adjust.sdk.ActivityState activityState) {
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_GOOGLE)) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG)) {
            return isEqualSamsungReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_XIAOMI)) {
            return isEqualXiaomiReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_VIVO)) {
            return isEqualVivoReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(com.adjust.sdk.Constants.REFERRER_API_META)) {
            return isEqualMetaReferrerDetails(referrerDetails, activityState);
        }
        return false;
    }

    private static boolean isEqualSamsungReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeSamsung && referrerDetails.installBeginTimestampSeconds == activityState.installBeginSamsung && equalString(referrerDetails.installReferrer, activityState.installReferrerSamsung);
    }

    private static boolean isEqualVivoReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeVivo && referrerDetails.installBeginTimestampSeconds == activityState.installBeginVivo && equalString(referrerDetails.installReferrer, activityState.installReferrerVivo) && equalString(referrerDetails.installVersion, activityState.installVersionVivo);
    }

    private static boolean isEqualXiaomiReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails, com.adjust.sdk.ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeXiaomi && referrerDetails.installBeginTimestampSeconds == activityState.installBeginXiaomi && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServerXiaomi && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServerXiaomi && equalString(referrerDetails.installReferrer, activityState.installReferrerXiaomi) && equalString(referrerDetails.installVersion, activityState.installVersionXiaomi);
    }

    public static boolean isGooglePlayGamesForPC(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
    }

    public static java.lang.Boolean isPlayTrackingEnabled(final android.content.Context context, final java.lang.Object obj, long j) {
        return (java.lang.Boolean) runSyncInPlayAdIdSchedulerWithTimeout(context, new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.adjust.sdk.Util.3
            @Override // java.util.concurrent.Callable
            public final java.lang.Boolean call() {
                return com.adjust.sdk.Reflection.isPlayTrackingEnabled(context, obj);
            }
        }, j);
    }

    public static boolean isUrlFilteredOut(android.net.Uri uri) {
        java.lang.String obj;
        return uri == null || (obj = uri.toString()) == null || obj.length() == 0 || obj.matches(com.adjust.sdk.Constants.FB_AUTH_REGEX);
    }

    public static boolean isUrlWithTrackerQueryParam(android.net.Uri uri) {
        try {
            if (uri.getQueryParameter("adj_t") != null) {
                return true;
            }
            return uri.getQueryParameter("adjust_t") != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean isValidParameter(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        }
        if (!str.equals("")) {
            return true;
        }
        getLogger().error("%s parameter %s is empty", str3, str2);
        return false;
    }

    public static java.util.Map<java.lang.String, java.lang.String> mergeParameters(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        java.util.HashMap hashMap = new java.util.HashMap(map);
        com.adjust.sdk.ILogger logger = getLogger();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map2.entrySet()) {
            java.lang.String str2 = (java.lang.String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    private static java.text.DecimalFormat newLocalDecimalFormat() {
        return new java.text.DecimalFormat(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN, new java.text.DecimalFormatSymbols(java.util.Locale.US));
    }

    public static java.lang.String quote(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !java.util.regex.Pattern.compile("\\s").matcher(str).find() ? str : formatString("'%s'", str);
    }

    private static double randomInRange(double d, double d2) {
        return (new java.util.Random().nextDouble() * (d2 - d)) + d;
    }

    public static boolean readBooleanField(java.io.ObjectInputStream.GetField getField, java.lang.String str, boolean z) {
        try {
            return getField.get(str, z);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return z;
        }
    }

    public static double readDoubleField(java.io.ObjectInputStream.GetField getField, java.lang.String str, double d) {
        try {
            return getField.get(str, d);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return d;
        }
    }

    public static int readIntField(java.io.ObjectInputStream.GetField getField, java.lang.String str, int i) {
        try {
            return getField.get(str, i);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return i;
        }
    }

    public static long readLongField(java.io.ObjectInputStream.GetField getField, java.lang.String str, long j) {
        try {
            return getField.get(str, j);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.adjust.sdk.ObjectInputFilterStream, java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T readObject(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Class<T> cls) {
        ?? r4;
        T t;
        ?? r3;
        T t2 = null;
        try {
            r3 = context.openFileInput(str);
            try {
                r4 = new java.io.BufferedInputStream(r3);
            } catch (java.io.FileNotFoundException unused) {
                T t3 = t2;
                t2 = r3;
                t = t3;
            } catch (java.lang.Exception e) {
                r4 = r3;
                e = e;
            }
        } catch (java.io.FileNotFoundException unused2) {
            t = null;
        } catch (java.lang.Exception e2) {
            e = e2;
            r4 = 0;
        }
        try {
            r3 = new com.adjust.sdk.ObjectInputFilterStream(r4);
            try {
                t2 = cls.cast(r3.readObject());
                getLogger().debug("Read %s: %s", str2, t2);
            } catch (java.io.InvalidClassException e3) {
                getLogger().error("Failed to validate %s class (%s)", str2, e3.getMessage());
            } catch (java.lang.ClassCastException e4) {
                getLogger().error("Failed to cast %s object (%s)", str2, e4.getMessage());
            } catch (java.lang.ClassNotFoundException e5) {
                getLogger().error("Failed to find %s class (%s)", str2, e5.getMessage());
            } catch (java.lang.Exception e6) {
                getLogger().error("Failed to read %s object (%s)", str2, e6.getMessage());
            }
        } catch (java.io.FileNotFoundException unused3) {
            t = null;
            t2 = r4;
            getLogger().debug("%s file not found", str2);
            T t4 = t2;
            t2 = t;
            r3 = t4;
            if (r3 != 0) {
            }
            return t2;
        } catch (java.lang.Exception e7) {
            e = e7;
            getLogger().error("Failed to open %s file for reading (%s)", str2, e);
            r3 = r4;
            if (r3 != 0) {
            }
            return t2;
        }
        if (r3 != 0) {
            try {
                r3.close();
            } catch (java.lang.Exception e8) {
                getLogger().error("Failed to close %s file for reading (%s)", str2, e8);
            }
        }
        return t2;
    }

    public static <T> T readObjectField(java.io.ObjectInputStream.GetField getField, java.lang.String str, T t) {
        try {
            return (T) getField.get(str, t);
        } catch (java.lang.Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return t;
        }
    }

    public static java.lang.String readStringField(java.io.ObjectInputStream.GetField getField, java.lang.String str, java.lang.String str2) {
        return (java.lang.String) readObjectField(getField, str, str2);
    }

    public static boolean resolveContentProvider(android.content.Context context, java.lang.String str) {
        return context.getPackageManager().resolveContentProvider(str, 0) != null;
    }

    private static <R> R runSyncInPlayAdIdSchedulerWithTimeout(android.content.Context context, java.util.concurrent.Callable<R> callable, long j) {
        if (playAdIdScheduler == null) {
            synchronized (com.adjust.sdk.Util.class) {
                if (playAdIdScheduler == null) {
                    playAdIdScheduler = new com.adjust.sdk.scheduler.SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return (R) playAdIdScheduler.scheduleFutureWithReturn(callable, 0L).get(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.ObjectOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> void writeObject(T t, android.content.Context context, java.lang.String str, java.lang.String str2) {
        ?? r2;
        java.io.BufferedOutputStream bufferedOutputStream;
        try {
            r2 = context.openFileOutput(str, 0);
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(r2);
            } catch (java.lang.Exception e) {
                e = e;
                bufferedOutputStream = r2;
                getLogger().error("Failed to open %s for writing (%s)", str2, e);
                r2 = bufferedOutputStream;
                if (r2 != 0) {
                }
            }
            try {
                r2 = new java.io.ObjectOutputStream(bufferedOutputStream);
                try {
                    r2.writeObject(t);
                    getLogger().debug("Wrote %s: %s", str2, t);
                } catch (java.io.NotSerializableException unused) {
                    getLogger().error("Failed to serialize %s", str2);
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                getLogger().error("Failed to open %s for writing (%s)", str2, e);
                r2 = bufferedOutputStream;
                if (r2 != 0) {
                }
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            r2 = 0;
        }
        if (r2 != 0) {
            try {
                r2.close();
            } catch (java.lang.Exception e4) {
                getLogger().error("Failed to close %s file for writing (%s)", str2, e4);
            }
        }
    }

    public static java.util.Locale getLocale(android.content.res.Configuration configuration) {
        android.os.LocaleList locales = configuration.getLocales();
        if (locales == null || locales.isEmpty()) {
            return null;
        }
        return locales.get(0);
    }

    public static java.lang.String[] getSupportedAbis() {
        return android.os.Build.SUPPORTED_ABIS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getGoogleAdId(android.content.Context context) {
        java.lang.String str;
        java.lang.Object advertisingInfoObject;
        com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo;
        try {
            googlePlayServicesInfo = com.adjust.sdk.GooglePlayServicesClient.getGooglePlayServicesInfo(context, 11000L);
        } catch (java.lang.Exception unused) {
        }
        if (googlePlayServicesInfo != null) {
            str = googlePlayServicesInfo.getGpsAdid();
            return (str != null || (advertisingInfoObject = getAdvertisingInfoObject(context, 11000L)) == null) ? str : getPlayAdId(context, advertisingInfoObject, 1000L);
        }
        str = null;
        if (str != null) {
            return str;
        }
    }
}
