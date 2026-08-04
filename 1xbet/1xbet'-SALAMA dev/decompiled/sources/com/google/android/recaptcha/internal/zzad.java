package com.google.android.recaptcha.internal;

import Y4.D;
import android.os.Build;
import p044f6.i;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzad implements zzaa {
    private final zzdc zza;

    public zzad(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        int i7 = Build.VERSION.SDK_INT;
        zzdfVarZzb.zza();
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(String.valueOf(i7));
        zzrjVarZzf.zzd(D.D(zzrkVarZzf.zzj()));
        return zzab.zza(this, (zzrm) zzrjVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, d dVar) {
        zzab.zzc(this).zza();
        return i.f13014a;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return true;
    }
}
