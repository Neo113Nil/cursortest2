package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes.dex */
final class zzxy extends zzya implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxy(int i7, zzbo zzboVar, int i8, zzxt zzxtVar, int i9, String str, String str2) {
        int iZzc;
        super(i7, zzboVar, i8);
        int i10 = 0;
        this.zzf = zzln.zza(i9, false);
        int i11 = this.zzd.zze;
        int i12 = zzxtVar.zzy;
        this.zzg = 1 == (i11 & 1);
        this.zzh = (i11 & 2) != 0;
        zzfwh zzfwhVarZzo = str2 != null ? zzfwh.zzo(str2) : zzxtVar.zzv.isEmpty() ? zzfwh.zzo("") : zzxtVar.zzv;
        int i13 = 0;
        while (true) {
            if (i13 >= zzfwhVarZzo.size()) {
                i13 = f.API_PRIORITY_OTHER;
                iZzc = 0;
                break;
            } else {
                iZzc = zzyf.zzc(this.zzd, (String) zzfwhVarZzo.get(i13), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.zzi = i13;
        this.zzj = iZzc;
        int iZzb = zzyf.zzb(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzb;
        this.zzm = (1088 & this.zzd.zzf) != 0;
        int iZzc2 = zzyf.zzc(this.zzd, str, zzyf.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z4 = iZzc > 0 || (zzxtVar.zzv.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (zzln.zza(i9, zzxtVar.zzR) && z4) {
            i10 = 1;
        }
        this.zze = i10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxy zzxyVar) {
        zzfvw zzfvwVarZzb = zzfvw.zzj().zzd(this.zzf, zzxyVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxyVar.zzi), zzfxs.zzc().zza()).zzb(this.zzj, zzxyVar.zzj).zzb(this.zzk, zzxyVar.zzk).zzd(this.zzg, zzxyVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxyVar.zzh), this.zzj == 0 ? zzfxs.zzc() : zzfxs.zzc().zza()).zzb(this.zzl, zzxyVar.zzl);
        if (this.zzk == 0) {
            zzfvwVarZzb = zzfvwVarZzb.zze(this.zzm, zzxyVar.zzm);
        }
        return zzfvwVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        return false;
    }
}
