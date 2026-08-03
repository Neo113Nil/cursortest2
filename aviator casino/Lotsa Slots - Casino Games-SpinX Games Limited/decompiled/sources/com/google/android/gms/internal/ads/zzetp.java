package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzetp {
    private final com.google.android.gms.internal.ads.zzdqd zza;
    private final com.google.android.gms.internal.ads.zzetc zzb;
    private final com.google.android.gms.internal.ads.zzdcu zzc;

    public zzetp(com.google.android.gms.internal.ads.zzdqd zzdqdVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzdqdVar;
        final com.google.android.gms.internal.ads.zzetc zzetcVar = new com.google.android.gms.internal.ads.zzetc(zzdzlVar);
        this.zzb = zzetcVar;
        final com.google.android.gms.internal.ads.zzbsk zze = zzdqdVar.zze();
        this.zzc = new com.google.android.gms.internal.ads.zzdcu() { // from class: com.google.android.gms.internal.ads.zzeto
            @Override // com.google.android.gms.internal.ads.zzdcu
            public final /* synthetic */ void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
                com.google.android.gms.internal.ads.zzetc.this.zzdJ(zzeVar);
                com.google.android.gms.internal.ads.zzbsk zzbskVar = zze;
                if (zzbskVar != null) {
                    try {
                        zzbskVar.zzg(zzeVar);
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbskVar != null) {
                    try {
                        zzbskVar.zzf(zzeVar.zza);
                    } catch (android.os.RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzl(zzbhVar);
    }

    public final com.google.android.gms.internal.ads.zzdnx zzb() {
        return new com.google.android.gms.internal.ads.zzdnx(this.zza, this.zzb.zzi());
    }

    public final com.google.android.gms.internal.ads.zzetc zzc() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzdef zzd() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzdcu zze() {
        return this.zzc;
    }
}
