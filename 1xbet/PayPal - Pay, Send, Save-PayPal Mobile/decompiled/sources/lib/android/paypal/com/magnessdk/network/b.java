package lib.android.paypal.com.magnessdk.network;

/* loaded from: classes5.dex */
public class b extends lib.android.paypal.com.magnessdk.network.base.c {
    private android.os.Handler Camera2StreamConfigurationMap;
    private lib.android.paypal.com.magnessdk.c.h.e getHighSpeedVideoFpsRangesFor;
    private lib.android.paypal.com.magnessdk.network.a getHighSpeedVideoSizesFor;
    private org.json.JSONObject getInputFormats;
    private lib.android.paypal.com.magnessdk.MagnesSettings getOutputFormats;
    private lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl getOutputMinFrameDuration;
    java.net.CookieManager getHighSpeedVideoSizes = new java.net.CookieManager(lib.android.paypal.com.magnessdk.network.base.f.a(), java.net.CookiePolicy.ACCEPT_ALL);
    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.HashMap();

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void a() {
        org.json.JSONObject jSONObject;
        if (this.getHighSpeedVideoFpsRangesFor != lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_BEACON_URL || (jSONObject = this.getInputFormats) == null) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.put("User-Agent", java.lang.String.format("%s/%s/%s/Android", jSONObject.optString(lib.android.paypal.com.magnessdk.c.d.APP_ID.toString()), this.getInputFormats.optString(lib.android.paypal.com.magnessdk.c.d.APP_VERSION.toString()), this.getInputFormats.optString(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString())));
        this.getHighSpeedVideoFpsRanges.put("Accept-Language", "en-us");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
    
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017f A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:3:0x0003, B:5:0x0012, B:9:0x0081, B:11:0x008c, B:13:0x0092, B:14:0x0097, B:16:0x009d, B:18:0x00a5, B:20:0x00ab, B:22:0x00b1, B:23:0x00b4, B:25:0x00b8, B:26:0x00d3, B:28:0x0116, B:32:0x0126, B:35:0x0143, B:36:0x0146, B:38:0x014a, B:39:0x0178, B:40:0x017b, B:42:0x017f, B:45:0x018f, B:47:0x0195, B:48:0x0199, B:50:0x019f, B:53:0x01ab, B:56:0x01b1, B:69:0x0135, B:71:0x0155, B:73:0x0159, B:78:0x0072, B:81:0x001c, B:82:0x0079), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081 A[Catch: Exception -> 0x01bc, TryCatch #0 {Exception -> 0x01bc, blocks: (B:3:0x0003, B:5:0x0012, B:9:0x0081, B:11:0x008c, B:13:0x0092, B:14:0x0097, B:16:0x009d, B:18:0x00a5, B:20:0x00ab, B:22:0x00b1, B:23:0x00b4, B:25:0x00b8, B:26:0x00d3, B:28:0x0116, B:32:0x0126, B:35:0x0143, B:36:0x0146, B:38:0x014a, B:39:0x0178, B:40:0x017b, B:42:0x017f, B:45:0x018f, B:47:0x0195, B:48:0x0199, B:50:0x019f, B:53:0x01ab, B:56:0x01b1, B:69:0x0135, B:71:0x0155, B:73:0x0159, B:78:0x0072, B:81:0x001c, B:82:0x0079), top: B:2:0x0003 }] */
    @Override // lib.android.paypal.com.magnessdk.network.base.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        android.os.Handler handler;
        lib.android.paypal.com.magnessdk.network.base.MagnesNetworking createHttpClient;
        java.lang.String obj;
        android.os.Message obtain;
        android.os.Handler handler2;
        org.json.JSONObject jSONObject;
        lib.android.paypal.com.magnessdk.network.a aVar;
        java.net.CookieStore cookieStore;
        java.util.List<java.net.HttpCookie> cookies;
        a();
        try {
            createHttpClient = this.getOutputMinFrameDuration.createHttpClient(lib.android.paypal.com.magnessdk.c.h.EnumC0225c.GET);
        } catch (java.lang.Exception e) {
            handler = this.Camera2StreamConfigurationMap;
            if (handler == null) {
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor == lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_BEACON_URL) {
            org.json.JSONObject jSONObject2 = this.getInputFormats;
            if (jSONObject2 == null) {
                obj = null;
            } else {
                if (jSONObject2 == null) {
                    obj = null;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_BEACON_URL.toString());
                    sb.append("?p=");
                    sb.append(this.getInputFormats.optString(lib.android.paypal.com.magnessdk.c.b.f6933a));
                    sb.append("&i=");
                    sb.append(this.getInputFormats.optString(lib.android.paypal.com.magnessdk.c.e.IP_ADDRS.toString()));
                    sb.append("&t=");
                    sb.append(java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000));
                    sb.append("&a=");
                    sb.append(this.getOutputFormats.getMagnesSource());
                    obj = sb.toString();
                }
                if (obj != null && obj.length() > 0) {
                }
            }
            if (obj == null) {
                createHttpClient.setUri(android.net.Uri.parse(obj));
                java.util.Map<java.lang.String, java.lang.String> map = this.getHighSpeedVideoFpsRanges;
                if (map != null && !map.isEmpty()) {
                    createHttpClient.setHeader(this.getHighSpeedVideoFpsRanges);
                }
                lib.android.paypal.com.magnessdk.c.h.e eVar = this.getHighSpeedVideoFpsRangesFor;
                lib.android.paypal.com.magnessdk.c.h.e eVar2 = lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_BEACON_URL;
                if (eVar == eVar2 && (cookieStore = this.getHighSpeedVideoSizes.getCookieStore()) != null && (cookies = cookieStore.getCookies()) != null && cookies.size() > 0) {
                    createHttpClient.setCookies(cookies);
                }
                android.os.Handler handler3 = this.Camera2StreamConfigurationMap;
                if (handler3 != null) {
                    int b = lib.android.paypal.com.magnessdk.c.h.d.GET_REQUEST_STARTED.b();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Magnes Request Started for URL: ");
                    sb2.append(obj);
                    handler3.sendMessage(android.os.Message.obtain(handler3, b, sb2.toString()));
                }
                int execute = createHttpClient.execute(null);
                java.lang.String str = new java.lang.String(createHttpClient.getResponseContent(), "UTF-8");
                java.lang.Class<?> cls = getClass();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("MagesGetRequest for ");
                sb3.append(this.getHighSpeedVideoFpsRangesFor.toString());
                sb3.append(" returned status code ");
                sb3.append(execute);
                sb3.append(", and responseString: ");
                sb3.append(str);
                lib.android.paypal.com.magnessdk.log.a.a(cls, 0, sb3.toString());
                if (execute == lib.android.paypal.com.magnessdk.c.h.d.HTTP_STATUS_200.b()) {
                    int i = lib.android.paypal.com.magnessdk.network.b.a.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRangesFor.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            lib.android.paypal.com.magnessdk.b.a(str, lib.android.paypal.com.magnessdk.e.m);
                            jSONObject = new org.json.JSONObject(str);
                            aVar = this.getHighSpeedVideoSizesFor;
                            if (aVar != null) {
                                aVar.a(jSONObject);
                            }
                        }
                        handler2 = this.Camera2StreamConfigurationMap;
                        if (handler2 != null) {
                            obtain = android.os.Message.obtain(handler2, lib.android.paypal.com.magnessdk.c.h.d.GET_REQUEST_SUCCEEDED.b(), str);
                            handler2.sendMessage(obtain);
                        }
                        if (this.getHighSpeedVideoFpsRangesFor != eVar2) {
                            java.util.List<java.lang.String> cookies2 = createHttpClient.getCookies("Set-Cookie");
                            java.net.CookieStore cookieStore2 = this.getHighSpeedVideoSizes.getCookieStore();
                            if (cookieStore2 == null || cookies2 == null || cookies2.isEmpty()) {
                                return;
                            }
                            java.util.Iterator<java.lang.String> it = cookies2.iterator();
                            while (it.hasNext()) {
                                java.util.List<java.net.HttpCookie> parse = java.net.HttpCookie.parse(it.next());
                                if (parse != null && parse.size() > 0) {
                                    cookieStore2.add(null, parse.get(0));
                                }
                            }
                            return;
                        }
                        return;
                    }
                    lib.android.paypal.com.magnessdk.b.a(str, lib.android.paypal.com.magnessdk.d.l);
                    jSONObject = new org.json.JSONObject(str);
                    aVar = this.getHighSpeedVideoSizesFor;
                } else {
                    android.os.Handler handler4 = this.Camera2StreamConfigurationMap;
                    if (handler4 != null) {
                        int b2 = lib.android.paypal.com.magnessdk.c.h.d.GET_REQUEST_ERROR.b();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(execute);
                        sb4.append(" : ");
                        sb4.append(str);
                        obtain = android.os.Message.obtain(handler4, b2, sb4.toString());
                        handler2 = handler4;
                        handler2.sendMessage(obtain);
                    }
                    if (this.getHighSpeedVideoFpsRangesFor != eVar2) {
                    }
                }
                handler = this.Camera2StreamConfigurationMap;
                if (handler == null) {
                    handler.sendMessage(android.os.Message.obtain(handler, lib.android.paypal.com.magnessdk.c.h.d.GET_REQUEST_ERROR.b(), e));
                    return;
                }
                return;
            }
            return;
        }
        obj = this.getHighSpeedVideoFpsRangesFor.toString();
        if (obj == null) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.Camera2StreamConfigurationMap == null) {
            return;
        }
        d();
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.h.e.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.h.e.RAMP_CONFIG_URL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[lib.android.paypal.com.magnessdk.c.h.e.REMOTE_CONFIG_URL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void c() {
        if (this.getOutputFormats.isEnableNetworkOnCallerThread()) {
            d();
        } else {
            b();
        }
    }

    public b(lib.android.paypal.com.magnessdk.c.h.e eVar, lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, android.os.Handler handler, org.json.JSONObject jSONObject, lib.android.paypal.com.magnessdk.network.a aVar) {
        this.getHighSpeedVideoFpsRangesFor = eVar;
        this.getOutputFormats = magnesSettings;
        this.Camera2StreamConfigurationMap = handler;
        this.getOutputMinFrameDuration = magnesSettings.getMagnesNetworkingFactoryImpl() == null ? new lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl() : magnesSettings.getMagnesNetworkingFactoryImpl();
        this.getInputFormats = jSONObject;
        this.getHighSpeedVideoSizesFor = aVar;
    }
}
