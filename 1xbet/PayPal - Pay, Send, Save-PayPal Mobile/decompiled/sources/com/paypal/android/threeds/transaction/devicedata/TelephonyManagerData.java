package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/TelephonyManagerData;", "Lcom/paypal/android/threeds/interfaces/DeviceDataFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceData", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V", "getDeviceId", "(Landroid/content/Context;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TelephonyManagerData implements com.paypal.android.threeds.interfaces.DeviceDataFactory {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.TelephonyManagerData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.TelephonyManagerData();

    private TelephonyManagerData() {
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0390  */
    @Override // com.paypal.android.threeds.interfaces.DeviceDataFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateDeviceData(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String networkCountryIso;
        java.lang.String networkOperator;
        java.lang.String networkOperatorName;
        java.lang.String simCountryIso;
        java.lang.String simOperator;
        java.lang.String simOperatorName;
        java.lang.CharSequence simSpecificCarrierIdName;
        java.lang.String deviceSoftwareVersion;
        java.lang.String groupIdLevel1;
        java.lang.String voiceMailAlphaTag;
        java.lang.String voiceMailNumber;
        java.lang.String mmsUserAgent;
        java.lang.String mmsUAProfUrl;
        java.lang.String line1Number;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_STATE")) {
            java.lang.Object systemService = context.getSystemService("phone");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
            java.lang.String deviceId = getDeviceId(context);
            java.lang.String str4 = deviceId;
            if (str4 != null && !kotlin.text.StringsKt.isBlank(str4) && !kotlin.text.StringsKt.equals(deviceId, "unknown", true)) {
                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_DEVICE_ID.getCode(), deviceId);
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_DEVICE_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            }
            java.lang.Object systemService2 = context.getSystemService("phone");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
            android.telephony.TelephonyManager telephonyManager2 = (android.telephony.TelephonyManager) systemService2;
            java.lang.String str5 = null;
            if (com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_STATE") && com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 29) {
                java.lang.String subscriberId = telephonyManager2.getSubscriberId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subscriberId, "");
                if (!kotlin.text.StringsKt.isBlank(subscriberId)) {
                    str = telephonyManager2.getSubscriberId();
                    str2 = str;
                    if (str2 == null && !kotlin.text.StringsKt.isBlank(str2)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SUBSCRIBER_ID.getCode(), str);
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SUBSCRIBER_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    if (!com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_NUMBERS")) {
                        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 33) {
                            java.lang.Object systemService3 = context.getSystemService("telephony_subscription_service");
                            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService3, "");
                            line1Number = ((android.telephony.SubscriptionManager) systemService3).getPhoneNumber(Integer.MAX_VALUE);
                        } else {
                            line1Number = telephonyManager.getLine1Number();
                        }
                        java.lang.String str6 = line1Number;
                        if (str6 != null && !kotlin.text.StringsKt.isBlank(str6)) {
                            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_LINE1_NUMBER.getCode(), line1Number);
                        } else {
                            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_LINE1_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                        }
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_LINE1_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
                    }
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 30) {
                        str5 = java.lang.String.valueOf(telephonyManager.getActiveModemCount());
                    } else if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 23) {
                        str5 = java.lang.String.valueOf(telephonyManager.getPhoneCount());
                    }
                    str3 = str5;
                    if (str3 == null && !kotlin.text.StringsKt.isBlank(str3)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_PHONE_COUNT.getCode(), str5);
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_PHONE_COUNT.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_HAS_ICC_CARD.getCode(), java.lang.String.valueOf(telephonyManager.hasIccCard()));
                    networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (networkCountryIso == null && !kotlin.text.StringsKt.isBlank(networkCountryIso)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_COUNTRY_ISO.getCode(), telephonyManager.getNetworkCountryIso());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_COUNTRY_ISO.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    networkOperator = telephonyManager.getNetworkOperator();
                    if (networkOperator == null && !kotlin.text.StringsKt.isBlank(networkOperator)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR.getCode(), telephonyManager.getNetworkOperator());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName == null && !kotlin.text.StringsKt.isBlank(networkOperatorName)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR_NAME.getCode(), telephonyManager.getNetworkOperatorName());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() <= 24) {
                        if (androidx.core.app.ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_TYPE.getCode(), java.lang.String.valueOf(telephonyManager.getDataNetworkType()));
                        } else {
                            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_TYPE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
                        }
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_TYPE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    simCountryIso = telephonyManager.getSimCountryIso();
                    if (simCountryIso == null && !kotlin.text.StringsKt.isBlank(simCountryIso)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_COUNTRY_ISO.getCode(), telephonyManager.getSimCountryIso());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_COUNTRY_ISO.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    simOperator = telephonyManager.getSimOperator();
                    if (simOperator == null && !kotlin.text.StringsKt.isBlank(simOperator)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR.getCode(), telephonyManager.getSimOperator());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    simOperatorName = telephonyManager.getSimOperatorName();
                    if (simOperatorName == null && !kotlin.text.StringsKt.isBlank(simOperatorName)) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR_NAME.getCode(), telephonyManager.getSimOperatorName());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_STATE.getCode(), java.lang.String.valueOf(telephonyManager.getSimState()));
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 28) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_CARRIER_ID.getCode(), java.lang.String.valueOf(telephonyManager.getSimCarrierId()));
                        if (telephonyManager.getSimCarrierIdName() != null) {
                            java.lang.CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(simCarrierIdName);
                            if (!kotlin.text.StringsKt.isBlank(simCarrierIdName)) {
                                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_CARRIER_NAME.getCode(), java.lang.String.valueOf(telephonyManager.getSimCarrierIdName()));
                            }
                        }
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_CARRIER_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 29) {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_MANUFACTURER_CODE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MULTI_SIM_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
                    } else {
                        try {
                        } catch (java.lang.Exception e) {
                            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Exception while fetching manufacturerCode from TelephonyManager: ".concat(java.lang.String.valueOf(e.getMessage())), null, null, 6, null);
                            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_MANUFACTURER_CODE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                        }
                        if (telephonyManager.getManufacturerCode() != null) {
                            java.lang.String manufacturerCode = telephonyManager.getManufacturerCode();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(manufacturerCode);
                            if (!kotlin.text.StringsKt.isBlank(manufacturerCode)) {
                                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_MANUFACTURER_CODE.getCode(), java.lang.String.valueOf(telephonyManager.getManufacturerCode()));
                                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID.getCode(), java.lang.String.valueOf(telephonyManager.getSimSpecificCarrierId()));
                                simSpecificCarrierIdName = telephonyManager.getSimSpecificCarrierIdName();
                                if (simSpecificCarrierIdName == null && !kotlin.text.StringsKt.isBlank(simSpecificCarrierIdName)) {
                                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID_NAME.getCode(), java.lang.String.valueOf(telephonyManager.getSimSpecificCarrierIdName()));
                                } else {
                                    deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                                }
                                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MULTI_SIM_SUPPORTED.getCode(), java.lang.String.valueOf(telephonyManager.isMultiSimSupported()));
                            }
                        }
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_MANUFACTURER_CODE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID.getCode(), java.lang.String.valueOf(telephonyManager.getSimSpecificCarrierId()));
                        simSpecificCarrierIdName = telephonyManager.getSimSpecificCarrierIdName();
                        if (simSpecificCarrierIdName == null) {
                        }
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MULTI_SIM_SUPPORTED.getCode(), java.lang.String.valueOf(telephonyManager.isMultiSimSupported()));
                    }
                    if (!com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_STATE")) {
                        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 29) {
                            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SERIAL_NUMBER.getCode(), telephonyManager.getSimSerialNumber());
                        } else {
                            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SERIAL_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                        }
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SERIAL_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
                    }
                    deviceSoftwareVersion = telephonyManager.getDeviceSoftwareVersion();
                    if (deviceSoftwareVersion == null && deviceSoftwareVersion.length() != 0) {
                        java.lang.String code = com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IMEI_SV.getCode();
                        java.lang.String deviceSoftwareVersion2 = telephonyManager.getDeviceSoftwareVersion();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceSoftwareVersion2);
                        deviceData.put(code, deviceSoftwareVersion2);
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IMEI_SV.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    groupIdLevel1 = telephonyManager.getGroupIdLevel1();
                    if (groupIdLevel1 == null && groupIdLevel1.length() != 0) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_GROUP_IDENTIFIER_L1.getCode(), telephonyManager.getGroupIdLevel1());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_GROUP_IDENTIFIER_L1.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    voiceMailAlphaTag = telephonyManager.getVoiceMailAlphaTag();
                    if (voiceMailAlphaTag == null && voiceMailAlphaTag.length() != 0) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_ALPHA_TAG.getCode(), telephonyManager.getVoiceMailAlphaTag());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_ALPHA_TAG.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    voiceMailNumber = telephonyManager.getVoiceMailNumber();
                    if (voiceMailNumber == null && voiceMailNumber.length() != 0) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_NUMBER.getCode(), telephonyManager.getVoiceMailNumber());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    mmsUserAgent = telephonyManager.getMmsUserAgent();
                    if (mmsUserAgent == null && mmsUserAgent.length() != 0) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_USER_AGENT.getCode(), telephonyManager.getMmsUserAgent());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_USER_AGENT.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_PHONE_TYPE.getCode(), java.lang.String.valueOf(telephonyManager.getPhoneType()));
                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_STATE.getCode(), java.lang.String.valueOf(telephonyManager.getSimState()));
                    mmsUAProfUrl = telephonyManager.getMmsUAProfUrl();
                    if (mmsUAProfUrl == null && mmsUAProfUrl.length() != 0) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_UA_PROFILE_URL.getCode(), telephonyManager.getMmsUAProfUrl());
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_UA_PROFILE_URL.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_NETWORK_ROAMING.getCode(), java.lang.String.valueOf(telephonyManager.isNetworkRoaming()));
                    deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_SMS_CAPABLE.getCode(), java.lang.String.valueOf(telephonyManager.isSmsCapable()));
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 23 && com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() <= 27) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_TTY_MODE_SUPPORTED.getCode(), java.lang.String.valueOf(telephonyManager.isTtyModeSupported()));
                    } else if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 28) {
                        java.lang.Object systemService4 = context.getSystemService("telecom");
                        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService4, "");
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_TTY_MODE_SUPPORTED.getCode(), java.lang.String.valueOf(((android.telecom.TelecomManager) systemService4).isTtySupported()));
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_TTY_MODE_SUPPORTED.getCode(), "false");
                    }
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 23) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_WORLD_PHONE.getCode(), java.lang.String.valueOf(telephonyManager.isWorldPhone()));
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED.getCode(), java.lang.String.valueOf(telephonyManager.isHearingAidCompatibilitySupported()));
                    }
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 22) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_VOICE_CAPABLE.getCode(), java.lang.String.valueOf(telephonyManager.isVoiceCapable()));
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_VOICE_CAPABLE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                    }
                    if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 30) {
                        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SUBSCRIPTION_ID.getCode(), java.lang.String.valueOf(telephonyManager.getSubscriptionId()));
                        return;
                    } else {
                        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SUBSCRIPTION_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                        return;
                    }
                }
            }
            str = null;
            str2 = str;
            if (str2 == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SUBSCRIBER_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            if (!com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_NUMBERS")) {
            }
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 30) {
            }
            str3 = str5;
            if (str3 == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_PHONE_COUNT.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_HAS_ICC_CARD.getCode(), java.lang.String.valueOf(telephonyManager.hasIccCard()));
            networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_COUNTRY_ISO.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() <= 24) {
            }
            simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_COUNTRY_ISO.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            simOperator = telephonyManager.getSimOperator();
            if (simOperator == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            simOperatorName = telephonyManager.getSimOperatorName();
            if (simOperatorName == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_STATE.getCode(), java.lang.String.valueOf(telephonyManager.getSimState()));
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 28) {
            }
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 29) {
            }
            if (!com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.READ_PHONE_STATE")) {
            }
            deviceSoftwareVersion = telephonyManager.getDeviceSoftwareVersion();
            if (deviceSoftwareVersion == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IMEI_SV.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            groupIdLevel1 = telephonyManager.getGroupIdLevel1();
            if (groupIdLevel1 == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_GROUP_IDENTIFIER_L1.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            voiceMailAlphaTag = telephonyManager.getVoiceMailAlphaTag();
            if (voiceMailAlphaTag == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_ALPHA_TAG.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            voiceMailNumber = telephonyManager.getVoiceMailNumber();
            if (voiceMailNumber == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            mmsUserAgent = telephonyManager.getMmsUserAgent();
            if (mmsUserAgent == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_USER_AGENT.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_PHONE_TYPE.getCode(), java.lang.String.valueOf(telephonyManager.getPhoneType()));
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_STATE.getCode(), java.lang.String.valueOf(telephonyManager.getSimState()));
            mmsUAProfUrl = telephonyManager.getMmsUAProfUrl();
            if (mmsUAProfUrl == null) {
            }
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_UA_PROFILE_URL.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_NETWORK_ROAMING.getCode(), java.lang.String.valueOf(telephonyManager.isNetworkRoaming()));
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_SMS_CAPABLE.getCode(), java.lang.String.valueOf(telephonyManager.isSmsCapable()));
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 23) {
            }
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 28) {
            }
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 23) {
            }
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 22) {
            }
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 30) {
            }
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_DEVICE_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SUBSCRIBER_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IMEI_SV.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_GROUP_IDENTIFIER_L1.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_LINE1_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_UA_PROFILE_URL.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MMS_USER_AGENT.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_COUNTRY_ISO.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_OPERATOR_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_NETWORK_TYPE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_PHONE_COUNT.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_PHONE_TYPE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_COUNTRY_ISO.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_OPERATOR_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SERIAL_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_STATE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_ALPHA_TAG.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_VOICE_MAIL_NUMBER.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_HAS_ICC_CARD.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_NETWORK_ROAMING.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_SMS_CAPABLE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_TTY_MODE_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_VOICE_CAPABLE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_IS_WORLD_PHONE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_CARRIER_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_CARRIER_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_MANUFACTURER_CODE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SIM_SPECIFIC_CARRIER_ID_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_MULTI_SIM_SUPPORTED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.TELE_SUBSCRIPTION_ID.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        }
    }

    public final java.lang.String getDeviceId(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("phone");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 26 && com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 29) {
            return telephonyManager.getImei();
        }
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() < 26) {
            return telephonyManager.getDeviceId();
        }
        return null;
    }
}
