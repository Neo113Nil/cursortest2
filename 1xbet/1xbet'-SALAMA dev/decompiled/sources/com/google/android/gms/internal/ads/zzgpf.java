package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgpf implements zzgnu {
    public zzgpf(zzgnl zzgnlVar) throws GeneralSecurityException {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
