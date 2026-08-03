package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzlu implements android.os.Handler.Callback, com.google.android.gms.internal.ads.zzxh, com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzmq, com.google.android.gms.internal.ads.zzjh, com.google.android.gms.internal.ads.zzmu, com.google.android.gms.internal.ads.zzcc, com.google.android.gms.internal.ads.zzadr {
    private static final long zza = com.google.android.gms.internal.ads.zzfl.zzr(10000);
    private final boolean zzA;
    private com.google.android.gms.internal.ads.zzni zzB;
    private boolean zzD;
    private boolean zzE;
    private com.google.android.gms.internal.ads.zzlt zzF;
    private int zzG;
    private com.google.android.gms.internal.ads.zzms zzH;
    private com.google.android.gms.internal.ads.zzlr zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzM;
    private boolean zzO;
    private boolean zzR;
    private int zzS;
    private com.google.android.gms.internal.ads.zzlt zzT;
    private long zzU;
    private long zzV;
    private int zzW;
    private boolean zzX;
    private com.google.android.gms.internal.ads.zzjk zzY;
    private com.google.android.gms.internal.ads.zzju zzaa;
    private boolean zzac;
    private final com.google.android.gms.internal.ads.zzjd zzae;
    private final com.google.android.gms.internal.ads.zzne[] zzb;
    private final com.google.android.gms.internal.ads.zznc[] zzc;
    private final boolean[] zzd;
    private final com.google.android.gms.internal.ads.zzabh zze;
    private final com.google.android.gms.internal.ads.zzabi zzf;
    private final com.google.android.gms.internal.ads.zzly zzg;
    private final com.google.android.gms.internal.ads.zzabq zzh;
    private final com.google.android.gms.internal.ads.zzdz zzi;
    private final com.google.android.gms.internal.ads.zzmt zzj;
    private final android.os.Looper zzk;
    private final com.google.android.gms.internal.ads.zzbe zzl;
    private final com.google.android.gms.internal.ads.zzbd zzm;
    private final long zzn;
    private final com.google.android.gms.internal.ads.zzji zzo;
    private final java.util.ArrayList zzp;
    private final com.google.android.gms.internal.ads.zzdo zzq;
    private final com.google.android.gms.internal.ads.zzls zzr;
    private final com.google.android.gms.internal.ads.zzmf zzs;
    private final com.google.android.gms.internal.ads.zzmr zzt;
    private final long zzu;
    private final com.google.android.gms.internal.ads.zzqf zzv;
    private final com.google.android.gms.internal.ads.zznm zzw;
    private final com.google.android.gms.internal.ads.zzdz zzx;
    private final boolean zzy;
    private final com.google.android.gms.internal.ads.zzcd zzz;
    private long zzab = -9223372036854775807L;
    private int zzP = 0;
    private boolean zzQ = false;
    private boolean zzK = false;
    private float zzad = 1.0f;
    private com.google.android.gms.internal.ads.zznh zzC = com.google.android.gms.internal.ads.zznh.zza;
    private long zzZ = -9223372036854775807L;
    private long zzN = -9223372036854775807L;

    public zzlu(android.content.Context context, com.google.android.gms.internal.ads.zzna[] zznaVarArr, com.google.android.gms.internal.ads.zzna[] zznaVarArr2, com.google.android.gms.internal.ads.zzabh zzabhVar, com.google.android.gms.internal.ads.zzabi zzabiVar, com.google.android.gms.internal.ads.zzly zzlyVar, com.google.android.gms.internal.ads.zzabq zzabqVar, int i, boolean z, com.google.android.gms.internal.ads.zznm zznmVar, com.google.android.gms.internal.ads.zzni zzniVar, com.google.android.gms.internal.ads.zzjd zzjdVar, long j, boolean z2, boolean z3, android.os.Looper looper, com.google.android.gms.internal.ads.zzdo zzdoVar, com.google.android.gms.internal.ads.zzls zzlsVar, com.google.android.gms.internal.ads.zzqf zzqfVar, com.google.android.gms.internal.ads.zzmt zzmtVar, com.google.android.gms.internal.ads.zzju zzjuVar, final com.google.android.gms.internal.ads.zzadr zzadrVar, boolean z4) {
        this.zzr = zzlsVar;
        this.zze = zzabhVar;
        this.zzf = zzabiVar;
        this.zzg = zzlyVar;
        this.zzh = zzabqVar;
        int i2 = 0;
        this.zzB = zzniVar;
        this.zzae = zzjdVar;
        this.zzu = j;
        this.zzq = zzdoVar;
        this.zzv = zzqfVar;
        this.zzaa = zzjuVar;
        this.zzw = zznmVar;
        this.zzA = z4;
        this.zzn = zzlyVar.zzf(zzqfVar);
        zzlyVar.zzg(zzqfVar);
        com.google.android.gms.internal.ads.zzbf zzbfVar = com.google.android.gms.internal.ads.zzbf.zza;
        com.google.android.gms.internal.ads.zzms zza2 = com.google.android.gms.internal.ads.zzms.zza(zzabiVar);
        this.zzH = zza2;
        this.zzI = new com.google.android.gms.internal.ads.zzlr(zza2);
        int length = zznaVarArr.length;
        this.zzc = new com.google.android.gms.internal.ads.zznc[2];
        this.zzd = new boolean[2];
        com.google.android.gms.internal.ads.zznb zzg = zzabhVar.zzg();
        this.zzb = new com.google.android.gms.internal.ads.zzne[2];
        boolean z5 = false;
        while (true) {
            int length2 = zznaVarArr.length;
            if (i2 >= 2) {
                this.zzy = z5;
                this.zzo = new com.google.android.gms.internal.ads.zzji(this, zzdoVar);
                this.zzp = new java.util.ArrayList();
                this.zzl = new com.google.android.gms.internal.ads.zzbe();
                this.zzm = new com.google.android.gms.internal.ads.zzbd();
                zzabhVar.zzs(this, zzabqVar);
                this.zzX = true;
                com.google.android.gms.internal.ads.zzdz zzd = zzdoVar.zzd(looper, null);
                this.zzx = zzd;
                this.zzs = new com.google.android.gms.internal.ads.zzmf(zznmVar, zzd, new com.google.android.gms.internal.ads.zzln(this), zzjuVar);
                this.zzt = new com.google.android.gms.internal.ads.zzmr(this, zznmVar, zzd, zzqfVar);
                com.google.android.gms.internal.ads.zzmt zzmtVar2 = new com.google.android.gms.internal.ads.zzmt(null);
                this.zzj = zzmtVar2;
                android.os.Looper zza3 = zzmtVar2.zza();
                this.zzk = zza3;
                com.google.android.gms.internal.ads.zzdz zzd2 = zzdoVar.zzd(zza3, this);
                this.zzi = zzd2;
                this.zzz = new com.google.android.gms.internal.ads.zzcd(context, zza3, this);
                zzd2.zzd(35, new com.google.android.gms.internal.ads.zzadr() { // from class: com.google.android.gms.internal.ads.zzlj
                    @Override // com.google.android.gms.internal.ads.zzadr
                    public final /* synthetic */ void zzcS(long j2, long j3, com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaFormat mediaFormat) {
                        com.google.android.gms.internal.ads.zzlu.this.zzcS(j2, j3, zzvVar, mediaFormat);
                    }
                }).zza();
                return;
            }
            zznaVarArr[i2].zzc(i2, zzqfVar, zzdoVar);
            this.zzc[i2] = zznaVarArr[i2].zzb();
            this.zzc[i2].zzv(zzg);
            com.google.android.gms.internal.ads.zzna zznaVar = zznaVarArr2[i2];
            if (zznaVar != null) {
                zznaVar.zzc(i2, zzqfVar, zzdoVar);
                z5 = true;
            }
            this.zzb[i2] = new com.google.android.gms.internal.ads.zzne(zznaVarArr[i2], zznaVarArr2[i2], i2);
            i2++;
        }
    }

    private final void zzA(java.io.IOException iOException, int i) {
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        com.google.android.gms.internal.ads.zzjk zza2 = com.google.android.gms.internal.ads.zzjk.zza(iOException, i);
        com.google.android.gms.internal.ads.zzmc zzm = zzmfVar.zzm();
        if (zzm != null) {
            zza2 = zza2.zzd(zzm.zzg.zza);
        }
        com.google.android.gms.internal.ads.zzeg.zzf("ExoPlayerImplInternal", "Playback error", zza2);
        zzW(false, false);
        this.zzH = this.zzH.zzf(zza2);
    }

    private final void zzB(int i) {
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        if (zzmsVar.zze != i) {
            if (i != 2) {
                this.zzZ = -9223372036854775807L;
            }
            if (i != 3) {
                boolean z = zzmsVar.zzp;
            }
            this.zzH = this.zzH.zze(i);
        }
    }

    private final void zzC() {
        this.zzI.zzb(this.zzH);
        if (this.zzI.zzd()) {
            this.zzr.zza(this.zzI);
            this.zzI = new com.google.android.gms.internal.ads.zzlr(this.zzH);
        }
    }

    private final void zzD(float f) throws com.google.android.gms.internal.ads.zzjk {
        this.zzad = f;
        float zza2 = f * this.zzz.zza();
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzneVarArr[i].zzL(zza2);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws com.google.android.gms.internal.ads.zzjk {
        this.zzI.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        zzG(zzmsVar.zzl, zzmsVar.zzn, zzmsVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws com.google.android.gms.internal.ads.zzjk {
        zzH(z, this.zzz.zzc(z, this.zzH.zze), i, i2);
    }

    private final void zzH(boolean z, int i, int i2, int i3) throws com.google.android.gms.internal.ads.zzjk {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
            i = -1;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.zzD;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        if (zzmsVar.zzl == z2 && zzmsVar.zzn == i2 && zzmsVar.zzm == i3) {
            return;
        }
        this.zzH = zzmsVar.zzi(z2, i3, i2);
        zzaD(false, false);
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        for (com.google.android.gms.internal.ads.zzmc zzm = zzmfVar.zzm(); zzm != null; zzm = zzm.zzp()) {
            for (com.google.android.gms.internal.ads.zzaba zzabaVar : zzm.zzr().zzc) {
            }
        }
        if (!zzay()) {
            zzK();
            zzL();
            boolean z4 = this.zzH.zzp;
            zzmfVar.zzf(this.zzU);
            return;
        }
        int i4 = this.zzH.zze;
        if (i4 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i4 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzxk zzxkVar = this.zzs.zzm().zzg.zza;
        long zzT = zzT(zzxkVar, this.zzH.zzs, true, false);
        if (zzT != this.zzH.zzs) {
            com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
            this.zzH = zzap(zzxkVar, zzT, zzmsVar.zzc, zzmsVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzmc zzm = this.zzs.zzm();
        if (zzm == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzabi zzr = zzm.zzr();
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzr.zza(i)) {
                zzneVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws com.google.android.gms.internal.ads.zzjk {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzneVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzlq zzlqVar;
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        com.google.android.gms.internal.ads.zzmc zzm = zzmfVar.zzm();
        if (zzm == null) {
            return;
        }
        long zzh = zzm.zze ? zzm.zza.zzh() : -9223372036854775807L;
        if (zzh != -9223372036854775807L) {
            if (!zzm.zzd()) {
                zzmfVar.zzs(zzm);
                zzat(false);
                zzan();
            }
            zzU(zzh, true);
            if (zzh != this.zzH.zzs) {
                com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
                this.zzH = zzap(zzmsVar.zzb, zzh, zzmsVar.zzc, zzh, true, 5);
            }
        } else {
            com.google.android.gms.internal.ads.zzji zzjiVar = this.zzo;
            long zzf = zzjiVar.zzf(zzm != zzmfVar.zzn());
            this.zzU = zzf;
            long zza2 = zzf - zzm.zza();
            long j = this.zzH.zzs;
            java.util.ArrayList arrayList = this.zzp;
            if (!arrayList.isEmpty() && !this.zzH.zzb.zzb()) {
                if (this.zzX) {
                    j--;
                    this.zzX = false;
                }
                com.google.android.gms.internal.ads.zzms zzmsVar2 = this.zzH;
                int zze = zzmsVar2.zza.zze(zzmsVar2.zzb.zza);
                int min = java.lang.Math.min(this.zzW, arrayList.size());
                if (min > 0) {
                    zzlqVar = (com.google.android.gms.internal.ads.zzlq) arrayList.get(min - 1);
                    while (zzlqVar != null && (zze < 0 || (zze == 0 && j < 0))) {
                        int i = min - 1;
                        if (i > 0) {
                            zzlqVar = (com.google.android.gms.internal.ads.zzlq) arrayList.get(min - 2);
                            min = i;
                        } else {
                            min = i;
                        }
                    }
                    if (min < arrayList.size()) {
                    }
                    this.zzW = min;
                }
                zzlqVar = null;
            }
            if (zzjiVar.zzh()) {
                boolean z = !this.zzI.zzc;
                com.google.android.gms.internal.ads.zzms zzmsVar3 = this.zzH;
                this.zzH = zzap(zzmsVar3.zzb, zza2, zzmsVar3.zzc, zza2, z, 6);
            } else {
                com.google.android.gms.internal.ads.zzms zzmsVar4 = this.zzH;
                zzmsVar4.zzs = zza2;
                zzmsVar4.zzt = android.os.SystemClock.elapsedRealtime();
            }
        }
        this.zzH.zzq = zzmfVar.zzk().zzf();
        this.zzH.zzr = zzau();
        com.google.android.gms.internal.ads.zzms zzmsVar5 = this.zzH;
        if (zzmsVar5.zzl && zzmsVar5.zze == 3 && zzP(zzmsVar5.zza, zzmsVar5.zzb)) {
            com.google.android.gms.internal.ads.zzms zzmsVar6 = this.zzH;
            if (zzmsVar6.zzo.zzb == 1.0f) {
                float zzd = this.zzae.zzd(zzO(zzmsVar6.zza, zzmsVar6.zzb.zza, zzmsVar6.zzs), this.zzH.zzr);
                com.google.android.gms.internal.ads.zzji zzjiVar2 = this.zzo;
                if (zzjiVar2.zzj().zzb != zzd) {
                    zzM(new com.google.android.gms.internal.ads.zzav(zzd, this.zzH.zzo.zzc));
                    zzam(this.zzH.zzo, zzjiVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(com.google.android.gms.internal.ads.zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzlk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzlu.this.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzm).zzc;
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return com.google.android.gms.internal.ads.zzfl.zzs((j2 == -9223372036854775807L ? java.lang.System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        if (!zzxkVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzxkVar.zza, this.zzm).zzc;
            com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            r2 = this.zzH.zze != 3 ? zza : 1000L;
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                r2 = java.lang.Math.min(r2, com.google.android.gms.internal.ads.zzfl.zzr(zzneVarArr[i].zzk(this.zzU, this.zzV)));
            }
            if (this.zzH.zzj()) {
                com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
                if ((zzmfVar.zzm() != null ? zzmfVar.zzm().zzp() : null) != null) {
                    if (this.zzU + (com.google.android.gms.internal.ads.zzfl.zzs(r2) * this.zzH.zzo.zzb) >= r0.zzc()) {
                        r2 = java.lang.Math.min(r2, zza);
                    }
                }
            }
        } else if (this.zzH.zze != 3 || zzay()) {
            r2 = zza;
        }
        this.zzi.zzj(2, j + r2);
    }

    private final void zzR(com.google.android.gms.internal.ads.zzlt zzltVar) throws com.google.android.gms.internal.ads.zzjk {
        long longValue;
        long j;
        boolean z;
        com.google.android.gms.internal.ads.zzxk zzxkVar;
        boolean z2;
        long j2;
        long j3;
        long zzS;
        long j4;
        com.google.android.gms.internal.ads.zzms zzmsVar;
        int i;
        if (this.zzE) {
            if (this.zzF != null) {
                this.zzG++;
                this.zzI.zza(1);
            }
            this.zzF = zzltVar;
            return;
        }
        this.zzI.zza(1);
        com.google.android.gms.internal.ads.zzbf zzbfVar = this.zzH.zza;
        int i2 = this.zzP;
        boolean z3 = this.zzQ;
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzl;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzm;
        android.util.Pair zzaE = zzaE(zzbfVar, zzltVar, true, i2, z3, zzbeVar, zzbdVar);
        if (zzaE == null) {
            android.util.Pair zzY = zzY(this.zzH.zza);
            zzxkVar = (com.google.android.gms.internal.ads.zzxk) zzY.first;
            longValue = ((java.lang.Long) zzY.second).longValue();
            z = !this.zzH.zza.zzg();
            j = -9223372036854775807L;
        } else {
            java.lang.Object obj = zzaE.first;
            longValue = ((java.lang.Long) zzaE.second).longValue();
            long j5 = zzltVar.zzc;
            j = j5 == -9223372036854775807L ? -9223372036854775807L : longValue;
            com.google.android.gms.internal.ads.zzxk zzy = this.zzs.zzy(this.zzH.zza, obj, longValue);
            if (zzy.zzb()) {
                this.zzH.zza.zzo(zzy.zza, zzbdVar);
                int i3 = zzy.zzb;
                if (zzbdVar.zzd(i3) == zzy.zzc) {
                    zzbdVar.zzj();
                }
                com.google.android.gms.internal.ads.zza zza2 = zzbdVar.zzg.zza(i3);
                long j6 = zza2.zza;
                long j7 = zza2.zzi;
                zzxkVar = zzy;
                j = java.lang.Math.max(j, 0L);
                z = true;
                longValue = 0;
            } else {
                z = j5 == -9223372036854775807L;
                zzxkVar = zzy;
            }
        }
        try {
            if (this.zzH.zza.zzg()) {
                this.zzT = zzltVar;
            } else if (zzaE == null) {
                if (this.zzH.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                try {
                    if (zzxkVar.equals(this.zzH.zzb)) {
                        com.google.android.gms.internal.ads.zzmc zzm = this.zzs.zzm();
                        if (zzm == null || !zzm.zze || longValue == 0) {
                            j3 = longValue;
                        } else {
                            com.google.android.gms.internal.ads.zzxi zzxiVar = zzm.zza;
                            long j8 = zzbeVar.zzm;
                            if (this.zzD && j8 != -9223372036854775807L) {
                                java.lang.Double d = this.zzC.zzc;
                            }
                            j3 = zzxiVar.zzk(longValue, this.zzB);
                        }
                        z2 = z;
                        try {
                            if (com.google.android.gms.internal.ads.zzfl.zzr(j3) == com.google.android.gms.internal.ads.zzfl.zzr(this.zzH.zzs) && ((i = (zzmsVar = this.zzH).zze) == 2 || i == 3)) {
                                j4 = zzmsVar.zzs;
                                this.zzH = zzap(zzxkVar, j4, j, j4, z2, 2);
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            j2 = longValue;
                            this.zzH = zzap(zzxkVar, j2, j, j2, z2, 2);
                            throw th;
                        }
                    } else {
                        z2 = z;
                        j3 = longValue;
                    }
                    com.google.android.gms.internal.ads.zzms zzmsVar2 = this.zzH;
                    com.google.android.gms.internal.ads.zzbf zzbfVar2 = zzmsVar2.zza;
                    zzag(zzbfVar2, zzxkVar, zzbfVar2, zzmsVar2.zzb, j, true);
                    j4 = zzS;
                    this.zzH = zzap(zzxkVar, j4, j, j4, z2, 2);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    j2 = zzS;
                    this.zzH = zzap(zzxkVar, j2, j, j2, z2, 2);
                    throw th;
                }
                if (this.zzD) {
                    com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 2) {
                            break;
                        }
                        com.google.android.gms.internal.ads.zzne zzneVar = zzneVarArr[i4];
                        if (zzneVar.zzM() && zzneVar.zze() == 2) {
                            this.zzE = true;
                            break;
                        }
                        i4++;
                    }
                }
                zzS = zzS(zzxkVar, j3, this.zzH.zze == 4);
                z2 |= longValue != zzS;
            }
            z2 = z;
            j4 = longValue;
            this.zzH = zzap(zzxkVar, j4, j, j4, z2, 2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            z2 = z;
        }
    }

    private final long zzS(com.google.android.gms.internal.ads.zzxk zzxkVar, long j, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        return zzT(zzxkVar, j, zzmfVar.zzm() != zzmfVar.zzn(), z);
    }

    private final long zzT(com.google.android.gms.internal.ads.zzxk zzxkVar, long j, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        zzK();
        boolean z3 = true;
        zzaD(false, true);
        if (z2 || this.zzH.zze == 3) {
            zzB(2);
        }
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        com.google.android.gms.internal.ads.zzmc zzm = zzmfVar.zzm();
        com.google.android.gms.internal.ads.zzmc zzmcVar = zzm;
        while (zzmcVar != null && !zzxkVar.equals(zzmcVar.zzg.zza)) {
            zzmcVar = zzmcVar.zzp();
        }
        if (z || zzm != zzmcVar || (zzmcVar != null && zzmcVar.zza() + j < 0)) {
            zzaa();
            if (zzmcVar != null) {
                while (zzmfVar.zzm() != zzmcVar) {
                    zzmfVar.zzr();
                }
                zzmfVar.zzs(zzmcVar);
                zzmcVar.zzb(1000000000000L);
                zzaq();
                zzmcVar.zzh = true;
            }
        }
        zzab();
        if (zzmcVar != null) {
            zzmfVar.zzs(zzmcVar);
            if (!zzmcVar.zze) {
                zzmcVar.zzg = zzmcVar.zzg.zza(j, -9223372036854775807L);
            } else if (zzmcVar.zzf) {
                if (this.zzD) {
                    boolean z4 = this.zzC.zzi;
                    if (!this.zzH.zza.zzg() && zzmcVar.zzg.zza.equals(this.zzH.zzb)) {
                        long zza2 = zzmcVar.zza() + j;
                        com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
                        boolean z5 = true;
                        for (int i = 0; i < 2; i++) {
                            com.google.android.gms.internal.ads.zzne zzneVar = zzneVarArr[i];
                            if (zzneVar.zzM()) {
                                z5 &= zzneVar.zzF(zzmcVar, zza2);
                            }
                        }
                        if (z5) {
                            com.google.android.gms.internal.ads.zzxi zzxiVar = zzmcVar.zza;
                            long j2 = this.zzH.zzs;
                            com.google.android.gms.internal.ads.zzni zzniVar = com.google.android.gms.internal.ads.zzni.zzb;
                            if (zzxiVar.zzk(j2, zzniVar) == zzxiVar.zzk(j, zzniVar)) {
                                z3 = false;
                            }
                        }
                    }
                }
                com.google.android.gms.internal.ads.zzxi zzxiVar2 = zzmcVar.zza;
                j = zzxiVar2.zzj(j);
                zzxiVar2.zzf(j - this.zzn, false);
            }
            zzU(j, z3);
            zzan();
        } else {
            zzmfVar.zzv();
            zzU(j, true);
        }
        zzat(false);
        this.zzi.zzh(2);
        return j;
    }

    private final void zzU(long j, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzmc zzm = this.zzs.zzm();
        long zza2 = j + (zzm == null ? 1000000000000L : zzm.zza());
        this.zzU = zza2;
        this.zzo.zzc(zza2);
        com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzneVarArr[i].zzE(zzm, this.zzU, z);
        }
        for (com.google.android.gms.internal.ads.zzmc zzm2 = r0.zzm(); zzm2 != null; zzm2 = zzm2.zzp()) {
            for (com.google.android.gms.internal.ads.zzaba zzabaVar : zzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws com.google.android.gms.internal.ads.zzjk {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzneVarArr[i].zzz(this.zzD ? this.zzC : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzR, false, true, false);
        this.zzI.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzH.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        com.google.android.gms.internal.ads.zzbf zzbfVar;
        com.google.android.gms.internal.ads.zzxk zzxkVar;
        com.google.android.gms.internal.ads.zzbf zzbfVar2;
        this.zzi.zzk(2);
        this.zzE = false;
        boolean z5 = true;
        if (this.zzF != null) {
            this.zzI.zza(1);
            this.zzF = null;
        }
        this.zzY = null;
        zzaD(false, true);
        this.zzo.zzb();
        this.zzU = 1000000000000L;
        try {
            zzaa();
        } catch (com.google.android.gms.internal.ads.zzjk | java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzeg.zzf("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzneVarArr[i].zzG();
                } catch (java.lang.RuntimeException e2) {
                    com.google.android.gms.internal.ads.zzeg.zzf("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzS = 0;
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzmsVar.zzb;
        long j3 = zzmsVar.zzs;
        long j4 = (this.zzH.zzb.zzb() || zzaC(this.zzH, this.zzm)) ? this.zzH.zzc : this.zzH.zzs;
        if (z2) {
            this.zzT = null;
            android.util.Pair zzY = zzY(this.zzH.zza);
            zzxkVar2 = (com.google.android.gms.internal.ads.zzxk) zzY.first;
            j3 = ((java.lang.Long) zzY.second).longValue();
            j4 = -9223372036854775807L;
            if (!zzxkVar2.equals(this.zzH.zzb)) {
                j = j3;
                j2 = -9223372036854775807L;
                com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
                zzmfVar.zzv();
                this.zzO = false;
                zzbfVar = this.zzH.zza;
                if (z3 && (zzbfVar instanceof com.google.android.gms.internal.ads.zzmy)) {
                    zzbfVar = ((com.google.android.gms.internal.ads.zzmy) zzbfVar).zzx(this.zzt.zzq());
                    if (zzxkVar2.zzb != -1) {
                        java.lang.Object obj = zzxkVar2.zza;
                        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzm;
                        zzbfVar.zzo(obj, zzbdVar);
                        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzl;
                        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
                        if (zzbeVar.zzb()) {
                            zzbfVar2 = zzbfVar;
                            zzxkVar = new com.google.android.gms.internal.ads.zzxk(obj, zzxkVar2.zzd);
                            com.google.android.gms.internal.ads.zzms zzmsVar2 = this.zzH;
                            int i2 = zzmsVar2.zze;
                            com.google.android.gms.internal.ads.zzjk zzjkVar = z4 ? null : zzmsVar2.zzf;
                            com.google.android.gms.internal.ads.zzzn zzznVar = z5 ? com.google.android.gms.internal.ads.zzzn.zza : zzmsVar2.zzh;
                            com.google.android.gms.internal.ads.zzabi zzabiVar = z5 ? this.zzf : this.zzH.zzi;
                            java.util.List zzi = z5 ? com.google.android.gms.internal.ads.zzgwm.zzi() : this.zzH.zzj;
                            com.google.android.gms.internal.ads.zzms zzmsVar3 = this.zzH;
                            this.zzH = new com.google.android.gms.internal.ads.zzms(zzbfVar2, zzxkVar, j2, j, i2, zzjkVar, false, zzznVar, zzabiVar, zzi, zzxkVar, zzmsVar3.zzl, zzmsVar3.zzm, zzmsVar3.zzn, zzmsVar3.zzo, j, 0L, j, 0L, false);
                            if (z3) {
                                zzmfVar.zzj();
                                this.zzt.zzg();
                                return;
                            }
                            return;
                        }
                    }
                }
                zzxkVar = zzxkVar2;
                zzbfVar2 = zzbfVar;
                com.google.android.gms.internal.ads.zzms zzmsVar22 = this.zzH;
                int i22 = zzmsVar22.zze;
                com.google.android.gms.internal.ads.zzjk zzjkVar2 = z4 ? null : zzmsVar22.zzf;
                com.google.android.gms.internal.ads.zzzn zzznVar2 = z5 ? com.google.android.gms.internal.ads.zzzn.zza : zzmsVar22.zzh;
                com.google.android.gms.internal.ads.zzabi zzabiVar2 = z5 ? this.zzf : this.zzH.zzi;
                java.util.List zzi2 = z5 ? com.google.android.gms.internal.ads.zzgwm.zzi() : this.zzH.zzj;
                com.google.android.gms.internal.ads.zzms zzmsVar32 = this.zzH;
                this.zzH = new com.google.android.gms.internal.ads.zzms(zzbfVar2, zzxkVar, j2, j, i22, zzjkVar2, false, zzznVar2, zzabiVar2, zzi2, zzxkVar, zzmsVar32.zzl, zzmsVar32.zzm, zzmsVar32.zzn, zzmsVar32.zzo, j, 0L, j, 0L, false);
                if (z3) {
                }
            }
        }
        j = j3;
        j2 = j4;
        z5 = false;
        com.google.android.gms.internal.ads.zzmf zzmfVar2 = this.zzs;
        zzmfVar2.zzv();
        this.zzO = false;
        zzbfVar = this.zzH.zza;
        if (z3) {
            zzbfVar = ((com.google.android.gms.internal.ads.zzmy) zzbfVar).zzx(this.zzt.zzq());
            if (zzxkVar2.zzb != -1) {
            }
        }
        zzxkVar = zzxkVar2;
        zzbfVar2 = zzbfVar;
        com.google.android.gms.internal.ads.zzms zzmsVar222 = this.zzH;
        int i222 = zzmsVar222.zze;
        com.google.android.gms.internal.ads.zzjk zzjkVar22 = z4 ? null : zzmsVar222.zzf;
        com.google.android.gms.internal.ads.zzzn zzznVar22 = z5 ? com.google.android.gms.internal.ads.zzzn.zza : zzmsVar222.zzh;
        com.google.android.gms.internal.ads.zzabi zzabiVar22 = z5 ? this.zzf : this.zzH.zzi;
        java.util.List zzi22 = z5 ? com.google.android.gms.internal.ads.zzgwm.zzi() : this.zzH.zzj;
        com.google.android.gms.internal.ads.zzms zzmsVar322 = this.zzH;
        this.zzH = new com.google.android.gms.internal.ads.zzms(zzbfVar2, zzxkVar, j2, j, i222, zzjkVar22, false, zzznVar22, zzabiVar22, zzi22, zzxkVar, zzmsVar322.zzl, zzmsVar322.zzm, zzmsVar322.zzn, zzmsVar322.zzo, j, 0L, j, 0L, false);
        if (z3) {
        }
    }

    private final android.util.Pair zzY(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return android.util.Pair.create(com.google.android.gms.internal.ads.zzms.zzb(), 0L);
        }
        int zzk = zzbfVar.zzk(this.zzQ);
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzl;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzm;
        android.util.Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzk, -9223372036854775807L);
        com.google.android.gms.internal.ads.zzxk zzy = this.zzs.zzy(zzbfVar, zzm.first, 0L);
        long longValue = ((java.lang.Long) zzm.second).longValue();
        if (zzy.zzb()) {
            zzbfVar.zzo(zzy.zza, zzbdVar);
            if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j = longValue;
        }
        return android.util.Pair.create(zzy, java.lang.Long.valueOf(j));
    }

    private final void zzZ(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        java.util.ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            java.util.Collections.sort(arrayList);
            return;
        }
        com.google.android.gms.internal.ads.zzlq zzlqVar = (com.google.android.gms.internal.ads.zzlq) arrayList.get(size);
        java.lang.Object obj = zzlqVar.zzb;
        com.google.android.gms.internal.ads.zzmw zzmwVar = zzlqVar.zza;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        throw null;
    }

    private final boolean zzaA() {
        if (!this.zzy) {
            return false;
        }
        com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzneVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaB, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzD) {
            return false;
        }
        boolean z = this.zzC.zzg;
        return true;
    }

    private static boolean zzaC(com.google.android.gms.internal.ads.zzms zzmsVar, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = zzmsVar.zzb;
        com.google.android.gms.internal.ads.zzbf zzbfVar = zzmsVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxkVar.zza, zzbdVar).zzf;
    }

    private final void zzaD(boolean z, boolean z2) {
        this.zzM = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = android.os.SystemClock.elapsedRealtime();
        }
        this.zzN = j;
    }

    private static android.util.Pair zzaE(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzlt zzltVar, boolean z, int i, boolean z2, com.google.android.gms.internal.ads.zzbe zzbeVar, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        android.util.Pair zzm;
        com.google.android.gms.internal.ads.zzbf zzbfVar2 = zzltVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzbf zzbfVar3 = true == zzbfVar2.zzg() ? zzbfVar : zzbfVar2;
        try {
            zzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzltVar.zzb, zzltVar.zzc);
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar3)) {
            return zzm;
        }
        if (zzbfVar.zze(zzm.first) != -1) {
            return (zzbfVar3.zzo(zzm.first, zzbdVar).zzf && zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(zzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(zzm.first, zzbdVar).zzc, zzltVar.zzc) : zzm;
        }
        int zzr = zzr(zzbeVar, zzbdVar, i, z2, zzm.first, zzbfVar3, zzbfVar);
        if (zzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, zzr, -9223372036854775807L);
        }
        return null;
    }

    private static final void zzaF(com.google.android.gms.internal.ads.zzmw zzmwVar) throws com.google.android.gms.internal.ads.zzjk {
        zzmwVar.zzh();
        try {
            zzmwVar.zza().zzx(zzmwVar.zzc(), zzmwVar.zze());
        } finally {
            zzmwVar.zzi(true);
        }
    }

    private static final boolean zzaG(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        if (zzmcVar != null) {
            try {
                if (zzmcVar.zze) {
                    com.google.android.gms.internal.ads.zzzc[] zzzcVarArr = zzmcVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        com.google.android.gms.internal.ads.zzzc zzzcVar = zzzcVarArr[i];
                        if (zzzcVar != null) {
                            zzzcVar.zzc();
                        }
                    }
                } else {
                    zzmcVar.zza.zzc();
                }
                if (zzmcVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws com.google.android.gms.internal.ads.zzjk {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            if (i >= 2) {
                this.zzab = -9223372036854775807L;
                return;
            }
            int zzd = zzneVarArr[i].zzd();
            zzneVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzS -= zzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaA()) {
            com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                com.google.android.gms.internal.ads.zzne zzneVar = zzneVarArr[i];
                int zzd = zzneVar.zzd();
                zzneVar.zzC(this.zzo);
                this.zzS -= zzd - zzneVar.zzd();
            }
            this.zzab = -9223372036854775807L;
        }
    }

    private final void zzac() throws com.google.android.gms.internal.ads.zzjk {
        zzad();
        zzI(true);
    }

    private final void zzad() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzji zzjiVar = this.zzo;
        float f = zzjiVar.zzj().zzb;
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        com.google.android.gms.internal.ads.zzmc zzm = zzmfVar.zzm();
        com.google.android.gms.internal.ads.zzmc zzn = zzmfVar.zzn();
        com.google.android.gms.internal.ads.zzabi zzabiVar = null;
        boolean z = true;
        while (zzm != null && zzm.zze) {
            com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
            com.google.android.gms.internal.ads.zzabi zzk = zzm.zzk(f, zzmsVar.zza, zzmsVar.zzl);
            com.google.android.gms.internal.ads.zzabi zzabiVar2 = zzm == zzmfVar.zzm() ? zzk : zzabiVar;
            com.google.android.gms.internal.ads.zzabi zzr = zzm.zzr();
            boolean z2 = false;
            if (zzr != null) {
                com.google.android.gms.internal.ads.zzaba[] zzabaVarArr = zzk.zzc;
                if (zzr.zzc.length == zzabaVarArr.length) {
                    for (int i = 0; i < zzabaVarArr.length; i++) {
                        if (zzk.zzb(zzr, i)) {
                        }
                    }
                    if (zzm != zzn) {
                        z2 = true;
                    }
                    z &= z2;
                    zzm = zzm.zzp();
                    zzabiVar = zzabiVar2;
                }
            }
            int i2 = 2;
            if (z) {
                com.google.android.gms.internal.ads.zzmc zzm2 = zzmfVar.zzm();
                int zzs = zzmfVar.zzs(zzm2) & 1;
                com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzabiVar2.getClass();
                long zzm3 = zzm2.zzm(zzabiVar2, this.zzH.zzs, 1 == zzs, zArr);
                com.google.android.gms.internal.ads.zzms zzmsVar2 = this.zzH;
                boolean z3 = (zzmsVar2.zze == 4 || zzm3 == zzmsVar2.zzs) ? false : true;
                com.google.android.gms.internal.ads.zzms zzmsVar3 = this.zzH;
                com.google.android.gms.internal.ads.zzmc zzmcVar = zzm2;
                this.zzH = zzap(zzmsVar3.zzb, zzm3, zzmsVar3.zzc, zzmsVar3.zzd, z3, 5);
                if (z3) {
                    zzU(zzm3, true);
                }
                zzab();
                i2 = 2;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (i3 < 2) {
                    int zzd = zzneVarArr[i3].zzd();
                    zArr2[i3] = zzneVarArr[i3].zzM();
                    com.google.android.gms.internal.ads.zzmc zzmcVar2 = zzmcVar;
                    zzneVarArr[i3].zzD(zzmcVar2.zzc[i3], zzjiVar, this.zzU, zArr[i3]);
                    if (zzd - zzneVarArr[i3].zzd() > 0) {
                        zzN(i3, false);
                    }
                    this.zzS -= zzd - zzneVarArr[i3].zzd();
                    i3++;
                    zzmcVar = zzmcVar2;
                }
                zzar(zArr2, this.zzU);
                zzmcVar.zzh = true;
            } else {
                zzmfVar.zzs(zzm);
                if (zzm.zze) {
                    long max = java.lang.Math.max(zzm.zzg.zzb, this.zzU - zzm.zza());
                    if (this.zzy && zzaA() && zzmfVar.zzo() == zzm) {
                        zzab();
                    }
                    zzm.zzl(zzk, max, false);
                }
            }
            zzat(true);
            if (this.zzH.zze != 4) {
                zzan();
                zzL();
                this.zzi.zzh(i2);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        com.google.android.gms.internal.ads.zzmc zzm = this.zzs.zzm();
        long j = zzm.zzg.zzf;
        if (zzm.zze) {
            return j == -9223372036854775807L || this.zzH.zzs < j || !zzay();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x026e, code lost:
    
        if (r6 >= r26) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf zzbfVar, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        java.lang.Object obj;
        com.google.android.gms.internal.ads.zzxk zzxkVar;
        long j;
        long j2;
        com.google.android.gms.internal.ads.zzbe zzbeVar;
        long j3;
        java.lang.Object obj2;
        int i;
        int i2;
        long j4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j5;
        long j6;
        com.google.android.gms.internal.ads.zzxk zzxkVar2;
        boolean z6;
        boolean z7;
        java.lang.Object obj3;
        long j7;
        boolean z8;
        boolean z9;
        com.google.android.gms.internal.ads.zzxk zzxkVar3;
        int i3;
        boolean z10;
        long j8;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        com.google.android.gms.internal.ads.zzbf zzbfVar2;
        int i4;
        long longValue;
        boolean z15;
        int i5;
        boolean z16;
        int i6;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        com.google.android.gms.internal.ads.zzlt zzltVar = this.zzT;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzm;
        int i7 = this.zzP;
        boolean z23 = this.zzQ;
        if (zzbfVar.zzg()) {
            com.google.android.gms.internal.ads.zzxk zzb = com.google.android.gms.internal.ads.zzms.zzb();
            com.google.android.gms.internal.ads.zzxk zzxkVar4 = zzmsVar.zzb;
            boolean z24 = (zzb.equals(zzxkVar4) && zzmsVar.zzs == 0) ? false : true;
            if (z24 && z) {
                com.google.android.gms.internal.ads.zzbf zzbfVar3 = zzmsVar.zza;
                if (!zzbfVar3.zzg() && !zzbfVar3.zzo(zzxkVar4.zza, zzbdVar).zzf) {
                    z22 = true;
                    z14 = z22;
                    zzxkVar3 = zzb;
                    z10 = z24;
                    j8 = 0;
                    j5 = 0;
                    j = -9223372036854775807L;
                    z11 = false;
                    z12 = true;
                    z13 = false;
                    i3 = 4;
                }
            }
            z22 = false;
            z14 = z22;
            zzxkVar3 = zzb;
            z10 = z24;
            j8 = 0;
            j5 = 0;
            j = -9223372036854775807L;
            z11 = false;
            z12 = true;
            z13 = false;
            i3 = 4;
        } else {
            com.google.android.gms.internal.ads.zzxk zzxkVar5 = zzmsVar.zzb;
            java.lang.Object obj4 = zzxkVar5.zza;
            boolean zzaC = zzaC(zzmsVar, zzbdVar);
            long j9 = (zzxkVar5.zzb() || zzaC) ? zzmsVar.zzc : zzmsVar.zzs;
            com.google.android.gms.internal.ads.zzbe zzbeVar2 = this.zzl;
            if (zzltVar != null) {
                obj = obj4;
                zzxkVar = zzxkVar5;
                long j10 = j9;
                android.util.Pair zzaE = zzaE(zzbfVar, zzltVar, true, i7, z23, zzbeVar2, zzbdVar);
                if (zzaE == null) {
                    i6 = zzbfVar.zzk(z23);
                    obj2 = obj;
                    longValue = j10;
                    z17 = false;
                    z18 = true;
                    z16 = false;
                } else {
                    if (zzltVar.zzc == -9223372036854775807L) {
                        i5 = zzbfVar.zzo(zzaE.first, zzbdVar).zzc;
                        obj2 = obj;
                        longValue = j10;
                        z15 = false;
                    } else {
                        obj2 = zzaE.first;
                        longValue = ((java.lang.Long) zzaE.second).longValue();
                        z15 = true;
                        i5 = -1;
                    }
                    z16 = z15;
                    i6 = i5;
                    z17 = zzmsVar.zze == 4;
                    z18 = false;
                }
                z2 = z17;
                z3 = z18;
                z4 = z16;
                zzbeVar = zzbeVar2;
                j2 = j10;
                i2 = i6;
                j = longValue;
                i = -1;
                j3 = 0;
            } else {
                obj = obj4;
                zzxkVar = zzxkVar5;
                j = j9;
                com.google.android.gms.internal.ads.zzbf zzbfVar4 = zzmsVar.zza;
                if (zzbfVar4.zzg()) {
                    i2 = zzbfVar.zzk(z23);
                    obj2 = obj;
                    zzbeVar = zzbeVar2;
                    j2 = j;
                } else if (zzbfVar.zze(obj) == -1) {
                    int zzr = zzr(zzbeVar2, zzbdVar, i7, z23, obj, zzbfVar4, zzbfVar);
                    if (zzr == -1) {
                        zzr = zzbfVar.zzk(z23);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i2 = zzr;
                    z3 = z5;
                    obj2 = obj;
                    zzbeVar = zzbeVar2;
                    j2 = j;
                    i = -1;
                    j3 = 0;
                    z2 = false;
                    z4 = false;
                } else {
                    j2 = j;
                    if (j2 == -9223372036854775807L) {
                        i2 = zzbfVar.zzo(obj, zzbdVar).zzc;
                        j = j2;
                        obj2 = obj;
                        zzbeVar = zzbeVar2;
                    } else if (zzaC) {
                        zzbfVar4.zzo(obj, zzbdVar);
                        zzbeVar = zzbeVar2;
                        if (zzbfVar4.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar4.zze(obj)) {
                            android.util.Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(obj, zzbdVar).zzc, j2);
                            obj2 = zzm.first;
                            j4 = ((java.lang.Long) zzm.second).longValue();
                            j3 = 0;
                        } else {
                            if (zzbfVar.zzo(obj, zzbdVar).zzd != -9223372036854775807L) {
                                long j11 = zzbdVar.zzd - 1;
                                java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                                j3 = 0;
                                j4 = java.lang.Math.max(0L, java.lang.Math.min(j2, j11));
                            } else {
                                j3 = 0;
                                j4 = j2;
                            }
                            obj2 = obj;
                        }
                        j = j4;
                        i = -1;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        zzbeVar = zzbeVar2;
                        j3 = 0;
                        j = j2;
                        obj2 = obj;
                        i = -1;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                i = -1;
                j3 = 0;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (i2 != i) {
                j5 = j3;
                android.util.Pair zzm2 = zzbfVar.zzm(zzbeVar, zzbdVar, i2, -9223372036854775807L);
                obj2 = zzm2.first;
                j6 = ((java.lang.Long) zzm2.second).longValue();
                j = -9223372036854775807L;
            } else {
                j5 = j3;
                j6 = j;
            }
            com.google.android.gms.internal.ads.zzxk zzy = this.zzs.zzy(zzbfVar, obj2, j6);
            int i8 = zzy.zze;
            if (i8 != -1) {
                zzxkVar2 = zzxkVar;
                int i9 = zzxkVar2.zze;
                if (i9 == -1 || i8 < i9) {
                    z6 = false;
                    boolean equals = obj.equals(obj2);
                    z7 = (equals || zzxkVar2.zzb() || zzy.zzb() || !z6) ? false : true;
                    com.google.android.gms.internal.ads.zzbd zzo = zzbfVar.zzo(obj2, zzbdVar);
                    if (!zzaC && j2 == j && obj.equals(zzy.zza)) {
                        if (zzxkVar2.zzb()) {
                            zzo.zzk(zzxkVar2.zzb);
                        }
                        if (zzy.zzb()) {
                            zzo.zzk(zzy.zzb);
                        }
                    }
                    if (true == z7) {
                        zzy = zzxkVar2;
                    }
                    if (zzy.zzb()) {
                        if (equals && zzxkVar2.zzb()) {
                            com.google.android.gms.internal.ads.zza zza2 = zzbfVar.zzo(obj2, zzbdVar).zzg.zza(zzxkVar2.zzb);
                            long j12 = zza2.zzi;
                            long j13 = zzmsVar.zzc;
                            if (j13 != -9223372036854775807L) {
                                obj3 = obj;
                                long j14 = zza2.zza;
                            } else {
                                obj3 = obj;
                            }
                            int i10 = zza2.zzb;
                            int i11 = zzxkVar2.zzc;
                            if (i10 > i11 && zza2.zze[i11] == 2) {
                                long j15 = zzbfVar.zzo(obj2, zzbdVar).zzd;
                                j7 = j15 != -9223372036854775807L ? java.lang.Math.min(j15 - 1, j6) : j6;
                                j = j7;
                            }
                        } else {
                            obj3 = obj;
                        }
                        j7 = j6;
                    } else if (zzy.equals(zzxkVar2)) {
                        j7 = zzmsVar.zzs;
                        obj3 = obj;
                    } else {
                        zzbfVar.zzo(zzy.zza, zzbdVar);
                        if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                            zzbdVar.zzj();
                        }
                        obj3 = obj;
                        j7 = j5;
                    }
                    z8 = zzy.equals(zzxkVar2) || j7 != zzmsVar.zzs;
                    int i12 = zzbfVar.zze(obj3) != -1 ? 4 : 3;
                    java.lang.Object obj5 = zzy.zza;
                    int i13 = (obj5.equals(obj3) || (i4 = zzy.zzb) == -1 || zzbfVar.zzo(obj5, zzbdVar).zzg.zza(i4).zze[zzy.zzc] == 2) ? i12 : 0;
                    if (z8 && z) {
                        zzbfVar2 = zzmsVar.zza;
                        if (!zzbfVar2.zzg() && !zzbfVar2.zzo(obj3, zzbdVar).zzf) {
                            z9 = true;
                            zzxkVar3 = zzy;
                            i3 = i13;
                            z10 = z8;
                            j8 = j7;
                            z11 = z2;
                            z12 = z3;
                            z13 = z4;
                            z14 = z9;
                        }
                    }
                    z9 = false;
                    zzxkVar3 = zzy;
                    i3 = i13;
                    z10 = z8;
                    j8 = j7;
                    z11 = z2;
                    z12 = z3;
                    z13 = z4;
                    z14 = z9;
                }
            } else {
                zzxkVar2 = zzxkVar;
            }
            z6 = true;
            boolean equals2 = obj.equals(obj2);
            if (equals2) {
            }
            com.google.android.gms.internal.ads.zzbd zzo2 = zzbfVar.zzo(obj2, zzbdVar);
            if (!zzaC) {
                if (zzxkVar2.zzb()) {
                }
                if (zzy.zzb()) {
                }
            }
            if (true == z7) {
            }
            if (zzy.zzb()) {
            }
            if (zzy.equals(zzxkVar2)) {
            }
            if (zzbfVar.zze(obj3) != -1) {
            }
            java.lang.Object obj52 = zzy.zza;
            if (obj52.equals(obj3)) {
            }
            if (z8) {
                zzbfVar2 = zzmsVar.zza;
                if (!zzbfVar2.zzg()) {
                    z9 = true;
                    zzxkVar3 = zzy;
                    i3 = i13;
                    z10 = z8;
                    j8 = j7;
                    z11 = z2;
                    z12 = z3;
                    z13 = z4;
                    z14 = z9;
                }
            }
            z9 = false;
            zzxkVar3 = zzy;
            i3 = i13;
            z10 = z8;
            j8 = j7;
            z11 = z2;
            z12 = z3;
            z13 = z4;
            z14 = z9;
        }
        com.google.android.gms.internal.ads.zzlt zzltVar2 = null;
        if (z12) {
            try {
                if (this.zzH.zze != 1) {
                    try {
                        zzB(4);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        z19 = z13;
                        com.google.android.gms.internal.ads.zzms zzmsVar2 = this.zzH;
                        com.google.android.gms.internal.ads.zzlt zzltVar3 = zzltVar2;
                        zzag(zzbfVar, zzxkVar3, zzmsVar2.zza, zzmsVar2.zzb, true != z19 ? -9223372036854775807L : j8, false);
                        if (!z10 || j != this.zzH.zzc) {
                            this.zzH = zzap(zzxkVar3, j8, j, z14 ? j8 : this.zzH.zzd, z14, i3);
                        }
                        zzak();
                        zzZ(zzbfVar, this.zzH.zza);
                        this.zzH = this.zzH.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                            this.zzT = zzltVar3;
                        }
                        zzat(false);
                        this.zzi.zzh(2);
                        throw th;
                    }
                }
                zzX(false, false, false, true);
            } catch (java.lang.Throwable th2) {
                th = th2;
                z19 = z13;
                com.google.android.gms.internal.ads.zzms zzmsVar22 = this.zzH;
                com.google.android.gms.internal.ads.zzlt zzltVar32 = zzltVar2;
                zzag(zzbfVar, zzxkVar3, zzmsVar22.zza, zzmsVar22.zzb, true != z19 ? -9223372036854775807L : j8, false);
                if (!z10) {
                }
                this.zzH = zzap(zzxkVar3, j8, j, z14 ? j8 : this.zzH.zzd, z14, i3);
                zzak();
                zzZ(zzbfVar, this.zzH.zza);
                this.zzH = this.zzH.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                }
                zzat(false);
                this.zzi.zzh(2);
                throw th;
            }
        }
        com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
        for (int i14 = 0; i14 < 2; i14++) {
            zzneVarArr[i14].zzn(zzbfVar);
        }
        try {
            if (z10) {
                z21 = z13;
                z20 = false;
                if (!zzbfVar.zzg()) {
                    com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
                    for (com.google.android.gms.internal.ads.zzmc zzm3 = zzmfVar.zzm(); zzm3 != null; zzm3 = zzm3.zzp()) {
                        if (zzm3.zzg.zza.equals(zzxkVar3)) {
                            zzm3.zzg = zzmfVar.zzx(zzbfVar, zzm3.zzg);
                            zzm3.zzs();
                        }
                    }
                    j8 = zzS(zzxkVar3, j8, z11);
                }
            } else {
                try {
                    com.google.android.gms.internal.ads.zzmf zzmfVar2 = this.zzs;
                    long zzah = zzmfVar2.zzn() == null ? j5 : zzah(zzmfVar2.zzn());
                    if (zzaA() && zzmfVar2.zzo() != null) {
                        j5 = zzah(zzmfVar2.zzo());
                    }
                    z20 = false;
                    z21 = z13;
                    int zzw = zzmfVar2.zzw(zzbfVar, this.zzU, zzah, j5);
                    if ((zzw & 1) != 0) {
                        zzI(false);
                    } else if ((zzw & 2) != 0) {
                        zzab();
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    boolean z25 = z13;
                    z19 = z25;
                    zzltVar2 = null;
                    com.google.android.gms.internal.ads.zzms zzmsVar222 = this.zzH;
                    com.google.android.gms.internal.ads.zzlt zzltVar322 = zzltVar2;
                    zzag(zzbfVar, zzxkVar3, zzmsVar222.zza, zzmsVar222.zzb, true != z19 ? -9223372036854775807L : j8, false);
                    if (!z10) {
                    }
                    this.zzH = zzap(zzxkVar3, j8, j, z14 ? j8 : this.zzH.zzd, z14, i3);
                    zzak();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzat(false);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            com.google.android.gms.internal.ads.zzms zzmsVar3 = this.zzH;
            zzag(zzbfVar, zzxkVar3, zzmsVar3.zza, zzmsVar3.zzb, true != z21 ? -9223372036854775807L : j8, false);
            if (z10 || j != this.zzH.zzc) {
                this.zzH = zzap(zzxkVar3, j8, j, z14 ? j8 : this.zzH.zzd, z14, i3);
            }
            zzak();
            zzZ(zzbfVar, this.zzH.zza);
            this.zzH = this.zzH.zzd(zzbfVar);
            if (!zzbfVar.zzg()) {
                this.zzT = null;
            }
            zzat(z20);
            this.zzi.zzh(2);
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    private final void zzag(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbf zzbfVar2, com.google.android.gms.internal.ads.zzxk zzxkVar2, long j, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        if (!zzP(zzbfVar, zzxkVar)) {
            com.google.android.gms.internal.ads.zzav zzavVar = zzxkVar.zzb() ? com.google.android.gms.internal.ads.zzav.zza : this.zzH.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzam(this.zzH.zzo, zzavVar.zzb, false, false);
            return;
        }
        java.lang.Object obj = zzxkVar.zza;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzm;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        com.google.android.gms.internal.ads.zzjd zzjdVar = this.zzae;
        com.google.android.gms.internal.ads.zzaf zzafVar = zzbeVar.zzj;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzjdVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzjdVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!java.util.Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzjdVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        if (zzmcVar == null) {
            return 0L;
        }
        long zza2 = zzmcVar.zza();
        if (zzmcVar.zze) {
            int i = 0;
            while (true) {
                com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzneVarArr[i].zzp(zzmcVar)) {
                    long zzf = zzneVarArr[i].zzf(zzmcVar);
                    if (zzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zza2 = java.lang.Math.max(zzf, zza2);
                }
                i++;
            }
        }
        return zza2;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0354 A[LOOP:9: B:204:0x0352->B:205:0x0354, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzai() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzmc zzm;
        com.google.android.gms.internal.ads.zzmc zzp;
        boolean z;
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzne[] zzneVarArr;
        boolean z2;
        com.google.android.gms.internal.ads.zzmc zzo;
        com.google.android.gms.internal.ads.zzmd zzh;
        if (this.zzH.zza.zzg() || !this.zzt.zzb()) {
            return;
        }
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        zzmfVar.zzf(this.zzU);
        if (zzmfVar.zzg() && (zzh = zzmfVar.zzh(this.zzU, this.zzH)) != null) {
            com.google.android.gms.internal.ads.zzmc zzi = zzmfVar.zzi(zzh);
            if (!zzi.zzd) {
                zzi.zzt(this, zzh.zzb);
            } else if (zzi.zze) {
                this.zzi.zzd(8, zzi.zza).zza();
            }
            if (zzmfVar.zzm() == zzi) {
                zzU(zzh.zzb, true);
            }
            zzat(false);
        }
        if (this.zzO) {
            this.zzO = zzaG(zzmfVar.zzk());
            zzao();
        } else {
            zzan();
        }
        if (!this.zzL && this.zzy && !this.zzac && !zzaA() && (zzo = zzmfVar.zzo()) != null && zzo == zzmfVar.zzn() && zzo.zzp() != null && zzo.zzp().zze && zzaw(zzo.zzp()) <= 10000000) {
            zzmfVar.zzq();
            com.google.android.gms.internal.ads.zzmc zzo2 = zzmfVar.zzo();
            if (zzo2 != null) {
                com.google.android.gms.internal.ads.zzabi zzr = zzo2.zzr();
                int i3 = 0;
                while (true) {
                    com.google.android.gms.internal.ads.zzne[] zzneVarArr2 = this.zzb;
                    if (i3 >= 2) {
                        break;
                    }
                    if (zzr.zza(i3) && zzneVarArr2[i3].zza() && !zzneVarArr2[i3].zzc()) {
                        zzneVarArr2[i3].zzb();
                        zzas(zzo2, i3, false, zzo2.zzc());
                    }
                    i3++;
                }
                if (zzaA()) {
                    this.zzab = zzo2.zza.zzh();
                    if (!zzo2.zzd()) {
                        zzmfVar.zzs(zzo2);
                        zzat(false);
                        zzan();
                    }
                }
            }
        }
        com.google.android.gms.internal.ads.zzmc zzn = zzmfVar.zzn();
        if (zzn != null) {
            if (zzn.zzp() != null && !this.zzL) {
                com.google.android.gms.internal.ads.zzmc zzn2 = zzmfVar.zzn();
                if (zzn2.zze) {
                    int i4 = 0;
                    while (true) {
                        com.google.android.gms.internal.ads.zzne[] zzneVarArr3 = this.zzb;
                        if (i4 < 2) {
                            if (!zzneVarArr3[i4].zzr(zzn2)) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if ((!zzaA() || zzmfVar.zzo() != zzmfVar.zzn()) && ((zzn.zzp().zze || this.zzU >= zzn.zzp().zzc()) && (!zzn.zzp().zze || zzaw(zzn.zzp()) <= 10000000))) {
                            com.google.android.gms.internal.ads.zzabi zzr2 = zzn.zzr();
                            com.google.android.gms.internal.ads.zzmc zzp2 = zzmfVar.zzp();
                            com.google.android.gms.internal.ads.zzabi zzr3 = zzp2.zzr();
                            com.google.android.gms.internal.ads.zzbf zzbfVar = this.zzH.zza;
                            zzag(zzbfVar, zzp2.zzg.zza, zzbfVar, zzn.zzg.zza, -9223372036854775807L, false);
                            if (zzp2.zze && (((z2 = this.zzy) && this.zzab != -9223372036854775807L) || zzp2.zza.zzh() != -9223372036854775807L)) {
                                this.zzab = -9223372036854775807L;
                                if (z2 && !this.zzac) {
                                    for (int i5 = 0; i5 < 2; i5++) {
                                        if (zzr3.zza(i5)) {
                                            zzneVarArr3[i5].zze();
                                            com.google.android.gms.internal.ads.zzaba[] zzabaVarArr = zzr3.zzc;
                                            if (!com.google.android.gms.internal.ads.zzas.zzd(zzabaVarArr[i5].zzc().zzp, zzabaVarArr[i5].zzc().zzk) && !zzneVarArr3[i5].zzc()) {
                                            }
                                        }
                                    }
                                }
                                long zzc = zzp2.zzc();
                                for (int i6 = 0; i6 < 2; i6++) {
                                    zzneVarArr3[i6].zzj(zzc);
                                }
                                if (!zzp2.zzd()) {
                                    zzmfVar.zzs(zzp2);
                                    zzat(false);
                                    zzan();
                                }
                            }
                            for (int i7 = 0; i7 < 2; i7++) {
                                zzneVarArr3[i7].zzi(zzr2, zzr3, zzp2.zzc());
                            }
                        }
                    }
                }
            } else if (zzn.zzg.zzk || this.zzL) {
                com.google.android.gms.internal.ads.zzne[] zzneVarArr4 = this.zzb;
                for (int i8 = 0; i8 < 2; i8++) {
                    com.google.android.gms.internal.ads.zzne zzneVar = zzneVarArr4[i8];
                    if (zzneVar.zzp(zzn) && zzneVar.zzg(zzn)) {
                        long j = zzn.zzg.zzf;
                        zzneVar.zzh(zzn, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : zzn.zza() + j);
                    }
                }
            }
        }
        com.google.android.gms.internal.ads.zzmc zzn3 = zzmfVar.zzn();
        if (zzn3 != null && zzmfVar.zzm() != zzn3 && !zzn3.zzh) {
            com.google.android.gms.internal.ads.zzmc zzn4 = zzmfVar.zzn();
            com.google.android.gms.internal.ads.zzabi zzr4 = zzn4.zzr();
            int i9 = 0;
            int i10 = 1;
            while (true) {
                zzneVarArr = this.zzb;
                if (i9 >= 2) {
                    break;
                }
                int zzd = zzneVarArr[i9].zzd();
                int zzH = zzneVarArr[i9].zzH(zzn4, zzr4, this.zzo);
                this.zzS -= zzd - zzneVarArr[i9].zzd();
                i10 &= zzH & 1;
                i9++;
            }
            if (i10 != 0) {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (zzr4.zza(i11) && !zzneVarArr[i11].zzp(zzn4)) {
                        zzas(zzn4, i11, false, zzn4.zzc());
                    }
                }
                zzmfVar.zzn().zzh = true;
            }
        }
        boolean z3 = false;
        while (zzay() && !this.zzL && (zzm = zzmfVar.zzm()) != null && (zzp = zzm.zzp()) != null && this.zzU >= zzp.zzc() && zzp.zzh) {
            if (z3) {
                zzC();
            }
            this.zzac = false;
            com.google.android.gms.internal.ads.zzmc zzr5 = zzmfVar.zzr();
            zzr5.getClass();
            if (this.zzH.zzb.zza.equals(zzr5.zzg.zza.zza)) {
                com.google.android.gms.internal.ads.zzxk zzxkVar = this.zzH.zzb;
                if (zzxkVar.zzb == -1) {
                    com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzr5.zzg.zza;
                    if (zzxkVar2.zzb == -1 && zzxkVar.zze != zzxkVar2.zze) {
                        z = true;
                        com.google.android.gms.internal.ads.zzmd zzmdVar = zzr5.zzg;
                        com.google.android.gms.internal.ads.zzxk zzxkVar3 = zzmdVar.zza;
                        long j2 = zzmdVar.zzb;
                        this.zzH = zzap(zzxkVar3, j2, zzmdVar.zzd, j2, !z, 0);
                        zzak();
                        zzL();
                        if (zzaA() && zzr5 == zzmfVar.zzo()) {
                            com.google.android.gms.internal.ads.zzne[] zzneVarArr5 = this.zzb;
                            for (i2 = 0; i2 < 2; i2++) {
                                zzneVarArr5[i2].zzB();
                            }
                        }
                        if (this.zzH.zze == 3) {
                            zzJ();
                        }
                        com.google.android.gms.internal.ads.zzabi zzr6 = zzmfVar.zzm().zzr();
                        i = 0;
                        while (true) {
                            com.google.android.gms.internal.ads.zzne[] zzneVarArr6 = this.zzb;
                            if (i >= 2) {
                                if (zzr6.zza(i)) {
                                    zzneVarArr6[i].zzl();
                                }
                                i++;
                            }
                        }
                        z3 = true;
                    }
                }
            }
            z = false;
            com.google.android.gms.internal.ads.zzmd zzmdVar2 = zzr5.zzg;
            com.google.android.gms.internal.ads.zzxk zzxkVar32 = zzmdVar2.zza;
            long j22 = zzmdVar2.zzb;
            this.zzH = zzap(zzxkVar32, j22, zzmdVar2.zzd, j22, !z, 0);
            zzak();
            zzL();
            if (zzaA()) {
                com.google.android.gms.internal.ads.zzne[] zzneVarArr52 = this.zzb;
                while (i2 < 2) {
                }
            }
            if (this.zzH.zze == 3) {
            }
            com.google.android.gms.internal.ads.zzabi zzr62 = zzmfVar.zzm().zzr();
            i = 0;
            while (true) {
                com.google.android.gms.internal.ads.zzne[] zzneVarArr62 = this.zzb;
                if (i >= 2) {
                    break;
                }
                i++;
            }
            z3 = true;
        }
        long j3 = this.zzaa.zzb;
    }

    private final void zzaj() {
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        zzmfVar.zzt();
        com.google.android.gms.internal.ads.zzmc zzl = zzmfVar.zzl();
        if (zzl != null) {
            if (!zzl.zzd || zzl.zze) {
                com.google.android.gms.internal.ads.zzxi zzxiVar = zzl.zza;
                if (zzxiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzH.zza, zzl.zzg.zza, zzl.zze ? zzxiVar.zzi() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzt(this, zzl.zzg.zzb);
                        return;
                    }
                    com.google.android.gms.internal.ads.zzlz zzlzVar = new com.google.android.gms.internal.ads.zzlz();
                    zzlzVar.zza(this.zzU - zzl.zza());
                    zzlzVar.zzb(this.zzo.zzj().zzb);
                    zzlzVar.zzc(this.zzN);
                    zzl.zzj(new com.google.android.gms.internal.ads.zzma(zzlzVar, null));
                }
            }
        }
    }

    private final void zzak() {
        com.google.android.gms.internal.ads.zzmc zzm = this.zzs.zzm();
        boolean z = false;
        if (zzm != null && zzm.zzg.zzj && this.zzK) {
            z = true;
        }
        this.zzL = z;
    }

    private final void zzal(com.google.android.gms.internal.ads.zzav zzavVar, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        zzam(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzam(com.google.android.gms.internal.ads.zzav zzavVar, float f, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        int i;
        if (z) {
            if (z2) {
                this.zzI.zza(1);
            }
            com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
            com.google.android.gms.internal.ads.zzbf zzbfVar = zzmsVar.zza;
            com.google.android.gms.internal.ads.zzxk zzxkVar = zzmsVar.zzb;
            long j = zzmsVar.zzc;
            long j2 = zzmsVar.zzd;
            int i2 = zzmsVar.zze;
            com.google.android.gms.internal.ads.zzjk zzjkVar = zzmsVar.zzf;
            boolean z3 = zzmsVar.zzg;
            com.google.android.gms.internal.ads.zzzn zzznVar = zzmsVar.zzh;
            com.google.android.gms.internal.ads.zzabi zzabiVar = zzmsVar.zzi;
            java.util.List list = zzmsVar.zzj;
            com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzmsVar.zzk;
            boolean z4 = zzmsVar.zzl;
            int i3 = zzmsVar.zzm;
            int i4 = zzmsVar.zzn;
            long j3 = zzmsVar.zzq;
            long j4 = zzmsVar.zzr;
            long j5 = zzmsVar.zzs;
            long j6 = zzmsVar.zzt;
            boolean z5 = zzmsVar.zzp;
            this.zzH = new com.google.android.gms.internal.ads.zzms(zzbfVar, zzxkVar, j, j2, i2, zzjkVar, z3, zzznVar, zzabiVar, list, zzxkVar2, z4, i3, i4, zzavVar, j3, j4, j5, j6, false);
        }
        float f2 = zzavVar.zzb;
        com.google.android.gms.internal.ads.zzmc zzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzm == null) {
                break;
            }
            com.google.android.gms.internal.ads.zzaba[] zzabaVarArr = zzm.zzr().zzc;
            int length = zzabaVarArr.length;
            while (i < length) {
                com.google.android.gms.internal.ads.zzaba zzabaVar = zzabaVarArr[i];
                i++;
            }
            zzm = zzm.zzp();
        }
        com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
        while (i < 2) {
            zzneVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzan() {
        long zza2;
        long j;
        com.google.android.gms.internal.ads.zzmf zzmfVar;
        boolean zzh;
        com.google.android.gms.internal.ads.zzmf zzmfVar2 = this.zzs;
        if (zzaG(zzmfVar2.zzk())) {
            com.google.android.gms.internal.ads.zzmc zzk = zzmfVar2.zzk();
            long zzav = zzav(zzk.zzg());
            if (zzk == zzmfVar2.zzm()) {
                zza2 = this.zzU;
                j = zzk.zza();
            } else {
                zza2 = this.zzU - zzk.zza();
                j = zzk.zzg.zzb;
            }
            zzmfVar = zzmfVar2;
            com.google.android.gms.internal.ads.zzlx zzlxVar = new com.google.android.gms.internal.ads.zzlx(this.zzv, this.zzH.zza, zzk.zzg.zza, zza2 - j, zzav, this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN);
            com.google.android.gms.internal.ads.zzly zzlyVar = this.zzg;
            zzh = zzlyVar.zzh(zzlxVar);
            com.google.android.gms.internal.ads.zzmc zzm = zzmfVar.zzm();
            if (!zzh && zzm.zze && zzav < 500000 && this.zzn > 0) {
                zzm.zza.zzf(this.zzH.zzs, false);
                zzh = zzlyVar.zzh(zzlxVar);
            }
        } else {
            zzmfVar = zzmfVar2;
            zzh = false;
        }
        this.zzO = zzh;
        if (zzh) {
            com.google.android.gms.internal.ads.zzmc zzk2 = zzmfVar.zzk();
            zzk2.getClass();
            com.google.android.gms.internal.ads.zzlz zzlzVar = new com.google.android.gms.internal.ads.zzlz();
            zzlzVar.zza(this.zzU - zzk2.zza());
            zzlzVar.zzb(this.zzo.zzj().zzb);
            zzlzVar.zzc(this.zzN);
            zzk2.zzj(new com.google.android.gms.internal.ads.zzma(zzlzVar, null));
        }
        zzao();
    }

    private final void zzao() {
        com.google.android.gms.internal.ads.zzmc zzk = this.zzs.zzk();
        boolean z = true;
        if (!this.zzO && (zzk == null || !zzk.zza.zzn())) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        if (z != zzmsVar.zzg) {
            this.zzH = zzmsVar.zzg(z);
        }
    }

    private final com.google.android.gms.internal.ads.zzms zzap(com.google.android.gms.internal.ads.zzxk zzxkVar, long j, long j2, long j3, boolean z, int i) {
        java.util.List list;
        com.google.android.gms.internal.ads.zzzn zzznVar;
        com.google.android.gms.internal.ads.zzabi zzabiVar;
        com.google.android.gms.internal.ads.zzmc zzm;
        int i2 = 0;
        this.zzX = (!this.zzX && j == this.zzH.zzs && zzxkVar.equals(this.zzH.zzb)) ? false : true;
        zzak();
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        com.google.android.gms.internal.ads.zzzn zzznVar2 = zzmsVar.zzh;
        com.google.android.gms.internal.ads.zzabi zzabiVar2 = zzmsVar.zzi;
        java.util.List list2 = zzmsVar.zzj;
        if (this.zzt.zzb()) {
            com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
            com.google.android.gms.internal.ads.zzmc zzm2 = zzmfVar.zzm();
            com.google.android.gms.internal.ads.zzzn zzq = zzm2 == null ? com.google.android.gms.internal.ads.zzzn.zza : zzm2.zzq();
            com.google.android.gms.internal.ads.zzabi zzr = zzm2 == null ? this.zzf : zzm2.zzr();
            com.google.android.gms.internal.ads.zzaba[] zzabaVarArr = zzr.zzc;
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
            boolean z2 = false;
            for (com.google.android.gms.internal.ads.zzaba zzabaVar : zzabaVarArr) {
                if (zzabaVar != null) {
                    com.google.android.gms.internal.ads.zzap zzapVar = zzabaVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, new com.google.android.gms.internal.ads.zzao[0]));
                    } else {
                        zzgwjVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            com.google.android.gms.internal.ads.zzgwm zzi = z2 ? zzgwjVar.zzi() : com.google.android.gms.internal.ads.zzgwm.zzi();
            if (zzm2 != null) {
                com.google.android.gms.internal.ads.zzmd zzmdVar = zzm2.zzg;
                if (zzmdVar.zzd != j2) {
                    zzm2.zzg = zzmdVar.zzb(j2);
                }
            }
            if (zzmfVar.zzm() == zzmfVar.zzn() && (zzm = zzmfVar.zzm()) != null) {
                com.google.android.gms.internal.ads.zzabi zzr2 = zzm.zzr();
                while (true) {
                    com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzr2.zza(i2)) {
                        if (zzneVarArr[i2].zze() != 1) {
                            break;
                        }
                        int i3 = zzr2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzi;
            zzznVar = zzq;
            zzabiVar = zzr;
        } else if (zzxkVar.equals(this.zzH.zzb)) {
            list = list2;
            zzznVar = zzznVar2;
            zzabiVar = zzabiVar2;
        } else {
            zzabiVar = this.zzf;
            zzznVar = com.google.android.gms.internal.ads.zzzn.zza;
            list = com.google.android.gms.internal.ads.zzgwm.zzi();
        }
        if (z) {
            this.zzI.zzc(i);
        }
        return this.zzH.zzc(zzxkVar, j, j2, j3, zzau(), zzznVar, zzabiVar, list);
    }

    private final void zzaq() throws com.google.android.gms.internal.ads.zzjk {
        zzar(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzar(boolean[] zArr, long j) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzne[] zzneVarArr;
        com.google.android.gms.internal.ads.zzmc zzn = this.zzs.zzn();
        com.google.android.gms.internal.ads.zzabi zzr = zzn.zzr();
        int i = 0;
        while (true) {
            zzneVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzr.zza(i)) {
                zzneVarArr[i].zzG();
            }
            i++;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzr.zza(i2) && !zzneVarArr[i2].zzp(zzn)) {
                zzas(zzn, i2, zArr[i2], j);
            }
        }
    }

    private final void zzas(com.google.android.gms.internal.ads.zzmc zzmcVar, int i, boolean z, long j) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzne zzneVar = this.zzb[i];
        if (zzneVar.zzM()) {
            return;
        }
        boolean z2 = zzmcVar == this.zzs.zzm();
        com.google.android.gms.internal.ads.zzabi zzr = zzmcVar.zzr();
        com.google.android.gms.internal.ads.zznd zzndVar = zzr.zzb[i];
        com.google.android.gms.internal.ads.zzaba zzabaVar = zzr.zzc[i];
        boolean z3 = zzay() && this.zzH.zze == 3;
        boolean z4 = !z && z3;
        this.zzS++;
        zzneVar.zzx(zzndVar, zzabaVar, zzmcVar.zzc[i], this.zzU, z4, z2, j, zzmcVar.zza(), zzmcVar.zzg.zza, this.zzo);
        zzneVar.zzy(11, new com.google.android.gms.internal.ads.zzli(this), zzmcVar);
        if (z3 && z2) {
            zzneVar.zzv();
        }
    }

    private final void zzat(boolean z) {
        com.google.android.gms.internal.ads.zzmc zzk = this.zzs.zzk();
        com.google.android.gms.internal.ads.zzxk zzxkVar = zzk == null ? this.zzH.zzb : zzk.zzg.zza;
        boolean z2 = !this.zzH.zzk.equals(zzxkVar);
        if (z2) {
            this.zzH = this.zzH.zzh(zzxkVar);
        }
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        zzmsVar.zzq = zzk == null ? zzmsVar.zzs : zzk.zzf();
        this.zzH.zzr = zzau();
        if ((z2 || z) && zzk != null && zzk.zze) {
            zzax(zzk.zzg.zza, zzk.zzq(), zzk.zzr());
        }
    }

    private final long zzau() {
        return zzav(this.zzH.zzq);
    }

    private final long zzav(long j) {
        com.google.android.gms.internal.ads.zzmc zzk = this.zzs.zzk();
        if (zzk == null) {
            return 0L;
        }
        return java.lang.Math.max(0L, j - (this.zzU - zzk.zza()));
    }

    private final long zzaw(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        com.google.android.gms.internal.ads.zzgtj.zzi(zzmcVar.zze);
        return (long) ((zzmcVar.zzc() - this.zzU) / this.zzo.zzj().zzb);
    }

    private final void zzax(com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzabi zzabiVar) {
        long zza2;
        long j;
        com.google.android.gms.internal.ads.zzmf zzmfVar = this.zzs;
        com.google.android.gms.internal.ads.zzmc zzk = zzmfVar.zzk();
        zzk.getClass();
        if (zzk == zzmfVar.zzm()) {
            zza2 = this.zzU;
            j = zzk.zza();
        } else {
            zza2 = this.zzU - zzk.zza();
            j = zzk.zzg.zzb;
        }
        this.zzg.zzb(new com.google.android.gms.internal.ads.zzlx(this.zzv, this.zzH.zza, zzxkVar, zza2 - j, zzav(zzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN), zzznVar, zzabiVar.zzc);
    }

    private final boolean zzay() {
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
        return zzmsVar.zzl && zzmsVar.zzn == 0;
    }

    private final void zzaz(int i) throws java.io.IOException, com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzne zzneVar = this.zzb[i];
        try {
            com.google.android.gms.internal.ads.zzmc zzm = this.zzs.zzm();
            zzm.getClass();
            com.google.android.gms.internal.ads.zzmc zzmcVar = zzm;
            zzneVar.zzu(zzm);
        } catch (java.io.IOException | java.lang.RuntimeException e) {
            zzneVar.zze();
            throw e;
        }
    }

    static int zzr(com.google.android.gms.internal.ads.zzbe zzbeVar, com.google.android.gms.internal.ads.zzbd zzbdVar, int i, boolean z, java.lang.Object obj, com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzbf zzbfVar2) {
        java.lang.Object obj2 = zzbfVar.zzb(zzbfVar.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zze = zzbfVar.zze(obj);
        int zzc = zzbfVar.zzc();
        int i3 = zze;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            if (i5 >= zzc || i4 != -1) {
                break;
            }
            i3 = zzbfVar.zzl(i3, zzbdVar, zzbeVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzbfVar2.zze(zzbfVar.zzf(i3));
            i5++;
        }
        if (i4 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(i4, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(com.google.android.gms.internal.ads.zzmw zzmwVar) {
        try {
            zzaF(zzmwVar);
        } catch (com.google.android.gms.internal.ads.zzjk e) {
            com.google.android.gms.internal.ads.zzeg.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x0643, code lost:
    
        if (r6 == false) goto L294;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0803 A[ADDED_TO_REGION, LOOP:4: B:180:0x0803->B:183:0x080b, LOOP_START, PHI: r2
      0x0803: PHI (r2v36 com.google.android.gms.internal.ads.zzmc) = (r2v32 com.google.android.gms.internal.ads.zzmc), (r2v37 com.google.android.gms.internal.ads.zzmc) binds: [B:179:0x0800, B:183:0x080b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06e7 A[Catch: RuntimeException -> 0x072f, zzjk -> 0x0731, IOException -> 0x0765, zzwk -> 0x076d, zzhq -> 0x0775, zzat -> 0x077d, zzuf -> 0x0794, TryCatch #20 {zzjk -> 0x0731, RuntimeException -> 0x072f, blocks: (B:275:0x0677, B:278:0x067f, B:280:0x0683, B:282:0x068b, B:284:0x068e, B:287:0x0692, B:289:0x0698, B:291:0x06a1, B:293:0x06ab, B:295:0x06b1, B:297:0x06bc, B:298:0x06e1, B:300:0x06e7, B:303:0x06f1, B:306:0x070e, B:312:0x0705, B:314:0x0709, B:316:0x06c3, B:319:0x06d1, B:320:0x06d9, B:321:0x06da, B:330:0x0612, B:332:0x061f, B:333:0x0631, B:335:0x0638, B:337:0x063c, B:340:0x0645, B:342:0x0655, B:344:0x065b, B:346:0x0665, B:348:0x066a, B:350:0x066f, B:351:0x0674, B:374:0x05d9, B:386:0x0718, B:389:0x0722), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x061f A[Catch: RuntimeException -> 0x072f, zzjk -> 0x0731, IOException -> 0x0765, zzwk -> 0x076d, zzhq -> 0x0775, zzat -> 0x077d, zzuf -> 0x0794, TryCatch #20 {zzjk -> 0x0731, RuntimeException -> 0x072f, blocks: (B:275:0x0677, B:278:0x067f, B:280:0x0683, B:282:0x068b, B:284:0x068e, B:287:0x0692, B:289:0x0698, B:291:0x06a1, B:293:0x06ab, B:295:0x06b1, B:297:0x06bc, B:298:0x06e1, B:300:0x06e7, B:303:0x06f1, B:306:0x070e, B:312:0x0705, B:314:0x0709, B:316:0x06c3, B:319:0x06d1, B:320:0x06d9, B:321:0x06da, B:330:0x0612, B:332:0x061f, B:333:0x0631, B:335:0x0638, B:337:0x063c, B:340:0x0645, B:342:0x0655, B:344:0x065b, B:346:0x0665, B:348:0x066a, B:350:0x066f, B:351:0x0674, B:374:0x05d9, B:386:0x0718, B:389:0x0722), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0638 A[Catch: RuntimeException -> 0x072f, zzjk -> 0x0731, IOException -> 0x0765, zzwk -> 0x076d, zzhq -> 0x0775, zzat -> 0x077d, zzuf -> 0x0794, TryCatch #20 {zzjk -> 0x0731, RuntimeException -> 0x072f, blocks: (B:275:0x0677, B:278:0x067f, B:280:0x0683, B:282:0x068b, B:284:0x068e, B:287:0x0692, B:289:0x0698, B:291:0x06a1, B:293:0x06ab, B:295:0x06b1, B:297:0x06bc, B:298:0x06e1, B:300:0x06e7, B:303:0x06f1, B:306:0x070e, B:312:0x0705, B:314:0x0709, B:316:0x06c3, B:319:0x06d1, B:320:0x06d9, B:321:0x06da, B:330:0x0612, B:332:0x061f, B:333:0x0631, B:335:0x0638, B:337:0x063c, B:340:0x0645, B:342:0x0655, B:344:0x065b, B:346:0x0665, B:348:0x066a, B:350:0x066f, B:351:0x0674, B:374:0x05d9, B:386:0x0718, B:389:0x0722), top: B:5:0x0012 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(android.os.Message message) {
        java.lang.String str;
        java.lang.String str2;
        com.google.android.gms.internal.ads.zzjk zzjkVar;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.RuntimeException runtimeException;
        com.google.android.gms.internal.ads.zzjk zzjkVar2;
        com.google.android.gms.internal.ads.zzjk zzjkVar3;
        boolean z;
        int i;
        com.google.android.gms.internal.ads.zzxk zzxkVar;
        com.google.android.gms.internal.ads.zzmf zzmfVar;
        com.google.android.gms.internal.ads.zzmc zzo;
        com.google.android.gms.internal.ads.zzmc zzn;
        com.google.android.gms.internal.ads.zzd zzdVar;
        com.google.android.gms.internal.ads.zzmf zzmfVar2;
        boolean z2;
        boolean z3;
        long j;
        boolean zzi;
        int i2;
        com.google.android.gms.internal.ads.zzmf zzmfVar3;
        int i3;
        try {
            try {
                try {
                    zzdVar = null;
                } catch (java.lang.RuntimeException e) {
                    e = e;
                    str3 = "Playback error";
                    str4 = "ExoPlayerImplInternal";
                }
            } catch (com.google.android.gms.internal.ads.zzjk e2) {
                str = "Playback error";
                str2 = "ExoPlayerImplInternal";
                zzjkVar = e2;
            }
            try {
                try {
                    try {
                    } catch (java.lang.RuntimeException e3) {
                        e = e3;
                    }
                } catch (com.google.android.gms.internal.ads.zzjk e4) {
                    e = e4;
                }
            } catch (com.google.android.gms.internal.ads.zzjk e5) {
                e = e5;
            } catch (java.lang.RuntimeException e6) {
                e = e6;
                runtimeException = e;
                com.google.android.gms.internal.ads.zzjk zzc = com.google.android.gms.internal.ads.zzjk.zzc(runtimeException, (!(runtimeException instanceof java.lang.IllegalStateException) || (runtimeException instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000);
                com.google.android.gms.internal.ads.zzeg.zzf(str4, str3, zzc);
                zzW(true, false);
                this.zzH = this.zzH.zzf(zzc);
                z = true;
                zzC();
                return z;
            }
        } catch (com.google.android.gms.internal.ads.zzat e7) {
            e = e7;
        } catch (com.google.android.gms.internal.ads.zzhq e8) {
            e = e8;
        } catch (com.google.android.gms.internal.ads.zzuf e9) {
            e = e9;
        } catch (com.google.android.gms.internal.ads.zzwk e10) {
            e = e10;
        } catch (java.io.IOException e11) {
            e = e11;
        }
        switch (message.what) {
            case 1:
                zzE(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                z = true;
                zzC();
                return z;
            case 2:
                int i4 = 2;
                boolean z4 = false;
                try {
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    this.zzi.zzk(2);
                    boolean z5 = this.zzA;
                    if (!z5) {
                        zzai();
                    }
                    int i5 = this.zzH.zze;
                    if (i5 != 1 && i5 != 4) {
                        if (z5) {
                            zzai();
                        }
                        com.google.android.gms.internal.ads.zzmf zzmfVar4 = this.zzs;
                        com.google.android.gms.internal.ads.zzmc zzm = zzmfVar4.zzm();
                        if (zzm == null) {
                            zzQ(uptimeMillis);
                        } else {
                            android.os.Trace.beginSection("doSomeWork");
                            zzL();
                            if (zzm.zze) {
                                this.zzV = com.google.android.gms.internal.ads.zzfl.zzs(android.os.SystemClock.elapsedRealtime());
                                zzm.zza.zzf(this.zzH.zzs - this.zzn, false);
                                int i6 = 0;
                                z2 = true;
                                z3 = true;
                                while (true) {
                                    com.google.android.gms.internal.ads.zzne[] zzneVarArr = this.zzb;
                                    if (i6 < i4) {
                                        com.google.android.gms.internal.ads.zzne zzneVar = zzneVarArr[i6];
                                        if (zzneVar.zzd() == 0) {
                                            zzN(i6, z4);
                                            zzmfVar3 = zzmfVar4;
                                        } else {
                                            zzmfVar3 = zzmfVar4;
                                            zzneVar.zzs(this.zzU, this.zzV);
                                            z3 = z3 && zzneVar.zzo();
                                            boolean zzt = zzneVar.zzt(zzm);
                                            zzN(i6, zzt);
                                            boolean z6 = z2 && zzt;
                                            if (!zzt) {
                                                zzaz(i6);
                                            }
                                            z2 = z6;
                                        }
                                        i6++;
                                        zzmfVar4 = zzmfVar3;
                                        i4 = 2;
                                        z4 = false;
                                    } else {
                                        zzmfVar2 = zzmfVar4;
                                    }
                                }
                            } else {
                                zzmfVar2 = zzmfVar4;
                                zzm.zza.zzc();
                                z2 = true;
                                z3 = true;
                            }
                            long j2 = zzm.zzg.zzf;
                            if (z3 && zzm.zze && (j2 == -9223372036854775807L || j2 <= this.zzH.zzs)) {
                                if (this.zzL) {
                                    this.zzL = false;
                                    zzE(false, this.zzH.zzn, false, 5);
                                }
                                if (zzm.zzg.zzk) {
                                    zzB(4);
                                    zzK();
                                    j = uptimeMillis;
                                    int i7 = 2;
                                    if (this.zzH.zze == 2) {
                                        int i8 = 0;
                                        while (true) {
                                            com.google.android.gms.internal.ads.zzne[] zzneVarArr2 = this.zzb;
                                            if (i8 < i7) {
                                                if (zzneVarArr2[i8].zzp(zzm)) {
                                                    zzaz(i8);
                                                }
                                                i8++;
                                                i7 = 2;
                                            } else {
                                                com.google.android.gms.internal.ads.zzms zzmsVar = this.zzH;
                                                if (!zzmsVar.zzg && zzmsVar.zzr < 500000 && zzaG(zzmfVar2.zzk()) && zzay()) {
                                                    if (this.zzZ == -9223372036854775807L) {
                                                        this.zzZ = android.os.SystemClock.elapsedRealtime();
                                                    } else if (android.os.SystemClock.elapsedRealtime() - this.zzZ >= 4000) {
                                                        throw new com.google.android.gms.internal.ads.zzfd(0, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
                                                    }
                                                    boolean z7 = !zzay() && this.zzH.zze == 3;
                                                    boolean z8 = this.zzH.zzp;
                                                    i2 = this.zzH.zze;
                                                    if (i2 != 4 && (z7 || i2 == 2 || (i2 == 3 && this.zzS != 0))) {
                                                        zzQ(j);
                                                    }
                                                    android.os.Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    this.zzZ = -9223372036854775807L;
                                    if (zzay()) {
                                    }
                                    boolean z82 = this.zzH.zzp;
                                    i2 = this.zzH.zze;
                                    if (i2 != 4) {
                                        zzQ(j);
                                    }
                                    android.os.Trace.endSection();
                                }
                            }
                            com.google.android.gms.internal.ads.zzms zzmsVar2 = this.zzH;
                            if (zzmsVar2.zze == 2) {
                                if (this.zzS == 0) {
                                    zzi = zzae();
                                    j = uptimeMillis;
                                } else if (z2) {
                                    if (zzmsVar2.zzg) {
                                        com.google.android.gms.internal.ads.zzmc zzm2 = zzmfVar2.zzm();
                                        long zze = zzP(this.zzH.zza, zzm2.zzg.zza) ? this.zzae.zze() : -9223372036854775807L;
                                        com.google.android.gms.internal.ads.zzmc zzk = zzmfVar2.zzk();
                                        boolean z9 = zzk.zzd() && zzk.zzg.zzk;
                                        boolean z10 = zzk.zzg.zza.zzb() && !zzk.zze;
                                        if (!z9 && !z10) {
                                            j = uptimeMillis;
                                            zzi = this.zzg.zzi(new com.google.android.gms.internal.ads.zzlx(this.zzv, this.zzH.zza, zzm2.zzg.zza, this.zzU - zzm2.zza(), zzav(zzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zze, this.zzN));
                                        }
                                    }
                                    j = uptimeMillis;
                                    zzB(3);
                                    this.zzY = null;
                                    if (zzay()) {
                                        zzaD(false, false);
                                        this.zzo.zza();
                                        zzJ();
                                    }
                                    int i72 = 2;
                                    if (this.zzH.zze == 2) {
                                    }
                                    this.zzZ = -9223372036854775807L;
                                    if (zzay()) {
                                    }
                                    boolean z822 = this.zzH.zzp;
                                    i2 = this.zzH.zze;
                                    if (i2 != 4) {
                                    }
                                    android.os.Trace.endSection();
                                }
                                if (zzi) {
                                    zzB(3);
                                    this.zzY = null;
                                    if (zzay()) {
                                    }
                                    int i722 = 2;
                                    if (this.zzH.zze == 2) {
                                    }
                                    this.zzZ = -9223372036854775807L;
                                    if (zzay()) {
                                    }
                                    boolean z8222 = this.zzH.zzp;
                                    i2 = this.zzH.zze;
                                    if (i2 != 4) {
                                    }
                                    android.os.Trace.endSection();
                                }
                                if (this.zzH.zze == 3) {
                                    if (this.zzS == 0) {
                                        if (!zzae()) {
                                            zzaD(zzay(), false);
                                            zzB(2);
                                            if (this.zzM) {
                                                for (com.google.android.gms.internal.ads.zzmc zzm3 = zzmfVar2.zzm(); zzm3 != null; zzm3 = zzm3.zzp()) {
                                                    for (com.google.android.gms.internal.ads.zzaba zzabaVar : zzm3.zzr().zzc) {
                                                    }
                                                }
                                                this.zzae.zzc();
                                            }
                                            zzK();
                                        }
                                    }
                                }
                                int i7222 = 2;
                                if (this.zzH.zze == 2) {
                                }
                                this.zzZ = -9223372036854775807L;
                                if (zzay()) {
                                }
                                boolean z82222 = this.zzH.zzp;
                                i2 = this.zzH.zze;
                                if (i2 != 4) {
                                }
                                android.os.Trace.endSection();
                            }
                            j = uptimeMillis;
                            if (this.zzH.zze == 3) {
                            }
                            int i72222 = 2;
                            if (this.zzH.zze == 2) {
                            }
                            this.zzZ = -9223372036854775807L;
                            if (zzay()) {
                            }
                            boolean z822222 = this.zzH.zzp;
                            i2 = this.zzH.zze;
                            if (i2 != 4) {
                            }
                            android.os.Trace.endSection();
                        }
                    }
                } catch (com.google.android.gms.internal.ads.zzjk e12) {
                    e = e12;
                    zzjkVar = e;
                    str = "Playback error";
                    str2 = "ExoPlayerImplInternal";
                    if (zzjkVar.zzc == 1) {
                        zzjkVar = zzjkVar.zzd(zzn.zzg.zza);
                        break;
                    }
                    if (zzjkVar.zzc == 1) {
                        int i9 = zzjkVar.zze;
                        zzmfVar = this.zzs;
                        if (zzmfVar.zzo() != null) {
                            this.zzac = true;
                            zzab();
                            zzo = zzmfVar.zzo();
                            com.google.android.gms.internal.ads.zzmc zzm4 = zzmfVar.zzm();
                            if (zzmfVar.zzm() != zzo) {
                            }
                            zzmfVar.zzs(zzm4);
                            if (this.zzH.zze != 4) {
                            }
                            z = true;
                            zzC();
                            return z;
                        }
                        break;
                    }
                    zzjkVar2 = this.zzY;
                    if (zzjkVar2 != null) {
                    }
                    zzjkVar3 = zzjkVar;
                    if (zzjkVar3.zzc == 1) {
                    }
                    if (zzjkVar3.zzi) {
                        break;
                    }
                    com.google.android.gms.internal.ads.zzeg.zzf(str2, str, zzjkVar3);
                    z = true;
                    zzW(true, false);
                    this.zzH = this.zzH.zzf(zzjkVar3);
                    zzC();
                    return z;
                }
                z = true;
                zzC();
                return z;
            case 3:
                zzR((com.google.android.gms.internal.ads.zzlt) message.obj);
                z = true;
                zzC();
                return z;
            case 4:
                zzM((com.google.android.gms.internal.ads.zzav) message.obj);
                zzal(this.zzo.zzj(), true);
                z = true;
                zzC();
                return z;
            case 5:
                this.zzB = (com.google.android.gms.internal.ads.zzni) message.obj;
                z = true;
                zzC();
                return z;
            case 6:
                zzW(false, true);
                z = true;
                zzC();
                return z;
            case 7:
                try {
                    com.google.android.gms.internal.ads.zzds zzdsVar = (com.google.android.gms.internal.ads.zzds) message.obj;
                    try {
                        zzX(true, false, true, false);
                        i3 = 0;
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                    while (true) {
                        com.google.android.gms.internal.ads.zzne[] zzneVarArr3 = this.zzb;
                        if (i3 >= 2) {
                            this.zzg.zzd(this.zzv);
                            this.zzz.zzd();
                            this.zze.zzb();
                            zzB(1);
                            this.zzi.zzl(null);
                            this.zzj.zzb();
                            zzdsVar.zza();
                            return true;
                        }
                        try {
                            this.zzc[i3].zzw();
                            zzneVarArr3[i3].zzI();
                            i3++;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                        th = th2;
                        java.lang.Throwable th3 = th;
                        this.zzi.zzl(null);
                        this.zzj.zzb();
                        zzdsVar.zza();
                        throw th3;
                    }
                } catch (com.google.android.gms.internal.ads.zzjk e13) {
                    e = e13;
                    zzjkVar = e;
                    str = "Playback error";
                    str2 = "ExoPlayerImplInternal";
                    if (zzjkVar.zzc == 1 && (zzn = this.zzs.zzn()) != null && zzjkVar.zzh == null) {
                        zzjkVar = zzjkVar.zzd(zzn.zzg.zza);
                    }
                    if (zzjkVar.zzc == 1 && (zzxkVar = zzjkVar.zzh) != null) {
                        int i92 = zzjkVar.zze;
                        zzmfVar = this.zzs;
                        if (zzmfVar.zzo() != null && zzmfVar.zzo().zzg.zza.equals(zzxkVar) && this.zzb[i92].zzq(zzmfVar.zzo())) {
                            this.zzac = true;
                            zzab();
                            zzo = zzmfVar.zzo();
                            com.google.android.gms.internal.ads.zzmc zzm42 = zzmfVar.zzm();
                            if (zzmfVar.zzm() != zzo) {
                                while (zzm42 != null && zzm42.zzp() != zzo) {
                                    zzm42 = zzm42.zzp();
                                }
                            }
                            zzmfVar.zzs(zzm42);
                            if (this.zzH.zze != 4) {
                                zzan();
                                this.zzi.zzh(2);
                            }
                            z = true;
                            zzC();
                            return z;
                        }
                    }
                    zzjkVar2 = this.zzY;
                    if (zzjkVar2 != null) {
                        zzjkVar2.addSuppressed(zzjkVar);
                        zzjkVar = this.zzY;
                    }
                    zzjkVar3 = zzjkVar;
                    if (zzjkVar3.zzc == 1) {
                        com.google.android.gms.internal.ads.zzmf zzmfVar5 = this.zzs;
                        if (zzmfVar5.zzm() != zzmfVar5.zzn()) {
                            while (zzmfVar5.zzm() != zzmfVar5.zzn()) {
                                zzmfVar5.zzr();
                            }
                            com.google.android.gms.internal.ads.zzmc zzm5 = zzmfVar5.zzm();
                            zzm5.getClass();
                            zzC();
                            com.google.android.gms.internal.ads.zzmd zzmdVar = zzm5.zzg;
                            com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzmdVar.zza;
                            long j3 = zzmdVar.zzb;
                            this.zzH = zzap(zzxkVar2, j3, zzmdVar.zzd, j3, true, 0);
                        }
                    }
                    if (zzjkVar3.zzi || !(this.zzY == null || (i = zzjkVar3.zza) == 5004 || i == 5003)) {
                        com.google.android.gms.internal.ads.zzeg.zzf(str2, str, zzjkVar3);
                        z = true;
                        zzW(true, false);
                        this.zzH = this.zzH.zzf(zzjkVar3);
                        zzC();
                        return z;
                    }
                    com.google.android.gms.internal.ads.zzeg.zzd(str2, "Recoverable renderer error", zzjkVar3);
                    if (this.zzY == null) {
                        this.zzY = zzjkVar3;
                    }
                    com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzi;
                    zzdzVar.zzg(zzdzVar.zzd(25, zzjkVar3));
                    z = true;
                    zzC();
                    return z;
                }
            case 8:
                try {
                    com.google.android.gms.internal.ads.zzxi zzxiVar = (com.google.android.gms.internal.ads.zzxi) message.obj;
                    com.google.android.gms.internal.ads.zzmf zzmfVar6 = this.zzs;
                    if (zzmfVar6.zzd(zzxiVar)) {
                        com.google.android.gms.internal.ads.zzmc zzk2 = zzmfVar6.zzk();
                        zzk2.getClass();
                        com.google.android.gms.internal.ads.zzmc zzmcVar = zzk2;
                        if (!zzk2.zze) {
                            float f = this.zzo.zzj().zzb;
                            com.google.android.gms.internal.ads.zzms zzmsVar3 = this.zzH;
                            zzk2.zzh(f, zzmsVar3.zza, zzmsVar3.zzl);
                        }
                        zzax(zzk2.zzg.zza, zzk2.zzq(), zzk2.zzr());
                        if (zzk2 == zzmfVar6.zzm()) {
                            zzU(zzk2.zzg.zzb, true);
                            zzaq();
                            zzk2.zzh = true;
                            com.google.android.gms.internal.ads.zzms zzmsVar4 = this.zzH;
                            com.google.android.gms.internal.ads.zzxk zzxkVar3 = zzmsVar4.zzb;
                            long j4 = zzk2.zzg.zzb;
                            this.zzH = zzap(zzxkVar3, j4, zzmsVar4.zzc, j4, false, 5);
                        }
                        zzan();
                    } else {
                        com.google.android.gms.internal.ads.zzmc zzu = zzmfVar6.zzu(zzxiVar);
                        if (zzu != null) {
                            com.google.android.gms.internal.ads.zzgtj.zzi(!zzu.zze);
                            float f2 = this.zzo.zzj().zzb;
                            com.google.android.gms.internal.ads.zzms zzmsVar5 = this.zzH;
                            zzu.zzh(f2, zzmsVar5.zza, zzmsVar5.zzl);
                            if (zzmfVar6.zze(zzxiVar)) {
                                zzaj();
                            }
                        }
                    }
                } catch (com.google.android.gms.internal.ads.zzat e14) {
                    e = e14;
                    com.google.android.gms.internal.ads.zzat zzatVar = e;
                    zzA(zzatVar, zzatVar.zzb == 1 ? true != zzatVar.zza ? 3003 : 3001 : 1000);
                    z = true;
                    zzC();
                    return z;
                } catch (com.google.android.gms.internal.ads.zzhq e15) {
                    e = e15;
                    com.google.android.gms.internal.ads.zzhq zzhqVar = e;
                    zzA(zzhqVar, zzhqVar.zza);
                    z = true;
                    zzC();
                    return z;
                } catch (com.google.android.gms.internal.ads.zzjk e16) {
                    e = e16;
                    zzjkVar = e;
                    str = "Playback error";
                    str2 = "ExoPlayerImplInternal";
                    if (zzjkVar.zzc == 1) {
                    }
                    if (zzjkVar.zzc == 1) {
                    }
                    zzjkVar2 = this.zzY;
                    if (zzjkVar2 != null) {
                    }
                    zzjkVar3 = zzjkVar;
                    if (zzjkVar3.zzc == 1) {
                    }
                    if (zzjkVar3.zzi) {
                    }
                    com.google.android.gms.internal.ads.zzeg.zzf(str2, str, zzjkVar3);
                    z = true;
                    zzW(true, false);
                    this.zzH = this.zzH.zzf(zzjkVar3);
                    zzC();
                    return z;
                } catch (com.google.android.gms.internal.ads.zzuf e17) {
                    e = e17;
                    com.google.android.gms.internal.ads.zzuf zzufVar = e;
                    zzA(zzufVar, zzufVar.zza);
                    z = true;
                    zzC();
                    return z;
                } catch (com.google.android.gms.internal.ads.zzwk e18) {
                    e = e18;
                    zzA(e, 1002);
                    z = true;
                    zzC();
                    return z;
                } catch (java.io.IOException e19) {
                    e = e19;
                    zzA(e, 2000);
                    z = true;
                    zzC();
                    return z;
                } catch (java.lang.RuntimeException e20) {
                    e = e20;
                    runtimeException = e;
                    str3 = "Playback error";
                    str4 = "ExoPlayerImplInternal";
                    if (runtimeException instanceof java.lang.IllegalStateException) {
                        break;
                    }
                    com.google.android.gms.internal.ads.zzjk zzc2 = com.google.android.gms.internal.ads.zzjk.zzc(runtimeException, (!(runtimeException instanceof java.lang.IllegalStateException) || (runtimeException instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000);
                    com.google.android.gms.internal.ads.zzeg.zzf(str4, str3, zzc2);
                    zzW(true, false);
                    this.zzH = this.zzH.zzf(zzc2);
                    z = true;
                    zzC();
                    return z;
                }
                z = true;
                zzC();
                return z;
            case 9:
                com.google.android.gms.internal.ads.zzxi zzxiVar2 = (com.google.android.gms.internal.ads.zzxi) message.obj;
                com.google.android.gms.internal.ads.zzmf zzmfVar7 = this.zzs;
                if (zzmfVar7.zzd(zzxiVar2)) {
                    zzmfVar7.zzf(this.zzU);
                    zzan();
                } else if (zzmfVar7.zze(zzxiVar2)) {
                    zzaj();
                }
                z = true;
                zzC();
                return z;
            case 10:
                zzad();
                z = true;
                zzC();
                return z;
            case 11:
                int i10 = message.arg1;
                this.zzP = i10;
                int zza2 = this.zzs.zza(this.zzH.zza, i10);
                if ((zza2 & 1) != 0) {
                    zzI(true);
                } else if ((zza2 & 2) != 0) {
                    zzab();
                }
                zzat(false);
                z = true;
                zzC();
                return z;
            case 12:
                boolean z11 = message.arg1 != 0;
                this.zzQ = z11;
                int zzb = this.zzs.zzb(this.zzH.zza, z11);
                if ((zzb & 1) != 0) {
                    zzI(true);
                } else if ((zzb & 2) != 0) {
                    zzab();
                }
                zzat(false);
                z = true;
                zzC();
                return z;
            case 13:
                boolean z12 = message.arg1 != 0;
                com.google.android.gms.internal.ads.zzds zzdsVar2 = (com.google.android.gms.internal.ads.zzds) message.obj;
                if (this.zzR != z12) {
                    this.zzR = z12;
                    if (!z12) {
                        com.google.android.gms.internal.ads.zzne[] zzneVarArr4 = this.zzb;
                        for (int i11 = 0; i11 < 2; i11++) {
                            zzneVarArr4[i11].zzG();
                        }
                    }
                }
                if (zzdsVar2 != null) {
                    zzdsVar2.zza();
                }
                z = true;
                zzC();
                return z;
            case 14:
                com.google.android.gms.internal.ads.zzmw zzmwVar = (com.google.android.gms.internal.ads.zzmw) message.obj;
                if (zzmwVar.zzf() == this.zzk) {
                    zzaF(zzmwVar);
                    int i12 = this.zzH.zze;
                    if (i12 == 3 || i12 == 2) {
                        this.zzi.zzh(2);
                    }
                } else {
                    this.zzi.zzd(15, zzmwVar).zza();
                }
                z = true;
                zzC();
                return z;
            case 15:
                final com.google.android.gms.internal.ads.zzmw zzmwVar2 = (com.google.android.gms.internal.ads.zzmw) message.obj;
                android.os.Looper zzf = zzmwVar2.zzf();
                if (zzf.getThread().isAlive()) {
                    this.zzq.zzd(zzf, null).zzm(new java.lang.Runnable(this) { // from class: com.google.android.gms.internal.ads.zzlm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzlu.zzz(zzmwVar2);
                        }
                    });
                } else {
                    com.google.android.gms.internal.ads.zzeg.zzc("TAG", "Trying to send message on a dead thread.");
                    zzmwVar2.zzi(false);
                }
                z = true;
                zzC();
                return z;
            case 16:
                zzal((com.google.android.gms.internal.ads.zzav) message.obj, false);
                z = true;
                zzC();
                return z;
            case 17:
                com.google.android.gms.internal.ads.zzlo zzloVar = (com.google.android.gms.internal.ads.zzlo) message.obj;
                this.zzI.zza(1);
                if (zzloVar.zzb() != -1) {
                    this.zzT = new com.google.android.gms.internal.ads.zzlt(new com.google.android.gms.internal.ads.zzmy(zzloVar.zza(), zzloVar.zzd()), zzloVar.zzb(), zzloVar.zzc());
                }
                zzaf(this.zzt.zzl(zzloVar.zza(), zzloVar.zzd()), false);
                z = true;
                zzC();
                return z;
            case 18:
                com.google.android.gms.internal.ads.zzlo zzloVar2 = (com.google.android.gms.internal.ads.zzlo) message.obj;
                int i13 = message.arg1;
                this.zzI.zza(1);
                com.google.android.gms.internal.ads.zzmr zzmrVar = this.zzt;
                if (i13 == -1) {
                    i13 = zzmrVar.zzc();
                }
                zzaf(zzmrVar.zzm(i13, zzloVar2.zza(), zzloVar2.zzd()), false);
                z = true;
                zzC();
                return z;
            case 19:
                com.google.android.gms.internal.ads.zzlp zzlpVar = (com.google.android.gms.internal.ads.zzlp) message.obj;
                this.zzI.zza(1);
                com.google.android.gms.internal.ads.zzmr zzmrVar2 = this.zzt;
                int i14 = zzlpVar.zza;
                int i15 = zzlpVar.zzb;
                int i16 = zzlpVar.zzc;
                com.google.android.gms.internal.ads.zzzf zzzfVar = zzlpVar.zzd;
                zzaf(zzmrVar2.zzo(0, 0, 0, null), false);
                z = true;
                zzC();
                return z;
            case 20:
                int i17 = message.arg1;
                int i18 = message.arg2;
                com.google.android.gms.internal.ads.zzzf zzzfVar2 = (com.google.android.gms.internal.ads.zzzf) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzt.zzn(i17, i18, zzzfVar2), false);
                z = true;
                zzC();
                return z;
            case 21:
                com.google.android.gms.internal.ads.zzzf zzzfVar3 = (com.google.android.gms.internal.ads.zzzf) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzt.zzp(zzzfVar3), false);
                z = true;
                zzC();
                return z;
            case 22:
                zzaf(this.zzt.zzh(), true);
                z = true;
                zzC();
                return z;
            case 23:
                this.zzK = message.arg1 != 0;
                zzak();
                if (this.zzL) {
                    com.google.android.gms.internal.ads.zzmf zzmfVar8 = this.zzs;
                    if (zzmfVar8.zzn() != zzmfVar8.zzm()) {
                        zzI(true);
                        zzat(false);
                    }
                }
                z = true;
                zzC();
                return z;
            case 24:
            default:
                return false;
            case 25:
                zzac();
                z = true;
                zzC();
                return z;
            case 26:
                zzac();
                z = true;
                zzC();
                return z;
            case 27:
                int i19 = message.arg1;
                int i20 = message.arg2;
                java.util.List list = (java.util.List) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzt.zza(i19, i20, list), false);
                z = true;
                zzC();
                return z;
            case 28:
                com.google.android.gms.internal.ads.zzju zzjuVar = (com.google.android.gms.internal.ads.zzju) message.obj;
                this.zzaa = zzjuVar;
                this.zzs.zzc(this.zzH.zza, zzjuVar);
                z = true;
                zzC();
                return z;
            case 29:
                this.zzI.zza(1);
                zzX(false, false, false, true);
                this.zzg.zza(this.zzv);
                zzB(true != this.zzH.zza.zzg() ? 2 : 4);
                zzF();
                this.zzt.zzd(this.zzh.zze());
                this.zzi.zzh(2);
                z = true;
                zzC();
                return z;
            case 30:
                android.util.Pair pair = (android.util.Pair) message.obj;
                java.lang.Object obj = pair.first;
                com.google.android.gms.internal.ads.zzds zzdsVar3 = (com.google.android.gms.internal.ads.zzds) pair.second;
                com.google.android.gms.internal.ads.zzne[] zzneVarArr5 = this.zzb;
                for (int i21 = 0; i21 < 2; i21++) {
                    zzneVarArr5[i21].zzJ(obj);
                }
                int i22 = this.zzH.zze;
                if (i22 == 3 || i22 == 2) {
                    this.zzi.zzh(2);
                }
                if (zzdsVar3 != null) {
                    zzdsVar3.zza();
                }
                z = true;
                zzC();
                return z;
            case 31:
                com.google.android.gms.internal.ads.zzd zzdVar2 = (com.google.android.gms.internal.ads.zzd) message.obj;
                int i23 = message.arg1;
                this.zze.zze(zzdVar2);
                com.google.android.gms.internal.ads.zzcd zzcdVar = this.zzz;
                if (i23 != 0) {
                    zzdVar = zzdVar2;
                }
                zzcdVar.zzb(zzdVar);
                zzF();
                z = true;
                zzC();
                return z;
            case 32:
                zzD(((java.lang.Float) message.obj).floatValue());
                z = true;
                zzC();
                return z;
            case 33:
                int i24 = message.arg1;
                com.google.android.gms.internal.ads.zzms zzmsVar6 = this.zzH;
                zzH(zzmsVar6.zzl, i24, zzmsVar6.zzn, zzmsVar6.zzm);
                z = true;
                zzC();
                return z;
            case 34:
                zzD(this.zzad);
                z = true;
                zzC();
                return z;
            case 35:
                com.google.android.gms.internal.ads.zzadr zzadrVar = (com.google.android.gms.internal.ads.zzadr) message.obj;
                com.google.android.gms.internal.ads.zzne[] zzneVarArr6 = this.zzb;
                for (int i25 = 0; i25 < 2; i25++) {
                    zzneVarArr6[i25].zzK(zzadrVar);
                }
                z = true;
                zzC();
                return z;
            case 36:
                boolean booleanValue = ((java.lang.Boolean) message.obj).booleanValue();
                if (!booleanValue) {
                    if (this.zzF != null && this.zzE && !this.zzi.zzb(37)) {
                        this.zzG++;
                    }
                    final int i26 = this.zzG;
                    if (i26 > 0) {
                        this.zzx.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzll
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.internal.ads.zzlu.this.zzv(i26);
                            }
                        });
                    }
                    this.zzG = 0;
                    this.zzE = false;
                    this.zzi.zzk(37);
                    com.google.android.gms.internal.ads.zzlt zzltVar = this.zzF;
                    if (zzltVar != null) {
                        zzR(zzltVar);
                        this.zzF = null;
                        this.zzE = false;
                    }
                }
                this.zzD = booleanValue;
                zzV();
                z = true;
                zzC();
                return z;
            case 37:
                this.zzE = false;
                com.google.android.gms.internal.ads.zzlt zzltVar2 = this.zzF;
                if (zzltVar2 != null) {
                    zzR(zzltVar2);
                    this.zzF = null;
                }
                z = true;
                zzC();
                return z;
            case 38:
                this.zzC = (com.google.android.gms.internal.ads.zznh) message.obj;
                zzV();
                z = true;
                zzC();
                return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzc(com.google.android.gms.internal.ads.zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzcS(long j, long j2, com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaFormat mediaFormat) {
        if (this.zzE) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzi.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(com.google.android.gms.internal.ads.zzbf zzbfVar, int i, long j) {
        this.zzi.zzd(3, new com.google.android.gms.internal.ads.zzlt(zzbfVar, i, j)).zza();
    }

    public final void zzg(com.google.android.gms.internal.ads.zznh zznhVar) {
        this.zzi.zzd(38, zznhVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(com.google.android.gms.internal.ads.zzd zzdVar, boolean z) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, java.lang.Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzk(com.google.android.gms.internal.ads.zzmw zzmwVar) {
        if (!this.zzJ && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmwVar).zza();
        } else {
            com.google.android.gms.internal.ads.zzeg.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmwVar.zzi(false);
        }
    }

    public final boolean zzl(java.lang.Object obj, long j) {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        com.google.android.gms.internal.ads.zzds zzdsVar = new com.google.android.gms.internal.ads.zzds(this.zzq);
        this.zzi.zzd(30, new android.util.Pair(obj, zzdsVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdsVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzJ = true;
        com.google.android.gms.internal.ads.zzds zzdsVar = new com.google.android.gms.internal.ads.zzds(this.zzq);
        this.zzi.zzd(7, zzdsVar).zza();
        return zzdsVar.zze(this.zzu);
    }

    public final android.os.Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmq
    public final void zzo() {
        com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzi;
        zzdzVar.zzk(2);
        zzdzVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        this.zzi.zzd(8, zzxiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzze zzzeVar) {
        this.zzi.zzd(9, (com.google.android.gms.internal.ads.zzxi) zzzeVar).zza();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzmc zzt(com.google.android.gms.internal.ads.zzmd zzmdVar, long j) {
        com.google.android.gms.internal.ads.zzabl zze = this.zzg.zze(this.zzv);
        long j2 = this.zzaa.zzb;
        com.google.android.gms.internal.ads.zzabi zzabiVar = this.zzf;
        com.google.android.gms.internal.ads.zzmr zzmrVar = this.zzt;
        return new com.google.android.gms.internal.ads.zzmc(this.zzc, j, this.zze, zze, zzmrVar, zzmdVar, zzabiVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdz zzx() {
        return this.zzi;
    }

    public final void zzy(java.util.List list, int i, long j, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        this.zzi.zzd(17, new com.google.android.gms.internal.ads.zzlo(list, zzzfVar, i, j, null)).zza();
    }
}
