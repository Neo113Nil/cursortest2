package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbgr {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.client.zzeh zzd;
    private final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback zze;
    private final com.google.android.gms.internal.ads.zzbuy zzf = new com.google.android.gms.internal.ads.zzbuy();
    private final com.google.android.gms.ads.internal.client.zzq zzg = com.google.android.gms.ads.internal.client.zzq.zza;

    public zzbgr(android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzeh zzehVar, com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzehVar;
        this.zze = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzr zzd = com.google.android.gms.ads.internal.client.zzr.zzd();
            com.google.android.gms.ads.internal.client.zzaw zzb = com.google.android.gms.ads.internal.client.zzay.zzb();
            android.content.Context context = this.zzb;
            java.lang.String str = this.zzc;
            com.google.android.gms.ads.internal.client.zzbu zza = zzb.zza(context, zzd, str, this.zzf);
            this.zza = zza;
            if (zza != null) {
                com.google.android.gms.ads.internal.client.zzeh zzehVar = this.zzd;
                zzehVar.zzp(currentTimeMillis);
                this.zza.zzJ(new com.google.android.gms.internal.ads.zzbge(this.zze, str));
                this.zza.zze(this.zzg.zza(context, zzehVar));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
