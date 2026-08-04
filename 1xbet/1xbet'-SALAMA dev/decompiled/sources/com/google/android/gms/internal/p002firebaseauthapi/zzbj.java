package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzbj {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwa.zzb zzbVar) throws GeneralSecurityException {
        int i7 = zzbm.zza[zzbVar.zzf().ordinal()];
        if (i7 == 1 || i7 == 2) {
            return zzog.zza(zzbVar.zza()).zzb();
        }
        if (i7 == 3) {
            return zzog.zzb(zzbVar.zza()).zzb();
        }
        if (i7 == 4) {
            return zza;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
