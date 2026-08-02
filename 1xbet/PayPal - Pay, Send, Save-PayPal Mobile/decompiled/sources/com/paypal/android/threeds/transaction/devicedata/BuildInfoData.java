package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/BuildInfoData;", "Lcom/paypal/android/threeds/interfaces/DeviceDataFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceData", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BuildInfoData implements com.paypal.android.threeds.interfaces.DeviceDataFactory {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.BuildInfoData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.BuildInfoData();

    private BuildInfoData() {
    }

    @Override // com.paypal.android.threeds.interfaces.DeviceDataFactory
    public final void updateDeviceData(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_STATE")) {
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 26 && com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 29) {
                str = android.os.Build.getSerial();
            } else if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() <= 25) {
                str = android.os.Build.SERIAL;
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SERIAL.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
                str = null;
            }
            java.lang.String str2 = str;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SERIAL.getCode(), str);
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SERIAL.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            }
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SERIAL.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        }
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_BOARD.getCode(), android.os.Build.BOARD, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_BOOTLOADER.getCode(), android.os.Build.BOOTLOADER, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_BOOTLOADER.getCode(), android.os.Build.BRAND, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_BRAND.getCode(), android.os.Build.BRAND, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_DEVICE.getCode(), android.os.Build.DEVICE, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_DISPLAY.getCode(), android.os.Build.DISPLAY, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_FINGERPRINT.getCode(), android.os.Build.FINGERPRINT, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_HARDWARE.getCode(), android.os.Build.HARDWARE, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_ID.getCode(), android.os.Build.ID, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_MANUFACTURER.getCode(), android.os.Build.MANUFACTURER, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_PRODUCT.getCode(), android.os.Build.PRODUCT, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_RADIO.getCode(), android.os.Build.getRadioVersion(), deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfoArray(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SUPPORTED_32_BIT_ABIS.getCode(), android.os.Build.SUPPORTED_32_BIT_ABIS, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfoArray(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SUPPORTED_64_BIT_ABIS.getCode(), android.os.Build.SUPPORTED_64_BIT_ABIS, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_TAGS.getCode(), android.os.Build.TAGS, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_TIME.getCode(), java.lang.String.valueOf(android.os.Build.TIME), deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_TYPE.getCode(), android.os.Build.TYPE, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_USER.getCode(), android.os.Build.USER, deviceData, deviceParamNotAvailable);
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 31) {
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SKU.getCode(), android.os.Build.SKU, deviceData, deviceParamNotAvailable);
        }
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 31) {
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SOC_MANUFACTURER.getCode(), android.os.Build.SOC_MANUFACTURER, deviceData, deviceParamNotAvailable);
        }
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 31) {
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_SOC_MODEL.getCode(), android.os.Build.SOC_MODEL, deviceData, deviceParamNotAvailable);
        }
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_VERSION_CODENAME.getCode(), android.os.Build.VERSION.CODENAME, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_VERSION_INCREMENTAL.getCode(), android.os.Build.VERSION.INCREMENTAL, deviceData, deviceParamNotAvailable);
        com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_VERSION_SDK_INT.getCode(), java.lang.String.valueOf(com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt()), deviceData, deviceParamNotAvailable);
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 23) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_VERSION_PREVIEW_SDK_INT.getCode(), java.lang.String.valueOf(android.os.Build.VERSION.PREVIEW_SDK_INT));
            com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.updateDeviceInfo(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_VERSION_SECURITY_PATCH.getCode(), android.os.Build.VERSION.SECURITY_PATCH, deviceData, deviceParamNotAvailable);
        } else {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_VERSION_SECURITY_PATCH.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BUILD_VERSION_PREVIEW_SDK_INT.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
        }
    }
}
