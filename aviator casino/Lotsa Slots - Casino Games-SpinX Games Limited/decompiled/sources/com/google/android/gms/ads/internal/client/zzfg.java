package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzfg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfh zza;

    zzfg(com.google.android.gms.ads.internal.client.zzfh zzfhVar) {
        java.util.Objects.requireNonNull(zzfhVar);
        this.zza = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zzfh zzfhVar = this.zza;
        if (zzfhVar.zzL() != null) {
            try {
                zzfhVar.zzL().zzc(1);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
