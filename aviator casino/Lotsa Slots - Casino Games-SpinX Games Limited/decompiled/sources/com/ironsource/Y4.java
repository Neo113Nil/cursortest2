package com.ironsource;

/* loaded from: classes5.dex */
public class Y4 implements com.ironsource.InterfaceC3362x7, com.ironsource.InterfaceC3362x7.a {
    private static final java.lang.String A = "browser_user_agent";
    private static final java.lang.String B = "browser_user_agent_time";
    private static final java.lang.String C = "IABTCF_gdprApplies";
    private static final java.lang.String D = "IABTCF_TCString";
    private static final java.lang.String E = "IABTCF_AddtlConsent";
    private static final java.lang.String j = "android";
    private static final java.lang.String k = "com.google.android.gms.permission.AD_ID";
    private static final java.lang.String l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final java.lang.String m = "com.google.android.gms.appset.AppSet";
    private static final java.lang.String n = "com.google.android.gms.tasks.OnSuccessListener";
    private static final java.lang.String o = "getAdvertisingIdInfo";
    private static final java.lang.String p = "getClient";
    private static final java.lang.String q = "getAppSetIdInfo";
    private static final java.lang.String r = "addOnSuccessListener";
    private static final java.lang.String s = "getId";
    private static final java.lang.String t = "isLimitAdTrackingEnabled";
    private static final java.lang.String u = "Mediation_Shared_Preferences";
    private static final java.lang.String v = "supersonic_shared_preferen";
    private static final java.lang.String w = "cachedUUID";
    private static final java.lang.String x = "auid";
    private static final java.lang.String y = "unityads-installinfo";
    private static final java.lang.String z = "unityads-idfi";
    private java.lang.String b = null;
    private java.lang.String c = null;
    private java.lang.String d = null;
    private java.lang.String e = "";
    private boolean f = false;
    private java.lang.String g = "";
    private volatile java.lang.String h;
    private volatile java.lang.String i;

