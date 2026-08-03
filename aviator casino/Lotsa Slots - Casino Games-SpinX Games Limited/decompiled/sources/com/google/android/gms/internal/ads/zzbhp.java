package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbhp {
    private final com.google.android.gms.internal.ads.zzbhu zza;
    private final com.google.android.gms.internal.ads.zzbhv.zzt.zza zzb;
    private final boolean zzc;

    private zzbhp() {
        this.zzb = com.google.android.gms.internal.ads.zzbhv.zzt.zzx();
        this.zzc = false;
        this.zza = new com.google.android.gms.internal.ads.zzbhu();
    }

    public static com.google.android.gms.internal.ads.zzbhp zza() {
        return new com.google.android.gms.internal.ads.zzbhp();
    }

    private final synchronized void zzd(int i) {
        com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzj());
        com.google.android.gms.internal.ads.zzbht zzbhtVar = new com.google.android.gms.internal.ads.zzbht(this.zza, zzaVar.zzbu().zzaN(), null);
        int i2 = i - 1;
        zzbhtVar.zzb(i2);
        zzbhtVar.zza();
        java.lang.String num = java.lang.Integer.toString(i2, 10);
        java.lang.String.valueOf(num);
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(java.lang.String.valueOf(num)));
    }

    private final synchronized void zze(int i) {
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(com.google.android.gms.internal.ads.zzfzk.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i).getBytes());
                } catch (java.io.IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (java.io.IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (java.io.FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized java.lang.String zzf(int i) {
        com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return java.lang.String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.zzf(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()), java.lang.Integer.valueOf(i - 1), android.util.Base64.encodeToString(zzaVar.zzbu().zzaN(), 3));
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbho zzbhoVar) {
        if (this.zzc) {
            try {
                zzbhoVar.zza(this.zzb);
            } catch (java.lang.NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgf)).booleanValue()) {
                zze(i);
            } else {
                zzd(i);
            }
        }
    }

    public zzbhp(com.google.android.gms.internal.ads.zzbhu zzbhuVar) {
        this.zzb = com.google.android.gms.internal.ads.zzbhv.zzt.zzx();
        this.zza = zzbhuVar;
        this.zzc = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzge)).booleanValue();
    }
}
