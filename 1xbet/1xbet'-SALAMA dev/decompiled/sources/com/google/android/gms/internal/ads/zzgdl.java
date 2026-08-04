package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgdl {
    public static zzgdf zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgse zzgseVarZzf = zzgse.zzf(bArr, zzgwq.zza());
            zzglu zzgluVarZzc = zzglu.zzc();
            zzgmx zzgmxVarZza = zzgmx.zza(zzgseVarZzf);
            return !zzgluVarZzc.zzk(zzgmxVarZza) ? new zzgkv(zzgmxVarZza) : zzgluVarZzc.zzb(zzgmxVarZza);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }

    public static byte[] zzb(zzgdf zzgdfVar) {
        return ((zzgmx) zzglu.zzc().zze(zzgdfVar, zzgmx.class)).zzc().zzaV();
    }
}
