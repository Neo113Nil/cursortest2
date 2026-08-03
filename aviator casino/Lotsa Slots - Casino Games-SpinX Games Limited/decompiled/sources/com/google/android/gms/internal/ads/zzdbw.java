package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdbw {
    private final com.google.android.gms.internal.ads.zzfpk zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final android.content.pm.ApplicationInfo zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final android.content.pm.PackageInfo zzf;
    private final com.google.android.gms.internal.ads.zzimo zzg;
    private final java.lang.String zzh;
    private final com.google.android.gms.internal.ads.zzfcn zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final com.google.android.gms.internal.ads.zzfky zzk;
    private final com.google.android.gms.internal.ads.zzdik zzl;

    zzdbw(com.google.android.gms.internal.ads.zzfpk zzfpkVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.pm.ApplicationInfo applicationInfo, java.lang.String str, java.util.List list, android.content.pm.PackageInfo packageInfo, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.ads.internal.util.zzg zzgVar, java.lang.String str2, com.google.android.gms.internal.ads.zzfcn zzfcnVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzdik zzdikVar) {
        this.zza = zzfpkVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzimoVar;
        this.zzh = str2;
        this.zzi = zzfcnVar;
        this.zzj = zzgVar;
        this.zzk = zzfkyVar;
        this.zzl = zzdikVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(android.os.Bundle bundle) {
        this.zzl.zza();
        com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.SIGNALS;
        com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zza;
        java.util.Objects.requireNonNull(zzfpkVar);
        return com.google.android.gms.internal.ads.zzfov.zza(this.zzi.zza(new android.os.Bundle(), bundle), zzfpeVar, zzfpkVar).zzi();
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        final android.os.Bundle bundle = new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue()) {
            android.os.Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final com.google.common.util.concurrent.ListenableFuture zza = zza(bundle);
        return this.zza.zzb(com.google.android.gms.internal.ads.zzfpe.REQUEST_PARCEL, zza, (com.google.common.util.concurrent.ListenableFuture) this.zzg.zzb()).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdbv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzdbw.this.zzc(zza, bundle);
            }
        }).zzi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbd zzc(com.google.common.util.concurrent.ListenableFuture listenableFuture, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = (android.os.Bundle) listenableFuture.get();
        java.lang.String str = (java.lang.String) ((com.google.common.util.concurrent.ListenableFuture) this.zzg.zzb()).get();
        boolean z = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhX)).booleanValue() && this.zzj.zzx();
        java.lang.String str2 = this.zzh;
        android.content.pm.PackageInfo packageInfo = this.zzf;
        java.util.List list = this.zze;
        return new com.google.android.gms.internal.ads.zzcbd(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z, this.zzk.zza(), bundle);
    }
}
