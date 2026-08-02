package com.google.android.recaptcha.internal;

import android.os.Build;
import f6.C1116i;
import g6.AbstractC1158g;
import g6.AbstractC1160i;
import i6.InterfaceC1287d;

/* loaded from: classes.dex */
public final class zzn implements zzaa {
    private final zzdc zza;

    public zzn(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    private static final zzrl zzg(String str) {
        zzrk zzf = zzrl.zzf();
        zzf.zzv(str);
        return (zzrl) zzf.zzj();
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
    public final Object zzc(String str, InterfaceC1287d interfaceC1287d) {
        zzdf zzb = zzab.zzb(this, str);
        zzrj zzf = zzrm.zzf();
        zzf.zzd(AbstractC1160i.M0(zzg(Build.MANUFACTURER), zzg(Build.MODEL), zzg(Build.DEVICE), zzg(Build.HARDWARE), zzg(Build.FINGERPRINT), zzg(Build.PRODUCT), zzg(Build.BOARD), zzg(Build.BRAND), zzg(AbstractC1158g.u0(Build.SUPPORTED_ABIS))));
        zzb.zza();
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
