package com.google.android.recaptcha.internal;

import Y4.D;
import android.content.ContentResolver;
import p044f6.i;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements zzaa {
    private final zzdc zza;
    private final ContentResolver zzb;

    public zzm(zzdc zzdcVar, ContentResolver contentResolver) {
        this.zza = zzdcVar;
        this.zzb = contentResolver;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        ContentResolver contentResolver = this.zzb;
        zzdf zzdfVarZzb = zzab.zzb(this, str);
        String strZza = zzau.zza(contentResolver);
        zzdfVarZzb.zza();
        zzrj zzrjVarZzf = zzrm.zzf();
        zzrk zzrkVarZzf = zzrl.zzf();
        zzrkVarZzf.zzv(strZza);
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
