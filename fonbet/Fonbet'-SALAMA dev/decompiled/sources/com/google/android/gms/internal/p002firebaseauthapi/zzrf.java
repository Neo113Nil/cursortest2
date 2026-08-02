package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzrf implements zzqa {
    private static final zzil.zza zza = zzil.zza.zza;

    public zzrf(zzpq zzpqVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
