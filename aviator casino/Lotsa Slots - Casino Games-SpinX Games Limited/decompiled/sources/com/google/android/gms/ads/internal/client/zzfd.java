package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzfd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfe zza;

    zzfd(com.google.android.gms.ads.internal.client.zzfe zzfeVar) {
        java.util.Objects.requireNonNull(zzfeVar);
        this.zza = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zzff zzffVar = this.zza.zza;
        if (zzffVar.zzc() != null) {
            try {
                zzffVar.zzc().zzc(1);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
