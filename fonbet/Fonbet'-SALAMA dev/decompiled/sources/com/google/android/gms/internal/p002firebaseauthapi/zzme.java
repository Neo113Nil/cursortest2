package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* loaded from: classes.dex */
public final class zzme {
    public static zzbg zza(String str) {
        return new zzmd(str, zza());
    }

    public static boolean zzb(String str) {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e7) {
            throw new GeneralSecurityException(e7);
        }
    }
}
