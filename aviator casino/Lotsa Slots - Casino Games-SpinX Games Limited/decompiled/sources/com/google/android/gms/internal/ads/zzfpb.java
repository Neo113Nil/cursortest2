package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfpb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpc zza;
    private final java.lang.Object zzb;
    private final java.lang.String zzc;
    private final com.google.common.util.concurrent.ListenableFuture zzd;
    private final java.util.List zze;
    private final com.google.common.util.concurrent.ListenableFuture zzf;

    private zzfpb(com.google.android.gms.internal.ads.zzfpc zzfpcVar, java.lang.Object obj, java.lang.String str, com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.List list, com.google.common.util.concurrent.ListenableFuture listenableFuture2) {
        java.util.Objects.requireNonNull(zzfpcVar);
        this.zza = zzfpcVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    /* synthetic */ zzfpb(com.google.android.gms.internal.ads.zzfpc zzfpcVar, java.lang.Object obj, java.lang.String str, com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.List list, com.google.common.util.concurrent.ListenableFuture listenableFuture2, byte[] bArr) {
        this(zzfpcVar, obj, null, listenableFuture, list, listenableFuture2);
    }

    public final com.google.android.gms.internal.ads.zzfpb zza(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzfpb(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final com.google.android.gms.internal.ads.zzfpb zzb(final com.google.android.gms.internal.ads.zzfok zzfokVar) {
        return zzc(new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfpa
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.internal.ads.zzfok.this.zza(obj));
            }
        });
    }

    public final com.google.android.gms.internal.ads.zzfpb zzc(com.google.android.gms.internal.ads.zzhbe zzhbeVar) {
        return zzd(zzhbeVar, this.zza.zze());
    }

    public final com.google.android.gms.internal.ads.zzfpb zzd(com.google.android.gms.internal.ads.zzhbe zzhbeVar, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzfpb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, com.google.android.gms.internal.ads.zzhbw.zzj(this.zzf, zzhbeVar, executor));
    }

    public final com.google.android.gms.internal.ads.zzfpb zze(final com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        return zzd(new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfox
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.common.util.concurrent.ListenableFuture.this;
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    public final com.google.android.gms.internal.ads.zzfpb zzf(java.lang.Class cls, final com.google.android.gms.internal.ads.zzfok zzfokVar) {
        return zzg(cls, new com.google.android.gms.internal.ads.zzhbe(zzfokVar) { // from class: com.google.android.gms.internal.ads.zzfoy
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzhbw.zza("");
            }
        });
    }

    public final com.google.android.gms.internal.ads.zzfpb zzg(java.lang.Class cls, com.google.android.gms.internal.ads.zzhbe zzhbeVar) {
        com.google.android.gms.internal.ads.zzfpc zzfpcVar = this.zza;
        com.google.android.gms.internal.ads.zzhcg zze = zzfpcVar.zze();
        return new com.google.android.gms.internal.ads.zzfpb(zzfpcVar, this.zzb, this.zzc, this.zzd, this.zze, com.google.android.gms.internal.ads.zzhbw.zzh(this.zzf, cls, zzhbeVar, zze));
    }

    public final com.google.android.gms.internal.ads.zzfpb zzh(long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.zzfpc zzfpcVar = this.zza;
        java.util.concurrent.ScheduledExecutorService zzf = zzfpcVar.zzf();
        return new com.google.android.gms.internal.ads.zzfpb(zzfpcVar, this.zzb, this.zzc, this.zzd, this.zze, com.google.android.gms.internal.ads.zzhbw.zzi(this.zzf, j, timeUnit, zzf));
    }

    public final com.google.android.gms.internal.ads.zzfor zzi() {
        java.lang.Object obj = this.zzb;
        java.lang.String str = this.zzc;
        if (str == null) {
            str = this.zza.zzc(obj);
        }
        final com.google.android.gms.internal.ads.zzfor zzforVar = new com.google.android.gms.internal.ads.zzfor(obj, str, this.zzf);
        this.zza.zzg().zza(zzforVar);
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzd;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfoz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfpb.this.zza.zzg().zzb(zzforVar);
            }
        };
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzh;
        listenableFuture.addListener(runnable, zzhcgVar);
        com.google.android.gms.internal.ads.zzhbw.zzr(zzforVar, new com.google.android.gms.internal.ads.zzfow(this, zzforVar), zzhcgVar);
        return zzforVar;
    }

    public final com.google.android.gms.internal.ads.zzfpb zzj(java.lang.Object obj) {
        return this.zza.zza(obj, zzi());
    }
}
