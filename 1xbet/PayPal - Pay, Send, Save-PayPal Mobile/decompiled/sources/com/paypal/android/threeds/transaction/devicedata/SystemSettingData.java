package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\rJO\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0016\u0010\rJ=\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0017\u0010\rJ=\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0018\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/SystemSettingData;", "Lcom/paypal/android/threeds/interfaces/DeviceDataFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceData", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V", "updateLocationMode", "p0", "p1", "p2", "p3", "p4", "getHighSpeedVideoSizes", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "updateRttCallingModeEnabled", "updateSecureFrpMode", "updateRampingRingerEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SystemSettingData implements com.paypal.android.threeds.interfaces.DeviceDataFactory {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.SystemSettingData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.SystemSettingData();

    private SystemSettingData() {
    }

    public final void updateLocationMode(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        java.lang.Object systemService = context.getSystemService("location");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.location.LocationManager locationManager = (android.location.LocationManager) systemService;
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 28) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_LOCATION_MODE.getCode(), java.lang.String.valueOf(locationManager.isLocationEnabled()));
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_LOCATION_MODE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
    }

    private static void getHighSpeedVideoSizes(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.util.Map<java.lang.String, java.lang.Object> p3, java.util.Map<java.lang.String, java.lang.String> p4) {
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() <= 32) {
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(p2, android.provider.Settings.Secure.getString(p0.getContentResolver(), p1), p3, p4);
        } else {
            p4.put(p2, com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
    }

    public final void updateRttCallingModeEnabled(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 28) {
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_RTT_CALLING_MODE.getCode(), android.provider.Settings.Secure.getString(context.getContentResolver(), "rtt_calling_mode"), deviceData, deviceParamNotAvailable);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_RTT_CALLING_MODE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
    }

    public final void updateSecureFrpMode(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 30) {
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_SECURE_FRP_MODE.getCode(), android.provider.Settings.Secure.getString(context.getContentResolver(), "secure_frp_mode"), deviceData, deviceParamNotAvailable);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_SECURE_FRP_MODE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
    }

    public final void updateRampingRingerEnabled(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 33) {
            java.lang.Object systemService = context.getSystemService("audio");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_APPLY_RAMPING_RINGER.getCode(), java.lang.String.valueOf(((android.media.AudioManager) systemService).isRampingRingerEnabled()));
        } else {
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 29) {
                try {
                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_APPLY_RAMPING_RINGER.getCode(), java.lang.String.valueOf(android.provider.Settings.Global.getInt(context.getContentResolver(), "apply_ramping_ringer")));
                    return;
                } catch (java.lang.Exception unused) {
                    deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_APPLY_RAMPING_RINGER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
                    return;
                }
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_APPLY_RAMPING_RINGER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
    }

    @Override // com.paypal.android.threeds.interfaces.DeviceDataFactory
    public final void updateDeviceData(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 29) {
            if (com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_INSTALL_NON_MARKET_APPS.getCode(), java.lang.String.valueOf(context.getPackageManager().canRequestPackageInstalls()));
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_INSTALL_NON_MARKET_APPS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            }
        } else if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 28) {
            java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "install_non_market_apps");
            java.lang.String str = string;
            if (str != null && str.length() != 0) {
                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_INSTALL_NON_MARKET_APPS.getCode(), string);
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_INSTALL_NON_MARKET_APPS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            }
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_INSTALL_NON_MARKET_APPS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
        updateRttCallingModeEnabled(context, deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "accessibility_display_inversion_enabled", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "accessibility_enabled", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ACCESSIBILITY_ENABLED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "speak_password", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "allowed_geolocation_origins", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ALLOWED_GEOLOCATION_ORIGINS.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, a.b.l, com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ANDROID_ID.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "default_input_method", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_DEFAULT_INPUT_METHOD.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "enabled_accessibility_services", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ENABLED_ACCESSIBILITY_SERVICES.getCode(), deviceData, deviceParamNotAvailable);
        if (context.getApplicationInfo().targetSdkVersion >= 34) {
            java.lang.Object systemService = context.getSystemService("input_method");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ENABLED_INPUT_METHODS.getCode(), ((android.view.inputmethod.InputMethodManager) systemService).getEnabledInputMethodList().toString(), deviceData, deviceParamNotAvailable);
        } else {
            getHighSpeedVideoSizes(context, "enabled_input_methods", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_ENABLED_INPUT_METHODS.getCode(), deviceData, deviceParamNotAvailable);
        }
        getHighSpeedVideoSizes(context, "input_method_selector_visibility", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_INPUT_METHOD_SELECTOR_VISIBILITY.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "skip_first_use_hints", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_SKIP_FIRST_USE_HINTS.getCode(), deviceData, deviceParamNotAvailable);
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() <= 24) {
            getHighSpeedVideoSizes(context, "sys_prop_setting_version", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_SYS_PROP_SETTING_VERSION.getCode(), deviceData, deviceParamNotAvailable);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_SYS_PROP_SETTING_VERSION.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
        getHighSpeedVideoSizes(context, "tts_default_pitch", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_TTS_DEFAULT_PITCH.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "tts_default_rate", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_TTS_DEFAULT_RATE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "tts_default_synth", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_TTS_DEFAULT_SYNTH.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "tts_enabled_plugins", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_TTS_ENABLED_PLUGINS.getCode(), deviceData, deviceParamNotAvailable);
        updateLocationMode(context, deviceData, deviceParamNotAvailable);
        updateSecureFrpMode(context, deviceData, deviceParamNotAvailable);
        updateRampingRingerEnabled(context, deviceData, deviceParamNotAvailable);
        if (context.getApplicationInfo().targetSdkVersion <= 32) {
            getHighSpeedVideoSizes(context, "data_roaming", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_DATA_ROAMING.getCode(), deviceData, deviceParamNotAvailable);
        } else if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 29) {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_DATA_ROAMING.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        } else if (com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_STATE") || com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE") || (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 33 && com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_BASIC_PHONE_STATE"))) {
            java.lang.Object systemService2 = context.getSystemService("phone");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_DATA_ROAMING.getCode(), java.lang.String.valueOf(((android.telephony.TelephonyManager) systemService2).isDataRoamingEnabled()), deviceData, deviceParamNotAvailable);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_DATA_ROAMING.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        }
        getHighSpeedVideoSizes(context, "device_provisioned", com.paypal.android.threeds.data.model.DeviceDataParam.SECURE_DEVICE_PROVISIONED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "adb_enabled", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_ADB_ENABLED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "airplane_mode_radios", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_AIRPLANE_MODE_RADIOS.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "always_finish_activities", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_ALWAYS_FINISH_ACTIVITIES.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "animator_duration_scale", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_ANIMATOR_DURATION_SCALE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "auto_time", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_AUTO_TIME.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "auto_time_zone", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_AUTO_TIME_ZONE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "development_settings_enabled", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_DEVELOPMENT_SETTINGS_ENABLED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "http_proxy", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_HTTP_PROXY.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "network_preference", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_NETWORK_PREFERENCE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "stay_on_while_plugged_in", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_STAY_ON_WHILE_PLUGGED_IN.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "transition_animation_scale", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_TRANSITION_ANIMATION_SCALE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "usb_mass_storage_enabled", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_USB_MASS_STORAGE_ENABLED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "use_google_mail", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_USE_GOOGLE_MAIL.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "wait_for_debugger", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_WAIT_FOR_DEBUGGER.getCode(), deviceData, deviceParamNotAvailable);
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() <= 26) {
            getHighSpeedVideoSizes(context, "wifi_networks_available_notification_on", com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON.getCode(), deviceData, deviceParamNotAvailable);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
        getHighSpeedVideoSizes(context, "accelerometer_rotation", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_ACCELEROMETER_ROTATION.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "bluetooth_discoverability", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_BLUETOOTH_DISCOVERABILITY.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "bluetooth_discoverability_timeout", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "date_format", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_DATE_FORMAT.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "time_12_24", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_TIME_12_24.getCode(), deviceData, deviceParamNotAvailable);
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 23) {
            getHighSpeedVideoSizes(context, "dtmf_tone_type", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING.getCode(), deviceData, deviceParamNotAvailable);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
        getHighSpeedVideoSizes(context, "dtmf_tone", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_DTMF_TONE_WHEN_DIALING.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "end_button_behavior", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_END_BUTTON_BEHAVIOR.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "font_scale", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_FONT_SCALE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "haptic_feedback_enabled", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_HAPTIC_FEEDBACK_ENABLED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "mode_ringer_streams_affected", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_MODE_RINGER_STREAMS_AFFECTED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "notification_sound", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_NOTIFICATION_SOUND.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "mute_streams_affected", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_MUTE_STREAMS_AFFECTED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "ringtone", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_RINGTONE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "screen_brightness", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_SCREEN_BRIGHTNESS.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "screen_brightness_mode", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_SCREEN_BRIGHTNESS_MODE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "screen_off_timeout", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_SCREEN_OFF_TIMEOUT.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "sound_effects_enabled", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_SOUND_EFFECTS_ENABLED.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "auto_caps", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_TEXT_AUTO_CAPS.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "auto_punctuate", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_TEXT_AUTO_PUNCTUATE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "auto_replace", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_TEXT_AUTO_REPLACE.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "show_password", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_TEXT_SHOW_PASSWORD.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "time_12_24", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_TIME_12_24.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "user_rotation", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_USER_ROTATION.getCode(), deviceData, deviceParamNotAvailable);
        getHighSpeedVideoSizes(context, "vibrate_on", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_VIBRATE_ON.getCode(), deviceData, deviceParamNotAvailable);
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 23) {
            getHighSpeedVideoSizes(context, "vibrate_when_ringing", com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_VIBRATE_WHEN_RINGING.getCode(), deviceData, deviceParamNotAvailable);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.SYSTEM_VIBRATE_WHEN_RINGING.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
    }
}
