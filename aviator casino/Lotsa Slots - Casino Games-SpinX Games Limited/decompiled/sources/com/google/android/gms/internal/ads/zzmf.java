package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmf {
    private final com.google.android.gms.internal.ads.zznm zzc;
    private final com.google.android.gms.internal.ads.zzdz zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private com.google.android.gms.internal.ads.zzju zzh;
    private com.google.android.gms.internal.ads.zzmc zzi;
    private com.google.android.gms.internal.ads.zzmc zzj;
    private com.google.android.gms.internal.ads.zzmc zzk;
    private com.google.android.gms.internal.ads.zzmc zzl;
    private com.google.android.gms.internal.ads.zzmc zzm;
    private int zzn;
    private java.lang.Object zzo;
    private long zzp;
    private final com.google.android.gms.internal.ads.zzln zzr;
    private final com.google.android.gms.internal.ads.zzbd zza = new com.google.android.gms.internal.ads.zzbd();
    private final com.google.android.gms.internal.ads.zzbe zzb = new com.google.android.gms.internal.ads.zzbe();
    private java.util.List zzq = new java.util.ArrayList();

    public zzmf(com.google.android.gms.internal.ads.zznm zznmVar, com.google.android.gms.internal.ads.zzdz zzdzVar, com.google.android.gms.internal.ads.zzln zzlnVar, com.google.android.gms.internal.ads.zzju zzjuVar) {
        this.zzc = zznmVar;
        this.zzd = zzdzVar;
        this.zzr = zzlnVar;
        this.zzh = zzjuVar;
    }

    private static com.google.android.gms.internal.ads.zzxk zzA(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, long j, long j2, com.google.android.gms.internal.ads.zzbe zzbeVar, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int zze = zzbdVar.zze(j);
        return zze == -1 ? new com.google.android.gms.internal.ads.zzxk(obj, j2, zzbdVar.zzf(j)) : new com.google.android.gms.internal.ads.zzxk(obj, zze, zzbdVar.zzd(zze), j2);
    }

    private final void zzB() {
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        final com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        for (com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzi; zzmcVar != null; zzmcVar = zzmcVar.zzp()) {
            zzgwjVar.zzf(zzmcVar.zzg.zza);
        }
        com.google.android.gms.internal.ads.zzmc zzmcVar2 = this.zzj;
        final com.google.android.gms.internal.ads.zzxk zzxkVar = zzmcVar2 == null ? null : zzmcVar2.zzg.zza;
        this.zzd.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzmf.this.zzz(zzgwjVar, zzxkVar);
            }
        });
    }

    private final long zzC(java.lang.Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            com.google.android.gms.internal.ads.zzmc zzmcVar = (com.google.android.gms.internal.ads.zzmc) this.zzq.get(i);
            if (zzmcVar.zzb.equals(obj)) {
                return zzmcVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzi;
        if (zzmcVar == null) {
            return 0;
        }
        int zze = zzbfVar.zze(zzmcVar.zzb);
        while (true) {
            zze = zzbfVar.zzl(zze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzmcVar.getClass();
                if (zzmcVar.zzp() == null || zzmcVar.zzg.zzi) {
                    break;
                }
                zzmcVar = zzmcVar.zzp();
            }
            com.google.android.gms.internal.ads.zzmc zzp = zzmcVar.zzp();
            if (zze == -1 || zzp == null || zzbfVar.zze(zzp.zzb) != zze) {
                break;
            }
            zzmcVar = zzp;
        }
        int zzs = zzs(zzmcVar);
        zzmcVar.zzg = zzx(zzbfVar, zzmcVar.zzg);
        return zzs;
    }

    private final com.google.android.gms.internal.ads.zzmd zzE(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzmc zzmcVar, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        com.google.android.gms.internal.ads.zzmd zzmdVar = zzmcVar.zzg;
        long zza = zzmcVar.zza();
        long j7 = zzmdVar.zzf;
        long j8 = (zza + j7) - j;
        long j9 = -9223372036854775807L;
        if (zzmdVar.zzi) {
            com.google.android.gms.internal.ads.zzxk zzxkVar = zzmdVar.zza;
            java.lang.Object obj = zzxkVar.zza;
            int zze = zzbfVar.zze(obj);
            int i = this.zzf;
            boolean z = this.zzg;
            com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzb;
            com.google.android.gms.internal.ads.zzbd zzbdVar = this.zza;
            int zzl = zzbfVar.zzl(zze, zzbdVar, zzbeVar, i, z);
            if (zzl != -1) {
                int i2 = zzbfVar.zzd(zzl, zzbdVar, true).zzc;
                java.lang.Object obj2 = zzbdVar.zzb;
                obj2.getClass();
                long j10 = zzxkVar.zzd;
                if (zzbfVar.zzb(i2, zzbeVar, 0L).zzn == zzl) {
                    long max = zzL(zzbfVar, zzbdVar.zzc, zzbdVar.zzd, zzbeVar) ? java.lang.Math.max(0L, j8) : -9223372036854775807L;
                    android.util.Pair zzn = zzbfVar.zzn(zzbeVar, zzbdVar, i2, -9223372036854775807L, max);
                    if (zzn != null) {
                        obj2 = zzn.first;
                        long longValue = ((java.lang.Long) zzn.second).longValue();
                        com.google.android.gms.internal.ads.zzmc zzp = zzmcVar.zzp();
                        if (zzp == null || !zzp.zzb.equals(obj2)) {
                            j5 = zzC(obj2);
                            if (j5 == -1) {
                                j5 = this.zze;
                                this.zze = 1 + j5;
                            }
                        } else {
                            j5 = zzp.zzg.zza.zzd;
                        }
                        j3 = longValue;
                        j4 = max;
                        j6 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                    j4 = -9223372036854775807L;
                    j5 = j10;
                    j6 = 0;
                }
                com.google.android.gms.internal.ads.zzxk zzA = zzA(zzbfVar, obj2, j3, j5, zzbeVar, zzbdVar);
                if (j6 != -9223372036854775807L && zzmdVar.zzd != -9223372036854775807L) {
                    zzbfVar.zzo(obj, zzbdVar).zzb();
                    int i3 = zzbdVar.zzg.zzd;
                }
                return zzF(zzbfVar, zzA, j6, j3, j4);
            }
        } else {
            com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzmdVar.zza;
            java.lang.Object obj3 = zzxkVar2.zza;
            com.google.android.gms.internal.ads.zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj3, zzbdVar2);
            boolean z2 = zzmdVar.zzh;
            if (!zzxkVar2.zzb()) {
                int i4 = zzxkVar2.zze;
                if (i4 != -1) {
                    zzbdVar2.zzi(i4);
                }
                int zzd = zzbdVar2.zzd(i4);
                zzbdVar2.zzk(i4);
                if (zzd != zzbdVar2.zzg(i4)) {
                    return zzG(zzbfVar, obj3, i4, zzd, j7, zzxkVar2.zzd, false);
                }
                zzK(zzbfVar, obj3, i4);
                return zzH(zzbfVar, obj3, 0L, -9223372036854775807L, j7, zzxkVar2.zzd, false);
            }
            int i5 = zzxkVar2.zzb;
            if (zzbdVar2.zzg(i5) != -1) {
                int zza2 = zzbdVar2.zzg.zza(i5).zza(zzxkVar2.zzc);
                if (zza2 < 0) {
                    return zzG(zzbfVar, obj3, i5, zza2, zzmdVar.zzd, zzxkVar2.zzd, false);
                }
                long j11 = zzmdVar.zzd;
                if (j11 == -9223372036854775807L) {
                    com.google.android.gms.internal.ads.zzbe zzbeVar2 = this.zzb;
                    long max2 = zzL(zzbfVar, zzbdVar2.zzc, zzbdVar2.zzd, zzbeVar2) ? java.lang.Math.max(0L, j8) : -9223372036854775807L;
                    android.util.Pair zzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, max2);
                    if (zzn2 != null) {
                        j11 = ((java.lang.Long) zzn2.second).longValue();
                        j2 = max2;
                    }
                } else {
                    j2 = -9223372036854775807L;
                    j9 = j11;
                }
                zzK(zzbfVar, obj3, i5);
                return zzH(zzbfVar, obj3, java.lang.Math.max(0L, j11), j2, j9, zzxkVar2.zzd, false);
            }
        }
        return null;
    }

    private final com.google.android.gms.internal.ads.zzmd zzF(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, long j, long j2, long j3) {
        java.lang.Object obj = zzxkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzxkVar.zzb() ? zzG(zzbfVar, obj, zzxkVar.zzb, zzxkVar.zzc, j, zzxkVar.zzd, false) : zzH(zzbfVar, obj, j2, j3, j, zzxkVar.zzd, false);
    }

    private final com.google.android.gms.internal.ads.zzmd zzG(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, int i, int i2, long j, long j2, boolean z) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = new com.google.android.gms.internal.ads.zzxk(obj, i, i2, j2);
        java.lang.Object obj2 = zzxkVar.zza;
        int i3 = zzxkVar.zzb;
        int i4 = zzxkVar.zzc;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zza;
        long zzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i3, i4);
        if (i2 == zzbdVar.zzd(i)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i3);
        long j3 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j3 = java.lang.Math.max(0L, zzh - 1);
        }
        return new com.google.android.gms.internal.ads.zzmd(zzxkVar, j3, -9223372036854775807L, j, -9223372036854775807L, zzh, false, false, false, false, false);
    }

    private final com.google.android.gms.internal.ads.zzmd zzH(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        long j6;
        long j7;
        long j8 = j;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int zzf = zzbdVar.zzf(j8);
        if (zzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(zzf);
        }
        com.google.android.gms.internal.ads.zzxk zzxkVar = new com.google.android.gms.internal.ads.zzxk(obj, j4, zzf);
        boolean zzM = zzM(zzxkVar);
        boolean zzI = zzI(zzbfVar, zzxkVar);
        boolean zzJ = zzJ(zzbfVar, zzxkVar, zzM);
        if (zzf != -1) {
            zzbdVar.zzk(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzi(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzc(zzf);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L) {
            j7 = j5;
            j6 = j7;
        } else {
            j6 = zzbdVar.zzd;
            j7 = -9223372036854775807L;
        }
        if (j6 != -9223372036854775807L && j8 >= j6) {
            j8 = java.lang.Math.max(0L, j6 - 1);
        }
        return new com.google.android.gms.internal.ads.zzmd(zzxkVar, j8, j2, j3, j7, j6, false, false, zzM, zzI, zzJ);
    }

    private final boolean zzI(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        if (!zzM(zzxkVar)) {
            return false;
        }
        java.lang.Object obj = zzxkVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, boolean z) {
        int zze = zzbfVar.zze(zzxkVar.zza);
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzd(zze, zzbdVar, false).zzc;
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i, zzbeVar, 0L).zzi && zzbfVar.zzl(zze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, int i) {
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i);
        long j = zzbdVar.zzg.zza(i).zzi;
        return 0L;
    }

    private static boolean zzL(com.google.android.gms.internal.ads.zzbf zzbfVar, int i, long j, com.google.android.gms.internal.ads.zzbe zzbeVar) {
        if (j == -9223372036854775807L) {
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzi && !zzbeVar.zzk) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzM(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return !zzxkVar.zzb() && zzxkVar.zze == -1;
    }

    public final int zza(com.google.android.gms.internal.ads.zzbf zzbfVar, int i) {
        this.zzf = i;
        return zzD(zzbfVar);
    }

    public final int zzb(com.google.android.gms.internal.ads.zzbf zzbfVar, boolean z) {
        this.zzg = z;
        return zzD(zzbfVar);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzju zzjuVar) {
        this.zzh = zzjuVar;
        long j = zzjuVar.zzb;
        zzj();
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzl;
        return zzmcVar != null && zzmcVar.zza == zzxiVar;
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzm;
        return zzmcVar != null && zzmcVar.zza == zzxiVar;
    }

    public final void zzf(long j) {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzl;
        if (zzmcVar != null) {
            zzmcVar.zzi(j);
        }
    }

    public final boolean zzg() {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzl;
        if (zzmcVar != null) {
            return !zzmcVar.zzg.zzk && zzmcVar.zzd() && this.zzl.zzg.zzf != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final com.google.android.gms.internal.ads.zzmd zzh(long j, com.google.android.gms.internal.ads.zzms zzmsVar) {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzl;
        return zzmcVar == null ? zzF(zzmsVar.zza, zzmsVar.zzb, zzmsVar.zzc, zzmsVar.zzs, -9223372036854775807L) : zzE(zzmsVar.zza, zzmcVar, j);
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((com.google.android.gms.internal.ads.zzmc) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final com.google.android.gms.internal.ads.zzmc zzk() {
        return this.zzl;
    }

    public final com.google.android.gms.internal.ads.zzmc zzl() {
        return this.zzm;
    }

    public final com.google.android.gms.internal.ads.zzmc zzm() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzmc zzn() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.ads.zzmc zzo() {
        return this.zzk;
    }

    public final com.google.android.gms.internal.ads.zzmc zzp() {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzk;
        com.google.android.gms.internal.ads.zzmc zzmcVar2 = this.zzj;
        if (zzmcVar == zzmcVar2) {
            zzmcVar2.getClass();
            this.zzk = zzmcVar2.zzp();
        }
        zzmcVar2.getClass();
        this.zzj = zzmcVar2.zzp();
        zzB();
        com.google.android.gms.internal.ads.zzmc zzmcVar3 = this.zzj;
        zzmcVar3.getClass();
        return zzmcVar3;
    }

    public final com.google.android.gms.internal.ads.zzmc zzq() {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzk;
        zzmcVar.getClass();
        this.zzk = zzmcVar.zzp();
        zzB();
        com.google.android.gms.internal.ads.zzmc zzmcVar2 = this.zzk;
        zzmcVar2.getClass();
        return zzmcVar2;
    }

    public final com.google.android.gms.internal.ads.zzmc zzr() {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzi;
        if (zzmcVar == null) {
            return null;
        }
        if (zzmcVar == this.zzj) {
            this.zzj = zzmcVar.zzp();
        }
        if (zzmcVar == this.zzk) {
            this.zzk = zzmcVar.zzp();
        }
        zzmcVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            com.google.android.gms.internal.ads.zzmc zzmcVar2 = this.zzi;
            this.zzo = zzmcVar2.zzb;
            this.zzp = zzmcVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzm;
        if (zzmcVar == null || zzmcVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                com.google.android.gms.internal.ads.zzmc zzmcVar2 = (com.google.android.gms.internal.ads.zzmc) this.zzq.get(i);
                if (!zzmcVar2.zze()) {
                    this.zzm = zzmcVar2;
                    return;
                }
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzmc zzu(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            com.google.android.gms.internal.ads.zzmc zzmcVar = (com.google.android.gms.internal.ads.zzmc) this.zzq.get(i);
            if (zzmcVar.zza == zzxiVar) {
                return zzmcVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzi;
        zzmcVar.getClass();
        this.zzo = zzmcVar.zzb;
        this.zzp = zzmcVar.zzg.zza.zzd;
        while (zzmcVar != null) {
            zzmcVar.zzn();
            zzmcVar = zzmcVar.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzw(com.google.android.gms.internal.ads.zzbf zzbfVar, long j, long j2, long j3) {
        com.google.android.gms.internal.ads.zzmd zzE;
        com.google.android.gms.internal.ads.zzmd zzmdVar;
        com.google.android.gms.internal.ads.zzmd zzmdVar2;
        boolean z;
        int zzs;
        com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzi;
        com.google.android.gms.internal.ads.zzmc zzmcVar2 = null;
        while (zzmcVar != null) {
            com.google.android.gms.internal.ads.zzmd zzmdVar3 = zzmcVar.zzg;
            if (zzmcVar2 != null) {
                zzE = zzE(zzbfVar, zzmcVar2, j);
                if (zzE != null && zzmdVar3.zza.equals(zzE.zza)) {
                    long j4 = zzmdVar3.zzb;
                    long j5 = zzE.zzb;
                    if (j4 == j5) {
                        zzmdVar = zzmdVar3;
                    } else {
                        long j6 = zzmdVar3.zzc;
                        if (j6 != -9223372036854775807L) {
                            zzmdVar = zzmdVar3;
                            long j7 = zzE.zzc;
                            if (j7 != -9223372036854775807L) {
                                if (java.lang.Math.abs((j5 - j7) - (j4 - j6)) >= 5000000) {
                                }
                            }
                        }
                    }
                    if (j4 != j5) {
                        zzmdVar2 = zzmdVar;
                        zzE = zzE.zza(j4, zzmdVar2.zzc);
                    } else {
                        zzmdVar2 = zzmdVar;
                    }
                }
                return zzs(zzmcVar2);
            }
            zzE = zzx(zzbfVar, zzmdVar3);
            zzmdVar2 = zzmdVar3;
            zzmcVar.zzg = zzE.zzb(zzmdVar2.zzd);
            long j8 = zzmdVar2.zzf;
            long j9 = zzE.zzf;
            if (j8 != j9) {
                zzmcVar.zzs();
                long zza = j9 == -9223372036854775807L ? Long.MAX_VALUE : j9 + zzmcVar.zza();
                if (zzmcVar == this.zzj) {
                    boolean z2 = zzmcVar.zzg.zzh;
                    if (j2 == Long.MIN_VALUE || j2 >= zza) {
                        z = true;
                        boolean z3 = zzmcVar != this.zzk && (j3 == Long.MIN_VALUE || j3 >= zza);
                        zzs = zzs(zzmcVar);
                        if (zzs == 0) {
                            return zzs;
                        }
                        if (j8 == -9223372036854775807L) {
                            long j10 = zzmdVar2.zze;
                            j8 = -9223372036854775807L;
                        }
                        int i = (!z || j8 == -9223372036854775807L) ? 0 : 1;
                        return z3 ? i | 2 : i;
                    }
                }
                z = false;
                if (zzmcVar != this.zzk) {
                }
                zzs = zzs(zzmcVar);
                if (zzs == 0) {
                }
            } else {
                zzmcVar2 = zzmcVar;
                zzmcVar = zzmcVar.zzp();
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.ads.zzmd zzx(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzmd zzmdVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        com.google.android.gms.internal.ads.zzxk zzxkVar = zzmdVar.zza;
        boolean zzM = zzM(zzxkVar);
        boolean zzI = zzI(zzbfVar, zzxkVar);
        boolean zzJ = zzJ(zzbfVar, zzxkVar, zzM);
        java.lang.Object obj = zzxkVar.zza;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxkVar.zzb() || (i = zzxkVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i);
            j = 0;
        }
        if (zzxkVar.zzb()) {
            j2 = zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzxkVar.zzb()) {
                    int i2 = zzxkVar.zze;
                    if (i2 != -1) {
                        zzbdVar.zzk(i2);
                    }
                } else {
                    zzbdVar.zzk(zzxkVar.zzb);
                }
                long j5 = zzmdVar.zzb;
                long j6 = zzmdVar.zzc;
                long j7 = zzmdVar.zzd;
                boolean z = zzmdVar.zzg;
                return new com.google.android.gms.internal.ads.zzmd(zzxkVar, j5, j6, j7, j3, j4, false, false, zzM, zzI, zzJ);
            }
            j2 = zzbdVar.zzd;
        }
        j4 = j2;
        j3 = j;
        if (zzxkVar.zzb()) {
        }
        long j52 = zzmdVar.zzb;
        long j62 = zzmdVar.zzc;
        long j72 = zzmdVar.zzd;
        boolean z2 = zzmdVar.zzg;
        return new com.google.android.gms.internal.ads.zzmd(zzxkVar, j52, j62, j72, j3, j4, false, false, zzM, zzI, zzJ);
    }

    public final com.google.android.gms.internal.ads.zzxk zzy(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, long j) {
        long zzC;
        int zze;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        java.lang.Object obj2 = this.zzo;
        if (obj2 == null || (zze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(zze, zzbdVar, false).zzc != i) {
            com.google.android.gms.internal.ads.zzmc zzmcVar = this.zzi;
            while (true) {
                if (zzmcVar == null) {
                    com.google.android.gms.internal.ads.zzmc zzmcVar2 = this.zzi;
                    while (true) {
                        if (zzmcVar2 != null) {
                            int zze2 = zzbfVar.zze(zzmcVar2.zzb);
                            if (zze2 != -1 && zzbfVar.zzd(zze2, zzbdVar, false).zzc == i) {
                                zzC = zzmcVar2.zzg.zza.zzd;
                                break;
                            }
                            zzmcVar2 = zzmcVar2.zzp();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzmcVar.zzb.equals(obj)) {
                        zzC = zzmcVar.zzg.zza.zzd;
                        break;
                    }
                    zzmcVar = zzmcVar.zzp();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i2 = zzbdVar.zzc;
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        java.lang.Object obj3 = obj;
        for (int zze3 = zzbfVar.zze(obj); zze3 >= zzbeVar.zzn; zze3--) {
            zzbfVar.zzd(zze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                java.lang.Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        this.zzc.zzz(zzgwjVar.zzi(), zzxkVar);
    }

    public final com.google.android.gms.internal.ads.zzmc zzi(com.google.android.gms.internal.ads.zzmd zzmdVar) {
        com.google.android.gms.internal.ads.zzmc zzmcVar;
        com.google.android.gms.internal.ads.zzmc zzmcVar2 = this.zzl;
        long zza = zzmcVar2 == null ? 1000000000000L : (zzmcVar2.zza() + zzmcVar2.zzg.zzf) - zzmdVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzmcVar = null;
                break;
            }
            com.google.android.gms.internal.ads.zzmd zzmdVar2 = ((com.google.android.gms.internal.ads.zzmc) this.zzq.get(i)).zzg;
            long j = zzmdVar2.zzf;
            long j2 = zzmdVar.zzf;
            if ((j == -9223372036854775807L || j == j2) && zzmdVar2.zzb == zzmdVar.zzb && zzmdVar2.zza.equals(zzmdVar.zza)) {
                zzmcVar = (com.google.android.gms.internal.ads.zzmc) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzmcVar == null) {
            zzmcVar = this.zzr.zza(zzmdVar, zza);
        } else {
            zzmcVar.zzg = zzmdVar;
            zzmcVar.zzb(zza);
        }
        com.google.android.gms.internal.ads.zzmc zzmcVar3 = this.zzl;
        if (zzmcVar3 != null) {
            zzmcVar3.zzo(zzmcVar);
        } else {
            this.zzi = zzmcVar;
            this.zzj = zzmcVar;
            this.zzk = zzmcVar;
        }
        this.zzo = null;
        this.zzl = zzmcVar;
        this.zzn++;
        zzB();
        return zzmcVar;
    }

    public final int zzs(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        zzmcVar.getClass();
        int i = 0;
        if (zzmcVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzmcVar;
        while (zzmcVar.zzp() != null) {
            zzmcVar = zzmcVar.zzp();
            zzmcVar.getClass();
            if (zzmcVar == this.zzj) {
                com.google.android.gms.internal.ads.zzmc zzmcVar2 = this.zzi;
                this.zzj = zzmcVar2;
                this.zzk = zzmcVar2;
                i = 3;
            }
            if (zzmcVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzmcVar.zzn();
            this.zzn--;
        }
        com.google.android.gms.internal.ads.zzmc zzmcVar3 = this.zzl;
        zzmcVar3.getClass();
        zzmcVar3.zzo(null);
        zzB();
        return i;
    }
}
