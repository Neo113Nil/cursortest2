package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeef implements com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzdlk, com.google.android.gms.internal.ads.zzdef {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdzl zzb;

    zzeef(android.content.Context context, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzdzlVar;
    }

    private final void zzf(final android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfA)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeee
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzeef.this.zzc(context);
                }
            });
        }
    }

    final /* synthetic */ void zzc(android.content.Context context) {
        com.google.android.gms.ads.internal.zzt.zzn().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfD)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfC)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfE)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
