package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgpf implements zzgnu {
    public zzgpf(zzgnl zzgnlVar) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
