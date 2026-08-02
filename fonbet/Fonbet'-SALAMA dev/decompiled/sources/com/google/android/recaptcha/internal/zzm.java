package com.google.android.recaptcha.internal;

import Y4.D;
import android.content.ContentResolver;
import f6.C1116i;
import i6.InterfaceC1287d;

/* loaded from: classes.dex */
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
    public final Object zzc(String str, InterfaceC1287d interfaceC1287d) {
        ContentResolver contentResolver = this.zzb;
        zzdf zzb = zzab.zzb(this, str);
        String zza = zzau.zza(contentResolver);
        zzb.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(zza);
        zzf.zzd(D.D(zzf2.zzj()));
        return zzab.zza(this, (zzrm) zzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, InterfaceC1287d interfaceC1287d) {
        zzab.zzc(this).zza();
        return C1116i.f13008a;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return true;
    }
}
