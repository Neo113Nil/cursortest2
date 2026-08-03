package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcdd implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza;

    zzcdd(com.google.android.gms.internal.ads.zzcdi zzcdiVar, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
        java.util.Objects.requireNonNull(zzcdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        java.util.List list;
        list = com.google.android.gms.internal.ads.zzcdi.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.util.List list;
        list = com.google.android.gms.internal.ads.zzcdi.zzc;
        list.remove(this.zza);
    }
}
