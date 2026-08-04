package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzcp {
    public static zzch zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzvu zzvuVarZza = zzvu.zza(bArr, zzajk.zza());
            zzof zzofVarZza = zzof.zza();
            zzpf zzpfVarZza = zzpf.zza(zzvuVarZza);
            return !zzofVarZza.zzc(zzpfVarZza) ? new zzne(zzpfVarZza) : zzofVarZza.zza(zzpfVarZza);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }

    public static byte[] zza(zzch zzchVar) {
        if (zzchVar instanceof zzne) {
            return ((zzne) zzchVar).zzb().zza().zzk();
        }
        return ((zzpf) zzof.zza().zza(zzchVar, zzpf.class)).zza().zzk();
    }
}
