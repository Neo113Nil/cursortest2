package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbfi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbfj zza;

    zzbfi(com.google.android.gms.internal.ads.zzbfj zzbfjVar) {
        java.util.Objects.requireNonNull(zzbfjVar);
        this.zza = zzbfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzbfj zzbfjVar = this.zza;
        synchronized (zzbfjVar.zzf()) {
            if (zzbfjVar.zzg().get() && zzbfjVar.zzh()) {
                zzbfjVar.zzg().set(false);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                java.util.Iterator it = zzbfjVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((com.google.android.gms.internal.ads.zzbfk) it.next()).zza(false);
                    } catch (java.lang.Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                    }
                }
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
