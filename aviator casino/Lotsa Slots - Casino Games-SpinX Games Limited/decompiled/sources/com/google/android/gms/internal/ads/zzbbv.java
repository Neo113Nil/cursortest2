package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbbv {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static java.lang.String zza(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            char[] cArr2 = zzb;
            int i2 = i + i;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & com.google.common.base.Ascii.SI];
        }
        return new java.lang.String(cArr);
    }

    public static byte[] zzb(java.lang.String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new java.lang.IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length >> 1];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) + java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static boolean zzc(java.lang.String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zzd() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static boolean zze(android.util.DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long zzf(double d, int i, android.util.DisplayMetrics displayMetrics) {
        return java.lang.Math.round(d / displayMetrics.density);
    }
}
