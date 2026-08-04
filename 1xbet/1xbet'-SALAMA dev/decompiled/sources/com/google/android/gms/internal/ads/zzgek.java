package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgek {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private Integer zzd = null;
    private zzgel zze = null;
    private zzgem zzf = zzgem.zzc;

    private zzgek() {
    }

    public final zzgek zza(int i7) throws InvalidAlgorithmParameterException {
        if (i7 != 16 && i7 != 24 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.zza = Integer.valueOf(i7);
        return this;
    }

    public final zzgek zzb(zzgel zzgelVar) {
        this.zze = zzgelVar;
        return this;
    }

    public final zzgek zzc(int i7) throws InvalidAlgorithmParameterException {
        if (i7 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i7)));
        }
        this.zzb = Integer.valueOf(i7);
        return this;
    }

    public final zzgek zzd(int i7) throws GeneralSecurityException {
        if (i7 < 12 || i7 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i7)));
        }
        this.zzc = Integer.valueOf(i7);
        return this;
    }

    public final zzgek zze(int i7) throws GeneralSecurityException {
        if (i7 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i7)));
        }
        this.zzd = Integer.valueOf(i7);
        return this;
    }

    public final zzgek zzf(zzgem zzgemVar) {
        this.zzf = zzgemVar;
        return this;
    }

    public final zzgeo zzg() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.zzd;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zze == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzf == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        zzgel zzgelVar = this.zze;
        if (zzgelVar == zzgel.zza) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (zzgelVar == zzgel.zzb) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (zzgelVar == zzgel.zzc) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (zzgelVar == zzgel.zzd) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (zzgelVar != zzgel.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new zzgeo(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, null);
    }

    public /* synthetic */ zzgek(zzgen zzgenVar) {
    }
}
