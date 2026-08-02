package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
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
        super(i7, zzboVar, i8);
        int i10;
        int i11 = 0;
        this.zzf = zzln.zza(i9, false);
        int i12 = this.zzd.zze;
        int i13 = zzxtVar.zzy;
        this.zzg = 1 == (i12 & 1);
        this.zzh = (i12 & 2) != 0;
        zzfwh zzo = str2 != null ? zzfwh.zzo(str2) : zzxtVar.zzv.isEmpty() ? zzfwh.zzo("") : zzxtVar.zzv;
        int i14 = 0;
        while (true) {
            if (i14 >= zzo.size()) {
                i14 = f.API_PRIORITY_OTHER;
                i10 = 0;
                break;
            } else {
                i10 = zzyf.zzc(this.zzd, (String) zzo.get(i14), false);
                if (i10 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzi = i14;
        this.zzj = i10;
        int zzb = zzyf.zzb(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = zzb;
        this.zzm = (1088 & this.zzd.zzf) != 0;
        int zzc = zzyf.zzc(this.zzd, str, zzyf.zzh(str) == null);
        this.zzl = zzc;
        boolean z4 = i10 > 0 || (zzxtVar.zzv.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzln.zza(i9, zzxtVar.zzR) && z4) {
            i11 = 1;
        }
        this.zze = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxy zzxyVar) {
        zzfvw zzb = zzfvw.zzj().zzd(this.zzf, zzxyVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxyVar.zzi), zzfxs.zzc().zza()).zzb(this.zzj, zzxyVar.zzj).zzb(this.zzk, zzxyVar.zzk).zzd(this.zzg, zzxyVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxyVar.zzh), this.zzj == 0 ? zzfxs.zzc() : zzfxs.zzc().zza()).zzb(this.zzl, zzxyVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(this.zzm, zzxyVar.zzm);
        }
        return zzb.zza();
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
