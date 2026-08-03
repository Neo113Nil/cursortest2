package com.google.android.gms.internal.playcore_age_signals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zzi extends com.google.android.gms.internal.playcore_age_signals.zze {
    final /* synthetic */ com.google.android.gms.internal.playcore_age_signals.zzo zza;

    zzi(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar) {
        java.util.Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        android.os.IInterface iInterface;
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar;
        android.content.Context context;
        android.content.ServiceConnection serviceConnection;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2;
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar2;
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zza;
        obj = zzoVar.zzg;
        synchronized (obj) {
            atomicInteger = zzoVar.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = zzoVar.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzdVar2 = zzoVar.zzc;
                    zzdVar2.zzc("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
                    return;
                }
            }
            iInterface = zzoVar.zzn;
            if (iInterface != null) {
                zzdVar = zzoVar.zzc;
                zzdVar.zzc("Unbind from service.", new java.lang.Object[0]);
                context = zzoVar.zzb;
                serviceConnection = zzoVar.zzm;
                context.unbindService(serviceConnection);
                zzoVar.zzh = false;
                zzoVar.zzn = null;
                zzoVar.zzm = null;
            }
            zzoVar.zzw();
        }
    }
}
