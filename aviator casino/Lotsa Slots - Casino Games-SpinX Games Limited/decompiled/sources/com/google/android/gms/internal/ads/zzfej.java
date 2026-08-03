package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfej implements com.google.android.gms.internal.ads.zzfck {
    final com.google.android.gms.internal.ads.zzhcg zza;
    final java.util.List zzb;

    public zzfej(com.google.android.gms.internal.ads.zzbia zzbiaVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.util.List list) {
        this.zza = zzhcgVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfei
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return new com.google.android.gms.internal.ads.zzfek(com.google.android.gms.internal.ads.zzfej.this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 48;
    }
}
