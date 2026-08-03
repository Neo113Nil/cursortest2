package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfak implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;
    private final android.content.pm.PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzfak(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, android.content.pm.PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzhcgVar;
        this.zzb = zzfkyVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfaj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfak.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 26;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfal zzc() {
        return new com.google.android.gms.internal.ads.zzfal(this.zzb, this.zzc, this.zzd);
    }
}
