package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzani implements zzacv {
    private final int zza;
    private final List zzb;
    private final zzed zzc;
    private final SparseIntArray zzd;
    private final zzanl zze;
    private final zzajq zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanf zzj;
    private zzane zzk;
    private zzacy zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzani() {
        this(1, 1, zzajq.zza, new zzek(0L), new zzalv(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
    
        if (r1 == false) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        ?? r32;
        long j;
        boolean z4;
        long zzd = zzacwVar.zzd();
        if (this.zzn) {
            if (zzd != -1) {
                zzanf zzanfVar = this.zzj;
                if (!zzanfVar.zzd()) {
                    return zzanfVar.zza(zzacwVar, zzadrVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzanf zzanfVar2 = this.zzj;
                if (zzanfVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzane zzaneVar = new zzane(zzanfVar2.zzc(), zzanfVar2.zzb(), zzd, this.zzr, 112800);
                    this.zzk = zzaneVar;
                    this.zzl.zzP(zzaneVar.zzb());
                } else {
                    j = 0;
                    this.zzl.zzP(new zzadt(zzanfVar2.zzb(), 0L));
                }
            }
            if (this.zzp) {
                z4 = false;
                this.zzp = false;
                zzf(j, j);
                if (zzacwVar.zzf() != j) {
                    zzadrVar.zza = j;
                    return 1;
                }
            } else {
                z4 = false;
            }
            zzane zzaneVar2 = this.zzk;
            r32 = z4;
            if (zzaneVar2 != null) {
                r32 = z4;
                if (zzaneVar2.zze()) {
                    return zzaneVar2.zza(zzacwVar, zzadrVar);
                }
            }
        } else {
            r32 = 0;
        }
        zzed zzedVar = this.zzc;
        byte[] zzN = zzedVar.zzN();
        if (9400 - zzedVar.zzd() < 188) {
            int zzb = zzedVar.zzb();
            if (zzb > 0) {
                System.arraycopy(zzN, zzedVar.zzd(), zzN, r32, zzb);
            }
            this.zzc.zzJ(zzN, zzb);
        }
        while (true) {
            zzed zzedVar2 = this.zzc;
            if (zzedVar2.zzb() >= 188) {
                int zzd2 = zzedVar2.zzd();
                int zze = zzedVar2.zze();
                int zza = zzano.zza(zzedVar2.zzN(), zzd2, zze);
                this.zzc.zzL(zza);
                int i7 = zza + 188;
                if (i7 > zze) {
                    this.zzq = (zza - zzd2) + this.zzq;
                } else {
                    this.zzq = r32;
                }
                zzed zzedVar3 = this.zzc;
                int zze2 = zzedVar3.zze();
                if (i7 > zze2) {
                    return r32;
                }
                int zzg = zzedVar3.zzg();
                if ((8388608 & zzg) != 0) {
                    this.zzc.zzL(i7);
                    return r32;
                }
                int i8 = (4194304 & zzg) != 0 ? 1 : r32;
                int i9 = zzg & 32;
                int i10 = (zzg >> 8) & 8191;
                zzann zzannVar = (zzg & 16) != 0 ? (zzann) this.zzg.get(i10) : null;
                if (zzannVar == null) {
                    this.zzc.zzL(i7);
                    return r32;
                }
                int i11 = zzg & 15;
                int i12 = this.zzd.get(i10, i11 - 1);
                this.zzd.put(i10, i11);
                if (i12 == i11) {
                    this.zzc.zzL(i7);
                    return r32;
                }
                if (i11 != ((i12 + 1) & 15)) {
                    zzannVar.zzc();
                }
                if (i9 != 0) {
                    zzed zzedVar4 = this.zzc;
                    int zzm = zzedVar4.zzm();
                    i8 |= (zzedVar4.zzm() & 64) != 0 ? 2 : r32;
                    this.zzc.zzM(zzm - 1);
                }
                boolean z7 = this.zzn;
                if (z7 || !this.zzi.get(i10, r32)) {
                    this.zzc.zzK(i7);
                    zzannVar.zza(this.zzc, i8);
                    this.zzc.zzK(zze2);
                }
                if (this.zzn && zzd != -1) {
                    this.zzp = true;
                }
                this.zzc.zzL(i7);
                return r32;
            }
            int zze3 = zzedVar2.zze();
            int zza2 = zzacwVar.zza(zzN, zze3, 9400 - zze3);
            if (zza2 == -1) {
                for (int i13 = r32; i13 < this.zzg.size(); i13++) {
                    zzann zzannVar2 = (zzann) this.zzg.valueAt(i13);
                    if (zzannVar2 instanceof zzams) {
                        zzams zzamsVar = (zzams) zzannVar2;
                        if (zzamsVar.zzd(r32)) {
                            zzamsVar.zza(new zzed(), 1);
                        }
                    }
                }
                return -1;
            }
            this.zzc.zzK(zze3 + zza2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        if (this.zza == 0) {
            zzacyVar = new zzajt(zzacyVar, this.zzf);
        }
        this.zzl = zzacyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        zzane zzaneVar;
        int size = this.zzb.size();
        for (int i7 = 0; i7 < size; i7++) {
            zzek zzekVar = (zzek) this.zzb.get(i7);
            if (zzekVar.zzf() != -9223372036854775807L) {
                long zzd = zzekVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j3) {
                        }
                    }
                }
            }
            zzekVar.zzi(j3);
        }
        if (j3 != 0 && (zzaneVar = this.zzk) != null) {
            zzaneVar.zzd(j3);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for (int i8 = 0; i8 < this.zzg.size(); i8++) {
            ((zzann) this.zzg.valueAt(i8)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzi(zzacw zzacwVar) {
        byte[] zzN = this.zzc.zzN();
        zzack zzackVar = (zzack) zzacwVar;
        zzackVar.zzm(zzN, 0, 940, false);
        int i7 = 0;
        while (i7 < 188) {
            for (int i8 = 0; i8 < 5; i8++) {
                if (zzN[(i8 * 188) + i7] != 71) {
                    break;
                }
            }
            zzackVar.zzo(i7, false);
            return true;
        }
        return false;
    }

    public zzani(int i7, int i8, zzajq zzajqVar, zzek zzekVar, zzanl zzanlVar, int i9) {
        this.zze = zzanlVar;
        this.zza = i8;
        this.zzf = zzajqVar;
        this.zzb = Collections.singletonList(zzekVar);
        this.zzc = new zzed(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanf(112800);
        this.zzl = zzacy.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzanlVar.zza();
        int size = zza.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.zzg.put(zza.keyAt(i10), (zzann) zza.valueAt(i10));
        }
        this.zzg.put(0, new zzana(new zzang(this)));
    }
}
