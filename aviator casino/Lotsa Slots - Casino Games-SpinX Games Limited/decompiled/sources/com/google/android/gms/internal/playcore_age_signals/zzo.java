package com.google.android.gms.internal.playcore_age_signals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public final class zzo {
    private static final java.util.Map zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.playcore_age_signals.zzd zzc;
    private boolean zzh;
    private final android.content.Intent zzi;
    private android.content.ServiceConnection zzm;
    private android.os.IInterface zzn;
    private final java.util.List zze = new java.util.ArrayList();
    private final java.util.Set zzf = new java.util.HashSet();
    private final java.lang.Object zzg = new java.lang.Object();
    private final android.os.IBinder.DeathRecipient zzk = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.playcore_age_signals.zzf
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.google.android.gms.internal.playcore_age_signals.zzo.zzj(com.google.android.gms.internal.playcore_age_signals.zzo.this);
        }
    };
    private final java.util.concurrent.atomic.AtomicInteger zzl = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.lang.String zzd = "AgeSignalsService";
    private final java.lang.ref.WeakReference zzj = new java.lang.ref.WeakReference(null);

    public zzo(android.content.Context context, com.google.android.gms.internal.playcore_age_signals.zzd zzdVar, java.lang.String str, android.content.Intent intent, com.google.android.play.agesignals.zzd zzdVar2, com.google.android.gms.internal.playcore_age_signals.zzj zzjVar) {
        this.zzb = context;
        this.zzc = zzdVar;
        this.zzi = intent;
    }

    public static /* synthetic */ void zzj(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar) {
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar = zzoVar.zzc;
        zzdVar.zzc("reportBinderDeath", new java.lang.Object[0]);
        com.google.android.gms.internal.playcore_age_signals.zzj zzjVar = (com.google.android.gms.internal.playcore_age_signals.zzj) zzoVar.zzj.get();
        if (zzjVar != null) {
            zzdVar.zzc("calling onBinderDied", new java.lang.Object[0]);
            zzjVar.zza();
        } else {
            zzdVar.zzc("%s : Binder has died.", zzoVar.zzd);
            java.util.List list = zzoVar.zze;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.playcore_age_signals.zze) it.next()).zza(zzoVar.zzv());
            }
            list.clear();
        }
        synchronized (zzoVar.zzg) {
            zzoVar.zzw();
        }
    }

    public static /* synthetic */ void zzk(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.Task task) {
        synchronized (zzoVar.zzg) {
            zzoVar.zzf.remove(taskCompletionSource);
        }
    }

    static /* bridge */ /* synthetic */ void zzo(final com.google.android.gms.internal.playcore_age_signals.zzo zzoVar, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzoVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.playcore_age_signals.zzg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.internal.playcore_age_signals.zzo.zzk(com.google.android.gms.internal.playcore_age_signals.zzo.this, taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void zzq(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar, com.google.android.gms.internal.playcore_age_signals.zze zzeVar) {
        if (zzoVar.zzn != null || zzoVar.zzh) {
            if (!zzoVar.zzh) {
                zzeVar.run();
                return;
            } else {
                zzoVar.zzc.zzc("Waiting to bind to the service.", new java.lang.Object[0]);
                zzoVar.zze.add(zzeVar);
                return;
            }
        }
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar = zzoVar.zzc;
        zzdVar.zzc("Initiate binding to the service.", new java.lang.Object[0]);
        java.util.List list = zzoVar.zze;
        list.add(zzeVar);
        com.google.android.gms.internal.playcore_age_signals.zzm zzmVar = new com.google.android.gms.internal.playcore_age_signals.zzm(zzoVar, null);
        zzoVar.zzm = zzmVar;
        zzoVar.zzh = true;
        if (zzoVar.zzb.bindService(zzoVar.zzi, zzmVar, 1)) {
            return;
        }
        zzdVar.zzc("Failed to bind to the service.", new java.lang.Object[0]);
        zzoVar.zzh = false;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.playcore_age_signals.zze) it.next()).zza(new com.google.android.gms.internal.playcore_age_signals.zzp());
        }
        list.clear();
    }

    static /* bridge */ /* synthetic */ void zzr(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar) {
        zzoVar.zzc.zzc("linkToDeath", new java.lang.Object[0]);
        try {
            zzoVar.zzn.asBinder().linkToDeath(zzoVar.zzk, 0);
        } catch (android.os.RemoteException e) {
            zzoVar.zzc.zzb(e, "linkToDeath failed", new java.lang.Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzs(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar) {
        zzoVar.zzc.zzc("unlinkToDeath", new java.lang.Object[0]);
        zzoVar.zzn.asBinder().unlinkToDeath(zzoVar.zzk, 0);
    }

    private final android.os.RemoteException zzv() {
        return new android.os.RemoteException(java.lang.String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() {
        java.util.Set set = this.zzf;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.tasks.TaskCompletionSource) it.next()).trySetException(zzv());
        }
        set.clear();
    }

    public final android.os.Handler zzc() {
        android.os.Handler handler;
        java.util.Map map = zza;
        synchronized (map) {
            java.lang.String str = this.zzd;
            if (!map.containsKey(str)) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, new android.os.Handler(handlerThread.getLooper()));
            }
            handler = (android.os.Handler) map.get(str);
        }
        return handler;
    }

    public final android.os.IInterface zze() {
        return this.zzn;
    }

    public final void zzt(com.google.android.gms.internal.playcore_age_signals.zze zzeVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzc().post(new com.google.android.gms.internal.playcore_age_signals.zzh(this, zzeVar.zzc(), taskCompletionSource, zzeVar));
    }

    public final void zzu(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        zzc().post(new com.google.android.gms.internal.playcore_age_signals.zzi(this));
    }
}
