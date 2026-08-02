package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzcp {
    public static zzch zza(byte[] bArr) {
        try {
            zzvu zza = zzvu.zza(bArr, zzajk.zza());
            zzof zza2 = zzof.zza();
            zzpf zza3 = zzpf.zza(zza);
            return !zza2.zzc(zza3) ? new zzne(zza3) : zza2.zza((zzof) zza3);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }

    public static byte[] zza(zzch zzchVar) {
        if (zzchVar instanceof zzne) {
            return ((zzne) zzchVar).zzb().zza().zzk();
        }
        return ((zzpf) zzof.zza().zza((zzof) zzchVar, zzpf.class)).zza().zzk();
    }
}
