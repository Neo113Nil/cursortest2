package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class zzgiu extends ThreadLocal {
    public static final Cipher zza() {
        boolean zzf;
        try {
            Cipher cipher = (Cipher) zzgul.zza.zza("ChaCha20-Poly1305");
            zzf = zzgiv.zzf(cipher);
            if (zzf) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
