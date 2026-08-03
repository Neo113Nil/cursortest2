package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzevn implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;
    private final com.google.android.gms.internal.ads.zzcfi zzc;

    public zzevn(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzcfi zzcfiVar) {
        this.zza = zzhcgVar;
        this.zzb = zzfkyVar;
        this.zzc = zzcfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzevn.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 9;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzevo zzc() {
        return new com.google.android.gms.internal.ads.zzevo(this.zzb.zzk, this.zzc.zzl());
    }
}
