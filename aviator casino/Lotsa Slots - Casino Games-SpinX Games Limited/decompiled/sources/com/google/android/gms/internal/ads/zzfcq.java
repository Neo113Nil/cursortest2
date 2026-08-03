package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfcq implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;

    zzfcq(android.content.Context context, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zza = context;
        this.zzb = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzb.zze()).booleanValue() ? this.zzb.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfcp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfcq.this.zzc();
            }
        }) : com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfcr(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 59;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfcr zzc() {
        android.content.Context context = this.zza;
        return new com.google.android.gms.internal.ads.zzfcr(com.google.android.gms.internal.ads.zzbib.zzc(context), com.google.android.gms.internal.ads.zzbib.zzd(context));
    }
}
