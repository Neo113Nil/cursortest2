package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
final class h extends lib.android.paypal.com.magnessdk.g {
    private android.os.Handler AMEXKernel;
    private org.json.JSONObject ArtificialStackFrames;
    private java.lang.String Camera2StreamConfigurationMap;
    private org.json.JSONObject CoroutineDebuggingKt;
    private org.json.JSONArray _BOUNDARY;
    private lib.android.paypal.com.magnessdk.e _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f6939a;
    private org.json.JSONArray b;
    private org.json.JSONObject coroutineBoundary;
    private org.json.JSONObject coroutineCreation;
    private java.lang.String exchange;
    private org.json.JSONObject getARTIFICIAL_FRAME_PACKAGE_NAME;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private java.lang.String init;
    private java.lang.String isOutputSupportedForhNQ4ISI;
    private java.lang.String kernelVersion;
    private java.lang.String release;
    private boolean toString;
    private java.lang.String unwrapAs;
    private long isOutputSupportedFor = -1;
    private long getValidOutputFormatsForInputhNQ4ISI = -1;
    private long accessartificialFrame = -1;

    static final class f {
        private static int getHighResolutionOutputSizeshNQ4ISI = 5;
        private static java.lang.Boolean[] getHighSpeedVideoFpsRangesFor;

