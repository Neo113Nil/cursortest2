package com.inmobi.media;

/* loaded from: classes5.dex */
public final class B5 {
    public static java.lang.String d;
    public static final com.inmobi.media.I1 f;
    public static final com.inmobi.media.I1 g;
    public static final java.lang.String i;
    public static final kotlin.Pair j;
    public static final java.lang.String k;
    public static final java.lang.String l;
    public static final java.lang.String m;
    public static volatile boolean n;
    public static volatile long o;
    public static final kotlin.Lazy p;
    public static final kotlin.Lazy q;
    public static final kotlin.Lazy r;
    public static final org.json.JSONArray s;
    public static final /* synthetic */ kotlin.reflect.KProperty[] b = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.B5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.B5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.B5.class, "asyncNetworkInfo", "getAsyncNetworkInfo()Ljava/lang/String;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.B5 f4614a = new com.inmobi.media.B5();
    public static long c = -1;
    public static final java.lang.String e = "B5";
    public static final com.inmobi.media.I1 h = new com.inmobi.media.I1("", new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.B5.a();
        }
    }, true, true);

    static {
        int i2 = 15;
        f = new com.inmobi.media.I1(i2, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(com.inmobi.media.B5.C());
            }
        }, 12);
        g = new com.inmobi.media.I1(i2, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(com.inmobi.media.B5.c());
            }
        }, 8);
        java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        i = RELEASE;
        int i3 = android.os.Build.VERSION.SDK_INT;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i3);
        j = new kotlin.Pair("d-api-lev", sb.toString());
        java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        k = MANUFACTURER;
        java.lang.String MODEL = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        l = MODEL;
        java.lang.String HARDWARE = android.os.Build.HARDWARE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        m = HARDWARE;
        kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.PUBLICATION;
        p = kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.B5.D();
            }
        });
        q = kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.inmobi.media.B5.d());
            }
        });
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.B5.b();
            }
        });
        r = lazy;
        s = (org.json.JSONArray) lazy.getValue();
    }

    public static boolean A() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean B() {
        return android.os.Build.VERSION.SDK_INT >= 34;
    }

    public static final int C() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        java.lang.Object systemService = context != null ? context.getSystemService("audio") : null;
        android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|9|10|11|(6:13|14|15|(1:17)|18|19)|22|14|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.inmobi.media.C2923z5 D() {
        boolean z;
        java.lang.String str;
        f4614a.getClass();
        try {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context == null) {
                return new com.inmobi.media.C2923z5(null, false);
            }
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager.getApplicationEnabledSetting("com.android.vending") >= 2) {
                z = true;
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
                return new com.inmobi.media.C2923z5(str, z);
            }
            z = false;
            str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
            if (str == null) {
            }
            return new com.inmobi.media.C2923z5(str, z);
        } catch (java.lang.Exception e2) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e2));
            return new com.inmobi.media.C2923z5(null, false);
        }
    }

    public static void E() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.B5.F();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void F() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath());
            android.os.StatFs statFs2 = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (android.os.Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            c = availableBytes / 1048576;
        } catch (java.lang.Exception e2) {
            com.inmobi.media.AbstractC2665p9.a(e2);
        }
    }

    public static void G() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.B5.H();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void H() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.lang.Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        android.app.usage.StorageStatsManager storageStatsManager = (android.app.usage.StorageStatsManager) systemService;
        java.lang.Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (android.os.storage.StorageVolume storageVolume : storageVolumes) {
            try {
                java.util.UUID fromString = java.util.UUID.fromString(java.lang.String.valueOf(storageVolume.getUuid()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(fromString);
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        j2 += storageStatsManager.getFreeBytes(fromString);
                    } catch (java.lang.Exception e2) {
                        com.inmobi.media.M2 m2 = new com.inmobi.media.M2(e2);
                        kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                        com.inmobi.media.W9.a(m2);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        c = j2 / 1048576;
    }

    public static void I() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.B5.J();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void J() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.lang.Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        android.app.usage.StorageStatsManager storageStatsManager = (android.app.usage.StorageStatsManager) systemService;
        java.lang.Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (android.os.storage.StorageVolume storageVolume : storageVolumes) {
            java.util.UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getFreeBytes(storageUuid);
                } catch (java.lang.Exception e2) {
                    com.inmobi.media.M2 m2 = new com.inmobi.media.M2(e2);
                    kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(m2);
                }
            }
        }
        c = j2 / 1048576;
    }

    public static void K() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.B5.L();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void L() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath());
            android.os.StatFs statFs2 = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (android.os.Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(blockCountLong / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            d = sb.toString();
        } catch (java.lang.Exception e2) {
            com.inmobi.media.AbstractC2665p9.a(e2);
        }
    }

    public static void M() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.B5.N();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void N() {
        java.util.UUID uuid;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.lang.Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        android.app.usage.StorageStatsManager storageStatsManager = (android.app.usage.StorageStatsManager) systemService;
        java.lang.Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (android.os.storage.StorageVolume storageVolume : storageVolumes) {
            java.lang.String uuid2 = storageVolume.getUuid();
            if (uuid2 == null) {
                uuid = android.os.storage.StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.Intrinsics.checkNotNull(uuid);
            } else {
                try {
                    uuid = java.util.UUID.fromString(uuid2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(uuid);
                } catch (java.lang.Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getTotalBytes(uuid);
                } catch (java.lang.Exception e2) {
                    com.inmobi.media.M2 m2 = new com.inmobi.media.M2(e2);
                    kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(m2);
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j2 / 1048576);
        d = sb.toString();
    }

    public static void O() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.B5$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.B5.P();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public static final void P() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        java.lang.Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        android.app.usage.StorageStatsManager storageStatsManager = (android.app.usage.StorageStatsManager) systemService;
        java.lang.Object systemService2 = context.getSystemService(com.ironsource.X3.a.k);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long j2 = 0;
        for (android.os.storage.StorageVolume storageVolume : storageVolumes) {
            java.util.UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    j2 += storageStatsManager.getTotalBytes(storageUuid);
                } catch (java.lang.Exception e2) {
                    com.inmobi.media.M2 m2 = new com.inmobi.media.M2(e2);
                    kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(m2);
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(j2 / 1048576);
        d = sb.toString();
    }

    public static final int c() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        java.lang.Object systemService = context != null ? context.getSystemService("audio") : null;
        android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean d() {
        f4614a.getClass();
        try {
            java.lang.String FINGERPRINT = android.os.Build.FINGERPRINT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            java.util.Locale ROOT = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase = FINGERPRINT.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            java.lang.String MODEL = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase2 = MODEL.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase3 = MANUFACTURER.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            java.lang.String BRAND = android.os.Build.BRAND;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase4 = BRAND.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            java.lang.String DEVICE = android.os.Build.DEVICE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase5 = DEVICE.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
            java.lang.String HARDWARE = android.os.Build.HARDWARE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase6 = HARDWARE.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
            java.lang.String PRODUCT = android.os.Build.PRODUCT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            java.lang.String lowerCase7 = PRODUCT.toLowerCase(ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
            if (kotlin.text.StringsKt.startsWith$default(lowerCase, "generic", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "unknown", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) "emu", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) "Android SDK built for x86", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase3, (java.lang.CharSequence) "Genymotion", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase7, (java.lang.CharSequence) "sdk", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase7, (java.lang.CharSequence) "vbox86p", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase7, (java.lang.CharSequence) "emu", false, 2, (java.lang.Object) null) || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase6, "goldfish") || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase6, "ranchu") || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase6, "vbox86p") || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase6, (java.lang.CharSequence) "nox", false, 2, (java.lang.Object) null)) {
                return true;
            }
            if (kotlin.text.StringsKt.startsWith$default(lowerCase4, "generic", false, 2, (java.lang.Object) null)) {
                if (kotlin.text.StringsKt.startsWith$default(lowerCase5, "generic", false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static java.lang.String e() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null || !com.inmobi.media.Sf.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        java.lang.Object systemService = context.getSystemService("connectivity");
        android.net.NetworkInfo networkInfo = null;
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (java.lang.Exception e2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B5", "getSimpleName(...)");
            e2.toString();
        }
        return networkInfo == null ? "" : android.os.Build.VERSION.SDK_INT < 28 ? a(networkInfo) : a(connectivityManager, networkInfo);
    }

    public static kotlin.Pair f() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return null;
        }
        return android.provider.Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new kotlin.Pair("d-airplane-m", "1") : new kotlin.Pair("d-airplane-m", "0");
    }

    public static final java.lang.String g() {
        com.inmobi.media.B5 b5 = f4614a;
        b5.getClass();
        java.lang.String str = (java.lang.String) h.getValue(b5, b[2]);
        return kotlin.text.StringsKt.startsWith$default(str, "0", false, 2, (java.lang.Object) null) ? com.ironsource.M6.R0 : kotlin.text.StringsKt.startsWith$default(str, "1", false, 2, (java.lang.Object) null) ? com.ironsource.T3.b : "NIL";
    }

    public static kotlin.Pair h() {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            I();
        } else if (i2 >= 26) {
            G();
        } else {
            E();
        }
        if (c != -1) {
            return new kotlin.Pair("d-av-disk", java.lang.String.valueOf(c));
        }
        return null;
    }

    public static kotlin.Pair i() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        java.lang.Integer num = null;
        if (context == null) {
            return null;
        }
        if (com.inmobi.media.J3.a(context, (android.content.BroadcastReceiver) null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            num = java.lang.Integer.valueOf((int) ((r0.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(num);
        return new kotlin.Pair("d-bat-lev", sb.toString());
    }

    public static kotlin.Pair j() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return null;
        }
        java.lang.Object systemService = context.getSystemService("power");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).isPowerSaveMode() ? new kotlin.Pair("d-bat-sav", "1") : new kotlin.Pair("d-bat-sav", "0");
    }

    public static kotlin.Pair k() {
        java.lang.String str;
        int i2 = android.content.res.Resources.getSystem().getConfiguration().uiMode & 48;
        if (i2 == 16) {
            str = "0";
        } else {
            if (i2 != 32) {
                return null;
            }
            str = "1";
        }
        return new kotlin.Pair("d-drk-m", str);
    }

    public static kotlin.Pair l() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return null;
        }
        java.lang.Object systemService = context.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            try {
                int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                return new kotlin.Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kotlin.Pair m() {
        java.lang.String language;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return null;
        }
        java.lang.Object systemService = context.getSystemService("input_method");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        java.util.List<android.view.inputmethod.InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enabledInputMethodList, "getEnabledInputMethodList(...)");
        java.util.Iterator<android.view.inputmethod.InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            java.util.List<android.view.inputmethod.InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (android.view.inputmethod.InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(inputMethodSubtype.getMode(), "keyboard")) {
                    if (android.os.Build.VERSION.SDK_INT >= 24) {
                        java.lang.String languageTag = inputMethodSubtype.getLanguageTag();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(languageTag, "getLanguageTag(...)");
                        if (languageTag.length() > 0) {
                            language = java.util.Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(language);
                            if (language.length() <= 0) {
                                arrayList.add(language);
                            }
                        }
                    }
                    language = new java.util.Locale(inputMethodSubtype.getLocale()).getLanguage();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(language);
                    if (language.length() <= 0) {
                    }
                }
            }
        }
        return new kotlin.Pair("d-key-lang", new org.json.JSONArray((java.util.Collection) arrayList).toString());
    }

    public static int n() {
        java.lang.String e2 = e();
        if (kotlin.text.StringsKt.startsWith$default(e2, "0", false, 2, (java.lang.Object) null)) {
            return 0;
        }
        return kotlin.text.StringsKt.startsWith$default(e2, "1", false, 2, (java.lang.Object) null) ? 1 : 2;
    }

    public static final java.lang.String o() {
        f4614a.getClass();
        int n2 = n();
        return n2 != 0 ? n2 != 1 ? "NIL" : com.ironsource.T3.b : com.ironsource.M6.R0;
    }

    public static java.util.HashMap p() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        boolean enabled = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getBts().getEnabled();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (enabled) {
            hashMap.put("d-t1", s.toString());
            return hashMap;
        }
        java.lang.String TAG = e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return hashMap;
    }

    public static kotlin.Pair q() {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            O();
        } else if (i2 >= 26) {
            M();
        } else {
            K();
        }
        java.lang.String str = d;
        if (str != null) {
            return new kotlin.Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean r() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    public static boolean s() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    public static boolean t() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public static boolean u() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    public static boolean v() {
        return android.os.Build.VERSION.SDK_INT >= 36;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    public static boolean z() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public final int a(android.content.Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        com.inmobi.media.I1 i1 = g;
        kotlin.reflect.KProperty[] kPropertyArr = b;
        int intValue = ((java.lang.Number) i1.getValue(this, kPropertyArr[1])).intValue();
        int intValue2 = ((java.lang.Number) f.getValue(this, kPropertyArr[0])).intValue();
        if (intValue2 > 0) {
            return (intValue * 100) / intValue2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B5", "getSimpleName(...)");
        return 0;
    }

    public final java.util.HashMap b(boolean z) {
        int i2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("os-v", i);
        hashMap.put("d-brand-name", android.os.Build.BRAND);
        hashMap.put("d-manufacturer-name", k);
        hashMap.put("d-model-name", l);
        hashMap.put("d-nettype-raw", e());
        java.lang.String locale = java.util.Locale.getDefault().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "toString(...)");
        hashMap.put("d-localization", locale);
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        hashMap.put("d-language", language);
        hashMap.put("d-devicemachinehw", m);
        if (java.lang.System.currentTimeMillis() >= o) {
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
            com.inmobi.media.core.config.models.SignalsConfig signalsConfig = (com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class);
            o = (signalsConfig.getLowMemoryFreq() * 1000) + java.lang.System.currentTimeMillis();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.A5(null), 3, null);
        }
        hashMap.put("d-lowmem", java.lang.String.valueOf(n));
        try {
            i2 = java.lang.Runtime.getRuntime().availableProcessors();
        } catch (java.lang.Exception e2) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e2);
            i2 = 0;
        }
        hashMap.put("d-pcount", java.lang.String.valueOf(i2));
        hashMap.put("d-emu", java.lang.String.valueOf(((java.lang.Boolean) q.getValue()).booleanValue()));
        kotlin.Lazy lazy2 = p;
        hashMap.put("d-ps-disabled", java.lang.String.valueOf(((com.inmobi.media.C2923z5) lazy2.getValue()).f5583a));
        java.lang.String str = ((com.inmobi.media.C2923z5) lazy2.getValue()).b;
        if (str == null) {
            str = "N/A";
        }
        hashMap.put("d-ps-v", str);
        hashMap.put("d-media-volume", java.lang.String.valueOf(a(com.inmobi.media.Xi.f5051a, z)));
        return hashMap;
    }

    public static final java.lang.String a() {
        f4614a.getClass();
        return e();
    }

    public static java.lang.String a(android.net.NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type != 0) {
            if (type != 1) {
                return java.lang.String.valueOf(type);
            }
            return "1";
        }
        return type + "|" + subtype;
    }

    public static java.lang.String a(android.net.ConnectivityManager connectivityManager, android.net.NetworkInfo networkInfo) {
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "0|" + networkInfo.getSubtype();
        }
        if (networkCapabilities.hasTransport(1)) {
            return "1";
        }
        if (networkCapabilities.hasTransport(2)) {
            return com.ironsource.Fc.e;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "9";
        }
        if (networkCapabilities.hasTransport(4)) {
            return "17";
        }
        if (networkCapabilities.hasTransport(5)) {
            return "10";
        }
        return networkCapabilities.hasTransport(6) ? "11" : "8";
    }

    public final java.util.HashMap a(boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.putAll(b(z));
            hashMap.putAll(p());
            return hashMap;
        } catch (java.lang.Exception e2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B5", "getSimpleName(...)");
            e2.getMessage();
            return hashMap;
        }
    }

    public static final org.json.JSONArray b() {
        f4614a.getClass();
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            try {
                com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
                com.inmobi.media.core.config.models.SignalsConfig signalsConfig = (com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "boot_time");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("bt", com.ironsource.X3.i.W);
                org.json.JSONArray jSONArray = new org.json.JSONArray(a2.f4815a.getString("bt", okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                long currentTimeMillis = java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();
                java.lang.Long valueOf = jSONArray.length() > 0 ? java.lang.Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (valueOf != null) {
                    if (java.lang.Math.abs(valueOf.longValue() - currentTimeMillis) <= signalsConfig.getBts().getThreshold() * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(currentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                a2.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (java.lang.Exception e2) {
                kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                com.inmobi.media.AbstractC2665p9.a(e2);
            }
        }
        return new org.json.JSONArray();
    }
}
