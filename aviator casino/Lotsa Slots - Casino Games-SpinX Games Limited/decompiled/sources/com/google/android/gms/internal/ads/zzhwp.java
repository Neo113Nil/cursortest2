package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhwp {

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhwm zza = null;

    @javax.annotation.Nullable
    private java.math.BigInteger zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    private zzhwp() {
    }

    /* synthetic */ zzhwp(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhwp zza(com.google.android.gms.internal.ads.zzhwm zzhwmVar) {
        this.zza = zzhwmVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwp zzb(java.math.BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwp zzc(@javax.annotation.Nullable java.lang.Integer num) {
        this.zzc = num;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhwq zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziaz zza;
        if (this.zza == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters");
        }
        java.math.BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new java.security.GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        int zzc = this.zza.zzc();
        if (bitLength != zzc) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(bitLength).length() + 56 + java.lang.String.valueOf(zzc).length());
            sb.append("Got modulus size ");
            sb.append(bitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(zzc);
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == com.google.android.gms.internal.ads.zzhwl.zzd) {
            zza = com.google.android.gms.internal.ads.zzhms.zza;
        } else if (this.zza.zze() == com.google.android.gms.internal.ads.zzhwl.zzc || this.zza.zze() == com.google.android.gms.internal.ads.zzhwl.zzb) {
            zza = com.google.android.gms.internal.ads.zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != com.google.android.gms.internal.ads.zzhwl.zza) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zza.zze());
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(java.lang.String.valueOf(valueOf)));
            }
            zza = com.google.android.gms.internal.ads.zzhms.zzb(this.zzc.intValue());
        }
        return new com.google.android.gms.internal.ads.zzhwq(this.zza, this.zzb, zza, this.zzc, null);
    }
}
