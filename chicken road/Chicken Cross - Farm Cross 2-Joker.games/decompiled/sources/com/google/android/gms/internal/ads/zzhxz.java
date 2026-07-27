package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhxz {
    private static final BigInteger zzg;
    private static final BigInteger zzh;

    @Nullable
    private Integer zza = null;

    @Nullable
    private BigInteger zzb = zzhyc.zza;

    @Nullable
    private zzhya zzc = null;

    @Nullable
    private zzhya zzd = null;

    @Nullable
    private Integer zze = null;
    private zzhyb zzf = zzhyb.zzd;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        zzg = valueOf;
        zzh = valueOf.pow(256);
    }

    private zzhxz() {
    }

    public final zzhxz zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhxz zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhxz zzc(zzhyb zzhybVar) {
        this.zzf = zzhybVar;
        return this;
    }

    public final zzhxz zzd(zzhya zzhyaVar) {
        this.zzc = zzhyaVar;
        return this;
    }

    public final zzhxz zze(zzhya zzhyaVar) {
        this.zzd = zzhyaVar;
        return this;
    }

    public final zzhyc zzg() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.zzf == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.zze == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.zza, 2048));
        }
        if (this.zzc != this.zzd) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.zzb;
        int compareTo = bigInteger.compareTo(zzhyc.zza);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zzg).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzh) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhyc(this.zza.intValue(), this.zzb, this.zzf, this.zzc, this.zzd, this.zze.intValue(), null);
    }

    /* synthetic */ zzhxz(byte[] bArr) {
    }

    public final zzhxz zzf(int i) throws GeneralSecurityException {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.zze = Integer.valueOf(i);
        return this;
    }
}
