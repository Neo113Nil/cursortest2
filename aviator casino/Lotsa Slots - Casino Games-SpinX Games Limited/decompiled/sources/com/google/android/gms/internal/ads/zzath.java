package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzath {
    private final java.util.concurrent.atomic.AtomicInteger zza;
    private final java.util.Set zzb;
    private final java.util.concurrent.PriorityBlockingQueue zzc;
    private final java.util.concurrent.PriorityBlockingQueue zzd;
    private final com.google.android.gms.internal.ads.zzaso zze;
    private final com.google.android.gms.internal.ads.zzasx zzf;
    private final com.google.android.gms.internal.ads.zzasy[] zzg;
    private com.google.android.gms.internal.ads.zzasq zzh;
    private final java.util.List zzi;
    private final java.util.List zzj;
    private final com.google.android.gms.internal.ads.zzasv zzk;

    public zzath(com.google.android.gms.internal.ads.zzaso zzasoVar, com.google.android.gms.internal.ads.zzasx zzasxVar, int i) {
        com.google.android.gms.internal.ads.zzasv zzasvVar = new com.google.android.gms.internal.ads.zzasv(new android.os.Handler(android.os.Looper.getMainLooper()));
        this.zza = new java.util.concurrent.atomic.AtomicInteger();
        this.zzb = new java.util.HashSet();
        this.zzc = new java.util.concurrent.PriorityBlockingQueue();
        this.zzd = new java.util.concurrent.PriorityBlockingQueue();
        this.zzi = new java.util.ArrayList();
        this.zzj = new java.util.ArrayList();
        this.zze = zzasoVar;
        this.zzf = zzasxVar;
        this.zzg = new com.google.android.gms.internal.ads.zzasy[4];
        this.zzk = zzasvVar;
    }

    public final void zza() {
        com.google.android.gms.internal.ads.zzasq zzasqVar = this.zzh;
        if (zzasqVar != null) {
            zzasqVar.zza();
        }
        com.google.android.gms.internal.ads.zzasy[] zzasyVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            com.google.android.gms.internal.ads.zzasy zzasyVar = zzasyVarArr[i];
            if (zzasyVar != null) {
                zzasyVar.zza();
            }
        }
        java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        com.google.android.gms.internal.ads.zzaso zzasoVar = this.zze;
        com.google.android.gms.internal.ads.zzasv zzasvVar = this.zzk;
        com.google.android.gms.internal.ads.zzasq zzasqVar2 = new com.google.android.gms.internal.ads.zzasq(priorityBlockingQueue, priorityBlockingQueue2, zzasoVar, zzasvVar);
        this.zzh = zzasqVar2;
        zzasqVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            com.google.android.gms.internal.ads.zzasy zzasyVar2 = new com.google.android.gms.internal.ads.zzasy(priorityBlockingQueue2, this.zzf, zzasoVar, zzasvVar);
            zzasyVarArr[i2] = zzasyVar2;
            zzasyVar2.start();
        }
    }

    public final com.google.android.gms.internal.ads.zzate zzb(com.google.android.gms.internal.ads.zzate zzateVar) {
        zzateVar.zzf(this);
        java.util.Set set = this.zzb;
        synchronized (set) {
            set.add(zzateVar);
        }
        zzateVar.zzg(this.zza.incrementAndGet());
        zzateVar.zzc("add-to-queue");
        zzd(zzateVar, 0);
        this.zzc.add(zzateVar);
        return zzateVar;
    }

    final void zzc(com.google.android.gms.internal.ads.zzate zzateVar) {
        java.util.Set set = this.zzb;
        synchronized (set) {
            set.remove(zzateVar);
        }
        java.util.List list = this.zzi;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzatg) it.next()).zza();
            }
        }
        zzd(zzateVar, 5);
    }

    final void zzd(com.google.android.gms.internal.ads.zzate zzateVar, int i) {
        java.util.List list = this.zzj;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzatf) it.next()).zza();
            }
        }
    }
}
