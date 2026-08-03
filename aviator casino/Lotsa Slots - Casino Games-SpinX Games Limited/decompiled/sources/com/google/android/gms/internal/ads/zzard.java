package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzard implements com.google.android.gms.internal.ads.zzafy {
    private final int zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzet zzc;
    private final android.util.SparseIntArray zzd;
    private final com.google.android.gms.internal.ads.zzarg zze;
    private final com.google.android.gms.internal.ads.zzanj zzf;
    private final android.util.SparseArray zzg;
    private final android.util.SparseBooleanArray zzh;
    private final android.util.SparseBooleanArray zzi;
    private final com.google.android.gms.internal.ads.zzaqz zzj;
    private com.google.android.gms.internal.ads.zzaqy zzk;
    private com.google.android.gms.internal.ads.zzagb zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i = com.google.android.gms.internal.ads.zzarc.zza;
    }

    @java.lang.Deprecated
    public zzard() {
        this(1, 1, com.google.android.gms.internal.ads.zzanj.zza, new com.google.android.gms.internal.ads.zzfi(0L), new com.google.android.gms.internal.ads.zzapq(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        byte[] zzi = this.zzc.zzi();
        com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
        zzafpVar.zzh(zzi, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzi[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzafpVar.zze(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        if (this.zza == 0) {
            zzagbVar = new com.google.android.gms.internal.ads.zzanm(zzagbVar, this.zzf);
        }
        this.zzl = zzagbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        ?? r3;
        long j;
        boolean z;
        long zzo = zzafzVar.zzo();
        if (this.zzn) {
            if (zzo != -1) {
                com.google.android.gms.internal.ads.zzaqz zzaqzVar = this.zzj;
                if (!zzaqzVar.zza()) {
                    return zzaqzVar.zzb(zzafzVar, zzagyVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                com.google.android.gms.internal.ads.zzaqz zzaqzVar2 = this.zzj;
                if (zzaqzVar2.zzc() != -9223372036854775807L) {
                    j = 0;
                    com.google.android.gms.internal.ads.zzaqy zzaqyVar = new com.google.android.gms.internal.ads.zzaqy(zzaqzVar2.zzd(), zzaqzVar2.zzc(), zzo, this.zzr, 112800);
                    this.zzk = zzaqyVar;
                    this.zzl.zzw(zzaqyVar.zza());
                } else {
                    j = 0;
                    this.zzl.zzw(new com.google.android.gms.internal.ads.zzaha(zzaqzVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                z = false;
                this.zzp = false;
                zze(j, j);
                if (zzafzVar.zzn() != j) {
                    zzagyVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            com.google.android.gms.internal.ads.zzaqy zzaqyVar2 = this.zzk;
            r3 = z;
            if (zzaqyVar2 != null) {
                r3 = z;
                if (zzaqyVar2.zzc()) {
                    return zzaqyVar2.zzd(zzafzVar, zzagyVar);
                }
            }
        } else {
            r3 = 0;
        }
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzc;
        byte[] zzi = zzetVar.zzi();
        if (9400 - zzetVar.zzg() < 188) {
            int zzd = zzetVar.zzd();
            if (zzd > 0) {
                java.lang.System.arraycopy(zzi, zzetVar.zzg(), zzi, r3, zzd);
            }
            zzetVar.zzb(zzi, zzd);
        }
        while (zzetVar.zzd() < 188) {
            int zze = zzetVar.zze();
            int zza = zzafzVar.zza(zzi, zze, 9400 - zze);
            if (zza == -1) {
                int i = 0;
                while (true) {
                    android.util.SparseArray sparseArray = this.zzg;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    com.google.android.gms.internal.ads.zzari zzariVar = (com.google.android.gms.internal.ads.zzari) sparseArray.valueAt(i);
                    if (zzariVar instanceof com.google.android.gms.internal.ads.zzaqm) {
                        com.google.android.gms.internal.ads.zzaqm zzaqmVar = (com.google.android.gms.internal.ads.zzaqm) zzariVar;
                        if (zzaqmVar.zzd(r3)) {
                            zzaqmVar.zzc(new com.google.android.gms.internal.ads.zzet(), 1);
                        }
                    }
                    i++;
                }
            } else {
                zzetVar.zzf(zze + zza);
            }
        }
        int zzg = zzetVar.zzg();
        int zze2 = zzetVar.zze();
        int zza2 = com.google.android.gms.internal.ads.zzarj.zza(zzetVar.zzi(), zzg, zze2);
        zzetVar.zzh(zza2);
        int i2 = zza2 + 188;
        if (i2 > zze2) {
            this.zzq += zza2 - zzg;
        } else {
            this.zzq = r3;
        }
        int zze3 = zzetVar.zze();
        if (i2 > zze3) {
            return r3;
        }
        int zzB = zzetVar.zzB();
        if ((8388608 & zzB) != 0) {
            zzetVar.zzh(i2);
            return r3;
        }
        int i3 = (4194304 & zzB) != 0 ? 1 : 0;
        int i4 = zzB & 32;
        int i5 = (zzB >> 8) & 8191;
        com.google.android.gms.internal.ads.zzari zzariVar2 = (zzB & 16) != 0 ? (com.google.android.gms.internal.ads.zzari) this.zzg.get(i5) : null;
        if (zzariVar2 == null) {
            zzetVar.zzh(i2);
            return r3;
        }
        int i6 = zzB & 15;
        android.util.SparseIntArray sparseIntArray = this.zzd;
        int i7 = sparseIntArray.get(i5, i6 - 1);
        sparseIntArray.put(i5, i6);
        if (i7 == i6) {
            zzetVar.zzh(i2);
            return r3;
        }
        if (i6 != ((i7 + 1) & 15)) {
            zzariVar2.zzb();
        }
        if (i4 != 0) {
            int zzs = zzetVar.zzs();
            i3 |= (zzetVar.zzs() & 64) != 0 ? 2 : 0;
            zzetVar.zzk(zzs - 1);
        }
        boolean z2 = this.zzn;
        if (z2 || !this.zzi.get(i5, r3)) {
            zzetVar.zzf(i2);
            zzariVar2.zzc(zzetVar, i3);
            zzetVar.zzf(zze3);
        }
        if (!z2 && this.zzn && zzo != -1) {
            this.zzp = true;
        }
        zzetVar.zzh(i2);
        return r3;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        com.google.android.gms.internal.ads.zzaqy zzaqyVar;
        java.util.List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.ads.zzfi zzfiVar = (com.google.android.gms.internal.ads.zzfi) list.get(i);
            if (zzfiVar.zzc() != -9223372036854775807L) {
                long zza = zzfiVar.zza();
                if (zza != -9223372036854775807L) {
                    if (zza != 0) {
                        if (zza == j2) {
                        }
                    }
                }
            }
            zzfiVar.zzd(j2);
        }
        if (j2 != 0 && (zzaqyVar = this.zzk) != null) {
            zzaqyVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.zzg;
            if (i2 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((com.google.android.gms.internal.ads.zzari) sparseArray.valueAt(i2)).zzb();
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    final /* synthetic */ java.util.List zzh() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzarg zzi() {
        return this.zze;
    }

    final /* synthetic */ android.util.SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ android.util.SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ android.util.SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzagb zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzp(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzr = i;
    }

    public zzard(int i, int i2, com.google.android.gms.internal.ads.zzanj zzanjVar, com.google.android.gms.internal.ads.zzfi zzfiVar, com.google.android.gms.internal.ads.zzarg zzargVar, int i3) {
        this.zze = zzargVar;
        this.zza = i2;
        this.zzf = zzanjVar;
        this.zzb = java.util.Collections.singletonList(zzfiVar);
        this.zzc = new com.google.android.gms.internal.ads.zzet(new byte[9400], 0);
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new android.util.SparseBooleanArray();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.zzg = sparseArray;
        this.zzd = new android.util.SparseIntArray();
        this.zzj = new com.google.android.gms.internal.ads.zzaqz(112800);
        this.zzl = com.google.android.gms.internal.ads.zzagb.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        android.util.SparseArray zza = zzargVar.zza();
        int size = zza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(zza.keyAt(i4), (com.google.android.gms.internal.ads.zzari) zza.valueAt(i4));
        }
        this.zzg.put(0, new com.google.android.gms.internal.ads.zzaqu(new com.google.android.gms.internal.ads.zzara(this)));
    }
}
