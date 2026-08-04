package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p050g6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzgg implements zzge {
    private final zzgf zza;

    public zzgg(zzgf zzgfVar, zzgd zzgdVar) {
        this.zza = zzgfVar;
    }

    private final zzrg zzb(String str, List list) throws zzby {
        if (str.length() == 0) {
            throw new zzby(3, 17, null);
        }
        try {
            zzgc zzgcVar = new zzgc(this.zza.zza(h.b1(list)), 255L, zzgc.zza);
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
    public final zzrg zza(zzro zzroVar) throws zzby {
        zzgz zzgzVarZzb = zzgz.zzb();
        zzrg zzrgVarZzb = zzb(zzroVar.zzj(), zzroVar.zzk());
        zzgzVarZzb.zzf();
        long jZza = zzgzVarZzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbq.zza;
        zzbq.zza(zzbr.zzh.zza(), jZza);
        return zzrgVarZzb;
    }
}
