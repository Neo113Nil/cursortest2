package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgfg {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgfh zzd = zzgfh.zzc;

    private zzgfg() {
    }

    public final zzgfg zza(int i7) {
        this.zzb = 12;
        return this;
    }

    public final zzgfg zzb(int i7) throws InvalidAlgorithmParameterException {
        if (i7 != 16 && i7 != 24 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.zza = Integer.valueOf(i7);
        return this;
    }

    public final zzgfg zzc(int i7) {
        this.zzc = 16;
        return this;
    }

    public final zzgfg zzd(zzgfh zzgfhVar) {
        this.zzd = zzgfhVar;
        return this;
    }

    public final zzgfj zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzgfj(iIntValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzgfg(zzgfi zzgfiVar) {
    }
}
