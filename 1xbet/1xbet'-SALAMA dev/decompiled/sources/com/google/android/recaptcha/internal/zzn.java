package com.google.android.recaptcha.internal;

import android.os.Build;
import p050g6.g;
import p050g6.i;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements zzaa {
    private final zzdc zza;

    public zzn(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    private static final zzrl zzg(String str) {
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(str);
        return (zzrl) zzrkVarZzf.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrjVarZzf.zzd(i.M0(zzg(Build.MANUFACTURER), zzg(Build.MODEL), zzg(Build.DEVICE), zzg(Build.HARDWARE), zzg(Build.FINGERPRINT), zzg(Build.PRODUCT), zzg(Build.BOARD), zzg(Build.BRAND), zzg(g.u0(Build.SUPPORTED_ABIS))));
        zzdfVarZzb.zza();
        return zzab.zza(this, (zzrm) zzrjVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, d dVar) {
        zzab.zzc(this).zza();
        return p044f6.i.f13014a;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return true;
    }
}
