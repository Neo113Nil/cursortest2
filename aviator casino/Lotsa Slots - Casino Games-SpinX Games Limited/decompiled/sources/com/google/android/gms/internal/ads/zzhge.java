package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhge {

    @javax.annotation.Nullable
    private java.lang.Integer zza = null;
    private com.google.android.gms.internal.ads.zzhgf zzb = com.google.android.gms.internal.ads.zzhgf.zzc;

    private zzhge() {
    }

    /* synthetic */ zzhge(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzhge zzb(com.google.android.gms.internal.ads.zzhgf zzhgfVar) {
        this.zzb = zzhgfVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhgg zzc() throws java.security.GeneralSecurityException {
        java.lang.Integer num = this.zza;
        if (num == null) {
            throw new java.security.GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new com.google.android.gms.internal.ads.zzhgg(num.intValue(), this.zzb, null);
        }
        throw new java.security.GeneralSecurityException("Variant is not set");
    }

    public final com.google.android.gms.internal.ads.zzhge zza(int i) throws java.security.GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }
}
