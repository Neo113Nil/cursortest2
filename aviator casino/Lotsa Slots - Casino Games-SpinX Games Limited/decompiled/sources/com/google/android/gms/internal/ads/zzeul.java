package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeul implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;

    zzeul(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzflo zzfloVar) {
        this.zza = zzhcgVar;
        this.zzb = zzfkyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeuk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzeul.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeum zzc() {
        java.util.List asList;
        java.lang.String str = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhY)).booleanValue()) {
            java.lang.String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzia)).booleanValue()) {
                asList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzib)).split(","));
            } else {
                asList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhZ)).split(","));
            }
            if (asList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(zzc))) {
                str = com.google.android.gms.internal.ads.zzflo.zza();
            }
        }
        return new com.google.android.gms.internal.ads.zzeum(str);
    }
}
