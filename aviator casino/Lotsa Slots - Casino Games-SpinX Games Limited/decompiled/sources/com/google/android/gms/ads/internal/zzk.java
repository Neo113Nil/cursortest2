package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzk implements java.lang.Runnable, com.google.android.gms.internal.ads.zzbak {
    private static final long zzc = java.lang.System.currentTimeMillis();
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final java.util.concurrent.Executor zzi;
    private final com.google.android.gms.internal.ads.zzfxg zzj;
    private android.content.Context zzk;
    private final android.content.Context zzl;
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final java.util.List zzd = new java.util.Vector();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    final java.util.concurrent.CountDownLatch zzb = new java.util.concurrent.CountDownLatch(1);

    public zzk(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        java.util.concurrent.ExecutorService newCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
        this.zzi = newCachedThreadPool;
        boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdn)).booleanValue();
        this.zzo = booleanValue;
        this.zzj = com.google.android.gms.internal.ads.zzfxg.zza(context, newCachedThreadPool, booleanValue);
        this.zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdk)).booleanValue();
        this.zzh = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdo)).booleanValue();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdm)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzep)).booleanValue()) {
            this.zza = zzm();
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzem)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(this);
            return;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(this);
        } else {
            run();
        }
    }

    private final void zzq() {
        java.util.List<java.lang.Object[]> list = this.zzd;
        com.google.android.gms.internal.ads.zzbak zzs = zzs();
        if (list.isEmpty() || zzs == null) {
            return;
        }
        for (java.lang.Object[] objArr : list) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    zzs.zzd((android.view.MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzs.zze(((java.lang.Integer) objArr[0]).intValue(), ((java.lang.Integer) objArr[1]).intValue(), ((java.lang.Integer) objArr[2]).intValue());
                }
            } catch (java.lang.NullPointerException unused) {
            }
        }
        this.zzd.clear();
    }

    private final void zzr(boolean z) {
        java.lang.String str = this.zzm.afmaVersion;
        android.content.Context zzt = zzt(this.zzk);
        com.google.android.gms.internal.ads.zzawn zze = com.google.android.gms.internal.ads.zzawo.zze();
        zze.zzb(z);
        zze.zza(str);
        this.zze.set(com.google.android.gms.internal.ads.zzbao.zzt(zzt, (com.google.android.gms.internal.ads.zzawo) zze.zzbu()));
    }

    private final com.google.android.gms.internal.ads.zzbak zzs() {
        return zzp() == 2 ? (com.google.android.gms.internal.ads.zzbak) this.zzf.get() : (com.google.android.gms.internal.ads.zzbak) this.zze.get();
    }

    private static final android.content.Context zzt(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final com.google.android.gms.internal.ads.zzbah zzu(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        com.google.android.gms.internal.ads.zzawn zze = com.google.android.gms.internal.ads.zzawo.zze();
        zze.zzb(z);
        zze.zza(versionInfoParcel.afmaVersion);
        return com.google.android.gms.internal.ads.zzbah.zza(zzt(context), (com.google.android.gms.internal.ads.zzawo) zze.zzbu(), z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzep)).booleanValue()) {
                this.zza = zzm();
            }
            boolean z = this.zzm.isClientJar;
            final boolean z2 = false;
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbI)).booleanValue() && z) {
                z2 = true;
            }
            if (zzp() == 1) {
                zzr(z2);
                if (this.zzp == 2) {
                    this.zzi.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.zzk.this.zzn(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    com.google.android.gms.internal.ads.zzbah zzu = zzu(this.zzk, this.zzm, z2, this.zzo);
                    this.zzf.set(zzu);
                    if (this.zzh && !zzu.zzb()) {
                        this.zzp = 1;
                        zzr(z2);
                    }
                } catch (java.lang.NullPointerException e) {
                    this.zzp = 1;
                    zzr(z2);
                    this.zzj.zzc(2031, java.lang.System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        }
    }

    public final boolean zza() {
        try {
            this.zzb.await();
            return true;
        } catch (java.lang.InterruptedException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final java.lang.String zzb(android.content.Context context, byte[] bArr) {
        com.google.android.gms.internal.ads.zzbak zzs;
        if (!zza() || (zzs = zzs()) == null) {
            return "";
        }
        zzq();
        try {
            return zzs.zzl(zzt(context));
        } catch (java.lang.NullPointerException unused) {
            return "";
        }
    }

    public final java.lang.String zzc() {
        int i = this.zzp;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? "2" : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzd(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzbak zzs = zzs();
        if (zzs == null) {
            this.zzd.add(new java.lang.Object[]{motionEvent});
            return;
        }
        zzq();
        try {
            zzs.zzd(motionEvent);
        } catch (java.lang.NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzbak zzs = zzs();
        if (zzs == null) {
            this.zzd.add(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)});
            return;
        }
        zzq();
        try {
            zzs.zze(i, i2, i3);
        } catch (java.lang.NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzf(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        if (!zza()) {
            return "";
        }
        com.google.android.gms.internal.ads.zzbak zzs = zzs();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, 4, null);
        }
        if (zzs == null) {
            return "";
        }
        zzq();
        try {
            return zzs.zzf(zzt(context), str, view, activity);
        } catch (java.lang.NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzg(android.content.Context context, java.lang.String str, android.view.View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzh(android.view.View view) {
        com.google.android.gms.internal.ads.zzbak zzs = zzs();
        if (zzs != null) {
            try {
                zzs.zzh(view);
            } catch (java.lang.NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzi(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.zzbak zzs;
        com.google.android.gms.internal.ads.zzbak zzs2;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdH)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzs2 = zzs()) == null) {
                return;
            }
            try {
                zzs2.zzi(stackTraceElementArr);
                return;
            } catch (java.lang.NullPointerException unused) {
                return;
            }
        }
        if (!zza() || (zzs = zzs()) == null) {
            return;
        }
        try {
            zzs.zzi(stackTraceElementArr);
        } catch (java.lang.NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzj(android.content.Context context, android.view.View view, android.app.Activity activity) {
        try {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmb)).booleanValue()) {
                com.google.android.gms.internal.ads.zzbak zzs = zzs();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
                }
                return zzs != null ? zzs.zzj(context, view, activity) : "";
            }
            if (!zza()) {
                return "";
            }
            com.google.android.gms.internal.ads.zzbak zzs2 = zzs();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
            }
            return zzs2 != null ? zzs2.zzj(context, view, activity) : "";
        } catch (java.lang.NullPointerException unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzk(final android.content.Context context) {
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.ads.internal.zzk.this.zzb(context, null);
                }
            }, this.zzi).get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdB)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return java.lang.Integer.toString(17);
        } catch (java.util.concurrent.TimeoutException unused2) {
            return com.google.android.gms.internal.ads.zzbad.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzl(android.content.Context context) {
        return zzb(context, null);
    }

    protected final boolean zzm() {
        android.content.Context context = this.zzk;
        com.google.android.gms.ads.internal.zzh zzhVar = new com.google.android.gms.ads.internal.zzh(this);
        com.google.android.gms.internal.ads.zzfxg zzfxgVar = this.zzj;
        return new com.google.android.gms.internal.ads.zzfyx(this.zzk, com.google.android.gms.internal.ads.zzfyd.zzb(context, zzfxgVar), zzhVar, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdl)).booleanValue()).zzd(1);
    }

    final /* synthetic */ void zzn(boolean z) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            zzu(this.zzl, this.zzn, z, this.zzo).zzm();
        } catch (java.lang.NullPointerException e) {
            this.zzj.zzc(2027, java.lang.System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfxg zzo() {
        return this.zzj;
    }

    protected final int zzp() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }
}
