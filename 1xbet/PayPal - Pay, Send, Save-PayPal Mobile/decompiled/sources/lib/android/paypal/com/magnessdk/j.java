package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
final class j extends lib.android.paypal.com.magnessdk.g {
    static final java.text.DecimalFormat Camera2StreamConfigurationMap = new java.text.DecimalFormat(".##");
    private java.lang.String AMEXKernel;
    private java.lang.String AMEXKernelCallback;
    private java.util.Locale AMEXKernelJNI;
    private java.util.List<java.lang.String> AMEXKernelProvider;
    private android.os.Handler AMEXKernela;
    private org.json.JSONObject ArtificialStackFrames;
    private boolean BerTlvEncoder;
    private android.location.Location CoroutineDebuggingKt;
    private boolean TransactionOutcomeDecoder;
    private boolean TransactionOutcomeDecoderExternalSyntheticLambda0;
    private boolean TransactionOutcomeDecoderExternalSyntheticLambda1;
    private boolean TransactionOutcomeDecoderExternalSyntheticLambda2;
    private boolean TransactionOutcomeDecoderExternalSyntheticLambda3;
    private boolean TransactionOutcomeDecoderExternalSyntheticLambda4;
    private boolean TransactionOutcomeDecoderExternalSyntheticLambda5;
    private java.util.Map<java.lang.String, java.lang.String> TransactionOutcomeDecoderExternalSyntheticLambda6;
    private org.json.JSONObject _BOUNDARY;
    private org.json.JSONObject _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6940a;
    private java.lang.String accessartificialFrame;
    private boolean apply;
    private android.telephony.TelephonyManager asBinder;
    private java.lang.String b;
    private java.lang.String coroutineBoundary;
    private org.json.JSONObject coroutineCreation;
    private boolean decode;
    private java.lang.String exchange;
    private java.lang.String free;
    private java.lang.String freeTransaction;
    private java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME;
    java.util.concurrent.Future<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    java.util.concurrent.Future<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private android.app.ActivityManager getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private java.lang.String getOutputFormats;
    private android.net.wifi.WifiManager getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private android.os.BatteryManager getOutputSizeshNQ4ISI;
    private android.net.ConnectivityManager getOutputStallDuration;
    private android.location.LocationManager getOutputStallDurationlomOqCM;
    private android.content.pm.PackageManager getValidOutputFormatsForInputhNQ4ISI;
    private org.json.JSONObject init;
    private java.lang.String isOutputSupportedFor;
    private android.os.PowerManager isOutputSupportedForhNQ4ISI;
    private boolean kernelID;
    private java.lang.String kernelVersion;
    private lib.android.paypal.com.magnessdk.e l;
    private java.util.List<java.lang.String> newContext;
    private boolean provide;
    private java.lang.String release;
    private java.util.TimeZone requestGoOnline;
    private java.util.ArrayList<java.net.NetworkInterface> requestPINEntry;
    private android.os.Handler resetTransaction;
    private java.lang.String rsaCipher;
    private java.util.List<java.lang.String> setup;
    private java.lang.String sha1;
    private java.lang.String start;
    private java.lang.String startTransaction;
    private java.lang.String toString;
    private java.lang.String unwrapAs;
    private java.lang.String updateUI;
    private android.net.wifi.WifiInfo valueOf;
    private android.net.NetworkInfo values;
    private java.lang.String version;
    private int TransactionOutcomeDecoderExternalSyntheticLambda7 = -1;
    private long onWarmupCompleted = -1;
    private int getInterfaceVersion = -1;
    private int onExtraCallbackWithResult = -1;
    private int onTransact = -1;
    private int getInputSizeshNQ4ISI = -1;
    private long encode = -1;
    private long aid = -1;
    private long TransactionOutcomeDecodera = -1;
    private int IAuthTabCallback = -1;
    private int onExtraCallback = -1;
    private int onNavigationEvent = -1;
    private int IAuthTabCallbackDefault = -1;

