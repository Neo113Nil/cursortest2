package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgff {
    private final com.google.android.gms.internal.ads.zzimo zza;
    private final com.google.android.gms.internal.ads.zzimo zzb;
    private final java.util.concurrent.ExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzimo zzd;
    private com.google.common.util.concurrent.ListenableFuture zze = null;

    zzgff(com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzimo zzimoVar2, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzimo zzimoVar3) {
        this.zza = zzimoVar;
        this.zzb = zzimoVar2;
        this.zzc = executorService;
        this.zzd = zzimoVar3;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zze;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        java.util.Set set = (java.util.Set) this.zzb.zzb();
        java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.gms.internal.ads.zzgfd) it.next()).zza());
        }
        com.google.android.gms.internal.ads.zzgqh zzgqhVar = (com.google.android.gms.internal.ads.zzgqh) this.zzd.zzb();
        com.google.common.util.concurrent.ListenableFuture zzk = com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbw.zzm(arrayList), com.google.android.gms.internal.ads.zzgfe.zza, this.zzc);
        zzgqhVar.zze(2, zzk);
        this.zze = zzk;
        java.util.Iterator it2 = ((java.util.Set) this.zza.zzb()).iterator();
        while (it2.hasNext()) {
            ((com.google.android.gms.internal.ads.zzgfd) it2.next()).zza();
        }
        com.google.common.util.concurrent.ListenableFuture listenableFuture2 = this.zze;
        listenableFuture2.getClass();
        com.google.common.util.concurrent.ListenableFuture listenableFuture3 = listenableFuture2;
        return listenableFuture2;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        listenableFuture = this.zze;
        listenableFuture.getClass();
        com.google.common.util.concurrent.ListenableFuture listenableFuture2 = listenableFuture;
        return listenableFuture;
    }
}
