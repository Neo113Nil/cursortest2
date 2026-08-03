package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhku {
    public static byte[] zza(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new java.lang.IllegalArgumentException("n must not be negative");
    }

    public static byte[] zzb(java.math.BigInteger bigInteger, int i) throws java.security.GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new java.lang.IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new java.security.GeneralSecurityException("integer too large");
        }
        if (length == i2) {
            if (byteArray[0] == 0) {
                return java.util.Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new java.security.GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }
}
