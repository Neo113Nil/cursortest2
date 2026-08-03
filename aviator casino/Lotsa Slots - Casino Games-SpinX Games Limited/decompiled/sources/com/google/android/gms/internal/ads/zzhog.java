package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhog {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;

    @javax.annotation.Nullable
    private java.lang.Integer zzb = null;
    private com.google.android.gms.internal.ads.zzhoh zzc = com.google.android.gms.internal.ads.zzhoh.zzd;

    private zzhog() {
    }

    /* synthetic */ zzhog(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhog zzc(com.google.android.gms.internal.ads.zzhoh zzhohVar) {
        this.zzc = zzhohVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhoi zzd() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new java.security.GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new com.google.android.gms.internal.ads.zzhoi(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new java.security.GeneralSecurityException("variant not set");
    }

    public final com.google.android.gms.internal.ads.zzhog zza(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i * 8)));
        }
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhog zzb(int i) throws java.security.GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = java.lang.Integer.valueOf(i);
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i);
        throw new java.security.GeneralSecurityException(sb.toString());
    }
}
