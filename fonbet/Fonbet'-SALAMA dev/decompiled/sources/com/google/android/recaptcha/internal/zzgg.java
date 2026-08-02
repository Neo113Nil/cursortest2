package com.google.android.recaptcha.internal;

import g6.AbstractC1159h;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzgg implements zzge {
    private final zzgf zza;

    public zzgg(zzgf zzgfVar, zzgd zzgdVar) {
        this.zza = zzgfVar;
    }

    private final zzrg zzb(String str, List list) {
        zzgb zzgbVar;
        if (str.length() == 0) {
            throw new zzby(3, 17, null);
        }
        try {
            long zza = this.zza.zza(AbstractC1159h.b1(list));
            zzgbVar = zzgc.zza;
            zzgc zzgcVar = new zzgc(zza, 255L, zzgbVar);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                sb.append((char) (str.charAt(i7) ^ ((int) zzgcVar.zza())));
            }
            return zzrg.zzg(zzhz.zzh().zzj(sb.toString()));
        } catch (Exception e7) {
            throw new zzby(3, 18, e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzge
    public final zzrg zza(zzro zzroVar) {
        zzgz zzb = zzgz.zzb();
        zzrg zzb2 = zzb(zzroVar.zzj(), zzroVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbq.zza;
        zzbq.zza(zzbr.zzh.zza(), zza);
        return zzb2;
    }
}
