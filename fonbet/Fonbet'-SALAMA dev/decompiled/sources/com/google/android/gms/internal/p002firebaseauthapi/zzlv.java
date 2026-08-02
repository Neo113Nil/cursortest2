package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzlv implements zzbn {
    private zzlv(zzbn zzbnVar, byte[] bArr) {
    }

    public static zzbn zza(zznc zzncVar) {
        byte[] zzb;
        zzpc zza = zzncVar.zza(zzbq.zza());
        zzbn zzbnVar = (zzbn) zzco.zza((zzvq) ((zzajy) zzvq.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbn.class);
        zzws zzb2 = zza.zzb();
        int i7 = zzlu.zza[zzb2.ordinal()];
        if (i7 == 1) {
            zzb = zzog.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzb2)));
            }
            zzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzlv(zzbnVar, zzb);
    }
}
