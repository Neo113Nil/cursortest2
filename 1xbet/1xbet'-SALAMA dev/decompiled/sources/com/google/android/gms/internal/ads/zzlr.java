package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzlr {
    private final zzlm zza;
    private final int zzb;
    private final zzlm zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzlr(zzlm zzlmVar, zzlm zzlmVar2, int i7) {
        this.zza = zzlmVar;
        this.zzb = i7;
        this.zzc = zzlmVar2;
    }

    private final int zzJ(zzlm zzlmVar, zzko zzkoVar, zzyo zzyoVar, zzhy zzhyVar) {
        if (zzlmVar == null || !zzR(zzlmVar) || ((zzlmVar == this.zza && zzQ()) || (zzlmVar == this.zzc && zzS()))) {
            return 1;
        }
        zzwk zzwkVarZzp = zzlmVar.zzp();
        zzwk[] zzwkVarArr = zzkoVar.zzc;
        int i7 = this.zzb;
        zzwk zzwkVar = zzwkVarArr[i7];
        boolean zZzb = zzyoVar.zzb(i7);
        if (zZzb && zzwkVarZzp == zzwkVar) {
            return 1;
        }
        if (!zzlmVar.zzR()) {
            zzz[] zzzVarArrZzT = zzT(zzyoVar.zzc[this.zzb]);
            zzwk zzwkVar2 = zzkoVar.zzc[this.zzb];
            zzwkVar2.getClass();
            zzlmVar.zzH(zzzVarArrZzT, zzwkVar2, zzkoVar.zzf(), zzkoVar.zze(), zzkoVar.zzg.zza);
            return 3;
        }
        if (!zzlmVar.zzW()) {
            return 0;
        }
        zzL(zzlmVar, zzhyVar);
        if (!zZzb || zzF()) {
            zzN(zzlmVar == this.zza);
        }
        return 1;
    }

    private final zzlm zzK(zzko zzkoVar) {
        if (zzkoVar == null) {
            return null;
        }
        int i7 = this.zzb;
        zzwk[] zzwkVarArr = zzkoVar.zzc;
        if (zzwkVarArr[i7] == null) {
            return null;
        }
        if (this.zza.zzp() == zzwkVarArr[i7]) {
            return this.zza;
        }
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null) {
            return null;
        }
        if (zzlmVar.zzp() == zzkoVar.zzc[this.zzb]) {
            return zzlmVar;
        }
        return null;
    }

    private final void zzL(zzlm zzlmVar, zzhy zzhyVar) {
        boolean z4 = true;
        if (this.zza != zzlmVar && this.zzc != zzlmVar) {
            z4 = false;
        }
        zzcv.zzf(z4);
        if (zzR(zzlmVar)) {
            zzhyVar.zzd(zzlmVar);
            zzU(zzlmVar);
            zzlmVar.zzr();
        }
    }

    private final void zzM(zzlm zzlmVar, zzwk zzwkVar, zzhy zzhyVar, long j, boolean z4) {
        if (zzR(zzlmVar)) {
            if (zzwkVar != zzlmVar.zzp()) {
                zzL(zzlmVar, zzhyVar);
            } else if (z4) {
                zzlmVar.zzJ(j);
            }
        }
    }

    private final void zzN(boolean z4) {
        if (z4) {
            if (this.zze) {
                this.zza.zzI();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzlm zzlmVar = this.zzc;
            zzlmVar.getClass();
            zzlmVar.zzI();
            this.zzf = false;
        }
    }

    private final void zzO(boolean z4) {
        if (z4) {
            zzlm zzlmVar = this.zzc;
            zzlmVar.getClass();
            zzlmVar.zzu(17, this.zza);
        } else {
            zzlm zzlmVar2 = this.zza;
            zzlm zzlmVar3 = this.zzc;
            zzlmVar3.getClass();
            zzlmVar2.zzu(17, zzlmVar3);
        }
    }

    private final boolean zzP(zzko zzkoVar, zzlm zzlmVar) {
        if (zzlmVar == null) {
            return true;
        }
        zzwk zzwkVar = zzkoVar.zzc[this.zzb];
        if (zzlmVar.zzp() != null) {
            if (zzlmVar.zzp() == zzwkVar) {
                if (zzwkVar != null && !zzlmVar.zzQ()) {
                    zzkoVar.zzg();
                    boolean z4 = zzkoVar.zzg.zzg;
                }
            }
            zzko zzkoVarZzg = zzkoVar.zzg();
            if (zzkoVarZzg != null) {
                return zzkoVarZzg.zzc[this.zzb] == zzlmVar.zzp();
            }
            return false;
        }
        return true;
    }

    private final boolean zzQ() {
        int i7 = this.zzd;
        return i7 == 2 || i7 == 4;
    }

    private static boolean zzR(zzlm zzlmVar) {
        return zzlmVar.zzcT() != 0;
    }

    private final boolean zzS() {
        return this.zzd == 3;
    }

    private static zzz[] zzT(zzyh zzyhVar) {
        int iZzd = zzyhVar != null ? zzyhVar.zzd() : 0;
        zzz[] zzzVarArr = new zzz[iZzd];
        for (int i7 = 0; i7 < iZzd; i7++) {
            zzyhVar.getClass();
            zzzVarArr[i7] = zzyhVar.zze(i7);
        }
        return zzzVarArr;
    }

    private static final void zzU(zzlm zzlmVar) {
        if (zzlmVar.zzcT() == 2) {
            zzlmVar.zzP();
        }
    }

    private static final void zzV(zzlm zzlmVar, long j) {
        zzlmVar.zzK();
        if (zzlmVar instanceof zzwz) {
            throw null;
        }
    }

    public final boolean zzA(zzko zzkoVar) {
        zzlm zzlmVarZzK = zzK(zzkoVar);
        return zzlmVarZzK == null || zzlmVarZzK.zzQ() || zzlmVarZzK.zzX() || zzlmVarZzK.zzW();
    }

    public final boolean zzB(zzko zzkoVar) {
        return zzP(zzkoVar, this.zza) && zzP(zzkoVar, this.zzc);
    }

    public final boolean zzC(zzko zzkoVar) {
        zzlm zzlmVarZzK = zzK(zzkoVar);
        zzlmVarZzK.getClass();
        return zzlmVarZzK.zzQ();
    }

    public final boolean zzD() {
        return this.zzc != null;
    }

    public final boolean zzE() {
        boolean zZzW = zzR(this.zza) ? this.zza.zzW() : true;
        zzlm zzlmVar = this.zzc;
        return (zzlmVar == null || !zzR(zzlmVar)) ? zZzW : zZzW & this.zzc.zzW();
    }

    public final boolean zzF() {
        return zzQ() || zzS();
    }

    public final boolean zzG(zzko zzkoVar) {
        return zzK(zzkoVar) != null;
    }

    public final boolean zzH() {
        int i7 = this.zzd;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            return zzR(this.zza);
        }
        zzlm zzlmVar = this.zzc;
        zzlmVar.getClass();
        return zzR(zzlmVar);
    }

    public final boolean zzI(int i7) {
        return (zzQ() && i7 == this.zzb) || (zzS() && i7 != this.zzb);
    }

    public final int zza() {
        zzlm zzlmVar = this.zzc;
        boolean zZzR = zzR(this.zza);
        int i7 = 0;
        if (zzlmVar != null && zzR(zzlmVar)) {
            i7 = 1;
        }
        return (zZzR ? 1 : 0) + i7;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final int zzc(zzko zzkoVar, zzyo zzyoVar, zzhy zzhyVar) {
        int iZzJ = zzJ(this.zza, zzkoVar, zzyoVar, zzhyVar);
        return iZzJ == 1 ? zzJ(this.zzc, zzkoVar, zzyoVar, zzhyVar) : iZzJ;
    }

    public final long zzd(zzko zzkoVar) {
        zzlm zzlmVarZzK = zzK(zzkoVar);
        Objects.requireNonNull(zzlmVarZzK);
        return zzlmVarZzK.zzcV();
    }

    public final void zze(zzhy zzhyVar) {
        zzL(this.zza, zzhyVar);
        zzlm zzlmVar = this.zzc;
        if (zzlmVar != null) {
            boolean z4 = zzR(zzlmVar) && this.zzd != 3;
            zzL(this.zzc, zzhyVar);
            zzN(false);
            if (z4) {
                zzO(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzf(zzhy zzhyVar) {
        boolean z4;
        zzlm zzlmVar;
        if (zzF()) {
            int i7 = this.zzd;
            if (i7 == 4) {
                z4 = true;
            } else if (i7 == 2) {
                i7 = 2;
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                zzlmVar = this.zza;
            } else {
                zzlmVar = this.zzc;
                zzlmVar.getClass();
            }
            zzL(zzlmVar, zzhyVar);
            zzN(z4);
            this.zzd = i7 == 4 ? 1 : 0;
        }
    }

    public final void zzg(zzlq zzlqVar, zzyh zzyhVar, zzwk zzwkVar, long j, boolean z4, boolean z7, long j3, long j7, zzuq zzuqVar, zzhy zzhyVar) throws zzia {
        zzz[] zzzVarArrZzT = zzT(zzyhVar);
        int i7 = this.zzd;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            this.zze = true;
            this.zza.zzs(zzlqVar, zzzVarArrZzT, zzwkVar, j, z4, z7, j3, j7, zzuqVar);
            zzhyVar.zze(this.zza);
        } else {
            this.zzf = true;
            zzlm zzlmVar = this.zzc;
            zzlmVar.getClass();
            zzlmVar.zzs(zzlqVar, zzzVarArrZzT, zzwkVar, j, z4, z7, j3, j7, zzuqVar);
            zzhyVar.zze(this.zzc);
        }
    }

    public final void zzh() {
        if (zzR(this.zza)) {
            this.zza.zzt();
            return;
        }
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null || !zzR(zzlmVar)) {
            return;
        }
        this.zzc.zzt();
    }

    public final void zzi(int i7, Object obj, zzko zzkoVar) {
        zzlm zzlmVarZzK = zzK(zzkoVar);
        zzlmVarZzK.getClass();
        zzlmVarZzK.zzu(11, obj);
    }

    public final void zzj(zzwk zzwkVar, zzhy zzhyVar, long j, boolean z4) {
        zzM(this.zza, zzwkVar, zzhyVar, j, z4);
        zzlm zzlmVar = this.zzc;
        if (zzlmVar != null) {
            zzM(zzlmVar, zzwkVar, zzhyVar, j, z4);
        }
    }

    public final void zzk() {
        int i7 = this.zzd;
        if (i7 == 3 || i7 == 4) {
            zzO(i7 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i7 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzl(zzyo zzyoVar, zzyo zzyoVar2, long j) {
        zzlm zzlmVar;
        int i7;
        int i8 = this.zzb;
        boolean zZzb = zzyoVar.zzb(i8);
        boolean zZzb2 = zzyoVar2.zzb(i8);
        if (this.zzc == null || (i7 = this.zzd) == 3 || (i7 == 0 && zzR(this.zza))) {
            zzlmVar = this.zza;
        } else {
            zzlmVar = this.zzc;
            zzlmVar.getClass();
        }
        if (!zZzb || zzlmVar.zzR()) {
            return;
        }
        zzb();
        zzlq[] zzlqVarArr = zzyoVar.zzb;
        int i9 = this.zzb;
        zzlq zzlqVar = zzlqVarArr[i9];
        zzlq zzlqVar2 = zzyoVar2.zzb[i9];
        if (zZzb2 && Objects.equals(zzlqVar2, zzlqVar) && !zzF()) {
            return;
        }
        zzV(zzlmVar, j);
    }

    public final void zzm(zzko zzkoVar) {
        zzlm zzlmVarZzK = zzK(zzkoVar);
        zzlmVarZzK.getClass();
        zzlmVarZzK.zzw();
    }

    public final void zzn() {
        this.zza.zzG();
        this.zze = false;
        zzlm zzlmVar = this.zzc;
        if (zzlmVar != null) {
            zzlmVar.zzG();
            this.zzf = false;
        }
    }

    public final void zzo(long j, long j3) {
        if (zzR(this.zza)) {
            this.zza.zzV(j, j3);
        }
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null || !zzR(zzlmVar)) {
            return;
        }
        this.zzc.zzV(j, j3);
    }

    public final void zzp() {
        if (!zzR(this.zza)) {
            zzN(true);
        }
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null || zzR(zzlmVar)) {
            return;
        }
        zzN(false);
    }

    public final void zzq(zzko zzkoVar, long j) {
        zzlm zzlmVarZzK = zzK(zzkoVar);
        if (zzlmVarZzK != null) {
            zzlmVarZzK.zzJ(j);
        }
    }

    public final void zzr(long j) {
        int i7;
        if (zzR(this.zza) && (i7 = this.zzd) != 4 && i7 != 2) {
            zzV(this.zza, j);
        }
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null || !zzR(zzlmVar) || this.zzd == 3) {
            return;
        }
        zzV(this.zzc, j);
    }

    public final void zzs(zzko zzkoVar, long j) {
        zzlm zzlmVarZzK = zzK(zzkoVar);
        zzlmVarZzK.getClass();
        zzV(zzlmVarZzK, j);
    }

    public final void zzt(float f7, float f8) {
        this.zza.zzM(f7, f8);
        zzlm zzlmVar = this.zzc;
        if (zzlmVar != null) {
            zzlmVar.zzM(f7, f8);
        }
    }

    public final void zzu(zzbn zzbnVar) {
        this.zza.zzN(zzbnVar);
        zzlm zzlmVar = this.zzc;
        if (zzlmVar != null) {
            zzlmVar.zzN(zzbnVar);
        }
    }

    public final void zzv(Object obj) {
        if (zzb() != 2) {
            return;
        }
        int i7 = this.zzd;
        if (i7 != 4 && i7 != 1) {
            this.zza.zzu(1, obj);
            return;
        }
        zzlm zzlmVar = this.zzc;
        zzlmVar.getClass();
        zzlmVar.zzu(1, obj);
    }

    public final void zzw(float f7) {
        if (zzb() != 1) {
            return;
        }
        zzlm zzlmVar = this.zza;
        Float fValueOf = Float.valueOf(f7);
        zzlmVar.zzu(2, fValueOf);
        zzlm zzlmVar2 = this.zzc;
        if (zzlmVar2 != null) {
            zzlmVar2.zzu(2, fValueOf);
        }
    }

    public final void zzx() {
        if (this.zza.zzcT() == 1 && this.zzd != 4) {
            this.zza.zzO();
            return;
        }
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null || zzlmVar.zzcT() != 1 || this.zzd == 3) {
            return;
        }
        zzlmVar.zzO();
    }

    public final void zzy() {
        int i7;
        zzcv.zzf(!zzF());
        if (zzR(this.zza)) {
            i7 = 3;
        } else {
            zzlm zzlmVar = this.zzc;
            i7 = (zzlmVar == null || !zzR(zzlmVar)) ? 2 : 4;
        }
        this.zzd = i7;
    }

    public final void zzz() {
        if (zzR(this.zza)) {
            zzU(this.zza);
        }
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null || !zzR(zzlmVar)) {
            return;
        }
        zzU(this.zzc);
    }
}
