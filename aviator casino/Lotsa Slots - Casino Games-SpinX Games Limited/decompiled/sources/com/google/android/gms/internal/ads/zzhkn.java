package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhkn implements com.google.android.gms.internal.ads.zzhdi {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzhkl();

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhfz zzhfzVar) throws java.security.GeneralSecurityException {
        return com.google.android.gms.internal.ads.zzhjb.zzc(zzhfzVar, com.google.android.gms.internal.ads.zzhkm.zza);
    }

    static /* synthetic */ javax.crypto.Cipher zzc() {
        try {
            javax.crypto.Cipher cipher = (javax.crypto.Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (java.lang.IllegalStateException e) {
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        throw null;
    }
}
