package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezo implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;

    zzezo(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        this.zza = zzhcgVar;
        this.zzb = zzfkyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzezn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzezo.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 21;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzezp zzc() {
        return new com.google.android.gms.internal.ads.zzezp("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd)));
    }
}
