package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgev {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgew zzd = zzgew.zzc;

    private zzgev() {
    }

    public final zzgev zza(int i7) throws GeneralSecurityException {
        if (i7 != 12 && i7 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i7)));
        }
        this.zzb = Integer.valueOf(i7);
        return this;
    }

    public final zzgev zzb(int i7) throws InvalidAlgorithmParameterException {
        if (i7 != 16 && i7 != 24 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.zza = Integer.valueOf(i7);
        return this;
    }

    public final zzgev zzc(int i7) {
        this.zzc = 16;
        return this;
    }

    public final zzgev zzd(zzgew zzgewVar) {
        this.zzd = zzgewVar;
        return this;
    }

    public final zzgey zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.getClass();
        return new zzgey(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    public /* synthetic */ zzgev(zzgex zzgexVar) {
    }
}
