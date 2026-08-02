package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public class d extends lib.android.paypal.com.magnessdk.b {
    public static final java.lang.String l = "RAMP_CONFIG";
    private android.os.Handler Camera2StreamConfigurationMap;
    private android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private org.json.JSONObject getHighSpeedVideoFpsRanges;
    private lib.android.paypal.com.magnessdk.MagnesSettings getHighSpeedVideoFpsRangesFor;
    private android.os.Handler getHighSpeedVideoSizes;
    public final java.lang.String e = lib.android.paypal.com.magnessdk.c.i.CONF_REFRESH_TIME_KEY.toString();
    private java.lang.Object getHighSpeedVideoSizesFor = new java.lang.Object();

    private org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI(int i) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.c.i.RAMP_THRESHOLD.toString(), i);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.i.MIN_VERSION.toString(), "5.3.0");
            jSONObject.put(lib.android.paypal.com.magnessdk.c.i.EXCLUDED.toString(), new org.json.JSONArray());
            jSONObject.put(lib.android.paypal.com.magnessdk.c.i.APP_IDS.toString(), new org.json.JSONArray());
            jSONObject.put(lib.android.paypal.com.magnessdk.c.i.APP_SOURCES.toString(), new org.json.JSONArray());
            return jSONObject;
        } catch (java.lang.Exception e) {
            java.lang.Class<?> cls = getClass();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to create deafult config due to ");
            sb.append(e.getLocalizedMessage());
            lib.android.paypal.com.magnessdk.log.a.a(cls, 3, sb.toString());
            return jSONObject;
        }
    }

    public org.json.JSONObject a() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // lib.android.paypal.com.magnessdk.b
    protected void a(org.json.JSONObject jSONObject) {
        this.getHighSpeedVideoFpsRanges = jSONObject;
    }

    public d(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, android.os.Handler handler) {
        android.content.Context context = magnesSettings.getContext();
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoFpsRangesFor = magnesSettings;
        if (lib.android.paypal.com.magnessdk.b.d == null) {
            lib.android.paypal.com.magnessdk.b.d = context.getFilesDir();
        }
        this.getHighSpeedVideoSizes = handler;
        try {
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null) {
                this.Camera2StreamConfigurationMap = new lib.android.paypal.com.magnessdk.d.b(myLooper);
            }
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
        a(c());
        try {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, a());
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // lib.android.paypal.com.magnessdk.b
    protected org.json.JSONObject c() {
        try {
            org.json.JSONObject a2 = lib.android.paypal.com.magnessdk.b.a(l);
            if (a2 == null) {
                new lib.android.paypal.com.magnessdk.network.b(lib.android.paypal.com.magnessdk.c.h.e.RAMP_CONFIG_URL, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null, new lib.android.paypal.com.magnessdk.d.a()).c();
                return b();
            }
            if (lib.android.paypal.com.magnessdk.b.Camera2StreamConfigurationMap(a2, java.lang.Long.parseLong(c(l)), lib.android.paypal.com.magnessdk.c.EnumC0221c.RAMP)) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "Cached config used while fetching.");
                new lib.android.paypal.com.magnessdk.network.b(lib.android.paypal.com.magnessdk.c.h.e.RAMP_CONFIG_URL, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null, new lib.android.paypal.com.magnessdk.d.a()).c();
            }
            return a2;
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            return b();
        }
    }

    class b extends android.os.Handler {
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (lib.android.paypal.com.magnessdk.d.c.getHighSpeedVideoFpsRanges[lib.android.paypal.com.magnessdk.c.b.e.a(message.what).ordinal()] == 1) {
                try {
                    lib.android.paypal.com.magnessdk.d.this.a((org.json.JSONObject) message.obj);
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

    @Override // lib.android.paypal.com.magnessdk.b
    protected java.lang.String d() {
        return lib.android.paypal.com.magnessdk.c.h.e.RAMP_CONFIG_URL.toString();
    }

    class a implements lib.android.paypal.com.magnessdk.network.a<org.json.JSONObject> {
        @Override // lib.android.paypal.com.magnessdk.network.a
        public /* synthetic */ void a(org.json.JSONObject jSONObject) {
            org.json.JSONObject jSONObject2 = jSONObject;
            if (lib.android.paypal.com.magnessdk.d.this.Camera2StreamConfigurationMap == null || jSONObject2 == null || jSONObject2.length() <= 0) {
                return;
            }
            android.os.Message message = new android.os.Message();
            message.obj = jSONObject2;
            message.what = lib.android.paypal.com.magnessdk.c.b.e.RAMP_FETCH_COMPLETE.b();
            lib.android.paypal.com.magnessdk.d.this.Camera2StreamConfigurationMap.sendMessage(message);
        }

        a() {
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.b.e.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.b.e.RAMP_FETCH_COMPLETE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.b
    protected org.json.JSONObject b() {
        lib.android.paypal.com.magnessdk.log.a.a(getClass(), 0, "entering getDefaultConfig");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.g.n2, getHighResolutionOutputSizeshNQ4ISI(100));
            jSONObject.put(lib.android.paypal.com.magnessdk.g.o2, getHighResolutionOutputSizeshNQ4ISI(100));
            jSONObject.put(lib.android.paypal.com.magnessdk.g.p2, getHighResolutionOutputSizeshNQ4ISI(0));
            jSONObject.put(lib.android.paypal.com.magnessdk.g.q2, getHighResolutionOutputSizeshNQ4ISI(100));
            jSONObject.put("e", getHighResolutionOutputSizeshNQ4ISI(100));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.i.CONF_REFRESH_TIME_KEY.toString(), 7200);
            return jSONObject;
        } catch (org.json.JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            return jSONObject;
        }
    }
}
