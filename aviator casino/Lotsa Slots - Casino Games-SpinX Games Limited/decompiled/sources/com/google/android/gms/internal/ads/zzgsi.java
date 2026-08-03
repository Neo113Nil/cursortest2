package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgsi {
    private final com.google.android.gms.internal.ads.zzgub zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzgsj zzc;
    private boolean zzf;
    private final android.content.Intent zzg;
    private android.content.ServiceConnection zzi;
    private android.os.IInterface zzj;
    private final java.util.List zze = new java.util.ArrayList();
    private final java.lang.String zzd = "OverlayDisplayService";
    private final android.os.IBinder.DeathRecipient zzh = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzgsd
        @Override // android.os.IBinder.DeathRecipient
        public final /* synthetic */ void binderDied() {
            com.google.android.gms.internal.ads.zzgsi.this.zzd();
        }
    };

    zzgsi(android.content.Context context, com.google.android.gms.internal.ads.zzgsj zzgsjVar, java.lang.String str, android.content.Intent intent, com.google.android.gms.internal.ads.zzgrz zzgrzVar) {
        this.zzb = context;
        this.zzc = zzgsjVar;
        final java.lang.String str2 = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = com.google.android.gms.internal.ads.zzguf.zza(new com.google.android.gms.internal.ads.zzgub(str2) { // from class: com.google.android.gms.internal.ads.zzgsh
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new android.os.Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final void zzh(final java.lang.Runnable runnable) {
        ((android.os.Handler) this.zza.zza()).post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgsg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgsi.this.zzg(runnable);
            }
        });
    }

    public final void zza(final java.lang.Runnable runnable) {
        zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgse
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgsi.this.zze(runnable);
            }
        });
    }

    public final void zzb() {
        zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgsf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgsi.this.zzf();
            }
        });
    }

    public final android.os.IInterface zzc() {
        return this.zzj;
    }

    final /* synthetic */ void zzd() {
        this.zzc.zza("%s : Binder has died.", this.zzd);
        java.util.List list = this.zze;
        synchronized (list) {
            list.clear();
        }
    }

    final /* synthetic */ void zze(java.lang.Runnable runnable) {
        if (this.zzj != null || this.zzf) {
            if (!this.zzf) {
                runnable.run();
                return;
            }
            this.zzc.zza("Waiting to bind to the service.", new java.lang.Object[0]);
            java.util.List list = this.zze;
            synchronized (list) {
                list.add(runnable);
            }
            return;
        }
        this.zzc.zza("Initiate binding to the service.", new java.lang.Object[0]);
        java.util.List list2 = this.zze;
        synchronized (list2) {
            list2.add(runnable);
        }
        com.google.android.gms.internal.ads.zzgsc zzgscVar = new com.google.android.gms.internal.ads.zzgsc(this, null);
        this.zzi = zzgscVar;
        this.zzf = true;
        if (this.zzb.bindService(this.zzg, zzgscVar, 1)) {
            return;
        }
        this.zzc.zza("Failed to bind to the service.", new java.lang.Object[0]);
        this.zzf = false;
        java.util.List list3 = this.zze;
        synchronized (list3) {
            list3.clear();
        }
    }

    final /* synthetic */ void zzf() {
        if (this.zzj != null) {
            this.zzc.zza("Unbind from service.", new java.lang.Object[0]);
            android.content.Context context = this.zzb;
            android.content.ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            java.util.List list = this.zze;
            synchronized (list) {
                list.clear();
            }
        }
    }

    final /* synthetic */ void zzg(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.RuntimeException e) {
            this.zzc.zzc("error caused by ", e);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgsj zzi() {
        return this.zzc;
    }

    final /* synthetic */ java.util.List zzj() {
        return this.zze;
    }

    final /* synthetic */ void zzk(boolean z) {
        this.zzf = false;
    }

    final /* synthetic */ android.os.IBinder.DeathRecipient zzl() {
        return this.zzh;
    }

    final /* synthetic */ android.os.IInterface zzm() {
        return this.zzj;
    }

    final /* synthetic */ void zzn(android.os.IInterface iInterface) {
        this.zzj = iInterface;
    }
}
