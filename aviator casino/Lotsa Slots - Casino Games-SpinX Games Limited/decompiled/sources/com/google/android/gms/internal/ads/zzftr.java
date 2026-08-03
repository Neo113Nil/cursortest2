package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzftr implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfub zzc;

    zzftr(com.google.android.gms.internal.ads.zzfub zzfubVar, long j, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = j;
        this.zzb = zzdxVar;
        java.util.Objects.requireNonNull(zzfubVar);
        this.zzc = zzfubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String zzV;
        com.google.android.gms.internal.ads.zzfub zzfubVar = this.zzc;
        if (zzfubVar.zzN() != null) {
            long j = this.zza;
            zzV = com.google.android.gms.internal.ads.zzfub.zzV(this.zzb);
            int zzs = zzfubVar.zzs();
            int zzt = zzfubVar.zzt();
            java.lang.String zzM = zzfubVar.zzM();
            zzfubVar.zzN().zzi(j, zzV, zzfubVar.zzP(), zzs, zzt, zzM);
        }
    }
}
