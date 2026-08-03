package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfuc {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzfoo zzd;
    private final com.google.android.gms.ads.internal.ClientApi zze = new com.google.android.gms.ads.internal.ClientApi();
    private final com.google.android.gms.internal.ads.zzflu zzf;
    private final com.google.android.gms.common.util.Clock zzg;
    private final com.google.android.gms.internal.ads.zzfsn zzh;

    zzfuc(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfoo zzfooVar, com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzfsn zzfsnVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfooVar;
        this.zzg = clock;
        this.zzf = zzfluVar;
        this.zzh = zzfsnVar;
    }

    private final com.google.android.gms.internal.ads.zzfsw zzc() {
        return new com.google.android.gms.internal.ads.zzfsw(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzF)).longValue(), 2.0d, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzG)).longValue(), 0.2d, this.zzg);
    }

    public final com.google.android.gms.internal.ads.zzfub zza(com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            com.google.android.gms.ads.internal.ClientApi clientApi = this.zze;
            android.content.Context context = this.zza;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzb;
            return new com.google.android.gms.internal.ads.zzfta(clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (ordinal == 2) {
            com.google.android.gms.ads.internal.ClientApi clientApi2 = this.zze;
            android.content.Context context2 = this.zza;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new com.google.android.gms.internal.ads.zzfug(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (ordinal != 5) {
            return null;
        }
        com.google.android.gms.ads.internal.ClientApi clientApi3 = this.zze;
        android.content.Context context3 = this.zza;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new com.google.android.gms.internal.ads.zzfsv(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
    }

    public final com.google.android.gms.internal.ads.zzfub zzb(java.lang.String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            com.google.android.gms.ads.internal.ClientApi clientApi = this.zze;
            android.content.Context context = this.zza;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzb;
            return new com.google.android.gms.internal.ads.zzfta(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (ordinal == 2) {
            com.google.android.gms.ads.internal.ClientApi clientApi2 = this.zze;
            android.content.Context context2 = this.zza;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new com.google.android.gms.internal.ads.zzfug(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (ordinal != 5) {
            return null;
        }
        com.google.android.gms.ads.internal.ClientApi clientApi3 = this.zze;
        android.content.Context context3 = this.zza;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new com.google.android.gms.internal.ads.zzfsv(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }
}
