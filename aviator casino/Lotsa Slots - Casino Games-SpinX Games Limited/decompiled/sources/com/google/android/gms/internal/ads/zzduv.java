package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzduv implements java.util.concurrent.Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdzl zzc;
    private final com.google.android.gms.internal.ads.zzekg zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzbap zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzfsc zzh;
    private final com.google.android.gms.internal.ads.zzekr zzi;
    private final com.google.android.gms.internal.ads.zzflc zzj;

    public zzduv(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzclk zzclkVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzflc zzflcVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzbapVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzekgVar;
        this.zzh = zzfscVar;
        this.zzc = zzdzlVar;
        this.zzi = zzekrVar;
        this.zzj = zzflcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzdux zzduxVar = new com.google.android.gms.internal.ads.zzdux(this);
        zzduxVar.zza();
        return zzduxVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    final /* synthetic */ android.content.Context zzb() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzc() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzekg zzd() {
        return this.zzd;
    }

    final /* synthetic */ java.util.concurrent.Executor zze() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbap zzf() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg() {
        return this.zzg;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfsc zzh() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzekr zzi() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzflc zzj() {
        return this.zzj;
    }
}
