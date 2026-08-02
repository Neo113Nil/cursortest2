package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
abstract class zzftu extends zzfsm {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = f.API_PRIORITY_OTHER;

    public zzftu(zzftw zzftwVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i7 = this.zzc;
        while (true) {
            int i8 = this.zzc;
            if (i8 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i8);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzc = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzc = zzc;
            }
            if (zzc != i7) {
                if (i7 < zzd) {
                    this.zzb.charAt(i7);
                }
                if (i7 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i9 = this.zzd;
                if (i9 == 1) {
                    zzd = this.zzb.length();
                    this.zzc = -1;
                    if (zzd > i7) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zzd = i9 - 1;
                }
                return this.zzb.subSequence(i7, zzd).toString();
            }
            int i10 = zzc + 1;
            this.zzc = i10;
            if (i10 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);
}
