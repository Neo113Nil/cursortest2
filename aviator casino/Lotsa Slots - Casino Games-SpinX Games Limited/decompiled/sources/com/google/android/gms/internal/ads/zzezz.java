package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezz implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzecr zzb;

    zzezz(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zza = zzhcgVar;
        this.zzb = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzezz.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 23;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfaa zzc() {
        com.google.android.gms.internal.ads.zzecr zzecrVar = this.zzb;
        return new com.google.android.gms.internal.ads.zzfaa(zzecrVar.zzg(), zzecrVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzecrVar.zzq(), zzecrVar.zzm());
    }
}
