package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class zzcs {
    static {
        Charset.forName("UTF-8");
    }

    public static zzwd zza(zzwa zzwaVar) {
        zzwd.zza zzaVarZza = zzwd.zza().zza(zzwaVar.zzb());
        for (zzwa.zzb zzbVar : zzwaVar.zze()) {
            zzaVarZza.zza((zzwd.zzb) ((zzajy) zzwd.zzb.zza().zza(zzbVar.zzb().zzf()).zza(zzbVar.zzc()).zza(zzbVar.zzf()).zza(zzbVar.zza()).zze()));
        }
        return (zzwd) ((zzajy) zzaVarZza.zze());
    }

    public static void zzb(zzwa zzwaVar) {
        int iZzb = zzwaVar.zzb();
        int i7 = 0;
        boolean z4 = false;
        boolean z7 = true;
        for (zzwa.zzb zzbVar : zzwaVar.zze()) {
            if (zzbVar.zzc() == zzvv.ENABLED) {
                if (!zzbVar.e_()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzf() == zzws.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzc() == zzvv.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zza() == iZzb) {
                    if (z4) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z4 = true;
                }
                if (zzbVar.zzb().zzb() != zzvq.zzb.ASYMMETRIC_PUBLIC) {
                    z7 = false;
                }
                i7++;
            }
        }
        if (i7 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z4 && !z7) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
