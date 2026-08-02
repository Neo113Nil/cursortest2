package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzgfr {
    private Integer zza = null;
    private zzgfs zzb = zzgfs.zzc;

    private zzgfr() {
    }

    public final zzgfr zza(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.zza = Integer.valueOf(i7);
        return this;
    }

    public final zzgfr zzb(zzgfs zzgfsVar) {
        this.zzb = zzgfsVar;
        return this;
    }

    public final zzgfu zzc() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzgfu(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public /* synthetic */ zzgfr(zzgft zzgftVar) {
    }
}
