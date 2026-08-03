package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhjx implements com.google.android.gms.internal.ads.zzhdi {
    private final com.google.android.gms.internal.ads.zzhnc zza;

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        for (com.google.android.gms.internal.ads.zzhjw zzhjwVar : this.zza.zza(bArr)) {
            try {
                byte[] zza = zzhjwVar.zza.zza(bArr, bArr2);
                int i = zzhjwVar.zzb;
                int length = bArr.length;
                return zza;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        throw new java.security.GeneralSecurityException("decryption failed");
    }
}
