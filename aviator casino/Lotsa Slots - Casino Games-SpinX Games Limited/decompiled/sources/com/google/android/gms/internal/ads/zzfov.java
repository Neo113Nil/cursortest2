package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfov {
    public static final com.google.android.gms.internal.ads.zzfpb zza(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj, com.google.android.gms.internal.ads.zzfpc zzfpcVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture2;
        listenableFuture2 = com.google.android.gms.internal.ads.zzfpc.zza;
        return new com.google.android.gms.internal.ads.zzfpb(zzfpcVar, obj, null, listenableFuture2, java.util.Collections.emptyList(), listenableFuture, null);
    }

    public static final com.google.android.gms.internal.ads.zzfpb zzb(java.util.concurrent.Callable callable, java.lang.Object obj, com.google.android.gms.internal.ads.zzfpc zzfpcVar) {
        return zzc(callable, zzfpcVar.zze(), obj, zzfpcVar);
    }

    public static final com.google.android.gms.internal.ads.zzfpb zzc(java.util.concurrent.Callable callable, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzfpc zzfpcVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        listenableFuture = com.google.android.gms.internal.ads.zzfpc.zza;
        return new com.google.android.gms.internal.ads.zzfpb(zzfpcVar, obj, null, listenableFuture, java.util.Collections.emptyList(), zzhcgVar.zzc(callable), null);
    }

    public static final com.google.android.gms.internal.ads.zzfpb zzd(final com.google.android.gms.internal.ads.zzfoq zzfoqVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzfpc zzfpcVar) {
        return zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfou
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzfoq.this.zza();
                return null;
            }
        }, zzhcgVar, obj, zzfpcVar);
    }
}
