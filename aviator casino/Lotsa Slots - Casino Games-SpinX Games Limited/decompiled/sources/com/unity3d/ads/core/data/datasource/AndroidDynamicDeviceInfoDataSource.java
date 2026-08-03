package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 W2\u00020\u0001:\u0001WB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\fH\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0006\u0010)\u001a\u00020'J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0003J\u0006\u0010-\u001a\u00020\rJ\b\u0010.\u001a\u00020\fH\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\f00H\u0016J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u000203H\u0002J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020\fJ\b\u00107\u001a\u00020\rH\u0002J\b\u00108\u001a\u00020\fH\u0002J\b\u00109\u001a\u00020\fH\u0002J\b\u0010:\u001a\u00020\u001eH\u0003J\b\u0010;\u001a\u00020\fH\u0016J\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010=\u001a\u00020\u001eH\u0016J\u0006\u0010>\u001a\u00020\u001eJ\b\u0010?\u001a\u00020\u001eH\u0002J\b\u0010@\u001a\u00020\u001eH\u0002J\u0006\u0010A\u001a\u00020\rJ\u000e\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001eJ\u0010\u0010D\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001eH\u0002J\n\u0010E\u001a\u0004\u0018\u00010FH\u0002J\b\u0010G\u001a\u00020\fH\u0002J\b\u0010H\u001a\u00020'H\u0002J\u0006\u0010I\u001a\u00020'J\b\u0010J\u001a\u00020'H\u0002J\u0012\u0010K\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\b\u0010L\u001a\u00020\rH\u0016J\b\u0010M\u001a\u00020\rH\u0002J\b\u0010N\u001a\u00020\rH\u0003J\b\u0010O\u001a\u00020\rH\u0002J\b\u0010P\u001a\u00020\rH\u0002J\b\u0010Q\u001a\u00020\rH\u0002J\b\u0010R\u001a\u00020\rH\u0002J\b\u0010S\u001a\u00020\rH\u0002J\b\u0010T\u001a\u00020\rH\u0002J\b\u0010U\u001a\u00020\rH\u0002J\b\u0010V\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006X"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "context", "Landroid/content/Context;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;)V", "getContext", "()Landroid/content/Context;", "reportedWarning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "adbStatus", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "fetchAndroidDynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "getAirplaneMode", "getAudioManager", "Landroid/media/AudioManager;", "getBatteryLevel", "", "getBatteryStatus", "", "getChargingType", "getConnectionType", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getConnectionTypeStr", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getCurrentUiTheme", "getElapsedRealtime", "", "getEventTimeStamp", "getFreeMemory", "getFreeSpace", "file", "Ljava/io/File;", "getIsSdCardPresent", "getLanguage", "getLocaleList", "", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getNetworkCapabilityTransports", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getNetworkCountryISO", "getNetworkMetered", "getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getOrientation", "getProcessInfo", "getRingerMode", "getScreenBrightness", "getScreenHeight", "getScreenWidth", "getStayOnWhilePluggedIn", "getStreamMaxVolume", "streamType", "getStreamVolume", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "getTimeZone", "getTimeZoneOffset", "getTotalMemory", "getUptime", "getUsableSpace", "hasInternet", "hasInternetConnection", "hasInternetConnectionM", "isActiveNetworkConnected", "isAdbEnabled", "isAppActive", com.ironsource.X3.j.M, "isLimitOpenAdTrackingEnabled", "isUSBConnected", "isUsingWifi", "isWiredHeadsetOn", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidDynamicDeviceInfoDataSource implements com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource {
    public static final java.lang.String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final java.lang.String DIRECTORY_MODE_READ = "r";
    public static final java.lang.String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final java.lang.String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final java.lang.String KEY_STAT_CONTENT = "stat";
    public static final java.lang.String USB_EXTRA_CONNECTED = "connected";
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.lang.Boolean>> reportedWarning;
    private final kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.datasource.VolumeSettingsChange> volumeSettingsChange;

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.unity3d.services.core.device.Device.MemoryInfoType.values().length];
            try {
                iArr[com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(android.content.Context context, com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.reportedWarning = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.MapsKt.emptyMap());
        this.volumeSettingsChange = kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null));
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        gatewayprotocol.v1.DynamicDeviceInfoKt dynamicDeviceInfoKt = gatewayprotocol.v1.DynamicDeviceInfoKt.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setNetworkConnected(isActiveNetworkConnected());
        _create.setNetworkType(getNetworkType());
        _create.setNetworkMetered(getNetworkMetered());
        _create.setTelephonyManagerNetworkType(getNetworkType());
        _create.setAdbEnabled(isAdbEnabled());
        _create.setUsbConnected(isUSBConnected());
        _create.setVolume(getStreamVolume(3));
        _create.setMaxVolume(getStreamMaxVolume(3));
        _create.setDeviceElapsedRealtime(getElapsedRealtime());
        _create.setDeviceUpTime(getUptime());
        _create.setAirplaneMode(getAirplaneMode());
        _create.setChargingType(getChargingType());
        _create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        _create.setSdCardPresent(getIsSdCardPresent());
        _create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        return _create._build();
    }

    private final java.lang.String getLanguage() {
        java.lang.String locale = java.util.Locale.getDefault().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault().toString()");
        return locale;
    }

    private final java.lang.String getTimeZone() {
        try {
            java.lang.String displayName = java.util.TimeZone.getDefault().getDisplayName(false, 0, java.util.Locale.US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (java.lang.AssertionError e) {
            com.unity3d.services.core.log.DeviceLog.error("Could not read timeZone information: %s", e.getMessage());
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 1000;
    }

    private final boolean isUsingWifi() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        if (isUsingWifi()) {
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI;
        }
        if (isActiveNetworkConnected()) {
            return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR;
        }
        return gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    @kotlin.Deprecated(message = "This method was deprecated in API level 30. Use getDataNetworkType()")
    private final int getNetworkType() {
        java.util.Map<java.lang.String, java.lang.Boolean> value;
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager == null) {
            return -1;
        }
        try {
            return telephonyManager.getNetworkType();
        } catch (java.lang.SecurityException unused) {
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.reportedWarning.getValue().get("getNetworkType"), (java.lang.Object) true)) {
                return -1;
            }
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, java.lang.Boolean>> mutableStateFlow = this.reportedWarning;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.plus(value, kotlin.TuplesKt.to("getNetworkType", true))));
            com.unity3d.services.core.log.DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            return -1;
        }
    }

    private final boolean getNetworkMetered() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final java.lang.String getNetworkOperator() {
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        java.lang.String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        return networkOperator == null ? "" : networkOperator;
    }

    private final java.lang.String getNetworkOperatorName() {
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        java.lang.String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final java.lang.String getNetworkCountryISO() {
        android.telephony.TelephonyManager telephonyManager = getTelephonyManager();
        java.lang.String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? "" : networkCountryIso;
    }

    private final int getScreenWidth() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final int getScreenHeight() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final boolean isActiveNetworkConnected() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        android.media.AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        android.media.AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getStreamVolume(int streamType) {
        return getAudioManager() != null ? r0.getStreamVolume(streamType) : -2;
    }

    public final double getStreamMaxVolume(int streamType) {
        return getAudioManager() != null ? r0.getStreamMaxVolume(streamType) : -2;
    }

    public final int getScreenBrightness() {
        return android.provider.Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    @kotlin.Deprecated(message = "Legacy method, migrated from to .getUsableSpace()")
    private final long getFreeSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return kotlin.math.MathKt.roundToInt(file.getFreeSpace() / 1024);
    }

    private final long getUsableSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return kotlin.math.MathKt.roundToInt(file.getUsableSpace() / 1024);
    }

    private final double getBatteryLevel() {
        if (this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return -1.0d;
        }
        return r0.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, 0) / r0.getIntExtra("scale", 0);
    }

    private final int getBatteryStatus() {
        android.content.Intent registerReceiver = this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getFreeMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY);
    }

    private final long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType infoType) {
        int i = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(DIRECTORY_MEM_INFO, DIRECTORY_MODE_READ);
        try {
            java.io.RandomAccessFile randomAccessFile2 = randomAccessFile;
            java.lang.String str = null;
            for (int i3 = 0; i3 < i2; i3++) {
                str = randomAccessFile2.readLine();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(randomAccessFile, null);
            return com.unity3d.ads.core.utils.GetMemoryValueFromStringKt.getMemoryValueFromString(str);
        } finally {
        }
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean adbStatus() {
        java.lang.Boolean bool;
        try {
            boolean z = true;
            if (1 != android.provider.Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z = false;
            }
            bool = java.lang.Boolean.valueOf(z);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Problems fetching adb enabled status", e);
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean isUSBConnected() {
        android.content.Intent registerReceiver = this.context.registerReceiver(null, new android.content.IntentFilter(INTENT_USB_STATE));
        if (registerReceiver != null) {
            return registerReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final long getUptime() {
        return android.os.SystemClock.uptimeMillis();
    }

    private final long getElapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    public final java.util.Map<java.lang.String, java.lang.String> getProcessInfo() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(DIRECTORY_PROCESS_INFO, DIRECTORY_MODE_READ);
        try {
            java.lang.String statContent = randomAccessFile.readLine();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(statContent, "statContent");
            hashMap.put(KEY_STAT_CONTENT, statContent);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(randomAccessFile, null);
            return hashMap;
        } finally {
        }
    }

    private final boolean isLimitAdTrackingEnabled() {
        return com.unity3d.services.core.device.AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final long getEventTimeStamp() {
        return java.lang.System.currentTimeMillis() / 1000;
    }

    private final android.telephony.TelephonyManager getTelephonyManager() {
        java.lang.Object systemService = this.context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        if (systemService instanceof android.telephony.TelephonyManager) {
            return (android.telephony.TelephonyManager) systemService;
        }
        return null;
    }

    private final android.net.ConnectivityManager getConnectivityManager() {
        java.lang.Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof android.net.ConnectivityManager) {
            return (android.net.ConnectivityManager) systemService;
        }
        return null;
    }

    private final android.media.AudioManager getAudioManager() {
        java.lang.Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof android.media.AudioManager) {
            return (android.media.AudioManager) systemService;
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return hasInternetConnectionM();
        }
        return hasInternetConnection();
    }

    private final boolean hasInternetConnection() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private final boolean hasInternetConnectionM() {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.datasource.VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public java.lang.String getOrientation() {
        if (getScreenHeight() > getScreenWidth()) {
            return "portrait";
        }
        return "landscape";
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public java.lang.String getConnectionTypeStr() {
        int i = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        if (i != 1) {
            return i != 2 ? "none" : com.ironsource.T3.g;
        }
        return com.ironsource.T3.b;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public java.util.List<java.lang.String> getLocaleList() {
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.os.LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locales, "context.resources.configuration.locales");
            int size = locales.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            while (i < size) {
                java.lang.String locale = locales.get(i).toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "locales[it].toString()");
                arrayList.add(locale);
                i++;
            }
            return arrayList;
        }
        java.util.Locale[] availableLocales = java.util.Locale.getAvailableLocales();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales()");
        java.util.Locale[] localeArr = availableLocales;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(localeArr.length);
        int length = localeArr.length;
        while (i < length) {
            arrayList2.add(localeArr[i].toString());
            i++;
        }
        return arrayList2;
    }

    private final boolean getAirplaneMode() {
        try {
            return android.provider.Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (java.lang.Throwable th) {
            com.unity3d.services.core.log.DeviceLog.error("Problems fetching airplane mode status", th.getMessage());
            return false;
        }
    }

    public final int getChargingType() {
        android.content.Intent registerReceiver = this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return android.provider.Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (java.lang.Throwable th) {
            com.unity3d.services.core.log.DeviceLog.error("Problems fetching stay on while plugged in status", th.getMessage());
            return false;
        }
    }

    public final boolean getIsSdCardPresent() {
        return kotlin.jvm.internal.Intrinsics.areEqual(android.os.Environment.getExternalStorageState(), "mounted");
    }

    public final gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        android.net.Network activeNetwork;
        gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder result = gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (android.os.Build.VERSION.SDK_INT < 31) {
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build = result.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "result.build()");
            return build;
        }
        java.lang.Object systemService = this.context.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build2 = result.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "result.build()");
            return build2;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build3 = result.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, "result.build()");
            return build3;
        }
        boolean hasTransport = networkCapabilities.hasTransport(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "result");
        result.setWifi(hasTransport);
        result.setCellular(networkCapabilities.hasTransport(0));
        result.setVpn(networkCapabilities.hasTransport(4));
        result.setEthernet(networkCapabilities.hasTransport(3));
        result.setWifiAware(networkCapabilities.hasTransport(5));
        result.setLowpan(networkCapabilities.hasTransport(6));
        result.setBluetooth(networkCapabilities.hasTransport(2));
        gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build4 = result.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build4, "result.build()");
        return build4;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setLanguage(getLanguage());
        _create.setNetworkOperator(getNetworkOperator());
        _create.setNetworkOperatorName(getNetworkOperatorName());
        _create.setFreeDiskSpace(getUsableSpace(this.context.getExternalFilesDir(null)));
        _create.setFreeRamMemory(getFreeMemory());
        _create.setWiredHeadset(isWiredHeadsetOn());
        _create.setTimeZone(getTimeZone());
        _create.setTimeZoneOffset(getTimeZoneOffset());
        _create.setLimitedTracking(isLimitAdTrackingEnabled());
        _create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        _create.setBatteryLevel(getBatteryLevel());
        _create.setBatteryStatus(getBatteryStatus());
        _create.setConnectionType(getConnectionType());
        _create.setAndroid(fetchAndroidDynamicDeviceInfo());
        _create.setAppActive(isAppActive());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        return _create._build();
    }
}
