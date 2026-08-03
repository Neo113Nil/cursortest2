package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqc extends com.google.android.gms.internal.ads.zzhqf {
    private final int zza;

    private zzhqc(int i) {
        this.zza = i;
    }

    public static com.google.android.gms.internal.ads.zzhqc zzb(int i) throws java.security.GeneralSecurityException {
        if (i == 16 || i == 32) {
            return new com.google.android.gms.internal.ads.zzhqc(i);
        }
        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit are supported", java.lang.Integer.valueOf(i * 8)));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.zzhqc) && ((com.google.android.gms.internal.ads.zzhqc) obj).zza == this.zza;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.android.gms.internal.ads.zzhqc.class, java.lang.Integer.valueOf(this.zza));
    }

    public final java.lang.String toString() {
        int i = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 34);
        sb.append("AesCmac PRF Parameters (");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
