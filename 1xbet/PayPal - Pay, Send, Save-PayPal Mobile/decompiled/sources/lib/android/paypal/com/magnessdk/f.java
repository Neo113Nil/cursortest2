package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public final class f {
    private static java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.String> map, android.content.Context context) throws java.lang.Exception {
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        java.lang.String str2 = android.os.Build.MODEL;
        java.lang.String packageName = context.getPackageName();
        java.lang.String a2 = a(context);
        if (!getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.a.z)) {
            map.put("comp_version", lib.android.paypal.com.magnessdk.a.z);
        }
        if (!getHighSpeedVideoFpsRangesFor(str)) {
            map.put("os_version", str);
        }
        if (!getHighSpeedVideoFpsRangesFor("Android")) {
            map.put("os_type", "Android");
        }
        if (!getHighSpeedVideoFpsRangesFor(str2)) {
            map.put("device_model", str2);
        }
        if (!getHighSpeedVideoFpsRangesFor(packageName)) {
            map.put("app_id", packageName);
        }
        if (!getHighSpeedVideoFpsRangesFor(a2)) {
            map.put(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, a2);
        }
        return map;
    }

    static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        return str != null && !str.isEmpty() && str != null && str.matches("^[a-zA-Z0-9-]*$") && str.length() <= 36 && str.length() >= 30;
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(".");
        return (lastIndexOf == -1 || lastIndexOf >= str.length() + (-1)) ? str : str.substring(lastIndexOf + 1);
    }

    public static java.util.Map<java.lang.String, java.lang.String> c(android.content.Context context) throws java.lang.Exception {
        if (context == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        concurrentHashMap.put("Content-Type", "application/json");
        Camera2StreamConfigurationMap(concurrentHashMap, context);
        return concurrentHashMap;
    }

    public static java.util.Map<java.lang.String, java.lang.String> d(android.content.Context context) throws java.lang.Exception {
        if (context == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        concurrentHashMap.put("X-PAYPAL-RESPONSE-DATA-FORMAT", "NV");
        concurrentHashMap.put("X-PAYPAL-REQUEST-DATA-FORMAT", "NV");
        concurrentHashMap.put("X-PAYPAL-SERVICE-VERSION", "1.0.0");
        concurrentHashMap.put("Content-Type", "application/x-www-form-urlencoded");
        Camera2StreamConfigurationMap(concurrentHashMap, context);
        return concurrentHashMap;
    }

    static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(android.util.Base64.decode(str, 2), "UTF-8");
    }

    static java.util.List<java.lang.String> getHighSpeedVideoSizes(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(java.lang.String.valueOf(jSONArray.get(i)));
            }
        }
        return arrayList;
    }

    public static java.util.Map<java.lang.String, java.lang.String> b(android.content.Context context) throws java.lang.Exception {
        if (context == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        Camera2StreamConfigurationMap(hashMap, context);
        return hashMap;
    }

    public static void a(java.lang.Class<?> cls, java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e) {
                lib.android.paypal.com.magnessdk.log.a.a(cls.getClass(), 3, e);
            }
        }
    }

    static boolean getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof java.lang.String ? ((java.lang.String) obj).isEmpty() : obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() == 0 : !(obj instanceof java.lang.Integer) || ((java.lang.Integer) obj).intValue() == 0;
    }

    static boolean Camera2StreamConfigurationMap(java.util.List<java.lang.String> list, java.lang.String str) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    static java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add((java.lang.Integer) jSONArray.get(i));
            }
        }
        return arrayList;
    }

    static org.json.JSONArray getHighSpeedVideoSizes(java.lang.Object obj) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    public static java.lang.String a(java.lang.Boolean[] boolArr) {
        java.lang.String str;
        if (boolArr == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.Boolean bool : boolArr) {
            if (bool.booleanValue()) {
                str = "1";
            } else if (!bool.booleanValue()) {
                str = "0";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static java.lang.String a(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    public static java.lang.String a(lib.android.paypal.com.magnessdk.Environment environment) {
        int i = lib.android.paypal.com.magnessdk.f.a.Camera2StreamConfigurationMap[environment.ordinal()];
        return (i != 1 ? i != 2 ? lib.android.paypal.com.magnessdk.c.h.e.STAGE_AUDIT_JSON_URL : lib.android.paypal.com.magnessdk.c.h.e.SANDBOX_AUDIT_JSON_URL : lib.android.paypal.com.magnessdk.c.h.e.AUDIT_JSON_URL).toString();
    }

    public static org.json.JSONObject a(android.hardware.Sensor sensor) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(lib.android.paypal.com.magnessdk.c.d.e.NAME.toString(), sensor.getName());
        jSONObject.put(lib.android.paypal.com.magnessdk.c.d.e.VENDOR.toString(), sensor.getVendor());
        jSONObject.put(lib.android.paypal.com.magnessdk.c.d.e.POWER.toString(), java.lang.String.format("%.8f", java.lang.Float.valueOf(sensor.getPower())));
        jSONObject.put(lib.android.paypal.com.magnessdk.c.d.e.VERSION.toString(), java.lang.String.valueOf(sensor.getVersion()));
        jSONObject.put(lib.android.paypal.com.magnessdk.c.d.e.RESOLUTION.toString(), java.lang.String.format("%.8f", java.lang.Float.valueOf(sensor.getResolution())));
        jSONObject.put(lib.android.paypal.com.magnessdk.c.d.e.MAX_RANGE.toString(), java.lang.String.format("%.8f", java.lang.Float.valueOf(sensor.getMaximumRange())));
        jSONObject.put(lib.android.paypal.com.magnessdk.c.d.e.FIFO_MAX_EVENT_COUNT.toString(), java.lang.String.valueOf(sensor.getFifoMaxEventCount()));
        return jSONObject;
    }

    static java.lang.String getHighSpeedVideoSizes(boolean z) {
        return z ? java.util.UUID.randomUUID().toString() : java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }

    static org.json.JSONObject getHighSpeedVideoSizes(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!jSONObject.has(next)) {
                try {
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (org.json.JSONException e) {
                    lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.f.class, 3, e);
                }
            }
        }
        return jSONObject;
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.Environment.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.Environment.LIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.Environment.SANDBOX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        return str.replaceAll(".debug", "").replaceAll(".release", "");
    }

    private f() {
    }
}
