package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes.dex */
abstract class zzftu extends zzfsm {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = f.API_PRIORITY_OTHER;

    public zzftu(zzftw zzftwVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i7 = this.zzc;
        while (true) {
            int i8 = this.zzc;
            if (i8 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i8);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzc = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzc = iZzc;
            }
            if (iZzc != i7) {
                if (i7 < iZzd) {
                    this.zzb.charAt(i7);
                }
                if (i7 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i9 = this.zzd;
                if (i9 == 1) {
                    iZzd = this.zzb.length();
                    this.zzc = -1;
                    if (iZzd > i7) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zzd = i9 - 1;
                }
                return this.zzb.subSequence(i7, iZzd).toString();
            }
            int i10 = iZzc + 1;
            this.zzc = i10;
            if (i10 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);
}
