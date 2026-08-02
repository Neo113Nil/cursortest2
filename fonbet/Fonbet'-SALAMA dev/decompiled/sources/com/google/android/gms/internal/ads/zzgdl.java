package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgdl {
    public static zzgdf zza(byte[] bArr) {
        try {
            zzgse zzf = zzgse.zzf(bArr, zzgwq.zza());
            zzglu zzc = zzglu.zzc();
            zzgmx zza = zzgmx.zza(zzf);
            return !zzc.zzk(zza) ? new zzgkv(zza) : zzc.zzb(zza);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }

    public static byte[] zzb(zzgdf zzgdfVar) {
        return ((zzgmx) zzglu.zzc().zze(zzgdfVar, zzgmx.class)).zzc().zzaV();
    }
}