    class a implements java.lang.reflect.InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.lang.Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        java.lang.String obj3 = obj2.getClass().getMethod(com.ironsource.Y4.s, null).invoke(objArr[0], null).toString();
                        if (!android.text.TextUtils.isEmpty(obj3)) {
                            com.ironsource.Y4.this.g = obj3;
                        }
                    }
                } catch (java.lang.Exception e) {
                    com.ironsource.C3180n4.d().a(e);
                }
            }
            return null;
        }
    }

    private java.lang.String O(android.content.Context context) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        java.lang.Object Q = Q(context);
        return Q.getClass().getMethod(s, null).invoke(Q, null).toString();
    }

    private void P(android.content.Context context) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        java.lang.Class<?> cls = java.lang.Class.forName(m);
        java.lang.Object invoke = cls.getMethod(p, android.content.Context.class).invoke(cls, context);
        java.lang.Object invoke2 = invoke.getClass().getMethod(q, null).invoke(invoke, null);
        java.lang.Class<?> cls2 = java.lang.Class.forName(n);
        invoke2.getClass().getMethod(r, cls2).invoke(invoke2, java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), new java.lang.Class[]{cls2}, new com.ironsource.Y4.a()));
    }

    private java.lang.Object Q(android.content.Context context) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        java.lang.Class<?> cls = java.lang.Class.forName(l);
        return cls.getMethod(o, android.content.Context.class).invoke(cls, context);
    }

    private java.lang.String R(android.content.Context context) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        java.lang.Object Q = Q(context);
        return java.lang.String.valueOf(((java.lang.Boolean) Q.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(Q, null)).booleanValue());
    }

    private java.lang.String S(android.content.Context context) {
        try {
            return com.ironsource.C3007da.a(context, u, A, "");
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    private long T(android.content.Context context) {
        try {
            return java.lang.Long.parseLong(com.ironsource.C3007da.a(context, u, B, java.lang.String.valueOf(-1L)));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int A(android.content.Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String B(android.content.Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.io.File C(android.content.Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean D(android.content.Context context) {
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int E(android.content.Context context) {
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public float F(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String G(android.content.Context context) {
        try {
            return com.ironsource.C3007da.a(context, E, (java.lang.String) null);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String H(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE)) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.util.List<android.content.pm.ApplicationInfo> I(android.content.Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String J(android.content.Context context) {
        java.lang.String O;
        com.ironsource.V4 v4 = com.ironsource.V4.f6012a;
        if (!v4.b()) {
            return null;
        }
        try {
            if (!v4.a()) {
                O = O(context);
            } else {
                if (this.i == null) {
                    java.lang.String O2 = O(context);
                    if (android.text.TextUtils.isEmpty(O2)) {
                        return O2;
                    }
                    this.i = O2;
                    return O2;
                }
                O = this.i;
            }
            return O;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int L(android.content.Context context) {
        return ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String M(android.content.Context context) {
        try {
            android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveActivity != null) {
                return resolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int N(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return ((android.app.Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public long a() {
        return java.util.Calendar.getInstance(java.util.TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean b(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.Long c(android.app.ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return java.lang.Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String d() {
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int e() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean f(android.content.Context context) {
        try {
            return android.provider.Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.io.File g(android.content.Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.InterfaceC3362x7
    public long h() {
        return a(android.os.Environment.getDataDirectory());
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean i(android.content.Context context) {
        try {
            return android.provider.Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean j() {
        try {
            if ("mounted".equals(android.os.Environment.getExternalStorageState())) {
                return android.os.Environment.isExternalStorageRemovable();
            }
            return false;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int k() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String l() {
        return android.os.Build.MODEL;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int m() {
        return -(java.util.TimeZone.getDefault().getOffset(a()) / 60000);
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String n(android.content.Context context) {
        if (context == null) {
            return "";
        }
        int N = N(context);
        if (N != 0) {
            if (N != 1) {
                if (N != 11) {
                    if (N != 12) {
                        switch (N) {
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

    @Override // com.ironsource.InterfaceC3362x7
    public android.app.ActivityManager.MemoryInfo o(android.content.Context context) {
        if (context == null || !com.ironsource.Jb.Y().h().d()) {
            return null;
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean p() {
        return b("su");
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String q() {
        return android.os.Build.MANUFACTURER;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public long r(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String s(android.content.Context context) {
        return b(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String t() {
        try {
            return java.lang.System.getProperty("os.arch");
        } catch (java.lang.SecurityException e) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int u(android.content.Context context) {
        if (context != null) {
            return android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String v(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE)) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String w(android.content.Context context) {
        try {
            return com.ironsource.C3007da.a(context, "IABTCF_TCString", (java.lang.String) null);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean x(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String y(android.content.Context context) {
        return java.util.Locale.getDefault().toString();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean K(android.content.Context context) {
        try {
            return ((android.os.PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int c() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public synchronized java.lang.String e(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        if (context == null) {
            return "";
        }
        java.lang.String a2 = com.ironsource.C3007da.a(context, "supersonic_shared_preferen", "auid", "");
        this.c = a2;
        if (android.text.TextUtils.isEmpty(a2)) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            this.c = uuid;
            com.ironsource.C3007da.b(context, "supersonic_shared_preferen", "auid", uuid);
        }
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public long g() {
        if (j()) {
            return a(android.os.Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int l(android.content.Context context) {
        try {
            android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.io.File m(android.content.Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int p(android.content.Context context) {
        int L = L(context);
        int A2 = A(context);
        return (((L == 0 || L == 2) && A2 == 2) || ((L == 1 || L == 3) && A2 == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean q(android.content.Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String d(android.content.Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean h(android.content.Context context) {
        try {
            for (java.lang.String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(k)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.io.File k(android.content.Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String z(android.content.Context context) {
        if (com.ironsource.V4.f6012a.c()) {
            try {
                P(context);
                if (!android.text.TextUtils.isEmpty(this.g)) {
                    return this.g;
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
            }
        }
        return "";
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String c(android.content.Context context) {
        java.lang.String R;
        try {
            if (com.ironsource.V4.f6012a.a()) {
                if (this.h == null) {
                    java.lang.String R2 = R(context);
                    if (android.text.TextUtils.isEmpty(R2)) {
                        return R2;
                    }
                    this.h = R2;
                    return R2;
                }
                R = this.h;
            } else {
                R = R(context);
            }
            return R;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int t(android.content.Context context) {
        try {
            return com.ironsource.C3007da.a(context, "IABTCF_gdprApplies", -1);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return -1;
        }
    }

    private long a(java.io.File file) {
        android.os.StatFs statFs = new android.os.StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.Boolean b(android.app.ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String f() {
        return "android";
    }

    @Override // com.ironsource.InterfaceC3362x7
    public float r() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    private boolean b(java.lang.String str) {
        try {
            java.lang.String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new java.io.File(strArr[i] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int o() {
        return k();
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String s() {
        try {
            if (this.e.isEmpty()) {
                return S(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext());
            }
            return this.e;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String i() {
        return android.os.Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.String j(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (context == null) {
            return null;
        }
        java.lang.String a2 = com.ironsource.C3007da.a(context, "unityads-installinfo", "unityads-idfi", (java.lang.String) null);
        this.d = a2;
        return a2;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public java.lang.Long a(android.app.ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return java.lang.Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.InterfaceC3362x7
    public long a(java.lang.String str) {
        return a(new java.io.File(str));
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean a(android.app.Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public synchronized java.lang.String a(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (com.ironsource.C3007da.a(context, u, com.ironsource.InterfaceC3362x7.f6831a, true)) {
            java.lang.String a2 = com.ironsource.C3007da.a(context, u, w, "");
            if (android.text.TextUtils.isEmpty(a2)) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                this.b = uuid;
                com.ironsource.C3007da.b(context, u, w, uuid);
            } else {
                this.b = a2;
            }
        }
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public boolean n() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC3362x7
    public int b() {
        return c();
    }

    private void b(android.content.Context context, long j2) {
        try {
            com.ironsource.C3007da.b(context, u, B, java.lang.String.valueOf(j2));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3362x7.a
    public void a(android.content.Context context, long j2) {
        if (context != null) {
            if (!new com.ironsource.C3228pg(new com.ironsource.InterfaceC3216p4.a()).a(T(context), j2)) {
                this.e = S(context);
                this.f = !r0.isEmpty();
            }
            if (this.e.isEmpty()) {
                try {
                    java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context);
                    this.e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j2 > 0) {
                        b(context, java.lang.System.currentTimeMillis());
                    }
                } catch (java.lang.Exception e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    private void a(android.content.Context context, java.lang.String str) {
        try {
            com.ironsource.C3007da.b(context, u, A, str);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }
}
