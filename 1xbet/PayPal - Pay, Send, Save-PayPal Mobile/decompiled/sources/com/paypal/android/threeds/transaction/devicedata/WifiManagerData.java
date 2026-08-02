package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/WifiManagerData;", "Lcom/paypal/android/threeds/interfaces/DeviceDataFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceData", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/net/wifi/WifiManager;", "wifiManager", "", "hasWifiRTT", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Z", "Landroid/net/wifi/WifiInfo;", "wifiInfo", "updateWifiInfo", "(Landroid/net/wifi/WifiInfo;Ljava/util/Map;Ljava/util/Map;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WifiManagerData implements com.paypal.android.threeds.interfaces.DeviceDataFactory {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.WifiManagerData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.WifiManagerData();

    private WifiManagerData() {
    }

    @Override // com.paypal.android.threeds.interfaces.DeviceDataFactory
    public final void updateDeviceData(android.content.Context context, final java.util.Map<java.lang.String, java.lang.Object> deviceData, final java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.ACCESS_WIFI_STATE")) {
            java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            final android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_5GHZ_BAND_SUPPORTED.getCode(), java.lang.String.valueOf(wifiManager.is5GHzBandSupported()));
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED.getCode(), java.lang.String.valueOf(wifiManager.isEnhancedPowerReportingSupported()));
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_P2P_SUPPORTED.getCode(), java.lang.String.valueOf(wifiManager.isP2pSupported()));
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_TDLS_SUPPORTED.getCode(), java.lang.String.valueOf(wifiManager.isTdlsSupported()));
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED.getCode(), java.lang.String.valueOf(wifiManager.isPreferredNetworkOffloadSupported()));
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED.getCode(), java.lang.String.valueOf(hasWifiRTT(context, wifiManager)));
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 29) {
                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_SCAN_ALWAYS_AVAILABLE.getCode(), java.lang.String.valueOf(wifiManager.isScanAlwaysAvailable()));
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_SCAN_ALWAYS_AVAILABLE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
            }
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 30) {
                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_6GHZ_BAND_SUPPORTED.getCode(), java.lang.String.valueOf(wifiManager.is6GHzBandSupported()));
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_6GHZ_BAND_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
            }
            android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addTransportType(1).build();
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 23) {
                java.lang.Object systemService2 = context.getApplicationContext().getSystemService("connectivity");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
                ((android.net.ConnectivityManager) systemService2).registerNetworkCallback(build, new android.net.ConnectivityManager.NetworkCallback() { // from class: com.paypal.android.threeds.transaction.devicedata.WifiManagerData$updateWifiInformation$networkCallback$1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
                        android.net.wifi.WifiInfo connectionInfo;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCapabilities, "");
                        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 29) {
                            android.net.TransportInfo transportInfo = networkCapabilities.getTransportInfo();
                            connectionInfo = transportInfo instanceof android.net.wifi.WifiInfo ? (android.net.wifi.WifiInfo) transportInfo : null;
                            if (connectionInfo == null) {
                                connectionInfo = wifiManager.getConnectionInfo();
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNull(connectionInfo);
                        } else {
                            connectionInfo = wifiManager.getConnectionInfo();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(connectionInfo);
                        }
                        com.paypal.android.threeds.transaction.devicedata.WifiManagerData.INSTANCE.updateWifiInfo(connectionInfo, deviceData, deviceParamNotAvailable);
                    }
                });
                return;
            }
            return;
        }
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_MAC.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_BSSID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_SSID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_NETWORK_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_5GHZ_BAND_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_6GHZ_BAND_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_P2P_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_SCAN_ALWAYS_AVAILABLE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_IS_TDLS_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_POINT_FQDN.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_PROVIDER_FRIENDLY_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
    }

    public final boolean hasWifiRTT(android.content.Context context, android.net.wifi.WifiManager wifiManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wifiManager, "");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 28) {
            return wifiManager.isDeviceToApRttSupported();
        }
        return packageManager.hasSystemFeature("android.hardware.wifi.rtt");
    }

    public final void updateWifiInfo(android.net.wifi.WifiInfo wifiInfo, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        java.lang.String passpointProviderFriendlyName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wifiInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 29) {
            if (wifiInfo.getPasspointFqdn() != null) {
                java.lang.String passpointFqdn = wifiInfo.getPasspointFqdn();
                kotlin.jvm.internal.Intrinsics.checkNotNull(passpointFqdn);
                if (!kotlin.text.StringsKt.isBlank(passpointFqdn)) {
                    java.lang.String code = com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_POINT_FQDN.getCode();
                    java.lang.String passpointFqdn2 = wifiInfo.getPasspointFqdn();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(passpointFqdn2);
                    deviceData.put(code, passpointFqdn2);
                    passpointProviderFriendlyName = wifiInfo.getPasspointProviderFriendlyName();
                    if (passpointProviderFriendlyName == null && !kotlin.text.StringsKt.isBlank(passpointProviderFriendlyName)) {
                        java.lang.String code2 = com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_PROVIDER_FRIENDLY_NAME.getCode();
                        java.lang.String passpointProviderFriendlyName2 = wifiInfo.getPasspointProviderFriendlyName();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(passpointProviderFriendlyName2);
                        deviceData.put(code2, passpointProviderFriendlyName2);
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_PROVIDER_FRIENDLY_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                }
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_POINT_FQDN.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            passpointProviderFriendlyName = wifiInfo.getPasspointProviderFriendlyName();
            if (passpointProviderFriendlyName == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_PROVIDER_FRIENDLY_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_POINT_FQDN.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_PASS_PROVIDER_FRIENDLY_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
        java.lang.String macAddress = wifiInfo.getMacAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(macAddress, "");
        if (!kotlin.text.StringsKt.isBlank(macAddress)) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_MAC.getCode(), wifiInfo.getMacAddress());
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_MAC.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
        java.lang.String bssid = wifiInfo.getBSSID();
        if (bssid != null && !kotlin.text.StringsKt.isBlank(bssid)) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_BSSID.getCode(), wifiInfo.getBSSID());
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_BSSID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
        java.lang.String ssid = wifiInfo.getSSID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ssid, "");
        if (!kotlin.text.StringsKt.isBlank(ssid)) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_SSID.getCode(), wifiInfo.getSSID());
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_SSID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.WIFI_NETWORK_ID.getCode(), java.lang.String.valueOf(wifiInfo.getNetworkId()));
    }
}
