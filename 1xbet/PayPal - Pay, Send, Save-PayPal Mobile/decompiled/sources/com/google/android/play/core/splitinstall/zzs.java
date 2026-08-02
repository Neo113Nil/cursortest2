package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzs {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.play.core.splitinstall.internal.zzu zzb = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallInfoProvider");
    private final android.content.Context zzc;
    private final java.lang.String zzd;

    zzs(android.content.Context context) {
        this.zzc = context;
        this.zzd = context.getPackageName();
    }

    public static java.lang.String zzb(java.lang.String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(java.lang.String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final java.util.Set zzf(android.content.pm.PackageInfo packageInfo) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : zzh(packageInfo)) {
            if (!zze(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private final android.content.pm.PackageInfo zzg() {
        try {
            return this.zzc.getPackageManager().getPackageInfo(this.zzd, 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            zzb.zzb("App is not found in PackageManager", new java.lang.Object[0]);
            return null;
        }
    }

    private static final java.util.Set zzh(android.content.pm.PackageInfo packageInfo) {
        android.os.Bundle bundle = packageInfo.applicationInfo.metaData;
        java.util.HashSet hashSet = new java.util.HashSet();
        if (bundle != null) {
            java.lang.String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                zzb.zza("App has no fused modules.", new java.lang.Object[0]);
            } else {
                java.util.Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        java.lang.String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            zzb.zza("Adding splits from package manager: %s", java.util.Arrays.toString(strArr));
            java.util.Collections.addAll(hashSet, strArr);
        } else {
            zzb.zza("No splits are found or app cannot be found in package manager.", new java.lang.Object[0]);
        }
        com.google.android.play.core.splitinstall.zzq zza2 = com.google.android.play.core.splitinstall.zzr.zza();
        if (zza2 != null) {
            hashSet.addAll(zza2.zza());
        }
        return hashSet;
    }

    public final com.google.android.play.core.splitinstall.zzk zza(android.os.Bundle bundle) {
        if (bundle == null) {
            zzb.zze("No metadata found in Context.", new java.lang.Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            zzb.zze("No metadata found in AndroidManifest.", new java.lang.Object[0]);
            return null;
        }
        try {
            com.google.android.play.core.splitinstall.zzk zza2 = com.google.android.play.core.splitinstall.zzbg.zza(this.zzc.getResources().getXml(i), new com.google.android.play.core.splitinstall.zzi());
            if (zza2 == null) {
                zzb.zze("Can't parse languages metadata.", new java.lang.Object[0]);
            }
            return zza2;
        } catch (android.content.res.Resources.NotFoundException unused) {
            zzb.zze("Resource with languages metadata doesn't exist.", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.util.Set zzc() {
        android.content.pm.PackageInfo zzg = zzg();
        return (zzg == null || zzg.applicationInfo == null) ? new java.util.HashSet() : zzf(zzg);
    }

    public final java.util.Set zzd() {
        android.content.pm.PackageInfo zzg = zzg();
        java.util.HashSet hashSet = null;
        if (zzg != null && zzg.applicationInfo != null) {
            com.google.android.play.core.splitinstall.zzk zza2 = zza(zzg.applicationInfo.metaData);
            if (zza2 == null) {
                return null;
            }
            hashSet = new java.util.HashSet();
            java.util.Set zzh = zzh(zzg);
            zzh.add("");
            java.util.Set zzf = zzf(zzg);
            zzf.add("");
            for (java.util.Map.Entry entry : zza2.zza(zzf).entrySet()) {
                if (zzh.containsAll((java.util.Collection) entry.getValue())) {
                    hashSet.add((java.lang.String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    public zzs(android.content.Context context, java.lang.String str) {
        this.zzc = context;
        this.zzd = str;
    }
}
