package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzham extends com.google.android.gms.internal.ads.zzhao {
    zzham(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, com.google.android.gms.internal.ads.zzhbe zzhbeVar) {
        super(listenableFuture, cls, zzhbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhao
    final /* synthetic */ void zze(java.lang.Object obj) {
        zzk((com.google.common.util.concurrent.ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhao
    final /* bridge */ /* synthetic */ java.lang.Object zzf(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = (com.google.android.gms.internal.ads.zzhbe) obj;
        com.google.common.util.concurrent.ListenableFuture zza = zzhbeVar.zza(th);
        com.google.android.gms.internal.ads.zzgtj.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbeVar);
        return zza;
    }
}
