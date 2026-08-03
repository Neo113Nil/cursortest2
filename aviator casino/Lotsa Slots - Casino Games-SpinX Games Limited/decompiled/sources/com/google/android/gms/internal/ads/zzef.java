package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzef {
    private final java.lang.Thread zza;
    private final com.google.android.gms.internal.ads.zzdz zzb;
    private final com.google.android.gms.internal.ads.zzeb zzc;
    private final java.util.concurrent.CopyOnWriteArraySet zzd;
    private final java.util.ArrayDeque zze;
    private final java.util.ArrayDeque zzf;
    private final java.lang.Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzef(android.os.Looper looper, com.google.android.gms.internal.ads.zzdo zzdoVar, com.google.android.gms.internal.ads.zzeb zzebVar) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, looper.getThread(), zzdoVar, zzebVar, true);
    }

    private final void zzi() {
        if (this.zzi) {
            com.google.android.gms.internal.ads.zzgtj.zzi(zzb());
        }
    }

    public final com.google.android.gms.internal.ads.zzef zza(android.os.Looper looper, com.google.android.gms.internal.ads.zzdo zzdoVar, com.google.android.gms.internal.ads.zzeb zzebVar) {
        return new com.google.android.gms.internal.ads.zzef(this.zzd, looper, looper.getThread(), zzdoVar, zzebVar, this.zzi);
    }

    public final boolean zzb() {
        return java.lang.Thread.currentThread() == this.zza;
    }

    public final void zzd(java.lang.Object obj) {
        zzi();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzec zzecVar = (com.google.android.gms.internal.ads.zzec) it.next();
            if (zzecVar.zza.equals(obj)) {
                zzecVar.zzc(this.zzc);
                copyOnWriteArraySet.remove(zzecVar);
            }
        }
    }

    public final void zze(final int i, final com.google.android.gms.internal.ads.zzea zzeaVar) {
        zzi();
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzed
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.ads.zzea zzeaVar2 = zzeaVar;
                    ((com.google.android.gms.internal.ads.zzec) it.next()).zza(i, zzeaVar2);
                }
            }
        });
    }

    public final void zzf() {
        zzi();
        java.util.ArrayDeque arrayDeque = this.zzf;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.zzc != null) {
            com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzb;
            zzdzVar.getClass();
            if (!zzdzVar.zzb(1)) {
                zzdzVar.zzg(zzdzVar.zzc(1));
            }
        }
        java.util.ArrayDeque arrayDeque2 = this.zze;
        boolean isEmpty = true ^ arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((java.lang.Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void zzg() {
        zzi();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzec) it.next()).zzc(this.zzc);
        }
        copyOnWriteArraySet.clear();
    }

    final /* synthetic */ boolean zzh(android.os.Message message) {
        com.google.android.gms.internal.ads.zzeb zzebVar = this.zzc;
        zzebVar.getClass();
        java.util.Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzec) it.next()).zzb(zzebVar);
            com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzb;
            zzdzVar.getClass();
            if (zzdzVar.zzb(1)) {
                break;
            }
        }
        return true;
    }

    public zzef(java.lang.Thread thread) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    private zzef(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, android.os.Looper looper, java.lang.Thread thread, com.google.android.gms.internal.ads.zzdo zzdoVar, com.google.android.gms.internal.ads.zzeb zzebVar, boolean z) {
        this.zza = thread;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzebVar;
        this.zzg = new java.lang.Object();
        this.zze = new java.util.ArrayDeque();
        this.zzf = new java.util.ArrayDeque();
        this.zzb = (looper == null || zzdoVar == null || zzebVar == null) ? null : zzdoVar.zzd(looper, new android.os.Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzee
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(android.os.Message message) {
                com.google.android.gms.internal.ads.zzef.this.zzh(message);
                return true;
            }
        });
        this.zzi = z;
    }

    public final void zzc(java.lang.Object obj) {
        obj.getClass();
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new com.google.android.gms.internal.ads.zzec(obj));
        }
    }
}
