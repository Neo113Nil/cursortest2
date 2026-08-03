package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfxb {
    protected static final byte[] zza = {kotlin.io.encoding.Base64.padSymbol, 122, com.google.common.base.Ascii.DC2, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    protected static final byte[] zzb = {-110, -13, -34, 70, -83, 43, 97, com.google.common.base.Ascii.NAK, -44, com.google.common.base.Ascii.DLE, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(java.io.File file) throws java.security.GeneralSecurityException {
        try {
            java.security.cert.X509Certificate[][] zza2 = com.google.android.gms.internal.ads.zzask.zza(file.getAbsolutePath());
            if (zza2.length != 1) {
                throw new java.security.GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(zza2[0][0].getEncoded());
            if (java.util.Arrays.equals(this.zzd, digest)) {
                return true;
            }
            return !"user".equals(android.os.Build.TYPE) && java.util.Arrays.equals(this.zzc, digest);
        } catch (com.google.android.gms.internal.ads.zzash e) {
            throw new java.security.GeneralSecurityException("Package is not signed", e);
        } catch (java.io.IOException e2) {
            e = e2;
            throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
