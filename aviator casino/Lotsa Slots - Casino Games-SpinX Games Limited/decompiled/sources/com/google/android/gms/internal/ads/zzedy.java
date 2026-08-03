package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzedy {
    com.google.android.gms.internal.ads.zzcaa zza;
    com.google.android.gms.internal.ads.zzcaa zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzedv zzd;
    private final com.google.android.gms.internal.ads.zzdzl zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;

    zzedy(com.google.android.gms.internal.ads.zzedv zzedvVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, android.content.Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzedvVar;
        this.zze = zzdzlVar;
        this.zzc = context;
        this.zzf = zzgVar;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            com.google.android.gms.internal.ads.zzedv zzedvVar = this.zzd;
            zzedvVar.zza();
            zzedvVar.zzb(new com.google.android.gms.internal.ads.zzedx(this));
        } catch (java.lang.Exception e) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfQ)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = com.google.android.gms.internal.ads.zzbzy.zzc(this.zzc);
                }
                this.zzb.zzh(e, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = com.google.android.gms.internal.ads.zzbzy.zza(this.zzc);
                }
                this.zza.zzh(e, "InstallReferrer.initializeAndReport");
            }
        }
    }

    final /* synthetic */ android.content.Context zzb() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzedv zzc() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzd() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.zzg zze() {
        return this.zzf;
    }
}
