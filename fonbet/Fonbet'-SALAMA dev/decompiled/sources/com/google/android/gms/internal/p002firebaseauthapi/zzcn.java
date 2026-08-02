package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzcn {
    private static final zzcn zza = new zzcn();

    private zzcn() {
    }

    public static zzcn zza() {
        return zza;
    }

    public static zzcn zza(zzcn zzcnVar) {
        if (zzcnVar != null) {
            return zzcnVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