    private java.lang.String getHighSpeedVideoFpsRanges() {
        lib.android.paypal.com.magnessdk.c.b.a aVar;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.net.ConnectivityManager connectivityManager = this.getOutputStallDuration;
            if (connectivityManager != null) {
                android.net.NetworkCapabilities networkCapabilities = this.TransactionOutcomeDecoderExternalSyntheticLambda4 ? connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) : null;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(0)) {
                        aVar = lib.android.paypal.com.magnessdk.c.b.a.MOBILE;
                    } else if (networkCapabilities.hasTransport(1)) {
                        aVar = lib.android.paypal.com.magnessdk.c.b.a.WIFI;
                    } else if (networkCapabilities.hasTransport(3)) {
                        aVar = lib.android.paypal.com.magnessdk.c.b.a.ETHERNET;
                    } else if (networkCapabilities.hasTransport(4)) {
                        aVar = lib.android.paypal.com.magnessdk.c.b.a.VPN;
                    } else if (networkCapabilities.hasTransport(2)) {
                        aVar = lib.android.paypal.com.magnessdk.c.b.a.BLUETOOTH;
                    } else if (networkCapabilities.hasTransport(5)) {
                        aVar = lib.android.paypal.com.magnessdk.c.b.a.WIFI_AWARE;
                    } else if (networkCapabilities.hasTransport(6)) {
                        aVar = lib.android.paypal.com.magnessdk.c.b.a.LOWPAN;
                    }
                    return aVar.toString();
                }
            }
        } else {
            android.net.NetworkInfo networkInfo = this.values;
            if (networkInfo != null) {
                return networkInfo.getTypeName();
            }
        }
        return null;
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.apply ? 1 : 0);
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda1 ? 1 : 0);
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda3 ? 1 : 0);
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda4 ? 1 : 0);
        sb.append(this.TransactionOutcomeDecoderExternalSyntheticLambda0 ? 1 : 0);
        sb.append(this.TransactionOutcomeDecoder ? 1 : 0);
        return sb.toString();
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final org.json.JSONObject getHighSpeedVideoFpsRanges(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, lib.android.paypal.com.magnessdk.d dVar, lib.android.paypal.com.magnessdk.e eVar) {
        return getHighSpeedVideoFpsRanges(magnesSettings, dVar, eVar, this.version, null, null, this.AMEXKernela);
    }

    private org.json.JSONObject Camera2StreamConfigurationMap(android.content.Context context) {
        int i;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.l.a(127)) {
            try {
                i = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            } catch (android.provider.Settings.SettingNotFoundException e2) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
                i = lib.android.paypal.com.magnessdk.g.d;
            }
            try {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.d.EnumC0223d.BRIGHTNESS.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(i)));
            } catch (org.json.JSONException e3) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e3);
            }
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerCT", 0);
        int i = sharedPreferences.getInt("RiskManagerCT", 0);
        try {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            i = (i <= 0 || i >= Integer.MAX_VALUE) ? 1 : i + 1;
            edit.putInt("RiskManagerCT", i);
            edit.apply();
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
        }
        return java.lang.String.valueOf(i);
    }

    private org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            if (this.l.a(119)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.EnumC0224c.FREE_RUNTIME.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(runtime.freeMemory())));
            }
            if (this.l.a(121)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.EnumC0224c.MAX_RUNTIME.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(runtime.maxMemory())));
            }
            if (this.l.a(120)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.EnumC0224c.TOTAL_RUNTIME.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(runtime.totalMemory())));
            }
            android.app.ActivityManager activityManager = this.getHighSpeedVideoSizesFor;
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                if (this.l.a(117)) {
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.e.EnumC0224c.FREE.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(memoryInfo.availMem)));
                }
                if (this.l.a(118)) {
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.e.EnumC0224c.TOTAL.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(memoryInfo.totalMem)));
                }
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        return jSONObject;
    }

    private org.json.JSONObject getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        this.getHighResolutionOutputSizeshNQ4ISI = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor((java.util.concurrent.Callable) new lib.android.paypal.com.magnessdk.j.c(this.l.a(114), context));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this.l.a(116)) {
                android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.b.FREE_UD.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(statFs.getBlockSize() * statFs.getAvailableBlocks())));
            }
            if (this.l.a(115)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.b.FREE_SD.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(getHighSpeedVideoSizes(600))));
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        return jSONObject;
    }

    private static org.json.JSONObject getHighSpeedVideoSizes(android.content.Context context) {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            boolean z = true;
            jSONObject.put(lib.android.paypal.com.magnessdk.c.l.AC.toString(), (sensorManager == null || sensorManager.getDefaultSensor(1) == null) ? false : true);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.l.GY.toString(), (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true);
            java.lang.String obj = lib.android.paypal.com.magnessdk.c.l.MG.toString();
            if (sensorManager == null || sensorManager.getDefaultSensor(2) == null) {
                z = false;
            }
            jSONObject.put(obj, z);
            return jSONObject;
        } catch (org.json.JSONException e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
            return jSONObject;
        }
    }

    final org.json.JSONObject getHighSpeedVideoFpsRanges(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, lib.android.paypal.com.magnessdk.d dVar, lib.android.paypal.com.magnessdk.e eVar, java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap, android.os.Handler handler) {
        android.telephony.TelephonyManager telephonyManager;
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 0, "collecting RiskBlobDynamicData");
        this.l = eVar;
        android.content.Context context = magnesSettings.getContext();
        this.TransactionOutcomeDecoderExternalSyntheticLambda2 = magnesSettings.hasUserLocationConsent();
        this.asBinder = (android.telephony.TelephonyManager) context.getSystemService("phone");
        this.getOutputMinFrameDuration = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.getOutputStallDurationlomOqCM = (android.location.LocationManager) context.getSystemService("location");
        this.getOutputStallDuration = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        int i = android.os.Build.VERSION.SDK_INT;
        this.getOutputSizeshNQ4ISI = (android.os.BatteryManager) context.getSystemService("batterymanager");
        this.isOutputSupportedForhNQ4ISI = (android.os.PowerManager) context.getSystemService("power");
        this.getHighSpeedVideoSizesFor = (android.app.ActivityManager) context.getSystemService("activity");
        this.getValidOutputFormatsForInputhNQ4ISI = context.getPackageManager();
        this.decode = getHighSpeedVideoFpsRangesFor(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean z = true;
        this.apply = getHighSpeedVideoFpsRangesFor(context, "android.permission.ACCESS_COARSE_LOCATION") || this.decode;
        this.TransactionOutcomeDecoderExternalSyntheticLambda0 = getHighSpeedVideoFpsRangesFor(context, "android.permission.READ_EXTERNAL_STORAGE");
        this.TransactionOutcomeDecoder = getHighSpeedVideoFpsRangesFor(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        this.TransactionOutcomeDecoderExternalSyntheticLambda1 = getHighSpeedVideoFpsRangesFor(context, "android.permission.READ_PHONE_STATE");
        this.TransactionOutcomeDecoderExternalSyntheticLambda4 = getHighSpeedVideoFpsRangesFor(context, "android.permission.ACCESS_NETWORK_STATE");
        this.TransactionOutcomeDecoderExternalSyntheticLambda3 = getHighSpeedVideoFpsRangesFor(context, "android.permission.ACCESS_WIFI_STATE");
        this.TransactionOutcomeDecoderExternalSyntheticLambda6 = hashMap;
        this.encode = java.lang.System.currentTimeMillis();
        this.freeTransaction = eVar.f();
        this.getOutputSizes = str2;
        this.version = str;
        this.AMEXKernela = handler;
        if (str2 == null) {
            this.getOutputSizes = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(false);
        }
        getHighSpeedVideoFpsRanges(this.asBinder);
        android.net.wifi.WifiManager wifiManager = this.getOutputMinFrameDuration;
        if (wifiManager != null) {
            this.valueOf = this.TransactionOutcomeDecoderExternalSyntheticLambda3 ? wifiManager.getConnectionInfo() : null;
        }
        android.net.ConnectivityManager connectivityManager = this.getOutputStallDuration;
        if (connectivityManager != null) {
            this.values = this.TransactionOutcomeDecoderExternalSyntheticLambda4 ? connectivityManager.getActiveNetworkInfo() : null;
        }
        if (i >= 29) {
            if (!getHighSpeedVideoFpsRangesFor(context, "android.permission.READ_PRIVILEGED_PHONE_STATE") && ((telephonyManager = this.asBinder) == null || !telephonyManager.hasCarrierPrivileges())) {
                z = false;
            }
            this.kernelID = z;
        }
        this.requestGoOnline = java.util.TimeZone.getDefault();
        this.AMEXKernelJNI = java.util.Locale.getDefault();
        lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes = false;
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dVar, magnesSettings.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.o2, magnesSettings.getContext());
        if (highSpeedVideoFpsRanges) {
            getHighSpeedVideoSizes(93, magnesSettings);
        }
        getHighSpeedVideoSizes(151, magnesSettings);
        getHighSpeedVideoSizes(82, magnesSettings);
        getHighSpeedVideoSizes(81, magnesSettings);
        getHighSpeedVideoSizes(16, magnesSettings);
        getHighSpeedVideoSizes(21, magnesSettings);
        getHighSpeedVideoSizes(75, magnesSettings);
        getHighSpeedVideoSizes(23, magnesSettings);
        getHighSpeedVideoSizes(27, magnesSettings);
        getHighSpeedVideoSizes(28, magnesSettings);
        getHighSpeedVideoSizes(56, magnesSettings);
        getHighSpeedVideoSizes(72, magnesSettings);
        getHighSpeedVideoSizes(42, magnesSettings);
        getHighSpeedVideoSizes(43, magnesSettings);
        getHighSpeedVideoSizes(45, magnesSettings);
        getHighSpeedVideoSizes(53, magnesSettings);
        getHighSpeedVideoSizes(80, magnesSettings);
        getHighSpeedVideoSizes(71, magnesSettings);
        getHighSpeedVideoSizes(4, magnesSettings);
        getHighSpeedVideoSizes(57, magnesSettings);
        getHighSpeedVideoSizes(58, magnesSettings);
        getHighSpeedVideoSizes(6, magnesSettings);
        getHighSpeedVideoSizes(30, magnesSettings);
        getHighSpeedVideoSizes(29, magnesSettings);
        getHighSpeedVideoSizes(13, magnesSettings);
        getHighSpeedVideoSizes(68, magnesSettings);
        getHighSpeedVideoSizes(49, magnesSettings);
        getHighSpeedVideoSizes(84, magnesSettings);
        getHighSpeedVideoSizes(5, magnesSettings);
        getHighSpeedVideoSizes(48, magnesSettings);
        getHighSpeedVideoSizes(11, magnesSettings);
        getHighSpeedVideoSizes(85, magnesSettings);
        getHighSpeedVideoSizes(46, magnesSettings);
        getHighSpeedVideoSizes(79, magnesSettings);
        getHighSpeedVideoSizes(87, magnesSettings);
        getHighSpeedVideoSizes(98, magnesSettings);
        getHighSpeedVideoSizes(99, magnesSettings);
        if (highSpeedVideoFpsRanges) {
            getHighSpeedVideoSizes(89, magnesSettings);
            getHighSpeedVideoSizes(92, magnesSettings);
            getHighSpeedVideoSizes(91, magnesSettings);
        }
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 0, "finishing RiskBlobDynamicData");
        return Camera2StreamConfigurationMap();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) throws java.lang.Exception {
        if (str == null || str.isEmpty()) {
            str = "invalid input in dc method";
        }
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b2 : digest) {
            sb.append(java.lang.Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    private org.json.JSONObject Camera2StreamConfigurationMap(android.content.Context context, android.os.BatteryManager batteryManager, android.os.PowerManager powerManager) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (this.l.a(110)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.a.TEMP.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(registerReceiver != null ? registerReceiver.getIntExtra("temperature", 12345) : 12345)));
            }
            if (this.l.a(111)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.a.VOLTAGE.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(registerReceiver != null ? registerReceiver.getIntExtra("voltage", 12345) : 12345)));
            }
            if (this.l.a(109)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.a.STATE.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(registerReceiver != null ? registerReceiver.getIntExtra("status", 12345) : 12345)));
            }
            if (this.l.a(107)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.a.METHOD.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(registerReceiver != null ? registerReceiver.getIntExtra("plugged", 12345) : 12345)));
            }
            if (this.l.a(106)) {
                double d2 = 12345.0d;
                if (registerReceiver != null) {
                    double intExtra = registerReceiver.getIntExtra("level", 12345);
                    int intExtra2 = registerReceiver.getIntExtra("scale", 12345);
                    d2 = (intExtra == 12345.0d || intExtra2 == 12345) ? intExtra : intExtra / intExtra2;
                }
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.a.LEVEL.toString(), Camera2StreamConfigurationMap.format(lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Double.valueOf(d2))));
            }
            if (this.l.a(105)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.a.CURRENT.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(batteryManager.getIntProperty(2))));
            }
            if (this.l.a(108)) {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.e.a.LOW_POWER.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor(java.lang.Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0)));
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    private void getHighSpeedVideoFpsRanges(android.telephony.TelephonyManager telephonyManager) {
        if (telephonyManager != null) {
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType == 0) {
                this.exchange = "none";
                return;
            }
            java.util.List<android.telephony.CellInfo> list = null;
            try {
                if (phoneType != 1) {
                    if (phoneType != 2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown (");
                        sb.append(telephonyManager.getPhoneType());
                        sb.append(")");
                        this.exchange = sb.toString();
                        return;
                    }
                    this.exchange = "cdma";
                    if (this.TransactionOutcomeDecoderExternalSyntheticLambda2 && this.decode) {
                        list = telephonyManager.getAllCellInfo();
                    }
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    for (android.telephony.CellInfo cellInfo : list) {
                        if (cellInfo instanceof android.telephony.CellInfoCdma) {
                            this.onExtraCallback = ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity().getBasestationId();
                            this.IAuthTabCallbackDefault = ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity().getNetworkId();
                            this.onNavigationEvent = ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity().getSystemId();
                        }
                    }
                    return;
                }
                this.exchange = "gsm";
                if (this.TransactionOutcomeDecoderExternalSyntheticLambda2 && this.decode) {
                    list = telephonyManager.getAllCellInfo();
                }
                if (list == null || list.size() == 0) {
                    return;
                }
                for (android.telephony.CellInfo cellInfo2 : list) {
                    if (cellInfo2 instanceof android.telephony.CellInfoGsm) {
                        this.IAuthTabCallback = ((android.telephony.CellInfoGsm) cellInfo2).getCellIdentity().getLac();
                        this.TransactionOutcomeDecodera = ((android.telephony.CellInfoGsm) cellInfo2).getCellIdentity().getCid();
                    }
                    if (cellInfo2 instanceof android.telephony.CellInfoLte) {
                        this.IAuthTabCallback = ((android.telephony.CellInfoLte) cellInfo2).getCellIdentity().getTac();
                        this.TransactionOutcomeDecodera = ((android.telephony.CellInfoLte) cellInfo2).getCellIdentity().getCi();
                    }
                    if (cellInfo2 instanceof android.telephony.CellInfoWcdma) {
                        this.IAuthTabCallback = ((android.telephony.CellInfoWcdma) cellInfo2).getCellIdentity().getLac();
                        this.TransactionOutcomeDecodera = ((android.telephony.CellInfoWcdma) cellInfo2).getCellIdentity().getCid();
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        if (cellInfo2 instanceof android.telephony.CellInfoTdscdma) {
                            this.IAuthTabCallback = ((android.telephony.CellInfoTdscdma) cellInfo2).getCellIdentity().getLac();
                            this.TransactionOutcomeDecodera = ((android.telephony.CellInfoTdscdma) cellInfo2).getCellIdentity().getCid();
                        }
                        if (cellInfo2 instanceof android.telephony.CellInfoNr) {
                            android.telephony.CellIdentityNr cellIdentityNr = (android.telephony.CellIdentityNr) ((android.telephony.CellInfoNr) cellInfo2).getCellIdentity();
                            this.IAuthTabCallback = cellIdentityNr.getTac();
                            this.TransactionOutcomeDecodera = cellIdentityNr.getNci();
                        }
                    }
                }
            } catch (java.lang.Exception e2) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
            }
        }
    }

    private static android.location.Location getHighSpeedVideoFpsRanges(android.location.LocationManager locationManager) {
        android.location.Location location = null;
        if (locationManager == null) {
            return null;
        }
        try {
            java.util.List<java.lang.String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    return location;
                }
            }
            return location;
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
            return null;
        }
    }

    private java.util.List<java.lang.String> Camera2StreamConfigurationMap(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (this.requestPINEntry == null) {
                this.requestPINEntry = java.util.Collections.list(java.net.NetworkInterface.getNetworkInterfaces());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<java.net.NetworkInterface> it = this.requestPINEntry.iterator();
            while (it.hasNext()) {
                java.util.Enumeration<java.net.InetAddress> inetAddresses = it.next().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    java.net.InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (z || !nextElement.isLinkLocalAddress())) {
                        java.lang.String hostAddress = nextElement.getHostAddress();
                        if (nextElement instanceof java.net.Inet6Address) {
                            arrayList3.add(hostAddress);
                        } else {
                            arrayList2.add(hostAddress);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static java.lang.String getHighSpeedVideoSizes(android.telephony.TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getSimOperatorName();
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
            return null;
        }
    }

    private static org.json.JSONObject getHighSpeedVideoSizes(android.location.Location location) {
        if (location == null) {
            return null;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"lat\":");
            sb.append(location.getLatitude());
            sb.append(",\"lng\":");
            sb.append(location.getLongitude());
            sb.append(",\"acc\":");
            sb.append(location.getAccuracy());
            sb.append(",\"timestamp\":");
            sb.append(location.getTime());
            sb.append("}");
            return new org.json.JSONObject(sb.toString());
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
            return null;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, long j, java.lang.String str3) throws java.lang.Exception {
        java.lang.StringBuilder sb;
        java.lang.String obj;
        java.lang.String obj2;
        if (lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRangesFor(str) && lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRangesFor(str2) && lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(j))) {
            obj = "invalid_input";
        } else {
            if (lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRangesFor(str)) {
                str = "";
            }
            if (lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRangesFor(str2)) {
                str2 = "";
            }
            if (lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(j))) {
                sb = new java.lang.StringBuilder();
                sb.append(str);
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(j);
            }
            sb.append(str2);
            obj = sb.toString();
        }
        java.lang.String highSpeedVideoFpsRanges = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRanges("SG1hY1NIQTI1Ng==");
        if (lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRangesFor(java.lang.Long.valueOf(j))) {
            obj2 = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRanges(str3);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(lib.android.paypal.com.magnessdk.f.getHighSpeedVideoFpsRanges(str3));
            sb2.append(j);
            obj2 = sb2.toString();
        }
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance(highSpeedVideoFpsRanges);
        mac.init(new javax.crypto.spec.SecretKeySpec(obj2.getBytes(), highSpeedVideoFpsRanges));
        byte[] doFinal = mac.doFinal(obj.getBytes());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        for (byte b2 : doFinal) {
            sb3.append(java.lang.Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb3.toString().substring(0, 32);
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final org.json.JSONObject Camera2StreamConfigurationMap() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(lib.android.paypal.com.magnessdk.c.b.f6933a, this.getOutputSizes);
            java.lang.String obj = lib.android.paypal.com.magnessdk.c.e.BASE_STATION_ID.toString();
            int i = this.TransactionOutcomeDecoderExternalSyntheticLambda7;
            java.lang.Integer num = null;
            jSONObject.put(obj, i == -1 ? null : java.lang.Integer.valueOf(i));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.BSSID.toString(), this.getInputFormats);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.BSSID_ARRAY.toString(), this.AMEXKernelProvider == null ? null : new org.json.JSONArray((java.util.Collection) this.AMEXKernelProvider));
            java.lang.String obj2 = lib.android.paypal.com.magnessdk.c.e.CELL_ID.toString();
            long j = this.onWarmupCompleted;
            jSONObject.put(obj2, j == -1 ? null : java.lang.Long.valueOf(j));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.CONN_TYPE.toString(), this.accessartificialFrame);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.CONF_VERSION.toString(), this.freeTransaction);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.IS_DEV_MODE_ON.toString(), this.TransactionOutcomeDecoderExternalSyntheticLambda5);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.DEVICE_ID.toString(), this.f6940a);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.DC_ID.toString(), this.coroutineBoundary);
            java.lang.String obj3 = lib.android.paypal.com.magnessdk.c.e.DEVICE_UPTIME.toString();
            long j2 = this.aid;
            jSONObject.put(obj3, j2 == -1 ? null : java.lang.Long.valueOf(j2));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.IP_ADDRS.toString(), this.getARTIFICIAL_FRAME_PACKAGE_NAME);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.IP_ADDRESSES.toString(), this.setup == null ? null : new org.json.JSONArray((java.util.Collection) this.setup));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.KNOWN_APPS.toString(), this.newContext == null ? null : new org.json.JSONArray((java.util.Collection) this.newContext));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.LOCALE_COUNTRY.toString(), this.AMEXKernel);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.LOCALE_LANG.toString(), this.release);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.LOCATION.toString(), getHighSpeedVideoSizes(this.CoroutineDebuggingKt));
            java.lang.String obj4 = lib.android.paypal.com.magnessdk.c.e.LOCATION_AREA_CODE.toString();
            int i2 = this.getInputSizeshNQ4ISI;
            jSONObject.put(obj4, i2 == -1 ? null : java.lang.Integer.valueOf(i2));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.PHONE_TYPE.toString(), this.exchange);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.RISK_COMP_SESSION_ID.toString(), this.startTransaction);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.ROAMING.toString(), this.BerTlvEncoder);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.SIM_OPERATOR_NAME.toString(), this.rsaCipher);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.SIM_SERIAL_NUMBER.toString(), this.updateUI);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.SSID.toString(), this.AMEXKernelCallback);
            java.lang.String obj5 = lib.android.paypal.com.magnessdk.c.e.CDMA_NETWORK_ID.toString();
            int i3 = this.onTransact;
            jSONObject.put(obj5, i3 == -1 ? null : java.lang.Integer.valueOf(i3));
            java.lang.String obj6 = lib.android.paypal.com.magnessdk.c.e.CDMA_SYSTEM_ID.toString();
            int i4 = this.onExtraCallbackWithResult;
            jSONObject.put(obj6, i4 == -1 ? null : java.lang.Integer.valueOf(i4));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.SUBSCRIBER_ID.toString(), this.free);
            java.lang.String obj7 = lib.android.paypal.com.magnessdk.c.e.TIMESTAMP.toString();
            long j3 = this.encode;
            jSONObject.put(obj7, j3 == -1 ? null : java.lang.Long.valueOf(j3));
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.TZ_NAME.toString(), this.b);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.DS.toString(), this.provide);
            java.lang.String obj8 = lib.android.paypal.com.magnessdk.c.e.TZ.toString();
            int i5 = this.getInterfaceVersion;
            if (i5 != -1) {
                num = java.lang.Integer.valueOf(i5);
            }
            jSONObject.put(obj8, num);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.NETWORK_OPERATOR.toString(), this.getOutputFormats);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.SERIAL_NUMBER.toString(), this.getOutputMinFrameDurationlomOqCM);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.VPN_SETTING.toString(), this.unwrapAs);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.PROXY_SETTING.toString(), this.toString);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.C.toString(), this.isOutputSupportedFor);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.MG_ID.toString(), this.sha1);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.PL.toString(), this.start);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.BATTERY.toString(), this.coroutineCreation);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.MEMORY.toString(), this.ArtificialStackFrames);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.SCREEN.toString(), this._CREATION);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.SR.toString(), this.init);
            try {
                java.util.concurrent.Future<java.lang.String> future = this.getHighSpeedVideoFpsRangesFor;
                if (future != null && future.isDone()) {
                    this.kernelVersion = this.getHighSpeedVideoFpsRangesFor.get(10L, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            } catch (java.lang.Exception e2) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
            }
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.FLOW_NAME.toString(), this.kernelVersion);
            try {
                java.util.concurrent.Future<java.lang.Boolean> future2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (future2 != null && future2.isDone()) {
                    if (this._BOUNDARY == null) {
                        this._BOUNDARY = new org.json.JSONObject();
                    }
                    this._BOUNDARY.put(lib.android.paypal.com.magnessdk.c.e.b.MOUNTED.toString(), this.getHighResolutionOutputSizeshNQ4ISI.get(10L, java.util.concurrent.TimeUnit.MILLISECONDS));
                }
            } catch (java.lang.Exception e3) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e3);
            }
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.DISK.toString(), this._BOUNDARY);
            jSONObject.put(lib.android.paypal.com.magnessdk.c.e.T.toString(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes);
            java.util.Map<java.lang.String, java.lang.String> map = this.TransactionOutcomeDecoderExternalSyntheticLambda6;
            if (map != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    try {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    } catch (java.lang.Exception e4) {
                        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e4);
                    }
                }
            }
            return jSONObject;
        } catch (java.lang.Exception e5) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e5);
            return jSONObject;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:330:0x038e, code lost:
    
        if (r8 != null) goto L279;
     */
    @Override // lib.android.paypal.com.magnessdk.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoSizes(int i, lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings) {
        android.net.wifi.WifiInfo wifiInfo;
        android.telephony.TelephonyManager telephonyManager;
        android.telephony.TelephonyManager telephonyManager2;
        android.telephony.TelephonyManager telephonyManager3;
        java.lang.String meid;
        try {
            try {
                android.content.Context context = magnesSettings.getContext();
                if (i == 4) {
                    if (this.l.a(i)) {
                        this.TransactionOutcomeDecoderExternalSyntheticLambda7 = this.onExtraCallback;
                        return;
                    }
                    return;
                }
                java.lang.String str = null;
                r4 = null;
                android.location.Location location = null;
                java.lang.String str2 = null;
                r4 = null;
                java.util.ArrayList<java.lang.String> arrayList = null;
                r4 = null;
                r4 = null;
                r4 = null;
                java.lang.String str3 = null;
                java.lang.String highSpeedVideoSizes = null;
                str = null;
                str = null;
                str = null;
                if (i != 5) {
                    if (i == 6) {
                        if (this.l.a(i)) {
                            this.onWarmupCompleted = this.TransactionOutcomeDecodera;
                            return;
                        }
                        return;
                    }
                    boolean z = true;
                    if (i == 42) {
                        if (this.l.a(i)) {
                            this.startTransaction = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(true);
                            return;
                        }
                        return;
                    }
                    if (i == 43) {
                        if (this.l.a(i)) {
                            this.BerTlvEncoder = new android.telephony.ServiceState().getRoaming();
                            return;
                        }
                        return;
                    }
                    if (i == 45) {
                        if (this.l.a(i)) {
                            android.telephony.TelephonyManager telephonyManager4 = this.asBinder;
                            if (telephonyManager4 != null) {
                                highSpeedVideoSizes = getHighSpeedVideoSizes(telephonyManager4);
                            }
                            this.rsaCipher = highSpeedVideoSizes;
                            return;
                        }
                        return;
                    }
                    if (i == 46) {
                        if (this.l.a(i) && this.TransactionOutcomeDecoderExternalSyntheticLambda1 && (telephonyManager = this.asBinder) != null) {
                            if (android.os.Build.VERSION.SDK_INT < 29 || this.kernelID) {
                                this.updateUI = telephonyManager.getSimSerialNumber();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i == 48) {
                        if (this.l.a(i)) {
                            if (android.os.Build.VERSION.SDK_INT >= 27) {
                                if (this.TransactionOutcomeDecoderExternalSyntheticLambda2 && this.apply && (r8 = this.valueOf) != null) {
                                    str3 = r8.getSSID();
                                }
                                this.AMEXKernelCallback = str3;
                                return;
                            }
                            android.net.wifi.WifiInfo wifiInfo2 = this.valueOf;
                            if (wifiInfo2 == null) {
                                this.AMEXKernelCallback = str3;
                                return;
                            }
                            str3 = wifiInfo2.getSSID();
                            this.AMEXKernelCallback = str3;
                            return;
                        }
                        return;
                    }
                    if (i == 49) {
                        if (this.l.a(i) && this.TransactionOutcomeDecoderExternalSyntheticLambda1 && (telephonyManager2 = this.asBinder) != null) {
                            if (android.os.Build.VERSION.SDK_INT < 29 || this.kernelID) {
                                this.free = telephonyManager2.getSubscriberId();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i == 71) {
                        if (this.l.a(i)) {
                            this.unwrapAs = getInputFormats();
                            return;
                        }
                        return;
                    }
                    if (i == 72) {
                        if (this.l.a(i)) {
                            this.toString = getHighSpeedVideoSizes();
                            return;
                        }
                        return;
                    }
                    if (i == 84) {
                        if (this.l.a(i)) {
                            if (this.TransactionOutcomeDecoderExternalSyntheticLambda2 && this.decode) {
                                arrayList = getHighSpeedVideoSizesFor();
                            }
                            this.AMEXKernelProvider = arrayList;
                            return;
                        }
                        return;
                    }
                    if (i == 85) {
                        this.sha1 = getHighSpeedVideoSizes(this.version, this.getOutputSizes, this.encode, this.l.h());
                        return;
                    }
                    switch (i) {
                        case 11:
                            if (this.l.a(i)) {
                                this.accessartificialFrame = getHighSpeedVideoFpsRanges();
                                break;
                            }
                            break;
                        case 13:
                            if (this.l.a(i) && this.TransactionOutcomeDecoderExternalSyntheticLambda1 && (telephonyManager3 = this.asBinder) != null) {
                                if (android.os.Build.VERSION.SDK_INT < 29 || this.kernelID) {
                                    if (telephonyManager3.getPhoneType() == 1) {
                                        meid = this.asBinder.getImei();
                                    } else if (this.asBinder.getPhoneType() == 2) {
                                        meid = this.asBinder.getMeid();
                                    }
                                    this.f6940a = meid;
                                    break;
                                }
                            }
                            break;
                        case 16:
                            if (this.l.a(i)) {
                                this.aid = android.os.SystemClock.uptimeMillis();
                                break;
                            }
                            break;
                        case 21:
                            if (this.l.a(i)) {
                                java.util.List<java.lang.String> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(false);
                                if (Camera2StreamConfigurationMap2 != null) {
                                    str2 = Camera2StreamConfigurationMap2.get(0);
                                }
                                this.getARTIFICIAL_FRAME_PACKAGE_NAME = str2;
                                break;
                            }
                            break;
                        case 23:
                            if (this.l.a(i)) {
                                try {
                                    lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor((java.lang.Runnable) new lib.android.paypal.com.magnessdk.j.b());
                                    break;
                                } catch (java.lang.Exception e2) {
                                    lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
                                    return;
                                }
                            }
                            break;
                        case 27:
                            if (this.l.a(i)) {
                                this.AMEXKernel = this.AMEXKernelJNI.getCountry();
                                break;
                            }
                            break;
                        case 28:
                            if (this.l.a(i)) {
                                this.release = this.AMEXKernelJNI.getLanguage();
                                break;
                            }
                            break;
                        case 29:
                            if (this.l.a(i)) {
                                if (this.TransactionOutcomeDecoderExternalSyntheticLambda2 && this.apply) {
                                    location = getHighSpeedVideoFpsRanges(this.getOutputStallDurationlomOqCM);
                                }
                                this.CoroutineDebuggingKt = location;
                                break;
                            }
                            break;
                        case 30:
                            if (this.l.a(i)) {
                                this.getInputSizeshNQ4ISI = this.IAuthTabCallback;
                                break;
                            }
                            break;
                        case 53:
                            if (this.l.a(i)) {
                                java.util.TimeZone timeZone = this.requestGoOnline;
                                this.b = timeZone.getDisplayName(timeZone.inDaylightTime(new java.util.Date()), 1, java.util.Locale.ENGLISH);
                                break;
                            }
                            break;
                        case 68:
                            if (this.l.a(i) && this.TransactionOutcomeDecoderExternalSyntheticLambda1 && this.asBinder != null) {
                                if (android.os.Build.VERSION.SDK_INT < 29 || this.kernelID) {
                                    this.getOutputMinFrameDurationlomOqCM = android.os.Build.getSerial();
                                    break;
                                }
                            }
                            break;
                        case 75:
                            if (this.l.a(i)) {
                                this.setup = Camera2StreamConfigurationMap(true);
                                break;
                            }
                            break;
                        case 87:
                            this.start = getHighSpeedVideoFpsRangesFor();
                            break;
                        case 89:
                            if (this.l.a(i)) {
                                this.coroutineCreation = Camera2StreamConfigurationMap(context, this.getOutputSizeshNQ4ISI, this.isOutputSupportedForhNQ4ISI);
                                break;
                            }
                            break;
                        case 98:
                            if (this.l.a(i)) {
                                this.init = getHighSpeedVideoSizes(context);
                                break;
                            }
                            break;
                        case 99:
                            if (this.l.a(i)) {
                                if (android.provider.Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                    z = false;
                                }
                                this.TransactionOutcomeDecoderExternalSyntheticLambda5 = z;
                                break;
                            }
                            break;
                        case 151:
                            if (this.l.a(i)) {
                                this.kernelVersion = lib.android.paypal.com.magnessdk.c.b.j;
                                this.getHighSpeedVideoFpsRangesFor = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRangesFor((java.util.concurrent.Callable) new lib.android.paypal.com.magnessdk.j.a());
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 56:
                                    if (this.l.a(i)) {
                                        android.telephony.TelephonyManager telephonyManager5 = this.asBinder;
                                        this.getOutputFormats = telephonyManager5 != null ? telephonyManager5.getNetworkOperator() : null;
                                        break;
                                    }
                                    break;
                                case 57:
                                    if (this.l.a(i)) {
                                        this.onTransact = this.IAuthTabCallbackDefault;
                                        break;
                                    }
                                    break;
                                case 58:
                                    if (this.l.a(i)) {
                                        this.onExtraCallbackWithResult = this.onNavigationEvent;
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 79:
                                            if (this.l.a(i)) {
                                                this.provide = this.requestGoOnline.inDaylightTime(new java.util.Date());
                                                break;
                                            }
                                            break;
                                        case 80:
                                            if (this.l.a(i)) {
                                                this.getInterfaceVersion = this.requestGoOnline.getOffset(new java.util.Date().getTime());
                                                break;
                                            }
                                            break;
                                        case 81:
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(this.version);
                                            sb.append(this.encode);
                                            this.coroutineBoundary = getHighSpeedVideoFpsRanges(sb.toString());
                                            break;
                                        case 82:
                                            if (this.l.a(i) && lib.android.paypal.com.magnessdk.MagnesSDK.getInstance().Camera2StreamConfigurationMap.getMagnesSource() == 10) {
                                                this.isOutputSupportedFor = getHighResolutionOutputSizeshNQ4ISI(context);
                                                break;
                                            }
                                            break;
                                        default:
                                            switch (i) {
                                                case 91:
                                                    if (this.l.a(i)) {
                                                        this._CREATION = Camera2StreamConfigurationMap(context);
                                                        break;
                                                    }
                                                    break;
                                                case 92:
                                                    if (this.l.a(i)) {
                                                        this.ArtificialStackFrames = getHighResolutionOutputSizeshNQ4ISI();
                                                        break;
                                                    }
                                                    break;
                                                case 93:
                                                    if (this.l.a(i)) {
                                                        this._BOUNDARY = getHighSpeedVideoFpsRangesFor(context);
                                                        break;
                                                    }
                                                    break;
                                            }
                                    }
                            }
                    }
                    return;
                }
                if (!this.l.a(i)) {
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 27) {
                    if (this.TransactionOutcomeDecoderExternalSyntheticLambda2 && this.apply && (wifiInfo = this.valueOf) != null) {
                        str = wifiInfo.getBSSID();
                    }
                    this.getInputFormats = str;
                    return;
                }
                wifiInfo = this.valueOf;
            } catch (java.lang.Exception e3) {
                e = e3;
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e);
            }
        } catch (java.lang.AssertionError e4) {
            e = e4;
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e);
        }
    }

    class a implements java.util.concurrent.Callable<java.lang.String> {
        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.lang.String call() throws java.lang.Exception {
            java.util.List<android.app.ActivityManager.AppTask> appTasks;
            android.app.ActivityManager.AppTask appTask;
            android.app.ActivityManager.RecentTaskInfo taskInfo;
            android.content.ComponentName componentName;
            android.app.ActivityManager activityManager = lib.android.paypal.com.magnessdk.j.this.getHighSpeedVideoSizesFor;
            if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null || appTasks.isEmpty() || (appTask = appTasks.get(0)) == null || (taskInfo = appTask.getTaskInfo()) == null || (componentName = taskInfo.topActivity) == null) {
                return null;
            }
            java.lang.String className = componentName.getClassName();
            return (className == null || className.isEmpty()) ? className : lib.android.paypal.com.magnessdk.f.getHighResolutionOutputSizeshNQ4ISI(className).replace(lib.android.paypal.com.magnessdk.c.b.i, "");
        }

        a() {
        }
    }

    j() {
        try {
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null) {
                this.resetTransaction = new lib.android.paypal.com.magnessdk.j.d(myLooper);
            }
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
        }
    }

    private java.util.ArrayList<java.lang.String> getHighSpeedVideoSizesFor() {
        java.lang.String bssid;
        int i;
        if (this.getOutputMinFrameDuration == null) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.List<android.net.wifi.ScanResult> scanResults = this.getOutputMinFrameDuration.getScanResults();
        if (scanResults == null || scanResults.size() == 0 || (bssid = this.valueOf.getBSSID()) == null || bssid.equals("00:00:00:00:00:00")) {
            return null;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < scanResults.size(); i4++) {
            if (!bssid.equals(scanResults.get(i4).BSSID) && i2 < (i = scanResults.get(i4).level)) {
                i3 = i4;
                i2 = i;
            }
        }
        arrayList.add(bssid);
        if (i3 != -1) {
            arrayList.add(scanResults.get(i3).BSSID);
        }
        return arrayList;
    }

    private java.lang.String getInputFormats() {
        try {
            if (this.requestPINEntry == null) {
                this.requestPINEntry = java.util.Collections.list(java.net.NetworkInterface.getNetworkInterfaces());
            }
            java.util.Iterator<java.net.NetworkInterface> it = this.requestPINEntry.iterator();
            while (it.hasNext()) {
                java.net.NetworkInterface next = it.next();
                if (next.isUp() && !next.getInterfaceAddresses().isEmpty()) {
                    java.lang.String name2 = next.getName();
                    java.lang.String[] strArr = {"ppp", "tun", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_TAP, "ipsec", "utun"};
                    for (int i = 0; i < 5; i++) {
                        if (name2.toLowerCase().startsWith(strArr[i])) {
                            return name2;
                        }
                    }
                }
            }
            return null;
        } catch (java.lang.Exception e2) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.j.class, 3, e2);
            return null;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes() {
        java.lang.String property;
        java.lang.String property2 = java.lang.System.getProperty("http.proxyHost");
        if (property2 == null || (property = java.lang.System.getProperty("http.proxyPort")) == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("host=");
        sb.append(property2);
        sb.append(",port=");
        sb.append(property);
        return sb.toString();
    }

    class b implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
            try {
                for (java.lang.String str : lib.android.paypal.com.magnessdk.j.this.l.e()) {
                    if (a.d.a(lib.android.paypal.com.magnessdk.j.this.getValidOutputFormatsForInputhNQ4ISI, new android.content.Intent().setComponent(android.content.ComponentName.unflattenFromString(str)))) {
                        synchronizedList.add(str);
                    }
                }
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            }
            if (lib.android.paypal.com.magnessdk.j.this.resetTransaction == null || synchronizedList.size() <= 0) {
                return;
            }
            android.os.Message message = new android.os.Message();
            message.obj = synchronizedList;
            message.what = lib.android.paypal.com.magnessdk.c.b.e.KNOWNAPPS_MESSAGE.b();
            lib.android.paypal.com.magnessdk.j.this.resetTransaction.sendMessage(message);
        }

        b() {
        }
    }

    class c implements java.util.concurrent.Callable<java.lang.Boolean> {
        final /* synthetic */ boolean Camera2StreamConfigurationMap;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean call() throws java.lang.Exception {
            try {
                if (!this.Camera2StreamConfigurationMap) {
                    return null;
                }
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(android.os.Environment.getExternalStorageState().equals("mounted"));
                java.io.File[] externalFilesDirs = this.getHighSpeedVideoFpsRangesFor.getExternalFilesDirs("");
                if (externalFilesDirs != null) {
                    boolean z = true;
                    if (externalFilesDirs.length > 1 && externalFilesDirs[0] != null && externalFilesDirs[1] != null) {
                        if (!valueOf.booleanValue() || !android.os.Environment.isExternalStorageRemovable(externalFilesDirs[1])) {
                            z = false;
                        }
                        return java.lang.Boolean.valueOf(z);
                    }
                }
                return java.lang.Boolean.FALSE;
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
                return null;
            }
        }

        c(boolean z, android.content.Context context) {
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoFpsRangesFor = context;
        }
    }

    class d extends android.os.Handler {
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (lib.android.paypal.com.magnessdk.j.e.getHighSpeedVideoFpsRangesFor[lib.android.paypal.com.magnessdk.c.b.e.a(message.what).ordinal()] == 1) {
                java.util.List list = (java.util.List) message.obj;
                lib.android.paypal.com.magnessdk.j jVar = lib.android.paypal.com.magnessdk.j.this;
                if (list.isEmpty()) {
                    list = null;
                }
                jVar.newContext = list;
            }
            super.handleMessage(message);
        }

        d(android.os.Looper looper) {
            super(looper);
        }
    }

    static /* synthetic */ class e {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.b.e.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.b.e.KNOWNAPPS_MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }
}
