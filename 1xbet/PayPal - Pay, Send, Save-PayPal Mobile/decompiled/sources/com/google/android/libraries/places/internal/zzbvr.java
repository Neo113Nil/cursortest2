package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvr extends com.google.android.libraries.places.internal.zzblw implements com.google.android.libraries.places.internal.zzbkt {
    private final com.google.android.libraries.places.internal.zzbit zzA;
    private final java.util.List zzB;

    @javax.annotation.Nullable
    private final java.lang.String zzC;
    private com.google.android.libraries.places.internal.zzbmy zzD;
    private boolean zzE;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzbuz zzF;
    private boolean zzG;
    private final java.util.Set zzH;

    @javax.annotation.Nullable
    private java.util.Collection zzI;
    private final java.lang.Object zzJ;
    private final java.util.Set zzK;
    private final com.google.android.libraries.places.internal.zzbrb zzL;
    private final com.google.android.libraries.places.internal.zzbvq zzM;
    private final java.util.concurrent.atomic.AtomicBoolean zzN;
    private boolean zzO;
    private boolean zzP;
    private volatile boolean zzQ;
    private final java.util.concurrent.CountDownLatch zzR;
    private final com.google.android.libraries.places.internal.zzbpa zzS;
    private final com.google.android.libraries.places.internal.zzbpb zzT;
    private final com.google.android.libraries.places.internal.zzbpd zzU;
    private final com.google.android.libraries.places.internal.zzbiv zzV;
    private final com.google.android.libraries.places.internal.zzbkn zzW;
    private final com.google.android.libraries.places.internal.zzbvl zzX;
    private com.google.android.libraries.places.internal.zzbwb zzY;
    private boolean zzZ;
    private final boolean zzaa;
    private final com.google.android.libraries.places.internal.zzbyo zzab;
    private final long zzac;
    private final long zzad;
    private final boolean zzae;
    private final com.google.android.libraries.places.internal.zzbwc zzaf;
    private final com.google.android.libraries.places.internal.zzbur zzag;
    private final com.google.android.libraries.places.internal.zzbxv zzah;
    private final com.google.android.libraries.places.internal.zzbmo zzai;
    private int zzak;
    private final com.google.android.libraries.places.internal.zzbsg zzal;
    final com.google.android.libraries.places.internal.zzbnx zze;
    final com.google.android.libraries.places.internal.zzbte zzf;
    private final com.google.android.libraries.places.internal.zzbku zzj;
    private final java.lang.String zzk;
    private final java.net.URI zzl;
    private final com.google.android.libraries.places.internal.zzbmz zzm;
    private final com.google.android.libraries.places.internal.zzbmr zzn;
    private final com.google.android.libraries.places.internal.zzbov zzo;
    private final com.google.android.libraries.places.internal.zzbpq zzp;
    private final com.google.android.libraries.places.internal.zzbvm zzq;
    private final java.util.concurrent.Executor zzr;
    private final com.google.android.libraries.places.internal.zzbwo zzs;
    private final com.google.android.libraries.places.internal.zzbuv zzt;
    private final com.google.android.libraries.places.internal.zzbuv zzu;
    private final com.google.android.libraries.places.internal.zzcag zzv;
    private final com.google.android.libraries.places.internal.zzbjy zzw;
    private final com.google.common.base.Supplier zzx;
    private final long zzy;
    private final com.google.android.libraries.places.internal.zzbqc zzz;
    static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbvr.class.getName());
    static final com.google.android.libraries.places.internal.zzbnp zzb = com.google.android.libraries.places.internal.zzbnp.zzi.zze("Channel shutdownNow invoked");
    static final com.google.android.libraries.places.internal.zzbnp zzc = com.google.android.libraries.places.internal.zzbnp.zzi.zze("Channel shutdown invoked");
    static final com.google.android.libraries.places.internal.zzbnp zzd = com.google.android.libraries.places.internal.zzbnp.zzi.zze("Subchannel shutdown invoked");
    private static final com.google.android.libraries.places.internal.zzbwb zzg = new com.google.android.libraries.places.internal.zzbwb(null, new java.util.HashMap(), new java.util.HashMap(), null, null, null);
    private static final com.google.android.libraries.places.internal.zzbkq zzh = new com.google.android.libraries.places.internal.zzbui();
    private static final com.google.android.libraries.places.internal.zzblh zzi = new com.google.android.libraries.places.internal.zzbun();
    private static final com.google.android.libraries.places.internal.zzbix zzaj = new com.google.android.libraries.places.internal.zzbup();

    zzbvr(com.google.android.libraries.places.internal.zzbvw zzbvwVar, com.google.android.libraries.places.internal.zzbpq zzbpqVar, java.net.URI uri, com.google.android.libraries.places.internal.zzbmz zzbmzVar, com.google.android.libraries.places.internal.zzbsg zzbsgVar, com.google.android.libraries.places.internal.zzbwo zzbwoVar, com.google.common.base.Supplier supplier, java.util.List list, com.google.android.libraries.places.internal.zzcag zzcagVar) {
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = new com.google.android.libraries.places.internal.zzbnx(new com.google.android.libraries.places.internal.zzbuo(this));
        this.zze = zzbnxVar;
        this.zzz = new com.google.android.libraries.places.internal.zzbqc();
        this.zzH = new java.util.HashSet(16, 0.75f);
        this.zzJ = new java.lang.Object();
        this.zzK = new java.util.HashSet(1, 0.75f);
        byte[] bArr = null;
        this.zzM = new com.google.android.libraries.places.internal.zzbvq(this, bArr);
        this.zzN = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzR = new java.util.concurrent.CountDownLatch(1);
        this.zzak = 1;
        this.zzY = zzg;
        this.zzZ = false;
        this.zzab = new com.google.android.libraries.places.internal.zzbyo();
        com.google.android.libraries.places.internal.zzbuu zzbuuVar = new com.google.android.libraries.places.internal.zzbuu(this, bArr);
        this.zzaf = zzbuuVar;
        this.zzf = new com.google.android.libraries.places.internal.zzbuw(this, null);
        this.zzag = new com.google.android.libraries.places.internal.zzbur(this, null);
        java.lang.String str = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(zzbvwVar.zzh, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        this.zzk = str;
        com.google.android.libraries.places.internal.zzbku zzb2 = com.google.android.libraries.places.internal.zzbku.zzb("Channel", str);
        this.zzj = zzb2;
        this.zzv = (com.google.android.libraries.places.internal.zzcag) com.google.common.base.Preconditions.checkNotNull(zzcagVar, "timeProvider");
        com.google.android.libraries.places.internal.zzbwo zzbwoVar2 = (com.google.android.libraries.places.internal.zzbwo) com.google.common.base.Preconditions.checkNotNull(zzbvwVar.zzd, "executorPool");
        this.zzs = zzbwoVar2;
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull((java.util.concurrent.Executor) zzbwoVar2.zza(), "executor");
        this.zzr = executor;
        com.google.android.libraries.places.internal.zzbuv zzbuvVar = new com.google.android.libraries.places.internal.zzbuv((com.google.android.libraries.places.internal.zzbwo) com.google.common.base.Preconditions.checkNotNull(zzbvwVar.zze, "offloadExecutorPool"));
        this.zzu = zzbuvVar;
        com.google.android.libraries.places.internal.zzboz zzbozVar = new com.google.android.libraries.places.internal.zzboz(zzbpqVar, null, zzbuvVar);
        this.zzp = zzbozVar;
        new com.google.android.libraries.places.internal.zzboz(zzbpqVar, null, zzbuvVar);
        com.google.android.libraries.places.internal.zzbvm zzbvmVar = new com.google.android.libraries.places.internal.zzbvm(zzbozVar.zzb(), null);
        this.zzq = zzbvmVar;
        long zza2 = zzcagVar.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 14);
        sb.append("Channel for '");
        sb.append(str);
        sb.append("'");
        com.google.android.libraries.places.internal.zzbpd zzbpdVar = new com.google.android.libraries.places.internal.zzbpd(zzb2, 0, zza2, sb.toString());
        this.zzU = zzbpdVar;
        com.google.android.libraries.places.internal.zzbpc zzbpcVar = new com.google.android.libraries.places.internal.zzbpc(zzbpdVar, zzcagVar);
        this.zzV = zzbpcVar;
        com.google.android.libraries.places.internal.zzbnh zzbnhVar = com.google.android.libraries.places.internal.zzbsz.zzk;
        this.zzae = true;
        com.google.android.libraries.places.internal.zzbov zzbovVar = new com.google.android.libraries.places.internal.zzbov(com.google.android.libraries.places.internal.zzblt.zza(), zzbvwVar.zzj);
        this.zzo = zzbovVar;
        this.zzl = (java.net.URI) com.google.common.base.Preconditions.checkNotNull(uri, "targetUri");
        this.zzm = (com.google.android.libraries.places.internal.zzbmz) com.google.common.base.Preconditions.checkNotNull(zzbmzVar, "nameResolverProvider");
        com.google.android.libraries.places.internal.zzbzl zzbzlVar = new com.google.android.libraries.places.internal.zzbzl(true, 5, 5, zzbovVar);
        com.google.android.libraries.places.internal.zzbwm zzbwmVar = new com.google.android.libraries.places.internal.zzbwm(zzbvwVar.zzo, com.google.android.libraries.places.internal.zzbmn.zza());
        this.zzai = zzbwmVar;
        com.google.android.libraries.places.internal.zzbmq zzg2 = com.google.android.libraries.places.internal.zzbmr.zzg();
        zzbvwVar.zzc();
        zzg2.zza(443);
        zzg2.zzb(zzbnhVar);
        zzg2.zzc(zzbnxVar);
        zzg2.zzd(zzbvmVar);
        zzg2.zze(zzbzlVar);
        zzg2.zzf(zzbpcVar);
        zzg2.zzg(zzbuvVar);
        zzg2.zzh(zzbwmVar);
        zzg2.zzi(zzbvwVar.zzf);
        com.google.android.libraries.places.internal.zzbmr zzj = zzg2.zzj();
        this.zzn = zzj;
        this.zzD = zzf(uri, null, zzbmzVar, zzj);
        this.zzt = new com.google.android.libraries.places.internal.zzbuv(zzbwoVar);
        com.google.android.libraries.places.internal.zzbrb zzbrbVar = new com.google.android.libraries.places.internal.zzbrb(executor, zzbnxVar);
        this.zzL = zzbrbVar;
        zzbrbVar.zzaq(zzbuuVar);
        this.zzal = zzbsgVar;
        this.zzaa = true;
        com.google.android.libraries.places.internal.zzbvl zzbvlVar = new com.google.android.libraries.places.internal.zzbvl(this, this.zzD.zza(), null);
        this.zzX = zzbvlVar;
        this.zzA = com.google.android.libraries.places.internal.zzbja.zza(zzbvlVar, list);
        this.zzB = new java.util.ArrayList(zzbvwVar.zzg);
        this.zzx = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier, "stopwatchSupplier");
        long j = zzbvwVar.zzm;
        if (j == -1) {
            this.zzy = -1L;
        } else {
            com.google.common.base.Preconditions.checkArgument(j >= com.google.android.libraries.places.internal.zzbvw.zzb, "invalid idleTimeoutMillis %s", j);
            this.zzy = zzbvwVar.zzm;
        }
        this.zzah = new com.google.android.libraries.places.internal.zzbxv(new com.google.android.libraries.places.internal.zzbux(this, null), zzbnxVar, zzbozVar.zzb(), com.google.common.base.Stopwatch.createUnstarted());
        this.zzw = (com.google.android.libraries.places.internal.zzbjy) com.google.common.base.Preconditions.checkNotNull(zzbvwVar.zzk, "decompressorRegistry");
        this.zzC = zzbvwVar.zzi;
        this.zzad = 16777216L;
        this.zzac = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES;
        com.google.android.libraries.places.internal.zzbuk zzbukVar = new com.google.android.libraries.places.internal.zzbuk(this, zzcagVar);
        this.zzS = zzbukVar;
        this.zzT = zzbukVar.zza();
        com.google.android.libraries.places.internal.zzbkn zzbknVar = (com.google.android.libraries.places.internal.zzbkn) com.google.common.base.Preconditions.checkNotNull(zzbvwVar.zzn);
        this.zzW = zzbknVar;
        zzbknVar.zzc(this);
    }

    private final void zzao(boolean z) {
        this.zze.zzc();
        if (z) {
            com.google.common.base.Preconditions.checkState(this.zzE, "nameResolver is not started");
            com.google.common.base.Preconditions.checkState(this.zzF != null, "lbHelper is null");
        }
        com.google.android.libraries.places.internal.zzbmy zzbmyVar = this.zzD;
        if (zzbmyVar != null) {
            zzbmyVar.zzc();
            this.zzE = false;
            if (z) {
                this.zzD = zzf(this.zzl, null, this.zzm, this.zzn);
            } else {
                this.zzD = null;
            }
        }
        com.google.android.libraries.places.internal.zzbuz zzbuzVar = this.zzF;
        if (zzbuzVar != null) {
            zzbuzVar.zza.zzb();
            this.zzF = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzap, reason: merged with bridge method [inline-methods] */
    public final void zzm() {
        long j = this.zzy;
        if (j == -1) {
            return;
        }
        this.zzah.zza(j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    static com.google.android.libraries.places.internal.zzbmy zzf(java.net.URI uri, @javax.annotation.Nullable java.lang.String str, com.google.android.libraries.places.internal.zzbmz zzbmzVar, com.google.android.libraries.places.internal.zzbmr zzbmrVar) {
        com.google.android.libraries.places.internal.zzbmy zza2 = zzbmzVar.zza(uri, zzbmrVar);
        if (zza2 != null) {
            return new com.google.android.libraries.places.internal.zzbzk(zza2, new com.google.android.libraries.places.internal.zzbox(new com.google.android.libraries.places.internal.zzbsg(), zzbmrVar.zzd(), zzbmrVar.zzc()), zzbmrVar.zzc());
        }
        throw new java.lang.IllegalArgumentException("cannot create a NameResolver for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("logId", this.zzj.zzc()).add(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, this.zzk).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final com.google.android.libraries.places.internal.zzbix zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        return this.zzA.zza(zzbmlVar, zzbisVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final java.lang.String zzb() {
        return this.zzA.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public final /* synthetic */ com.google.android.libraries.places.internal.zzblw zzd() {
        zzg();
        return this;
    }

    final void zze() {
        this.zze.zzc();
        if (this.zzN.get() || this.zzG) {
            return;
        }
        if (this.zzf.zzb()) {
            this.zzah.zzb(false);
        } else {
            zzm();
        }
        if (this.zzF == null) {
            this.zzV.zza(2, "Exiting idle mode");
            com.google.android.libraries.places.internal.zzbuz zzbuzVar = new com.google.android.libraries.places.internal.zzbuz(this, null);
            zzbuzVar.zza = new com.google.android.libraries.places.internal.zzboq(this.zzo, zzbuzVar);
            this.zzF = zzbuzVar;
            this.zzz.zza(com.google.android.libraries.places.internal.zzbjn.CONNECTING);
            this.zzD.zzb(new com.google.android.libraries.places.internal.zzbvb(this, zzbuzVar, this.zzD));
            this.zzE = true;
        }
    }

    public final com.google.android.libraries.places.internal.zzbvr zzg() {
        com.google.android.libraries.places.internal.zzbiv zzbivVar = this.zzV;
        zzbivVar.zza(1, "shutdownNow() called");
        zzbivVar.zza(1, "shutdown() called");
        if (this.zzN.compareAndSet(false, true)) {
            com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zze;
            zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbul(this));
            zzbnxVar.zza();
            com.google.android.libraries.places.internal.zzbvl zzbvlVar = this.zzX;
            com.google.android.libraries.places.internal.zzbnx zzbnxVar2 = zzbvlVar.zza.zze;
            zzbnxVar2.zzb(new com.google.android.libraries.places.internal.zzbvd(zzbvlVar));
            zzbnxVar2.zza();
            zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbuj(this));
            zzbnxVar.zza();
        }
        com.google.android.libraries.places.internal.zzbvl zzbvlVar2 = this.zzX;
        com.google.android.libraries.places.internal.zzbnx zzbnxVar3 = zzbvlVar2.zza.zze;
        zzbnxVar3.zzb(new com.google.android.libraries.places.internal.zzbve(zzbvlVar2));
        zzbnxVar3.zza();
        com.google.android.libraries.places.internal.zzbnx zzbnxVar4 = this.zze;
        zzbnxVar4.zzb(new com.google.android.libraries.places.internal.zzbum(this));
        zzbnxVar4.zza();
        return this;
    }

    final void zzh(java.lang.Throwable th) {
        if (this.zzG) {
            return;
        }
        this.zzG = true;
        try {
            this.zzah.zzb(true);
            zzao(false);
        } finally {
            this.zzL.zzg(new com.google.android.libraries.places.internal.zzblf(com.google.android.libraries.places.internal.zzbli.zzc(com.google.android.libraries.places.internal.zzbnp.zzh.zze("Panic! This is a bug!").zzd(th))));
            this.zzX.zzc(null);
            this.zzV.zza(4, "PANIC! Entering TRANSIENT_FAILURE");
            this.zzz.zza(com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE);
        }
    }

    final /* synthetic */ void zzi() {
        if (this.zzO) {
            java.util.Iterator it = this.zzH.iterator();
            while (it.hasNext()) {
                ((com.google.android.libraries.places.internal.zzbua) it.next()).zze(zzb);
            }
            java.util.Iterator it2 = this.zzK.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
    }

    final /* synthetic */ void zzk() {
        zzao(true);
        com.google.android.libraries.places.internal.zzbrb zzbrbVar = this.zzL;
        zzbrbVar.zzg(null);
        this.zzV.zza(2, "Entering IDLE state");
        this.zzz.zza(com.google.android.libraries.places.internal.zzbjn.IDLE);
        if (this.zzf.zzc(this.zzJ, zzbrbVar)) {
            zze();
        }
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzah.zzb(true);
    }

    final /* synthetic */ void zzn() {
        this.zze.zzc();
        if (this.zzE) {
            this.zzD.zzd();
        }
    }

    final /* synthetic */ void zzo(com.google.android.libraries.places.internal.zzbln zzblnVar) {
        this.zzL.zzg(zzblnVar);
    }

    final /* synthetic */ java.util.concurrent.Executor zzp(com.google.android.libraries.places.internal.zzbis zzbisVar) {
        java.util.concurrent.Executor zzj = zzbisVar.zzj();
        return zzj == null ? this.zzr : zzj;
    }

    final /* synthetic */ void zzq() {
        if (!this.zzQ && this.zzN.get() && this.zzH.isEmpty() && this.zzK.isEmpty()) {
            this.zzV.zza(2, "Terminated");
            this.zzW.zzf(this);
            this.zzs.zzb(this.zzr);
            this.zzt.zzb();
            this.zzu.zzb();
            this.zzp.close();
            this.zzQ = true;
            this.zzR.countDown();
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjy zzz() {
        return this.zzw;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcag zzy() {
        return this.zzv;
    }

    final /* synthetic */ java.util.concurrent.Executor zzx() {
        return this.zzr;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbvm zzw() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpq zzv() {
        return this.zzp;
    }

    final /* synthetic */ java.lang.String zzu() {
        return this.zzk;
    }

    final /* synthetic */ void zzj(boolean z) {
        zzao(false);
    }

    @Override // com.google.android.libraries.places.internal.zzbkz
    public final com.google.android.libraries.places.internal.zzbku zzc() {
        return this.zzj;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbsg zzan() {
        return this.zzal;
    }

    final /* synthetic */ void zzam(int i) {
        this.zzak = i;
    }

    final /* synthetic */ int zzal() {
        return this.zzak;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbmo zzaj() {
        return this.zzai;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbur zzai() {
        return this.zzag;
    }

    final /* synthetic */ boolean zzah() {
        return this.zzae;
    }

    final /* synthetic */ long zzag() {
        return this.zzad;
    }

    final /* synthetic */ long zzaf() {
        return this.zzac;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbyo zzae() {
        return this.zzab;
    }

    final /* synthetic */ boolean zzad() {
        return this.zzaa;
    }

    final /* synthetic */ void zzac(boolean z) {
        this.zzZ = true;
    }

    final /* synthetic */ boolean zzab() {
        return this.zzZ;
    }

    final /* synthetic */ void zzaa(com.google.android.libraries.places.internal.zzbwb zzbwbVar) {
        this.zzY = zzbwbVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbwb zzZ() {
        return this.zzY;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbvl zzY() {
        return this.zzX;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbkn zzX() {
        return this.zzW;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbiv zzW() {
        return this.zzV;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpd zzV() {
        return this.zzU;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpb zzU() {
        return this.zzT;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpa zzT() {
        return this.zzS;
    }

    final /* synthetic */ boolean zzS() {
        return this.zzQ;
    }

    final /* synthetic */ void zzR(boolean z) {
        this.zzP = true;
    }

    final /* synthetic */ boolean zzQ() {
        return this.zzP;
    }

    final /* synthetic */ void zzP(boolean z) {
        this.zzO = true;
    }

    final /* synthetic */ boolean zzO() {
        return this.zzO;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzN() {
        return this.zzN;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbvq zzM() {
        return this.zzM;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbrb zzL() {
        return this.zzL;
    }

    final /* synthetic */ java.lang.Object zzK() {
        return this.zzJ;
    }

    final /* synthetic */ void zzJ(java.util.Collection collection) {
        this.zzI = collection;
    }

    final /* synthetic */ java.util.Collection zzI() {
        return this.zzI;
    }

    final /* synthetic */ java.util.Set zzH() {
        return this.zzH;
    }

    final /* synthetic */ boolean zzG() {
        return this.zzG;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbuz zzF() {
        return this.zzF;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbmy zzE() {
        return this.zzD;
    }

    final /* synthetic */ java.lang.String zzD() {
        return this.zzC;
    }

    final /* synthetic */ java.util.List zzC() {
        return this.zzB;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbqc zzB() {
        return this.zzz;
    }

    final /* synthetic */ com.google.common.base.Supplier zzA() {
        return this.zzx;
    }
}
