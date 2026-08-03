package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zznk extends com.google.android.gms.measurement.internal.zzg {
    private final com.google.android.gms.measurement.internal.zzne zza;
    private com.google.android.gms.measurement.internal.zzga zzb;
    private volatile java.lang.Boolean zzc;
    private final com.google.android.gms.measurement.internal.zzay zzd;
    private java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.measurement.internal.zzof zzf;
    private final java.util.List zzg;
    private final com.google.android.gms.measurement.internal.zzay zzh;

    protected zznk(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzg = new java.util.ArrayList();
        this.zzf = new com.google.android.gms.measurement.internal.zzof(zzibVar.zzaZ());
        this.zza = new com.google.android.gms.measurement.internal.zzne(this);
        this.zzd = new com.google.android.gms.measurement.internal.zzml(this, zzibVar);
        this.zzh = new com.google.android.gms.measurement.internal.zzmp(this, zzibVar);
    }

    private final boolean zzad() {
        this.zzu.zzaU();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzV() {
        zzg();
        this.zzf.zza();
        this.zzu.zzc();
        this.zzd.zzb(((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzY.zzb(null)).longValue());
    }

    private final void zzaf(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzg();
        if (zzh()) {
            runnable.run();
            return;
        }
        java.util.List list = this.zzg;
        long size = list.size();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzc();
        if (size >= 1000) {
            zzibVar.zzaV().zzb().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.zzh.zzb(60000L);
        zzI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzX() {
        zzg();
        com.google.android.gms.measurement.internal.zzgr zzk = this.zzu.zzaV().zzk();
        java.util.List list = this.zzg;
        zzk.zzb("Processing queued up service tasks", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((java.lang.Runnable) it.next()).run();
            } catch (java.lang.RuntimeException e) {
                this.zzu.zzaV().zzb().zzb("Task exception while flushing queue", e);
            }
        }
        this.zzg.clear();
        this.zzh.zzd();
    }

    private final com.google.android.gms.measurement.internal.zzr zzah(boolean z) {
        android.util.Pair zzb;
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaU();
        com.google.android.gms.measurement.internal.zzgh zzv = this.zzu.zzv();
        java.lang.String str = null;
        if (z) {
            com.google.android.gms.measurement.internal.zzib zzibVar2 = zzibVar.zzaV().zzu;
            if (zzibVar2.zzd().zzb != null && (zzb = zzibVar2.zzd().zzb.zzb()) != null && zzb != com.google.android.gms.measurement.internal.zzhg.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(zzb.second);
                java.lang.String str2 = (java.lang.String) zzb.first;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
        }
        return zzv.zzh(str);
    }

    protected final void zzA(com.google.android.gms.measurement.internal.zzpk zzpkVar) {
        zzg();
        zzb();
        zzad();
        zzaf(new com.google.android.gms.measurement.internal.zzmf(this, zzah(true), this.zzu.zzm().zzj(zzpkVar), zzpkVar));
    }

    protected final void zzB() {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzr zzah = zzah(false);
        zzad();
        this.zzu.zzm().zzh();
        zzaf(new com.google.android.gms.measurement.internal.zzmg(this, zzah));
    }

    public final void zzC(java.util.concurrent.atomic.AtomicReference atomicReference) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmh(this, atomicReference, zzah(false)));
    }

    public final void zzD(com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmi(this, zzah(false), zzcuVar));
    }

    protected final void zzE() {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzr zzah = zzah(true);
        zzad();
        this.zzu.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbc);
        this.zzu.zzm().zzn();
        zzaf(new com.google.android.gms.measurement.internal.zzmj(this, zzah, true));
    }

    protected final void zzF() {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmk(this, zzah(true)));
    }

    protected final void zzG(com.google.android.gms.measurement.internal.zzlt zzltVar) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmm(this, zzltVar));
    }

    public final void zzH(android.os.Bundle bundle) {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzbe zzbeVar = new com.google.android.gms.measurement.internal.zzbe(bundle);
        zzad();
        zzaf(new com.google.android.gms.measurement.internal.zzmn(this, true, zzah(false), this.zzu.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbc) && this.zzu.zzm().zzl(zzbeVar), zzbeVar, bundle));
    }

    final void zzI() {
        zzg();
        zzb();
        if (zzh()) {
            return;
        }
        if (zzK()) {
            this.zza.zzc();
            return;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzc().zzE()) {
            return;
        }
        zzibVar.zzaU();
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = zzibVar.zzaY().getPackageManager().queryIntentServices(new android.content.Intent().setClassName(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            zzibVar.zzaV().zzb().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.measurement.START");
        android.content.Context zzaY = zzibVar.zzaY();
        zzibVar.zzaU();
        intent.setComponent(new android.content.ComponentName(zzaY, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zza(intent);
    }

    final java.lang.Boolean zzJ() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzK() {
        zzg();
        zzb();
        if (this.zzc == null) {
            zzg();
            zzb();
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
            zzd.zzg();
            boolean z = false;
            java.lang.Boolean valueOf = !zzd.zzd().contains("use_service") ? null : java.lang.Boolean.valueOf(zzd.zzd().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                zzibVar.zzaU();
                if (this.zzu.zzv().zzo() != 1) {
                    zzibVar.zzaV().zzk().zza("Checking service availability");
                    int zzai = zzibVar.zzk().zzai(com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (zzai != 0) {
                        if (zzai != 1) {
                            if (zzai == 2) {
                                zzibVar.zzaV().zzj().zza("Service container out of date");
                                if (zzibVar.zzk().zzah() >= 17443) {
                                    z = valueOf == null;
                                }
                            } else if (zzai == 3) {
                                zzibVar.zzaV().zze().zza("Service disabled");
                            } else if (zzai == 9) {
                                zzibVar.zzaV().zze().zza("Service invalid");
                            } else if (zzai != 18) {
                                zzibVar.zzaV().zze().zzb("Unexpected service status", java.lang.Integer.valueOf(zzai));
                            } else {
                                zzibVar.zzaV().zze().zza("Service updating");
                            }
                            r2 = false;
                        } else {
                            zzibVar.zzaV().zzk().zza("Service missing");
                        }
                        if (z && zzibVar.zzc().zzE()) {
                            zzibVar.zzaV().zzb().zza("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            com.google.android.gms.measurement.internal.zzhg zzd2 = zzibVar.zzd();
                            zzd2.zzg();
                            android.content.SharedPreferences.Editor edit = zzd2.zzd().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r2 = z;
                    } else {
                        zzibVar.zzaV().zzk().zza("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r2) {
                }
                r2 = z;
            }
            this.zzc = java.lang.Boolean.valueOf(r2);
        }
        return this.zzc.booleanValue();
    }

    protected final void zzL(com.google.android.gms.measurement.internal.zzga zzgaVar) {
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgaVar);
        this.zzb = zzgaVar;
        zzV();
        zzX();
    }

    public final void zzM() {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzne zzneVar = this.zza;
        zzneVar.zzb();
        try {
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzu.zzaY(), zzneVar);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzN(com.google.android.gms.internal.measurement.zzcu zzcuVar, com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str) {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzk().zzai(com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0) {
            zzaf(new com.google.android.gms.measurement.internal.zzmo(this, zzbgVar, str, zzcuVar));
        } else {
            zzibVar.zzaV().zze().zza("Not bundling data. Service unavailable or out of date");
            zzibVar.zzk().zzao(zzcuVar, new byte[0]);
        }
    }

    final boolean zzO() {
        zzg();
        zzb();
        return !zzK() || this.zzu.zzk().zzah() >= ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzaJ.zzb(null)).intValue();
    }

    final boolean zzP() {
        zzg();
        zzb();
        return !zzK() || this.zzu.zzk().zzah() >= 241200;
    }

    final /* synthetic */ void zzQ() {
        com.google.android.gms.measurement.internal.zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            this.zzu.zzaV().zzb().zza("Failed to send storage consent settings to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzah = zzah(false);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzah);
            zzgaVar.zzy(zzah);
            zzV();
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to send storage consent settings to the service", e);
        }
    }

    final /* synthetic */ void zzR() {
        com.google.android.gms.measurement.internal.zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            this.zzu.zzaV().zzb().zza("Failed to send Dma consent settings to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzah = zzah(false);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzah);
            zzgaVar.zzz(zzah);
            zzV();
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to send Dma consent settings to the service", e);
        }
    }

    final /* synthetic */ void zzS(java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzga zzgaVar;
        synchronized (atomicReference) {
            try {
                zzgaVar = this.zzb;
            } catch (android.os.RemoteException e) {
                this.zzu.zzaV().zzb().zzb("Failed to request trigger URIs; remote exception", e);
                atomicReference.notifyAll();
            }
            if (zzgaVar == null) {
                this.zzu.zzaV().zzb().zza("Failed to request trigger URIs; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
            zzgaVar.zzD(zzrVar, bundle, new com.google.android.gms.measurement.internal.zzmd(this, atomicReference));
            zzV();
        }
    }

    final /* synthetic */ void zzT(java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzon zzonVar) {
        com.google.android.gms.measurement.internal.zzga zzgaVar;
        synchronized (atomicReference) {
            try {
                zzgaVar = this.zzb;
            } catch (android.os.RemoteException e) {
                this.zzu.zzaV().zzb().zzb("[sgtm] Failed to get upload batches; remote exception", e);
                atomicReference.notifyAll();
            }
            if (zzgaVar == null) {
                this.zzu.zzaV().zzb().zza("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
            zzgaVar.zzB(zzrVar, zzonVar, new com.google.android.gms.measurement.internal.zzme(this, atomicReference));
            zzV();
        }
    }

    final /* synthetic */ void zzU(com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzaf zzafVar) {
        com.google.android.gms.measurement.internal.zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            this.zzu.zzaV().zzb().zza("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            zzgaVar.zzC(zzrVar, zzafVar);
            zzV();
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zzb().zzc("[sgtm] Failed to update batch upload status, rowId, exception", java.lang.Long.valueOf(zzafVar.zza), e);
        }
    }

    final /* synthetic */ void zzW(android.content.ComponentName componentName) {
        zzg();
        if (this.zzb != null) {
            this.zzb = null;
            this.zzu.zzaV().zzk().zzb("Disconnected from device MeasurementService", componentName);
            zzg();
            zzI();
        }
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzne zzY() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzga zzZ() {
        return this.zzb;
    }

    final /* synthetic */ void zzaa(com.google.android.gms.measurement.internal.zzga zzgaVar) {
        this.zzb = null;
    }

    final /* synthetic */ java.util.concurrent.ScheduledExecutorService zzab() {
        return this.zze;
    }

    final /* synthetic */ void zzac(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zze = scheduledExecutorService;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final boolean zzh() {
        zzg();
        zzb();
        return this.zzb != null;
    }

    protected final void zzi() {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmq(this, zzah(true)));
    }

    protected final void zzj(boolean z) {
        zzg();
        zzb();
        if (zzO()) {
            zzaf(new com.google.android.gms.measurement.internal.zzmr(this, zzah(false)));
        }
    }

    protected final void zzk(boolean z) {
        zzg();
        zzb();
        zzaf(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zznk.this.zzQ();
            }
        });
    }

    protected final void zzl() {
        zzg();
        zzb();
        zzaf(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zznk.this.zzR();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzm(com.google.android.gms.measurement.internal.zzga zzgaVar, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable, com.google.android.gms.measurement.internal.zzr zzrVar) {
        int i;
        java.lang.String str;
        long j;
        long j2;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        long currentTimeMillis;
        long j3;
        zzg();
        zzb();
        zzad();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        zzibVar2.zzc();
        com.google.android.gms.measurement.internal.zzr zzrVar2 = zzrVar;
        int i2 = 0;
        int i3 = 100;
        for (int i4 = 100; i2 < 1001 && i3 == i4; i4 = 100) {
            com.google.android.gms.measurement.internal.zzib zzibVar3 = this.zzu;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List zzm = zzibVar3.zzm().zzm(i4);
            if (zzm != null) {
                arrayList.addAll(zzm);
                i3 = zzm.size();
            } else {
                i3 = 0;
            }
            if (abstractSafeParcelable != null && i3 < i4) {
                arrayList.add(new com.google.android.gms.measurement.internal.zzgj(abstractSafeParcelable, zzrVar2.zzc, zzrVar2.zzj));
            }
            java.lang.String str2 = null;
            boolean zzp = zzibVar2.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaO);
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                com.google.android.gms.measurement.internal.zzgj zzgjVar = (com.google.android.gms.measurement.internal.zzgj) arrayList.get(i5);
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable2 = zzgjVar.zza;
                if (zzibVar2.zzc().zzp(str2, com.google.android.gms.measurement.internal.zzfx.zzbc)) {
                    java.lang.String str3 = zzgjVar.zzb;
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        i = i5;
                        zzrVar2 = new com.google.android.gms.measurement.internal.zzr(zzrVar2.zza, zzrVar2.zzb, str3, zzgjVar.zzc, zzrVar2.zzd, zzrVar2.zze, zzrVar2.zzf, zzrVar2.zzg, zzrVar2.zzh, zzrVar2.zzi, zzrVar2.zzk, zzrVar2.zzl, zzrVar2.zzm, zzrVar2.zzn, zzrVar2.zzo, zzrVar2.zzp, zzrVar2.zzq, zzrVar2.zzr, zzrVar2.zzs, zzrVar2.zzt, zzrVar2.zzu, zzrVar2.zzv, zzrVar2.zzw, zzrVar2.zzx, zzrVar2.zzy, zzrVar2.zzz, zzrVar2.zzA, zzrVar2.zzB, zzrVar2.zzC, zzrVar2.zzD, zzrVar2.zzE);
                        com.google.android.gms.measurement.internal.zzr zzrVar3 = zzrVar2;
                        if (!(abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzbg)) {
                            if (zzp) {
                                try {
                                    zzibVar = this.zzu;
                                    currentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
                                } catch (android.os.RemoteException e) {
                                    e = e;
                                    j = 0;
                                    j2 = 0;
                                }
                                try {
                                    j3 = currentTimeMillis;
                                    j2 = zzibVar.zzaZ().elapsedRealtime();
                                } catch (android.os.RemoteException e2) {
                                    e = e2;
                                    j2 = 0;
                                    j = currentTimeMillis;
                                    this.zzu.zzaV().zzb().zzb("Failed to send event to the service", e);
                                    if (zzp && j != 0) {
                                        com.google.android.gms.measurement.internal.zzib zzibVar4 = this.zzu;
                                        com.google.android.gms.measurement.internal.zzgp.zza(zzibVar4).zzb(36301, 13, j, zzibVar4.zzaZ().currentTimeMillis(), (int) (zzibVar4.zzaZ().elapsedRealtime() - j2));
                                    }
                                    str = null;
                                    i5 = i + 1;
                                    zzrVar2 = zzrVar3;
                                    str2 = str;
                                }
                            } else {
                                j3 = 0;
                                j2 = 0;
                            }
                            try {
                                zzgaVar.zze((com.google.android.gms.measurement.internal.zzbg) abstractSafeParcelable2, zzrVar3);
                                if (zzp) {
                                    zzibVar2.zzaV().zzk().zza("Logging telemetry for logEvent from database");
                                    com.google.android.gms.measurement.internal.zzib zzibVar5 = this.zzu;
                                    com.google.android.gms.measurement.internal.zzgp.zza(zzibVar5).zzb(36301, 0, j3, zzibVar5.zzaZ().currentTimeMillis(), (int) (zzibVar5.zzaZ().elapsedRealtime() - j2));
                                }
                            } catch (android.os.RemoteException e3) {
                                e = e3;
                                j = j3;
                                this.zzu.zzaV().zzb().zzb("Failed to send event to the service", e);
                                if (zzp) {
                                    com.google.android.gms.measurement.internal.zzib zzibVar42 = this.zzu;
                                    com.google.android.gms.measurement.internal.zzgp.zza(zzibVar42).zzb(36301, 13, j, zzibVar42.zzaZ().currentTimeMillis(), (int) (zzibVar42.zzaZ().elapsedRealtime() - j2));
                                }
                                str = null;
                                i5 = i + 1;
                                zzrVar2 = zzrVar3;
                                str2 = str;
                            }
                        } else if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzpk) {
                            try {
                                zzgaVar.zzf((com.google.android.gms.measurement.internal.zzpk) abstractSafeParcelable2, zzrVar3);
                            } catch (android.os.RemoteException e4) {
                                this.zzu.zzaV().zzb().zzb("Failed to send user property to the service", e4);
                            }
                        } else if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzah) {
                            try {
                                zzgaVar.zzn((com.google.android.gms.measurement.internal.zzah) abstractSafeParcelable2, zzrVar3);
                            } catch (android.os.RemoteException e5) {
                                this.zzu.zzaV().zzb().zzb("Failed to send conditional user property to the service", e5);
                            }
                        } else {
                            com.google.android.gms.measurement.internal.zzib zzibVar6 = this.zzu;
                            str = null;
                            if (zzibVar6.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbc) && (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzbe)) {
                                try {
                                    zzgaVar.zzu(((com.google.android.gms.measurement.internal.zzbe) abstractSafeParcelable2).zzf(), zzrVar3);
                                } catch (android.os.RemoteException e6) {
                                    this.zzu.zzaV().zzb().zzb("Failed to send default event parameters to the service", e6);
                                }
                            } else {
                                zzibVar6.zzaV().zzb().zza("Discarding data. Unrecognized parcel type.");
                            }
                            i5 = i + 1;
                            zzrVar2 = zzrVar3;
                            str2 = str;
                        }
                        str = null;
                        i5 = i + 1;
                        zzrVar2 = zzrVar3;
                        str2 = str;
                    }
                }
                i = i5;
                com.google.android.gms.measurement.internal.zzr zzrVar32 = zzrVar2;
                if (!(abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzbg)) {
                }
                str = null;
                i5 = i + 1;
                zzrVar2 = zzrVar32;
                str2 = str;
            }
            i2++;
        }
    }

    protected final void zzn(com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbgVar);
        zzg();
        zzb();
        zzad();
        zzaf(new com.google.android.gms.measurement.internal.zzms(this, true, zzah(true), this.zzu.zzm().zzi(zzbgVar), zzbgVar, str));
    }

    protected final void zzp(com.google.android.gms.measurement.internal.zzah zzahVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar);
        zzg();
        zzb();
        this.zzu.zzaU();
        zzaf(new com.google.android.gms.measurement.internal.zzmt(this, true, zzah(true), this.zzu.zzm().zzk(zzahVar), new com.google.android.gms.measurement.internal.zzah(zzahVar), zzahVar));
    }

    protected final void zzq(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmu(this, atomicReference, null, str2, str3, zzah(false)));
    }

    protected final void zzs(com.google.android.gms.internal.measurement.zzcu zzcuVar, java.lang.String str, java.lang.String str2) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmv(this, str, str2, zzah(false), zzcuVar));
    }

    protected final void zzt(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmw(this, atomicReference, null, str2, str3, zzah(false), z));
    }

    protected final void zzu(com.google.android.gms.internal.measurement.zzcu zzcuVar, java.lang.String str, java.lang.String str2, boolean z) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmb(this, str, str2, zzah(false), z, zzcuVar));
    }

    protected final void zzv(java.util.concurrent.atomic.AtomicReference atomicReference, boolean z) {
        zzg();
        zzb();
        zzaf(new com.google.android.gms.measurement.internal.zzmc(this, atomicReference, zzah(false), z));
    }

    protected final void zzw(final java.util.concurrent.atomic.AtomicReference atomicReference, final android.os.Bundle bundle) {
        zzg();
        zzb();
        final com.google.android.gms.measurement.internal.zzr zzah = zzah(false);
        zzaf(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzng
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zznk.this.zzS(atomicReference, zzah, bundle);
            }
        });
    }

    protected final void zzx(final java.util.concurrent.atomic.AtomicReference atomicReference, final com.google.android.gms.measurement.internal.zzon zzonVar) {
        zzg();
        zzb();
        final com.google.android.gms.measurement.internal.zzr zzah = zzah(false);
        zzaf(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zznk.this.zzT(atomicReference, zzah, zzonVar);
            }
        });
    }

    protected final void zzy(final com.google.android.gms.measurement.internal.zzaf zzafVar) {
        zzg();
        zzb();
        final com.google.android.gms.measurement.internal.zzr zzah = zzah(true);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzah);
        zzaf(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zznk.this.zzU(zzah, zzafVar);
            }
        });
    }

    protected final com.google.android.gms.measurement.internal.zzao zzz() {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            zzI();
            this.zzu.zzaV().zzj().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        com.google.android.gms.measurement.internal.zzr zzah = zzah(false);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzah);
        try {
            com.google.android.gms.measurement.internal.zzao zzw = zzgaVar.zzw(zzah);
            zzV();
            return zzw;
        } catch (android.os.RemoteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to get consents; remote exception", e);
            return null;
        }
    }
}
