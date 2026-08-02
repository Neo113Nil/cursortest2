package com.google.android.recaptcha.internal;

import Y4.D;
import f6.C1111d;
import f6.C1116i;
import g6.AbstractC1170s;
import i6.InterfaceC1287d;

/* loaded from: classes.dex */
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
    public final Object zzc(String str, InterfaceC1287d interfaceC1287d) {
        zzbl zzblVar = this.zzb;
        zzdf zzb = zzab.zzb(this, str);
        String zza = zzblVar.zza();
        zzb.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(zza);
        zzf.zzd(D.D(zzf2.zzj()));
        return zzab.zza(this, (zzrm) zzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, InterfaceC1287d interfaceC1287d) {
        zzdf zzc = zzab.zzc(this);
        int length = zzpsVar.zzJ().length();
        C1116i c1116i = C1116i.f13008a;
        if (length == 0) {
            this.zzc = false;
            zzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
            return c1116i;
        }
        this.zzb.zzb(AbstractC1170s.L0(new C1111d("_GRECAPTCHA_KC", zzpsVar.zzJ())));
        zzc.zza();
        return c1116i;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
