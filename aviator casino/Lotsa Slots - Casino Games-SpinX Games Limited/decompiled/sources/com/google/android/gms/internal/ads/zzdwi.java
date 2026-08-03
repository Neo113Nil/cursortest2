package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdwi {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzbap zzb;
    private final com.google.android.gms.internal.ads.zzbjx zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final com.google.android.gms.internal.ads.zzbhp zzf;
    private final com.google.android.gms.internal.ads.zzdfs zzg;
    private final com.google.android.gms.internal.ads.zzekr zzh;
    private final com.google.android.gms.internal.ads.zzflc zzi;
    private final com.google.android.gms.internal.ads.zzdzl zzj;
    private final com.google.android.gms.internal.ads.zzcmt zzk;

    public zzdwi(com.google.android.gms.internal.ads.zzclk zzclkVar, android.content.Context context, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzbjx zzbjxVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, com.google.android.gms.internal.ads.zzdfs zzdfsVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzflc zzflcVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzcmt zzcmtVar) {
        this.zza = context;
        this.zzb = zzbapVar;
        this.zzc = zzbjxVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbhpVar;
        this.zzg = zzdfsVar;
        this.zzh = zzekrVar;
        this.zzi = zzflcVar;
        this.zzj = zzdzlVar;
        this.zzk = zzcmtVar;
    }

    public final com.google.android.gms.internal.ads.zzcku zza(com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar) throws com.google.android.gms.internal.ads.zzclj {
        com.google.android.gms.internal.ads.zzcne zza = com.google.android.gms.internal.ads.zzcne.zza(zzrVar);
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.internal.ads.zzdvx zzdvxVar = new com.google.android.gms.internal.ads.zzdvx(this);
        com.google.android.gms.internal.ads.zzbap zzbapVar = this.zzb;
        com.google.android.gms.internal.ads.zzekr zzekrVar = this.zzh;
        com.google.android.gms.internal.ads.zzcku zza2 = com.google.android.gms.internal.ads.zzclk.zza(this.zza, zza, str, false, false, zzbapVar, this.zzc, this.zzd, null, zzdvxVar, this.zze, this.zzf, zzfkfVar, zzfkiVar, zzekrVar, this.zzi, this.zzj);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpz)).booleanValue()) {
            this.zzk.zza(zza2.zzD());
        }
        return zza2;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdfs zzb() {
        return this.zzg;
    }
}
