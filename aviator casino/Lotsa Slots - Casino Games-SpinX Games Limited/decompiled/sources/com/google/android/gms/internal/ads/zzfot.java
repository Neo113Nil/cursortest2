package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfot {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpc zza;
    private final java.lang.Object zzb;
    private final java.util.List zzc;

    /* synthetic */ zzfot(com.google.android.gms.internal.ads.zzfpc zzfpcVar, java.lang.Object obj, java.util.List list, byte[] bArr) {
        java.util.Objects.requireNonNull(zzfpcVar);
        this.zza = zzfpcVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final com.google.android.gms.internal.ads.zzfpb zza(java.util.concurrent.Callable callable) {
        java.util.List list = this.zzc;
        com.google.android.gms.internal.ads.zzhbv zzp = com.google.android.gms.internal.ads.zzhbw.zzp(list);
        com.google.common.util.concurrent.ListenableFuture zza = zzp.zza(com.google.android.gms.internal.ads.zzfos.zza, com.google.android.gms.internal.ads.zzcfr.zzh);
        com.google.android.gms.internal.ads.zzfpc zzfpcVar = this.zza;
        return new com.google.android.gms.internal.ads.zzfpb(zzfpcVar, this.zzb, null, zza, list, zzp.zza(callable, zzfpcVar.zze()), null);
    }
}
