package com.google.android.recaptcha.internal;

import Y4.D;
import p044f6.i;
import p050g6.s;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzp implements zzaa {
    private final zzdc zza;
    private final zzbl zzb;
    private boolean zzc = true;

    public zzp(zzdc zzdcVar, zzbl zzblVar) {
        this.zza = zzdcVar;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        zzbl zzblVar = this.zzb;
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        String strZza = zzblVar.zza();
        zzdfVarZzb.zza();
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(strZza);
        zzrjVarZzf.zzd(D.D(zzrkVarZzf.zzj()));
        return zzab.zza(this, (zzrm) zzrjVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, d dVar) {
        zzdf zzdfVarZzc = zzab.zzc(this);
        int length = zzpsVar.zzJ().length();
        i iVar = i.f13014a;
        if (length == 0) {
            this.zzc = false;
            zzdfVarZzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
            return iVar;
        }
        this.zzb.zzb(s.L0(new p044f6.d("_GRECAPTCHA_KC", zzpsVar.zzJ())));
        zzdfVarZzc.zza();
        return iVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
