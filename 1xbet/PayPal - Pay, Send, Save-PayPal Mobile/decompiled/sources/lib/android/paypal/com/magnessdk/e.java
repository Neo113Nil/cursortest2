package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public class e extends lib.android.paypal.com.magnessdk.b {
    private static boolean Camera2StreamConfigurationMap = false;
    private static java.util.BitSet getHighSpeedVideoFpsRanges = null;
    private static org.json.JSONArray getHighSpeedVideoSizes = null;
    public static final java.lang.String m = "REMOTE_CONFIG";
    public final java.lang.String e = "conf_refresh_time_interval";
    private android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private lib.android.paypal.com.magnessdk.MagnesSettings getHighSpeedVideoFpsRangesFor;
    private org.json.JSONObject getInputFormats;
    private android.os.Handler getInputSizeshNQ4ISI;
    private android.os.Handler getOutputFormats;
    private boolean getOutputMinFrameDuration;

    @Override // lib.android.paypal.com.magnessdk.b
    protected org.json.JSONObject b() {
        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "entering getDefaultRemoteConfig");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.c.j.CONF_VERSION.toString(), "6.0");
            jSONObject.put(lib.android.paypal.com.magnessdk.c.j.CONF_REFRESH_TIME_KEY.toString(), kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.j.UA_REFRESH_TIME_KEY.toString(), 259200);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.j.CONF_ENDPOINT_URL.toString(), lib.android.paypal.com.magnessdk.c.h.e.DEVICE_INFO_URL.toString());
            jSONObject.put(lib.android.paypal.com.magnessdk.c.j.NOT_COLLECTABLE.toString(), new org.json.JSONArray().put(101));
            return jSONObject;
        } catch (org.json.JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            return jSONObject;
        }
    }

    public static void b(org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(lib.android.paypal.com.magnessdk.c.j.NOT_COLLECTABLE.toString());
        if (optJSONArray != null) {
            getHighSpeedVideoSizes = optJSONArray;
        }
        java.util.BitSet bitSet = new java.util.BitSet(192);
        getHighSpeedVideoFpsRanges = bitSet;
        bitSet.set(0, 192, true);
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            try {
                getHighSpeedVideoFpsRanges.set(optJSONArray.getInt(i), false);
            } catch (org.json.JSONException e) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.e.class, 3, e);
            }
        }
    }

    public boolean a(int i) {
        return getHighSpeedVideoFpsRanges.get(i);
    }

    @Override // lib.android.paypal.com.magnessdk.b
    protected void a(org.json.JSONObject jSONObject) {
        b(jSONObject);
        this.getInputFormats = jSONObject;
    }

    public void a(boolean z) {
        synchronized (this) {
            Camera2StreamConfigurationMap = z;
        }
    }

    public e(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, android.os.Handler handler) {
        this.getOutputMinFrameDuration = false;
        this.getHighSpeedVideoFpsRangesFor = magnesSettings;
        android.content.Context context = magnesSettings.getContext();
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        if (lib.android.paypal.com.magnessdk.b.d == null) {
            lib.android.paypal.com.magnessdk.b.d = context.getFilesDir();
        }
        this.getInputSizeshNQ4ISI = handler;
        this.getOutputMinFrameDuration = magnesSettings.isDisableRemoteConfig();
        try {
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null) {
                this.getOutputFormats = new lib.android.paypal.com.magnessdk.e.b(myLooper);
            }
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
        a(c());
        try {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, this.getInputFormats);
        } catch (org.json.JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
        }
    }

    @Override // lib.android.paypal.com.magnessdk.b
    protected org.json.JSONObject c() {
        try {
            org.json.JSONObject a2 = lib.android.paypal.com.magnessdk.b.a(m);
            if (a2 != null) {
                java.lang.String optString = a2.optString(lib.android.paypal.com.magnessdk.c.e.CONF_VERSION.toString(), "");
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "entering shouldUseCachedConfiguration");
                java.lang.String[] split = optString.split("\\.");
                java.lang.String[] split2 = "6.0".split("\\.");
                java.lang.Class<?> cls = getClass();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Comparing Cached version is ");
                sb.append(optString);
                sb.append(" default version is ");
                sb.append("6.0");
                lib.android.paypal.com.magnessdk.log.a.a(cls, 0, sb.toString());
                int i = 0;
                while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
                    i++;
                }
                if (java.lang.Integer.signum((i >= split.length || i >= split2.length) ? split.length - split2.length : java.lang.Integer.valueOf(split[i]).compareTo(java.lang.Integer.valueOf(split2[i]))) >= 0) {
                    boolean Camera2StreamConfigurationMap2 = lib.android.paypal.com.magnessdk.b.Camera2StreamConfigurationMap(a2, java.lang.Long.parseLong(c(m)), lib.android.paypal.com.magnessdk.c.EnumC0221c.REMOTE);
                    if (!this.getOutputMinFrameDuration && Camera2StreamConfigurationMap2) {
                        new lib.android.paypal.com.magnessdk.network.b(lib.android.paypal.com.magnessdk.c.h.e.REMOTE_CONFIG_URL, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, null, new lib.android.paypal.com.magnessdk.e.a()).c();
                    }
                    java.lang.Class<?> cls2 = getClass();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Using cached currentConfig due to isRemoteConfigDisabled : ");
                    sb2.append(this.getOutputMinFrameDuration);
                    sb2.append(" or isConfigExpired : ");
                    sb2.append(Camera2StreamConfigurationMap2);
                    lib.android.paypal.com.magnessdk.log.a.a(cls2, 0, sb2.toString());
                    return a2;
                }
                lib.android.paypal.com.magnessdk.b.getHighSpeedVideoFpsRangesFor(m);
            } else {
                new lib.android.paypal.com.magnessdk.network.b(lib.android.paypal.com.magnessdk.c.h.e.REMOTE_CONFIG_URL, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, null, new lib.android.paypal.com.magnessdk.e.a()).c();
            }
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
        return b();
    }

    public boolean n() {
        return Camera2StreamConfigurationMap;
    }

    public int l() {
        return this.getInputFormats.optInt(lib.android.paypal.com.magnessdk.c.j.UA_REFRESH_TIME_KEY.toString(), 259200);
    }

    public int k() {
        return this.getInputFormats.optInt(lib.android.paypal.com.magnessdk.c.j.SENSOR_FREQUENCY_RATE.toString(), 20);
    }

    public int j() {
        return this.getInputFormats.optInt(lib.android.paypal.com.magnessdk.c.j.SENSOR_COLLECT_TIME.toString(), 5);
    }

    public org.json.JSONArray i() {
        return getHighSpeedVideoSizes;
    }

    public java.lang.String h() {
        return this.getInputFormats.optString(lib.android.paypal.com.magnessdk.c.j.MG_ID.toString(), "QW5kcm9pZE1hZ25lcw==");
    }

    public java.lang.String g() {
        return this.getInputFormats.optString(lib.android.paypal.com.magnessdk.c.j.CONF_ENDPOINT_URL.toString(), lib.android.paypal.com.magnessdk.c.h.e.DEVICE_INFO_URL.toString());
    }

    public java.lang.String f() {
        return this.getInputFormats.optString(lib.android.paypal.com.magnessdk.c.j.CONF_VERSION.toString());
    }

    class b extends android.os.Handler {
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (lib.android.paypal.com.magnessdk.e.c.getHighSpeedVideoSizes[lib.android.paypal.com.magnessdk.c.b.e.a(message.what).ordinal()] == 1) {
                try {
                    org.json.JSONObject jSONObject = (org.json.JSONObject) message.obj;
                    lib.android.paypal.com.magnessdk.e.this.a(jSONObject);
                    if (jSONObject.optJSONArray(lib.android.paypal.com.magnessdk.c.d.NOT_COLLECTIBLE_LIST.toString()) != null) {
                        lib.android.paypal.com.magnessdk.e.this.a(true);
                    }
                } catch (java.lang.Exception e) {
                    lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
                }
            }
            super.handleMessage(message);
        }

        b(android.os.Looper looper) {
            super(looper);
        }
    }

    public java.util.List<java.lang.String> e() throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = this.getInputFormats.optJSONArray(lib.android.paypal.com.magnessdk.c.j.ANDROID_APPS_TO_CHECK.toString());
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return arrayList;
    }

    class a implements lib.android.paypal.com.magnessdk.network.a<org.json.JSONObject> {
        @Override // lib.android.paypal.com.magnessdk.network.a
        public /* synthetic */ void a(org.json.JSONObject jSONObject) {
            org.json.JSONObject jSONObject2 = jSONObject;
            if (lib.android.paypal.com.magnessdk.e.this.getOutputFormats == null || jSONObject2 == null || jSONObject2.length() <= 0) {
                return;
            }
            android.os.Message message = new android.os.Message();
            message.obj = jSONObject2;
            message.what = lib.android.paypal.com.magnessdk.c.b.e.REMOTE_FETCH_COMPLETE.b();
            lib.android.paypal.com.magnessdk.e.this.getOutputFormats.sendMessage(message);
        }

        a() {
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.b.e.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.b.e.REMOTE_FETCH_COMPLETE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.b
    protected java.lang.String d() {
        return lib.android.paypal.com.magnessdk.c.h.e.REMOTE_CONFIG_URL.toString();
    }
}
