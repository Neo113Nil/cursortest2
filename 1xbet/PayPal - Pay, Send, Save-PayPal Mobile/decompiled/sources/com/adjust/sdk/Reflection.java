package com.adjust.sdk;

/* loaded from: classes7.dex */
public class Reflection {
    public static java.lang.Object createDefaultInstance(java.lang.String str) {
        java.lang.Class forName = forName(str);
        if (forName == null) {
            return null;
        }
        return createDefaultInstance(forName);
    }

    public static java.lang.Object createInstance(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        try {
            return java.lang.Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Class forName(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Object getAdvertisingInfoObject(android.content.Context context) {
        return invokeStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new java.lang.Class[]{android.content.Context.class}, context);
    }

    public static java.lang.String getAppSetId(android.content.Context context) {
        try {
            return (java.lang.String) invokeInstanceMethod(invokeStaticMethod("com.google.android.gms.tasks.Tasks", "await", new java.lang.Class[]{forName("com.google.android.gms.tasks.Task"), java.lang.Long.TYPE, java.util.concurrent.TimeUnit.class}, invokeInstanceMethod(invokeStaticMethod("com.google.android.gms.appset.AppSet", "getClient", new java.lang.Class[]{android.content.Context.class}, context), "getAppSetIdInfo", null, new java.lang.Object[0]), 1L, java.util.concurrent.TimeUnit.SECONDS), "getId", null, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static com.adjust.sdk.ReferrerDetails getHuaweiAdsReferrer(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            return (com.adjust.sdk.ReferrerDetails) invokeStaticMethod("com.adjust.sdk.huawei.Util", "getHuaweiAdsInstallReferrerDetails", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.adjust.sdk.ReferrerDetails getHuaweiAppGalleryReferrer(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            return (com.adjust.sdk.ReferrerDetails) invokeStaticMethod("com.adjust.sdk.huawei.Util", "getHuaweiAppGalleryInstallReferrerDetails", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> getImeiParameters(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            java.lang.Object invokeStaticMethod = invokeStaticMethod("com.adjust.sdk.imei.Util", "getImeiParameters", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
            if (invokeStaticMethod == null || !java.util.Map.class.isInstance(invokeStaticMethod)) {
                return null;
            }
            return (java.util.Map) invokeStaticMethod;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.adjust.sdk.LicenseData getLicenseRequiredData(android.content.Context context, com.adjust.sdk.ILogger iLogger, long j) {
        try {
            return (com.adjust.sdk.LicenseData) invokeStaticMethod("com.adjust.sdk.google.lvl.Util", "getLicenseRequiredData", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class, java.lang.Long.TYPE}, context, iLogger, java.lang.Long.valueOf(j));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.adjust.sdk.ReferrerDetails getMetaReferrer(android.content.Context context, java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        try {
            return (com.adjust.sdk.ReferrerDetails) invokeStaticMethod("com.adjust.sdk.meta.Util", "getMetaInstallReferrerDetails", new java.lang.Class[]{android.content.Context.class, java.lang.String.class, com.adjust.sdk.ILogger.class}, context, str, iLogger);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> getOaidParameters(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            java.lang.Object invokeStaticMethod = invokeStaticMethod("com.adjust.sdk.oaid.Util", "getOaidParameters", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
            if (invokeStaticMethod == null || !java.util.Map.class.isInstance(invokeStaticMethod)) {
                return null;
            }
            return (java.util.Map) invokeStaticMethod;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getPlayAdId(android.content.Context context, java.lang.Object obj) {
        try {
            return (java.lang.String) invokeInstanceMethod(obj, "getId", null, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String getSamsungCloudDevGoogleAdId(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            return (java.lang.String) invokeStaticMethod("com.adjust.sdk.samsung.clouddev.Util", "getGoogleAdIdInCloudEnvironment", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.adjust.sdk.ReferrerDetails getSamsungReferrer(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            return (com.adjust.sdk.ReferrerDetails) invokeStaticMethod("com.adjust.sdk.samsung.Util", "getSamsungInstallReferrerDetails", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.adjust.sdk.ReferrerDetails getVivoReferrer(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            return (com.adjust.sdk.ReferrerDetails) invokeStaticMethod("com.adjust.sdk.vivo.Util", "getVivoInstallReferrerDetails", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.adjust.sdk.ReferrerDetails getXiaomiReferrer(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            return (com.adjust.sdk.ReferrerDetails) invokeStaticMethod("com.adjust.sdk.xiaomi.Util", "getXiaomiInstallReferrerDetails", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.Object invokeInstanceMethod(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        return invokeMethod(obj.getClass(), str, obj, clsArr, objArr);
    }

    public static java.lang.Object invokeMethod(java.lang.Class cls, java.lang.String str, java.lang.Object obj, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        java.lang.reflect.Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static java.lang.Object invokeStaticMethod(java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        return invokeMethod(java.lang.Class.forName(str), str2, null, clsArr, objArr);
    }

    public static boolean isAppRunningInSamsungCloudEnvironment(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            return ((java.lang.Boolean) invokeStaticMethod("com.adjust.sdk.samsung.clouddev.Util", "isAppRunningInCloudEnvironment", new java.lang.Class[]{android.content.Context.class, com.adjust.sdk.ILogger.class}, context, iLogger)).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static java.lang.Boolean isPlayTrackingEnabled(android.content.Context context, java.lang.Object obj) {
        try {
            if (((java.lang.Boolean) invokeInstanceMethod(obj, "isLimitAdTrackingEnabled", null, new java.lang.Object[0])) == null) {
                return null;
            }
            return java.lang.Boolean.valueOf(!r3.booleanValue());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Object readField(java.lang.String str, java.lang.String str2) {
        return readField(str, str2, null);
    }

    public static java.lang.Object readField(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.reflect.Field field;
        java.lang.Class forName = forName(str);
        if (forName == null || (field = forName.getField(str2)) == null) {
            return null;
        }
        return field.get(obj);
    }

    public static java.lang.Object createDefaultInstance(java.lang.Class cls) {
        try {
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
