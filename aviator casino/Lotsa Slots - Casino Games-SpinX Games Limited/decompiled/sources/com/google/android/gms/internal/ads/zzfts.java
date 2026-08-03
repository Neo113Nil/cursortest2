package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfts implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfub zzb;

    zzfts(com.google.android.gms.internal.ads.zzfub zzfubVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        java.util.Objects.requireNonNull(zzfubVar);
        this.zzb = zzfubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzJ(this.zza);
    }
}
