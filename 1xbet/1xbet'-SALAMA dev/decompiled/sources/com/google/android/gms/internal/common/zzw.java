package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = f.API_PRIORITY_OTHER;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i7 = this.zze;
        while (true) {
            int i8 = this.zze;
            if (i8 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i8);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i7) {
                int i9 = iZzc + 1;
                this.zze = i9;
                if (i9 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i7 < iZzd) {
                    this.zzb.charAt(i7);
                }
                if (i7 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i7 != iZzd) {
                    int i10 = this.zzf;
                    if (i10 == 1) {
                        iZzd = this.zzb.length();
                        this.zze = -1;
                        if (iZzd > i7) {
                            this.zzb.charAt(iZzd - 1);
                        }
                    } else {
                        this.zzf = i10 - 1;
                    }
                    return this.zzb.subSequence(i7, iZzd).toString();
                }
                i7 = this.zze;
            }
        }
    }

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);
}
