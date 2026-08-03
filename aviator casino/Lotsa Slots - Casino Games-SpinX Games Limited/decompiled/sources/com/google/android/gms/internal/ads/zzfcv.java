package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfcv implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzeeb zzc;
    private final java.lang.String zzd;

    zzfcv(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context, com.google.android.gms.internal.ads.zzeeb zzeebVar, java.lang.String str) {
        this.zza = zzhcgVar;
        this.zzb = context;
        this.zzc = zzeebVar;
        this.zzd = str;
    }

    private static android.content.pm.ResolveInfo zzd(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfcv.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(3:3|(2:6|4)|7)|8|(3:67|68|(22:70|71|11|12|13|(16:15|16|(1:18)(3:58|(1:60)|61)|19|(1:21)(2:46|(3:49|(3:52|(2:55|56)(1:54)|50)|57))|22|23|(2:25|(8:27|28|(2:30|(1:32)(1:43))(1:44)|33|(1:35)(1:42)|(1:37)(1:41)|38|39))|45|28|(0)(0)|33|(0)(0)|(0)(0)|38|39)|63|16|(0)(0)|19|(0)(0)|22|23|(0)|45|28|(0)(0)|33|(0)(0)|(0)(0)|38|39))|10|11|12|13|(0)|63|16|(0)(0)|19|(0)(0)|22|23|(0)|45|28|(0)(0)|33|(0)(0)|(0)(0)|38|39) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d9, blocks: (B:13:0x00a1, B:15:0x00af), top: B:12:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzfct zzc() {
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.PackageInfo packageInfo;
        java.lang.String sb;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        boolean equals;
        boolean z;
        android.content.pm.PackageInfo packageInfo2;
        android.content.Context context = this.zzb;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.Locale locale = java.util.Locale.getDefault();
        android.content.pm.ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        android.content.pm.ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        java.lang.String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        boolean zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        boolean isLatchsky = com.google.android.gms.common.util.DeviceProperties.isLatchsky(context);
        boolean isSidewinder = com.google.android.gms.common.util.DeviceProperties.isSidewinder(context);
        java.lang.String language = locale.getLanguage();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.os.LocaleList localeList = android.os.LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        android.content.pm.ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd3 != null && (activityInfo = zzd3.activityInfo) != null) {
            try {
                packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                int i2 = packageInfo.versionCode;
                java.lang.String str5 = activityInfo.packageName;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 1 + java.lang.String.valueOf(str5).length());
                sb2.append(i2);
                sb2.append(".");
                sb2.append(str5);
                sb = sb2.toString();
                packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    int i3 = packageInfo2.versionCode;
                    java.lang.String str6 = packageInfo2.packageName;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 1 + java.lang.String.valueOf(str6).length());
                    sb3.append(i3);
                    sb3.append(".");
                    sb3.append(str6);
                    str = sb3.toString();
                    java.lang.String str7 = android.os.Build.FINGERPRINT;
                    java.lang.String language2 = java.util.Locale.getDefault().getLanguage();
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoV)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.zzq zzk = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb);
                        java.lang.String zzb = zzk.zzb();
                        str3 = zzk.zza();
                        str2 = zzb;
                    } else {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoU)).booleanValue()) {
                            language2 = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb).zzb();
                        }
                        str2 = language2;
                        str3 = null;
                    }
                    android.content.Context context2 = this.zzb;
                    if (packageManager == null) {
                        str4 = str7;
                    } else {
                        str4 = str7;
                        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
                        android.content.pm.ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            int i4 = 0;
                            while (i4 < queryIntentActivities.size()) {
                                java.util.List<android.content.pm.ResolveInfo> list = queryIntentActivities;
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i4).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(com.google.android.gms.internal.ads.zzink.zza(context2));
                                    break;
                                }
                                i4++;
                                queryIntentActivities = list;
                            }
                        }
                    }
                    equals = false;
                    com.google.android.gms.ads.internal.zzt.zzc();
                    long availableBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmM)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        if (com.google.android.gms.ads.internal.util.zzs.zzE(context2)) {
                            z = true;
                            return new com.google.android.gms.internal.ads.zzfct(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, android.os.Build.MODEL, availableBytes, z, !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmQ)).booleanValue() ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmS)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context2) : "", android.os.Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
                        }
                    }
                    z = false;
                    return new com.google.android.gms.internal.ads.zzfct(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, android.os.Build.MODEL, availableBytes, z, !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmQ)).booleanValue() ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmS)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context2) : "", android.os.Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
                }
                str = null;
                java.lang.String str72 = android.os.Build.FINGERPRINT;
                java.lang.String language22 = java.util.Locale.getDefault().getLanguage();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoV)).booleanValue()) {
                }
                android.content.Context context22 = this.zzb;
                if (packageManager == null) {
                }
                equals = false;
                com.google.android.gms.ads.internal.zzt.zzc();
                long availableBytes2 = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmM)).booleanValue()) {
                }
                z = false;
                return new com.google.android.gms.internal.ads.zzfct(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, android.os.Build.MODEL, availableBytes2, z, !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmQ)).booleanValue() ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmS)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context22) : "", android.os.Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
            }
        }
        sb = null;
        packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        str = null;
        java.lang.String str722 = android.os.Build.FINGERPRINT;
        java.lang.String language222 = java.util.Locale.getDefault().getLanguage();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoV)).booleanValue()) {
        }
        android.content.Context context222 = this.zzb;
        if (packageManager == null) {
        }
        equals = false;
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes22 = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmM)).booleanValue()) {
        }
        z = false;
        return new com.google.android.gms.internal.ads.zzfct(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, android.os.Build.MODEL, availableBytes22, z, !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmQ)).booleanValue() ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmS)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context222) : "", android.os.Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
    }
}
