package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbzy implements com.google.android.gms.internal.ads.zzcaa {
    public static com.google.android.gms.internal.ads.zzcaa zza;
    static com.google.android.gms.internal.ads.zzcaa zzb;
    static com.google.android.gms.internal.ads.zzcaa zzc;
    static java.lang.Boolean zzd;
    private static final java.lang.Object zze = new java.lang.Object();
    private final java.lang.Object zzf;
    private final android.content.Context zzg;
    private final java.util.WeakHashMap zzh;
    private final java.util.concurrent.ExecutorService zzi;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzj;
    private final android.content.pm.PackageInfo zzk;
    private final java.lang.String zzl;
    private final java.lang.String zzm;
    private final java.util.concurrent.atomic.AtomicBoolean zzn;
    private boolean zzo;
    private java.util.Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzbzy(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        android.content.pm.PackageInfo packageInfo;
        com.google.android.gms.internal.ads.zzbih zzbihVar;
        java.lang.String str;
        this.zzf = new java.lang.Object();
        this.zzh = new java.util.WeakHashMap();
        com.google.android.gms.internal.ads.zzgal.zza();
        this.zzi = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool());
        this.zzn = new java.util.concurrent.atomic.AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = versionInfoParcel;
        java.lang.String str2 = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziV)).booleanValue()) {
            android.os.Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                this.zzk = packageInfo;
                zzbihVar = com.google.android.gms.internal.ads.zzbiq.zziI;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                    str = "unknown";
                } else {
                    android.os.Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    str = java.util.Locale.getDefault().getCountry();
                }
                this.zzl = str;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                    str2 = "unknown";
                } else {
                    android.content.Context context2 = this.zzg;
                    android.os.Handler handler3 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                    if (context2 != null) {
                        try {
                            android.content.pm.PackageInfo packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(context2).getPackageInfo("com.android.vending", 128);
                            if (packageInfo2 != null) {
                                str2 = java.lang.Integer.toString(packageInfo2.versionCode);
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.zzm = str2;
                if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziE)).intValue() <= 0) {
                    this.zzp = new java.util.HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.zzk = packageInfo;
        zzbihVar = com.google.android.gms.internal.ads.zzbiq.zziI;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
        }
        this.zzl = str;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
        }
        this.zzm = str2;
        if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziE)).intValue() <= 0) {
        }
    }

    public static com.google.android.gms.internal.ads.zzcaa zza(android.content.Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzj(context)) {
                    zza = new com.google.android.gms.internal.ads.zzbzy(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage());
                } else {
                    zza = new com.google.android.gms.internal.ads.zzbzz();
                }
            }
        }
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzcaa zzb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzc == null) {
                boolean z = false;
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzc.zze()).booleanValue()) {
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziC)).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zza.zze()).booleanValue()) {
                        z = true;
                    }
                }
                if (zzj(context)) {
                    com.google.android.gms.internal.ads.zzbzy zzbzyVar = new com.google.android.gms.internal.ads.zzbzy(context, versionInfoParcel);
                    zzbzyVar.zzl();
                    zzbzyVar.zzk();
                    zzc = zzbzyVar;
                } else if (!z || context == null) {
                    zzc = new com.google.android.gms.internal.ads.zzbzz();
                } else {
                    com.google.android.gms.internal.ads.zzbzy zzbzyVar2 = new com.google.android.gms.internal.ads.zzbzy(context, versionInfoParcel, true);
                    zzbzyVar2.zzl();
                    zzbzyVar2.zzk();
                    zzc = zzbzyVar2;
                }
            }
        }
        return zzc;
    }

    public static com.google.android.gms.internal.ads.zzcaa zzc(android.content.Context context) {
        synchronized (zze) {
            if (zzb == null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziD)).booleanValue()) {
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziC)).booleanValue() && context != null) {
                        zzb = new com.google.android.gms.internal.ads.zzbzy(context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage());
                    }
                }
                zzb = new com.google.android.gms.internal.ads.zzbzz();
            }
        }
        return zzb;
    }

    public static com.google.android.gms.internal.ads.zzcaa zzd(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzb == null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziD)).booleanValue()) {
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziC)).booleanValue()) {
                        zzb = new com.google.android.gms.internal.ads.zzbzy(context, versionInfoParcel);
                    }
                }
                zzb = new com.google.android.gms.internal.ads.zzbzz();
            }
        }
        return zzb;
    }

    public static java.lang.String zze(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static java.lang.String zzf(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.zzgua.zza(com.google.android.gms.ads.internal.util.client.zzf.zzh(zze(th)));
    }

    private static boolean zzj(android.content.Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            if (zzd == null) {
                zzd = java.lang.Boolean.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoi)).intValue());
            }
        }
        if (zzd.booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziC)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.google.android.gms.internal.ads.zzbzv(this, java.lang.Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        java.lang.Thread thread = android.os.Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, true);
        }
        thread.setUncaughtExceptionHandler(new com.google.android.gms.internal.ads.zzbzw(this, thread.getUncaughtExceptionHandler()));
    }

    protected final void zzg(java.lang.Thread thread, java.lang.Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (java.lang.Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (java.lang.StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziE)).intValue();
            if (intValue > 0) {
                if (this.zzp.size() >= intValue) {
                    return;
                }
                java.lang.String zzf = zzf(th);
                if (this.zzp.contains(zzf)) {
                    return;
                } else {
                    this.zzp.add(zzf);
                }
            }
            if (!z || z2) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzc.zze()).booleanValue()) {
                return;
            }
            com.google.android.gms.internal.ads.zzbib.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzh(java.lang.Throwable th, java.lang.String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzi(java.lang.Throwable th, java.lang.String str, float f) {
        java.lang.Throwable th2;
        java.lang.String str2;
        android.content.pm.PackageInfo packageInfo;
        android.app.ActivityManager.MemoryInfo zze2;
        if (this.zzo) {
            return;
        }
        android.os.Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean z = false;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkz.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                java.lang.Throwable th4 = (java.lang.Throwable) linkedList.pop();
                java.lang.StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z2 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdf)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzq(th4.getClass().getName());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new java.lang.StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        java.lang.String className = stackTraceElement.getClassName();
                        if (!android.text.TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new java.lang.StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new java.lang.Throwable(th4.getMessage()) : new java.lang.Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            java.lang.String name = th.getClass().getName();
            java.lang.String zze3 = zze(th);
            java.lang.String zzf = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkd)).booleanValue() ? zzf(th) : "";
            double d = f;
            double random = java.lang.Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
                try {
                    z = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (java.lang.Throwable th5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching instant app info", th5);
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (java.lang.Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                android.net.Uri.Builder appendQueryParameter = new android.net.Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", java.lang.Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(com.ironsource.M6.F, android.os.Build.VERSION.RELEASE).appendQueryParameter("api", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
                java.lang.String str3 = android.os.Build.MANUFACTURER;
                java.lang.String str4 = android.os.Build.MODEL;
                if (!str4.startsWith(str3)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 1 + java.lang.String.valueOf(str4).length());
                    sb.append(str3);
                    sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
                    sb.append(str4);
                    str4 = sb.toString();
                }
                android.net.Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4);
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzj;
                android.net.Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID, str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze3).appendQueryParameter("eids", android.text.TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zzb().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "885195211").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", java.lang.Integer.toString(i)).appendQueryParameter("pb_tm", java.lang.String.valueOf(com.google.android.gms.internal.ads.zzbkz.zzc.zze()));
                android.content.Context context = this.zzg;
                android.net.Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("gmscv", java.lang.String.valueOf(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!android.text.TextUtils.isEmpty(zzf)) {
                    appendQueryParameter4.appendQueryParameter("hash", zzf);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziJ)).booleanValue() && (zze2 = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    appendQueryParameter4.appendQueryParameter("available_memory", java.lang.Long.toString(zze2.availMem));
                    appendQueryParameter4.appendQueryParameter("total_memory", java.lang.Long.toString(zze2.totalMem));
                    appendQueryParameter4.appendQueryParameter("is_low_memory", true == zze2.lowMemory ? "1" : "0");
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziI)).booleanValue()) {
                    java.lang.String str5 = this.zzl;
                    if (!android.text.TextUtils.isEmpty(str5)) {
                        appendQueryParameter4.appendQueryParameter("countrycode", str5);
                    }
                    java.lang.String str6 = this.zzm;
                    if (!android.text.TextUtils.isEmpty(str6)) {
                        appendQueryParameter4.appendQueryParameter("psv", str6);
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        packageInfo = android.webkit.WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        appendQueryParameter4.appendQueryParameter("wvvc", java.lang.Integer.toString(packageInfo.versionCode));
                        appendQueryParameter4.appendQueryParameter("wvvn", packageInfo.versionName);
                        appendQueryParameter4.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                android.content.pm.PackageInfo packageInfo2 = this.zzk;
                if (packageInfo2 != null) {
                    appendQueryParameter4.appendQueryParameter("appvc", java.lang.String.valueOf(packageInfo2.versionCode));
                    appendQueryParameter4.appendQueryParameter("appvn", packageInfo2.versionName);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmU)).booleanValue()) {
                    appendQueryParameter4.appendQueryParameter("uev", com.google.android.gms.internal.ads.zzgua.zza(com.google.android.gms.ads.internal.util.client.zzf.zzf(this.zzg)));
                }
                arrayList2.add(appendQueryParameter4.toString());
                for (final java.lang.String str7 : arrayList2) {
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(this.zzg, null);
                    this.zzi.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbzx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.util.client.zzu.this.zzc(str7, null);
                        }
                    });
                }
            }
        }
    }

    protected zzbzy(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
