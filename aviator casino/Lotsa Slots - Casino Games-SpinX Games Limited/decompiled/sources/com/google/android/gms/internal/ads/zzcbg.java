package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcbg {
    private int zzA;
    private final java.lang.String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private java.lang.String zzo;
    private java.lang.String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final java.lang.String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final java.lang.String zzw;
    private final java.lang.String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad A[Catch: Exception -> 0x00d6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d6, blocks: (B:12:0x009f, B:14:0x00ad), top: B:11:0x009f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcbg(android.content.Context context) {
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.PackageInfo packageInfo;
        java.lang.String sb;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.content.pm.PackageInfo packageInfo2;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        zzb(context);
        zzc(context);
        zzd(context);
        java.util.Locale locale = java.util.Locale.getDefault();
        this.zzq = zze(packageManager, "geo:0,0?q=donuts") != null;
        this.zzr = zze(packageManager, "http://www.google.com") != null;
        this.zzs = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        this.zzt = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        this.zzu = com.google.android.gms.common.util.DeviceProperties.isLatchsky(context);
        this.zzv = com.google.android.gms.common.util.DeviceProperties.isSidewinder(context);
        this.zzw = locale.getLanguage();
        android.content.pm.ResolveInfo zze = zze(packageManager, "market://details?id=com.google.android.gms.ads");
        java.lang.String str = null;
        if (zze != null && (activityInfo = zze.activityInfo) != null) {
            try {
                packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                java.lang.String str2 = activityInfo.packageName;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 1 + java.lang.String.valueOf(str2).length());
                sb2.append(i);
                sb2.append(".");
                sb2.append(str2);
                sb = sb2.toString();
                this.zzx = sb;
                packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    int i2 = packageInfo2.versionCode;
                    java.lang.String str3 = packageInfo2.packageName;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 1 + java.lang.String.valueOf(str3).length());
                    sb3.append(i2);
                    sb3.append(".");
                    sb3.append(str3);
                    str = sb3.toString();
                }
                this.zzB = str;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.zzy = displayMetrics.density;
                    this.zzz = displayMetrics.widthPixels;
                    this.zzA = displayMetrics.heightPixels;
                }
                return;
            }
        }
        sb = null;
        this.zzx = sb;
        packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        this.zzB = str;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.zzy = displayMetrics.density;
        this.zzz = displayMetrics.widthPixels;
        this.zzA = displayMetrics.heightPixels;
    }

    private final void zzb(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(android.content.Context context) {
        int networkType;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.zzg = telephonyManager.getNetworkOperator();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjT)).booleanValue()) {
                networkType = 0;
                this.zzi = networkType;
                this.zzj = telephonyManager.getPhoneType();
                this.zzh = -2;
                this.zzk = false;
                this.zzl = -1;
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return;
                }
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.zzh = activeNetworkInfo.getType();
                    this.zzl = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.zzh = -1;
                }
                this.zzk = connectivityManager.isActiveNetworkMetered();
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.zzi = networkType;
        this.zzj = telephonyManager.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = -1;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }

    private final void zzd(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        android.content.Intent registerReceiver = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmu)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.zzm = registerReceiver.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
            this.zzn = intExtra == 2 || intExtra == 5;
        }
    }

    private static android.content.pm.ResolveInfo zze(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            return packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 65536);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final com.google.android.gms.internal.ads.zzcbh zza() {
        return new com.google.android.gms.internal.ads.zzcbh(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzcbg(android.content.Context context, com.google.android.gms.internal.ads.zzcbh zzcbhVar) {
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        zzb(context);
        zzc(context);
        zzd(context);
        this.zzo = android.os.Build.FINGERPRINT;
        this.zzp = android.os.Build.DEVICE;
        this.zzC = com.google.android.gms.internal.ads.zzbjr.zza(context);
        this.zzq = zzcbhVar.zza;
        this.zzr = zzcbhVar.zzb;
        this.zzs = zzcbhVar.zzc;
        this.zzt = zzcbhVar.zzd;
        this.zzu = zzcbhVar.zze;
        this.zzv = zzcbhVar.zzf;
        this.zzw = zzcbhVar.zzg;
        this.zzx = zzcbhVar.zzh;
        this.zzB = zzcbhVar.zzi;
        this.zzy = zzcbhVar.zzl;
        this.zzz = zzcbhVar.zzm;
        this.zzA = zzcbhVar.zzn;
    }
}
