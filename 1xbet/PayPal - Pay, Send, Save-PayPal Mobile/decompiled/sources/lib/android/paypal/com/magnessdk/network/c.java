package lib.android.paypal.com.magnessdk.network;

/* loaded from: classes5.dex */
public class c extends lib.android.paypal.com.magnessdk.network.base.c {
    private lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl Camera2StreamConfigurationMap;
    private lib.android.paypal.com.magnessdk.c.h.e getHighSpeedVideoFpsRangesFor;
    private android.os.Handler getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private lib.android.paypal.com.magnessdk.c.b.d getInputFormats;
    private org.json.JSONObject getInputSizeshNQ4ISI;
    private lib.android.paypal.com.magnessdk.MagnesSettings getOutputFormats;
    private final int getOutputMinFrameDuration = 2;
    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap();

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void a() {
        java.util.Map<java.lang.String, java.lang.String> d;
        if (this.getOutputFormats != null) {
            try {
                int i = lib.android.paypal.com.magnessdk.network.c.a.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRangesFor.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    d = lib.android.paypal.com.magnessdk.f.d(this.getOutputFormats.getContext());
                    if (d == null) {
                        return;
                    }
                } else {
                    d = lib.android.paypal.com.magnessdk.f.c(this.getOutputFormats.getContext());
                    if (d == null) {
                        return;
                    }
                }
                this.getHighSpeedVideoFpsRanges = d;
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.f.class, 3, e);
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
        lib.android.paypal.com.magnessdk.k b;
        lib.android.paypal.com.magnessdk.c.b.d dVar;
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        lib.android.paypal.com.magnessdk.k b2;
        lib.android.paypal.com.magnessdk.c.b.d dVar2;
        if (this.getInputFormats == lib.android.paypal.com.magnessdk.c.b.d.ERROR) {
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = str;
        }
        int i = lib.android.paypal.com.magnessdk.network.c.a.getHighSpeedVideoFpsRangesFor[this.getInputFormats.ordinal()];
        if (i == 1) {
            b = lib.android.paypal.com.magnessdk.k.b();
            dVar = lib.android.paypal.com.magnessdk.c.b.d.MAIN;
        } else {
            if (i != 2) {
                if (i == 3) {
                    b = lib.android.paypal.com.magnessdk.k.b();
                    dVar = lib.android.paypal.com.magnessdk.c.b.d.TOUCH;
                }
                if (this.getInputFormats != lib.android.paypal.com.magnessdk.c.b.d.ERROR || (jSONObject = this.getInputSizeshNQ4ISI) == null || (optString = jSONObject.optString(lib.android.paypal.com.magnessdk.c.b.f6933a)) == null || optString.isEmpty()) {
                    return;
                }
                int i2 = lib.android.paypal.com.magnessdk.network.c.a.getHighSpeedVideoFpsRangesFor[this.getInputFormats.ordinal()];
                if (i2 == 1) {
                    lib.android.paypal.com.magnessdk.k.b().a(lib.android.paypal.com.magnessdk.c.b.d.MAIN, optString, this.getInputSizeshNQ4ISI.optString(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString()), this.getInputSizeshNQ4ISI.optString(lib.android.paypal.com.magnessdk.c.e.IP_ADDRS.toString()));
                    return;
                }
                if (i2 == 2) {
                    b2 = lib.android.paypal.com.magnessdk.k.b();
                    dVar2 = lib.android.paypal.com.magnessdk.c.b.d.SENSOR;
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    b2 = lib.android.paypal.com.magnessdk.k.b();
                    dVar2 = lib.android.paypal.com.magnessdk.c.b.d.TOUCH;
                }
                b2.a(dVar2, optString);
                return;
            }
            b = lib.android.paypal.com.magnessdk.k.b();
            dVar = lib.android.paypal.com.magnessdk.c.b.d.SENSOR;
        }
        b.a(dVar, str, str2);
        if (this.getInputFormats != lib.android.paypal.com.magnessdk.c.b.d.ERROR) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7 A[Catch: Exception -> 0x025e, TryCatch #0 {Exception -> 0x025e, blocks: (B:3:0x0005, B:5:0x0012, B:7:0x0016, B:8:0x0020, B:9:0x0023, B:10:0x0032, B:11:0x00a0, B:14:0x00a9, B:17:0x00b7, B:18:0x00bf, B:24:0x00c6, B:25:0x011e, B:27:0x0124, B:31:0x0133, B:32:0x012e, B:35:0x0153, B:38:0x0178, B:41:0x019a, B:43:0x01a8, B:44:0x01ad, B:46:0x01dd, B:48:0x01e5, B:76:0x01eb, B:51:0x01f1, B:53:0x01f7, B:55:0x01fb, B:56:0x020c, B:57:0x020e, B:58:0x0242, B:61:0x0213, B:63:0x021b, B:65:0x021f, B:66:0x0230, B:67:0x0246, B:69:0x024c, B:71:0x0250, B:82:0x0026, B:84:0x0030, B:85:0x0038, B:87:0x0042, B:88:0x0045, B:89:0x0048, B:91:0x0052, B:93:0x0056, B:94:0x0059, B:95:0x005c, B:97:0x0066, B:99:0x006a, B:100:0x006d, B:101:0x0070, B:103:0x0074, B:104:0x0077, B:105:0x007a, B:107:0x0084, B:108:0x008f, B:110:0x0099, B:111:0x009c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0213 A[Catch: Exception -> 0x025e, TryCatch #0 {Exception -> 0x025e, blocks: (B:3:0x0005, B:5:0x0012, B:7:0x0016, B:8:0x0020, B:9:0x0023, B:10:0x0032, B:11:0x00a0, B:14:0x00a9, B:17:0x00b7, B:18:0x00bf, B:24:0x00c6, B:25:0x011e, B:27:0x0124, B:31:0x0133, B:32:0x012e, B:35:0x0153, B:38:0x0178, B:41:0x019a, B:43:0x01a8, B:44:0x01ad, B:46:0x01dd, B:48:0x01e5, B:76:0x01eb, B:51:0x01f1, B:53:0x01f7, B:55:0x01fb, B:56:0x020c, B:57:0x020e, B:58:0x0242, B:61:0x0213, B:63:0x021b, B:65:0x021f, B:66:0x0230, B:67:0x0246, B:69:0x024c, B:71:0x0250, B:82:0x0026, B:84:0x0030, B:85:0x0038, B:87:0x0042, B:88:0x0045, B:89:0x0048, B:91:0x0052, B:93:0x0056, B:94:0x0059, B:95:0x005c, B:97:0x0066, B:99:0x006a, B:100:0x006d, B:101:0x0070, B:103:0x0074, B:104:0x0077, B:105:0x007a, B:107:0x0084, B:108:0x008f, B:110:0x0099, B:111:0x009c), top: B:2:0x0005 }] */
    @Override // lib.android.paypal.com.magnessdk.network.base.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        java.lang.String str;
        android.os.Handler handler;
        java.lang.Object obj;
        java.lang.String obj2;
        lib.android.paypal.com.magnessdk.c.h.e eVar;
        a();
        try {
            lib.android.paypal.com.magnessdk.network.base.MagnesNetworking createHttpClient = this.Camera2StreamConfigurationMap.createHttpClient(lib.android.paypal.com.magnessdk.c.h.EnumC0225c.POST);
            java.lang.String str2 = null;
            if (this.getOutputFormats != null && this.getHighSpeedVideoSizes != null) {
                switch (lib.android.paypal.com.magnessdk.network.c.a.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRangesFor.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        if (this.getOutputFormats.getEnvironment() == lib.android.paypal.com.magnessdk.Environment.LIVE) {
                            str = lib.android.paypal.com.magnessdk.MagnesSDK.getInstance().f6930a.g();
                            break;
                        } else {
                            eVar = this.getOutputFormats.getEnvironment() == lib.android.paypal.com.magnessdk.Environment.SANDBOX ? lib.android.paypal.com.magnessdk.c.h.e.SANDBOX_DEVICE_INFO_URL : lib.android.paypal.com.magnessdk.c.h.e.STAGE_DEVICE_INFO_URL;
                            str = eVar.toString();
                            break;
                        }
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        eVar = this.getOutputFormats.getEnvironment() == lib.android.paypal.com.magnessdk.Environment.LIVE ? this.getHighSpeedVideoSizesFor ? lib.android.paypal.com.magnessdk.c.h.e.AUDIT_JSON_URL : lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_JSON_URL : this.getOutputFormats.getEnvironment() == lib.android.paypal.com.magnessdk.Environment.SANDBOX ? this.getHighSpeedVideoSizesFor ? lib.android.paypal.com.magnessdk.c.h.e.SANDBOX_AUDIT_JSON_URL : lib.android.paypal.com.magnessdk.c.h.e.SANDBOX_PROD_JSON_URL : this.getHighSpeedVideoSizesFor ? lib.android.paypal.com.magnessdk.c.h.e.STAGE_AUDIT_JSON_URL : lib.android.paypal.com.magnessdk.c.h.e.STAGE_PROD_JSON_URL;
                        str = eVar.toString();
                        break;
                    case 8:
                        eVar = this.getOutputFormats.getEnvironment() == lib.android.paypal.com.magnessdk.Environment.LIVE ? lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_ERROR_URL : this.getOutputFormats.getEnvironment() == lib.android.paypal.com.magnessdk.Environment.SANDBOX ? lib.android.paypal.com.magnessdk.c.h.e.SANDBOX_ERROR_URL : lib.android.paypal.com.magnessdk.c.h.e.STAGE_ERROR_URL;
                        str = eVar.toString();
                        break;
                    default:
                        eVar = this.getHighSpeedVideoFpsRangesFor;
                        str = eVar.toString();
                        break;
                }
            } else {
                str = null;
            }
            if (this.getInputSizeshNQ4ISI != null) {
                int i = lib.android.paypal.com.magnessdk.network.c.a.Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRangesFor.ordinal()];
                if (i == 2 || i == 3) {
                    if (this.getInputSizeshNQ4ISI == null) {
                        obj2 = null;
                    } else {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("appGuid", this.getInputSizeshNQ4ISI.optString(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString()));
                        org.json.JSONObject jSONObject = this.getInputSizeshNQ4ISI;
                        hashMap.put("libraryVersion", java.lang.String.format(java.util.Locale.US, "Dyson/%S (%S %S)", jSONObject.optString(lib.android.paypal.com.magnessdk.c.d.COMP_VERSION.toString()), jSONObject.optString(lib.android.paypal.com.magnessdk.c.d.OS_TYPE.toString()), android.os.Build.VERSION.RELEASE));
                        hashMap.put("additionalData", this.getInputSizeshNQ4ISI.toString());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        boolean z = true;
                        for (java.util.Map.Entry entry : hashMap.entrySet()) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append("&");
                            }
                            sb.append(java.net.URLEncoder.encode((java.lang.String) entry.getKey(), "UTF-8"));
                            sb.append("=");
                            sb.append(java.net.URLEncoder.encode((java.lang.String) entry.getValue(), "UTF-8"));
                        }
                        java.lang.Class<?> cls = getClass();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Encoded Device info payload : ");
                        sb2.append(sb.toString());
                        lib.android.paypal.com.magnessdk.log.a.a(cls, 0, sb2.toString());
                        obj2 = sb.toString();
                    }
                    if (obj2 != null) {
                        str2 = obj2;
                    }
                } else {
                    str2 = this.getInputSizeshNQ4ISI.toString();
                }
            }
            if (str == null || str2 == null) {
                return;
            }
            createHttpClient.setUri(android.net.Uri.parse(str));
            createHttpClient.setHeader(this.getHighSpeedVideoFpsRanges);
            android.os.Handler handler2 = this.getHighSpeedVideoSizes;
            handler2.sendMessage(android.os.Message.obtain(handler2, lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_STARTED.b(), str));
            int i2 = 0;
            int i3 = 0;
            java.lang.String str3 = "";
            while (i3 < 2) {
                i2 = createHttpClient.execute(str2.getBytes("UTF-8"));
                byte[] responseContent = createHttpClient.getResponseContent();
                if (responseContent != null) {
                    str3 = new java.lang.String(responseContent, "UTF-8");
                }
                createHttpClient.getPayPalDebugId();
                java.lang.Class<?> cls2 = getClass();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("MagnesPostRequest for ");
                sb3.append(str);
                sb3.append(" returned status code ");
                sb3.append(i2);
                sb3.append(", and responseString: ");
                sb3.append(str3);
                lib.android.paypal.com.magnessdk.log.a.a(cls2, 0, sb3.toString());
                i3++;
                if (this.getInputFormats != lib.android.paypal.com.magnessdk.c.b.d.ERROR && (i2 != lib.android.paypal.com.magnessdk.c.h.d.HTTP_STATUS_200.b() || createHttpClient.getPayPalDebugId() == null)) {
                    java.lang.Thread.sleep(100L);
                }
                if (createHttpClient.getPayPalDebugId() != null) {
                    android.os.Handler handler3 = this.getHighSpeedVideoSizes;
                    if (handler3 != null) {
                        handler3.sendMessage(android.os.Message.obtain(handler3, lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_ERROR.b(), java.lang.Integer.valueOf(i2)));
                    }
                    obj = lib.android.paypal.com.magnessdk.c.b.EnumC0220c.NO_DEBUGID_ERROR;
                } else {
                    lib.android.paypal.com.magnessdk.c.h.d dVar = lib.android.paypal.com.magnessdk.c.h.d.HTTP_STATUS_200;
                    if (i2 == dVar.b()) {
                        if (i2 != dVar.b() || (handler = this.getHighSpeedVideoSizes) == null) {
                            return;
                        }
                        handler.sendMessage(android.os.Message.obtain(handler, lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_SUCCEEDED.b(), str3));
                        return;
                    }
                    android.os.Handler handler4 = this.getHighSpeedVideoSizes;
                    if (handler4 != null) {
                        handler4.sendMessage(android.os.Message.obtain(handler4, lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_ERROR.b(), java.lang.Integer.valueOf(i2)));
                    }
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(lib.android.paypal.com.magnessdk.c.b.EnumC0220c.RESPONSE_ERROR.toString());
                    sb4.append(i2);
                    obj = sb4;
                }
                getHighResolutionOutputSizeshNQ4ISI(obj.toString(), "");
            }
            if (createHttpClient.getPayPalDebugId() != null) {
            }
            getHighResolutionOutputSizeshNQ4ISI(obj.toString(), "");
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            android.os.Handler handler5 = this.getHighSpeedVideoSizes;
            if (handler5 != null) {
                handler5.sendMessage(android.os.Message.obtain(handler5, lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_ERROR.b(), e));
            }
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
            if (stackTraceString != null && stackTraceString.length() > 1000) {
                stackTraceString = stackTraceString.substring(0, 1000);
            }
            getHighResolutionOutputSizeshNQ4ISI(lib.android.paypal.com.magnessdk.c.b.EnumC0220c.NETWORK_EXCEPTION.toString(), stackTraceString);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.getHighSpeedVideoSizes == null) {
            return;
        }
        d();
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.b.d.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.b.d.MAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[lib.android.paypal.com.magnessdk.c.b.d.SENSOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[lib.android.paypal.com.magnessdk.c.b.d.TOUCH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[lib.android.paypal.com.magnessdk.c.h.e.values().length];
            Camera2StreamConfigurationMap = iArr2;
            try {
                iArr2[lib.android.paypal.com.magnessdk.c.h.e.STAGE_DEVICE_INFO_URL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.e.DEVICE_INFO_URL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.e.SANDBOX_DEVICE_INFO_URL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_JSON_URL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.e.STAGE_PROD_JSON_URL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.e.AUDIT_JSON_URL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.e.STAGE_AUDIT_JSON_URL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_ERROR_URL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused11) {
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

    public c(lib.android.paypal.com.magnessdk.c.h.e eVar, org.json.JSONObject jSONObject, boolean z, lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, android.os.Handler handler, lib.android.paypal.com.magnessdk.c.b.d dVar) {
        this.getHighSpeedVideoFpsRangesFor = eVar;
        this.getInputSizeshNQ4ISI = jSONObject;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighSpeedVideoSizes = handler;
        this.getOutputFormats = magnesSettings;
        this.getInputFormats = dVar;
        this.Camera2StreamConfigurationMap = magnesSettings.getMagnesNetworkingFactoryImpl() == null ? new lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl() : magnesSettings.getMagnesNetworkingFactoryImpl();
    }
}
