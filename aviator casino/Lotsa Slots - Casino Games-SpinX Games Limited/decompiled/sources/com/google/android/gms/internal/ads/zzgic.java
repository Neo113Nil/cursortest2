package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgic implements com.google.android.gms.internal.ads.zzgiw {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzaxm zzb;
    private final com.google.android.gms.internal.ads.zzgqf zzc;
    private final long zzd;

    zzgic(com.google.android.gms.internal.ads.zzaxm zzaxmVar, java.util.Map map, com.google.android.gms.internal.ads.zzgdf zzgdfVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = map;
        this.zzb = zzaxmVar;
        this.zzc = zzgqhVar.zza(112);
        this.zzd = zzgdfVar.zzl();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        zza();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Void zza() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzaym zzaymVar;
        try {
            try {
                this.zzc.zza();
                com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) this.zza.get("gs");
                if (listenableFuture != null && (zzaymVar = (com.google.android.gms.internal.ads.zzaym) listenableFuture.get(this.zzd, java.util.concurrent.TimeUnit.MILLISECONDS)) != null) {
                    com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzb;
                    synchronized (zzaxmVar) {
                        zzaxmVar.zzad(zzaymVar.zzh());
                        zzaxmVar.zzN(zzaymVar.zzd());
                    }
                }
            } catch (java.lang.Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (java.lang.ClassCastException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            this.zzc.zzb(e);
        }
        this.zzc.zzc();
        return null;
    }
}
