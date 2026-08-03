package com.facebook.devicerequests.internal;

/* compiled from: DeviceRequestsHelper.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0003J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\u001e\u0010\u0018\u001a\u00020\u00042\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\r\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000f0\u000ej\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/facebook/devicerequests/internal/DeviceRequestsHelper;", "", "()V", "DEVICE_INFO_DEVICE", "", "DEVICE_INFO_MODEL", "DEVICE_INFO_PARAM", "DEVICE_TARGET_USER_ID", "SDK_FLAVOR", "SDK_HEADER", "SERVICE_TYPE", "TAG", "kotlin.jvm.PlatformType", "deviceRequestsListeners", "Ljava/util/HashMap;", "Landroid/net/nsd/NsdManager$RegistrationListener;", "Lkotlin/collections/HashMap;", "cleanUpAdvertisementService", "", "userCode", "cleanUpAdvertisementServiceImpl", "generateQRCode", "Landroid/graphics/Bitmap;", "url", "getDeviceInfo", "deviceInfo", "", "isAvailable", "", "startAdvertisementService", "startAdvertisementServiceImpl", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceRequestsHelper {
    public static final java.lang.String DEVICE_INFO_DEVICE = "device";
    public static final java.lang.String DEVICE_INFO_MODEL = "model";
    public static final java.lang.String DEVICE_INFO_PARAM = "device_info";
    public static final java.lang.String DEVICE_TARGET_USER_ID = "target_user_id";
    public static final java.lang.String SDK_FLAVOR = "android";
    public static final java.lang.String SDK_HEADER = "fbsdk";
    public static final java.lang.String SERVICE_TYPE = "_fb._tcp.";
    public static final com.facebook.devicerequests.internal.DeviceRequestsHelper INSTANCE = new com.facebook.devicerequests.internal.DeviceRequestsHelper();
    private static final java.lang.String TAG = com.facebook.devicerequests.internal.DeviceRequestsHelper.class.getCanonicalName();
    private static final java.util.HashMap<java.lang.String, android.net.nsd.NsdManager.RegistrationListener> deviceRequestsListeners = new java.util.HashMap<>();

    private DeviceRequestsHelper() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDeviceInfo(java.util.Map<java.lang.String, java.lang.String> deviceInfo) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.devicerequests.internal.DeviceRequestsHelper.class)) {
            return null;
        }
        if (deviceInfo == null) {
            try {
                deviceInfo = new java.util.HashMap();
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.devicerequests.internal.DeviceRequestsHelper.class);
                return null;
            }
        }
        java.lang.String DEVICE = android.os.Build.DEVICE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        deviceInfo.put("device", DEVICE);
        java.lang.String MODEL = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        deviceInfo.put("model", MODEL);
        java.lang.String jSONObject = new org.json.JSONObject(deviceInfo).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDeviceInfo() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.devicerequests.internal.DeviceRequestsHelper.class)) {
            return null;
        }
        try {
            return getDeviceInfo(null);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.devicerequests.internal.DeviceRequestsHelper.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean startAdvertisementService(java.lang.String userCode) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.devicerequests.internal.DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = INSTANCE;
            if (isAvailable()) {
                return deviceRequestsHelper.startAdvertisementServiceImpl(userCode);
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.devicerequests.internal.DeviceRequestsHelper.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAvailable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.devicerequests.internal.DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings appSettingsWithoutQuery = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(com.facebook.FacebookSdk.getApplicationId());
            if (appSettingsWithoutQuery != null) {
                return appSettingsWithoutQuery.getSmartLoginOptions().contains(com.facebook.internal.SmartLoginOption.Enabled);
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.devicerequests.internal.DeviceRequestsHelper.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.Bitmap generateQRCode(java.lang.String url) {
        int height;
        int width;
        int[] iArr;
        android.graphics.Bitmap createBitmap;
        android.graphics.Bitmap bitmap = null;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.devicerequests.internal.DeviceRequestsHelper.class)) {
            return null;
        }
        try {
            java.util.EnumMap enumMap = new java.util.EnumMap(com.google.zxing.EncodeHintType.class);
            enumMap.put((java.util.EnumMap) com.google.zxing.EncodeHintType.MARGIN, (com.google.zxing.EncodeHintType) 2);
            try {
                com.google.zxing.common.BitMatrix encode = new com.google.zxing.MultiFormatWriter().encode(url, com.google.zxing.BarcodeFormat.QR_CODE, 200, 200, enumMap);
                height = encode.getHeight();
                width = encode.getWidth();
                iArr = new int[height * width];
                if (height > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        int i3 = i * width;
                        if (width > 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                iArr[i3 + i4] = encode.get(i4, i) ? androidx.core.view.ViewCompat.MEASURED_STATE_MASK : -1;
                                if (i5 >= width) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        if (i2 >= height) {
                            break;
                        }
                        i = i2;
                    }
                }
                createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
            } catch (com.google.zxing.WriterException unused) {
            }
            try {
                createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                return createBitmap;
            } catch (com.google.zxing.WriterException unused2) {
                bitmap = createBitmap;
                return bitmap;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.devicerequests.internal.DeviceRequestsHelper.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void cleanUpAdvertisementService(java.lang.String userCode) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.devicerequests.internal.DeviceRequestsHelper.class)) {
            return;
        }
        try {
            INSTANCE.cleanUpAdvertisementServiceImpl(userCode);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.devicerequests.internal.DeviceRequestsHelper.class);
        }
    }

    private final boolean startAdvertisementServiceImpl(final java.lang.String userCode) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            java.util.HashMap<java.lang.String, android.net.nsd.NsdManager.RegistrationListener> hashMap = deviceRequestsListeners;
            if (hashMap.containsKey(userCode)) {
                return true;
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            final java.lang.String str = "fbsdk_" + kotlin.jvm.internal.Intrinsics.stringPlus("android-", kotlin.text.StringsKt.replace$default(com.facebook.FacebookSdk.getSdkVersion(), '.', '|', false, 4, (java.lang.Object) null)) + '_' + ((java.lang.Object) userCode);
            android.net.nsd.NsdServiceInfo nsdServiceInfo = new android.net.nsd.NsdServiceInfo();
            nsdServiceInfo.setServiceType(SERVICE_TYPE);
            nsdServiceInfo.setServiceName(str);
            nsdServiceInfo.setPort(80);
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            java.lang.Object systemService = com.facebook.FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            android.net.nsd.NsdManager.RegistrationListener registrationListener = new android.net.nsd.NsdManager.RegistrationListener() { // from class: com.facebook.devicerequests.internal.DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1
                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onServiceUnregistered(android.net.nsd.NsdServiceInfo serviceInfo) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onUnregistrationFailed(android.net.nsd.NsdServiceInfo serviceInfo, int errorCode) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onServiceRegistered(android.net.nsd.NsdServiceInfo NsdServiceInfo) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, NsdServiceInfo.getServiceName())) {
                        return;
                    }
                    com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
                    com.facebook.devicerequests.internal.DeviceRequestsHelper.cleanUpAdvertisementService(userCode);
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onRegistrationFailed(android.net.nsd.NsdServiceInfo serviceInfo, int errorCode) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
                    com.facebook.devicerequests.internal.DeviceRequestsHelper deviceRequestsHelper = com.facebook.devicerequests.internal.DeviceRequestsHelper.INSTANCE;
                    com.facebook.devicerequests.internal.DeviceRequestsHelper.cleanUpAdvertisementService(userCode);
                }
            };
            hashMap.put(userCode, registrationListener);
            ((android.net.nsd.NsdManager) systemService).registerService(nsdServiceInfo, 1, registrationListener);
            return true;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void cleanUpAdvertisementServiceImpl(java.lang.String userCode) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.net.nsd.NsdManager.RegistrationListener registrationListener = deviceRequestsListeners.get(userCode);
            if (registrationListener != null) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                java.lang.Object systemService = com.facebook.FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((android.net.nsd.NsdManager) systemService).unregisterService(registrationListener);
                } catch (java.lang.IllegalArgumentException e) {
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd(TAG, e);
                }
                deviceRequestsListeners.remove(userCode);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
