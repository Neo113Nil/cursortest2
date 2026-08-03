package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgqh {
    private final com.google.android.gms.internal.ads.zzgfh zza;
    private final com.google.android.gms.internal.ads.zzgcn zzb;

    zzgqh(com.google.android.gms.internal.ads.zzgcn zzgcnVar, com.google.android.gms.internal.ads.zzgfh zzgfhVar) {
        this.zza = zzgfhVar;
        this.zzb = zzgcnVar;
    }

    public final com.google.android.gms.internal.ads.zzgqf zza(int i) {
        return new com.google.android.gms.internal.ads.zzgqf(i, this.zzb, this.zza);
    }

    public final void zzb(int i) {
        this.zza.zzb(i - 1, -1L, null, null);
    }

    public final void zzc(int i, java.lang.String str) {
        this.zza.zzb(i - 1, -1L, null, str);
    }

    public final void zzd(int i, java.lang.Throwable th) {
        this.zza.zzb(i - 1, -1L, th, null);
    }

    public final com.google.common.util.concurrent.ListenableFuture zze(int i, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.android.gms.internal.ads.zzgqf zza = zza(i);
        zza.zza();
        com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzgqg(this, zza), com.google.android.gms.internal.ads.zzhcn.zza());
        return listenableFuture;
    }

    public final void zzf(int i, java.lang.Runnable runnable) {
        try {
            zza(i).zza();
            runnable.run();
        } finally {
        }
    }
}
