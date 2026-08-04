package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgol {
    static {
        int i7 = zzgth.zza;
        try {
            zza();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgos.zzd();
        zzgnx.zzd();
        zzgof.zza(true);
        if (zzgjz.zzb()) {
            return;
        }
        zzgnp.zzd(true);
    }
}
