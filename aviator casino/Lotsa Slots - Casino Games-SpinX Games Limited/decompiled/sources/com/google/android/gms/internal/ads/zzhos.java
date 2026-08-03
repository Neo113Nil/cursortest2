package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhos {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzb = null;
    private com.google.android.gms.internal.ads.zzhot zzc = null;
    private com.google.android.gms.internal.ads.zzhou zzd = com.google.android.gms.internal.ads.zzhou.zzd;

    private zzhos() {
    }

    /* synthetic */ zzhos(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhos zza(int i) throws java.security.GeneralSecurityException {
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhos zzb(int i) throws java.security.GeneralSecurityException {
        this.zzb = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhos zzc(com.google.android.gms.internal.ads.zzhou zzhouVar) {
        this.zzd = zzhouVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhos zzd(com.google.android.gms.internal.ads.zzhot zzhotVar) {
        this.zzc = zzhotVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhov zze() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new java.security.GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new java.security.GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        java.lang.Integer num2 = this.zzb;
        int intValue = num2.intValue();
        com.google.android.gms.internal.ads.zzhot zzhotVar = this.zzc;
        if (intValue < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zzhotVar == com.google.android.gms.internal.ads.zzhot.zza) {
            if (intValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zzhotVar == com.google.android.gms.internal.ads.zzhot.zzb) {
            if (intValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zzhotVar == com.google.android.gms.internal.ads.zzhot.zzc) {
            if (intValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zzhotVar == com.google.android.gms.internal.ads.zzhot.zzd) {
            if (intValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zzhotVar != com.google.android.gms.internal.ads.zzhot.zze) {
                throw new java.security.GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new com.google.android.gms.internal.ads.zzhov(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
