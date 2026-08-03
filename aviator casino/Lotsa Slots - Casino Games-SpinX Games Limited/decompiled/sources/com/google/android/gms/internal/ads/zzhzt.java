package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzt {
    public static byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2;
        int i;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new java.security.GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i2 = length >> 1;
        byte[] zzc = zzc(java.util.Arrays.copyOf(bArr, i2));
        byte[] zzc2 = zzc(java.util.Arrays.copyOfRange(bArr, i2, length));
        int length2 = zzc.length;
        int length3 = zzc2.length;
        int i3 = length2 + 4 + length3;
        if (i3 >= 128) {
            bArr2 = new byte[i3 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i3;
            i = 3;
        } else {
            bArr2 = new byte[i3 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i3;
            i = 2;
        }
        int i4 = i + 1;
        bArr2[i] = 2;
        int i5 = i + 2;
        bArr2[i4] = (byte) length2;
        java.lang.System.arraycopy(zzc, 0, bArr2, i5, length2);
        int i6 = i5 + length2;
        bArr2[i6] = 2;
        bArr2[i6 + 1] = (byte) length3;
        java.lang.System.arraycopy(zzc2, 0, bArr2, i6 + 2, length3);
        return bArr2;
    }

    public static java.security.spec.ECParameterSpec zzb(com.google.android.gms.internal.ads.zzhzr zzhzrVar) throws java.security.NoSuchAlgorithmException {
        int ordinal = zzhzrVar.ordinal();
        if (ordinal == 0) {
            return com.google.android.gms.internal.ads.zzhlg.zza;
        }
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhlg.zzb;
        }
        if (ordinal == 2) {
            return com.google.android.gms.internal.ads.zzhlg.zzc;
        }
        throw new java.security.NoSuchAlgorithmException("curve not implemented:".concat(zzhzrVar.toString()));
    }

    private static byte[] zzc(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        java.lang.System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }
}
