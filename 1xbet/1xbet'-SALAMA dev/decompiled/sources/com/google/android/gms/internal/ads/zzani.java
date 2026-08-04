package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.google.android.gms.internal.ads.zzams] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.zzann] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        ?? r7;
        ?? r8;
        zzann zzannVar;
        long j;
        boolean z4;
        long jZzd = zzacwVar.zzd();
        if (this.zzn) {
            if (jZzd != -1) {
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
                    zzane zzaneVar = new zzane(zzanfVar2.zzc(), zzanfVar2.zzb(), jZzd, this.zzr, 112800);
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
            r7 = z4;
            if (zzaneVar2 != null && zzaneVar2.zze()) {
                r7 = z4;
                return zzaneVar2.zza(zzacwVar, zzadrVar);
            }
        } else {
            r7 = 0;
        }
        r7 = z4;
        zzed zzedVar = this.zzc;
        byte[] bArrZzN = zzedVar.zzN();
        if (9400 - zzedVar.zzd() < 188) {
            int iZzb = zzedVar.zzb();
            if (iZzb > 0) {
                System.arraycopy(bArrZzN, zzedVar.zzd(), bArrZzN, r7, iZzb);
            }
            this.zzc.zzJ(bArrZzN, iZzb);
        }
        while (true) {
            zzed zzedVar2 = this.zzc;
            if (zzedVar2.zzb() >= 188) {
                int iZzd = zzedVar2.zzd();
                int iZze = zzedVar2.zze();
                int iZza = zzano.zza(zzedVar2.zzN(), iZzd, iZze);
                this.zzc.zzL(iZza);
                int i7 = iZza + 188;
                if (i7 > iZze) {
                    this.zzq = (iZza - iZzd) + this.zzq;
                } else {
                    this.zzq = r7;
                }
                zzed zzedVar3 = this.zzc;
                int iZze2 = zzedVar3.zze();
                if (i7 > iZze2) {
                    return r7;
                }
                int iZzg = zzedVar3.zzg();
                if ((8388608 & iZzg) != 0) {
                    this.zzc.zzL(i7);
                    return r7;
                }
                ?? r10 = (4194304 & iZzg) != 0 ? 1 : r7;
                int i8 = iZzg & 32;
                int i9 = (iZzg >> 8) & 8191;
                if ((iZzg & 16) != 0) {
                    zzannVar = (zzann) this.zzg.get(i9);
                } else {
                    r8 = 0;
                }
                if (r8 == 0) {
                    r8 = zzannVar;
                    this.zzc.zzL(i7);
                    return r7;
                }
                int i10 = iZzg & 15;
                int i11 = this.zzd.get(i9, i10 - 1);
                this.zzd.put(i9, i10);
                if (i11 == i10) {
                    r8 = zzannVar;
                    this.zzc.zzL(i7);
                    return r7;
                }
                if (i10 != ((i11 + 1) & 15)) {
                    r8 = zzannVar;
                    r8.zzc();
                }
                if (i8 != 0) {
                    zzed zzedVar4 = this.zzc;
                    int iZzm = zzedVar4.zzm();
                    r10 = (r10 == true ? 1 : 0) | ((zzedVar4.zzm() & 64) != 0 ? 2 : r7);
                    this.zzc.zzM(iZzm - 1);
                }
                boolean z7 = this.zzn;
                if (z7 || !this.zzi.get(i9, r7)) {
                    this.zzc.zzK(i7);
                    r8.zza(this.zzc, r10);
                    this.zzc.zzK(iZze2);
                    if (!z7) {
                        if (this.zzn && jZzd != -1) {
                            this.zzp = true;
                        }
                    }
                } else if (this.zzn) {
                    this.zzp = true;
                }
                this.zzc.zzL(i7);
                return r7;
            }
            int iZze3 = zzedVar2.zze();
            int iZza2 = zzacwVar.zza(bArrZzN, iZze3, 9400 - iZze3);
            if (iZza2 == -1) {
                for (?? r11 = r7; r11 < this.zzg.size(); r11++) {
                    zzann zzannVar2 = (zzann) this.zzg.valueAt(r11);
                    if (zzannVar2 instanceof zzams) {
                        ?? r9 = (zzams) zzannVar2;
                        if (r9.zzd(r7)) {
                            r9.zza(new zzed(), 1);
                        }
                    }
                }
                return -1;
            }
            this.zzc.zzK(iZze3 + iZza2);
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

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        zzane zzaneVar;
        int size = this.zzb.size();
        for (int i7 = 0; i7 < size; i7++) {
            zzek zzekVar = (zzek) this.zzb.get(i7);
            if (zzekVar.zzf() != -9223372036854775807L) {
                long jZzd = zzekVar.zzd();
                if (jZzd != -9223372036854775807L && jZzd != 0 && jZzd != j3) {
                    zzekVar.zzi(j3);
                }
            } else {
                zzekVar.zzi(j3);
            }
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

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) throws EOFException, InterruptedIOException {
        byte[] bArrZzN = this.zzc.zzN();
        zzack zzackVar = (zzack) zzacwVar;
        zzackVar.zzm(bArrZzN, 0, 940, false);
        for (int i7 = 0; i7 < 188; i7++) {
            int i8 = 0;
            while (true) {
                if (i8 >= 5) {
                    zzackVar.zzo(i7, false);
                    return true;
                }
                if (bArrZzN[(i8 * 188) + i7] != 71) {
                    break;
                }
                i8++;
            }
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
        SparseArray sparseArrayZza = zzanlVar.zza();
        int size = sparseArrayZza.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.zzg.put(sparseArrayZza.keyAt(i10), (zzann) sparseArrayZza.valueAt(i10));
        }
        this.zzg.put(0, new zzana(new zzang(this)));
    }
}
