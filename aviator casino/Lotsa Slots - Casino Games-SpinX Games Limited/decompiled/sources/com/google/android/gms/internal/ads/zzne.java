package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzne {
    private final com.google.android.gms.internal.ads.zzna zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzna zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzne(com.google.android.gms.internal.ads.zzna zznaVar, com.google.android.gms.internal.ads.zzna zznaVar2, int i) {
        this.zza = zznaVar;
        this.zzb = i;
        this.zzc = zznaVar2;
    }

    private final boolean zzN() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(com.google.android.gms.internal.ads.zzmc zzmcVar, com.google.android.gms.internal.ads.zzna zznaVar) {
        if (zznaVar == null) {
            return true;
        }
        com.google.android.gms.internal.ads.zzzc[] zzzcVarArr = zzmcVar.zzc;
        int i = this.zzb;
        com.google.android.gms.internal.ads.zzzc zzzcVar = zzzcVarArr[i];
        if (zznaVar.zzcV() != null) {
            if (zznaVar.zzcV() == zzzcVar) {
                if (zzzcVar != null && !zznaVar.zzcW()) {
                    zzmcVar.zzp();
                    boolean z = zzmcVar.zzg.zzh;
                }
            }
            com.google.android.gms.internal.ads.zzmc zzp = zzmcVar.zzp();
            return zzp != null && zzp.zzc[i] == zznaVar.zzcV();
        }
        return true;
    }

    private final void zzR(com.google.android.gms.internal.ads.zzna zznaVar, com.google.android.gms.internal.ads.zzzc zzzcVar, com.google.android.gms.internal.ads.zzji zzjiVar, long j, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        if (zzW(zznaVar)) {
            if (zzzcVar != zznaVar.zzcV()) {
                zzS(zznaVar, zzjiVar);
            } else if (z) {
                zznaVar.zzp(j, true);
            }
        }
    }

    private final void zzS(com.google.android.gms.internal.ads.zzna zznaVar, com.google.android.gms.internal.ads.zzji zzjiVar) {
        boolean z = true;
        if (this.zza != zznaVar && this.zzc != zznaVar) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzgtj.zzi(z);
        if (zzW(zznaVar)) {
            zzjiVar.zze(zznaVar);
            zzY(zznaVar);
            zznaVar.zzr();
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
            com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
            zznaVar.getClass();
            zznaVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(com.google.android.gms.internal.ads.zzna zznaVar, com.google.android.gms.internal.ads.zzmc zzmcVar, com.google.android.gms.internal.ads.zzabi zzabiVar, com.google.android.gms.internal.ads.zzji zzjiVar) throws com.google.android.gms.internal.ads.zzjk {
        if (zznaVar != null && zzW(zznaVar)) {
            com.google.android.gms.internal.ads.zzna zznaVar2 = this.zza;
            boolean z = zznaVar != zznaVar2;
            if ((zznaVar != zznaVar2 || !zzN()) && (zznaVar != this.zzc || !zzO())) {
                com.google.android.gms.internal.ads.zzzc zzcV = zznaVar.zzcV();
                com.google.android.gms.internal.ads.zzzc[] zzzcVarArr = zzmcVar.zzc;
                int i = this.zzb;
                com.google.android.gms.internal.ads.zzzc zzzcVar = zzzcVarArr[i];
                boolean zza = zzabiVar.zza(i);
                if (zza && zzcV == zzzcVar) {
                    return 1;
                }
                if (!zznaVar.zzm()) {
                    com.google.android.gms.internal.ads.zzv[] zzV = zzV(zzabiVar.zzc[i]);
                    com.google.android.gms.internal.ads.zzzc zzzcVar2 = zzzcVarArr[i];
                    zzzcVar2.getClass();
                    zznaVar.zzcU(zzV, zzzcVar2, zzmcVar.zzc(), zzmcVar.zza(), zzmcVar.zzg.zza);
                    return 3;
                }
                if (!zznaVar.zzab()) {
                    return 0;
                }
                zzS(zznaVar, zzjiVar);
                if (!zza || zzc()) {
                    zzT(!z);
                }
                return 1;
            }
        }
        return 1;
    }

    private static com.google.android.gms.internal.ads.zzv[] zzV(com.google.android.gms.internal.ads.zzaba zzabaVar) {
        int zze = zzabaVar != null ? zzabaVar.zze() : 0;
        com.google.android.gms.internal.ads.zzv[] zzvVarArr = new com.google.android.gms.internal.ads.zzv[zze];
        for (int i = 0; i < zze; i++) {
            zzabaVar.getClass();
            zzvVarArr[i] = zzabaVar.zzb(i);
        }
        return zzvVarArr;
    }

    private static boolean zzW(com.google.android.gms.internal.ads.zzna zznaVar) {
        return zznaVar.zze() != 0;
    }

    private final com.google.android.gms.internal.ads.zzna zzX(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        if (zzmcVar != null) {
            int i = this.zzb;
            com.google.android.gms.internal.ads.zzzc[] zzzcVarArr = zzmcVar.zzc;
            if (zzzcVarArr[i] != null) {
                com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
                com.google.android.gms.internal.ads.zzzc zzcV = zznaVar.zzcV();
                com.google.android.gms.internal.ads.zzzc zzzcVar = zzzcVarArr[i];
                if (zzcV == zzzcVar) {
                    return zznaVar;
                }
                com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
                if (zznaVar2 != null && zznaVar2.zzcV() == zzzcVar) {
                    return zznaVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(com.google.android.gms.internal.ads.zzna zznaVar) {
        if (zznaVar.zze() == 2) {
            zznaVar.zzq();
        }
    }

    private static final void zzZ(com.google.android.gms.internal.ads.zzna zznaVar, long j) {
        zznaVar.zzl();
        if (zznaVar instanceof com.google.android.gms.internal.ads.zzzr) {
            throw null;
        }
    }

    public final void zzA(com.google.android.gms.internal.ads.zzji zzjiVar) throws com.google.android.gms.internal.ads.zzjk {
        zzS(this.zza, zzjiVar);
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            boolean z = zzW(zznaVar) && this.zzd != 3;
            zzS(zznaVar, zzjiVar);
            zzT(false);
            if (z) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws com.google.android.gms.internal.ads.zzjk {
        int i = this.zzd;
        if (i == 3 || i == 4) {
            zzQ(i == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzD(com.google.android.gms.internal.ads.zzzc zzzcVar, com.google.android.gms.internal.ads.zzji zzjiVar, long j, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        zzR(this.zza, zzzcVar, zzjiVar, j, z);
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zzR(zznaVar, zzzcVar, zzjiVar, j, z);
        }
    }

    public final void zzE(com.google.android.gms.internal.ads.zzmc zzmcVar, long j, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzna zzX = zzX(zzmcVar);
        if (zzX != null) {
            zzX.zzp(j, z);
        }
    }

    public final boolean zzF(com.google.android.gms.internal.ads.zzmc zzmcVar, long j) {
        com.google.android.gms.internal.ads.zzna zzX = zzX(zzmcVar);
        return zzX != null && zzX.zzW(j);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar == null || zzW(zznaVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(com.google.android.gms.internal.ads.zzmc zzmcVar, com.google.android.gms.internal.ads.zzabi zzabiVar, com.google.android.gms.internal.ads.zzji zzjiVar) throws com.google.android.gms.internal.ads.zzjk {
        int zzU = zzU(this.zza, zzmcVar, zzabiVar, zzjiVar);
        return zzU == 1 ? zzU(this.zzc, zzmcVar, zzabiVar, zzjiVar) : zzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(java.lang.Object obj) throws com.google.android.gms.internal.ads.zzjk {
        if (zze() != 2) {
            return;
        }
        int i = this.zzd;
        if (i != 4 && i != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        zznaVar.getClass();
        zznaVar.zzx(1, obj);
    }

    public final void zzK(com.google.android.gms.internal.ads.zzadr zzadrVar) throws com.google.android.gms.internal.ads.zzjk {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzadrVar);
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzx(7, zzadrVar);
        }
    }

    public final void zzL(float f) throws com.google.android.gms.internal.ads.zzjk {
        if (zze() != 1) {
            return;
        }
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        java.lang.Float valueOf = java.lang.Float.valueOf(f);
        zznaVar.zzx(2, valueOf);
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        if (zznaVar2 != null) {
            zznaVar2.zzx(2, valueOf);
        }
    }

    public final boolean zzM() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzW(this.zza);
        }
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        zznaVar.getClass();
        return zzW(zznaVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i;
        com.google.android.gms.internal.ads.zzgtj.zzi(!zzc());
        if (zzW(this.zza)) {
            i = 3;
        } else {
            com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
            i = (zznaVar == null || !zzW(zznaVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        boolean zzW = zzW(this.zza);
        int i = 0;
        if (zznaVar != null && zzW(zznaVar)) {
            i = 1;
        }
        return (zzW ? 1 : 0) + i;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        return ((com.google.android.gms.internal.ads.zzna) java.util.Objects.requireNonNull(zzX(zzmcVar))).zzk();
    }

    public final boolean zzg(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        com.google.android.gms.internal.ads.zzna zzX = zzX(zzmcVar);
        zzX.getClass();
        return zzX.zzcW();
    }

    public final void zzh(com.google.android.gms.internal.ads.zzmc zzmcVar, long j) {
        com.google.android.gms.internal.ads.zzna zzX = zzX(zzmcVar);
        zzX.getClass();
        zzZ(zzX, j);
    }

    public final void zzi(com.google.android.gms.internal.ads.zzabi zzabiVar, com.google.android.gms.internal.ads.zzabi zzabiVar2, long j) {
        int i;
        int i2 = this.zzb;
        boolean zza = zzabiVar.zza(i2);
        boolean zza2 = zzabiVar2.zza(i2);
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar == null || (i = this.zzd) == 3 || (i == 0 && zzW(this.zza))) {
            zznaVar = this.zza;
        }
        if (!zza || zznaVar.zzm()) {
            return;
        }
        zze();
        com.google.android.gms.internal.ads.zznd zzndVar = zzabiVar.zzb[i2];
        com.google.android.gms.internal.ads.zznd zzndVar2 = zzabiVar2.zzb[i2];
        if (zza2 && java.util.Objects.equals(zzndVar2, zzndVar) && !zzc()) {
            return;
        }
        zzZ(zznaVar, j);
    }

    public final void zzj(long j) {
        int i;
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        if (zzW(zznaVar) && (i = this.zzd) != 4 && i != 2) {
            zzZ(zznaVar, j);
        }
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zznaVar2, j);
    }

    public final long zzk(long j, long j2) {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        long zzV = zzW(zznaVar) ? zznaVar.zzV(j, j2) : Long.MAX_VALUE;
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        return (zznaVar2 == null || !zzW(zznaVar2)) ? zzV : java.lang.Math.min(zzV, zznaVar2.zzV(j, j2));
    }

    public final void zzl() {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        if (zzW(zznaVar)) {
            zznaVar.zzY();
            return;
        }
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2)) {
            return;
        }
        zznaVar2.zzY();
    }

    public final void zzm(float f, float f2) throws com.google.android.gms.internal.ads.zzjk {
        this.zza.zzX(f, f2);
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzX(f, f2);
        }
    }

    public final void zzn(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        boolean zzab = zzW(zznaVar) ? zznaVar.zzab() : true;
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        return (zznaVar2 == null || !zzW(zznaVar2)) ? zzab : zzab & zznaVar2.zzab();
    }

    public final boolean zzp(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        return zzX(zzmcVar) != null;
    }

    public final boolean zzq(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        return (zzN() && zzX(zzmcVar) == this.zza) || (zzO() && zzX(zzmcVar) == this.zzc);
    }

    public final boolean zzr(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        return zzP(zzmcVar, this.zza) && zzP(zzmcVar, this.zzc);
    }

    public final void zzs(long j, long j2) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        if (zzW(zznaVar)) {
            zznaVar.zzZ(j, j2);
        }
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2)) {
            return;
        }
        zznaVar2.zzZ(j, j2);
    }

    public final boolean zzt(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        com.google.android.gms.internal.ads.zzna zzX = zzX(zzmcVar);
        return zzX == null || zzX.zzcW() || zzX.zzaa() || zzX.zzab();
    }

    public final void zzu(com.google.android.gms.internal.ads.zzmc zzmcVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzna zzX = zzX(zzmcVar);
        zzX.getClass();
        zzX.zzn();
    }

    public final void zzv() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        if (zznaVar.zze() == 1 && this.zzd != 4) {
            zznaVar.zzcT();
            return;
        }
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || zznaVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zznaVar2.zzcT();
    }

    public final void zzw() {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
        if (zzW(zznaVar)) {
            zzY(zznaVar);
        }
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2)) {
            return;
        }
        zzY(zznaVar2);
    }

    public final void zzx(com.google.android.gms.internal.ads.zznd zzndVar, com.google.android.gms.internal.ads.zzaba zzabaVar, com.google.android.gms.internal.ads.zzzc zzzcVar, long j, boolean z, boolean z2, long j2, long j3, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzji zzjiVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzv[] zzV = zzV(zzabaVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            com.google.android.gms.internal.ads.zzna zznaVar = this.zza;
            zznaVar.zzf(zzndVar, zzV, zzzcVar, j, z, z2, j2, j3, zzxkVar);
            zzjiVar.zzd(zznaVar);
            return;
        }
        this.zzf = true;
        com.google.android.gms.internal.ads.zzna zznaVar2 = this.zzc;
        zznaVar2.getClass();
        zznaVar2.zzf(zzndVar, zzV, zzzcVar, j, z, z2, j2, j3, zzxkVar);
        zzjiVar.zzd(zznaVar2);
    }

    public final void zzy(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzmc zzmcVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzna zzX = zzX(zzmcVar);
        zzX.getClass();
        zzX.zzx(11, obj);
    }

    public final void zzz(com.google.android.gms.internal.ads.zznh zznhVar) throws com.google.android.gms.internal.ads.zzjk {
        this.zza.zzx(18, zznhVar);
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzx(18, zznhVar);
        }
    }

    private final void zzQ(boolean z) throws com.google.android.gms.internal.ads.zzjk {
        if (z) {
            com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
            zznaVar.getClass();
            zznaVar.zzx(17, this.zza);
        } else {
            com.google.android.gms.internal.ads.zzna zznaVar2 = this.zza;
            com.google.android.gms.internal.ads.zzna zznaVar3 = this.zzc;
            zznaVar3.getClass();
            zznaVar2.zzx(17, zznaVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzC(com.google.android.gms.internal.ads.zzji zzjiVar) {
        boolean z;
        com.google.android.gms.internal.ads.zzna zznaVar;
        if (zzc()) {
            int i = this.zzd;
            if (i != 4) {
                if (i != 2) {
                    z = false;
                    if (z) {
                        zznaVar = this.zzc;
                        zznaVar.getClass();
                    } else {
                        zznaVar = this.zza;
                    }
                    zzS(zznaVar, zzjiVar);
                    zzT(z);
                    this.zzd = i == 4 ? 1 : 0;
                }
                i = 2;
            }
            z = true;
            if (z) {
            }
            zzS(zznaVar, zzjiVar);
            zzT(z);
            this.zzd = i == 4 ? 1 : 0;
        }
    }
}
