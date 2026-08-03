package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgh extends com.google.android.gms.measurement.internal.zzg {
    private java.lang.String zza;
    private java.lang.String zzb;
    private int zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private java.util.List zzi;
    private java.lang.String zzj;
    private int zzk;
    private java.lang.String zzl;
    private java.lang.String zzm;
    private long zzn;
    private java.lang.String zzo;

    zzgh(com.google.android.gms.measurement.internal.zzib zzibVar, long j, long j2) {
        super(zzibVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
        this.zzh = j2;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:3)(6:59|60|(1:62)(2:77|(1:79))|63|64|(16:66|(1:68)(1:75)|69|70|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(3:31|(1:33)(3:40|(3:43|(1:45)(1:46)|41)|47)|(2:35|36)(2:38|39))|48|(0)(0)))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    @Override // com.google.android.gms.measurement.internal.zzg
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzf() {
        java.lang.String str;
        java.lang.String str2;
        android.content.pm.PackageInfo packageInfo;
        int zzC;
        java.util.List zzs;
        java.lang.String zza;
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", java.lang.Long.valueOf(this.zzh), java.lang.Long.valueOf(this.zzg));
        java.lang.String packageName = zzibVar.zzaY().getPackageName();
        android.content.pm.PackageManager packageManager = zzibVar.zzaY().getPackageManager();
        java.lang.String str3 = "";
        int i = Integer.MIN_VALUE;
        java.lang.String str4 = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        java.lang.String str5 = "unknown";
        if (packageManager == null) {
            zzibVar.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgt.zzl(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (java.lang.IllegalArgumentException unused) {
                this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", com.google.android.gms.measurement.internal.zzgt.zzl(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                str = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            if (packageInfo != null) {
                java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !android.text.TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                try {
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", com.google.android.gms.measurement.internal.zzgt.zzl(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
                    zzC = zzibVar2.zzC();
                    if (zzC == 0) {
                    }
                    this.zzl = "";
                    com.google.android.gms.measurement.internal.zzib zzibVar3 = this.zzu;
                    zzibVar3.zzaU();
                    zza = com.google.android.gms.measurement.internal.zzls.zza(zzibVar3.zzaY(), "google_app_id", zzibVar2.zzq());
                    if (!android.text.TextUtils.isEmpty(zza)) {
                    }
                    this.zzl = str3;
                    if (zzC == 0) {
                    }
                    this.zzi = null;
                    com.google.android.gms.measurement.internal.zzib zzibVar4 = this.zzu;
                    zzibVar4.zzaU();
                    zzs = zzibVar4.zzc().zzs("analytics.safelisted_events");
                    if (zzs != null) {
                    }
                    this.zzi = zzs;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                com.google.android.gms.measurement.internal.zzib zzibVar22 = this.zzu;
                zzC = zzibVar22.zzC();
                if (zzC == 0) {
                    this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                } else if (zzC == 1) {
                    this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                } else if (zzC == 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (zzC == 4) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                } else if (zzC == 6) {
                    this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (zzC == 7) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (zzC != 8) {
                    com.google.android.gms.measurement.internal.zzib zzibVar5 = this.zzu;
                    zzibVar5.zzaV().zzi().zza("App measurement disabled");
                    zzibVar5.zzaV().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzl = "";
                com.google.android.gms.measurement.internal.zzib zzibVar32 = this.zzu;
                zzibVar32.zzaU();
                zza = com.google.android.gms.measurement.internal.zzls.zza(zzibVar32.zzaY(), "google_app_id", zzibVar22.zzq());
                if (!android.text.TextUtils.isEmpty(zza)) {
                    str3 = zza;
                }
                this.zzl = str3;
                if (zzC == 0) {
                    zzibVar32.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                }
                this.zzi = null;
                com.google.android.gms.measurement.internal.zzib zzibVar42 = this.zzu;
                zzibVar42.zzaU();
                zzs = zzibVar42.zzc().zzs("analytics.safelisted_events");
                if (zzs != null) {
                    if (zzs.isEmpty()) {
                        zzibVar42.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        java.util.Iterator it = zzs.iterator();
                        while (it.hasNext()) {
                            if (!zzibVar42.zzk().zzk("safelisted event", (java.lang.String) it.next())) {
                                break;
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzk = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(zzibVar42.zzaY()) ? 1 : 0;
                        return;
                    } else {
                        this.zzk = 0;
                        return;
                    }
                }
                this.zzi = zzs;
                if (packageManager == null) {
                }
            }
        }
        str2 = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        com.google.android.gms.measurement.internal.zzib zzibVar222 = this.zzu;
        zzC = zzibVar222.zzC();
        if (zzC == 0) {
        }
        this.zzl = "";
        com.google.android.gms.measurement.internal.zzib zzibVar322 = this.zzu;
        zzibVar322.zzaU();
        zza = com.google.android.gms.measurement.internal.zzls.zza(zzibVar322.zzaY(), "google_app_id", zzibVar222.zzq());
        if (!android.text.TextUtils.isEmpty(zza)) {
        }
        this.zzl = str3;
        if (zzC == 0) {
        }
        this.zzi = null;
        com.google.android.gms.measurement.internal.zzib zzibVar422 = this.zzu;
        zzibVar422.zzaU();
        zzs = zzibVar422.zzc().zzs("analytics.safelisted_events");
        if (zzs != null) {
        }
        this.zzi = zzs;
        if (packageManager == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.measurement.internal.zzr zzh(java.lang.String str) {
        java.lang.Class<?> loadClass;
        java.lang.Object invoke;
        java.lang.String str2;
        long zza;
        java.lang.String str3;
        long min;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        int i;
        boolean z;
        long j;
        long j2;
        java.util.List list;
        java.lang.String str4;
        com.google.android.gms.measurement.internal.zzib zzibVar2;
        int i2;
        long j3;
        android.content.pm.ApplicationInfo applicationInfo;
        long j4;
        zzg();
        java.lang.String zzj = zzj();
        java.lang.String zzk = zzk();
        zzb();
        java.lang.String str5 = this.zzb;
        zzb();
        long j5 = this.zzc;
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd);
        java.lang.String str6 = this.zzd;
        com.google.android.gms.measurement.internal.zzib zzibVar3 = this.zzu;
        zzibVar3.zzc().zzi();
        zzb();
        zzg();
        long j6 = this.zzf;
        if (j6 == 0) {
            com.google.android.gms.measurement.internal.zzpo zzk2 = this.zzu.zzk();
            android.content.Context zzaY = zzibVar3.zzaY();
            java.lang.String packageName = zzibVar3.zzaY().getPackageName();
            zzk2.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaY);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(packageName);
            android.content.pm.PackageManager packageManager = zzaY.getPackageManager();
            java.security.MessageDigest zzO = com.google.android.gms.measurement.internal.zzpo.zzO();
            if (zzO == null) {
                zzk2.zzu.zzaV().zzb().zza("Could not get MD5 instance");
                j6 = -1;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzk2.zzad(zzaY, packageName)) {
                            j4 = 0;
                        } else {
                            com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzaY);
                            com.google.android.gms.measurement.internal.zzib zzibVar4 = zzk2.zzu;
                            android.content.pm.PackageInfo packageInfo = packageManager2.getPackageInfo(zzibVar4.zzaY().getPackageName(), 64);
                            if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                                zzibVar4.zzaV().zze().zza("Could not get signatures");
                                j4 = -1;
                            } else {
                                j4 = com.google.android.gms.measurement.internal.zzpo.zzP(zzO.digest(packageInfo.signatures[0].toByteArray()));
                            }
                        }
                        j6 = j4;
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        zzk2.zzu.zzaV().zzb().zzb("Package name not found", e);
                    }
                }
                j6 = 0;
            }
            this.zzf = j6;
        }
        long j7 = j6;
        com.google.android.gms.measurement.internal.zzib zzibVar5 = this.zzu;
        com.google.android.gms.measurement.internal.zzib zzibVar6 = this.zzu;
        boolean zzB = zzibVar5.zzB();
        boolean z2 = !zzibVar6.zzd().zzm;
        zzg();
        if (zzibVar5.zzB()) {
            com.google.android.gms.internal.measurement.zzrg.zza();
            if (zzibVar6.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaH)) {
                this.zzu.zzaV().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    loadClass = zzibVar6.zzaY().getClassLoader().loadClass(com.unity3d.services.core.fid.Constants.FID_CLASS);
                } catch (java.lang.ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, android.content.Context.class).invoke(null, this.zzu.zzaY());
                    } catch (java.lang.Exception unused2) {
                        this.zzu.zzaV().zzf().zza("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        try {
                            str2 = (java.lang.String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0]);
                        } catch (java.lang.Exception unused3) {
                            this.zzu.zzaV().zzh().zza("Failed to retrieve Firebase Instance Id");
                        }
                        com.google.android.gms.measurement.internal.zzib zzibVar7 = this.zzu;
                        zza = zzibVar7.zzd().zzc.zza();
                        if (zza != 0) {
                            str3 = zzj;
                            min = zzibVar7.zza;
                        } else {
                            str3 = zzj;
                            min = java.lang.Math.min(zzibVar7.zza, zza);
                        }
                        zzb();
                        int i3 = this.zzk;
                        zzibVar = this.zzu;
                        boolean zzu = zzibVar.zzc().zzu();
                        com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
                        zzd.zzg();
                        boolean z3 = zzd.zzd().getBoolean("deferred_analytics_collection", false);
                        if (zzibVar.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == com.google.android.gms.measurement.internal.zzjh.GRANTED) {
                            i = i3;
                            z = true;
                        } else {
                            i = i3;
                            z = false;
                        }
                        long j8 = this.zzg;
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
                        java.util.List list2 = this.zzi;
                        java.lang.String zzl = zzibVar.zzd().zzl().zzl();
                        if (this.zzj == null) {
                            this.zzj = zzibVar.zzk().zzaw();
                        }
                        java.lang.String str7 = this.zzj;
                        if (zzibVar.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                            j2 = j7;
                            j = 0;
                            str4 = null;
                            list = list2;
                        } else {
                            zzg();
                            j = 0;
                            if (this.zzn == 0) {
                                j2 = j7;
                                list = list2;
                            } else {
                                j2 = j7;
                                list = list2;
                                long currentTimeMillis = zzibVar.zzaZ().currentTimeMillis() - this.zzn;
                                if (this.zzm != null && currentTimeMillis > 86400000 && this.zzo == null) {
                                    zzi();
                                }
                            }
                            if (this.zzm == null) {
                                zzi();
                            }
                            str4 = this.zzm;
                        }
                        boolean zzx = zzibVar.zzc().zzx();
                        com.google.android.gms.measurement.internal.zzpo zzk3 = zzibVar.zzk();
                        java.lang.String zzj2 = zzj();
                        zzibVar2 = zzk3.zzu;
                        if (zzibVar2.zzaY().getPackageManager() != null) {
                            j3 = j;
                        } else {
                            try {
                                try {
                                    applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzibVar2.zzaY()).getApplicationInfo(zzj2, 0);
                                } catch (android.content.pm.PackageManager.NameNotFoundException unused4) {
                                    com.google.android.gms.measurement.internal.zzib zzibVar8 = zzk3.zzu;
                                    zzibVar8.zzaU();
                                    zzibVar8.zzaV().zzi().zzb("PackageManager failed to find running app: app_id", zzj2);
                                    i2 = 0;
                                    j3 = i2;
                                    com.google.android.gms.measurement.internal.zzib zzibVar9 = this.zzu;
                                    int zzb = zzibVar9.zzd().zzl().zzb();
                                    java.lang.String zze = zzibVar9.zzd().zzj().zze();
                                    com.google.android.gms.internal.measurement.zzql.zza();
                                    com.google.android.gms.measurement.internal.zzal zzc = zzibVar9.zzc();
                                    com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzaQ;
                                    if (zzc.zzp(null, zzfwVar)) {
                                    }
                                    com.google.android.gms.internal.measurement.zzql.zza();
                                    return new com.google.android.gms.measurement.internal.zzr(str3, zzk, str5, j5, str6, 130000L, j2, str, zzB, z2, str2, min, i, zzu, z3, valueOf, j8, list, zzl, str7, str4, zzx, j3, zzb, zze, r47, zzibVar9.zzc().zzp(null, zzfwVar) ? zzibVar9.zzk().zzV() : j, zzibVar9.zzc().zzz(), new com.google.android.gms.measurement.internal.zze(zzibVar9.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused5) {
                            }
                            if (applicationInfo != null) {
                                i2 = applicationInfo.targetSdkVersion;
                                j3 = i2;
                            }
                            i2 = 0;
                            j3 = i2;
                        }
                        com.google.android.gms.measurement.internal.zzib zzibVar92 = this.zzu;
                        int zzb2 = zzibVar92.zzd().zzl().zzb();
                        java.lang.String zze2 = zzibVar92.zzd().zzj().zze();
                        com.google.android.gms.internal.measurement.zzql.zza();
                        com.google.android.gms.measurement.internal.zzal zzc2 = zzibVar92.zzc();
                        com.google.android.gms.measurement.internal.zzfw zzfwVar2 = com.google.android.gms.measurement.internal.zzfx.zzaQ;
                        int zzU = zzc2.zzp(null, zzfwVar2) ? zzibVar92.zzk().zzU() : 0;
                        com.google.android.gms.internal.measurement.zzql.zza();
                        return new com.google.android.gms.measurement.internal.zzr(str3, zzk, str5, j5, str6, 130000L, j2, str, zzB, z2, str2, min, i, zzu, z3, valueOf, j8, list, zzl, str7, str4, zzx, j3, zzb2, zze2, zzU, zzibVar92.zzc().zzp(null, zzfwVar2) ? zzibVar92.zzk().zzV() : j, zzibVar92.zzc().zzz(), new com.google.android.gms.measurement.internal.zze(zzibVar92.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                    }
                }
            }
        }
        str2 = null;
        com.google.android.gms.measurement.internal.zzib zzibVar72 = this.zzu;
        zza = zzibVar72.zzd().zzc.zza();
        if (zza != 0) {
        }
        zzb();
        int i32 = this.zzk;
        zzibVar = this.zzu;
        boolean zzu2 = zzibVar.zzc().zzu();
        com.google.android.gms.measurement.internal.zzhg zzd2 = zzibVar.zzd();
        zzd2.zzg();
        boolean z32 = zzd2.zzd().getBoolean("deferred_analytics_collection", false);
        if (zzibVar.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == com.google.android.gms.measurement.internal.zzjh.GRANTED) {
        }
        long j82 = this.zzg;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z);
        java.util.List list22 = this.zzi;
        java.lang.String zzl2 = zzibVar.zzd().zzl().zzl();
        if (this.zzj == null) {
        }
        java.lang.String str72 = this.zzj;
        if (zzibVar.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
        }
        boolean zzx2 = zzibVar.zzc().zzx();
        com.google.android.gms.measurement.internal.zzpo zzk32 = zzibVar.zzk();
        java.lang.String zzj22 = zzj();
        zzibVar2 = zzk32.zzu;
        if (zzibVar2.zzaY().getPackageManager() != null) {
        }
        com.google.android.gms.measurement.internal.zzib zzibVar922 = this.zzu;
        int zzb22 = zzibVar922.zzd().zzl().zzb();
        java.lang.String zze22 = zzibVar922.zzd().zzj().zze();
        com.google.android.gms.internal.measurement.zzql.zza();
        com.google.android.gms.measurement.internal.zzal zzc22 = zzibVar922.zzc();
        com.google.android.gms.measurement.internal.zzfw zzfwVar22 = com.google.android.gms.measurement.internal.zzfx.zzaQ;
        if (zzc22.zzp(null, zzfwVar22)) {
        }
        com.google.android.gms.internal.measurement.zzql.zza();
        return new com.google.android.gms.measurement.internal.zzr(str3, zzk, str5, j5, str6, 130000L, j2, str, zzB, z2, str2, min, i, zzu2, z32, valueOf2, j82, list, zzl2, str72, str4, zzx2, j3, zzb22, zze22, zzU, zzibVar922.zzc().zzp(null, zzfwVar22) ? zzibVar922.zzk().zzV() : j, zzibVar922.zzc().zzz(), new com.google.android.gms.measurement.internal.zze(zzibVar922.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
    }

    final void zzi() {
        java.lang.String format;
        zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzibVar.zzk().zzf().nextBytes(bArr);
            format = java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
        } else {
            zzibVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            format = null;
        }
        com.google.android.gms.measurement.internal.zzgr zzj = zzibVar.zzaV().zzj();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = format == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : "not null";
        zzj.zza(java.lang.String.format("Resetting session stitching token to %s", objArr));
        this.zzm = format;
        this.zzn = zzibVar.zzaZ().currentTimeMillis();
    }

    final java.lang.String zzj() {
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final java.lang.String zzk() {
        zzg();
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final java.lang.String zzl() {
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final int zzm() {
        zzb();
        return this.zzc;
    }

    final long zzn() {
        return this.zzh;
    }

    final int zzo() {
        zzb();
        return this.zzk;
    }

    final java.util.List zzp() {
        return this.zzi;
    }

    final boolean zzq(java.lang.String str) {
        java.lang.String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
