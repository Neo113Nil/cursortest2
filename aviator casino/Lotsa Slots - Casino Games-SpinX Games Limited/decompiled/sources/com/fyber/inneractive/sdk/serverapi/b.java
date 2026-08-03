package com.fyber.inneractive.sdk.serverapi;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.serverapi.a f4263a = new com.fyber.inneractive.sdk.serverapi.a();
    public static final java.util.List b = java.util.Arrays.asList("POWER_SAVE_MODE_OPEN", "SmartModeStatus");

    public static java.lang.String a(float f) {
        return f < 5.0f ? "1" : f <= 9.0f ? "2" : f <= 24.0f ? androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D : f <= 39.0f ? "4" : f <= 54.0f ? "5" : f <= 69.0f ? "6" : f <= 84.0f ? com.ironsource.Fc.e : f <= 100.0f ? "8" : "";
    }

    public static java.lang.String b() {
        try {
            if (com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
                return "";
            }
            return a((r1.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) * 100) / r1.getIntExtra("scale", -1));
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static java.lang.Long c() {
        long j;
        com.fyber.inneractive.sdk.config.x0 x0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.w;
        x0Var.getClass();
        try {
            java.lang.String str = "";
            java.lang.String str2 = (java.lang.String) x0Var.d.get("SESSION_STAMP");
            if (!android.text.TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j = java.lang.Long.parseLong(str);
        } catch (java.lang.Exception unused) {
            j = 0;
        }
        return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.convert(android.os.SystemClock.elapsedRealtime() - j, java.util.concurrent.TimeUnit.MILLISECONDS));
    }

    public static java.lang.String d() {
        return java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
    }

    public static java.lang.Long e() {
        try {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.convert(java.util.Calendar.getInstance().getTimeZone().getOffset(java.lang.System.currentTimeMillis()), java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean f() {
        try {
            return java.lang.Boolean.valueOf(android.provider.Settings.System.getInt(com.fyber.inneractive.sdk.util.o.f4302a.getContentResolver(), "airplane_mode_on", 0) != 0);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean g() {
        int i = android.os.Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i >= 34 && com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH_CONNECT");
        if (i < 34 && com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH")) {
            z = true;
        }
        if (!z2 && !z) {
            return null;
        }
        try {
            android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(com.ironsource.T3.d)).getAdapter();
            if (adapter.getProfileConnectionState(1) != 2 && adapter.getProfileConnectionState(2) != 2) {
                return null;
            }
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean h() {
        return java.lang.Boolean.valueOf((com.fyber.inneractive.sdk.util.o.f4302a.getResources().getConfiguration().uiMode & 48) == 32);
    }

    public static java.lang.Boolean i() {
        int intExtra;
        try {
            android.content.Intent registerReceiver = com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = false;
            if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("plugged", -1)) == 1 || intExtra == 2 || intExtra == 4)) {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean j() {
        try {
            android.media.AudioManager audioManager = (android.media.AudioManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService("audio");
            if (audioManager != null) {
                return java.lang.Boolean.valueOf(audioManager.getStreamVolume(3) == 0);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean k() {
        try {
            int ringerMode = ((android.media.AudioManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService("audio")).getRingerMode();
            boolean z = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean l() {
        try {
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
            if (android.os.Build.VERSION.SDK_INT < 23) {
                return null;
            }
            int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
            return java.lang.Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean m() {
        boolean isWiredHeadsetOn;
        try {
            android.media.AudioManager audioManager = (android.media.AudioManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService("audio");
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                isWiredHeadsetOn = false;
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                        isWiredHeadsetOn = true;
                    }
                }
            } else {
                isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
            }
            return java.lang.Boolean.valueOf(isWiredHeadsetOn);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.Boolean n() {
        java.lang.Integer num;
        try {
            java.lang.String upperCase = android.os.Build.MANUFACTURER.toUpperCase(java.util.Locale.getDefault());
            if (android.text.TextUtils.isEmpty(upperCase) || !f4263a.containsKey(upperCase)) {
                return java.lang.Boolean.valueOf(((android.os.PowerManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService("power")).isPowerSaveMode());
            }
            try {
                java.util.Iterator it = b.iterator();
                while (it.hasNext()) {
                    int i = android.provider.Settings.System.getInt(com.fyber.inneractive.sdk.util.o.f4302a.getContentResolver(), (java.lang.String) it.next(), -1);
                    if (i != -1 && (num = (java.lang.Integer) f4263a.get(upperCase)) != null) {
                        return java.lang.Boolean.valueOf(num.intValue() == i);
                    }
                }
                return null;
            } catch (java.lang.Throwable unused) {
                return null;
            }
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public static com.fyber.inneractive.sdk.config.enums.UnitDisplayType a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.r0 r0Var;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        java.util.HashMap hashMap = iAConfigManager.f3582a;
        com.fyber.inneractive.sdk.config.q0 q0Var = (hashMap == null || !hashMap.containsKey(str)) ? null : (com.fyber.inneractive.sdk.config.q0) iAConfigManager.f3582a.get(str);
        if (q0Var == null || q0Var.f3626a.size() <= 0 || (r0Var = (com.fyber.inneractive.sdk.config.r0) q0Var.f3626a.get(0)) == null) {
            return unitDisplayType;
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f;
        com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.c;
        com.fyber.inneractive.sdk.config.p0 p0Var = r0Var.e;
        if (t0Var != null) {
            return t0Var.j;
        }
        if (l0Var != null) {
            return l0Var.b;
        }
        return p0Var != null ? com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE : unitDisplayType;
    }

    public static java.lang.Integer a() {
        java.lang.Integer valueOf = android.os.Build.VERSION.SDK_INT >= 30 ? java.lang.Integer.valueOf(android.os.ext.SdkExtensions.getExtensionVersion(1000000)) : null;
        if (valueOf == null || valueOf.intValue() == 0) {
            return null;
        }
        return valueOf;
    }
}
