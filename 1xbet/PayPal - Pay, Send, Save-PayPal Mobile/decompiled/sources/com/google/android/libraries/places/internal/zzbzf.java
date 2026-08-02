package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbzf implements com.google.android.libraries.places.internal.zzbpl {
    private long zzA;
    private com.google.android.libraries.places.internal.zzbnp zzB;
    private boolean zzC;
    private final com.google.android.libraries.places.internal.zzbml zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.concurrent.ScheduledExecutorService zzg;
    private final com.google.android.libraries.places.internal.zzbmg zzh;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbzg zzi;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbta zzj;
    private final boolean zzk;
    private final com.google.android.libraries.places.internal.zzbyo zzm;
    private final long zzn;
    private final long zzo;

    @javax.annotation.Nullable
    private final com.google.android.libraries.places.internal.zzbze zzp;
    private com.google.android.libraries.places.internal.zzbys zzv;
    private long zzw;
    private com.google.android.libraries.places.internal.zzbpn zzx;
    private com.google.android.libraries.places.internal.zzbyp zzy;
    private com.google.android.libraries.places.internal.zzbyp zzz;
    static final com.google.android.libraries.places.internal.zzbmc zze = com.google.android.libraries.places.internal.zzbmc.zzc("grpc-previous-rpc-attempts", com.google.android.libraries.places.internal.zzbmg.zza);
    static final com.google.android.libraries.places.internal.zzbmc zzf = com.google.android.libraries.places.internal.zzbmc.zzc("grpc-retry-pushback-ms", com.google.android.libraries.places.internal.zzbmg.zza);
    private static final com.google.android.libraries.places.internal.zzbnp zza = com.google.android.libraries.places.internal.zzbnp.zzb.zze("Stream thrown away because RetriableStream committed");
    private static final java.util.Random zzD = new java.util.Random();
    private static final boolean zzE = com.google.android.libraries.places.internal.zzbsz.zzj("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    private final java.util.concurrent.Executor zzd = new com.google.android.libraries.places.internal.zzbnx(new com.google.android.libraries.places.internal.zzbxw(this));
    private final java.lang.Object zzl = new java.lang.Object();
    private final com.google.android.libraries.places.internal.zzbtf zzq = new com.google.android.libraries.places.internal.zzbtf();
    private volatile com.google.android.libraries.places.internal.zzbyu zzr = new com.google.android.libraries.places.internal.zzbyu(new java.util.ArrayList(8), java.util.Collections.emptyList(), null, null, false, false, false, 0);
    private final java.util.concurrent.atomic.AtomicBoolean zzs = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicInteger zzt = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger zzu = new java.util.concurrent.atomic.AtomicInteger();

    zzbzf(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbyo zzbyoVar, long j, long j2, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbzg zzbzgVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbta zzbtaVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbze zzbzeVar) {
        this.zzb = zzbmlVar;
        this.zzm = zzbyoVar;
        this.zzn = j;
        this.zzo = j2;
        this.zzc = executor;
        this.zzg = scheduledExecutorService;
        this.zzh = zzbmgVar;
        this.zzi = zzbzgVar;
        if (zzbzgVar != null) {
            this.zzA = zzbzgVar.zzb;
        }
        this.zzj = zzbtaVar;
        com.google.common.base.Preconditions.checkArgument(zzbzgVar == null || zzbtaVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.zzk = zzbtaVar != null;
        this.zzp = zzbzeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.Nullable
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final java.lang.Runnable zzo(com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        java.util.List list;
        java.util.Collection emptyList;
        boolean z;
        java.util.concurrent.Future future;
        java.util.concurrent.Future future2;
        synchronized (this.zzl) {
            if (this.zzr.zzf != null) {
                return null;
            }
            java.util.Collection collection = this.zzr.zzc;
            com.google.android.libraries.places.internal.zzbyu zzbyuVar = this.zzr;
            com.google.common.base.Preconditions.checkState(zzbyuVar.zzf == null, "Already committed");
            java.util.List list2 = zzbyuVar.zzb;
            if (zzbyuVar.zzc.contains(zzbzdVar)) {
                list = null;
                emptyList = java.util.Collections.singleton(zzbzdVar);
                z = true;
            } else {
                list = list2;
                emptyList = java.util.Collections.emptyList();
                z = false;
            }
            this.zzr = new com.google.android.libraries.places.internal.zzbyu(list, emptyList, zzbyuVar.zzd, zzbzdVar, zzbyuVar.zzg, z, zzbyuVar.zzh, zzbyuVar.zze);
            this.zzm.zza(-this.zzw);
            com.google.android.libraries.places.internal.zzbyp zzbypVar = this.zzy;
            boolean z2 = zzbypVar != null ? zzbypVar.zzc : false;
            if (zzbypVar != null) {
                java.util.concurrent.Future zzb = zzbypVar.zzb();
                this.zzy = null;
                future = zzb;
            } else {
                future = null;
            }
            com.google.android.libraries.places.internal.zzbyp zzbypVar2 = this.zzz;
            if (zzbypVar2 != null) {
                future2 = zzbypVar2.zzb();
                this.zzz = null;
            } else {
                future2 = null;
            }
            return new com.google.android.libraries.places.internal.zzbxy(this, collection, zzbzdVar, future, z2, future2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.Nullable
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zzbzd zzq(int i, boolean z, boolean z2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.zzu;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        com.google.android.libraries.places.internal.zzbzd zzbzdVar = new com.google.android.libraries.places.internal.zzbzd(i);
        com.google.android.libraries.places.internal.zzbyj zzbyjVar = new com.google.android.libraries.places.internal.zzbyj(this, new com.google.android.libraries.places.internal.zzbyn(this, zzbzdVar));
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = this.zzh;
        com.google.android.libraries.places.internal.zzbmg zzbmgVar2 = new com.google.android.libraries.places.internal.zzbmg();
        zzbmgVar2.zzf(zzbmgVar);
        if (i > 0) {
            zzbmgVar2.zzc(zze, java.lang.String.valueOf(i));
        }
        zzbzdVar.zza = zzh(zzbmgVar2, zzbyjVar, i, z, z2);
        return zzbzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r10 = (com.google.android.libraries.places.internal.zzbnx) r9.zzd;
        r10.zzb(r1);
        r10.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r10.zza.zzf(new com.google.android.libraries.places.internal.zzbzc(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r0 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r9.zzr.zzf != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r10 = r9.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r0.zzl(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r10 = com.google.android.libraries.places.internal.zzbzf.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r5 >= r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        r7 = (com.google.android.libraries.places.internal.zzbym) r3.get(r5);
        r7.zza(r10);
        r4 = r4 | (r7 instanceof com.google.android.libraries.places.internal.zzbyt);
        r7 = r9.zzr;
        r8 = r7.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r8 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r8 != r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r7.zzg == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0020, code lost:
    
        r9.zzr = r6.zza(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x002a, code lost:
    
        if (zzm() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        r1 = new com.google.android.libraries.places.internal.zzbyk(r9);
     */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        int min;
        com.google.android.libraries.places.internal.zzbyk zzbykVar = null;
        int i = 0;
        boolean z = false;
        java.util.ArrayList arrayList = null;
        while (true) {
            synchronized (this.zzl) {
                com.google.android.libraries.places.internal.zzbyu zzbyuVar = this.zzr;
                com.google.android.libraries.places.internal.zzbzd zzbzdVar2 = zzbyuVar.zzf;
                if (zzbzdVar2 == null || zzbzdVar2 == zzbzdVar) {
                    if (!zzbyuVar.zzg) {
                        java.util.List list = zzbyuVar.zzb;
                        if (i == list.size()) {
                            break;
                        }
                        if (zzbzdVar.zzb) {
                            return;
                        }
                        min = java.lang.Math.min(i + 128, list.size());
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList(list.subList(i, min));
                        } else {
                            arrayList.clear();
                            arrayList.addAll(list.subList(i, min));
                        }
                    }
                }
            }
            i = min;
        }
    }

    private final void zzai(com.google.android.libraries.places.internal.zzbym zzbymVar) {
        java.util.Collection collection;
        synchronized (this.zzl) {
            if (!this.zzr.zza) {
                this.zzr.zzb.add(zzbymVar);
            }
            collection = this.zzr.zzc;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzbymVar.zza((com.google.android.libraries.places.internal.zzbzd) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final boolean zzz(com.google.android.libraries.places.internal.zzbyu zzbyuVar) {
        return zzbyuVar.zzf == null && zzbyuVar.zze < this.zzj.zza && !zzbyuVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzak, reason: merged with bridge method [inline-methods] */
    public final void zzA() {
        java.util.concurrent.Future future;
        synchronized (this.zzl) {
            com.google.android.libraries.places.internal.zzbyp zzbypVar = this.zzz;
            future = null;
            if (zzbypVar != null) {
                java.util.concurrent.Future zzb = zzbypVar.zzb();
                this.zzz = null;
                future = zzb;
            }
            this.zzr = this.zzr.zzb();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzal, reason: merged with bridge method [inline-methods] */
    public final void zzB(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zzv = new com.google.android.libraries.places.internal.zzbys(zzbnpVar, zzbpmVar, zzbmgVar);
        if (this.zzu.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            com.google.android.libraries.places.internal.zzbnx zzbnxVar = (com.google.android.libraries.places.internal.zzbnx) this.zzd;
            zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbyl(this, zzbnpVar, zzbpmVar, zzbmgVar));
            zzbnxVar.zza();
        }
    }

    public static long zzj(long j) {
        return (long) (j * (zzE ? (zzD.nextDouble() * 0.8d) + 0.4d : zzD.nextDouble()));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zza(com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        zzai(new com.google.android.libraries.places.internal.zzbya(this, zzbjvVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzb(int i) {
        zzai(new com.google.android.libraries.places.internal.zzbyf(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzc(int i) {
        zzai(new com.google.android.libraries.places.internal.zzbye(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzd(com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        zzai(new com.google.android.libraries.places.internal.zzbyb(this, zzbjyVar));
    }

    @javax.annotation.Nullable
    abstract com.google.android.libraries.places.internal.zzbnp zze();

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzf(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        com.google.android.libraries.places.internal.zzbyp zzbypVar;
        com.google.android.libraries.places.internal.zzbze zzbzeVar;
        this.zzx = zzbpnVar;
        com.google.android.libraries.places.internal.zzbnp zze2 = zze();
        if (zze2 != null) {
            zzl(zze2);
            return;
        }
        synchronized (this.zzl) {
            this.zzr.zzb.add(new com.google.android.libraries.places.internal.zzbyt(this));
        }
        com.google.android.libraries.places.internal.zzbzd zzq = zzq(0, false, false);
        if (zzq == null) {
            return;
        }
        if (this.zzk) {
            java.lang.Object obj = this.zzl;
            synchronized (obj) {
                this.zzr = this.zzr.zzc(zzq);
                zzbypVar = null;
                if (zzz(this.zzr) && ((zzbzeVar = this.zzp) == null || zzbzeVar.zza())) {
                    zzbypVar = new com.google.android.libraries.places.internal.zzbyp(obj);
                    this.zzz = zzbypVar;
                }
            }
            if (zzbypVar != null) {
                zzbypVar.zza(this.zzg.schedule(new com.google.android.libraries.places.internal.zzbyr(this, zzbypVar), this.zzj.zzb, java.util.concurrent.TimeUnit.NANOSECONDS));
            }
        }
        zzx(zzq);
    }

    abstract void zzg();

    abstract com.google.android.libraries.places.internal.zzbpl zzh(com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbjb zzbjbVar, int i, boolean z, boolean z2);

    final void zzi(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzbyu zzbyuVar = this.zzr;
        if (zzbyuVar.zza) {
            zzbyuVar.zzf.zza.zzt(this.zzb.zze(obj));
        } else {
            zzai(new com.google.android.libraries.places.internal.zzbyi(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzk() {
        zzai(new com.google.android.libraries.places.internal.zzbyd(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzl(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.android.libraries.places.internal.zzbzd zzbzdVar;
        com.google.android.libraries.places.internal.zzbzd zzbzdVar2 = new com.google.android.libraries.places.internal.zzbzd(0);
        zzbzdVar2.zza = new com.google.android.libraries.places.internal.zzbwn();
        java.lang.Runnable zzo = zzo(zzbzdVar2);
        if (zzo != null) {
            synchronized (this.zzl) {
                this.zzr = this.zzr.zza(zzbzdVar2);
            }
            zzo.run();
            zzB(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, new com.google.android.libraries.places.internal.zzbmg());
            return;
        }
        synchronized (this.zzl) {
            if (this.zzr.zzc.contains(this.zzr.zzf)) {
                zzbzdVar = this.zzr.zzf;
            } else {
                this.zzB = zzbnpVar;
                zzbzdVar = null;
            }
            com.google.android.libraries.places.internal.zzbyu zzbyuVar = this.zzr;
            this.zzr = new com.google.android.libraries.places.internal.zzbyu(zzbyuVar.zzb, zzbyuVar.zzc, zzbyuVar.zzd, zzbyuVar.zzf, true, zzbyuVar.zza, zzbyuVar.zzh, zzbyuVar.zze);
        }
        if (zzbzdVar != null) {
            zzbzdVar.zza.zzl(zzbnpVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final boolean zzm() {
        java.util.Iterator it = this.zzr.zzc.iterator();
        while (it.hasNext()) {
            if (((com.google.android.libraries.places.internal.zzbzd) it.next()).zza.zzm()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzn(com.google.android.libraries.places.internal.zzbtf zzbtfVar) {
        com.google.android.libraries.places.internal.zzbyu zzbyuVar;
        synchronized (this.zzl) {
            zzbtfVar.zzb(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, this.zzq);
            zzbyuVar = this.zzr;
        }
        com.google.android.libraries.places.internal.zzbzd zzbzdVar = zzbyuVar.zzf;
        if (zzbzdVar != null) {
            com.google.android.libraries.places.internal.zzbtf zzbtfVar2 = new com.google.android.libraries.places.internal.zzbtf();
            zzbzdVar.zza.zzn(zzbtfVar2);
            zzbtfVar.zzb("committed", zzbtfVar2);
            return;
        }
        com.google.android.libraries.places.internal.zzbtf zzbtfVar3 = new com.google.android.libraries.places.internal.zzbtf();
        for (com.google.android.libraries.places.internal.zzbzd zzbzdVar2 : zzbyuVar.zzc) {
            com.google.android.libraries.places.internal.zzbtf zzbtfVar4 = new com.google.android.libraries.places.internal.zzbtf();
            zzbzdVar2.zza.zzn(zzbtfVar4);
            zzbtfVar3.zza(zzbtfVar4);
        }
        zzbtfVar.zzb("open", zzbtfVar3);
    }

    final /* synthetic */ void zzp(com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        java.lang.Runnable zzo = zzo(zzbzdVar);
        if (zzo != null) {
            this.zzc.execute(zzo);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzr() {
        zzai(new com.google.android.libraries.places.internal.zzbyg(this));
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzs(int i) {
        com.google.android.libraries.places.internal.zzbyu zzbyuVar = this.zzr;
        if (zzbyuVar.zza) {
            zzbyuVar.zzf.zza.zzs(i);
        } else {
            zzai(new com.google.android.libraries.places.internal.zzbyh(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzt(java.io.InputStream inputStream) {
        throw new java.lang.IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzu() {
        com.google.android.libraries.places.internal.zzbyu zzbyuVar = this.zzr;
        if (zzbyuVar.zza) {
            zzbyuVar.zzf.zza.zzu();
        } else {
            zzai(new com.google.android.libraries.places.internal.zzbyc(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzv(com.google.android.libraries.places.internal.zzbjj zzbjjVar) {
        zzai(new com.google.android.libraries.places.internal.zzbxz(this, zzbjjVar));
    }

    final /* synthetic */ void zzy(java.lang.Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            zzA();
            return;
        }
        java.lang.Object obj = this.zzl;
        synchronized (obj) {
            com.google.android.libraries.places.internal.zzbyp zzbypVar = this.zzz;
            if (zzbypVar == null) {
                return;
            }
            java.util.concurrent.Future zzb = zzbypVar.zzb();
            com.google.android.libraries.places.internal.zzbyp zzbypVar2 = new com.google.android.libraries.places.internal.zzbyp(obj);
            this.zzz = zzbypVar2;
            if (zzb != null) {
                zzb.cancel(false);
            }
            zzbypVar2.zza(this.zzg.schedule(new com.google.android.libraries.places.internal.zzbyr(this, zzbypVar2), num.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final com.google.android.libraries.places.internal.zzbio zzam() {
        throw null;
    }

    final /* synthetic */ void zzae(boolean z) {
        this.zzC = true;
    }

    final /* synthetic */ boolean zzad() {
        return this.zzC;
    }

    final /* synthetic */ void zzac(long j) {
        this.zzA = j;
    }

    final /* synthetic */ long zzab() {
        return this.zzA;
    }

    final /* synthetic */ void zzaa(com.google.android.libraries.places.internal.zzbyp zzbypVar) {
        this.zzz = zzbypVar;
    }

    final /* synthetic */ void zzZ(com.google.android.libraries.places.internal.zzbyp zzbypVar) {
        this.zzy = zzbypVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpn zzY() {
        return this.zzx;
    }

    final /* synthetic */ void zzX(long j) {
        this.zzw = j;
    }

    final /* synthetic */ long zzW() {
        return this.zzw;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbys zzV() {
        return this.zzv;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzU() {
        return this.zzu;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger zzT() {
        return this.zzt;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzS() {
        return this.zzs;
    }

    final /* synthetic */ void zzR(com.google.android.libraries.places.internal.zzbyu zzbyuVar) {
        this.zzr = zzbyuVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbyu zzQ() {
        return this.zzr;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbtf zzP() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbze zzO() {
        return this.zzp;
    }

    final /* synthetic */ long zzN() {
        return this.zzo;
    }

    final /* synthetic */ long zzM() {
        return this.zzn;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbyo zzL() {
        return this.zzm;
    }

    final /* synthetic */ java.lang.Object zzK() {
        return this.zzl;
    }

    final /* synthetic */ boolean zzJ() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbta zzI() {
        return this.zzj;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbzg zzH() {
        return this.zzi;
    }

    final /* synthetic */ java.util.concurrent.ScheduledExecutorService zzG() {
        return this.zzg;
    }

    final /* synthetic */ java.util.concurrent.Executor zzF() {
        return this.zzd;
    }

    final /* synthetic */ java.util.concurrent.Executor zzE() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbml zzD() {
        return this.zzb;
    }
}
