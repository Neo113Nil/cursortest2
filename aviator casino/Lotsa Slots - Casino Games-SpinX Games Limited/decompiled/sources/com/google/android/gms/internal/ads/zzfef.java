package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfef implements com.google.android.gms.internal.ads.zzfck {
    public zzfef(com.google.android.gms.internal.ads.zzces zzcesVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        final com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgO)).booleanValue()) {
            zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        final com.google.common.util.concurrent.ListenableFuture zza2 = com.google.android.gms.internal.ads.zzhbw.zza(null);
        return com.google.android.gms.internal.ads.zzhbw.zzo(zza, zza2).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfee
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return new com.google.android.gms.internal.ads.zzfeg((java.lang.String) com.google.common.util.concurrent.ListenableFuture.this.get(), (java.lang.String) zza2.get());
            }
        }, com.google.android.gms.internal.ads.zzcfr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 47;
    }
}
