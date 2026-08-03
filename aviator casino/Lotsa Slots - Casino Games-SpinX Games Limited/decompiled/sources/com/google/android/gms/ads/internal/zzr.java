package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzr {
    private final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.util.Map zzc = new java.util.TreeMap();
    private java.lang.String zzd;
    private java.lang.String zze;
    private final java.lang.String zzf;

    public zzr(android.content.Context context, java.lang.String str) {
        java.lang.String concat;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        java.lang.String packageName = context.getPackageName();
        try {
            java.lang.String str2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 1 + java.lang.String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get package version name for reporting", e);
            java.lang.String.valueOf(packageName);
            concat = java.lang.String.valueOf(packageName).concat("-missing");
        }
        this.zzf = concat;
    }

    public final java.lang.String zza() {
        return this.zze;
    }

    public final java.lang.String zzb() {
        return this.zzd;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    public final java.lang.String zzd() {
        return this.zzf;
    }

    public final java.util.Map zze() {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        com.google.android.gms.ads.internal.client.zzft zzftVar = zzmVar.zzj;
        if (zzftVar != null) {
            this.zzd = zzftVar.zza;
        }
        android.os.Bundle bundle = zzmVar.zzm;
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.internal.ads.zzbkc.zzc.zze();
        for (java.lang.String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.zze = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzc.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        java.util.Map map = this.zzc;
        map.put(com.ironsource.X3.j.q, versionInfoParcel.afmaVersion);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkc.zza.zze()).booleanValue()) {
            android.os.Bundle zzb = com.google.android.gms.ads.internal.util.zzac.zzb(this.zza, (java.lang.String) com.google.android.gms.internal.ads.zzbkc.zzb.zze());
            for (java.lang.String str3 : zzb.keySet()) {
                map.put(str3, zzb.get(str3).toString());
            }
        }
    }
}
