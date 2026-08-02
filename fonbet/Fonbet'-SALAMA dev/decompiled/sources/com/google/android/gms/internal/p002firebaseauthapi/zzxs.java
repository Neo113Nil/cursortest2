package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class zzxs extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            return zzyf.zza.zza("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
