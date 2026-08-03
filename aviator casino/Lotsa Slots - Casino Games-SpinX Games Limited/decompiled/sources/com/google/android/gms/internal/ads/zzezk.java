package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezk implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;

    zzezk(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context) {
        this.zzb = zzhcgVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zzb.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzezj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzezk.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 57;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzezl zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new com.google.android.gms.internal.ads.zzezl(com.google.android.gms.ads.internal.util.zzs.zzu(this.zza));
    }
}
