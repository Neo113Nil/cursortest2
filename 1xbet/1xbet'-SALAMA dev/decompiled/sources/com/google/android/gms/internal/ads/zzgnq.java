package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgnq {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgnr zzc = zzgnr.zzd;

    private zzgnq() {
    }

    public final zzgnq zza(int i7) throws InvalidAlgorithmParameterException {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
        this.zza = Integer.valueOf(i7);
        return this;
    }

    public final zzgnq zzb(int i7) throws GeneralSecurityException {
        if (i7 < 10 || i7 > 16) {
            throw new GeneralSecurityException(k.d(i7, "Invalid tag size for AesCmacParameters: "));
        }
        this.zzb = Integer.valueOf(i7);
        return this;
    }

    public final zzgnq zzc(zzgnr zzgnrVar) {
        this.zzc = zzgnrVar;
        return this;
    }

    public final zzgnt zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzgnt(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzgnq(zzgns zzgnsVar) {
    }
}
