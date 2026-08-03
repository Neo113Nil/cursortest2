package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzell {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.android.gms.internal.ads.zzfkf zzc;
    private final com.google.android.gms.internal.ads.zzcku zzd;
    private final com.google.android.gms.internal.ads.zzdzl zze;
    private com.google.android.gms.internal.ads.zzfuw zzf;

    zzell(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfkfVar;
        this.zzd = zzckuVar;
        this.zze = zzdzlVar;
    }

    public final synchronized boolean zza(boolean z) {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzc;
        if (zzfkfVar.zzT) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && (zzckuVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfkfVar.zzV.zzb()) {
                        com.google.android.gms.internal.ads.zzfuw zzi = com.google.android.gms.ads.internal.zzt.zzu().zzi(this.zzb, zzckuVar.zzD(), true);
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgo)).booleanValue()) {
                            com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zze;
                            java.lang.String str = zzi != null ? "1" : "0";
                            com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
                            zza.zzc("omid_js_session_success", str);
                            zza.zzd();
                        }
                        if (zzi == null) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Created omid javascript session service.");
                        this.zzf = zzi;
                        zzckuVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.internal.ads.zzfuw zzfuwVar = this.zzf;
        if (zzfuwVar == null || (zzckuVar = this.zzd) == null) {
            return;
        }
        java.util.Iterator it = zzckuVar.zzF().iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfuwVar, (android.view.View) it.next());
        }
        zzckuVar.zze("onSdkLoaded", com.google.android.gms.internal.ads.zzgwp.zza());
    }

    public final synchronized void zzd() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        if (this.zzf == null || (zzckuVar = this.zzd) == null) {
            return;
        }
        zzckuVar.zze("onSdkImpression", com.google.android.gms.internal.ads.zzgwp.zza());
    }

    public final synchronized void zze(com.google.android.gms.internal.ads.zzfuv zzfuvVar) {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.internal.ads.zzfuw zzfuwVar = this.zzf;
        if (zzfuwVar == null || (zzckuVar = this.zzd) == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzj(zzfuwVar, zzfuvVar);
        this.zzf = null;
        zzckuVar.zzal(null);
    }

    public final synchronized void zzf(android.view.View view) {
        com.google.android.gms.internal.ads.zzfuw zzfuwVar = this.zzf;
        if (zzfuwVar != null) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfuwVar, view);
        }
    }
}
