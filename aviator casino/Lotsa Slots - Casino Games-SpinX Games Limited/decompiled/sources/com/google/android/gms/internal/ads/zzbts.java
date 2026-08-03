package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbts implements com.google.android.gms.internal.ads.zzcga {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zza;

    zzbts(com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        java.util.Objects.requireNonNull(zzbttVar);
        this.zza = zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        final com.google.android.gms.internal.ads.zzbsp zzbspVar = (com.google.android.gms.internal.ads.zzbsp) obj;
        com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbtr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy > Destroying engine.");
                com.google.android.gms.internal.ads.zzbsp zzbspVar2 = zzbspVar;
                zzbspVar2.zzn("/result", com.google.android.gms.internal.ads.zzbpp.zzo);
                zzbspVar2.zzj();
            }
        });
    }
}
