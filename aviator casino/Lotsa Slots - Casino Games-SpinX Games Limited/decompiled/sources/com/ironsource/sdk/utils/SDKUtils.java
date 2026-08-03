package com.ironsource.sdk.utils;

/* loaded from: classes5.dex */
public class SDKUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6725a = "SDKUtils";
    private static java.lang.String b = null;
    private static java.lang.String c = null;
    private static java.lang.String d = null;
    private static java.lang.String e = null;
    private static int f = 0;
    private static java.lang.String g = null;
    private static java.util.Map<java.lang.String, java.lang.String> h = null;
    private static java.lang.String i = "";
    private static final java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger(1);

    class a implements android.content.DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = j;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static int convertDpToPx(int i2) {
        return (int) android.util.TypedValue.applyDimension(0, i2, android.content.res.Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i2) {
        return (int) android.util.TypedValue.applyDimension(1, i2, android.content.res.Resources.getSystem().getDisplayMetrics());
    }

    public static boolean copyFileFromBundleToStorage(android.content.Context context, com.ironsource.C3381y8 c3381y8) {
        byte[] a2 = com.ironsource.C3019e4.a(context, c3381y8.getName());
        if (a2 != null && a2.length != 0) {
            try {
                if (com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(a2, c3381y8.getPath()) != 0) {
                    return true;
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception: " + e2.getMessage());
            }
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("failed to read bytes for " + c3381y8.getName());
        }
        return false;
    }

    public static int dpToPx(long j2) {
        return (int) ((j2 * android.content.res.Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] encrypt(java.lang.String str) {
        java.security.MessageDigest messageDigest;
        try {
            messageDigest = java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (java.io.UnsupportedEncodingException e2) {
                e = e2;
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                if (messageDigest != null) {
                }
            } catch (java.security.NoSuchAlgorithmException e3) {
                e = e3;
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                if (messageDigest != null) {
                }
            }
        } catch (java.io.UnsupportedEncodingException e4) {
            e = e4;
            messageDigest = null;
        } catch (java.security.NoSuchAlgorithmException e5) {
            e = e5;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static java.lang.String fetchDemandSourceId(com.ironsource.C3101ie c3101ie) {
        return fetchDemandSourceId(c3101ie.a());
    }

    public static java.lang.String flatMapToJsonAsString(java.util.Map<java.lang.String, java.lang.String> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (org.json.JSONException e2) {
                    com.ironsource.C3180n4.d().a(e2);
                    com.ironsource.sdk.utils.Logger.i(f6725a, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return android.view.View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        return z ? 5894 : 1798;
    }

    public static java.lang.String getAdvertiserId() {
        return b;
    }

    public static java.lang.String getControllerConfig() {
        return g;
    }

    public static org.json.JSONObject getControllerConfigAsJSONObject() {
        try {
            return new org.json.JSONObject(getControllerConfig());
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return new org.json.JSONObject();
        }
    }

    public static java.lang.String getControllerUrl() {
        return !android.text.TextUtils.isEmpty(e) ? e : !android.text.TextUtils.isEmpty(d) ? d : "";
    }

    public static int getDebugMode() {
        return f;
    }

    public static java.lang.String getFileName(java.lang.String str) {
        try {
            return java.net.URLEncoder.encode(str.split(java.io.File.separator)[r1.length - 1].split("\\?")[0], "UTF-8");
        } catch (java.io.UnsupportedEncodingException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> getInitSDKParams() {
        return h;
    }

    public static java.lang.String getLimitAdTracking() {
        return c;
    }

    public static java.lang.String getMD5(java.lang.String str) {
        try {
            java.lang.String bigInteger = new java.math.BigInteger(1, java.security.MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (java.security.NoSuchAlgorithmException e2) {
            com.ironsource.C3180n4.d().a(e2);
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(com.ironsource.X3.d.b);
    }

    public static org.json.JSONObject getNetworkConfiguration() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(com.ironsource.X3.a.b);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public static org.json.JSONObject getNetworkFeatureConfiguration() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject optJSONObject = getNetworkConfiguration().optJSONObject(com.ironsource.X3.a.v);
            return optJSONObject != null ? optJSONObject : jSONObject;
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public static org.json.JSONObject getOrientation(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(a2.A(context)));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject;
    }

    public static com.ironsource.C3202o8.e getProductType(java.lang.String str) {
        com.ironsource.C3202o8.e eVar = com.ironsource.C3202o8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        com.ironsource.C3202o8.e eVar2 = com.ironsource.C3202o8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static java.lang.String getSDKVersion() {
        return "9.4.0";
    }

    public static java.lang.String getTesterParameters() {
        return i;
    }

    public static java.lang.String getValueFromJsonObject(java.lang.String str, java.lang.String str2) {
        try {
            return new org.json.JSONObject(str).getString(str2);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            return null;
        }
    }

    public static boolean isApplicationVisible(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
            if (!"mounted".equals(externalStorageState)) {
                if (!"mounted_ro".equals(externalStorageState)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            return false;
        }
    }

    public static boolean isIronSourceActivity(android.app.Activity activity) {
        return (activity instanceof com.ironsource.sdk.controller.ControllerActivity) || (activity instanceof com.ironsource.sdk.controller.OpenUrlActivity) || (activity instanceof com.unity3d.ironsourceads.internal.services.InlineStoreActivity);
    }

    public static void loadGoogleAdvertiserInfo(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        java.lang.String J = a2.J(context);
        java.lang.String c2 = a2.c(context);
        if (!android.text.TextUtils.isEmpty(J)) {
            b = J;
        }
        if (android.text.TextUtils.isEmpty(c2)) {
            return;
        }
        c = c2;
    }

    public static java.util.Map<java.lang.String, java.lang.String> mergeHashMaps(java.util.Map<java.lang.String, java.lang.String>[] mapArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (java.util.Map<java.lang.String, java.lang.String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static org.json.JSONObject mergeJSONObjects(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws java.lang.Exception {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new org.json.JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                java.lang.String string = jSONArray.getString(i2);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j2) {
        return (int) ((j2 / android.content.res.Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static java.lang.String requireNonEmptyOrNull(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            return str;
        }
        throw new java.lang.NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static void setControllerConfig(java.lang.String str) {
        g = str;
        com.ironsource.Jb.Q().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(java.lang.String str) {
        d = str;
    }

    public static void setCustomControllerUrl(java.lang.String str) {
        e = str;
    }

    public static void setDebugMode(int i2) {
        f = i2;
    }

    public static void setInitSDKParams(java.util.Map<java.lang.String, java.lang.String> map) {
        h = map;
    }

    public static void setTesterParameters(java.lang.String str) {
        i = str;
    }

    public static void showNoInternetDialog(android.content.Context context) {
        new android.app.AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new com.ironsource.sdk.utils.SDKUtils.a()).show();
    }

    public static java.lang.String translateDeviceOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? "none" : "landscape" : "portrait";
    }

    public static java.lang.String translateOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? "none" : "landscape" : "portrait";
    }

    public static java.lang.String translateRequestedOrientation(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 11) {
                    if (i2 != 12) {
                        switch (i2) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static void updateControllerConfig(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(g);
            jSONObject2.put(str, jSONObject);
            g = jSONObject2.toString();
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.sdk.utils.Logger.i(f6725a, "Unable to update controllerConfigs: " + e2.toString());
        }
    }

    public static java.lang.String fetchDemandSourceId(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("demandSourceId");
        return !android.text.TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static java.lang.String decodeString(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.sdk.utils.Logger.d(f6725a, "Failed decoding string " + e2.getMessage());
            return "";
        }
    }

    public static java.lang.String encodeString(java.lang.String str) {
        try {
            return java.net.URLEncoder.encode(str, "UTF-8").replace(org.slf4j.Marker.ANY_NON_NULL_MARKER, "%20");
        } catch (java.io.UnsupportedEncodingException e2) {
            com.ironsource.C3180n4.d().a(e2);
            return "";
        }
    }
}
