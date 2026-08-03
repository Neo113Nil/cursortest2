package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhfm {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzb = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;
    private com.google.android.gms.internal.ads.zzhfn zzd = com.google.android.gms.internal.ads.zzhfn.zzc;

    private zzhfm() {
    }

    /* synthetic */ zzhfm(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhfm zzc(int i) throws java.security.GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfm zzd(com.google.android.gms.internal.ads.zzhfn zzhfnVar) {
        this.zzd = zzhfnVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfo zze() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new java.security.GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new java.security.GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = this.zzb.intValue();
        this.zzc.intValue();
        return new com.google.android.gms.internal.ads.zzhfo(intValue, intValue2, 16, this.zzd, null);
    }

    public final com.google.android.gms.internal.ads.zzhfm zza(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhfm zzb(int i) throws java.security.GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.zzb = java.lang.Integer.valueOf(i);
        return this;
    }
}
