package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ironsource.Q3;
import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 f2\u00020\u0001:\u0001fB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0003J\b\u0010\"\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u000fH\u0002J\u0006\u0010%\u001a\u00020\u000fJ\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020!H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!H\u0002J\u000e\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020!J\u0006\u0010/\u001a\u00020!J\u0012\u00100\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010\u0012H\u0003J\u0012\u00102\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010\u0012H\u0002J\u000f\u00103\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\b4J\b\u00105\u001a\u00020,H\u0002J\b\u00106\u001a\u00020!H\u0002J\u0006\u00107\u001a\u00020\u001cJ\u0006\u00108\u001a\u00020\u001cJ\u0010\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020\u0010H\u0002J\b\u0010=\u001a\u00020\u0010H\u0002J\b\u0010>\u001a\u00020\u0010H\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J\b\u0010@\u001a\u00020\u001cH\u0002J\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eJ\b\u0010B\u001a\u00020\u0010H\u0002J\b\u0010C\u001a\u00020\u0010H\u0002J\b\u0010D\u001a\u00020\u0010H\u0002J\b\u0010E\u001a\u00020\u001cH\u0002J\n\u0010F\u001a\u0004\u0018\u00010GH\u0002J\n\u0010H\u001a\u0004\u0018\u00010IH\u0002J\n\u0010J\u001a\u0004\u0018\u00010KH\u0002J\b\u0010L\u001a\u00020\u0010H\u0016J\b\u0010M\u001a\u00020\u0010H\u0002J\b\u0010N\u001a\u00020\u0010H\u0003J\b\u0010T\u001a\u00020\u000fH\u0016J\b\u0010U\u001a\u00020\u000fH\u0016J\b\u0010V\u001a\u00020!H\u0016J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000f0XH\u0016J\b\u0010Y\u001a\u00020\u0010H\u0002J\u0006\u0010Z\u001a\u00020!J\u0006\u0010[\u001a\u00020\u0010J\u0006\u0010\\\u001a\u00020\u0010J\u0006\u0010]\u001a\u00020^J\u0006\u0010_\u001a\u00020\u001cJ\u0006\u0010`\u001a\u00020\u001cJ\b\u0010a\u001a\u00020bH\u0007J\b\u0010c\u001a\u00020bH\u0007J\b\u0010d\u001a\u00020!H\u0007J\b\u0010e\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010S¨\u0006g"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "context", "Landroid/content/Context;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/log/Logger;)V", "getContext", "()Landroid/content/Context;", "reportedWarning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "", "cachedExternalFilesDir", "Ljava/io/File;", "externalFilesDirLock", "", RemoteConfigComponent.FETCH_FILE_NAME, "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "fetchAndroidDynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "getLanguage", "getTimeZone", "getTimeZoneOffset", "", "isUsingWifi", "getConnectionType", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getNetworkType", "", "getNetworkMetered", "getNetworkOperator", "getNetworkOperatorName", "getNetworkCountryISO", "getScreenWidth", "getScreenHeight", "isActiveNetworkConnected", "isWiredHeadsetOn", "getRingerMode", "getStreamVolume", "", "streamType", "getStreamMaxVolume", "getScreenBrightness", "getFreeSpace", "file", "getUsableSpace", "getCachedExternalFilesDir", "getCachedExternalFilesDir$unity_ads_defaultRelease", "getBatteryLevel", "getBatteryStatus", "getTotalMemory", "getFreeMemory", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "isAdbEnabled", "adbStatus", "isUSBConnected", "getUptime", "getElapsedRealtime", "getProcessInfo", U3.j.M, "isLimitOpenAdTrackingEnabled", "isAppActive", "getEventTimeStamp", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getAudioManager", "Landroid/media/AudioManager;", "hasInternet", "hasInternetConnection", "hasInternetConnectionM", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "getOrientation", "getConnectionTypeStr", "getCurrentUiTheme", "getLocaleList", "", "getAirplaneMode", "getChargingType", "getStayOnWhilePluggedIn", "getIsSdCardPresent", "getNetworkCapabilityTransports", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getJvmFreeMemory", "getJvmTotalMemory", "getFontScale", "", "getAnimatorScale", "getAccessibilityDisplayDaltonizer", "getDisplayInversionEnabled", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final String DIRECTORY_MODE_READ = "r";
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final String KEY_STAT_CONTENT = "stat";
    public static final String SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER = "accessibility_display_daltonizer";
    public static final String SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED = "accessibility_display_daltonizer_enabled";
    public static final String SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED = "accessibility_display_inversion_enabled";
    public static final String USB_EXTRA_CONNECTED = "connected";
    private volatile File cachedExternalFilesDir;
    private final Context context;
    private final Object externalFilesDirLock;
    private final LifecycleDataSource lifecycleDataSource;
    private final Logger logger;
    private final MutableStateFlow<Map<String, Boolean>> reportedWarning;
    private final Flow<VolumeSettingsChange> volumeSettingsChange;

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(Context context, LifecycleDataSource lifecycleDataSource, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.logger = logger;
        this.reportedWarning = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.externalFilesDirLock = new Object();
        this.volumeSettingsChange = FlowKt.callbackFlow(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null));
    }

    public final Context getContext() {
        return this.context;
    }

    private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        DynamicDeviceInfoKt dynamicDeviceInfoKt = DynamicDeviceInfoKt.INSTANCE;
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        DynamicDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
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
        _create.setJvmFreeMemory(getJvmFreeMemory());
        _create.setJvmTotalMemory(getJvmTotalMemory());
        _create.setFontScale(getFontScale());
        _create.setAnimatorScale(getAnimatorScale());
        _create.setAccessibilityDisplayDaltonizer(getAccessibilityDisplayDaltonizer());
        _create.setDisplayInversionEnabled(getDisplayInversionEnabled());
        return _create._build();
    }

    private final String getLanguage() {
        String locale = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(locale, "toString(...)");
        return locale;
    }

    private final String getTimeZone() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            Intrinsics.checkNotNull(displayName);
            return displayName;
        } catch (AssertionError e) {
            Logger.DefaultImpls.error$default(this.logger, "Could not read timeZone information: " + e.getMessage(), null, 2, null);
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        if (isUsingWifi()) {
            return DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI;
        }
        if (isActiveNetworkConnected()) {
            return DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR;
        }
        return DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    @Deprecated(message = "This method was deprecated in API level 30. Use getDataNetworkType()")
    private final int getNetworkType() {
        Map<String, Boolean> value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager == null) {
            return -1;
        }
        try {
            return telephonyManager.getNetworkType();
        } catch (SecurityException unused) {
            if (Intrinsics.areEqual((Object) this.reportedWarning.getValue().get("getNetworkType"), (Object) true)) {
                return -1;
            }
            MutableStateFlow<Map<String, Boolean>> mutableStateFlow = this.reportedWarning;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, MapsKt.plus(value, TuplesKt.to("getNetworkType", true))));
            this.logger.info("Unity Ads was not able to get current network type due to missing permission");
            return -1;
        }
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final String getNetworkOperator() {
        String networkOperator;
        TelephonyManager telephonyManager = getTelephonyManager();
        return (telephonyManager == null || (networkOperator = telephonyManager.getNetworkOperator()) == null) ? "" : networkOperator;
    }

    private final String getNetworkOperatorName() {
        String networkOperatorName;
        TelephonyManager telephonyManager = getTelephonyManager();
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? "" : networkOperatorName;
    }

    public final String getNetworkCountryISO() {
        String networkCountryIso;
        TelephonyManager telephonyManager = getTelephonyManager();
        return (telephonyManager == null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) ? "" : networkCountryIso;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
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
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    @Deprecated(message = "Legacy method, migrated from to .getUsableSpace()")
    private final long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return MathKt.roundToInt(file.getFreeSpace() / 1024);
    }

    private final long getUsableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return MathKt.roundToInt(file.getUsableSpace() / 1024);
    }

    public final File getCachedExternalFilesDir$unity_ads_defaultRelease() {
        File file;
        File file2 = this.cachedExternalFilesDir;
        if (file2 != null) {
            return file2;
        }
        synchronized (this.externalFilesDirLock) {
            file = this.cachedExternalFilesDir;
            if (file == null) {
                file = this.context.getExternalFilesDir(null);
                if (file != null) {
                    this.cachedExternalFilesDir = file;
                } else {
                    file = null;
                }
            }
        }
        return file;
    }

    private final double getBatteryLevel() {
        if (this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return -1.0d;
        }
        return r0.getIntExtra("level", 0) / r0.getIntExtra("scale", 0);
    }

    private final int getBatteryStatus() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) {
        int i = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_MEM_INFO, "r");
        try {
            RandomAccessFile randomAccessFile2 = randomAccessFile;
            String str = null;
            for (int i3 = 0; i3 < i2; i3++) {
                str = randomAccessFile2.readLine();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(randomAccessFile, null);
            return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
        } finally {
        }
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean adbStatus() {
        Boolean bool;
        try {
            boolean z = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } catch (Exception e) {
            this.logger.error("Problems fetching adb enabled status", e);
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean isUSBConnected() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter(INTENT_USB_STATE));
        if (registerReceiver != null) {
            return registerReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public final Map<String, String> getProcessInfo() {
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_PROCESS_INFO, "r");
        try {
            hashMap.put(KEY_STAT_CONTENT, randomAccessFile.readLine());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(randomAccessFile, null);
            return hashMap;
        } finally {
        }
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        return hasInternetConnectionM();
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private final boolean hasInternetConnectionM() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public Flow<VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getOrientation() {
        if (getScreenHeight() > getScreenWidth()) {
            return U3.i.D;
        }
        return U3.i.C;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getConnectionTypeStr() {
        int i = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        if (i != 1) {
            return i != 2 ? "none" : Q3.g;
        }
        return Q3.b;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public List<String> getLocaleList() {
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        int size = locales.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i).toString());
        }
        return arrayList;
    }

    private final boolean getAirplaneMode() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Throwable th) {
            this.logger.error("Problems fetching airplane mode status", th);
            return false;
        }
    }

    public final int getChargingType() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Throwable th) {
            this.logger.error("Problems fetching stay on while plugged in status", th);
            return false;
        }
    }

    public final boolean getIsSdCardPresent() {
        return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
    }

    public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        Network activeNetwork;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (Build.VERSION.SDK_INT < 31) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build2 = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            return build2;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build3 = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
            return build3;
        }
        newBuilder.setWifi(networkCapabilities.hasTransport(1));
        newBuilder.setCellular(networkCapabilities.hasTransport(0));
        newBuilder.setVpn(networkCapabilities.hasTransport(4));
        newBuilder.setEthernet(networkCapabilities.hasTransport(3));
        newBuilder.setWifiAware(networkCapabilities.hasTransport(5));
        newBuilder.setLowpan(networkCapabilities.hasTransport(6));
        newBuilder.setBluetooth(networkCapabilities.hasTransport(2));
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build4 = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build4, "build(...)");
        return build4;
    }

    public final long getJvmFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    public final long getJvmTotalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    public final float getFontScale() {
        return this.context.getResources().getConfiguration().fontScale;
    }

    public final float getAnimatorScale() {
        try {
            return Settings.Global.getFloat(this.context.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Throwable th) {
            this.logger.error("Problems fetching animator scale", th);
            return 1.0f;
        }
    }

    public final int getAccessibilityDisplayDaltonizer() {
        try {
            Integer valueOf = Integer.valueOf(Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED, 0));
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return -1;
            }
            valueOf.intValue();
            return Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER, -1);
        } catch (Throwable th) {
            this.logger.error("Problems fetching accessibility display daltonizer", th);
            return -1;
        }
    }

    public final boolean getDisplayInversionEnabled() {
        try {
            return Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED, 0) != 0;
        } catch (Throwable th) {
            this.logger.error("Problems fetching display inversion enabled status", th);
            return false;
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        DynamicDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setLanguage(getLanguage());
        _create.setNetworkOperator(getNetworkOperator());
        _create.setNetworkOperatorName(getNetworkOperatorName());
        _create.setFreeDiskSpace(getUsableSpace(getCachedExternalFilesDir$unity_ads_defaultRelease()));
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
