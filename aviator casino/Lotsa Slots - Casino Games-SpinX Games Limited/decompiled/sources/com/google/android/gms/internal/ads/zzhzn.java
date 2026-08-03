package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzn {
    private final byte[] zza;
    private final byte[] zzb;

    private zzhzn(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzhzn zzc() throws java.security.GeneralSecurityException {
        byte[] zza = com.google.android.gms.internal.ads.zzhnp.zza(32);
        if (zza.length == 32) {
            return new com.google.android.gms.internal.ads.zzhzn(com.google.android.gms.internal.ads.zzhlc.zza(com.google.android.gms.internal.ads.zzhlc.zzb(zza)), zza);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Given secret seed length is not %s", 32));
    }

    public final byte[] zza() {
        return java.util.Arrays.copyOf(this.zza, 32);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }
}
