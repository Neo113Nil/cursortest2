package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzexe implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzdxh zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzfky zzd;

    public zzexe(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzdxh zzdxhVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, java.lang.String str) {
        this.zza = zzhcgVar;
        this.zzb = zzdxhVar;
        this.zzd = zzfkyVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzexe.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 17;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzexf zzc() {
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzd;
        com.google.android.gms.internal.ads.zzdxh zzdxhVar = this.zzb;
        return new com.google.android.gms.internal.ads.zzexf(zzdxhVar.zzb(zzfkyVar.zzg, this.zzc), zzdxhVar.zzc());
    }
}
