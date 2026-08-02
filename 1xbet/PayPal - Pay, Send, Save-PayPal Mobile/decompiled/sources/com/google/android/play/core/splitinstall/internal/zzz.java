package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzz extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzaf zza;

    zzz(com.google.android.play.core.splitinstall.internal.zzaf zzafVar) {
        this.zza = zzafVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        android.os.IInterface iInterface;
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        android.content.Context context;
        android.content.ServiceConnection serviceConnection;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2;
        com.google.android.play.core.splitinstall.internal.zzu zzuVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzuVar2 = this.zza.zzc;
                    zzuVar2.zzd("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
                    return;
                }
            }
            com.google.android.play.core.splitinstall.internal.zzaf zzafVar = this.zza;
            iInterface = zzafVar.zzn;
            if (iInterface != null) {
                zzuVar = zzafVar.zzc;
                zzuVar.zzd("Unbind from service.", new java.lang.Object[0]);
                com.google.android.play.core.splitinstall.internal.zzaf zzafVar2 = this.zza;
                context = zzafVar2.zzb;
                serviceConnection = zzafVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
