package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJG\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001d"}, d2 = {"Lcom/paypal/android/threeds/utils/DeviceDataUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/android/threeds/data/model/DeviceDataModel;", "getDeviceData", "(Landroid/content/Context;)Lcom/paypal/android/threeds/data/model/DeviceDataModel;", "", "getHighSpeedVideoSizes", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "updateDeviceInfoArray", "(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "isPermissionGranted", "(Landroid/content/Context;Ljava/lang/String;)Z", "REGIONAL_RESTRICTED", "Ljava/lang/String;", "PLATFORM_DOES_NOT_SUPPORT", "NEED_PERMISSION", "NULL_OR_BLANK"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeviceDataUtil {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.utils.DeviceDataUtil INSTANCE = new com.paypal.android.threeds.utils.DeviceDataUtil();
    public static final java.lang.String NEED_PERMISSION = "RE03";
    public static final java.lang.String NULL_OR_BLANK = "RE04";
    public static final java.lang.String PLATFORM_DOES_NOT_SUPPORT = "RE02";
    public static final java.lang.String REGIONAL_RESTRICTED = "RE01";

    private DeviceDataUtil() {
    }

    public final com.paypal.android.threeds.data.model.DeviceDataModel getDeviceData(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Starting device data collection", null, null, 6, null);
        final java.util.HashMap hashMap = new java.util.HashMap();
        final java.util.HashMap hashMap2 = new java.util.HashMap();
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Collecting basic device information", null, null, 6, null);
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.PLATFORM.getCode(), "Android");
        java.lang.String code = com.paypal.android.threeds.data.model.DeviceDataParam.DEVICE_MODEL.getCode();
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" || ");
        sb.append(str2);
        hashMap.put(code, sb.toString());
        java.lang.String code2 = com.paypal.android.threeds.data.model.DeviceDataParam.OS_NAME.getCode();
        java.lang.String str3 = android.os.Build.VERSION.CODENAME;
        java.lang.String str4 = android.os.Build.VERSION.RELEASE;
        int versionSDKInt = com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Android ");
        sb2.append(str3);
        sb2.append(" ");
        sb2.append(str4);
        sb2.append(" API ");
        sb2.append(versionSDKInt);
        hashMap.put(code2, sb2.toString());
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.OS_VERSION.getCode(), android.os.Build.VERSION.RELEASE);
        java.lang.String code3 = com.paypal.android.threeds.data.model.DeviceDataParam.LOCALE.getCode();
        java.util.Locale locale = androidx.core.os.LocaleListCompat.getDefault().get(0);
        java.lang.String language = locale != null ? locale.getLanguage() : null;
        java.lang.String country = locale != null ? locale.getCountry() : null;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(language);
        sb3.append(" - ");
        sb3.append(country);
        hashMap.put(code3, sb3.toString());
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.TIME_ZONE.getCode(), java.lang.String.valueOf((java.util.TimeZone.getDefault().getOffset(new java.util.Date().getTime()) / 1000) / 60));
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Collecting Bluetooth and network information", null, null, 6, null);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Updating Bluetooth adapter device name", null, null, 6, null);
        if (isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT")) {
            java.lang.Object systemService = context.getSystemService("bluetooth");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            java.lang.String name2 = ((android.bluetooth.BluetoothManager) systemService).getAdapter().getName();
            if (!android.text.TextUtils.isEmpty(name2)) {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Bluetooth device name collected successfully", null, null, 6, null);
                hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.DEVICE_NAME.getCode(), name2);
            } else {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Bluetooth device name is empty", null, null, 6, null);
                hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.DEVICE_NAME.getCode(), NULL_OR_BLANK);
            }
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Bluetooth connect permission not granted", null, null, 6, null);
            hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.DEVICE_NAME.getCode(), NEED_PERMISSION);
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Updating IP address", null, null, 6, null);
        boolean isPermissionGranted = isPermissionGranted(context, "android.permission.INTERNET");
        boolean isPermissionGranted2 = isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE");
        com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Network permissions - internet: ");
        sb4.append(isPermissionGranted);
        sb4.append(", network state: ");
        sb4.append(isPermissionGranted2);
        com.paypal.android.logger.Logger.i$default(logger, sb4.toString(), null, null, 6, null);
        if (isPermissionGranted && isPermissionGranted2) {
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            java.lang.String str5 = Camera2StreamConfigurationMap;
            if (str5 != null && !kotlin.text.StringsKt.isBlank(str5)) {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "IP address obtained", null, null, 6, null);
                hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.IP_ADDRESS.getCode(), Camera2StreamConfigurationMap);
            } else {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "IP address is null or blank", null, null, 6, null);
                hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.IP_ADDRESS.getCode(), NULL_OR_BLANK);
            }
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Network permissions not granted", null, null, 6, null);
            hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.IP_ADDRESS.getCode(), NEED_PERMISSION);
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Collecting app and SDK information", null, null, 6, null);
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_NAME.getCode(), context.getPackageName());
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.SDK_APP_ID.getCode(), com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getSdkAppId(context));
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.SDK_APP_VERSION.getCode(), com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getSdkVersion());
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.SDK_REFERENCE_NUMBER.getCode(), com.paypal.android.threeds.utils.ThreeDsSdkUtils.SDK_REFERENCE_NUMBER);
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.DATE_TIME.getCode(), getHighSpeedVideoSizes());
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.SDK_TRANS_ID.getCode(), com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.createSdkTransactionId());
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Collecting system storage and environment information", null, null, 6, null);
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.ENV_EXTERNAL_STORAGE_STATE.getCode(), android.os.Environment.getExternalStorageState());
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.LOCALE_AVAILABLE_COUNT.getCode(), java.lang.String.valueOf(java.util.Locale.getAvailableLocales().length));
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.STAT_FS_TOTAL_BYTES.getCode(), java.lang.String.valueOf(new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().toString()).getTotalBytes()));
        hashMap.put(com.paypal.android.threeds.data.model.DeviceDataParam.WEBVIEW_USER_AGENT.getCode(), com.paypal.android.threeds.utils.NetworkUtil.WEB_VIEW_USER_AGENT);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Collecting location information", null, null, 6, null);
        try {
            java.lang.Object systemService2 = context.getSystemService("location");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
            com.paypal.android.threeds.utils.DeviceDataUtil deviceDataUtil = INSTANCE;
            boolean isPermissionGranted3 = deviceDataUtil.isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION");
            boolean isPermissionGranted4 = deviceDataUtil.isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION");
            com.paypal.android.logger.Logger logger2 = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Location permissions - fine: ");
            sb5.append(isPermissionGranted3);
            sb5.append(", coarse: ");
            sb5.append(isPermissionGranted4);
            com.paypal.android.logger.Logger.i$default(logger2, sb5.toString(), null, null, 6, null);
            if (isPermissionGranted3 || isPermissionGranted4) {
                com.google.android.gms.tasks.Task<android.location.Location> lastLocation = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(context).getLastLocation();
                final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.utils.DeviceDataUtil$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.android.threeds.utils.DeviceDataUtil.$r8$lambda$lp78pop4GRZcrJnEODbc0eo5REQ(hashMap, hashMap2, (android.location.Location) obj);
                    }
                };
                kotlin.jvm.internal.Intrinsics.checkNotNull(lastLocation.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.paypal.android.threeds.utils.DeviceDataUtil$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(java.lang.Object obj) {
                        kotlin.jvm.functions.Function1.this.invoke(obj);
                    }
                }));
            } else {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Location permissions not granted", null, null, 6, null);
                hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.LATITUDE.getCode(), NEED_PERMISSION);
                hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.LONGITUDE.getCode(), NEED_PERMISSION);
            }
        } catch (java.lang.Exception unused) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to get location", null, null, 6, null);
            hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.LATITUDE.getCode(), NULL_OR_BLANK);
            hashMap2.put(com.paypal.android.threeds.data.model.DeviceDataParam.LONGITUDE.getCode(), NULL_OR_BLANK);
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Collecting platform-specific data", null, null, 6, null);
        com.paypal.android.threeds.transaction.devicedata.TelephonyManagerData.INSTANCE.updateDeviceData(context, hashMap, hashMap2);
        com.paypal.android.threeds.transaction.devicedata.WifiManagerData.INSTANCE.updateDeviceData(context, hashMap, hashMap2);
        com.paypal.android.threeds.transaction.devicedata.BluetoothManagerData.INSTANCE.updateDeviceData(context, hashMap, hashMap2);
        com.paypal.android.threeds.transaction.devicedata.BuildInfoData.INSTANCE.updateDeviceData(context, hashMap, hashMap2);
        com.paypal.android.threeds.transaction.devicedata.SystemSettingData.INSTANCE.updateDeviceData(context, hashMap, hashMap2);
        com.paypal.android.threeds.transaction.devicedata.PackageManagerData.INSTANCE.updateDeviceData(context, hashMap, hashMap2);
        com.paypal.android.threeds.transaction.devicedata.DisplayMetricsData.INSTANCE.updateDeviceData(context, hashMap, hashMap2);
        java.util.List<com.paypal.android.threeds.security.Warning> warnings = com.paypal.android.threeds.security.SecurityCheck.INSTANCE.getWarnings();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(warnings, 10));
        java.util.Iterator<T> it = warnings.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.android.threeds.security.Warning) it.next()).getId());
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Device data collection completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("collected parameters size", java.lang.Integer.valueOf(hashMap.size())), kotlin.TuplesKt.to("unavailable parameters size", java.lang.Integer.valueOf(hashMap2.size())), kotlin.TuplesKt.to("security warnings", java.lang.Integer.valueOf(arrayList2.size()))), null, 4, null);
        return new com.paypal.android.threeds.data.model.DeviceDataModel("1.6", hashMap, hashMap2, arrayList2);
    }

    private static java.lang.String getHighSpeedVideoSizes() {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Getting current date time in UTC", null, null, 6, null);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddhhmmss", androidx.core.os.LocaleListCompat.getDefault().get(0));
        try {
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
            java.lang.String format = simpleDateFormat.format(new java.util.Date());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        } catch (java.lang.Exception unused) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to format date time in getDateTime", null, null, 6, null);
            return NULL_OR_BLANK;
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap() {
        java.lang.String hostAddress;
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Getting IP address", null, null, 6, null);
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkInterfaces, "");
            while (networkInterfaces.hasMoreElements()) {
                java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nextElement, "");
                java.util.Enumeration<java.net.InetAddress> inetAddresses = nextElement.getInetAddresses();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inetAddresses, "");
                while (inetAddresses.hasMoreElements()) {
                    java.net.InetAddress nextElement2 = inetAddresses.nextElement();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(nextElement2);
                    if (nextElement2.isLoopbackAddress() && (hostAddress = nextElement2.getHostAddress()) != null && !kotlin.text.StringsKt.isBlank(hostAddress) && ((nextElement2 instanceof java.net.Inet4Address) || (nextElement2 instanceof java.net.Inet6Address))) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Found valid IP address", null, null, 6, null);
                        return nextElement2.getHostAddress();
                    }
                }
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "No valid IP address found", null, null, 6, null);
            return null;
        } catch (java.lang.Exception unused) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to get IP address", null, null, 6, null);
            return null;
        }
    }

    public final void updateDeviceInfo(java.lang.String key, java.lang.String value, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Updating device info for key: ".concat(java.lang.String.valueOf(key)), null, null, 6, null);
        java.lang.String str = value;
        if (str != null && !kotlin.text.StringsKt.isBlank(str) && !kotlin.text.StringsKt.equals(value, "unknown", true)) {
            deviceData.put(key, value);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Device info added: ".concat(java.lang.String.valueOf(key)), null, null, 6, null);
        } else {
            deviceParamNotAvailable.put(key, NULL_OR_BLANK);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Device info not available: ".concat(java.lang.String.valueOf(key)), null, null, 6, null);
        }
    }

    public final void updateDeviceInfoArray(java.lang.String key, java.lang.String[] value, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Updating device info array for key: ".concat(java.lang.String.valueOf(key)), null, null, 6, null);
        if (value != null && value.length != 0) {
            deviceData.put(key, value);
            com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            int length = value.length;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Device info array added: ");
            sb.append(key);
            sb.append(" with ");
            sb.append(length);
            sb.append(" items");
            com.paypal.android.logger.Logger.i$default(logger, sb.toString(), null, null, 6, null);
            return;
        }
        deviceParamNotAvailable.put(key, NULL_OR_BLANK);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Device info array not available: ".concat(java.lang.String.valueOf(key)), null, null, 6, null);
    }

    public final boolean isPermissionGranted(android.content.Context context, java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
        return androidx.core.content.ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lp78pop4GRZcrJnEODbc0eo5REQ(java.util.Map map, java.util.Map map2, android.location.Location location) {
        if (location != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Location obtained", null, null, 6, null);
            map.put(com.paypal.android.threeds.data.model.DeviceDataParam.LATITUDE.getCode(), java.lang.String.valueOf(location.getLatitude()));
            map.put(com.paypal.android.threeds.data.model.DeviceDataParam.LONGITUDE.getCode(), java.lang.String.valueOf(location.getLongitude()));
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Location is null", null, null, 6, null);
            map2.put(com.paypal.android.threeds.data.model.DeviceDataParam.LATITUDE.getCode(), NULL_OR_BLANK);
            map2.put(com.paypal.android.threeds.data.model.DeviceDataParam.LONGITUDE.getCode(), NULL_OR_BLANK);
        }
        return kotlin.Unit.INSTANCE;
    }
}
