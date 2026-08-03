package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyq implements com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzagb, com.google.android.gms.internal.ads.zzabv, com.google.android.gms.internal.ads.zzaca, com.google.android.gms.internal.ads.zzza {
    private static final java.util.Map zzb;
    private static final com.google.android.gms.internal.ads.zzv zzc;
    private boolean zzA;
    private com.google.android.gms.internal.ads.zzyp zzB;
    private com.google.android.gms.internal.ads.zzahb zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final android.net.Uri zzd;
    private final com.google.android.gms.internal.ads.zzhp zze;
    private final com.google.android.gms.internal.ads.zzun zzf;
    private final com.google.android.gms.internal.ads.zzxu zzg;
    private final com.google.android.gms.internal.ads.zzui zzh;
    private final com.google.android.gms.internal.ads.zzyi zzi;
    private final com.google.android.gms.internal.ads.zzabl zzj;
    private final long zzk;
    private final long zzl;
    private final com.google.android.gms.internal.ads.zzyd zzn;
    private com.google.android.gms.internal.ads.zzxh zzs;
    private com.google.android.gms.internal.ads.zzajd zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final com.google.android.gms.internal.ads.zzacd zzm = new com.google.android.gms.internal.ads.zzacd("ProgressiveMediaPeriod");
    private final com.google.android.gms.internal.ads.zzds zzo = new com.google.android.gms.internal.ads.zzds(com.google.android.gms.internal.ads.zzdo.zza);
    private final java.lang.Runnable zzp = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzym
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            com.google.android.gms.internal.ads.zzyq.this.zzD();
        }
    };
    private final java.lang.Runnable zzq = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzyj
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            com.google.android.gms.internal.ads.zzyq.this.zzE();
        }
    };
    private final android.os.Handler zzr = com.google.android.gms.internal.ads.zzfl.zzd(null);
    private com.google.android.gms.internal.ads.zzyo[] zzw = new com.google.android.gms.internal.ads.zzyo[0];
    private com.google.android.gms.internal.ads.zzzb[] zzv = new com.google.android.gms.internal.ads.zzzb[0];
    private com.google.android.gms.internal.ads.zzyg[] zzu = new com.google.android.gms.internal.ads.zzyg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = java.util.Collections.unmodifiableMap(hashMap);
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zza("icy");
        zztVar.zzo("application/x-icy");
        zzc = zztVar.zzO();
    }

    public zzyq(android.net.Uri uri, com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzyd zzydVar, com.google.android.gms.internal.ads.zzun zzunVar, com.google.android.gms.internal.ads.zzui zzuiVar, com.google.android.gms.internal.ads.zzabu zzabuVar, com.google.android.gms.internal.ads.zzxu zzxuVar, com.google.android.gms.internal.ads.zzyi zzyiVar, com.google.android.gms.internal.ads.zzabl zzablVar, java.lang.String str, int i, boolean z, int i2, com.google.android.gms.internal.ads.zzv zzvVar, long j, com.google.android.gms.internal.ads.zzacj zzacjVar) {
        this.zzd = uri;
        this.zze = zzhpVar;
        this.zzf = zzunVar;
        this.zzh = zzuiVar;
        this.zzg = zzxuVar;
        this.zzi = zzyiVar;
        this.zzj = zzablVar;
        this.zzk = i;
        this.zzn = zzydVar;
        this.zzl = j;
    }

    private final void zzR(int i) {
        zzaa();
        com.google.android.gms.internal.ads.zzyp zzypVar = this.zzB;
        boolean[] zArr = zzypVar.zzd;
        if (zArr[i]) {
            return;
        }
        com.google.android.gms.internal.ads.zzv zza = zzypVar.zza.zza(i).zza(0);
        this.zzg.zzh(new com.google.android.gms.internal.ads.zzxg(1, com.google.android.gms.internal.ads.zzas.zzf(zza.zzp), zza, 0, null, com.google.android.gms.internal.ads.zzfl.zzr(this.zzL), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i]) && !this.zzv[i].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
                    zzzbVar.zzg(false);
                }
                com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzs;
                zzxhVar.getClass();
                zzxhVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final com.google.android.gms.internal.ads.zzahk zzU(com.google.android.gms.internal.ads.zzyo zzyoVar) {
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            if (zzyoVar.equals(this.zzw[i])) {
                return this.zzv[i];
            }
        }
        if (this.zzx) {
            int i2 = zzyoVar.zza;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            com.google.android.gms.internal.ads.zzeg.zzc("ProgressiveMediaPeriod", sb.toString());
            return new com.google.android.gms.internal.ads.zzafv();
        }
        com.google.android.gms.internal.ads.zzzb zzzbVar = new com.google.android.gms.internal.ads.zzzb(this.zzj, this.zzf, this.zzh);
        com.google.android.gms.internal.ads.zzyg zzygVar = new com.google.android.gms.internal.ads.zzyg(zzzbVar);
        zzzbVar.zzz(this);
        int i3 = length + 1;
        com.google.android.gms.internal.ads.zzyo[] zzyoVarArr = (com.google.android.gms.internal.ads.zzyo[]) java.util.Arrays.copyOf(this.zzw, i3);
        zzyoVarArr[length] = zzyoVar;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzw = zzyoVarArr;
        com.google.android.gms.internal.ads.zzzb[] zzzbVarArr = (com.google.android.gms.internal.ads.zzzb[]) java.util.Arrays.copyOf(this.zzv, i3);
        zzzbVarArr[length] = zzzbVar;
        this.zzv = zzzbVarArr;
        com.google.android.gms.internal.ads.zzyg[] zzygVarArr = (com.google.android.gms.internal.ads.zzyg[]) java.util.Arrays.copyOf(this.zzu, i3);
        zzygVarArr[length] = zzygVar;
        this.zzu = zzygVarArr;
        return zzygVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
            if (zzzbVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            com.google.android.gms.internal.ads.zzv zzo = this.zzv[i4].zzo();
            zzo.getClass();
            int zzf = com.google.android.gms.internal.ads.zzas.zzf(zzo.zzp);
            int zzab = zzab(zzf);
            int zzab2 = zzab(i2);
            if (zzab > zzab2) {
                i2 = zzf;
            }
            if (zzab > zzab2) {
                i3 = i4;
            }
        }
        com.google.android.gms.internal.ads.zzbg[] zzbgVarArr = new com.google.android.gms.internal.ads.zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            com.google.android.gms.internal.ads.zzv zzo2 = this.zzv[i5].zzo();
            zzo2.getClass();
            java.lang.String str = zzo2.zzp;
            boolean zza = com.google.android.gms.internal.ads.zzas.zza(str);
            boolean z = zza || com.google.android.gms.internal.ads.zzas.zzb(str);
            zArr[i5] = z;
            this.zzz = z | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && com.google.android.gms.internal.ads.zzas.zzc(str);
            com.google.android.gms.internal.ads.zzajd zzajdVar = this.zzt;
            if (zzajdVar != null) {
                if (zza || this.zzw[i5].zzb) {
                    com.google.android.gms.internal.ads.zzap zzapVar = zzo2.zzl;
                    com.google.android.gms.internal.ads.zzap zzapVar2 = zzapVar == null ? new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzajdVar) : zzapVar.zzg(zzajdVar);
                    com.google.android.gms.internal.ads.zzt zza2 = zzo2.zza();
                    zza2.zzl(zzapVar2);
                    zzo2 = zza2.zzO();
                }
                if (zza && zzo2.zzh == -1 && zzo2.zzi == -1 && (i = zzajdVar.zza) != -1) {
                    com.google.android.gms.internal.ads.zzt zza3 = zzo2.zza();
                    zza3.zzi(i);
                    zzo2 = zza3.zzO();
                }
            }
            com.google.android.gms.internal.ads.zzv zzb2 = zzo2.zzb(this.zzf.zzb(zzo2));
            if (i5 != i3) {
                com.google.android.gms.internal.ads.zzt zza4 = zzb2.zza();
                zza4.zzm(java.lang.Integer.toString(i3));
                zzb2 = zza4.zzO();
            }
            zzbgVarArr[i5] = new com.google.android.gms.internal.ads.zzbg(java.lang.Integer.toString(i5), zzb2);
            this.zzI = zzb2.zzv | this.zzI;
            this.zzv[i5].zzi(Long.MIN_VALUE);
        }
        this.zzB = new com.google.android.gms.internal.ads.zzyp(new com.google.android.gms.internal.ads.zzzn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new com.google.android.gms.internal.ads.zzye(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzs;
        zzxhVar.getClass();
        zzxhVar.zzp(this);
    }

    private final void zzW() {
        com.google.android.gms.internal.ads.zzyh zzyhVar = new com.google.android.gms.internal.ads.zzyh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            com.google.android.gms.internal.ads.zzgtj.zzi(zzZ());
            long j = this.zzD;
            if (j != -9223372036854775807L && this.zzM > j) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            com.google.android.gms.internal.ads.zzahb zzahbVar = this.zzC;
            zzahbVar.getClass();
            zzyhVar.zzd(zzahbVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
                zzzbVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzyhVar, this, com.google.android.gms.internal.ads.zzabu.zza(this.zzF));
    }

    private final int zzX() {
        int i = 0;
        for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
            i += zzzbVar.zzj();
        }
        return i;
    }

    private final long zzY(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            com.google.android.gms.internal.ads.zzzb[] zzzbVarArr = this.zzv;
            if (i >= zzzbVarArr.length) {
                return j;
            }
            if (!z) {
                com.google.android.gms.internal.ads.zzyp zzypVar = this.zzB;
                zzypVar.getClass();
                i = zzypVar.zzc[i] ? 0 : i + 1;
            }
            j = java.lang.Math.max(j, zzzbVarArr[i].zzp());
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ void zzA(com.google.android.gms.internal.ads.zzabz zzabzVar, long j, long j2, boolean z) {
        com.google.android.gms.internal.ads.zzyh zzyhVar = (com.google.android.gms.internal.ads.zzyh) zzabzVar;
        com.google.android.gms.internal.ads.zzim zzf = zzyhVar.zzf();
        com.google.android.gms.internal.ads.zzxb zzxbVar = new com.google.android.gms.internal.ads.zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzyhVar.zze();
        this.zzg.zzf(zzxbVar, new com.google.android.gms.internal.ads.zzxg(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzfl.zzr(zzyhVar.zzg()), com.google.android.gms.internal.ads.zzfl.zzr(this.zzD)));
        if (z) {
            return;
        }
        for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
            zzzbVar.zzg(false);
        }
        if (this.zzJ > 0) {
            com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzs;
            zzxhVar.getClass();
            zzxhVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ void zzB(com.google.android.gms.internal.ads.zzabz zzabzVar, long j, long j2) {
        com.google.android.gms.internal.ads.zzyh zzyhVar = (com.google.android.gms.internal.ads.zzyh) zzabzVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long zzY = zzY(true);
            long j3 = zzY == Long.MIN_VALUE ? 0L : zzY + 10000;
            this.zzD = j3;
            this.zzi.zzb(j3, this.zzC, this.zzE);
        }
        com.google.android.gms.internal.ads.zzim zzf = zzyhVar.zzf();
        com.google.android.gms.internal.ads.zzxb zzxbVar = new com.google.android.gms.internal.ads.zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzyhVar.zze();
        this.zzg.zze(zzxbVar, new com.google.android.gms.internal.ads.zzxg(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzfl.zzr(zzyhVar.zzg()), com.google.android.gms.internal.ads.zzfl.zzr(this.zzD)));
        this.zzP = true;
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzs;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ void zzC(com.google.android.gms.internal.ads.zzabz zzabzVar, long j, long j2, int i) {
        com.google.android.gms.internal.ads.zzxb zzxbVar;
        com.google.android.gms.internal.ads.zzyh zzyhVar = (com.google.android.gms.internal.ads.zzyh) zzabzVar;
        com.google.android.gms.internal.ads.zzim zzf = zzyhVar.zzf();
        if (i == 0) {
            long zze = zzyhVar.zze();
            com.google.android.gms.internal.ads.zzht zzh = zzyhVar.zzh();
            zzxbVar = new com.google.android.gms.internal.ads.zzxb(zze, zzh, zzh.zza, java.util.Collections.emptyMap(), j, 0L, 0L);
        } else {
            zzxbVar = new com.google.android.gms.internal.ads.zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        }
        this.zzg.zzd(zzxbVar, new com.google.android.gms.internal.ads.zzxg(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzfl.zzr(zzyhVar.zzg()), com.google.android.gms.internal.ads.zzfl.zzr(this.zzD)), i);
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzyl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzyq.this.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ java.lang.Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ android.os.Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzajd zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(com.google.android.gms.internal.ads.zzajd zzajdVar) {
        this.zzt = zzajdVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
                zzzbVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(com.google.android.gms.internal.ads.zzxh zzxhVar, long j) {
        this.zzs = zzxhVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() throws java.io.IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final com.google.android.gms.internal.ads.zzzn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(com.google.android.gms.internal.ads.zzaba[] zzabaVarArr, boolean[] zArr, com.google.android.gms.internal.ads.zzzc[] zzzcVarArr, boolean[] zArr2, long j) {
        com.google.android.gms.internal.ads.zzaba zzabaVar;
        zzaa();
        com.google.android.gms.internal.ads.zzyp zzypVar = this.zzB;
        com.google.android.gms.internal.ads.zzzn zzznVar = zzypVar.zza;
        boolean[] zArr3 = zzypVar.zzc;
        int i = this.zzJ;
        int i2 = 0;
        for (int i3 = 0; i3 < zzabaVarArr.length; i3++) {
            com.google.android.gms.internal.ads.zzzc zzzcVar = zzzcVarArr[i3];
            if (zzzcVar != null && (zzabaVarArr[i3] == null || !zArr[i3])) {
                int zza = ((com.google.android.gms.internal.ads.zzyn) zzzcVar).zza();
                com.google.android.gms.internal.ads.zzgtj.zzi(zArr3[zza]);
                this.zzJ--;
                zArr3[zza] = false;
                zzzcVarArr[i3] = null;
            }
        }
        boolean z = !this.zzG ? j == 0 || this.zzA : i != 0;
        for (int i4 = 0; i4 < zzabaVarArr.length; i4++) {
            if (zzzcVarArr[i4] == null && (zzabaVar = zzabaVarArr[i4]) != null) {
                com.google.android.gms.internal.ads.zzgtj.zzi(zzabaVar.zze() == 1);
                com.google.android.gms.internal.ads.zzgtj.zzi(zzabaVar.zzf(0) == 0);
                int zzb2 = zzznVar.zzb(zzabaVar.zza());
                com.google.android.gms.internal.ads.zzgtj.zzi(!zArr3[zzb2]);
                this.zzJ++;
                zArr3[zzb2] = true;
                this.zzI = zzabaVar.zzc().zzv | this.zzI;
                zzzcVarArr[i4] = new com.google.android.gms.internal.ads.zzyn(this, zzb2);
                zArr2[i4] = true;
                if (!z) {
                    com.google.android.gms.internal.ads.zzzb zzzbVar = this.zzv[zzb2];
                    z = (zzzbVar.zzn() == 0 || zzzbVar.zzu(j, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            com.google.android.gms.internal.ads.zzacd zzacdVar = this.zzm;
            if (zzacdVar.zze()) {
                com.google.android.gms.internal.ads.zzzb[] zzzbVarArr = this.zzv;
                int length = zzzbVarArr.length;
                while (i2 < length) {
                    zzzbVarArr[i2].zzy();
                    i2++;
                }
                zzacdVar.zzf();
            } else {
                this.zzP = false;
                for (com.google.android.gms.internal.ads.zzzb zzzbVar2 : this.zzv) {
                    zzzbVar2.zzg(false);
                }
            }
        } else if (z) {
            j = zzj(j);
            while (i2 < zzzcVarArr.length) {
                if (zzzcVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzG = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j, boolean z) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            this.zzv[i].zzx(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        long j;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                com.google.android.gms.internal.ads.zzyp zzypVar = this.zzB;
                if (zzypVar.zzb[i] && zzypVar.zzc[i] && !this.zzv[i].zzq()) {
                    j = java.lang.Math.min(j, this.zzv[i].zzp());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzY(false);
        }
        return j == Long.MIN_VALUE ? this.zzL : j;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j) {
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j = 0;
        }
        this.zzH = false;
        long j2 = this.zzL;
        this.zzL = j;
        if (zzZ()) {
            this.zzM = j;
            return j;
        }
        if (this.zzF != 7 && (this.zzP || this.zzm.zze())) {
            int length = this.zzv.length;
            for (int i = 0; i < length; i++) {
                com.google.android.gms.internal.ads.zzzb zzzbVar = this.zzv[i];
                if (this.zzu[i].zzf() && (zzzbVar.zzn() != 0 || j2 != j)) {
                    if (this.zzA ? zzzbVar.zzt(zzzbVar.zzm()) : zzzbVar.zzu(j, this.zzP)) {
                        continue;
                    } else if (!zArr[i] && this.zzz) {
                    }
                }
            }
            return j;
        }
        this.zzN = false;
        this.zzM = j;
        this.zzP = false;
        this.zzI = false;
        com.google.android.gms.internal.ads.zzacd zzacdVar = this.zzm;
        if (zzacdVar.zze()) {
            for (com.google.android.gms.internal.ads.zzzb zzzbVar2 : this.zzv) {
                zzzbVar2.zzy();
            }
            zzacdVar.zzf();
        } else {
            zzacdVar.zzc();
            for (com.google.android.gms.internal.ads.zzzb zzzbVar3 : this.zzv) {
                zzzbVar3.zzg(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r22 == Long.MIN_VALUE) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0081  */
    @Override // com.google.android.gms.internal.ads.zzxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzk(long j, com.google.android.gms.internal.ads.zzni zzniVar) {
        long j2;
        boolean z;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        com.google.android.gms.internal.ads.zzagz zzc2 = this.zzC.zzc(j);
        com.google.android.gms.internal.ads.zzahc zzahcVar = zzc2.zza;
        com.google.android.gms.internal.ads.zzahc zzahcVar2 = zzc2.zzb;
        long j3 = zzniVar.zzd;
        if (j3 == 0) {
            if (zzniVar.zze == 0) {
                return j;
            }
            j3 = 0;
        }
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        long j4 = j - j3;
        long j5 = Long.MAX_VALUE;
        long j6 = (((j3 ^ j) > 0L ? 1 : ((j3 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j4) > 0L ? 1 : ((j ^ j4) == 0L ? 0 : -1)) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j7 = Long.MIN_VALUE;
        if (j6 == Long.MIN_VALUE) {
            if (j4 == Long.MIN_VALUE) {
                j4 = Long.MIN_VALUE;
            }
            j6 = Long.MIN_VALUE;
            long j8 = zzniVar.zze;
            long j9 = j + j8;
            j2 = !((((j ^ j9) > 0L ? 1 : ((j ^ j9) == 0L ? 0 : -1)) < 0) | (((j8 ^ j) > 0L ? 1 : ((j8 ^ j) == 0L ? 0 : -1)) >= 0)) ? j9 : ((j9 >>> 63) ^ 1) + Long.MAX_VALUE;
            if (j2 == Long.MIN_VALUE) {
                j7 = j9;
            }
            if (j2 != Long.MAX_VALUE) {
                int i = (j7 > Long.MAX_VALUE ? 1 : (j7 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j5 = j2;
            }
            long j10 = zzahcVar.zzb;
            z = j6 > j10 && j10 <= j5;
            long j11 = zzahcVar2.zzb;
            boolean z2 = j6 > j11 && j11 <= j5;
            if (z || !z2) {
                if (!z) {
                    return z2 ? j11 : j6;
                }
            } else if (java.lang.Math.abs(j10 - j) > java.lang.Math.abs(j11 - j)) {
                return j11;
            }
            return j10;
        }
        if (j6 == Long.MAX_VALUE) {
            if (j4 == Long.MAX_VALUE) {
                j6 = Long.MAX_VALUE;
            }
            j6 = Long.MIN_VALUE;
        }
        long j82 = zzniVar.zze;
        long j92 = j + j82;
        if (!((((j ^ j92) > 0L ? 1 : ((j ^ j92) == 0L ? 0 : -1)) < 0) | (((j82 ^ j) > 0L ? 1 : ((j82 ^ j) == 0L ? 0 : -1)) >= 0))) {
        }
        if (j2 == Long.MIN_VALUE) {
        }
        if (j2 != Long.MAX_VALUE) {
        }
        long j102 = zzahcVar.zzb;
        if (j6 > j102) {
        }
        long j112 = zzahcVar2.zzb;
        if (j6 > j112) {
        }
        if (z) {
        }
        if (!z) {
        }
        return j102;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(com.google.android.gms.internal.ads.zzma zzmaVar) {
        if (this.zzP) {
            return false;
        }
        com.google.android.gms.internal.ads.zzacd zzacdVar = this.zzm;
        if (zzacdVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zza = this.zzo.zza();
        if (zzacdVar.zze()) {
            return zza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final void zzo() {
        for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
            zzzbVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzp(int i) {
        return !zzT() && this.zzv[i].zzr(this.zzP);
    }

    final void zzq(int i) throws java.io.IOException {
        this.zzv[i].zzl();
        zzr();
    }

    final void zzr() throws java.io.IOException {
        this.zzm.zzh(com.google.android.gms.internal.ads.zzabu.zza(this.zzF));
    }

    final int zzs(int i, com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zziv zzivVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int zzs = this.zzv[i].zzs(zzlwVar, zzivVar, i2, this.zzP);
        if (zzs == -3) {
            zzS(i);
        }
        return zzs;
    }

    final int zzt(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        com.google.android.gms.internal.ads.zzzb zzzbVar = this.zzv[i];
        int zzv = zzzbVar.zzv(j, this.zzP);
        zzzbVar.zzw(zzv);
        if (zzv != 0) {
            return zzv;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final com.google.android.gms.internal.ads.zzahk zzu(int i, int i2) {
        return zzU(new com.google.android.gms.internal.ads.zzyo(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzw(final com.google.android.gms.internal.ads.zzahb zzahbVar) {
        this.zzr.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzyk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzyq.this.zzF(zzahbVar);
            }
        });
    }

    final com.google.android.gms.internal.ads.zzahk zzx() {
        return zzU(new com.google.android.gms.internal.ads.zzyo(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final void zzy(com.google.android.gms.internal.ads.zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzabx zzz(com.google.android.gms.internal.ads.zzabz zzabzVar, long j, long j2, java.io.IOException iOException, int i) {
        long min;
        com.google.android.gms.internal.ads.zzabx zza;
        com.google.android.gms.internal.ads.zzahb zzahbVar;
        com.google.android.gms.internal.ads.zzyh zzyhVar = (com.google.android.gms.internal.ads.zzyh) zzabzVar;
        com.google.android.gms.internal.ads.zzim zzf = zzyhVar.zzf();
        com.google.android.gms.internal.ads.zzxb zzxbVar = new com.google.android.gms.internal.ads.zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzyhVar.zzg();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        for (java.lang.Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof com.google.android.gms.internal.ads.zzat) || (th instanceof java.io.FileNotFoundException) || (th instanceof com.google.android.gms.internal.ads.zzid) || (th instanceof com.google.android.gms.internal.ads.zzacc) || ((th instanceof com.google.android.gms.internal.ads.zzhq) && ((com.google.android.gms.internal.ads.zzhq) th).zza == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = java.lang.Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            zza = com.google.android.gms.internal.ads.zzacd.zzb;
        } else {
            int zzX = zzX();
            boolean z = zzX > this.zzO;
            if (this.zzK || !((zzahbVar = this.zzC) == null || zzahbVar.zza() == -9223372036854775807L)) {
                this.zzO = zzX;
            } else {
                boolean z2 = this.zzy;
                if (!z2 || zzT()) {
                    this.zzH = z2;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (com.google.android.gms.internal.ads.zzzb zzzbVar : this.zzv) {
                        zzzbVar.zzg(false);
                    }
                    zzyhVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zza = com.google.android.gms.internal.ads.zzacd.zza;
                }
            }
            zza = com.google.android.gms.internal.ads.zzacd.zza(z, min);
        }
        boolean zza2 = true ^ zza.zza();
        this.zzg.zzg(zzxbVar, new com.google.android.gms.internal.ads.zzxg(1, -1, null, 0, null, com.google.android.gms.internal.ads.zzfl.zzr(zzyhVar.zzg()), com.google.android.gms.internal.ads.zzfl.zzr(this.zzD)), iOException, zza2);
        if (zza2) {
            zzyhVar.zze();
        }
        return zza;
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        com.google.android.gms.internal.ads.zzxh zzxhVar = this.zzs;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }

    final /* synthetic */ void zzF(com.google.android.gms.internal.ads.zzahb zzahbVar) {
        this.zzC = this.zzt == null ? zzahbVar : new com.google.android.gms.internal.ads.zzaha(-9223372036854775807L, 0L);
        this.zzD = zzahbVar.zza();
        boolean z = false;
        if (!this.zzK && zzahbVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzE = z;
        this.zzF = true == z ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzahbVar, z);
        } else {
            zzD();
        }
    }
}