        static java.lang.String Camera2StreamConfigurationMap(android.content.Context context) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new java.lang.Boolean[getHighResolutionOutputSizeshNQ4ISI];
                for (int i = 0; i < getHighResolutionOutputSizeshNQ4ISI; i++) {
                    boolean z = true;
                    if (i == 0) {
                        java.lang.String str = android.os.Build.MANUFACTURER;
                        if (!str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.UNKNOWN.toString()) && !str.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GENY_MOTION.toString()) && !str.contains(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.ANDY_OS.toString())) {
                            java.lang.String str2 = android.os.Build.BRAND;
                            if (!str2.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GENERIC.toString()) && !str2.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GENERIC_X86.toString()) && !str2.equals("Android") && !str2.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.ANDY_OS.toString())) {
                                java.lang.String str3 = android.os.Build.DEVICE;
                                if (!str3.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.ANDY_OSX.toString()) && !str3.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.DROID_4X.toString()) && !str3.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GENERIC.toString()) && !str3.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GENERIC_X86.toString()) && !str3.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.VBOX_86P.toString())) {
                                    java.lang.String str4 = android.os.Build.HARDWARE;
                                    if (!str4.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GOLDFISH.toString()) && !str4.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.VBOX_86.toString()) && !str4.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.ANDY.toString()) && !str4.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.RANCHU.toString()) && !str4.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.TTVM_X86.toString()) && !str4.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.ANDROID_X86.toString())) {
                                        java.lang.String str5 = android.os.Build.MODEL;
                                        if (!str5.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.SDK.toString()) && !str5.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GOODLE_SDK.toString()) && !str5.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.ANDROID_SDK_BUILD_FOR_X86.toString()) && !android.os.Build.FINGERPRINT.startsWith(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GENERIC.toString())) {
                                            java.lang.String str6 = android.os.Build.PRODUCT;
                                            if (!str6.matches(".*_?sdk_?.*")) {
                                                if (!str6.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.VBOX_86P.toString())) {
                                                    if (!str6.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.GENY_MOTION.toString())) {
                                                        if (!str6.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.DRIOD_4X.toString())) {
                                                            if (!str6.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.ANDY_OSX.toString())) {
                                                                if (str6.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.REMIXEMU.toString())) {
                                                                }
                                                                z = false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i == 1) {
                        boolean a2 = a.c.a(lib.android.paypal.com.magnessdk.c.f.getOutputMinFrameDuration, "");
                        boolean z2 = (!android.os.Build.MANUFACTURER.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.SAMSUNG.toString()) || android.os.Build.VERSION.SDK_INT > 27) && a.c.a(lib.android.paypal.com.magnessdk.c.f.getInputSizeshNQ4ISI, "");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(android.os.Environment.getExternalStorageDirectory().toString());
                        char c = java.io.File.separatorChar;
                        sb.append(c);
                        sb.append("windows");
                        sb.append(c);
                        sb.append("BstSharedFolder");
                        if (!new java.io.File(sb.toString()).exists()) {
                            if (!a2) {
                                if (z2) {
                                }
                                z = false;
                            }
                        }
                    } else if (i == 2) {
                        boolean a3 = a.c.a(lib.android.paypal.com.magnessdk.c.f.getHighSpeedVideoFpsRangesFor, "");
                        boolean z3 = (!android.os.Build.MANUFACTURER.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.SAMSUNG.toString()) || android.os.Build.VERSION.SDK_INT > 27) && a.c.a(lib.android.paypal.com.magnessdk.c.f.getHighResolutionOutputSizeshNQ4ISI, "");
                        if (!a3) {
                            if (z3) {
                            }
                            z = false;
                        }
                    } else if (i != 3) {
                        if (i == 4) {
                            if (!a.c.a(lib.android.paypal.com.magnessdk.c.f.getInputFormats, "") && !a.c.a(lib.android.paypal.com.magnessdk.c.f.getHighSpeedVideoSizesFor, "")) {
                                boolean a4 = a.c.a(lib.android.paypal.com.magnessdk.c.f.getHighSpeedVideoSizes, "");
                                boolean z4 = (!android.os.Build.MANUFACTURER.equals(lib.android.paypal.com.magnessdk.c.d.EnumC0222c.SAMSUNG.toString()) || android.os.Build.VERSION.SDK_INT > 27) && a.c.a(lib.android.paypal.com.magnessdk.c.f.Camera2StreamConfigurationMap, "");
                                if (!a4) {
                                    if (z4) {
                                    }
                                }
                            }
                        }
                        z = false;
                    } else {
                        z = a.d.a(context, new java.util.ArrayList(java.util.Arrays.asList(lib.android.paypal.com.magnessdk.c.f.getHighSpeedVideoFpsRanges)));
                    }
                    getHighSpeedVideoFpsRangesFor[i] = java.lang.Boolean.valueOf(z);
                }
            }
            return lib.android.paypal.com.magnessdk.f.a(getHighSpeedVideoFpsRangesFor);
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context);
            return Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap.contains("1");
        }

        private f() {
        }
    }

    static final class g {
        private static int getHighResolutionOutputSizeshNQ4ISI = lib.android.paypal.com.magnessdk.c.k.b.NUMBER_OF_ROOTED_FLAGS.b();
        private static java.lang.Boolean[] getHighSpeedVideoSizes = null;

        static boolean Camera2StreamConfigurationMap(android.content.Context context) {
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context);
            if (highSpeedVideoFpsRangesFor != null) {
                return highSpeedVideoFpsRangesFor.contains("1");
            }
            return false;
        }

        private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) throws java.io.IOException {
            java.util.Properties properties = new java.util.Properties();
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(a.b.n.getBytes("UTF-8"));
            try {
                try {
                    properties.load(byteArrayInputStream);
                } catch (java.lang.Exception e) {
                    lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.g.class, 3, e);
                }
                byteArrayInputStream.close();
                return properties.getProperty(str);
            } catch (java.lang.Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static java.lang.String getHighSpeedVideoFpsRangesFor(android.content.Context context) {
            boolean z;
            lib.android.paypal.com.magnessdk.c.k.a aVar;
            if (getHighSpeedVideoSizes == null) {
                getHighSpeedVideoSizes = new java.lang.Boolean[getHighResolutionOutputSizeshNQ4ISI];
                for (int i = 0; i < getHighResolutionOutputSizeshNQ4ISI; i++) {
                    lib.android.paypal.com.magnessdk.c.k.b a2 = lib.android.paypal.com.magnessdk.c.k.b.a(i);
                    if (a2 == null) {
                        return null;
                    }
                    switch (lib.android.paypal.com.magnessdk.h.e.getHighSpeedVideoFpsRanges[a2.ordinal()]) {
                        case 1:
                            java.lang.String str = android.os.Build.TAGS;
                            if (str != null && str.contains("test-keys")) {
                                z = true;
                                break;
                            }
                            z = false;
                            break;
                        case 2:
                            z = getHighResolutionOutputSizeshNQ4ISI();
                            break;
                        case 3:
                            z = Camera2StreamConfigurationMap();
                            break;
                        case 4:
                            z = a.d.a(context, new java.util.ArrayList(java.util.Arrays.asList(lib.android.paypal.com.magnessdk.c.k.KNOWN_ROOT_APPS_PACKAGES.b())));
                            break;
                        case 5:
                            aVar = lib.android.paypal.com.magnessdk.c.k.a.SU;
                            z = a.c.a(lib.android.paypal.com.magnessdk.c.k.SU_PATHS.b(), aVar.toString());
                            break;
                        case 6:
                            aVar = lib.android.paypal.com.magnessdk.c.k.a.BUSYBOX;
                            z = a.c.a(lib.android.paypal.com.magnessdk.c.k.SU_PATHS.b(), aVar.toString());
                            break;
                        case 7:
                            aVar = lib.android.paypal.com.magnessdk.c.k.a.MAGISK;
                            z = a.c.a(lib.android.paypal.com.magnessdk.c.k.SU_PATHS.b(), aVar.toString());
                            break;
                        default:
                            z = false;
                            break;
                    }
                    getHighSpeedVideoSizes[i] = java.lang.Boolean.valueOf(z);
                }
            }
            return lib.android.paypal.com.magnessdk.f.a(getHighSpeedVideoSizes);
        }

        private static boolean Camera2StreamConfigurationMap() {
            try {
                return new java.io.File(getHighSpeedVideoFpsRangesFor("superUserApk")).exists();
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.g.class, 3, e);
                return false;
            }
        }

        private static boolean getHighResolutionOutputSizeshNQ4ISI() {
            try {
                return new java.io.File(getHighSpeedVideoFpsRangesFor("suFileName")).exists();
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.g.class, 3, e);
                return false;
            }
        }

        private g() {
        }
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final org.json.JSONObject getHighSpeedVideoFpsRanges(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, lib.android.paypal.com.magnessdk.d dVar, lib.android.paypal.com.magnessdk.e eVar) {
        this._CREATION = eVar;
        getHighSpeedVideoFpsRangesFor();
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 0, "collecting RiskBlobCoreData");
        getHighSpeedVideoSizes(1, magnesSettings);
        getHighSpeedVideoSizes(2, magnesSettings);
        getHighSpeedVideoSizes(3, magnesSettings);
        getHighSpeedVideoSizes(65, magnesSettings);
        getHighSpeedVideoSizes(66, magnesSettings);
        getHighSpeedVideoSizes(69, magnesSettings);
        getHighSpeedVideoSizes(8, magnesSettings);
        getHighSpeedVideoSizes(9, magnesSettings);
        getHighSpeedVideoSizes(14, magnesSettings);
        getHighSpeedVideoSizes(15, magnesSettings);
        getHighSpeedVideoSizes(70, magnesSettings);
        getHighSpeedVideoSizes(59, magnesSettings);
        getHighSpeedVideoSizes(103, magnesSettings);
        getHighSpeedVideoSizes(60, magnesSettings);
        getHighSpeedVideoSizes(100, magnesSettings);
        getHighSpeedVideoSizes(32, magnesSettings);
        getHighSpeedVideoSizes(86, magnesSettings);
        getHighSpeedVideoSizes(62, magnesSettings);
        getHighSpeedVideoSizes(34, magnesSettings);
        getHighSpeedVideoSizes(37, magnesSettings);
        getHighSpeedVideoSizes(38, magnesSettings);
        getHighSpeedVideoSizes(63, magnesSettings);
        getHighSpeedVideoSizes(47, magnesSettings);
        getHighSpeedVideoSizes(52, magnesSettings);
        getHighSpeedVideoSizes(88, magnesSettings);
        lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes = false;
        if (getHighSpeedVideoFpsRanges(dVar, magnesSettings.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.o2, magnesSettings.getContext())) {
            getHighSpeedVideoSizes(95, magnesSettings);
            getHighSpeedVideoSizes(90, magnesSettings);
            getHighSpeedVideoSizes(91, magnesSettings);
            getHighSpeedVideoSizes(93, magnesSettings);
            getHighSpeedVideoSizes(94, magnesSettings);
            getHighSpeedVideoSizes(101, magnesSettings);
        }
        return Camera2StreamConfigurationMap();
    }

    private static org.json.JSONArray Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) magnesSettings.getContext().getSystemService("sensor");
            android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            android.hardware.Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
            android.hardware.Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor != null) {
                org.json.JSONObject a2 = lib.android.paypal.com.magnessdk.f.a(defaultSensor);
                a2.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.AC.toString());
                jSONArray.put(a2);
            }
            if (defaultSensor2 != null) {
                org.json.JSONObject a3 = lib.android.paypal.com.magnessdk.f.a(defaultSensor2);
                a3.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.GY.toString());
                jSONArray.put(a3);
            }
            if (defaultSensor3 != null) {
                org.json.JSONObject a4 = lib.android.paypal.com.magnessdk.f.a(defaultSensor3);
                a4.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.MG.toString());
                jSONArray.put(a4);
            }
            return jSONArray;
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
            return null;
        }
    }

    private org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this._CREATION.a(138)) {
                java.lang.String property = java.lang.System.getProperty("os.name");
                java.lang.String property2 = java.lang.System.getProperty(com.datadog.trace.bootstrap.instrumentation.api.Tags.OS_VERSION);
                if (android.text.TextUtils.isEmpty(property)) {
                    property = "";
                }
                if (android.text.TextUtils.isEmpty(property2)) {
                    property2 = "";
                }
                java.lang.String format = java.lang.String.format("%s %s", property, property2);
                if (!android.text.TextUtils.isEmpty(format)) {
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.VERSION.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(format.trim()));
                }
            }
            if (this._CREATION.a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.BOARD.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.BOARD));
            }
            if (this._CREATION.a(140)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.BOOTLOADER.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.BOOTLOADER));
            }
            if (this._CREATION.a(141)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.CPU_ABI1.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.SUPPORTED_ABIS[0]));
            }
            if (this._CREATION.a(142)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.DISPLAY.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.DISPLAY));
            }
            if (this._CREATION.a(143)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.RADIO.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.getRadioVersion()));
            }
            if (this._CREATION.a(144)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.FINGERPRINT.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.FINGERPRINT));
            }
            if (this._CREATION.a(145)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.HARDWARE.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.HARDWARE));
            }
            if (this._CREATION.a(146)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.MANUFACTURER.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.MANUFACTURER));
            }
            if (this._CREATION.a(147)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.PRODUCT.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(android.os.Build.PRODUCT));
            }
            if (this._CREATION.a(148)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.TIME.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(android.os.Build.TIME)));
            }
            if (this._CREATION.a(149)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.f.SYSTEM_TYPE.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.System.getProperty("os.arch")));
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(a.b.c, 0);
        java.lang.String string = sharedPreferences.getString(a.b.c, "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        if (str == null || str.equals(string)) {
            if (!string.equals("")) {
                return string;
            }
            str = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(true);
        }
        edit.putString(a.b.c, str);
        edit.apply();
        return str;
    }

    private org.json.JSONObject getHighSpeedVideoFpsRanges() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this._CREATION.a(112)) {
                android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.b.TOTAL_UD.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(statFs.getBlockSize() * statFs.getBlockCount())));
            }
            if (this._CREATION.a(113)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.b.TOTAL_SD.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(getHighSpeedVideoSizes(601))));
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        return jSONObject;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        try {
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null) {
                this.AMEXKernel = new lib.android.paypal.com.magnessdk.h.a(myLooper);
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
        }
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public final org.json.JSONObject Camera2StreamConfigurationMap() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString(), this.getHighResolutionOutputSizeshNQ4ISI);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.APP_ID.toString(), this.init);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.ANDROID_ID.toString(), this.getHighSpeedVideoFpsRangesFor);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.APP_VERSION.toString(), this.kernelVersion);
            java.lang.String obj = lib.android.paypal.com.magnessdk.c.d.APP_FIRST_INSTALL_TIME.toString();
            long j = this.getValidOutputFormatsForInputhNQ4ISI;
            java.lang.Long l = null;
            jSONObject.put(obj, j == -1 ? null : java.lang.Long.valueOf(j));
            java.lang.String obj2 = lib.android.paypal.com.magnessdk.c.d.APP_LAST_UPDATE_TIME.toString();
            long j2 = this.accessartificialFrame;
            jSONObject.put(obj2, j2 == -1 ? null : java.lang.Long.valueOf(j2));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.CONF_URL.toString(), this.getOutputMinFrameDurationlomOqCM);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.COMP_VERSION.toString(), this.getOutputSizeshNQ4ISI);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.DEVICE_MODEL.toString(), this.exchange);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.DEVICE_NAME.toString(), this.release);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.GSF_ID.toString(), this.getInputFormats);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.IS_EMULATOR.toString(), this.getOutputSizes);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EMULATOR_FLAGS.toString(), this.unwrapAs);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.IS_ROOTED.toString(), this.toString);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.ROOTED_FLAGS.toString(), this.isOutputSupportedForhNQ4ISI);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.OS_TYPE.toString(), "Android");
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.OS_VERSION.toString(), this.Camera2StreamConfigurationMap);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.PAYLOAD_TYPE.toString(), this.getOutputFormats);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SMS_ENABLED.toString(), this.getOutputStallDuration);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.MAC_ADDRS.toString(), this.getHighSpeedVideoSizesFor);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.MAGNES_GUID.toString(), this.coroutineCreation);
            java.lang.String obj3 = lib.android.paypal.com.magnessdk.c.d.MAGNES_SOURCE.toString();
            int i = this.getOutputStallDurationlomOqCM;
            jSONObject.put(obj3, i == 0 ? null : java.lang.Integer.valueOf(i));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.NOTIF_TOKEN.toString(), this.getInputSizeshNQ4ISI);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SOURCE_APP_VERSION.toString(), this.getOutputMinFrameDuration);
            java.lang.String obj4 = lib.android.paypal.com.magnessdk.c.d.TOTAL_STORAGE_SPACE.toString();
            long j3 = this.isOutputSupportedFor;
            if (j3 != -1) {
                l = java.lang.Long.valueOf(j3);
            }
            jSONObject.put(obj4, l);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.NOT_COLLECTIBLE_LIST.toString(), this._BOUNDARY);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SENSOR_METADATA.toString(), this.b);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SCREEN.toString(), this.coroutineBoundary);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.CPU.toString(), this.ArtificialStackFrames);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.DISK.toString(), this.CoroutineDebuggingKt);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.SYSTEM.toString(), this.f6939a);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.USER_AGENT.toString(), this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.d.IN_TREATMENT.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes);
            return jSONObject;
        } catch (org.json.JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
            return jSONObject;
        }
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final void getHighSpeedVideoSizes(int i, lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings) {
        try {
            android.content.Context context = magnesSettings.getContext();
            switch (i) {
                case 1:
                    this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(context, magnesSettings.getAppGuid());
                    break;
                case 2:
                    this.init = context.getPackageName();
                    break;
                case 3:
                    if (this._CREATION.a(i)) {
                        this.kernelVersion = lib.android.paypal.com.magnessdk.f.a(context);
                        break;
                    }
                    break;
                case 8:
                    this.getOutputSizeshNQ4ISI = lib.android.paypal.com.magnessdk.a.z;
                    break;
                case 9:
                    if (this._CREATION.a(i)) {
                        this.getOutputMinFrameDurationlomOqCM = lib.android.paypal.com.magnessdk.c.h.e.REMOTE_CONFIG_URL.toString();
                        break;
                    }
                    break;
                case 14:
                    if (this._CREATION.a(i)) {
                        this.exchange = android.os.Build.MODEL;
                        break;
                    }
                    break;
                case 15:
                    if (this._CREATION.a(i)) {
                        this.release = android.os.Build.DEVICE;
                        break;
                    }
                    break;
                case 32:
                    if (this._CREATION.a(i)) {
                        this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor(context);
                        break;
                    }
                    break;
                case 34:
                    if (this._CREATION.a(i)) {
                        this.getInputSizeshNQ4ISI = magnesSettings.getNotificationToken();
                        break;
                    }
                    break;
                case 37:
                    if (this._CREATION.a(i)) {
                        this.Camera2StreamConfigurationMap = android.os.Build.VERSION.RELEASE;
                        break;
                    }
                    break;
                case 38:
                    if (this._CREATION.a(i)) {
                        this.getOutputFormats = a.b.m;
                        break;
                    }
                    break;
                case 47:
                    if (this._CREATION.a(i)) {
                        this.getOutputStallDuration = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
                        break;
                    }
                    break;
                case 52:
                    if (this._CREATION.a(i)) {
                        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
                        this.isOutputSupportedFor = statFs.getBlockSize() * statFs.getBlockCount();
                        break;
                    }
                    break;
                case 59:
                    if (this._CREATION.a(i)) {
                        this.getOutputSizes = lib.android.paypal.com.magnessdk.h.f.getHighResolutionOutputSizeshNQ4ISI(context);
                        break;
                    }
                    break;
                case 60:
                    if (this._CREATION.a(i)) {
                        this.toString = lib.android.paypal.com.magnessdk.h.g.Camera2StreamConfigurationMap(context);
                        break;
                    }
                    break;
                case 62:
                    if (this._CREATION.a(i)) {
                        this.getOutputStallDurationlomOqCM = magnesSettings.getMagnesSource();
                        break;
                    }
                    break;
                case 63:
                    if (this._CREATION.a(i)) {
                        this.getOutputMinFrameDuration = lib.android.paypal.com.magnessdk.f.a(context);
                        break;
                    }
                    break;
                case 65:
                    if (this._CREATION.a(i)) {
                        this.getValidOutputFormatsForInputhNQ4ISI = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                        break;
                    }
                    break;
                case 66:
                    if (this._CREATION.a(i)) {
                        this.accessartificialFrame = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
                        break;
                    }
                    break;
                case 69:
                    if (this._CREATION.a(i)) {
                        this.getHighSpeedVideoFpsRangesFor = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
                        break;
                    }
                    break;
                case 70:
                    if (this._CREATION.a(i)) {
                        this.getInputFormats = getHighSpeedVideoSizes(context);
                        break;
                    }
                    break;
                case 86:
                    org.json.JSONObject highSpeedVideoFpsRanges = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges(context);
                    this.coroutineCreation = highSpeedVideoFpsRanges;
                    lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges.optString("id");
                    break;
                case 88:
                    if (this._CREATION.n()) {
                        this._BOUNDARY = this._CREATION.i();
                        break;
                    }
                    break;
                case 90:
                    if (this._CREATION.a(i)) {
                        this.ArtificialStackFrames = Camera2StreamConfigurationMap(context);
                        break;
                    }
                    break;
                case 91:
                    if (this._CREATION.a(i)) {
                        this.coroutineBoundary = getHighResolutionOutputSizeshNQ4ISI(context);
                        break;
                    }
                    break;
                case 93:
                    if (this._CREATION.a(i)) {
                        this.CoroutineDebuggingKt = getHighSpeedVideoFpsRanges();
                        break;
                    }
                    break;
                case 94:
                    if (this._CREATION.a(i)) {
                        this.f6939a = getHighResolutionOutputSizeshNQ4ISI();
                        break;
                    }
                    break;
                case 95:
                    if (this._CREATION.a(i)) {
                        this.getARTIFICIAL_FRAME_PACKAGE_NAME = getOutputMinFrameDuration(context);
                        break;
                    }
                    break;
                case 100:
                    if (this._CREATION.a(i)) {
                        this.isOutputSupportedForhNQ4ISI = lib.android.paypal.com.magnessdk.h.g.getHighSpeedVideoFpsRangesFor(context);
                        break;
                    }
                    break;
                case 101:
                    if (this._CREATION.a(i)) {
                        this.b = Camera2StreamConfigurationMap(magnesSettings);
                        break;
                    }
                    break;
                case 103:
                    if (this._CREATION.a(i)) {
                        this.unwrapAs = lib.android.paypal.com.magnessdk.h.f.Camera2StreamConfigurationMap(context);
                        break;
                    }
                    break;
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private org.json.JSONObject getOutputMinFrameDuration(android.content.Context context) {
        java.lang.String a2;
        java.lang.String a3;
        java.lang.Object highSpeedVideoFpsRangesFor;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            a2 = a.c.a(context, a.b.e, a.b.f);
            a3 = a.c.a(context, a.b.e, a.b.g);
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
        }
        if (a2 == null || a2.equals("")) {
            java.lang.String b2 = a.c.b(context, a.b.e);
            if (b2 != null && !b2.equals("")) {
                highSpeedVideoFpsRangesFor = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(b2);
            }
            if (a3 != null || a3.isEmpty() || java.lang.Long.parseLong(a3) + (this._CREATION.l() * 1000) <= java.lang.System.currentTimeMillis()) {
                lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor((java.lang.Runnable) new lib.android.paypal.com.magnessdk.h.d(context));
            }
            if (jSONObject.length() <= 0) {
                return jSONObject;
            }
            return null;
        }
        highSpeedVideoFpsRangesFor = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(a2);
        jSONObject.put("dua", highSpeedVideoFpsRangesFor);
        if (a3 != null) {
        }
        lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor((java.lang.Runnable) new lib.android.paypal.com.magnessdk.h.d(context));
        if (jSONObject.length() <= 0) {
        }
    }

    private org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        int i;
        int i2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        try {
            if (this._CREATION.a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) {
                if (windowManager == null) {
                    i = 12345;
                    i2 = 12345;
                } else if (android.os.Build.VERSION.SDK_INT >= 30) {
                    android.graphics.Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                    i = bounds.width();
                    i2 = bounds.height();
                } else {
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    android.graphics.Point point = new android.graphics.Point();
                    defaultDisplay.getRealSize(point);
                    int i3 = point.x;
                    int i4 = point.y;
                    i = i3;
                    i2 = i4;
                }
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.WIDTH.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(i)));
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.HEIGHT.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(i2)));
            }
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (this._CREATION.a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.DENSITY.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Float.valueOf(displayMetrics.density)));
            }
            if (this._CREATION.a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.DENSITY_DPI.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(displayMetrics.densityDpi)));
            }
            if (this._CREATION.a(125)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.SCALE.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Float.valueOf(displayMetrics.scaledDensity)));
            }
            if (this._CREATION.a(126)) {
                float f2 = displayMetrics.xdpi;
                float f3 = displayMetrics.ydpi;
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.X_DPI.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Float.valueOf(f2)));
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.Y_DPI.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Float.valueOf(f3)));
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        android.net.wifi.WifiInfo connectionInfo = getHighSpeedVideoFpsRangesFor(context, "android.permission.ACCESS_WIFI_STATE") ? ((android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo() : null;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.getMacAddress();
    }

    private java.lang.String getHighSpeedVideoSizes(android.content.Context context) {
        android.net.Uri uri;
        try {
            uri = android.net.Uri.parse("content://com.google.android.gsf.gservices");
        } catch (java.lang.Exception unused) {
            uri = null;
        }
        if (uri != null) {
            try {
                if (getHighSpeedVideoFpsRangesFor(context, "com.google.android.providers.gsf.permission.READ_GSERVICES")) {
                    lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor((java.lang.Runnable) new lib.android.paypal.com.magnessdk.h.b(context, uri));
                }
            } catch (java.lang.Exception e2) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
            }
        }
        try {
            java.lang.String b2 = a.c.b(context, a.b.h);
            if (b2 != null) {
                if (!b2.equals("")) {
                    return b2;
                }
            }
        } catch (java.lang.Exception e3) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e3);
        }
        return null;
    }

    private org.json.JSONObject Camera2StreamConfigurationMap(android.content.Context context) {
        try {
            lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor((java.lang.Runnable) new lib.android.paypal.com.magnessdk.h.c(this._CREATION.a(128), this._CREATION.a(130), this._CREATION.a(129), context));
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e2);
        }
        try {
            java.lang.String b2 = a.c.b(context, a.b.i);
            if (b2 == null || b2.equals("")) {
                return null;
            }
            return new org.json.JSONObject(b2);
        } catch (java.lang.Exception e3) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.h.class, 3, e3);
            return null;
        }
    }

    h() {
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ boolean Camera2StreamConfigurationMap;
        final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ boolean getHighSpeedVideoSizes;

        class a implements java.io.FileFilter {
            @Override // java.io.FileFilter
            public boolean accept(java.io.File file) {
                return java.util.regex.Pattern.matches("cpu[0-9]+", file.getName());
            }

            a() {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(new lib.android.paypal.com.magnessdk.h.c.a());
                if (this.getHighSpeedVideoFpsRanges) {
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.d.a.CORES.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(getHighSpeedVideoFpsRangesFor(listFiles, 3))));
                }
                if (this.Camera2StreamConfigurationMap) {
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.d.a.MAX_FREQUENCY.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(getHighSpeedVideoFpsRangesFor(listFiles, 1))));
                }
                if (this.getHighSpeedVideoSizes) {
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.d.a.MIN_FREQUENCY.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(getHighSpeedVideoFpsRangesFor(listFiles, 2))));
                }
                a.c.b(this.getHighSpeedVideoFpsRangesFor, a.b.i, jSONObject.toString());
                if (lib.android.paypal.com.magnessdk.h.this.AMEXKernel != null) {
                    android.os.Message message = new android.os.Message();
                    message.obj = jSONObject;
                    message.what = lib.android.paypal.com.magnessdk.c.b.e.CORE_CPUINFO_MESSAGE.b();
                    lib.android.paypal.com.magnessdk.h.this.AMEXKernel.sendMessage(message);
                }
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            }
        }

        private static int getHighSpeedVideoFpsRangesFor(java.io.File[] fileArr, int i) {
            int i2;
            if (fileArr != null) {
                if (i == 3) {
                    i2 = fileArr.length;
                } else {
                    int i3 = 0;
                    if (i == 2) {
                        int length = fileArr.length;
                        int i4 = Integer.MAX_VALUE;
                        while (i3 < length) {
                            java.io.File file = fileArr[i3];
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(file.getPath());
                            sb.append("/cpufreq/cpuinfo_min_freq");
                            java.lang.String c = a.c.c(new java.io.File(sb.toString()));
                            if (c != null && !c.equals("-403")) {
                                int parseInt = java.lang.Integer.parseInt(c);
                                if (parseInt < i4) {
                                    i4 = parseInt;
                                }
                                i3++;
                            }
                            i2 = lib.android.paypal.com.magnessdk.g.d;
                            break;
                        }
                        i2 = i4;
                    } else if (i == 1) {
                        for (java.io.File file2 : fileArr) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(file2.getPath());
                            sb2.append("/cpufreq/cpuinfo_max_freq");
                            java.lang.String c2 = a.c.c(new java.io.File(sb2.toString()));
                            if (c2 != null && !c2.equals("-403")) {
                                int parseInt2 = java.lang.Integer.parseInt(c2);
                                if (parseInt2 > i3) {
                                    i3 = parseInt2;
                                }
                            }
                            i2 = lib.android.paypal.com.magnessdk.g.d;
                            break;
                        }
                        i2 = i3;
                    }
                }
                if (i2 != 0 || i2 == Integer.MAX_VALUE) {
                    return 12345;
                }
                return i2;
            }
            i2 = 12345;
            if (i2 != 0) {
            }
            return 12345;
        }

        c(boolean z, boolean z2, boolean z3, android.content.Context context) {
            this.getHighSpeedVideoFpsRanges = z;
            this.Camera2StreamConfigurationMap = z2;
            this.getHighSpeedVideoSizes = z3;
            this.getHighSpeedVideoFpsRangesFor = context;
        }
    }

    class a extends android.os.Handler {
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i = lib.android.paypal.com.magnessdk.h.e.getHighSpeedVideoSizes[lib.android.paypal.com.magnessdk.c.b.e.a(message.what).ordinal()];
            if (i == 1) {
                lib.android.paypal.com.magnessdk.h.this.getARTIFICIAL_FRAME_PACKAGE_NAME = (org.json.JSONObject) message.obj;
            } else if (i == 2) {
                lib.android.paypal.com.magnessdk.h.this.getInputFormats = (java.lang.String) message.obj;
            } else if (i == 3) {
                lib.android.paypal.com.magnessdk.h.this.ArtificialStackFrames = (org.json.JSONObject) message.obj;
            }
            super.handleMessage(message);
        }

        a(android.os.Looper looper) {
            super(looper);
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.net.Uri getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
        
            if (r7 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        
            if (r1 != 0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            java.lang.Exception e;
            java.lang.NumberFormatException e2;
            android.database.Cursor cursor;
            java.lang.String string;
            java.lang.String str = null;
            try {
                try {
                    cursor = this.getHighSpeedVideoFpsRangesFor.getContentResolver().query(this.getHighSpeedVideoSizes, null, null, new java.lang.String[]{a.b.l}, null);
                    if (cursor != 0) {
                        try {
                            if (cursor.moveToFirst() && cursor.getColumnCount() >= 2 && (string = cursor.getString(1)) != null) {
                                str = java.lang.Long.toHexString(java.lang.Long.parseLong(string));
                                a.c.b(this.getHighSpeedVideoFpsRangesFor, a.b.h, str);
                            }
                        } catch (java.lang.NumberFormatException e3) {
                            e2 = e3;
                            str = cursor;
                            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            str = cursor;
                            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
                            if (str != null) {
                                cursor = str;
                                cursor.close();
                            }
                            return;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (cursor != 0) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    if (lib.android.paypal.com.magnessdk.h.this.AMEXKernel != null && str != null) {
                        android.os.Message message = new android.os.Message();
                        message.obj = str;
                        message.what = lib.android.paypal.com.magnessdk.c.b.e.GSFID_MESSAGE.b();
                        lib.android.paypal.com.magnessdk.h.this.AMEXKernel.sendMessage(message);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = str;
                }
            } catch (java.lang.NumberFormatException e5) {
                e2 = e5;
            } catch (java.lang.Exception e6) {
                e = e6;
            }
        }

        b(android.content.Context context, android.net.Uri uri) {
            this.getHighSpeedVideoFpsRangesFor = context;
            this.getHighSpeedVideoSizes = uri;
        }
    }

    class d implements java.lang.Runnable {
        final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.lang.Runnable
        public void run() {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(this.getHighResolutionOutputSizeshNQ4ISI);
                jSONObject.put("dua", lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(defaultUserAgent));
                a.c.a(this.getHighResolutionOutputSizeshNQ4ISI, a.b.e, a.b.f, defaultUserAgent);
                a.c.a(this.getHighResolutionOutputSizeshNQ4ISI, a.b.e, a.b.g, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                if (lib.android.paypal.com.magnessdk.h.this.AMEXKernel != null) {
                    android.os.Message message = new android.os.Message();
                    message.obj = jSONObject;
                    message.what = lib.android.paypal.com.magnessdk.c.b.e.WEBVIEW_MESSAGE.b();
                    lib.android.paypal.com.magnessdk.h.this.AMEXKernel.sendMessage(message);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }

        d(android.content.Context context) {
            this.getHighResolutionOutputSizeshNQ4ISI = context;
        }
    }

    static /* synthetic */ class e {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.k.b.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.k.b.IS_TEST_KEYS_FOUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[lib.android.paypal.com.magnessdk.c.k.b.IS_SU_FOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[lib.android.paypal.com.magnessdk.c.k.b.IS_SUPER_USER_APK_FOUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[lib.android.paypal.com.magnessdk.c.k.b.DETECT_ROOT_MANAGEMENT_APPS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_SU.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_BUSYBOX.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[lib.android.paypal.com.magnessdk.c.k.b.CHECK_FOR_BINARY_MAGISK.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[lib.android.paypal.com.magnessdk.c.b.e.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[lib.android.paypal.com.magnessdk.c.b.e.WEBVIEW_MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoSizes[lib.android.paypal.com.magnessdk.c.b.e.GSFID_MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoSizes[lib.android.paypal.com.magnessdk.c.b.e.CORE_CPUINFO_MESSAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }
}
