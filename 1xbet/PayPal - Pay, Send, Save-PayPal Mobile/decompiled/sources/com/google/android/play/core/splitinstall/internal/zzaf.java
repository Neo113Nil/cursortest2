package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzaf {
    private static final java.util.Map zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final com.google.android.play.core.splitinstall.internal.zzu zzc;
    private boolean zzh;
    private final android.content.Intent zzi;
    private android.content.ServiceConnection zzm;
    private android.os.IInterface zzn;
    private final com.google.android.play.core.splitinstall.zzak zzo;
    private final java.util.List zze = new java.util.ArrayList();
    private final java.util.Set zzf = new java.util.HashSet();
    private final java.lang.Object zzg = new java.lang.Object();
    private final android.os.IBinder.DeathRecipient zzk = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.zzx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.google.android.play.core.splitinstall.internal.zzaf.zzj(com.google.android.play.core.splitinstall.internal.zzaf.this);
        }
    };
    private final java.util.concurrent.atomic.AtomicInteger zzl = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.lang.String zzd = "SplitInstallService";
    private final java.lang.ref.WeakReference zzj = new java.lang.ref.WeakReference(null);

    public zzaf(android.content.Context context, com.google.android.play.core.splitinstall.internal.zzu zzuVar, java.lang.String str, android.content.Intent intent, com.google.android.play.core.splitinstall.zzak zzakVar, com.google.android.play.core.splitinstall.internal.zzaa zzaaVar) {
        this.zzb = context;
        this.zzc = zzuVar;
        this.zzi = intent;
        this.zzo = zzakVar;
    }

    public static /* synthetic */ void zzj(com.google.android.play.core.splitinstall.internal.zzaf zzafVar) {
        zzafVar.zzc.zzd("reportBinderDeath", new java.lang.Object[0]);
        com.google.android.play.core.splitinstall.internal.zzaa zzaaVar = (com.google.android.play.core.splitinstall.internal.zzaa) zzafVar.zzj.get();
        if (zzaaVar != null) {
            zzafVar.zzc.zzd("calling onBinderDied", new java.lang.Object[0]);
            zzaaVar.zza();
        } else {
            zzafVar.zzc.zzd("%s : Binder has died.", zzafVar.zzd);
            java.util.Iterator it = zzafVar.zze.iterator();
            while (it.hasNext()) {
                ((com.google.android.play.core.splitinstall.internal.zzv) it.next()).zzb(zzafVar.zzv());
            }
            zzafVar.zze.clear();
        }
        synchronized (zzafVar.zzg) {
            zzafVar.zzw();
        }
    }

    static /* synthetic */ void zzn(final com.google.android.play.core.splitinstall.internal.zzaf zzafVar, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzafVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.play.core.splitinstall.internal.zzw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.play.core.splitinstall.internal.zzaf.this.zzt(taskCompletionSource, task);
            }
        });
    }

    static /* synthetic */ void zzq(com.google.android.play.core.splitinstall.internal.zzaf zzafVar) {
        zzafVar.zzc.zzd("linkToDeath", new java.lang.Object[0]);
        try {
            zzafVar.zzn.asBinder().linkToDeath(zzafVar.zzk, 0);
        } catch (android.os.RemoteException e) {
            zzafVar.zzc.zzc(e, "linkToDeath failed", new java.lang.Object[0]);
        }
    }

    static /* synthetic */ void zzr(com.google.android.play.core.splitinstall.internal.zzaf zzafVar) {
        zzafVar.zzc.zzd("unlinkToDeath", new java.lang.Object[0]);
        zzafVar.zzn.asBinder().unlinkToDeath(zzafVar.zzk, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() {
        java.util.Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.tasks.TaskCompletionSource) it.next()).trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final android.os.Handler zzc() {
        android.os.Handler handler;
        java.util.Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new android.os.Handler(handlerThread.getLooper()));
            }
            handler = (android.os.Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final void zzs(com.google.android.play.core.splitinstall.internal.zzv zzvVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        zzc().post(new com.google.android.play.core.splitinstall.internal.zzy(this, zzvVar.zza(), taskCompletionSource, zzvVar));
    }

    final /* synthetic */ void zzt(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        zzc().post(new com.google.android.play.core.splitinstall.internal.zzz(this));
    }

    private final android.os.RemoteException zzv() {
        return new android.os.RemoteException(java.lang.String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    static /* synthetic */ void zzp(com.google.android.play.core.splitinstall.internal.zzaf zzafVar, com.google.android.play.core.splitinstall.internal.zzv zzvVar) {
        if (zzafVar.zzn != null || zzafVar.zzh) {
            if (!zzafVar.zzh) {
                zzvVar.run();
                return;
            } else {
                zzafVar.zzc.zzd("Waiting to bind to the service.", new java.lang.Object[0]);
                zzafVar.zze.add(zzvVar);
                return;
            }
        }
        zzafVar.zzc.zzd("Initiate binding to the service.", new java.lang.Object[0]);
        zzafVar.zze.add(zzvVar);
        com.google.android.play.core.splitinstall.internal.zzae zzaeVar = new com.google.android.play.core.splitinstall.internal.zzae(zzafVar, null);
        zzafVar.zzm = zzaeVar;
        zzafVar.zzh = true;
        if (zzafVar.zzb.bindService(zzafVar.zzi, zzaeVar, 1)) {
            return;
        }
        zzafVar.zzc.zzd("Failed to bind to the service.", new java.lang.Object[0]);
        zzafVar.zzh = false;
        java.util.Iterator it = zzafVar.zze.iterator();
        while (it.hasNext()) {
            ((com.google.android.play.core.splitinstall.internal.zzv) it.next()).zzb(new com.google.android.play.core.splitinstall.internal.zzag());
        }
        zzafVar.zze.clear();
    }

    public final android.os.IInterface zze() {
        return this.zzn;
    }
}
