package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzni {
    private final zzne zza;
    private final int zzb;
    private final zzne zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzni(zzne zzneVar, zzne zzneVar2, int i) {
        this.zza = zzneVar;
        this.zzb = i;
        this.zzc = zzneVar2;
    }

    private final boolean zzN() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzmg zzmgVar, zzne zzneVar) {
        if (zzneVar == null) {
            return true;
        }
        zzzg[] zzzgVarArr = zzmgVar.zzc;
        int i = this.zzb;
        zzzg zzzgVar = zzzgVarArr[i];
        if (zzneVar.zzcV() != null) {
            if (zzneVar.zzcV() == zzzgVar) {
                if (zzzgVar != null && !zzneVar.zzcW()) {
                    zzmgVar.zzp();
                    boolean z = zzmgVar.zzg.zzf;
                }
            }
            zzmg zzp = zzmgVar.zzp();
            return zzp != null && zzp.zzc[i] == zzneVar.zzcV();
        }
        return true;
    }

    private final void zzR(zzne zzneVar, zzzg zzzgVar, zzjl zzjlVar, long j, boolean z) throws zzjn {
        if (zzW(zzneVar)) {
            if (zzzgVar != zzneVar.zzcV()) {
                zzS(zzneVar, zzjlVar);
            } else if (z) {
                zzneVar.zzp(j, true);
            }
        }
    }

    private final void zzS(zzne zzneVar, zzjl zzjlVar) {
        boolean z = true;
        if (this.zza != zzneVar && this.zzc != zzneVar) {
            z = false;
        }
        zzguk.zzi(z);
        if (zzW(zzneVar)) {
            zzjlVar.zze(zzneVar);
            zzY(zzneVar);
            zzneVar.zzr();
        }
    }

    private final void zzT(boolean z) {
        if (z) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzne zzneVar = this.zzc;
            zzneVar.getClass();
            zzneVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zzne zzneVar, zzmg zzmgVar, zzabm zzabmVar, zzjl zzjlVar) throws zzjn {
        if (zzneVar != null && zzW(zzneVar)) {
            zzne zzneVar2 = this.zza;
            boolean z = zzneVar != zzneVar2;
            if ((zzneVar != zzneVar2 || !zzN()) && (zzneVar != this.zzc || !zzO())) {
                zzzg zzcV = zzneVar.zzcV();
                zzzg[] zzzgVarArr = zzmgVar.zzc;
                int i = this.zzb;
                zzzg zzzgVar = zzzgVarArr[i];
                boolean zza = zzabmVar.zza(i);
                if (zza && zzcV == zzzgVar) {
                    return 1;
                }
                if (!zzneVar.zzm()) {
                    zzv[] zzV = zzV(zzabmVar.zzc[i]);
                    zzzg zzzgVar2 = zzzgVarArr[i];
                    zzzgVar2.getClass();
                    zzneVar.zzcU(zzV, zzzgVar2, zzmgVar.zzc(), zzmgVar.zza(), zzmgVar.zzg.zza);
                    return 3;
                }
                if (!zzneVar.zzac()) {
                    return 0;
                }
                zzS(zzneVar, zzjlVar);
                if (!zza || zzc()) {
                    zzT(!z);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzabe zzabeVar) {
        int zze = zzabeVar != null ? zzabeVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[zze];
        for (int i = 0; i < zze; i++) {
            zzabeVar.getClass();
            zzvVarArr[i] = zzabeVar.zzb(i);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzne zzneVar) {
        return zzneVar.zze() != 0;
    }

    private final zzne zzX(zzmg zzmgVar) {
        if (zzmgVar != null) {
            int i = this.zzb;
            zzzg[] zzzgVarArr = zzmgVar.zzc;
            if (zzzgVarArr[i] != null) {
                zzne zzneVar = this.zza;
                zzzg zzcV = zzneVar.zzcV();
                zzzg zzzgVar = zzzgVarArr[i];
                if (zzcV == zzzgVar) {
                    return zzneVar;
                }
                zzne zzneVar2 = this.zzc;
                if (zzneVar2 != null && zzneVar2.zzcV() == zzzgVar) {
                    return zzneVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzne zzneVar) {
        if (zzneVar.zze() == 2) {
            zzneVar.zzq();
        }
    }

    private static final void zzZ(zzne zzneVar, long j) {
        zzneVar.zzl();
        if (zzneVar instanceof zzzv) {
            throw null;
        }
    }

    public final void zzA(zzjl zzjlVar) throws zzjn {
        zzS(this.zza, zzjlVar);
        zzne zzneVar = this.zzc;
        if (zzneVar != null) {
            boolean z = zzW(zzneVar) && this.zzd != 3;
            zzS(zzneVar, zzjlVar);
            zzT(false);
            if (z) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zzjn {
        int i = this.zzd;
        if (i == 3 || i == 4) {
            zzQ(i == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzD(zzzg zzzgVar, zzjl zzjlVar, long j, boolean z) throws zzjn {
        zzR(this.zza, zzzgVar, zzjlVar, j, z);
        zzne zzneVar = this.zzc;
        if (zzneVar != null) {
            zzR(zzneVar, zzzgVar, zzjlVar, j, z);
        }
    }

    public final void zzE(zzmg zzmgVar, long j, boolean z) throws zzjn {
        zzne zzX = zzX(zzmgVar);
        if (zzX != null) {
            zzX.zzp(j, z);
        }
    }

    public final boolean zzF(zzmg zzmgVar, long j) {
        zzne zzX = zzX(zzmgVar);
        return zzX != null && zzX.zzX(j);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzne zzneVar = this.zzc;
        if (zzneVar == null || zzW(zzneVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzmg zzmgVar, zzabm zzabmVar, zzjl zzjlVar) throws zzjn {
        int zzU = zzU(this.zza, zzmgVar, zzabmVar, zzjlVar);
        return zzU == 1 ? zzU(this.zzc, zzmgVar, zzabmVar, zzjlVar) : zzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzne zzneVar = this.zzc;
        if (zzneVar != null) {
            zzneVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) throws zzjn {
        if (zze() != 2) {
            return;
        }
        int i = this.zzd;
        if (i != 4 && i != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzne zzneVar = this.zzc;
        zzneVar.getClass();
        zzneVar.zzx(1, obj);
    }

    public final void zzK(zzaea zzaeaVar) throws zzjn {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzaeaVar);
        zzne zzneVar = this.zzc;
        if (zzneVar != null) {
            zzneVar.zzx(7, zzaeaVar);
        }
    }

    public final void zzL(float f) throws zzjn {
        if (zze() != 1) {
            return;
        }
        zzne zzneVar = this.zza;
        Float valueOf = Float.valueOf(f);
        zzneVar.zzx(2, valueOf);
        zzne zzneVar2 = this.zzc;
        if (zzneVar2 != null) {
            zzneVar2.zzx(2, valueOf);
        }
    }

    public final boolean zzM() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzW(this.zza);
        }
        zzne zzneVar = this.zzc;
        zzneVar.getClass();
        return zzW(zzneVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i;
        zzguk.zzi(!zzc());
        if (zzW(this.zza)) {
            i = 3;
        } else {
            zzne zzneVar = this.zzc;
            i = (zzneVar == null || !zzW(zzneVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzne zzneVar = this.zzc;
        boolean zzW = zzW(this.zza);
        int i = 0;
        if (zzneVar != null && zzW(zzneVar)) {
            i = 1;
        }
        return (zzW ? 1 : 0) + i;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzmg zzmgVar) {
        return ((zzne) Objects.requireNonNull(zzX(zzmgVar))).zzk();
    }

    public final boolean zzg(zzmg zzmgVar) {
        zzne zzX = zzX(zzmgVar);
        zzX.getClass();
        return zzX.zzcW();
    }

    public final void zzh(zzmg zzmgVar, long j) {
        zzne zzX = zzX(zzmgVar);
        zzX.getClass();
        zzZ(zzX, j);
    }

    public final void zzi(zzabm zzabmVar, zzabm zzabmVar2, long j) {
        int i;
        int i2 = this.zzb;
        boolean zza = zzabmVar.zza(i2);
        boolean zza2 = zzabmVar2.zza(i2);
        zzne zzneVar = this.zzc;
        if (zzneVar == null || (i = this.zzd) == 3 || (i == 0 && zzW(this.zza))) {
            zzneVar = this.zza;
        }
        if (!zza || zzneVar.zzm()) {
            return;
        }
        zze();
        zznh zznhVar = zzabmVar.zzb[i2];
        zznh zznhVar2 = zzabmVar2.zzb[i2];
        if (zza2 && Objects.equals(zznhVar2, zznhVar) && !zzc()) {
            return;
        }
        zzZ(zzneVar, j);
    }

    public final void zzj(long j) {
        int i;
        zzne zzneVar = this.zza;
        if (zzW(zzneVar) && (i = this.zzd) != 4 && i != 2) {
            zzZ(zzneVar, j);
        }
        zzne zzneVar2 = this.zzc;
        if (zzneVar2 == null || !zzW(zzneVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzneVar2, j);
    }

    public final long zzk(long j, long j2) {
        zzne zzneVar = this.zza;
        long zzW = zzW(zzneVar) ? zzneVar.zzW(j, j2) : Long.MAX_VALUE;
        zzne zzneVar2 = this.zzc;
        return (zzneVar2 == null || !zzW(zzneVar2)) ? zzW : Math.min(zzW, zzneVar2.zzW(j, j2));
    }

    public final void zzl() {
        zzne zzneVar = this.zza;
        if (zzW(zzneVar)) {
            zzneVar.zzZ();
            return;
        }
        zzne zzneVar2 = this.zzc;
        if (zzneVar2 == null || !zzW(zzneVar2)) {
            return;
        }
        zzneVar2.zzZ();
    }

    public final void zzm(float f, float f2) throws zzjn {
        this.zza.zzY(f, f2);
        zzne zzneVar = this.zzc;
        if (zzneVar != null) {
            zzneVar.zzY(f, f2);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzne zzneVar = this.zzc;
        if (zzneVar != null) {
            zzneVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzne zzneVar = this.zza;
        boolean zzac = zzW(zzneVar) ? zzneVar.zzac() : true;
        zzne zzneVar2 = this.zzc;
        return (zzneVar2 == null || !zzW(zzneVar2)) ? zzac : zzac & zzneVar2.zzac();
    }

    public final boolean zzp(zzmg zzmgVar) {
        return zzX(zzmgVar) != null;
    }

    public final boolean zzq(zzmg zzmgVar) {
        return (zzN() && zzX(zzmgVar) == this.zza) || (zzO() && zzX(zzmgVar) == this.zzc);
    }

    public final boolean zzr(zzmg zzmgVar) {
        return zzP(zzmgVar, this.zza) && zzP(zzmgVar, this.zzc);
    }

    public final void zzs(long j, long j2) throws zzjn {
        zzne zzneVar = this.zza;
        if (zzW(zzneVar)) {
            zzneVar.zzaa(j, j2);
        }
        zzne zzneVar2 = this.zzc;
        if (zzneVar2 == null || !zzW(zzneVar2)) {
            return;
        }
        zzneVar2.zzaa(j, j2);
    }

    public final boolean zzt(zzmg zzmgVar) {
        zzne zzX = zzX(zzmgVar);
        return zzX == null || zzX.zzcW() || zzX.zzab() || zzX.zzac();
    }

    public final void zzu(zzmg zzmgVar) throws IOException {
        zzne zzX = zzX(zzmgVar);
        zzX.getClass();
        zzX.zzn();
    }

    public final void zzv() throws zzjn {
        zzne zzneVar = this.zza;
        if (zzneVar.zze() == 1 && this.zzd != 4) {
            zzneVar.zzcT();
            return;
        }
        zzne zzneVar2 = this.zzc;
        if (zzneVar2 == null || zzneVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzneVar2.zzcT();
    }

    public final void zzw() {
        zzne zzneVar = this.zza;
        if (zzW(zzneVar)) {
            zzY(zzneVar);
        }
        zzne zzneVar2 = this.zzc;
        if (zzneVar2 == null || !zzW(zzneVar2)) {
            return;
        }
        zzY(zzneVar2);
    }

    public final void zzx(zznh zznhVar, zzabe zzabeVar, zzzg zzzgVar, long j, boolean z, boolean z2, long j2, long j3, zzxo zzxoVar, zzjl zzjlVar) throws zzjn {
        zzv[] zzV = zzV(zzabeVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zzne zzneVar = this.zza;
            zzneVar.zzf(zznhVar, zzV, zzzgVar, j, z, z2, j2, j3, zzxoVar);
            zzjlVar.zzd(zzneVar);
            return;
        }
        this.zzf = true;
        zzne zzneVar2 = this.zzc;
        zzneVar2.getClass();
        zzneVar2.zzf(zznhVar, zzV, zzzgVar, j, z, z2, j2, j3, zzxoVar);
        zzjlVar.zzd(zzneVar2);
    }

    public final void zzy(int i, Object obj, zzmg zzmgVar) throws zzjn {
        zzne zzX = zzX(zzmgVar);
        zzX.getClass();
        zzX.zzx(11, obj);
    }

    public final void zzz(zznl zznlVar) throws zzjn {
        this.zza.zzx(18, zznlVar);
        zzne zzneVar = this.zzc;
        if (zzneVar != null) {
            zzneVar.zzx(18, zznlVar);
        }
    }

    private final void zzQ(boolean z) throws zzjn {
        if (z) {
            zzne zzneVar = this.zzc;
            zzneVar.getClass();
            zzneVar.zzx(17, this.zza);
        } else {
            zzne zzneVar2 = this.zza;
            zzne zzneVar3 = this.zzc;
            zzneVar3.getClass();
            zzneVar2.zzx(17, zzneVar3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|(2:7|(1:9)(10:10|11|12|(1:14)(2:25|(1:27)(2:28|29))|15|16|17|(1:19)|20|21))|32|11|12|(0)(0)|15|16|17|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        com.google.android.gms.internal.ads.zzeh.zzf("RendererHolder", "Reset prewarming failed.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        com.google.android.gms.internal.ads.zzeh.zzf("RendererHolder", "Disable prewarming failed.", r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: RuntimeException -> 0x002a, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x002a, blocks: (B:14:0x001a, B:15:0x0024, B:25:0x001d, B:27:0x0021, B:29:0x0029), top: B:12:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x001d A[Catch: RuntimeException -> 0x002a, TryCatch #1 {RuntimeException -> 0x002a, blocks: (B:14:0x001a, B:15:0x0024, B:25:0x001d, B:27:0x0021, B:29:0x0029), top: B:12:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzC(zzjl zzjlVar) {
        boolean z;
        zzne zzneVar;
        if (zzc()) {
            int i = this.zzd;
            if (i != 4) {
                if (i != 2) {
                    z = false;
                    if (z) {
                        zzneVar = this.zzc;
                        if (zzneVar == null) {
                            throw null;
                        }
                        zzne zzneVar2 = zzneVar;
                    } else {
                        zzneVar = this.zza;
                    }
                    zzS(zzneVar, zzjlVar);
                    zzT(z);
                    this.zzd = i == 4 ? 1 : 0;
                }
                i = 2;
            }
            z = true;
            if (z) {
            }
            zzS(zzneVar, zzjlVar);
            zzT(z);
            this.zzd = i == 4 ? 1 : 0;
        }
    }
}
