package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class zzgjw extends ThreadLocal {
    public static final Cipher zza() {
        boolean zzd;
        try {
            Cipher cipher = (Cipher) zzgul.zza.zza("AES/GCM-SIV/NoPadding");
            zzd = zzgjx.zzd(cipher);
            if (zzd) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
