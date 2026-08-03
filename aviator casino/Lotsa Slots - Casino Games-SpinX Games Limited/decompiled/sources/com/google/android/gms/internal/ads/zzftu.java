package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzftu implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfub zza;

    zzftu(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        java.util.Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzfub zzfubVar = this.zza;
        if (zzfubVar.zzN() != null) {
            long currentTimeMillis = zzfubVar.zzO().currentTimeMillis();
            int zzs = zzfubVar.zzs();
            java.lang.String zzM = zzfubVar.zzM();
            zzfubVar.zzN().zzj(currentTimeMillis, zzfubVar.zzP(), zzs, zzM);
        }
    }
}
